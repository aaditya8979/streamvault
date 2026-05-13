package com.bytedance.sdk.openadsdk.core.cf.le.ouw;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.cf.le.ra;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yu extends ra {
    private static Boolean ksc;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final vt f13512tc;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yu(android.content.Context r1, com.bytedance.sdk.openadsdk.core.model.vpp r2, boolean r3, com.bytedance.sdk.openadsdk.core.cf.le.ouw r4, android.view.ViewGroup r5, float r6, float r7, boolean r8, java.lang.String r9) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 1
            if (r2 == 0) goto L1e
            int r3 = r2.lna
            if (r3 == r1) goto L18
            r4 = 7
            if (r3 == r4) goto L12
            r4 = 8
            if (r3 == r4) goto L12
            goto L1e
        L12:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.lh r3 = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.lh
            r3.<init>(r2)
            goto L1f
        L18:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.ouw r3 = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.ouw
            r3.<init>(r2, r4)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0.f13512tc = r3
            r0.vpp = r9
            org.json.JSONObject r2 = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(r6, r7, r8, r2, r9)
            r0.ex = r2
            if (r2 == 0) goto Lba
            java.lang.String r4 = "xSize"
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch: java.lang.Exception -> Lba
            if (r2 == 0) goto L7c
            java.lang.String r4 = "imageModeRatio"
            com.bytedance.sdk.openadsdk.core.model.vpp r5 = r0.fkw     // Catch: java.lang.Exception -> Lba
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L3c
            goto L78
        L3c:
            int r5 = r5.ucs     // Catch: java.lang.Exception -> Lba
            r7 = 3
            if (r5 != r7) goto L45
            r6 = 1072986849(0x3ff47ae1, float:1.91)
            goto L78
        L45:
            r7 = 5
            if (r5 != r7) goto L4c
            r6 = 1071896330(0x3fe3d70a, float:1.78)
            goto L78
        L4c:
            r7 = 15
            if (r5 == r7) goto L76
            r7 = 173(0xad, float:2.42E-43)
            if (r5 != r7) goto L55
            goto L76
        L55:
            r7 = 33
            if (r5 == r7) goto L78
            r7 = 50
            if (r5 != r7) goto L5e
            goto L78
        L5e:
            r7 = 1010(0x3f2, float:1.415E-42)
            if (r5 != r7) goto L66
            r6 = 1067030938(0x3f99999a, float:1.2)
            goto L78
        L66:
            r7 = 1011(0x3f3, float:1.417E-42)
            if (r5 != r7) goto L6e
            r6 = 1087163597(0x40cccccd, float:6.4)
            goto L78
        L6e:
            r7 = 1012(0x3f4, float:1.418E-42)
            if (r5 != r7) goto L78
            r6 = 1078774989(0x404ccccd, float:3.2)
            goto L78
        L76:
            r6 = 1058013184(0x3f100000, float:0.5625)
        L78:
            double r5 = (double) r6     // Catch: java.lang.Exception -> Lba
            r2.put(r4, r5)     // Catch: java.lang.Exception -> Lba
        L7c:
            org.json.JSONObject r2 = r0.ex     // Catch: java.lang.Exception -> Lba
            java.lang.String r4 = "xAdInfo"
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch: java.lang.Exception -> Lba
            if (r2 == 0) goto Lb3
            java.lang.String r4 = "isVideoImageMode"
            com.bytedance.sdk.openadsdk.core.model.vpp r5 = r0.fkw     // Catch: java.lang.Exception -> Lba
            boolean r5 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r5)     // Catch: java.lang.Exception -> Lba
            r2.put(r4, r5)     // Catch: java.lang.Exception -> Lba
            java.lang.String r4 = "feed_draw_purePlayable"
            com.bytedance.sdk.openadsdk.core.model.vpp r5 = r0.fkw     // Catch: java.lang.Exception -> Lba
            if (r5 == 0) goto La6
            boolean r5 = r0.ryl()     // Catch: java.lang.Exception -> Lba
            if (r5 == 0) goto La6
            com.bytedance.sdk.openadsdk.core.model.vpp r5 = r0.fkw     // Catch: java.lang.Exception -> Lba
            boolean r5 = com.bytedance.sdk.openadsdk.core.model.od.lh(r5)     // Catch: java.lang.Exception -> Lba
            if (r5 == 0) goto La6
            goto La7
        La6:
            r1 = 0
        La7:
            r2.put(r4, r1)     // Catch: java.lang.Exception -> Lba
            java.lang.String r1 = "isFeedDraw"
            boolean r4 = r0.ryl()     // Catch: java.lang.Exception -> Lba
            r2.put(r1, r4)     // Catch: java.lang.Exception -> Lba
        Lb3:
            if (r3 == 0) goto Lba
            org.json.JSONObject r1 = r0.ex     // Catch: java.lang.Exception -> Lba
            r3.ouw(r1)     // Catch: java.lang.Exception -> Lba
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.<init>(android.content.Context, com.bytedance.sdk.openadsdk.core.model.vpp, boolean, com.bytedance.sdk.openadsdk.core.cf.le.ouw, android.view.ViewGroup, float, float, boolean, java.lang.String):void");
    }

    public static boolean ouw(String str) {
        if (ksc == null) {
            ksc = Boolean.valueOf(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("express_backup_type", 0) == 1);
        }
        return ksc.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || ex.vt(str));
    }

    private boolean ryl() {
        vpp vppVar = this.fkw;
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.lna;
        boolean z10 = i10 == 7 || i10 == 8;
        int i11 = vppVar.fvf;
        return z10 && (i11 == 43 || i11 == 44);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.ra("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject ouw() {
        vt vtVar = this.f13512tc;
        if (vtVar != null) {
            try {
                return PangleVideoBridge.jsonObjectInit(vtVar.ouw());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra
    public final JSONObject ouw(pd pdVar) {
        vt vtVar = this.f13512tc;
        if (vtVar != null) {
            return vtVar.vt();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return 1;
    }
}
