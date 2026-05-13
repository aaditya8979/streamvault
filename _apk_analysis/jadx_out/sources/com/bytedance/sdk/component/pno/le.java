package com.bytedance.sdk.component.pno;

import com.bytedance.sdk.component.pno.ouw;
import com.ironsource.C3978d4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class le extends fkw {
    private static volatile ThreadPoolExecutor fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f12752le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile ScheduledExecutorService f12754ra;
    public static lh vt;
    public static final int ouw = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f12753lh = 120;
    public static boolean yu = true;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.pno.le$1, reason: invalid class name */
    public static class AnonymousClass1 implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    public static lh fkw() {
        return vt;
    }

    public static void le() {
        f12753lh = -1;
    }

    public static void lh(pno pnoVar) {
        vt(pnoVar);
    }

    public static boolean lh() {
        return yu;
    }

    public static void ouw(lh lhVar) {
        vt = lhVar;
    }

    public static void ouw(pno pnoVar) {
        if (fkw == null) {
            ra();
        }
        if (pnoVar == null || fkw == null) {
            return;
        }
        fkw.execute(pnoVar);
    }

    public static void ouw(boolean z10) {
        yu = z10;
    }

    private static ExecutorService pno() {
        if (f12752le == null) {
            synchronized (le.class) {
                if (f12752le == null) {
                    ouw.C0202ouw c0202ouw = new ouw.C0202ouw();
                    c0202ouw.ouw = "io";
                    c0202ouw.vt = 2;
                    c0202ouw.pno = 10;
                    c0202ouw.f12765lh = 20L;
                    c0202ouw.yu = TimeUnit.SECONDS;
                    c0202ouw.fkw = new LinkedBlockingQueue();
                    c0202ouw.f12766ra = new AnonymousClass1();
                    c0202ouw.f12764le = fkw.ouw().ouw(10, "io");
                    ouw ouwVarOuw = c0202ouw.ouw();
                    f12752le = ouwVarOuw;
                    ouwVarOuw.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f12752le;
    }

    private static ExecutorService ra() {
        if (fkw == null) {
            synchronized (le.class) {
                if (fkw == null) {
                    ouw.C0202ouw c0202ouw = new ouw.C0202ouw();
                    c0202ouw.ouw = C3978d4.a.f31210f;
                    c0202ouw.vt = 0;
                    c0202ouw.pno = 10;
                    c0202ouw.f12765lh = 5L;
                    c0202ouw.yu = TimeUnit.SECONDS;
                    c0202ouw.fkw = new SynchronousQueue();
                    c0202ouw.f12766ra = new AnonymousClass1();
                    c0202ouw.f12764le = fkw.ouw().ouw(10, C3978d4.a.f31210f);
                    fkw = c0202ouw.ouw();
                }
            }
        }
        return fkw;
    }

    public static ScheduledExecutorService vt() {
        if (f12754ra == null) {
            synchronized (le.class) {
                if (f12754ra == null) {
                    f12754ra = Executors.newSingleThreadScheduledExecutor(fkw.ouw().ouw(5, "scheduled"));
                }
            }
        }
        return f12754ra;
    }

    public static void vt(pno pnoVar) {
        if (f12752le == null) {
            pno();
        }
        if (f12752le != null) {
            f12752le.execute(pnoVar);
        }
    }

    public static RejectedExecutionHandler yu() {
        return new AnonymousClass1();
    }
}
