package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0 f97546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f97547b;

    public ze(dw0 dw0Var, SparseArray sparseArray) {
        this.f97546a = dw0Var;
        SparseArray sparseArray2 = new SparseArray(dw0Var.a());
        for (int i10 = 0; i10 < dw0Var.a(); i10++) {
            int iA = dw0Var.a(i10);
            sparseArray2.append(iA, (ye) ni.a((ye) sparseArray.get(iA)));
        }
        this.f97547b = sparseArray2;
    }

    public final boolean a(int i10) {
        return this.f97546a.f88998a.get(i10);
    }
}
