package xr;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingAction.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends vr.g<mr.f, mr.e> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f87110g = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jr.d f87111f;

    public f(br.b bVar, jr.d dVar, URL url) {
        super(bVar, new mr.f(dVar, url));
        this.f87111f = dVar;
    }

    @Override // vr.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public mr.e c() throws RouterException {
        return j(d());
    }

    public void h(mr.e eVar) throws ActionException {
        try {
            f87110g.fine("Received response for outgoing call, reading SOAP response body: " + eVar);
            b().getConfiguration().j().a(eVar, this.f87111f);
        } catch (UnsupportedDataException e10) {
            Logger logger = f87110g;
            logger.fine("Error reading SOAP body: " + e10);
            logger.log(Level.FINE, "Exception root cause: ", os.a.a(e10));
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error reading SOAP response message. " + e10.getMessage(), false);
        }
    }

    public void i(mr.e eVar) throws ActionException {
        try {
            f87110g.fine("Received response with Internal Server Error, reading SOAP failure message");
            b().getConfiguration().j().a(eVar, this.f87111f);
        } catch (UnsupportedDataException e10) {
            Logger logger = f87110g;
            logger.fine("Error reading SOAP body: " + e10);
            logger.log(Level.FINE, "Exception root cause: ", os.a.a(e10));
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error reading SOAP response failure message. " + e10.getMessage(), false);
        }
    }

    public mr.e j(mr.f fVar) throws RouterException {
        qr.a aVarD = this.f87111f.a().g().d();
        Logger logger = f87110g;
        logger.fine("Sending outgoing action call '" + this.f87111f.a().d() + "' to remote service of: " + aVarD);
        mr.e eVar = null;
        try {
            org.fourthline.cling.model.message.c cVarK = k(fVar);
            if (cVarK == null) {
                logger.fine("No connection or no no response received, returning null");
                this.f87111f.i(new ActionException(ErrorCode.ACTION_FAILED, "Connection error or no response received"));
                return null;
            }
            mr.e eVar2 = new mr.e(cVarK);
            try {
                if (!eVar2.u()) {
                    if (eVar2.v()) {
                        i(eVar2);
                    } else {
                        h(eVar2);
                    }
                    return eVar2;
                }
                logger.fine("Response was a non-recoverable failure: " + eVar2);
                throw new ActionException(ErrorCode.ACTION_FAILED, "Non-recoverable remote execution failure: " + eVar2.k().c());
            } catch (ActionException e10) {
                e = e10;
                eVar = eVar2;
                f87110g.fine("Remote action invocation failed, returning Internal Server Error message: " + e.getMessage());
                this.f87111f.i(e);
                return (eVar == null || !eVar.k().f()) ? new mr.e(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR)) : eVar;
            }
        } catch (ActionException e11) {
            e = e11;
        }
    }

    public org.fourthline.cling.model.message.c k(mr.f fVar) throws ActionException, RouterException {
        try {
            Logger logger = f87110g;
            logger.fine("Writing SOAP request body of: " + fVar);
            b().getConfiguration().j().b(fVar, this.f87111f);
            logger.fine("Sending SOAP body of message as stream to remote device");
            return b().c().f(fVar);
        } catch (UnsupportedDataException e10) {
            Logger logger2 = f87110g;
            Level level = Level.FINE;
            if (logger2.isLoggable(level)) {
                logger2.fine("Error writing SOAP body: " + e10);
                logger2.log(level, "Exception root cause: ", os.a.a(e10));
            }
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error writing request message. " + e10.getMessage());
        } catch (RouterException e11) {
            Throwable thA = os.a.a(e11);
            if (!(thA instanceof InterruptedException)) {
                throw e11;
            }
            Logger logger3 = f87110g;
            if (logger3.isLoggable(Level.FINE)) {
                logger3.fine("Sending action request message was interrupted: " + thA);
            }
            throw new ActionCancelledException((InterruptedException) thA);
        }
    }
}
