package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import yads.ig0;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class ig0 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90834d;

    static {
        new wq() { // from class: bt.d3
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ig0.a(bundle);
            }
        };
    }

    public ig0(int i10, int i11, int i12) {
        this.f90832b = i10;
        this.f90833c = i11;
        this.f90834d = i12;
    }

    public static ig0 a(Bundle bundle) {
        return new ig0(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return this.f90832b == ig0Var.f90832b && this.f90833c == ig0Var.f90833c && this.f90834d == ig0Var.f90834d;
    }

    public final int hashCode() {
        return ((((this.f90832b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f90833c) * 31) + this.f90834d;
    }
}
