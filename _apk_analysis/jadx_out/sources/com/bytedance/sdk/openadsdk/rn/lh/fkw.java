package com.bytedance.sdk.openadsdk.rn.lh;

/* JADX INFO: loaded from: classes12.dex */
public class fkw implements lh {
    private static volatile fkw ouw;

    private fkw() {
    }

    public static fkw ouw() {
        if (ouw == null) {
            synchronized (fkw.class) {
                if (ouw == null) {
                    ouw = new fkw();
                }
            }
        }
        return ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.rn.vt vtVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.rn.vt vtVar, boolean z10) {
    }
}
