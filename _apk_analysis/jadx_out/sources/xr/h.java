package xr;

import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingRenewal.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends vr.g<or.g, or.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f87116g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr.c f87117f;

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ or.c f87118b;

        public a(or.c cVar) {
            this.f87118b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f87117f.L(CancelReason.RENEWAL_FAILED, this.f87118b.k());
        }
    }

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ or.c f87120b;

        public b(or.c cVar) {
            this.f87120b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f87117f.L(CancelReason.RENEWAL_FAILED, this.f87120b.k());
        }
    }

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f87117f.L(CancelReason.RENEWAL_FAILED, null);
        }
    }

    public h(br.b bVar, kr.c cVar) {
        super(bVar, new or.g(cVar, bVar.getConfiguration().w(cVar.H())));
        this.f87117f = cVar;
    }

    @Override // vr.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public or.c c() throws RouterException {
        Logger logger = f87116g;
        logger.fine("Sending subscription renewal request: " + d());
        try {
            org.fourthline.cling.model.message.c cVarF = b().c().f(d());
            if (cVarF == null) {
                h();
                return null;
            }
            or.c cVar = new or.c(cVarF);
            if (cVarF.k().f()) {
                logger.fine("Subscription renewal failed, response was: " + cVarF);
                b().getRegistry().g(this.f87117f);
                b().getConfiguration().p().execute(new a(cVar));
            } else if (cVar.w()) {
                logger.fine("Subscription renewed, updating in registry, response was: " + cVarF);
                this.f87117f.J(cVar.u());
                b().getRegistry().k(this.f87117f);
            } else {
                logger.severe("Subscription renewal failed, invalid or missing (SID, Timeout) response headers");
                b().getConfiguration().p().execute(new b(cVar));
            }
            return cVar;
        } catch (RouterException e10) {
            h();
            throw e10;
        }
    }

    public void h() {
        f87116g.fine("Subscription renewal failed, removing subscription from registry");
        b().getRegistry().g(this.f87117f);
        b().getConfiguration().p().execute(new c());
    }
}
