package com.bytedance.sdk.component.vt.ouw.vt;

/* JADX INFO: loaded from: classes4.dex */
final class fkw {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public fkw f12829le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12830lh;
    public final byte[] ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public fkw f12831ra;
    public int vt;
    public boolean yu;

    public fkw() {
        this.ouw = new byte[8192];
        this.fkw = true;
        this.yu = false;
    }

    private fkw(byte[] bArr, int i10, int i11) {
        this.ouw = bArr;
        this.vt = i10;
        this.f12830lh = i11;
        this.yu = true;
        this.fkw = false;
    }

    public final fkw ouw() {
        this.yu = true;
        return new fkw(this.ouw, this.vt, this.f12830lh);
    }

    public final fkw ouw(fkw fkwVar) {
        fkwVar.f12831ra = this;
        fkwVar.f12829le = this.f12829le;
        this.f12829le.f12831ra = fkwVar;
        this.f12829le = fkwVar;
        return fkwVar;
    }

    public final fkw vt() {
        fkw fkwVar = this.f12829le;
        fkw fkwVar2 = fkwVar != this ? fkwVar : null;
        fkw fkwVar3 = this.f12831ra;
        if (fkwVar3 != null) {
            fkwVar3.f12829le = fkwVar;
        }
        fkw fkwVar4 = this.f12829le;
        if (fkwVar4 != null) {
            fkwVar4.f12831ra = fkwVar3;
        }
        this.f12829le = null;
        this.f12831ra = null;
        return fkwVar2;
    }
}
