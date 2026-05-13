package com.luck.picture.lib.entity;

import ab.j;
import ab.k;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import ma.d;
import wa.b;

/* JADX INFO: loaded from: classes10.dex */
public class LocalMedia implements Parcelable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new a();
    public static b<LocalMedia> K;
    public boolean A;
    public String B;
    public String C;
    public long D;
    public long E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public LocalMedia J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f35082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f35083z;

    public class a implements Parcelable.Creator<LocalMedia> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMedia createFromParcel(Parcel parcel) {
            return new LocalMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMedia[] newArray(int i10) {
            return new LocalMedia[i10];
        }
    }

    public LocalMedia() {
        this.D = -1L;
    }

    public LocalMedia(Parcel parcel) {
        this.D = -1L;
        this.f35059b = parcel.readLong();
        this.f35060c = parcel.readString();
        this.f35061d = parcel.readString();
        this.f35062e = parcel.readString();
        this.f35063f = parcel.readString();
        this.f35064g = parcel.readString();
        this.f35065h = parcel.readString();
        this.f35066i = parcel.readString();
        this.f35067j = parcel.readString();
        this.f35068k = parcel.readLong();
        this.f35069l = parcel.readByte() != 0;
        this.f35070m = parcel.readByte() != 0;
        this.f35071n = parcel.readInt();
        this.f35072o = parcel.readInt();
        this.f35073p = parcel.readString();
        this.f35074q = parcel.readInt();
        this.f35075r = parcel.readByte() != 0;
        this.f35076s = parcel.readInt();
        this.f35077t = parcel.readInt();
        this.f35078u = parcel.readInt();
        this.f35079v = parcel.readInt();
        this.f35080w = parcel.readInt();
        this.f35081x = parcel.readInt();
        this.f35082y = parcel.readFloat();
        this.f35083z = parcel.readLong();
        this.A = parcel.readByte() != 0;
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readString();
        this.G = parcel.readByte() != 0;
        this.H = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
    }

    public static LocalMedia N() {
        if (K == null) {
            K = new b<>();
        }
        LocalMedia localMediaA = K.a();
        return localMediaA == null ? c() : localMediaA;
    }

    public static LocalMedia c() {
        return new LocalMedia();
    }

    public static void d() {
        b<LocalMedia> bVar = K;
        if (bVar != null) {
            bVar.b();
            K = null;
        }
    }

    public static LocalMedia e(Context context, String str) {
        LocalMedia localMediaC = c();
        File file = d.c(str) ? new File(k.h(context, Uri.parse(str))) : new File(str);
        localMediaC.p0(str);
        localMediaC.r0(file.getAbsolutePath());
        localMediaC.f0(file.getName());
        localMediaC.o0(j.c(file.getAbsolutePath()));
        localMediaC.k0(j.i(file.getAbsolutePath()));
        localMediaC.t0(file.length());
        localMediaC.c0(file.lastModified() / 1000);
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.contains("Android/data/") || absolutePath.contains("data/user/")) {
            localMediaC.i0(System.currentTimeMillis());
            localMediaC.P(file.getParentFile() != null ? r1.getName().hashCode() : 0L);
        } else {
            Long[] lArrJ = j.j(context, localMediaC.y());
            localMediaC.i0(lArrJ[0].longValue() == 0 ? System.currentTimeMillis() : lArrJ[0].longValue());
            localMediaC.P(lArrJ[1].longValue());
        }
        if (d.i(localMediaC.s())) {
            pa.b bVarL = j.l(context, str);
            localMediaC.w0(bVarL.c());
            localMediaC.h0(bVarL.b());
            localMediaC.d0(bVarL.a());
        } else if (d.d(localMediaC.s())) {
            localMediaC.d0(j.d(context, str).a());
        } else {
            pa.b bVarF = j.f(context, str);
            localMediaC.w0(bVarF.c());
            localMediaC.h0(bVarF.b());
        }
        return localMediaC;
    }

    public long A() {
        return this.f35083z;
    }

    public String B() {
        return this.f35066i;
    }

    public String C() {
        return this.f35065h;
    }

    public int D() {
        return this.f35076s;
    }

    public boolean E() {
        return this.f35069l;
    }

    public boolean F() {
        return this.f35075r && !TextUtils.isEmpty(i());
    }

    public boolean G() {
        return this.f35070m && !TextUtils.isEmpty(m());
    }

    public boolean H() {
        return this.I && !TextUtils.isEmpty(m());
    }

    public boolean I() {
        return this.H;
    }

    public boolean J() {
        return this.G;
    }

    public boolean K() {
        return this.A && !TextUtils.isEmpty(u());
    }

    public boolean L() {
        return !TextUtils.isEmpty(z());
    }

    public boolean M() {
        return !TextUtils.isEmpty(C());
    }

    public void O() {
        b<LocalMedia> bVar = K;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void P(long j10) {
        this.D = j10;
    }

    public void Q(boolean z10) {
        this.f35069l = z10;
    }

    public void R(int i10) {
        this.f35074q = i10;
    }

    public void S(String str) {
        this.f35063f = str;
    }

    public void T(boolean z10) {
        this.f35075r = z10;
    }

    public void U(int i10) {
        this.f35079v = i10;
    }

    public void V(int i10) {
        this.f35078u = i10;
    }

    public void W(int i10) {
        this.f35080w = i10;
    }

    public void X(int i10) {
        this.f35081x = i10;
    }

    public void Y(float f10) {
        this.f35082y = f10;
    }

    public void Z(String str) {
        this.F = str;
    }

    public void a0(boolean z10) {
        this.f35070m = z10;
    }

    public void b0(String str) {
        this.f35064g = str;
    }

    public void c0(long j10) {
        this.E = j10;
    }

    public void d0(long j10) {
        this.f35068k = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e0(boolean z10) {
        this.I = z10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (!TextUtils.equals(w(), localMedia.w()) && !TextUtils.equals(y(), localMedia.y()) && r() != localMedia.r()) {
            z10 = false;
        }
        if (!z10) {
            localMedia = null;
        }
        this.J = localMedia;
        return z10;
    }

    public String f() {
        String strW = w();
        if (G()) {
            strW = m();
        }
        if (F()) {
            strW = i();
        }
        if (L()) {
            strW = z();
        }
        if (K()) {
            strW = u();
        }
        return M() ? C() : strW;
    }

    public void f0(String str) {
        this.B = str;
    }

    public long g() {
        return this.D;
    }

    public void g0(boolean z10) {
        this.H = z10;
    }

    public LocalMedia h() {
        return this.J;
    }

    public void h0(int i10) {
        this.f35077t = i10;
    }

    public String i() {
        return this.f35063f;
    }

    public void i0(long j10) {
        this.f35059b = j10;
    }

    public int j() {
        return this.f35079v;
    }

    public void j0(boolean z10) {
        this.G = z10;
    }

    public int k() {
        return this.f35078u;
    }

    public void k0(String str) {
        this.f35073p = str;
    }

    public String l() {
        return this.F;
    }

    public void l0(int i10) {
        this.f35072o = i10;
    }

    public String m() {
        return this.f35064g;
    }

    public void m0(boolean z10) {
        this.A = z10;
    }

    public long n() {
        return this.E;
    }

    public void n0(String str) {
        this.f35062e = str;
    }

    public long o() {
        return this.f35068k;
    }

    public void o0(String str) {
        this.C = str;
    }

    public String p() {
        return this.B;
    }

    public void p0(String str) {
        this.f35060c = str;
    }

    public int q() {
        return this.f35077t;
    }

    public void q0(int i10) {
        this.f35071n = i10;
    }

    public long r() {
        return this.f35059b;
    }

    public void r0(String str) {
        this.f35061d = str;
    }

    public String s() {
        return this.f35073p;
    }

    public void s0(String str) {
        this.f35067j = str;
    }

    public int t() {
        return this.f35072o;
    }

    public void t0(long j10) {
        this.f35083z = j10;
    }

    public String u() {
        return this.f35062e;
    }

    public void u0(String str) {
        this.f35066i = str;
    }

    public String v() {
        return this.C;
    }

    public void v0(String str) {
        this.f35065h = str;
    }

    public String w() {
        return this.f35060c;
    }

    public void w0(int i10) {
        this.f35076s = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f35059b);
        parcel.writeString(this.f35060c);
        parcel.writeString(this.f35061d);
        parcel.writeString(this.f35062e);
        parcel.writeString(this.f35063f);
        parcel.writeString(this.f35064g);
        parcel.writeString(this.f35065h);
        parcel.writeString(this.f35066i);
        parcel.writeString(this.f35067j);
        parcel.writeLong(this.f35068k);
        parcel.writeByte(this.f35069l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35070m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35071n);
        parcel.writeInt(this.f35072o);
        parcel.writeString(this.f35073p);
        parcel.writeInt(this.f35074q);
        parcel.writeByte(this.f35075r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35076s);
        parcel.writeInt(this.f35077t);
        parcel.writeInt(this.f35078u);
        parcel.writeInt(this.f35079v);
        parcel.writeInt(this.f35080w);
        parcel.writeInt(this.f35081x);
        parcel.writeFloat(this.f35082y);
        parcel.writeLong(this.f35083z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.F);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
    }

    public int x() {
        return this.f35071n;
    }

    public String y() {
        return this.f35061d;
    }

    public String z() {
        return this.f35067j;
    }
}
