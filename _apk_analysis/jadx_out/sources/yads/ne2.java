package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.ne2;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class ne2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f92840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fm1 f92842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f92843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f92844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f92845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f92846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f92847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f92848j;

    static {
        new wq() { // from class: bt.u6
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ne2.a(bundle);
            }
        };
    }

    public ne2(Object obj, int i10, fm1 fm1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f92840b = obj;
        this.f92841c = i10;
        this.f92842d = fm1Var;
        this.f92843e = obj2;
        this.f92844f = i11;
        this.f92845g = j10;
        this.f92846h = j11;
        this.f92847i = i12;
        this.f92848j = i13;
    }

    public static ne2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        return new ne2(null, i10, bundle2 == null ? null : (fm1) fm1.f89623h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ne2.class != obj.getClass()) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return this.f92841c == ne2Var.f92841c && this.f92844f == ne2Var.f92844f && this.f92845g == ne2Var.f92845g && this.f92846h == ne2Var.f92846h && this.f92847i == ne2Var.f92847i && this.f92848j == ne2Var.f92848j && l92.a(this.f92840b, ne2Var.f92840b) && l92.a(this.f92843e, ne2Var.f92843e) && l92.a(this.f92842d, ne2Var.f92842d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f92840b, Integer.valueOf(this.f92841c), this.f92842d, this.f92843e, Integer.valueOf(this.f92844f), Long.valueOf(this.f92845g), Long.valueOf(this.f92846h), Integer.valueOf(this.f92847i), Integer.valueOf(this.f92848j)});
    }
}
