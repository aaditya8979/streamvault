package yads;

import android.net.Uri;
import android.os.Bundle;
import yads.cm1;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class cm1 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cm1 f88503d = new cm1(new bm1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f88504e = new wq() { // from class: bt.q0
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return cm1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f88505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88506c;

    public cm1(bm1 bm1Var) {
        this.f88505b = bm1Var.f88074a;
        this.f88506c = bm1Var.f88075b;
    }

    public static cm1 a(Bundle bundle) {
        bm1 bm1Var = new bm1();
        bm1Var.f88074a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        bm1Var.f88075b = bundle.getString(Integer.toString(1, 36));
        bm1Var.f88076c = bundle.getBundle(Integer.toString(2, 36));
        return new cm1(bm1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1)) {
            return false;
        }
        cm1 cm1Var = (cm1) obj;
        return ib3.a(this.f88505b, cm1Var.f88505b) && ib3.a(this.f88506c, cm1Var.f88506c);
    }

    public final int hashCode() {
        Uri uri = this.f88505b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f88506c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
