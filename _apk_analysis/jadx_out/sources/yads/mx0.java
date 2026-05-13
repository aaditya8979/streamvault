package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import yads.mx0;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class mx0 implements xq {
    public static final mx0 H = new mx0(new lx0());
    public static final wq I = new wq() { // from class: bt.r6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx0.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f92601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f92603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f92604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f92605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f92606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f92607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ts1 f92608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f92609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f92610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f92611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f92612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kk0 f92613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f92614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f92615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f92616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f92617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f92618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f92619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f92620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f92621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mx f92622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f92623z;

    public mx0(lx0 lx0Var) {
        this.f92599b = lx0Var.f92138a;
        this.f92600c = lx0Var.f92139b;
        this.f92601d = ib3.e(lx0Var.f92140c);
        this.f92602e = lx0Var.f92141d;
        this.f92603f = lx0Var.f92142e;
        int i10 = lx0Var.f92143f;
        this.f92604g = i10;
        int i11 = lx0Var.f92144g;
        this.f92605h = i11;
        this.f92606i = i11 != -1 ? i11 : i10;
        this.f92607j = lx0Var.f92145h;
        this.f92608k = lx0Var.f92146i;
        this.f92609l = lx0Var.f92147j;
        this.f92610m = lx0Var.f92148k;
        this.f92611n = lx0Var.f92149l;
        List list = lx0Var.f92150m;
        this.f92612o = list == null ? Collections.emptyList() : list;
        kk0 kk0Var = lx0Var.f92151n;
        this.f92613p = kk0Var;
        this.f92614q = lx0Var.f92152o;
        this.f92615r = lx0Var.f92153p;
        this.f92616s = lx0Var.f92154q;
        this.f92617t = lx0Var.f92155r;
        int i12 = lx0Var.f92156s;
        this.f92618u = i12 == -1 ? 0 : i12;
        float f10 = lx0Var.f92157t;
        this.f92619v = f10 == -1.0f ? 1.0f : f10;
        this.f92620w = lx0Var.f92158u;
        this.f92621x = lx0Var.f92159v;
        this.f92622y = lx0Var.f92160w;
        this.f92623z = lx0Var.f92161x;
        this.A = lx0Var.f92162y;
        this.B = lx0Var.f92163z;
        int i13 = lx0Var.A;
        this.C = i13 == -1 ? 0 : i13;
        int i14 = lx0Var.B;
        this.D = i14 != -1 ? i14 : 0;
        this.E = lx0Var.C;
        int i15 = lx0Var.D;
        if (i15 != 0 || kk0Var == null) {
            this.F = i15;
        } else {
            this.F = 1;
        }
    }

    public static mx0 a(Bundle bundle) {
        lx0 lx0Var = new lx0();
        if (bundle != null) {
            ClassLoader classLoader = yq.class.getClassLoader();
            int i10 = ib3.f90737a;
            bundle.setClassLoader(classLoader);
        }
        int i11 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        mx0 mx0Var = H;
        String str = mx0Var.f92599b;
        if (string == null) {
            string = str;
        }
        lx0Var.f92138a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = mx0Var.f92600c;
        if (string2 == null) {
            string2 = str2;
        }
        lx0Var.f92139b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = mx0Var.f92601d;
        if (string3 == null) {
            string3 = str3;
        }
        lx0Var.f92140c = string3;
        lx0Var.f92141d = bundle.getInt(Integer.toString(3, 36), mx0Var.f92602e);
        lx0Var.f92142e = bundle.getInt(Integer.toString(4, 36), mx0Var.f92603f);
        lx0Var.f92143f = bundle.getInt(Integer.toString(5, 36), mx0Var.f92604g);
        lx0Var.f92144g = bundle.getInt(Integer.toString(6, 36), mx0Var.f92605h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = mx0Var.f92607j;
        if (string4 == null) {
            string4 = str4;
        }
        lx0Var.f92145h = string4;
        ts1 ts1Var = (ts1) bundle.getParcelable(Integer.toString(8, 36));
        ts1 ts1Var2 = mx0Var.f92608k;
        if (ts1Var == null) {
            ts1Var = ts1Var2;
        }
        lx0Var.f92146i = ts1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = mx0Var.f92609l;
        if (string5 == null) {
            string5 = str5;
        }
        lx0Var.f92147j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = mx0Var.f92610m;
        if (string6 == null) {
            string6 = str6;
        }
        lx0Var.f92148k = string6;
        lx0Var.f92149l = bundle.getInt(Integer.toString(11, 36), mx0Var.f92611n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i11, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        lx0Var.f92150m = arrayList;
        lx0Var.f92151n = (kk0) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        mx0 mx0Var2 = H;
        lx0Var.f92152o = bundle.getLong(string7, mx0Var2.f92614q);
        lx0Var.f92153p = bundle.getInt(Integer.toString(15, 36), mx0Var2.f92615r);
        lx0Var.f92154q = bundle.getInt(Integer.toString(16, 36), mx0Var2.f92616s);
        lx0Var.f92155r = bundle.getFloat(Integer.toString(17, 36), mx0Var2.f92617t);
        lx0Var.f92156s = bundle.getInt(Integer.toString(18, 36), mx0Var2.f92618u);
        lx0Var.f92157t = bundle.getFloat(Integer.toString(19, 36), mx0Var2.f92619v);
        lx0Var.f92158u = bundle.getByteArray(Integer.toString(20, 36));
        lx0Var.f92159v = bundle.getInt(Integer.toString(21, 36), mx0Var2.f92621x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            lx0Var.f92160w = (mx) mx.f92593g.fromBundle(bundle2);
        }
        lx0Var.f92161x = bundle.getInt(Integer.toString(23, 36), mx0Var2.f92623z);
        lx0Var.f92162y = bundle.getInt(Integer.toString(24, 36), mx0Var2.A);
        lx0Var.f92163z = bundle.getInt(Integer.toString(25, 36), mx0Var2.B);
        lx0Var.A = bundle.getInt(Integer.toString(26, 36), mx0Var2.C);
        lx0Var.B = bundle.getInt(Integer.toString(27, 36), mx0Var2.D);
        lx0Var.C = bundle.getInt(Integer.toString(28, 36), mx0Var2.E);
        lx0Var.D = bundle.getInt(Integer.toString(29, 36), mx0Var2.F);
        return new mx0(lx0Var);
    }

    public final int a() {
        int i10;
        int i11 = this.f92615r;
        if (i11 == -1 || (i10 = this.f92616s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean a(mx0 mx0Var) {
        if (this.f92612o.size() != mx0Var.f92612o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f92612o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f92612o.get(i10), (byte[]) mx0Var.f92612o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        int i11 = this.G;
        if (i11 == 0 || (i10 = mx0Var.G) == 0 || i11 == i10) {
            return this.f92602e == mx0Var.f92602e && this.f92603f == mx0Var.f92603f && this.f92604g == mx0Var.f92604g && this.f92605h == mx0Var.f92605h && this.f92611n == mx0Var.f92611n && this.f92614q == mx0Var.f92614q && this.f92615r == mx0Var.f92615r && this.f92616s == mx0Var.f92616s && this.f92618u == mx0Var.f92618u && this.f92621x == mx0Var.f92621x && this.f92623z == mx0Var.f92623z && this.A == mx0Var.A && this.B == mx0Var.B && this.C == mx0Var.C && this.D == mx0Var.D && this.E == mx0Var.E && this.F == mx0Var.F && Float.compare(this.f92617t, mx0Var.f92617t) == 0 && Float.compare(this.f92619v, mx0Var.f92619v) == 0 && ib3.a(this.f92599b, mx0Var.f92599b) && ib3.a(this.f92600c, mx0Var.f92600c) && ib3.a(this.f92607j, mx0Var.f92607j) && ib3.a(this.f92609l, mx0Var.f92609l) && ib3.a(this.f92610m, mx0Var.f92610m) && ib3.a(this.f92601d, mx0Var.f92601d) && Arrays.equals(this.f92620w, mx0Var.f92620w) && ib3.a(this.f92608k, mx0Var.f92608k) && ib3.a(this.f92622y, mx0Var.f92622y) && ib3.a(this.f92613p, mx0Var.f92613p) && a(mx0Var);
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.f92599b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f92600c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f92601d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f92602e) * 31) + this.f92603f) * 31) + this.f92604g) * 31) + this.f92605h) * 31;
            String str4 = this.f92607j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ts1 ts1Var = this.f92608k;
            int iHashCode5 = (iHashCode4 + (ts1Var == null ? 0 : Arrays.hashCode(ts1Var.f95344b))) * 31;
            String str5 = this.f92609l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f92610m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f92619v) + ((((Float.floatToIntBits(this.f92617t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f92611n) * 31) + ((int) this.f92614q)) * 31) + this.f92615r) * 31) + this.f92616s) * 31)) * 31) + this.f92618u) * 31)) * 31) + this.f92621x) * 31) + this.f92623z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        return "Format(" + this.f92599b + ", " + this.f92600c + ", " + this.f92609l + ", " + this.f92610m + ", " + this.f92607j + ", " + this.f92606i + ", " + this.f92601d + ", [" + this.f92615r + ", " + this.f92616s + ", " + this.f92617t + "], [" + this.f92623z + ", " + this.A + "])";
    }
}
