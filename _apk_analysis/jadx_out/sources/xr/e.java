package xr;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingUnsubscribe.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends vr.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f87109h = Logger.getLogger(e.class.getName());

    public e(br.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        sr.g gVar = (sr.g) c().getRegistry().D(sr.g.class, ((org.fourthline.cling.model.message.b) b()).v());
        if (gVar == null) {
            f87109h.fine("No local resource found: " + b());
            return null;
        }
        Logger logger = f87109h;
        logger.fine("Found local event subscription matching relative request URI: " + ((org.fourthline.cling.model.message.b) b()).v());
        or.d dVar = new or.d((org.fourthline.cling.model.message.b) b(), gVar.a());
        if (dVar.y() != null && (dVar.A() || dVar.z())) {
            logger.fine("Subscription ID and NT or Callback in unsubcribe request: " + b());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.BAD_REQUEST);
        }
        kr.b bVarA = c().getRegistry().a(dVar.y());
        if (bVarA == null) {
            logger.fine("Invalid subscription ID for unsubscribe request: " + b());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        logger.fine("Unregistering subscription: " + bVarA);
        if (c().getRegistry().q(bVarA)) {
            bVarA.L(null);
        } else {
            logger.fine("Subscription was already removed from registry");
        }
        return new org.fourthline.cling.model.message.c(UpnpResponse.Status.OK);
    }
}
