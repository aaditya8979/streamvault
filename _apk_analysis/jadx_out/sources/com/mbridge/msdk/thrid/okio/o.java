package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Segment.java */
/* JADX INFO: loaded from: classes2.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f40875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f40876g;

    public o() {
        this.f40870a = new byte[8192];
        this.f40874e = true;
        this.f40873d = false;
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f40870a = bArr;
        this.f40871b = i10;
        this.f40872c = i11;
        this.f40873d = z10;
        this.f40874e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 <= 0 || i10 > this.f40872c - this.f40871b) {
            throw new IllegalArgumentException();
        }
        if (i10 >= 1024) {
            oVarA = c();
        } else {
            oVarA = p.a();
            System.arraycopy(this.f40870a, this.f40871b, oVarA.f40870a, 0, i10);
        }
        oVarA.f40872c = oVarA.f40871b + i10;
        this.f40871b += i10;
        this.f40876g.a(oVarA);
        return oVarA;
    }

    public final o a(o oVar) {
        oVar.f40876g = this;
        oVar.f40875f = this.f40875f;
        this.f40875f.f40876g = oVar;
        this.f40875f = oVar;
        return oVar;
    }

    public final void a() {
        o oVar = this.f40876g;
        if (oVar == this) {
            throw new IllegalStateException();
        }
        if (oVar.f40874e) {
            int i10 = this.f40872c - this.f40871b;
            if (i10 > (8192 - oVar.f40872c) + (oVar.f40873d ? 0 : oVar.f40871b)) {
                return;
            }
            a(oVar, i10);
            b();
            p.a(this);
        }
    }

    public final void a(o oVar, int i10) {
        if (!oVar.f40874e) {
            throw new IllegalArgumentException();
        }
        int i11 = oVar.f40872c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (oVar.f40873d) {
                throw new IllegalArgumentException();
            }
            int i13 = oVar.f40871b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = oVar.f40870a;
            System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
            oVar.f40872c -= oVar.f40871b;
            oVar.f40871b = 0;
        }
        System.arraycopy(this.f40870a, this.f40871b, oVar.f40870a, oVar.f40872c, i10);
        oVar.f40872c += i10;
        this.f40871b += i10;
    }

    @Nullable
    public final o b() {
        o oVar = this.f40875f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f40876g;
        oVar3.f40875f = oVar;
        this.f40875f.f40876g = oVar3;
        this.f40875f = null;
        this.f40876g = null;
        return oVar2;
    }

    public final o c() {
        this.f40873d = true;
        return new o(this.f40870a, this.f40871b, this.f40872c, true, false);
    }
}
