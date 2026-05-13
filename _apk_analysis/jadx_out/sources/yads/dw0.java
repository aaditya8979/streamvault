package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes9.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f88998a;

    public dw0(SparseBooleanArray sparseBooleanArray) {
        this.f88998a = sparseBooleanArray;
    }

    public final int a() {
        return this.f88998a.size();
    }

    public final int a(int i10) {
        ni.a(i10, this.f88998a.size());
        return this.f88998a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        if (ib3.f90737a >= 24) {
            return this.f88998a.equals(dw0Var.f88998a);
        }
        if (this.f88998a.size() != dw0Var.f88998a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f88998a.size(); i10++) {
            if (a(i10) != dw0Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (ib3.f90737a >= 24) {
            return this.f88998a.hashCode();
        }
        int size = this.f88998a.size();
        for (int i10 = 0; i10 < this.f88998a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
