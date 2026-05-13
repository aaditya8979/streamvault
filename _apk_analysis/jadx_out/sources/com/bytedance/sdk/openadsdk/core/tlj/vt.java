package com.bytedance.sdk.openadsdk.core.tlj;

import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {
    public static com.bytedance.sdk.openadsdk.core.tlj.ouw ouw;
    private String vt;

    public static class ouw {
        private static final vt ouw = new vt(0);
    }

    private vt() {
        this.vt = null;
        ouw = new com.bytedance.sdk.openadsdk.core.tlj.ouw();
    }

    public /* synthetic */ vt(byte b10) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String ouw() {
        /*
            com.bytedance.sdk.openadsdk.core.tlj.ouw r0 = com.bytedance.sdk.openadsdk.core.tlj.vt.ouw
            java.lang.String r1 = ""
            if (r0 == 0) goto L1c
            boolean r2 = r0.ouw()
            if (r2 == 0) goto L18
            r0.vt()
            com.pgl.ssdk.ces.out.PglSSManager r0 = r0.ouw
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.getToken()
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L1c
            return r0
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.tlj.vt.ouw():java.lang.String");
    }

    public static Map<String, String> ouw(String str, byte[] bArr) {
        Map<String, String> featureHash;
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        return ouwVar != null ? (!ouwVar.ouw() || (featureHash = ouwVar.ouw.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash : new HashMap();
    }

    public static void ouw(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null) {
            ouwVar.ouw(map);
        }
    }

    public static long vt() {
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null && ouwVar.ouw()) {
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                return pglSSManager.getECForBidding();
            }
        }
        return 0L;
    }
}
