package com.bytedance.sdk.component.le.ouw.ra;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.le.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.pno;

/* JADX INFO: loaded from: classes4.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f12679lh = 3000;
    private static volatile HandlerThread ouw;
    private static volatile Handler vt;

    static {
        lh();
    }

    private static void lh() {
        HandlerThread handlerThreadYu;
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && (handlerThreadYu = fkwVar.yu("csj_ad_log")) != null) {
            ouw = handlerThreadYu;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        ouw = handlerThread;
        handlerThread.start();
    }

    public static Handler ouw() {
        if (ouw == null || !ouw.isAlive()) {
            synchronized (ouw.class) {
                if (ouw == null || !ouw.isAlive()) {
                    lh();
                    vt = new Handler(ouw.getLooper());
                }
            }
        } else if (vt == null) {
            synchronized (ouw.class) {
                if (vt == null) {
                    vt = new Handler(ouw.getLooper());
                }
            }
        }
        return vt;
    }

    public static int vt() {
        if (f12679lh <= 0) {
            f12679lh = 3000;
        }
        return f12679lh;
    }
}
