package wr;

import ir.k;
import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.transport.RouterException;
import qr.i;
import qr.j;
import ur.z;

/* JADX INFO: compiled from: ReceivingNotification.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends vr.c<nr.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f86684e = Logger.getLogger(a.class.getName());

    public a(br.b bVar, lr.b<UpnpRequest> bVar2) {
        super(bVar, new nr.a(bVar2));
    }

    @Override // vr.c
    public void a() throws RouterException {
        z zVarA = b().A();
        if (zVarA == null) {
            f86684e.fine("Ignoring notification message without UDN: " + b());
            return;
        }
        j jVar = new j(b());
        Logger logger = f86684e;
        logger.fine("Received device notification: " + jVar);
        try {
            i iVar = new i(jVar);
            if (!b().B()) {
                if (!b().C()) {
                    logger.finer("Ignoring unknown notification message: " + b());
                    return;
                }
                logger.fine("Received device BYEBYE advertisement");
                if (c().getRegistry().h(iVar)) {
                    logger.fine("Removed remote device from registry: " + iVar);
                    return;
                }
                return;
            }
            logger.fine("Received device ALIVE advertisement, descriptor location is: " + jVar.d());
            if (jVar.d() == null) {
                logger.finer("Ignoring message without location URL header: " + b());
                return;
            }
            if (jVar.a() == null) {
                logger.finer("Ignoring message without max-age header: " + b());
                return;
            }
            if (!c().getRegistry().update(jVar)) {
                c().getConfiguration().g().execute(new vr.e(c(), iVar));
                return;
            }
            logger.finer("Remote device was already known: " + zVarA);
        } catch (ValidationException e10) {
            f86684e.warning("Validation errors of device during discovery: " + jVar);
            Iterator<k> it = e10.getErrors().iterator();
            while (it.hasNext()) {
                f86684e.warning(it.next().toString());
            }
        }
    }
}
