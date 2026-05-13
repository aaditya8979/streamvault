package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import yads.jm1;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public final class jm1 implements xq {
    public static final jm1 H = new jm1(new im1());
    public static final wq I = new wq() { // from class: bt.r3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return jm1.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f91284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f91285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f91286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f91287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f91288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f91289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f91290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ql2 f91291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ql2 f91292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f91293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f91294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f91295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f91296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f91297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f91298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f91299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f91300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f91301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f91302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f91303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f91304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f91305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f91306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f91307y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f91308z;

    public jm1(im1 im1Var) {
        this.f91284b = im1Var.f90879a;
        this.f91285c = im1Var.f90880b;
        this.f91286d = im1Var.f90881c;
        this.f91287e = im1Var.f90882d;
        this.f91288f = im1Var.f90883e;
        this.f91289g = im1Var.f90884f;
        this.f91290h = im1Var.f90885g;
        this.f91291i = im1Var.f90886h;
        this.f91292j = im1Var.f90887i;
        this.f91293k = im1Var.f90888j;
        this.f91294l = im1Var.f90889k;
        this.f91295m = im1Var.f90890l;
        this.f91296n = im1Var.f90891m;
        this.f91297o = im1Var.f90892n;
        this.f91298p = im1Var.f90893o;
        this.f91299q = im1Var.f90894p;
        Integer num = im1Var.f90895q;
        this.f91300r = num;
        this.f91301s = num;
        this.f91302t = im1Var.f90896r;
        this.f91303u = im1Var.f90897s;
        this.f91304v = im1Var.f90898t;
        this.f91305w = im1Var.f90899u;
        this.f91306x = im1Var.f90900v;
        this.f91307y = im1Var.f90901w;
        this.f91308z = im1Var.f90902x;
        this.A = im1Var.f90903y;
        this.B = im1Var.f90904z;
        this.C = im1Var.A;
        this.D = im1Var.B;
        this.E = im1Var.C;
        this.F = im1Var.D;
        this.G = im1Var.E;
    }

    public static jm1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        im1 im1Var = new im1();
        im1Var.f90879a = bundle.getCharSequence(Integer.toString(0, 36));
        im1Var.f90880b = bundle.getCharSequence(Integer.toString(1, 36));
        im1Var.f90881c = bundle.getCharSequence(Integer.toString(2, 36));
        im1Var.f90882d = bundle.getCharSequence(Integer.toString(3, 36));
        im1Var.f90883e = bundle.getCharSequence(Integer.toString(4, 36));
        im1Var.f90884f = bundle.getCharSequence(Integer.toString(5, 36));
        im1Var.f90885g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        im1Var.f90888j = byteArray != null ? (byte[]) byteArray.clone() : null;
        im1Var.f90889k = numValueOf;
        im1Var.f90890l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        im1Var.f90901w = bundle.getCharSequence(Integer.toString(22, 36));
        im1Var.f90902x = bundle.getCharSequence(Integer.toString(23, 36));
        im1Var.f90903y = bundle.getCharSequence(Integer.toString(24, 36));
        im1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        im1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        im1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        im1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            im1Var.f90886h = (ql2) ql2.f94061b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            im1Var.f90887i = (ql2) ql2.f94061b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            im1Var.f90891m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            im1Var.f90892n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            im1Var.f90893o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            im1Var.f90894p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            im1Var.f90895q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            im1Var.f90896r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            im1Var.f90897s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            im1Var.f90898t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            im1Var.f90899u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            im1Var.f90900v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            im1Var.f90904z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            im1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new jm1(im1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jm1.class != obj.getClass()) {
            return false;
        }
        jm1 jm1Var = (jm1) obj;
        return ib3.a(this.f91284b, jm1Var.f91284b) && ib3.a(this.f91285c, jm1Var.f91285c) && ib3.a(this.f91286d, jm1Var.f91286d) && ib3.a(this.f91287e, jm1Var.f91287e) && ib3.a(this.f91288f, jm1Var.f91288f) && ib3.a(this.f91289g, jm1Var.f91289g) && ib3.a(this.f91290h, jm1Var.f91290h) && ib3.a(this.f91291i, jm1Var.f91291i) && ib3.a(this.f91292j, jm1Var.f91292j) && Arrays.equals(this.f91293k, jm1Var.f91293k) && ib3.a(this.f91294l, jm1Var.f91294l) && ib3.a(this.f91295m, jm1Var.f91295m) && ib3.a(this.f91296n, jm1Var.f91296n) && ib3.a(this.f91297o, jm1Var.f91297o) && ib3.a(this.f91298p, jm1Var.f91298p) && ib3.a(this.f91299q, jm1Var.f91299q) && ib3.a(this.f91301s, jm1Var.f91301s) && ib3.a(this.f91302t, jm1Var.f91302t) && ib3.a(this.f91303u, jm1Var.f91303u) && ib3.a(this.f91304v, jm1Var.f91304v) && ib3.a(this.f91305w, jm1Var.f91305w) && ib3.a(this.f91306x, jm1Var.f91306x) && ib3.a(this.f91307y, jm1Var.f91307y) && ib3.a(this.f91308z, jm1Var.f91308z) && ib3.a(this.A, jm1Var.A) && ib3.a(this.B, jm1Var.B) && ib3.a(this.C, jm1Var.C) && ib3.a(this.D, jm1Var.D) && ib3.a(this.E, jm1Var.E) && ib3.a(this.F, jm1Var.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f91284b, this.f91285c, this.f91286d, this.f91287e, this.f91288f, this.f91289g, this.f91290h, this.f91291i, this.f91292j, Integer.valueOf(Arrays.hashCode(this.f91293k)), this.f91294l, this.f91295m, this.f91296n, this.f91297o, this.f91298p, this.f91299q, this.f91301s, this.f91302t, this.f91303u, this.f91304v, this.f91305w, this.f91306x, this.f91307y, this.f91308z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
