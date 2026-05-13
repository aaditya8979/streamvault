package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.bf0;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class bf0 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f87976e = new wq() { // from class: bt.k
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return bf0.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f87978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87979d;

    public bf0(int i10, int i11, int[] iArr) {
        this.f87977b = i10;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f87978c = iArrCopyOf;
        this.f87979d = i11;
        Arrays.sort(iArrCopyOf);
    }

    public static bf0 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i11 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new bf0(i10, i11, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bf0.class != obj.getClass()) {
            return false;
        }
        bf0 bf0Var = (bf0) obj;
        return this.f87977b == bf0Var.f87977b && Arrays.equals(this.f87978c, bf0Var.f87978c) && this.f87979d == bf0Var.f87979d;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f87978c) + (this.f87977b * 31)) * 31) + this.f87979d;
    }
}
