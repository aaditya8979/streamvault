package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends ra<Integer> {
    public le(List<com.bytedance.adsdk.vt.ra.ouw<Integer>> list) {
        super(list);
    }

    private int vt(com.bytedance.adsdk.vt.ra.ouw<Integer> ouwVar, float f10) {
        Integer num = ouwVar.vt;
        if (num == null || ouwVar.f12187lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu != null) {
            ouwVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        if (ouwVar.f12183cf == 784923401) {
            ouwVar.f12183cf = num.intValue();
        }
        int i10 = ouwVar.f12183cf;
        if (ouwVar.ryl == 784923401) {
            ouwVar.ryl = ouwVar.f12187lh.intValue();
        }
        return com.bytedance.adsdk.vt.le.ra.ouw(i10, ouwVar.ryl, f10);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return Integer.valueOf(vt(ouwVar, f10));
    }

    public final int pno() {
        return vt(vt(), yu());
    }
}
