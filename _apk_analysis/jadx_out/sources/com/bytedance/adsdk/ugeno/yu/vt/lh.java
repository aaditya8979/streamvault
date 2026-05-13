package com.bytedance.adsdk.ugeno.yu.vt;

import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.yu.le;

/* JADX INFO: loaded from: classes8.dex */
public final class lh extends ouw {
    private ko bly;

    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        ko koVarTh = this.f11904lh.th();
        this.bly = koVarTh;
        if (koVarTh != null) {
            koVarTh.ouw(this.f11904lh, this.vt);
        }
    }
}
