package yads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class tr extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f95324h = lm3.f92036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f95325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f95326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f95327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bq2 f95328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f95329f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final en3 f95330g;

    public tr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, mr mrVar, bq2 bq2Var) {
        this.f95325b = priorityBlockingQueue;
        this.f95326c = priorityBlockingQueue2;
        this.f95327d = mrVar;
        this.f95328e = bq2Var;
        this.f95330g = new en3(this, priorityBlockingQueue2, bq2Var);
    }

    private void a() throws InterruptedException {
        po2 po2Var = (po2) this.f95325b.take();
        po2Var.a("cache-queue-take");
        po2Var.a(1);
        try {
            if (po2Var.i()) {
                po2Var.c("cache-discard-canceled");
            } else {
                lr lrVar = this.f95327d.get(po2Var.c());
                if (lrVar == null) {
                    po2Var.a("cache-miss");
                    if (!this.f95330g.a(po2Var)) {
                        this.f95326c.put(po2Var);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (lrVar.f92068e < jCurrentTimeMillis) {
                        po2Var.a("cache-hit-expired");
                        po2Var.f93683p = lrVar;
                        if (!this.f95330g.a(po2Var)) {
                            this.f95326c.put(po2Var);
                        }
                    } else {
                        po2Var.a("cache-hit");
                        byte[] bArr = lrVar.f92064a;
                        Map map = lrVar.f92070g;
                        vp2 vp2VarA = po2Var.a(new e82(200, bArr, map, e82.a(map), false));
                        po2Var.a("cache-hit-parsed");
                        if (vp2VarA.f96163c != null) {
                            po2Var.a("cache-parsing-failed");
                            this.f95327d.a(po2Var.c());
                            po2Var.f93683p = null;
                            if (!this.f95330g.a(po2Var)) {
                                this.f95326c.put(po2Var);
                            }
                        } else if (lrVar.f92069f < jCurrentTimeMillis) {
                            po2Var.a("cache-hit-refresh-needed");
                            po2Var.f93683p = lrVar;
                            vp2VarA.f96164d = true;
                            if (this.f95330g.a(po2Var)) {
                                ((gn0) this.f95328e).a(po2Var, vp2VarA, null);
                            } else {
                                ((gn0) this.f95328e).a(po2Var, vp2VarA, new sr(this, po2Var));
                            }
                        } else {
                            ((gn0) this.f95328e).a(po2Var, vp2VarA, null);
                        }
                    }
                }
            }
        } finally {
            po2Var.a(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f95324h) {
            boolean z10 = ad1.f87661a;
        }
        Process.setThreadPriority(10);
        this.f95327d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f95329f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z11 = ad1.f87661a;
            } catch (Throwable unused2) {
                boolean z12 = ad1.f87661a;
                return;
            }
        }
    }
}
