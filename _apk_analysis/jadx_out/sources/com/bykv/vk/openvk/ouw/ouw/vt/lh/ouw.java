package com.bykv.vk.openvk.ouw.ouw.vt.lh;

import com.bykv.vk.openvk.ouw.ouw.vt.lh.lh;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ouw implements lh {
    public lh.ra fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f11290le = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh.ouw f11291lh;
    public lh.fkw ouw;
    private lh.yu pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private lh.InterfaceC0170lh f11292ra;
    public lh.vt vt;
    public lh.le yu;

    public final void ouw() {
        this.ouw = null;
        this.f11291lh = null;
        this.vt = null;
        this.yu = null;
        this.fkw = null;
        this.f11292ra = null;
        this.pno = null;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.fkw fkwVar) {
        this.ouw = fkwVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.le leVar) {
        this.yu = leVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.InterfaceC0170lh interfaceC0170lh) {
        this.f11292ra = interfaceC0170lh;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.ouw ouwVar) {
        this.f11291lh = ouwVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.ra raVar) {
        this.fkw = raVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.vt vtVar) {
        this.vt = vtVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.yu yuVar) {
        this.pno = yuVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(boolean z10) {
        this.f11290le = z10;
    }

    public final boolean ouw(int i10, int i11) {
        try {
            lh.InterfaceC0170lh interfaceC0170lh = this.f11292ra;
            if (interfaceC0170lh == null) {
                return false;
            }
            interfaceC0170lh.ouw(i10, i11);
            return true;
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th2);
            return false;
        }
    }

    public final boolean vt(int i10, int i11) {
        try {
            lh.yu yuVar = this.pno;
            if (yuVar != null) {
                yuVar.ouw(this, i10, i11);
            }
            return false;
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th2);
            return false;
        }
    }
}
