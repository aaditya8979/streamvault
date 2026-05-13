package xr;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingAction.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends vr.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f87097h = Logger.getLogger(a.class.getName());

    public a(br.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        jr.g gVar;
        mr.g gVar2;
        pr.d dVar = (pr.d) ((org.fourthline.cling.model.message.b) b()).j().s(UpnpHeader.Type.CONTENT_TYPE, pr.d.class);
        if (dVar != null && !dVar.g()) {
            f87097h.warning("Received invalid Content-Type '" + dVar + "': " + b());
            return new org.fourthline.cling.model.message.c(new UpnpResponse(UpnpResponse.Status.UNSUPPORTED_MEDIA_TYPE));
        }
        if (dVar == null) {
            f87097h.warning("Received without Content-Type: " + b());
        }
        sr.d dVar2 = (sr.d) c().getRegistry().D(sr.d.class, ((org.fourthline.cling.model.message.b) b()).v());
        if (dVar2 == null) {
            f87097h.fine("No local resource found: " + b());
            return null;
        }
        Logger logger = f87097h;
        logger.fine("Found local action resource matching relative request URI: " + ((org.fourthline.cling.model.message.b) b()).v());
        try {
            mr.d dVar3 = new mr.d((org.fourthline.cling.model.message.b) b(), dVar2.a());
            logger.finer("Created incoming action request message: " + dVar3);
            gVar = new jr.g(dVar3.y(), h());
            logger.fine("Reading body of request message");
            c().getConfiguration().j().d(dVar3, gVar);
            logger.fine("Executing on local service: " + gVar);
            dVar2.a().p(gVar.a()).a(gVar);
            if (gVar.c() == null) {
                gVar2 = new mr.g(gVar.a());
            } else {
                if (gVar.c() instanceof ActionCancelledException) {
                    logger.fine("Action execution was cancelled, returning 404 to client");
                    return null;
                }
                gVar2 = new mr.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR, gVar.a());
            }
        } catch (UnsupportedDataException e10) {
            f87097h.log(Level.WARNING, "Error reading action request XML body: " + e10.toString(), os.a.a(e10));
            gVar = new jr.g(os.a.a(e10) instanceof ActionException ? (ActionException) os.a.a(e10) : new ActionException(ErrorCode.ACTION_FAILED, e10.getMessage()), h());
            gVar2 = new mr.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        } catch (ActionException e11) {
            f87097h.finer("Error executing local action: " + e11);
            gVar = new jr.g(e11, h());
            gVar2 = new mr.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        try {
            Logger logger2 = f87097h;
            logger2.fine("Writing body of response message");
            c().getConfiguration().j().c(gVar2, gVar);
            logger2.fine("Returning finished response message: " + gVar2);
            return gVar2;
        } catch (UnsupportedDataException e12) {
            Logger logger3 = f87097h;
            logger3.warning("Failure writing body of response message, sending '500 Internal Server Error' without body");
            logger3.log(Level.WARNING, "Exception root cause: ", os.a.a(e12));
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
