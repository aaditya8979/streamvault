package yads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class sw2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw2 f94970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f94971b = new jb2(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f94975f;

    public sw2(rw2 rw2Var) {
        this.f94970a = rw2Var;
    }

    @Override // yads.m93
    public final void a() {
        this.f94975f = true;
    }

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        boolean z10 = (i10 & 1) != 0;
        int iM = z10 ? jb2Var.f91148b + jb2Var.m() : -1;
        if (this.f94975f) {
            if (!z10) {
                return;
            }
            this.f94975f = false;
            jb2Var.e(iM);
            this.f94973d = 0;
        }
        while (true) {
            int i11 = jb2Var.f91149c - jb2Var.f91148b;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f94973d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iM2 = jb2Var.m();
                    jb2Var.e(jb2Var.f91148b - 1);
                    if (iM2 == 255) {
                        this.f94975f = true;
                        return;
                    }
                }
                int iMin = Math.min(jb2Var.f91149c - jb2Var.f91148b, 3 - this.f94973d);
                jb2Var.a(this.f94971b.f91147a, this.f94973d, iMin);
                int i13 = this.f94973d + iMin;
                this.f94973d = i13;
                if (i13 == 3) {
                    this.f94971b.e(0);
                    this.f94971b.d(3);
                    jb2 jb2Var2 = this.f94971b;
                    jb2Var2.e(jb2Var2.f91148b + 1);
                    int iM3 = this.f94971b.m();
                    int iM4 = this.f94971b.m();
                    this.f94974e = (iM3 & 128) != 0;
                    int i14 = (((iM3 & 15) << 8) | iM4) + 3;
                    this.f94972c = i14;
                    byte[] bArr = this.f94971b.f91147a;
                    if (bArr.length < i14) {
                        this.f94971b.a(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i11, this.f94972c - i12);
                jb2Var.a(this.f94971b.f91147a, this.f94973d, iMin2);
                int i15 = this.f94973d + iMin2;
                this.f94973d = i15;
                int i16 = this.f94972c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f94974e) {
                        byte[] bArr2 = this.f94971b.f91147a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = ib3.f90750n[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        int i19 = ib3.f90737a;
                        if (i17 != 0) {
                            this.f94975f = true;
                            return;
                        }
                        this.f94971b.d(this.f94972c - 4);
                    } else {
                        this.f94971b.d(i16);
                    }
                    this.f94971b.e(0);
                    this.f94970a.a(this.f94971b);
                    this.f94973d = 0;
                }
            }
        }
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f94970a.a(y63Var, pq0Var, l93Var);
        this.f94975f = true;
    }
}
