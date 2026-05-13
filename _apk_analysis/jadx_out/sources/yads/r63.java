package yads;

import android.net.Uri;
import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import yads.r63;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class r63 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f94295s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f94296t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final fm1 f94297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final wq f94298v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f94300c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f94302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f94303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f94304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f94305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f94306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f94307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f94308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yl1 f94309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f94310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f94311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f94312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f94313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f94314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f94315r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f94299b = f94295s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fm1 f94301d = f94297u;

    static {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f94878f;
        cm1 cm1Var = cm1.f88503d;
        Uri uri = Uri.EMPTY;
        if (vl1Var.f96127b != null && vl1Var.f96126a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            am1Var = new am1(uri, null, vl1Var.f96126a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        f94297u = new fm1("com.monetization.ads.exoplayer2.Timeline", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
        f94298v = new wq() { // from class: bt.d9
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return r63.a(bundle);
            }
        };
    }

    public static r63 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        fm1 fm1Var = bundle2 != null ? (fm1) fm1.f89623h.fromBundle(bundle2) : null;
        long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        yl1 yl1Var = bundle3 != null ? (yl1) yl1.f97219h.fromBundle(bundle3) : null;
        boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i10 = bundle.getInt(Integer.toString(11, 36), 0);
        int i11 = bundle.getInt(Integer.toString(12, 36), 0);
        long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
        r63 r63Var = new r63();
        r63Var.a(f94296t, fm1Var, null, j10, j11, j12, z10, z11, yl1Var, j13, j14, i10, i11, j15);
        r63Var.f94310m = z12;
        return r63Var;
    }

    public final r63 a(Object obj, fm1 fm1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, yl1 yl1Var, long j13, long j14, int i10, int i11, long j15) {
        am1 am1Var;
        this.f94299b = obj;
        this.f94301d = fm1Var != null ? fm1Var : f94297u;
        this.f94300c = (fm1Var == null || (am1Var = fm1Var.f89625c) == null) ? null : am1Var.f97659g;
        this.f94302e = obj2;
        this.f94303f = j10;
        this.f94304g = j11;
        this.f94305h = j12;
        this.f94306i = z10;
        this.f94307j = z11;
        this.f94308k = yl1Var != null;
        this.f94309l = yl1Var;
        this.f94311n = j13;
        this.f94312o = j14;
        this.f94313p = i10;
        this.f94314q = i11;
        this.f94315r = j15;
        this.f94310m = false;
        return this;
    }

    public final boolean a() {
        boolean z10 = this.f94308k;
        yl1 yl1Var = this.f94309l;
        if (z10 == (yl1Var != null)) {
            return yl1Var != null;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r63.class.equals(obj.getClass())) {
            return false;
        }
        r63 r63Var = (r63) obj;
        return ib3.a(this.f94299b, r63Var.f94299b) && ib3.a(this.f94301d, r63Var.f94301d) && ib3.a(this.f94302e, r63Var.f94302e) && ib3.a(this.f94309l, r63Var.f94309l) && this.f94303f == r63Var.f94303f && this.f94304g == r63Var.f94304g && this.f94305h == r63Var.f94305h && this.f94306i == r63Var.f94306i && this.f94307j == r63Var.f94307j && this.f94310m == r63Var.f94310m && this.f94311n == r63Var.f94311n && this.f94312o == r63Var.f94312o && this.f94313p == r63Var.f94313p && this.f94314q == r63Var.f94314q && this.f94315r == r63Var.f94315r;
    }

    public final int hashCode() {
        int iHashCode = (this.f94301d.hashCode() + ((this.f94299b.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f94302e;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yl1 yl1Var = this.f94309l;
        int iHashCode3 = (iHashCode2 + (yl1Var != null ? yl1Var.hashCode() : 0)) * 31;
        long j10 = this.f94303f;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f94304g;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f94305h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f94306i ? 1 : 0)) * 31) + (this.f94307j ? 1 : 0)) * 31) + (this.f94310m ? 1 : 0)) * 31;
        long j13 = this.f94311n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f94312o;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f94313p) * 31) + this.f94314q) * 31;
        long j15 = this.f94315r;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
