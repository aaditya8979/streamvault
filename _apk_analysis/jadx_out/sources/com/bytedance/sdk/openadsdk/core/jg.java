package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class jg {
    public static long fkw;
    public static volatile boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile HandlerThread f13593ra;
    public static AtomicBoolean vt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static long f13592lh = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile int f13591le = 0;
    public static float yu = 1.0f;
    private static volatile Handler pno = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle") { // from class: com.bytedance.sdk.openadsdk.core.jg.1
            public boolean ouw = false;

            @Override // java.lang.Thread
            public final synchronized void start() {
                if (this.ouw) {
                    return;
                }
                this.ouw = true;
                super.start();
            }
        };
        f13593ra = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.pno.ouw = f13593ra;
        fkw = System.currentTimeMillis();
    }

    public static boolean fkw() {
        return f13591le == 1;
    }

    public static void le() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f13592lh <= 10000) {
            return;
        }
        f13592lh = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new com.bytedance.sdk.component.pno.pno("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.jg.2
            @Override // java.lang.Runnable
            public final void run() {
                String strVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(zih.ouw());
                if (TextUtils.equals(strVt, com.bytedance.sdk.openadsdk.core.settings.cf.fkw)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(6, true);
                com.bytedance.sdk.openadsdk.core.settings.cf.fkw = strVt;
            }
        });
    }

    public static Handler lh() {
        return new Handler(Looper.getMainLooper());
    }

    public static long ouw() {
        return fkw;
    }

    public static void ouw(int i10) {
        f13591le = i10;
    }

    public static void ouw(long j10) {
        fkw = j10;
    }

    public static void ouw(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    String strOptString = jSONObject.optString("value", "");
                    bly.ouw().f13395lh = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        return;
                    }
                    bly.ouw("mediation_info", strOptString);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("InitHelper", th2.getMessage());
        }
    }

    public static void pno() {
        vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jg.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jg.4.1
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f14401lh = C3978d4.a.f31210f;
                            return ouwVar;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static void ra() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f13592lh <= 10000) {
            return;
        }
        synchronized (jg.class) {
            if (jElapsedRealtime - f13592lh <= 10000) {
                return;
            }
            f13592lh = jElapsedRealtime;
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jg.3
                @Override // java.lang.Runnable
                public final void run() {
                    String strVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(zih.ouw());
                    if (TextUtils.equals(strVt, com.bytedance.sdk.openadsdk.core.settings.cf.fkw)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.cf.fkw = strVt;
                }
            });
        }
    }

    public static Handler vt() {
        if (f13593ra == null || !f13593ra.isAlive()) {
            synchronized (jg.class) {
                if (f13593ra == null || !f13593ra.isAlive()) {
                    f13593ra = com.bytedance.sdk.component.utils.pno.ouw("csj_init_handle", -1);
                    pno = new Handler(f13593ra.getLooper());
                }
            }
        } else if (pno == null) {
            synchronized (jg.class) {
                if (pno == null) {
                    pno = new Handler(f13593ra.getLooper());
                }
            }
        }
        return pno;
    }

    public static int yu() {
        return f13591le;
    }
}
