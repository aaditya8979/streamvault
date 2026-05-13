package g5;

import e5.h0;
import g5.e;
import k4.u;

/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f62008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0[] f62009b;

    public c(int[] iArr, h0[] h0VarArr) {
        this.f62008a = iArr;
        this.f62009b = h0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f62009b.length];
        int i10 = 0;
        while (true) {
            h0[] h0VarArr = this.f62009b;
            if (i10 >= h0VarArr.length) {
                return iArr;
            }
            h0 h0Var = h0VarArr[i10];
            if (h0Var != null) {
                iArr[i10] = h0Var.A();
            }
            i10++;
        }
    }

    public void b(long j10) {
        for (h0 h0Var : this.f62009b) {
            if (h0Var != null) {
                h0Var.T(j10);
            }
        }
    }

    @Override // g5.e.b
    public u track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f62008a;
            if (i12 >= iArr.length) {
                a6.m.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new k4.f();
            }
            if (i11 == iArr[i12]) {
                return this.f62009b[i12];
            }
            i12++;
        }
    }
}
