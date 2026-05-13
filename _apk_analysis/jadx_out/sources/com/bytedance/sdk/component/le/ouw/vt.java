package com.bytedance.sdk.component.le.ouw;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vt {
    private static volatile List<Object> ouw = new ArrayList();

    public static void fkw() {
        yu yuVar = yu.ouw;
    }

    public static void lh() {
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        yu.ouw();
        final yu yuVar = yu.ouw;
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        final fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null) {
            return;
        }
        if (!pno.vt().pno) {
            pno.vt();
            pno.lh();
        } else if (yu.ouw(pno.vt().ouw, fkwVar)) {
            pno.vt();
            pno.lh();
        } else if (yu.yu()) {
            fkwVar.ouw().execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("start") { // from class: com.bytedance.sdk.component.le.ouw.yu.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    yu.vt();
                }
            });
        } else {
            yu.vt();
        }
    }

    public static List<Object> ouw() {
        return ouw;
    }

    public static void ouw(ouw ouwVar, Context context) {
        yu.ouw(ouwVar, context);
        pno.vt().ouw = context;
        pno.vt().tlj = ouwVar.vt;
        pno.vt().vt = ouwVar.f12651lh;
        pno.vt().f12677lh = ouwVar.yu;
        pno.vt().f12676le = ouwVar.f12650le;
        pno.vt().yu = ouwVar.fkw;
        pno.vt().fkw = ouwVar.f12652ra;
        pno pnoVarVt = pno.vt();
        com.bytedance.sdk.component.le.ouw.ouw.fkw fkwVar = ouwVar.ouw;
        if (fkwVar == null) {
            fkwVar = com.bytedance.sdk.component.le.ouw.ouw.ouw.fkw.ouw;
        }
        pnoVarVt.f12678ra = fkwVar;
        pno.vt().pno = ouwVar.pno;
        pno.vt().bly = ouwVar.bly;
        pno.vt().ouw(ouwVar.tlj);
        pno.vt().mwh = ouwVar.mwh;
        com.bytedance.sdk.component.le.ouw.vt.lh.lh.ouw(ouwVar.ryl);
        com.bytedance.sdk.component.le.ouw.vt.lh.lh.vt(ouwVar.f12649cf);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            com.bytedance.sdk.component.le.ouw.lh.ouw.lh();
        }
        if (ouwVar.bly != null) {
            com.bytedance.sdk.component.le.ouw.lh.ouw.lh();
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
    }

    public static void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        yu.ouw.ouw(ouwVar);
    }

    public static void ouw(final String str, final List<String> list, final int i10, final String str2) {
        final yu yuVar = yu.ouw;
        final fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null || list == null || list.isEmpty()) {
            return;
        }
        if (!pno.vt().pno || yu.ouw(pno.vt().ouw, fkwVar)) {
            pno.vt();
            pno.ouw(str, list, null, i10, str2);
        } else if (yu.yu()) {
            fkwVar.ouw().execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("trackFailed") { // from class: com.bytedance.sdk.component.le.ouw.yu.4

                /* JADX INFO: renamed from: lh, reason: collision with root package name */
                public final /* synthetic */ boolean f12720lh = true;

                @Override // java.lang.Runnable
                public final void run() {
                    yu.ouw(str, list, this.f12720lh, i10, str2);
                }
            });
        } else {
            yu.ouw(str, list, true, i10, str2);
        }
    }

    public static void ouw(final String str, final boolean z10) {
        final yu yuVar = yu.ouw;
        final fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null) {
            return;
        }
        if (!pno.vt().pno || yu.ouw(pno.vt().ouw, fkwVar)) {
            pno.vt();
            pno.ouw(str, z10);
        } else if (yu.yu()) {
            fkwVar.ouw().execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("trackFailed") { // from class: com.bytedance.sdk.component.le.ouw.yu.5
                @Override // java.lang.Runnable
                public final void run() {
                    yu.ouw(str, z10);
                }
            });
        } else {
            yu.ouw(str, z10);
        }
    }

    public static boolean vt() {
        return pno.vt().bly == null || pno.vt().ouw == null;
    }

    public static void yu() {
        final yu yuVar = yu.ouw;
        final fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null) {
            return;
        }
        if (!pno.vt().pno) {
            pno.vt();
            pno.yu();
        } else if (yu.ouw(pno.vt().ouw, fkwVar)) {
            pno.vt();
            pno.yu();
        } else if (yu.yu()) {
            fkwVar.ouw().execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("stop") { // from class: com.bytedance.sdk.component.le.ouw.yu.2
                @Override // java.lang.Runnable
                public final void run() {
                    yu.lh();
                }
            });
        } else {
            yu.lh();
        }
    }
}
