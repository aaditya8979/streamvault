package yads;

import android.os.Bundle;
import yads.ql2;
import yads.xq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ql2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wq f94061b = new wq() { // from class: bt.w8
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return ql2.a(bundle);
        }
    };

    public static ql2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i10 == 0) {
            return (ql2) v01.f95895e.fromBundle(bundle);
        }
        if (i10 == 1) {
            return (ql2) ec2.f89207d.fromBundle(bundle);
        }
        if (i10 == 2) {
            return (ql2) k33.f91473e.fromBundle(bundle);
        }
        if (i10 == 3) {
            return (ql2) e63.f89128e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(mg2.a("Unknown RatingType: ", i10));
    }
}
