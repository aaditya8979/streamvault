package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class d6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f8058r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8067i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f8069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f8070l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f8075q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8068j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f8071m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f8072n = new Object();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8076a;

        static {
            int[] iArr = new int[b.values().length];
            f8076a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8076a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8076a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8076a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f8083f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j10) {
            super(kVar, i5Var, bVar);
            this.f8083f = j10;
        }
    }

    public class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8084a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.o unused = d6.this.f8060b;
                if (com.applovin.impl.sdk.o.a()) {
                    d6.this.f8060b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public d(String str) {
            this.f8084a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f8084a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f8059a.a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f8089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i5 f8090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f8091e;

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.f8087a = kVar;
            this.f8089c = kVar.O();
            this.f8088b = i5Var.c();
            this.f8090d = i5Var;
            this.f8091e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f8087a.E0() || this.f8090d.d()) {
                    ScheduledFuture scheduledFutureB = this.f8090d.b(Thread.currentThread(), ((Long) this.f8087a.a(x4.f10853v)).longValue());
                    this.f8090d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8089c.d(this.f8088b, "Task re-scheduled...");
                    }
                    this.f8087a.q0().a(this.f8090d, this.f8091e, 2000L);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8089c.d(this.f8088b, this.f8091e + " queue finished task " + this.f8090d.c());
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8089c.a(this.f8088b, "Task failed execution", th2);
                    }
                    this.f8090d.a(th2);
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8089c.d(this.f8088b, this.f8091e + " queue finished task " + this.f8090d.c());
                    }
                }
            }
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.f8059a = kVar;
        this.f8060b = kVar.O();
        this.f8074p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.f8075q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.f8061c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.f8062d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.f8063e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.f8065g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.f8066h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f8064f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.f8067i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.f8069k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f8070l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f8076a[eVar.f8091e.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? this.f8067i : this.f8064f : this.f8066h : this.f8065g : this.f8063e;
    }

    private void a(final e eVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f8074p ? a(eVar) : this.f8062d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            g0.a(j10, this.f8059a, new Runnable() { // from class: com.applovin.impl.m9
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.f8059a, str, runnable));
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    private boolean b(e eVar) {
        if (eVar.f8090d.d()) {
            return false;
        }
        synchronized (this.f8072n) {
            if (this.f8073o) {
                return false;
            }
            this.f8071m.add(eVar);
            return true;
        }
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8060b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8060b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.n9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f9344b.a(str, runnable);
            }
        };
    }

    public ExecutorService a() {
        return this.f8069k;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public void a(i5 i5Var) {
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f8074p ? this.f8063e : this.f8062d;
        try {
            if (n7.i()) {
                scheduledThreadPoolExecutor.submit(new e(this.f8059a, i5Var, b.CORE));
                return;
            }
            ScheduledFuture scheduledFutureB = i5Var.b(Thread.currentThread(), ((Long) this.f8059a.a(x4.f10853v)).longValue());
            i5Var.run();
            if (scheduledFutureB != null) {
                scheduledFutureB.cancel(false);
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8060b.a(i5Var.c(), "Task failed execution", th2);
            }
            i5Var.a(th2);
        }
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public void a(i5 i5Var, b bVar, long j10) {
        a(i5Var, bVar, j10, false);
    }

    public void a(i5 i5Var, b bVar, long j10, boolean z10) {
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
        }
        e cVar = this.f8075q ? new c(this.f8059a, i5Var, bVar, j10) : new e(this.f8059a, i5Var, bVar);
        if (!b(cVar)) {
            a(cVar, j10, z10);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8060b.d(i5Var.c(), "Task execution delayed until after init");
        }
    }

    public void a(i5 i5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f8068j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f8068j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f8059a, i5Var, b.MEDIATION));
    }

    public void a(Runnable runnable, b bVar) {
        if (!this.f8074p) {
            this.f8061c.submit(runnable);
            return;
        }
        com.applovin.impl.sdk.k kVar = this.f8059a;
        e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
        a(eVar).submit(eVar);
    }

    public ExecutorService b() {
        return this.f8074p ? this.f8065g : f8058r;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j10) {
        return this.f8074p ? a(new e(this.f8059a, i5Var, bVar)).schedule(i5Var, j10, TimeUnit.MILLISECONDS) : this.f8061c.schedule(i5Var, j10, TimeUnit.MILLISECONDS);
    }

    public Executor c() {
        return this.f8074p ? this.f8063e : this.f8062d;
    }

    public ExecutorService d() {
        return this.f8070l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f8073o;
    }

    public void g() {
        synchronized (this.f8072n) {
            this.f8073o = true;
            for (e eVar : this.f8071m) {
                if (this.f8075q) {
                    c cVar = (c) eVar;
                    a(cVar.f8090d, cVar.f8091e, cVar.f8083f);
                } else {
                    a(eVar.f8090d, eVar.f8091e);
                }
            }
            this.f8071m.clear();
        }
    }

    public void h() {
        synchronized (this.f8072n) {
            this.f8073o = false;
        }
    }
}
