package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.n83;
import yads.xq;

/* JADX INFO: loaded from: classes4.dex */
public final class n83 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f92778g = new wq() { // from class: bt.t6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return n83.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h73 f92780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f92782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f92783f;

    public n83(h73 h73Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = h73Var.f90268b;
        this.f92779b = i10;
        boolean z11 = false;
        ni.a(i10 == iArr.length && i10 == zArr.length);
        this.f92780c = h73Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f92781d = z11;
        this.f92782e = (int[]) iArr.clone();
        this.f92783f = (boolean[]) zArr.clone();
    }

    public static n83 a(Bundle bundle) {
        wq wqVar = h73.f90267g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        h73 h73Var = (h73) wqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[h73Var.f90268b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[h73Var.f90268b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new n83(h73Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }

    public final int a() {
        return this.f92780c.f90270d;
    }

    public final boolean b() {
        for (boolean z10 : this.f92783f) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n83.class != obj.getClass()) {
            return false;
        }
        n83 n83Var = (n83) obj;
        return this.f92781d == n83Var.f92781d && this.f92780c.equals(n83Var.f92780c) && Arrays.equals(this.f92782e, n83Var.f92782e) && Arrays.equals(this.f92783f, n83Var.f92783f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f92783f) + ((Arrays.hashCode(this.f92782e) + (((this.f92780c.hashCode() * 31) + (this.f92781d ? 1 : 0)) * 31)) * 31);
    }
}
