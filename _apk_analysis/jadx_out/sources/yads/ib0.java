package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class ib0 implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f90728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pe[] f90732g;

    public ib0() {
        this(0);
    }

    public ib0(int i10) {
        this.f90726a = true;
        this.f90727b = 65536;
        this.f90731f = 0;
        this.f90732g = new pe[100];
        this.f90728c = null;
    }

    public final synchronized pe a() {
        pe peVar;
        int i10 = this.f90730e + 1;
        this.f90730e = i10;
        int i11 = this.f90731f;
        if (i11 > 0) {
            pe[] peVarArr = this.f90732g;
            int i12 = i11 - 1;
            this.f90731f = i12;
            peVar = peVarArr[i12];
            peVar.getClass();
            this.f90732g[this.f90731f] = null;
        } else {
            pe peVar2 = new pe(0, new byte[this.f90727b]);
            pe[] peVarArr2 = this.f90732g;
            if (i10 > peVarArr2.length) {
                this.f90732g = (pe[]) Arrays.copyOf(peVarArr2, peVarArr2.length * 2);
            }
            peVar = peVar2;
        }
        return peVar;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f90729d;
        this.f90729d = i10;
        if (z10) {
            c();
        }
    }

    public final int b() {
        return this.f90727b;
    }

    public final synchronized void c() {
        int i10 = this.f90729d;
        int i11 = this.f90727b;
        int i12 = ib3.f90737a;
        int i13 = (((i10 + i11) - 1) / i11) - this.f90730e;
        int i14 = 0;
        int iMax = Math.max(0, i13);
        int i15 = this.f90731f;
        if (iMax >= i15) {
            return;
        }
        if (this.f90728c != null) {
            int i16 = i15 - 1;
            while (i14 <= i16) {
                pe peVar = this.f90732g[i14];
                peVar.getClass();
                if (peVar.f93560a == this.f90728c) {
                    i14++;
                } else {
                    pe peVar2 = this.f90732g[i16];
                    peVar2.getClass();
                    if (peVar2.f93560a != this.f90728c) {
                        i16--;
                    } else {
                        pe[] peVarArr = this.f90732g;
                        peVarArr[i14] = peVar2;
                        peVarArr[i16] = peVar;
                        i16--;
                        i14++;
                    }
                }
            }
            iMax = Math.max(iMax, i14);
            if (iMax >= this.f90731f) {
                return;
            }
        }
        Arrays.fill(this.f90732g, iMax, this.f90731f, (Object) null);
        this.f90731f = iMax;
    }
}
