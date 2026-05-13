package xr;

import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingSubscribe.java */
/* JADX INFO: loaded from: classes8.dex */
public class i extends vr.g<or.h, or.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f87123g = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr.c f87124f;

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f87124f.P(null);
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ or.c f87126b;

        public b(or.c cVar) {
            this.f87126b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f87124f.P(this.f87126b.k());
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ or.c f87128b;

        public c(or.c cVar) {
            this.f87128b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f87124f.P(this.f87128b.k());
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f87124f.N();
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f87124f.P(null);
        }
    }

    public i(br.b bVar, kr.c cVar, List<ir.h> list) {
        super(bVar, new or.h(cVar, cVar.R(list, bVar.getConfiguration().getNamespace()), bVar.getConfiguration().w(cVar.H())));
        this.f87124f = cVar;
    }

    @Override // vr.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public or.c c() throws RouterException {
        if (!d().y()) {
            f87123g.fine("Subscription failed, no active local callback URLs available (network disabled?)");
            b().getConfiguration().p().execute(new a());
            return null;
        }
        Logger logger = f87123g;
        logger.fine("Sending subscription request: " + d());
        try {
            b().getRegistry().B(this.f87124f);
            org.fourthline.cling.model.message.c cVarF = b().c().f(d());
            if (cVarF == null) {
                h();
                return null;
            }
            or.c cVar = new or.c(cVarF);
            if (cVarF.k().f()) {
                logger.fine("Subscription failed, response was: " + cVar);
                b().getConfiguration().p().execute(new b(cVar));
            } else if (cVar.w()) {
                logger.fine("Subscription established, adding to registry, response was: " + cVarF);
                this.f87124f.K(cVar.v());
                this.f87124f.J(cVar.u());
                b().getRegistry().s(this.f87124f);
                b().getConfiguration().p().execute(new d());
            } else {
                logger.severe("Subscription failed, invalid or missing (SID, Timeout) response headers");
                b().getConfiguration().p().execute(new c(cVar));
            }
            return cVar;
        } catch (RouterException unused) {
            h();
            return null;
        } finally {
            b().getRegistry().x(this.f87124f);
        }
    }

    public void h() {
        f87123g.fine("Subscription failed");
        b().getConfiguration().p().execute(new e());
    }
}
