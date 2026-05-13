package xr;

import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingUnsubscribe.java */
/* JADX INFO: loaded from: classes11.dex */
public class j extends vr.g<or.j, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f87132g = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr.c f87133f;

    /* JADX INFO: compiled from: SendingUnsubscribe.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ org.fourthline.cling.model.message.c f87134b;

        public a(org.fourthline.cling.model.message.c cVar) {
            this.f87134b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.fourthline.cling.model.message.c cVar = this.f87134b;
            if (cVar == null) {
                j.f87132g.fine("Unsubscribe failed, no response received");
                j.this.f87133f.L(CancelReason.UNSUBSCRIBE_FAILED, null);
                return;
            }
            if (cVar.k().f()) {
                j.f87132g.fine("Unsubscribe failed, response was: " + this.f87134b);
                j.this.f87133f.L(CancelReason.UNSUBSCRIBE_FAILED, this.f87134b.k());
                return;
            }
            j.f87132g.fine("Unsubscribe successful, response was: " + this.f87134b);
            j.this.f87133f.L(null, this.f87134b.k());
        }
    }

    public j(br.b bVar, kr.c cVar) {
        super(bVar, new or.j(cVar, bVar.getConfiguration().w(cVar.H())));
        this.f87133f = cVar;
    }

    @Override // vr.g
    public org.fourthline.cling.model.message.c c() throws RouterException {
        f87132g.fine("Sending unsubscribe request: " + d());
        try {
            org.fourthline.cling.model.message.c cVarF = b().c().f(d());
            h(cVarF);
            return cVarF;
        } catch (Throwable th2) {
            h(null);
            throw th2;
        }
    }

    public void h(org.fourthline.cling.model.message.c cVar) {
        b().getRegistry().g(this.f87133f);
        b().getConfiguration().p().execute(new a(cVar));
    }
}
