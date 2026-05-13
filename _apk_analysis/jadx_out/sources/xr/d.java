package xr;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingSubscribe.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends vr.d<org.fourthline.cling.model.message.b, or.i> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f87106i = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kr.b f87107h;

    /* JADX INFO: compiled from: ReceivingSubscribe.java */
    public class a extends kr.b {
        public a(qr.f fVar, Integer num, List list) {
            super(fVar, num, list);
        }

        @Override // kr.b
        public void M(CancelReason cancelReason) {
        }

        @Override // kr.a
        public void e() {
        }

        @Override // kr.a
        public void g() {
            d.this.c().getConfiguration().i().execute(d.this.c().a().a(this));
        }
    }

    public d(br.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    @Override // vr.d
    public void i(Throwable th2) {
        if (this.f87107h == null) {
            return;
        }
        f87106i.fine("Response could not be send to subscriber, removing local GENA subscription: " + this.f87107h);
        c().getRegistry().q(this.f87107h);
    }

    @Override // vr.d
    public void j(org.fourthline.cling.model.message.c cVar) {
        if (this.f87107h == null) {
            return;
        }
        if (cVar != null && !cVar.k().f() && this.f87107h.t().c().longValue() == 0) {
            Logger logger = f87106i;
            logger.fine("Establishing subscription");
            this.f87107h.R();
            this.f87107h.N();
            logger.fine("Response to subscription sent successfully, now sending initial event asynchronously");
            c().getConfiguration().g().execute(c().a().a(this.f87107h));
            return;
        }
        if (this.f87107h.t().c().longValue() == 0) {
            Logger logger2 = f87106i;
            logger2.fine("Subscription request's response aborted, not sending initial event");
            if (cVar == null) {
                logger2.fine("Reason: No response at all from subscriber");
            } else {
                logger2.fine("Reason: " + cVar.k());
            }
            logger2.fine("Removing subscription from registry: " + this.f87107h);
            c().getRegistry().q(this.f87107h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public or.i f() throws RouterException {
        sr.g gVar = (sr.g) c().getRegistry().D(sr.g.class, ((org.fourthline.cling.model.message.b) b()).v());
        if (gVar == null) {
            f87106i.fine("No local resource found: " + b());
            return null;
        }
        Logger logger = f87106i;
        logger.fine("Found local event subscription matching relative request URI: " + ((org.fourthline.cling.model.message.b) b()).v());
        or.b bVar = new or.b((org.fourthline.cling.model.message.b) b(), gVar.a());
        if (bVar.A() != null && (bVar.B() || bVar.y() != null)) {
            logger.fine("Subscription ID and NT or Callback in subscribe request: " + b());
            return new or.i(UpnpResponse.Status.BAD_REQUEST);
        }
        if (bVar.A() != null) {
            return m(gVar.a(), bVar);
        }
        if (bVar.B() && bVar.y() != null) {
            return l(gVar.a(), bVar);
        }
        logger.fine("No subscription ID, no NT or Callback, neither subscription or renewal: " + b());
        return new or.i(UpnpResponse.Status.PRECONDITION_FAILED);
    }

    public or.i l(qr.f fVar, or.b bVar) {
        List<URL> listY = bVar.y();
        if (listY == null || listY.size() == 0) {
            f87106i.fine("Missing or invalid Callback URLs in subscribe request: " + b());
            return new or.i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        if (!bVar.B()) {
            f87106i.fine("Missing or invalid NT header in subscribe request: " + b());
            return new or.i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        try {
            this.f87107h = new a(fVar, c().getConfiguration().t() ? null : bVar.z(), listY);
            Logger logger = f87106i;
            logger.fine("Adding subscription to registry: " + this.f87107h);
            c().getRegistry().i(this.f87107h);
            logger.fine("Returning subscription response, waiting to send initial event");
            return new or.i(this.f87107h);
        } catch (Exception e10) {
            f87106i.warning("Couldn't create local subscription to service: " + os.a.a(e10));
            return new or.i(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
    }

    public or.i m(qr.f fVar, or.b bVar) {
        kr.b bVarA = c().getRegistry().a(bVar.A());
        this.f87107h = bVarA;
        if (bVarA == null) {
            f87106i.fine("Invalid subscription ID for renewal request: " + b());
            return new or.i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        Logger logger = f87106i;
        logger.fine("Renewing subscription: " + this.f87107h);
        this.f87107h.S(bVar.z());
        if (c().getRegistry().f(this.f87107h)) {
            return new or.i(this.f87107h);
        }
        logger.fine("Subscription went away before it could be renewed: " + b());
        return new or.i(UpnpResponse.Status.PRECONDITION_FAILED);
    }
}
