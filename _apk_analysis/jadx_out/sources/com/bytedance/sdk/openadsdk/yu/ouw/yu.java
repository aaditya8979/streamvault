package com.bytedance.sdk.openadsdk.yu.ouw;

/* JADX INFO: loaded from: classes3.dex */
final class yu implements com.bytedance.sdk.component.le.ouw.fkw.lh {
    private final com.bytedance.sdk.component.ra.vt.vt ouw;

    public yu() {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        this.ouw = vtVarVt;
        vtVarVt.f12777ra = 7;
        vtVarVt.f12776le = "track_url";
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final com.bytedance.sdk.component.le.ouw.fkw.yu ouw() {
        return new le(this.ouw.ouw());
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final void ouw(String str) {
        this.ouw.ouw(str);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final void ouw(String str, String str2) {
        this.ouw.vt(str, str2);
    }
}
