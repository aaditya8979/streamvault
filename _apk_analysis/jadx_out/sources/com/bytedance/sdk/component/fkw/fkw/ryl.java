package com.bytedance.sdk.component.fkw.fkw;

/* JADX INFO: loaded from: classes2.dex */
public final class ryl extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw = lhVar.jqy.ouw(lhVar.f12545tc).ouw(lhVar.f12540lh);
        if (bArrOuw == null) {
            lhVar.ouw(new le());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
        }
    }
}
