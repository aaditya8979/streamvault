package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ko implements com.bytedance.sdk.openadsdk.oem.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static boolean f14318lh;
    private static final ko ouw = new ko();
    private static com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;

    public static void ouw() {
        if (vt == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), vt.vt);
        if (iPBroadcastReceiverOuw != null) {
            iPBroadcastReceiverOuw.vt = null;
        }
        vt = null;
        f14318lh = false;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.jae jaeVar = ouwVar.vt.oiz;
        if (jaeVar != null) {
            if (jaeVar.ouw() || jaeVar.vt()) {
                vt = ouwVar;
                IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(ouwVar.hun, ouwVar.vt);
                if (iPBroadcastReceiverOuw != null) {
                    iPBroadcastReceiverOuw.vt = ouw;
                }
            }
        }
    }

    public static void vt() {
        f14318lh = true;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.ouw
    public final void ouw(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = vt;
        if (ouwVar == null || (leVar = ouwVar.vt.f13802wp) == null) {
            return;
        }
        String str2 = leVar.f13685lh;
        if (TextUtils.isEmpty(str2) || !str2.equals(str)) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ko.1
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                if (ko.vt == null || (i11 = i10) <= 0 || i11 > 5) {
                    return;
                }
                boolean z10 = true;
                boolean z11 = i11 == 1;
                if (ko.f14318lh) {
                    ko.vt.fqk.kn();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", ko.vt.vt, new cf.ouw().ouw(), ko.vt.fkw, true, (Map<String, Object>) map, 1);
                } else {
                    z10 = z11;
                }
                if (z10) {
                    ko.ouw();
                }
            }
        });
    }
}
