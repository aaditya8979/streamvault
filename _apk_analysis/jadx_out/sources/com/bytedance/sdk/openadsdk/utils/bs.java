package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.pno.lh.le;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes8.dex */
public class bs {
    private static volatile com.bytedance.sdk.component.pno.lh.le bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f14307cf;
    private static volatile com.bytedance.sdk.component.pno.lh.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f14308le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f14309lh;
    private static volatile ThreadPoolExecutor ouw;
    private static volatile com.bytedance.sdk.component.pno.lh.le pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f14310ra;
    private static volatile com.bytedance.sdk.component.pno.lh.le tlj;
    private static volatile boolean vt;
    private static volatile com.bytedance.sdk.component.pno.lh.le yu;

    static {
        com.bytedance.sdk.component.pno.lh.lh.ouw(new com.bytedance.sdk.component.pno.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.bs.1
            @Override // com.bytedance.sdk.component.pno.lh.ouw
            public final void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.ouw("ThreadUtils", " cycleCallTask = ", vtVar.yu, new RuntimeException());
            }
        });
        ouw = null;
        vt = false;
    }

    public static com.bytedance.sdk.component.pno.lh.le bly() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f14308le;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f14308le)) {
                try {
                    f14308le = ouw("cache", f14308le);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f14308le;
            } else {
                leVar = f14308le;
            }
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le cf() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = tlj;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(tlj)) {
                try {
                    tlj = ouw("net", tlj);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = tlj;
            } else {
                leVar = tlj;
            }
        }
        return leVar;
    }

    public static ExecutorService fkw() {
        return bly();
    }

    public static void fkw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        jg().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.8
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le jg() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = fkw;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(fkw)) {
                try {
                    fkw = ouw("aidl", fkw);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = fkw;
            } else {
                leVar = fkw;
            }
        }
        return leVar;
    }

    private static com.bytedance.sdk.component.pno.lh.le ko() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = pno;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(pno)) {
                try {
                    pno = ouw("image", pno);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = pno;
            } else {
                leVar = pno;
            }
        }
        return leVar;
    }

    public static void le(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName(), pnoVar) { // from class: com.bytedance.sdk.openadsdk.utils.bs.9
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static boolean le() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService lh() {
        return zih();
    }

    public static void lh(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        mwh().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.5
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le mwh() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = yu;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(yu)) {
                try {
                    yu = ouw(CreativeInfo.f52469an, yu);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = yu;
            } else {
                leVar = yu;
            }
        }
        return leVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.sdk.component.pno.lh.le.ouw ouw(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.bs.ouw(java.lang.String):com.bytedance.sdk.component.pno.lh.le$ouw");
    }

    private static com.bytedance.sdk.component.pno.lh.le ouw(String str, com.bytedance.sdk.component.pno.lh.le leVar) {
        le.ouw ouwVarOuw = ouw(str);
        if (leVar == null) {
            return ouwVarOuw.ouw();
        }
        leVar.ouw(ouwVarOuw);
        return leVar;
    }

    public static ScheduledExecutorService ouw() {
        return com.bytedance.sdk.component.pno.le.vt();
    }

    public static void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
        cf().execute(vtVar);
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        bly().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.2
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar, int i10) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.4
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f12761lh = i10;
        rn().execute(vtVar);
    }

    public static void ouw(Runnable runnable) {
        if (runnable == null || uq.ouw) {
            return;
        }
        if (le()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.jg.lh().post(runnable);
        }
    }

    private static boolean ouw(com.bytedance.sdk.component.pno.lh.le leVar) {
        if (leVar != null) {
            return !leVar.ouw && com.bytedance.sdk.openadsdk.core.settings.cf.hun();
        }
        return true;
    }

    public static ExecutorService pno() {
        return rn();
    }

    public static boolean ra() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    private static com.bytedance.sdk.component.pno.lh.le rn() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f14310ra;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f14310ra)) {
                try {
                    f14310ra = ouw("io", f14310ra);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f14310ra;
            } else {
                leVar = f14310ra;
            }
        }
        return leVar;
    }

    private static ThreadPoolExecutor ryl() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f14309lh;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f14309lh)) {
                try {
                    f14309lh = ouw("ad", f14309lh);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f14309lh;
            } else {
                leVar = f14309lh;
            }
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le tlj() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = bly;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(bly)) {
                try {
                    bly = ouw("express", bly);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = bly;
            } else {
                leVar = bly;
            }
        }
        return leVar;
    }

    public static ExecutorService vt() {
        return ko();
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        rn().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.3
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar, int i10) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.6
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f12761lh = i10;
        mwh().execute(vtVar);
    }

    public static void vt(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(runnable);
    }

    public static ExecutorService yu() {
        return mwh();
    }

    public static void yu(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.7
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le zih() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f14307cf;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f14307cf)) {
                try {
                    f14307cf = ouw("imgdisk", f14307cf);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f14307cf;
            } else {
                leVar = f14307cf;
            }
        }
        return leVar;
    }
}
