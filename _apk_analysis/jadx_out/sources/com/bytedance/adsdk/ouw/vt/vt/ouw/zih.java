package com.bytedance.adsdk.ouw.vt.vt.ouw;

/* JADX INFO: loaded from: classes12.dex */
public abstract class zih implements com.bytedance.adsdk.ouw.vt.vt.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ouw.vt.yu.lh f11573lh;
    public com.bytedance.adsdk.ouw.vt.vt.ouw ouw;
    public com.bytedance.adsdk.ouw.vt.vt.ouw vt;

    public zih(com.bytedance.adsdk.ouw.vt.yu.lh lhVar) {
        this.f11573lh = lhVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.OPERATOR_RESULT;
    }

    public final void ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public String toString() {
        return vt();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.vt() + this.f11573lh.f11586rn + this.vt.vt();
    }

    public final void vt(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.vt = ouwVar;
    }
}
