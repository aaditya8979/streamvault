package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import yads.fm1;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public final class fm1 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f89623h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am1 f89625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl1 f89626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm1 f89627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ul1 f89628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cm1 f89629g;

    static {
        p51.g();
        Collections.emptyList();
        sm2 sm2Var = sm2.f94878f;
        cm1 cm1Var = cm1.f88503d;
        jm1 jm1Var = jm1.H;
        f89623h = new wq() { // from class: bt.z1
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return fm1.a(bundle);
            }
        };
    }

    public fm1(String str, ul1 ul1Var, am1 am1Var, yl1 yl1Var, jm1 jm1Var, cm1 cm1Var) {
        this.f89624b = str;
        this.f89625c = am1Var;
        this.f89626d = yl1Var;
        this.f89627e = jm1Var;
        this.f89628f = ul1Var;
        this.f89629g = cm1Var;
    }

    public static fm1 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        yl1 yl1Var = bundle2 == null ? yl1.f97218g : (yl1) yl1.f97219h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        jm1 jm1Var = bundle3 == null ? jm1.H : (jm1) jm1.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        ul1 ul1Var = bundle4 == null ? ul1.f95713h : (ul1) tl1.f95259g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new fm1(string, ul1Var, null, yl1Var, jm1Var, bundle5 == null ? cm1.f88503d : (cm1) cm1.f88504e.fromBundle(bundle5));
    }

    public static fm1 a(String str) {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f94878f;
        cm1 cm1Var = cm1.f88503d;
        Uri uri = str == null ? null : Uri.parse(str);
        if (vl1Var.f96127b != null && vl1Var.f96126a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            am1Var = new am1(uri, null, vl1Var.f96126a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        return new fm1("", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return ib3.a(this.f89624b, fm1Var.f89624b) && this.f89628f.equals(fm1Var.f89628f) && ib3.a(this.f89625c, fm1Var.f89625c) && ib3.a(this.f89626d, fm1Var.f89626d) && ib3.a(this.f89627e, fm1Var.f89627e) && ib3.a(this.f89629g, fm1Var.f89629g);
    }

    public final int hashCode() {
        int iHashCode = this.f89624b.hashCode() * 31;
        am1 am1Var = this.f89625c;
        return this.f89629g.hashCode() + ((this.f89627e.hashCode() + ((this.f89628f.hashCode() + ((this.f89626d.hashCode() + ((iHashCode + (am1Var != null ? am1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
