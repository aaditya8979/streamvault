package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class zin {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String[] f14393lh = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int ouw = Integer.MIN_VALUE;
    public static int vt = Integer.MIN_VALUE;

    public static String ouw() {
        if (ouw == Integer.MIN_VALUE) {
            ouw = com.bytedance.sdk.openadsdk.core.bly.fkw();
        }
        if (ouw < 0) {
            ouw = 0;
        }
        String[] strArr = f14393lh;
        try {
            return strArr[ouw % strArr.length];
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ko.lh("NetUtils", "index out of bounds");
            return strArr[0];
        }
    }

    public static void ouw(com.bytedance.sdk.component.bly.le leVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        leVar.ouw(str, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.zin.ouw + 1;
        com.bytedance.sdk.openadsdk.utils.zin.ouw = r2;
        com.bytedance.sdk.openadsdk.core.bly.ouw(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void ouw(java.lang.String r6) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.utils.zin> r0 = com.bytedance.sdk.openadsdk.utils.zin.class
            monitor-enter(r0)
            if (r6 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            r1 = 0
            r2 = r1
        L9:
            java.lang.String[] r3 = com.bytedance.sdk.openadsdk.utils.zin.f14393lh     // Catch: java.lang.Throwable -> L23
            int r4 = r3.length     // Catch: java.lang.Throwable -> L23
            if (r2 >= r4) goto L2d
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L23
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L20
            int r2 = com.bytedance.sdk.openadsdk.utils.zin.ouw     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + 1
            com.bytedance.sdk.openadsdk.utils.zin.ouw = r2     // Catch: java.lang.Throwable -> L23
            com.bytedance.sdk.openadsdk.core.bly.ouw(r2)     // Catch: java.lang.Throwable -> L23
            goto L2d
        L20:
            int r2 = r2 + 1
            goto L9
        L23:
            r2 = move-exception
            java.lang.String r3 = "NetUtils"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.component.utils.ko.fkw(r3, r2)     // Catch: java.lang.Throwable -> L8b
        L2d:
            java.lang.String r2 = "/api/ad/union/sdk/settings/"
            boolean r2 = r6.contains(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L3d
            java.lang.String r2 = "/api/ad/union/sdk/strategies/adn"
            boolean r6 = r6.contains(r2)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L89
        L3d:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L8b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r2) goto L49
            int r6 = com.bytedance.sdk.openadsdk.core.bly.le()     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.utils.zin.vt = r6     // Catch: java.lang.Throwable -> L8b
        L49:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L8b
            int r6 = r6 + 1
            com.bytedance.sdk.openadsdk.utils.zin.vt = r6     // Catch: java.lang.Throwable -> L8b
            r2 = 3
            if (r6 < r2) goto L84
            com.bytedance.sdk.openadsdk.core.settings.cf r6 = com.bytedance.sdk.openadsdk.core.settings.cf.vt()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.vm()     // Catch: java.lang.Throwable -> L8b
            int r2 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.core.settings.cf r3 = com.bytedance.sdk.openadsdk.core.settings.cf.vt()     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.core.settings.pno r3 = r3.pno     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.core.settings.fkw$ouw r3 = r3.ouw()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "settings_url"
            java.lang.String r5 = ""
            r3.ouw(r4, r5)     // Catch: java.lang.Throwable -> L8b
            r3.ouw()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = ""
            com.bytedance.sdk.openadsdk.core.settings.cf.vpp(r3)     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.utils.zin.vt = r1     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.rn.lh.ouw()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "clear_domain"
            com.bytedance.sdk.openadsdk.utils.zin$1 r4 = new com.bytedance.sdk.openadsdk.utils.zin$1     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.rn.lh.ouw(r3, r1, r4)     // Catch: java.lang.Throwable -> L8b
        L84:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L8b
            com.bytedance.sdk.openadsdk.core.bly.vt(r6)     // Catch: java.lang.Throwable -> L8b
        L89:
            monitor-exit(r0)
            return
        L8b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.zin.ouw(java.lang.String):void");
    }

    public static synchronized void vt() {
        if (vt == 0) {
            return;
        }
        vt = 0;
        com.bytedance.sdk.openadsdk.core.bly.vt(0);
    }
}
