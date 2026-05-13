package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f8349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f8354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8356i = new Object();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.f8354g.run();
                synchronized (g7.this.f8356i) {
                    if (g7.this.f8353f) {
                        g7.this.f8350c = System.currentTimeMillis();
                        g7 g7Var = g7.this;
                        g7Var.f8351d = g7Var.f8352e;
                    } else {
                        g7.this.f8349b = null;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (g7.this.f8348a != null) {
                        g7.this.f8348a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.f8348a.O().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        g7.this.f8348a.D().a("Timer", "executingTimedTask", th2);
                    }
                    synchronized (g7.this.f8356i) {
                        if (g7.this.f8353f) {
                            g7.this.f8350c = System.currentTimeMillis();
                            g7 g7Var2 = g7.this;
                            g7Var2.f8351d = g7Var2.f8352e;
                        } else {
                            g7.this.f8349b = null;
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (g7.this.f8356i) {
                        if (g7.this.f8353f) {
                            g7.this.f8350c = System.currentTimeMillis();
                            g7 g7Var3 = g7.this;
                            g7Var3.f8351d = g7Var3.f8352e;
                        } else {
                            g7.this.f8349b = null;
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f8348a = kVar;
        this.f8354g = runnable;
    }

    public static g7 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g7 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        g7 g7Var = new g7(kVar, runnable);
        g7Var.f8350c = System.currentTimeMillis();
        g7Var.f8351d = j10;
        g7Var.f8353f = z10;
        g7Var.f8352e = j10;
        try {
            g7Var.f8349b = new Timer();
            g7Var.a(g7Var.b(), j10, z10, g7Var.f8352e);
        } catch (OutOfMemoryError e10) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("Timer", "Failed to create timer due to OOM error", e10);
            }
        }
        return g7Var;
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f8349b.schedule(timerTask, j10, j11);
        } else {
            this.f8349b.schedule(timerTask, j10);
        }
    }

    private TimerTask b() {
        return new a();
    }

    public void a() {
        synchronized (this.f8356i) {
            Timer timer = this.f8349b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8349b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8348a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8348a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8348a.O().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f8349b = null;
                    } catch (Throwable th3) {
                        this.f8349b = null;
                        this.f8355h = 0L;
                        throw th3;
                    }
                }
                this.f8355h = 0L;
            }
        }
    }

    public long c() {
        if (this.f8349b == null) {
            return this.f8351d - this.f8355h;
        }
        return this.f8351d - (System.currentTimeMillis() - this.f8350c);
    }

    public void d() {
        synchronized (this.f8356i) {
            Timer timer = this.f8349b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8355h = Math.max(1L, System.currentTimeMillis() - this.f8350c);
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8348a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8348a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8348a.O().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f8349b = null;
                    } finally {
                        this.f8349b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f8356i) {
            long j10 = this.f8355h;
            if (j10 > 0) {
                try {
                    long j11 = this.f8351d - j10;
                    this.f8351d = j11;
                    if (j11 < 0) {
                        this.f8351d = 0L;
                    }
                    this.f8349b = new Timer();
                    a(b(), this.f8351d, this.f8353f, this.f8352e);
                    this.f8350c = System.currentTimeMillis();
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8348a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8348a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8348a.O().a("Timer", "Encountered error while resuming timer", th2);
                                }
                            }
                        }
                        this.f8355h = 0L;
                    } finally {
                        this.f8355h = 0L;
                    }
                }
            }
        }
    }
}
