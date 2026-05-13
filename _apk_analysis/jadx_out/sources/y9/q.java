package y9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import y9.y;

/* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
/* JADX INFO: loaded from: classes10.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f87458a = new b();

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f87459a = new q();

        static {
            ea.c.a().c(new b0());
        }
    }

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ThreadPoolExecutor f87460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinkedBlockingQueue<Runnable> f87461b;

        public b() {
            b();
        }

        public void a(y.b bVar) {
            this.f87460a.execute(new c(bVar));
        }

        public final void b() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.f87461b = linkedBlockingQueue;
            this.f87460a = ia.b.b(3, linkedBlockingQueue, "LauncherTask");
        }
    }

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y.b f87462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f87463c = false;

        public c(y.b bVar) {
            this.f87462b = bVar;
        }

        public boolean equals(Object obj) {
            return super.equals(obj) || obj == this.f87462b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f87463c) {
                return;
            }
            this.f87462b.start();
        }
    }

    public static q a() {
        return a.f87459a;
    }

    public synchronized void b(y.b bVar) {
        this.f87458a.a(bVar);
    }
}
