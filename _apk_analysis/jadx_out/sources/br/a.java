package br;

import ir.f;
import ir.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import js.i;
import js.j;
import js.o;
import js.p;
import js.q;
import js.r;
import js.s;
import ls.e;
import ls.h;
import ls.l;
import qr.k;

/* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
/* JADX INFO: loaded from: classes6.dex */
@Alternative
public class a implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f5908i = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f5910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls.d f5911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f5913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gr.a f5914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gr.c f5915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f5916h;

    /* JADX INFO: renamed from: br.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
    public static class C0125a extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: br.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
        public class C0126a extends ThreadPoolExecutor.DiscardPolicy {
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                a.f5908i.info("Thread pool rejected execution of " + runnable.getClass());
                super.rejectedExecution(runnable, threadPoolExecutor);
            }
        }

        public C0125a() {
            this(new b(), new C0126a());
        }

        public C0125a(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, rejectedExecutionHandler);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            super.afterExecute(runnable, th2);
            if (th2 != null) {
                Throwable thA = os.a.a(th2);
                if (thA instanceof InterruptedException) {
                    return;
                }
                a.f5908i.warning("Thread terminated " + runnable + " abruptly with exception: " + th2);
                Logger logger = a.f5908i;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Root cause: ");
                sb2.append(thA);
                logger.warning(sb2.toString());
            }
        }
    }

    /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ThreadGroup f5917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f5918c = new AtomicInteger(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5919d = "cling-";

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f5917b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f5917b, runnable, "cling-" + this.f5918c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public a() {
        this(0);
    }

    public a(int i10) {
        this(i10, true);
    }

    public a(int i10, boolean z10) {
        if (z10 && f.f71773a) {
            throw new Error("Unsupported runtime environment, use org.fourthline.cling.android.AndroidUpnpServiceConfiguration");
        }
        this.f5909a = i10;
        this.f5910b = A();
        this.f5911c = z();
        this.f5912d = F();
        this.f5913e = C();
        this.f5914f = B();
        this.f5915g = G();
        this.f5916h = D();
    }

    public ExecutorService A() {
        return new C0125a();
    }

    public gr.a B() {
        return new gr.d();
    }

    public e C() {
        return new js.g();
    }

    public g D() {
        return new g();
    }

    public ls.g E(int i10) {
        return new j(i10);
    }

    public h F() {
        return new o();
    }

    public gr.c G() {
        return new gr.e();
    }

    public ExecutorService H() {
        return this.f5910b;
    }

    @Override // br.c
    public int a() {
        return 1000;
    }

    @Override // br.c
    public ls.f b(ls.g gVar) {
        return new i(new js.h(gVar.d(), gVar.g()));
    }

    @Override // br.c
    public ls.j c() {
        return new q(new p(i()));
    }

    @Override // br.c
    public gr.c d() {
        return this.f5915g;
    }

    @Override // br.c
    public ls.g e() {
        return E(this.f5909a);
    }

    @Override // br.c
    public lr.c f(qr.j jVar) {
        return null;
    }

    @Override // br.c
    public Executor g() {
        return H();
    }

    @Override // br.c
    public g getNamespace() {
        return this.f5916h;
    }

    @Override // br.c
    public Executor h() {
        return H();
    }

    @Override // br.c
    public ExecutorService i() {
        return H();
    }

    @Override // br.c
    public h j() {
        return this.f5912d;
    }

    @Override // br.c
    public gr.a k() {
        return this.f5914f;
    }

    @Override // br.c
    public int l() {
        return 0;
    }

    @Override // br.c
    public Executor m() {
        return H();
    }

    @Override // br.c
    public ls.d n() {
        return this.f5911c;
    }

    @Override // br.c
    public l o(ls.g gVar) {
        return new s(new r(gVar.e()));
    }

    @Override // br.c
    public Executor p() {
        return H();
    }

    @Override // br.c
    public ur.s[] q() {
        return new ur.s[0];
    }

    @Override // br.c
    public e r() {
        return this.f5913e;
    }

    @Override // br.c
    public Executor s() {
        return H();
    }

    @Override // br.c
    public void shutdown() {
        f5908i.fine("Shutting down default executor service");
        H().shutdownNow();
    }

    @Override // br.c
    public boolean t() {
        return false;
    }

    @Override // br.c
    public ExecutorService u() {
        return H();
    }

    @Override // br.c
    public Integer v() {
        return null;
    }

    @Override // br.c
    public lr.c w(k kVar) {
        return null;
    }

    @Override // br.c
    public ls.c x(ls.g gVar) {
        return new js.d(new js.c());
    }

    public ls.d z() {
        return new js.e();
    }
}
