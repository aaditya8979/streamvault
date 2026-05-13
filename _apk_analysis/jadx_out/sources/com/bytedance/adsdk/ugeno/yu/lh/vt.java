package com.bytedance.adsdk.ugeno.yu.lh;

import com.bytedance.adsdk.ugeno.yu.le;
import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes12.dex */
public final class vt extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        if (this.f11904lh == null) {
            return;
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.f11903le.get(C3978d4.i.L), 0);
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f11904lh);
        if (lhVarVt == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarLe = lhVarVt.le("SwiperView");
        if (lhVarLe instanceof com.bytedance.adsdk.ugeno.vt) {
            com.bytedance.adsdk.ugeno.vt vtVar = (com.bytedance.adsdk.ugeno.vt) lhVarLe;
            if (((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).getCurrentItem() != iOuw) {
                ((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).cf(iOuw);
            }
        }
    }
}
