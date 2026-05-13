package sg.bigo.ads.common.g.a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.n.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<Runnable> f82111a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f82112b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f82113c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f82117a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f82118b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f82117a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f82119c;

        public a(Runnable runnable) {
            this.f82119c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f82119c.run();
            this.f82117a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.f82113c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}
