package t4;

import a6.k0;
import androidx.core.view.InputDeviceCompat;
import t4.h0;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f84647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84648b = new a6.t(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84652f;

    public a0(z zVar) {
        this.f84647a = zVar;
    }

    @Override // t4.h0
    public void a(a6.t tVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iC = z10 ? tVar.c() + tVar.y() : -1;
        if (this.f84652f) {
            if (!z10) {
                return;
            }
            this.f84652f = false;
            tVar.L(iC);
            this.f84650d = 0;
        }
        while (tVar.a() > 0) {
            int i11 = this.f84650d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iY = tVar.y();
                    tVar.L(tVar.c() - 1);
                    if (iY == 255) {
                        this.f84652f = true;
                        return;
                    }
                }
                int iMin = Math.min(tVar.a(), 3 - this.f84650d);
                tVar.h(this.f84648b.f3620a, this.f84650d, iMin);
                int i12 = this.f84650d + iMin;
                this.f84650d = i12;
                if (i12 == 3) {
                    this.f84648b.H(3);
                    this.f84648b.M(1);
                    int iY2 = this.f84648b.y();
                    int iY3 = this.f84648b.y();
                    this.f84651e = (iY2 & 128) != 0;
                    this.f84649c = (((iY2 & 15) << 8) | iY3) + 3;
                    int iB = this.f84648b.b();
                    int i13 = this.f84649c;
                    if (iB < i13) {
                        a6.t tVar2 = this.f84648b;
                        byte[] bArr = tVar2.f3620a;
                        tVar2.H(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f84648b.f3620a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(tVar.a(), this.f84649c - this.f84650d);
                tVar.h(this.f84648b.f3620a, this.f84650d, iMin2);
                int i14 = this.f84650d + iMin2;
                this.f84650d = i14;
                int i15 = this.f84649c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f84651e) {
                        this.f84648b.H(i15);
                    } else {
                        if (k0.t(this.f84648b.f3620a, 0, i15, -1) != 0) {
                            this.f84652f = true;
                            return;
                        }
                        this.f84648b.H(this.f84649c - 4);
                    }
                    this.f84647a.a(this.f84648b);
                    this.f84650d = 0;
                }
            }
        }
    }

    @Override // t4.h0
    public void b(a6.g0 g0Var, k4.i iVar, h0.d dVar) {
        this.f84647a.b(g0Var, iVar, dVar);
        this.f84652f = true;
    }

    @Override // t4.h0
    public void seek() {
        this.f84652f = true;
    }
}
