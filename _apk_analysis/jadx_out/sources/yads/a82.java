package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class a82 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f87614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo f87615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f87616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bq2 f87617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f87618f = false;

    public a82(PriorityBlockingQueue priorityBlockingQueue, xo xoVar, mr mrVar, bq2 bq2Var) {
        this.f87614b = priorityBlockingQueue;
        this.f87615c = xoVar;
        this.f87616d = mrVar;
        this.f87617e = bq2Var;
    }

    private void a() throws InterruptedException {
        po2 po2Var = (po2) this.f87614b.take();
        SystemClock.elapsedRealtime();
        po2Var.a(3);
        try {
            try {
                try {
                    po2Var.a("network-queue-take");
                    if (po2Var.i()) {
                        po2Var.c("network-discard-cancelled");
                        po2Var.j();
                    } else {
                        TrafficStats.setThreadStatsTag(po2Var.f93672e);
                        e82 e82VarA = this.f87615c.a(po2Var);
                        po2Var.a("network-http-complete");
                        if (e82VarA.f89161e && po2Var.h()) {
                            po2Var.c("not-modified");
                            po2Var.j();
                        } else {
                            vp2 vp2VarA = po2Var.a(e82VarA);
                            po2Var.a("network-parse-complete");
                            if (po2Var.f93677j && vp2VarA.f96162b != null) {
                                this.f87616d.a(po2Var.c(), vp2VarA.f96162b);
                                po2Var.a("network-cache-written");
                            }
                            synchronized (po2Var.f93673f) {
                                po2Var.f93679l = true;
                            }
                            ((gn0) this.f87617e).a(po2Var, vp2VarA, null);
                            po2Var.a(vp2VarA);
                        }
                    }
                } catch (im3 e10) {
                    SystemClock.elapsedRealtime();
                    im3 im3VarA = po2Var.a(e10);
                    gn0 gn0Var = (gn0) this.f87617e;
                    gn0Var.getClass();
                    po2Var.a("post-error");
                    vp2 vp2Var = new vp2(im3VarA);
                    en0 en0Var = gn0Var.f90040a;
                    en0Var.f89318a.post(new fn0(po2Var, vp2Var, null));
                    po2Var.j();
                }
            } catch (Exception e11) {
                boolean z10 = lm3.f92036a;
                boolean z11 = ad1.f87661a;
                im3 im3Var = new im3((Throwable) e11);
                SystemClock.elapsedRealtime();
                gn0 gn0Var2 = (gn0) this.f87617e;
                gn0Var2.getClass();
                po2Var.a("post-error");
                vp2 vp2Var2 = new vp2(im3Var);
                en0 en0Var2 = gn0Var2.f90040a;
                en0Var2.f89318a.post(new fn0(po2Var, vp2Var2, null));
                po2Var.j();
            }
        } finally {
            po2Var.a(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f87618f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z10 = lm3.f92036a;
                    boolean z11 = ad1.f87661a;
                }
            } catch (Throwable unused2) {
                boolean z12 = lm3.f92036a;
                boolean z13 = ad1.f87661a;
                return;
            }
        }
    }
}
