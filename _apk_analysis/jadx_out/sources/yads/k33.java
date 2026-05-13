package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.k33;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class k33 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f91473e = new wq() { // from class: bt.t3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return k33.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f91475d;

    public k33(int i10) {
        ni.a("maxStars must be a positive integer", i10 > 0);
        this.f91474c = i10;
        this.f91475d = -1.0f;
    }

    public k33(int i10, float f10) {
        ni.a("maxStars must be a positive integer", i10 > 0);
        ni.a("starRating is out of range [0, maxStars]", f10 >= 0.0f && f10 <= ((float) i10));
        this.f91474c = i10;
        this.f91475d = f10;
    }

    public static k33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new k33(i10) : new k33(i10, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k33)) {
            return false;
        }
        k33 k33Var = (k33) obj;
        return this.f91474c == k33Var.f91474c && this.f91475d == k33Var.f91475d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f91474c), Float.valueOf(this.f91475d)});
    }
}
