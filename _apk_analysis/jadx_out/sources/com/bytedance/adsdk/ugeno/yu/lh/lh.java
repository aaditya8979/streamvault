package com.bytedance.adsdk.ugeno.yu.lh;

import com.bytedance.adsdk.ugeno.yu.le;

/* JADX INFO: loaded from: classes12.dex */
public final class lh extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.f11904lh;
        if (lhVar == null || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(lhVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarLe = lhVarVt.le("SwiperView");
        if (lhVarLe instanceof com.bytedance.adsdk.ugeno.vt) {
            ((com.bytedance.adsdk.ugeno.le.vt) ((com.bytedance.adsdk.ugeno.vt) lhVarLe).fkw).cf(((com.bytedance.adsdk.ugeno.le.vt) r0.fkw).getCurrentItem() - 1);
        }
    }
}
