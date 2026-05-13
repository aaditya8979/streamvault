package com.bytedance.sdk.component.fkw.fkw;

/* JADX INFO: loaded from: classes12.dex */
public final class vt implements bly {
    private byte[] ouw;
    private com.bytedance.sdk.component.fkw.le vt;

    public vt(byte[] bArr, com.bytedance.sdk.component.fkw.le leVar) {
        this.ouw = bArr;
        this.vt = leVar;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "image_type";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        bly fkwVar;
        int i10 = lhVar.tlj;
        byte[] bArr = this.ouw;
        lhVar.vpp = bArr.length;
        if (i10 == 2) {
            fkwVar = com.bytedance.sdk.component.utils.le.ouw(bArr) ? new fkw(this.ouw, this.vt) : this.vt == null ? new cf() : new pno(1001, "not image format", null);
        } else if (i10 != 3) {
            boolean zVt = com.bytedance.sdk.component.utils.le.vt(bArr);
            fkwVar = (!zVt && com.bytedance.sdk.component.utils.le.ouw(this.ouw)) ? new fkw(this.ouw, this.vt) : new mwh(this.ouw, this.vt, zVt);
        } else {
            fkwVar = new mwh(bArr, this.vt, com.bytedance.sdk.component.utils.le.vt(bArr));
        }
        lhVar.ouw(fkwVar);
    }
}
