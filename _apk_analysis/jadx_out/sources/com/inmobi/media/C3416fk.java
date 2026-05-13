package com.inmobi.media;

import android.os.Build;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.C3416fk;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3416fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TelemetryConfig f27178a;

    public C3416fk(TelemetryConfig telemetryConfig) {
        tn.p.k(telemetryConfig, "telemetryConfig");
        this.f27178a = telemetryConfig;
        ((C3857xc) Ji.f25751e.getValue()).a(new int[]{TextFieldImplKt.AnimationDuration, 152}, new sn.l() { // from class: n9.y6
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3416fk.a(this.f75705b, (I2) obj);
            }
        });
    }

    public static final bn.r a(C3416fk c3416fk, I2 i22) {
        tn.p.k(i22, "it");
        switch (i22.f25635a) {
            case TextFieldImplKt.AnimationDuration /* 150 */:
                Map map = i22.f25637c;
                Object obj = map != null ? map.get("data") : null;
                c3416fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                break;
            case 151:
                Map map2 = i22.f25637c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                Wn wn2 = obj2 instanceof Wn ? (Wn) obj2 : null;
                c3416fk.getClass();
                if (wn2 != null && AbstractC3492il.a(wn2)) {
                    C3850x5.f28483a.getClass();
                    if (!C3850x5.r()) {
                        c3416fk.a("MainThreadBlockedEvent", wn2);
                    }
                }
                break;
            case 152:
                Map map3 = i22.f25637c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                c3416fk.a(obj3 instanceof C3896z1 ? (C3896z1) obj3 : null);
                break;
        }
        return bn.r.f5635a;
    }

    public final void a(C3896z1 c3896z1) {
        if (Build.VERSION.SDK_INT < 30 || c3896z1 == null || c3896z1.f28616g != 6) {
            return;
        }
        a("ANREvent", c3896z1);
    }

    public final void a(String str, Q9 q92) {
        if (this.f27178a.getPriorityEventsList().contains(str) && q92 != null && AbstractC3492il.a(q92)) {
            Wj.b(str, new LinkedHashMap(), EnumC3287ak.f26805a);
        }
    }
}
