package wr;

import ir.k;
import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;
import qr.i;
import qr.j;
import ur.z;

/* JADX INFO: compiled from: ReceivingSearchResponse.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends vr.c<nr.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f86688e = Logger.getLogger(c.class.getName());

    public c(br.b bVar, lr.b<UpnpResponse> bVar2) {
        super(bVar, new nr.c(bVar2));
    }

    @Override // vr.c
    public void a() throws RouterException {
        if (!b().B()) {
            f86688e.fine("Ignoring invalid search response message: " + b());
            return;
        }
        z zVarA = b().A();
        if (zVarA == null) {
            f86688e.fine("Ignoring search response message without UDN: " + b());
            return;
        }
        j jVar = new j(b());
        Logger logger = f86688e;
        logger.fine("Received device search response: " + jVar);
        if (c().getRegistry().update(jVar)) {
            logger.fine("Remote device was already known: " + zVarA);
            return;
        }
        try {
            i iVar = new i(jVar);
            if (jVar.d() == null) {
                logger.finer("Ignoring message without location URL header: " + b());
                return;
            }
            if (jVar.a() != null) {
                c().getConfiguration().g().execute(new vr.e(c(), iVar));
                return;
            }
            logger.finer("Ignoring message without max-age header: " + b());
        } catch (ValidationException e10) {
            f86688e.warning("Validation errors of device during discovery: " + jVar);
            Iterator<k> it = e10.getErrors().iterator();
            while (it.hasNext()) {
                f86688e.warning(it.next().toString());
            }
        }
    }
}
