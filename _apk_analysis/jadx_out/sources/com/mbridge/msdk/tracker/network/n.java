package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: NetworkDispatcher.java */
/* JADX INFO: loaded from: classes8.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f40990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f40991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f40992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f40993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f40994e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f40990a = blockingQueue;
        this.f40991b = mVar;
        this.f40992c = bVar;
        this.f40993d = wVar;
    }

    private void a() throws InterruptedException {
        b(this.f40990a.take());
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f40993d.a(tVar, tVar.c(b0Var));
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                tVar.a("network-queue-take");
            } catch (b0 e10) {
                e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(tVar, e10);
                tVar.x();
            } catch (Exception e11) {
                c0.a(e11, "Unhandled exception %s", e11.toString());
                a0 a0Var = new a0(e11);
                a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f40993d.a(tVar, a0Var);
                tVar.x();
            }
            if (tVar.v()) {
                tVar.c("network-discard-cancelled");
                tVar.x();
                return;
            }
            if (tVar.y()) {
                a(tVar);
            }
            q qVarA = this.f40991b.a(tVar);
            tVar.a("network-http-complete");
            if (qVarA.f41025e && tVar.u()) {
                tVar.c("not-modified");
                tVar.x();
                return;
            }
            v<?> vVarA = tVar.a(qVarA);
            tVar.a("network-parse-complete");
            if (tVar.z() && vVarA.f41098b != null) {
                this.f40992c.a(tVar.e(), vVarA.f41098b);
                tVar.a("network-cache-written");
            }
            tVar.w();
            this.f40993d.a(tVar, vVarA);
            tVar.a(vVarA);
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f40994e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
