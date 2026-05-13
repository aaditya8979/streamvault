package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class SelectMainStyle implements Parcelable {
    public static final Parcelable.Creator<SelectMainStyle> CREATOR = new a();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int[] E;
    public int F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public String M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int[] S;
    public int T;
    public int[] U;
    public int V;
    public int W;
    public int X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f35178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35182z;

    public class a implements Parcelable.Creator<SelectMainStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SelectMainStyle createFromParcel(Parcel parcel) {
            return new SelectMainStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SelectMainStyle[] newArray(int i10) {
            return new SelectMainStyle[i10];
        }
    }

    public SelectMainStyle() {
        this.f35160d = false;
    }

    public SelectMainStyle(Parcel parcel) {
        this.f35160d = false;
        this.f35158b = parcel.readInt();
        this.f35159c = parcel.readInt();
        this.f35160d = parcel.readByte() != 0;
        this.f35161e = parcel.readByte() != 0;
        this.f35162f = parcel.readByte() != 0;
        this.f35163g = parcel.readByte() != 0;
        this.f35164h = parcel.readInt();
        this.f35165i = parcel.readInt();
        this.f35166j = parcel.readString();
        this.f35167k = parcel.readInt();
        this.f35168l = parcel.readInt();
        this.f35169m = parcel.readInt();
        this.f35170n = parcel.readInt();
        this.f35171o = parcel.readByte() != 0;
        this.f35172p = parcel.readByte() != 0;
        this.f35173q = parcel.readInt();
        this.f35174r = parcel.readString();
        this.f35175s = parcel.readInt();
        this.f35176t = parcel.readInt();
        this.f35177u = parcel.readInt();
        this.f35178v = parcel.readString();
        this.f35179w = parcel.readInt();
        this.f35180x = parcel.readInt();
        this.f35181y = parcel.readInt();
        this.f35182z = parcel.readInt();
        this.A = parcel.readByte() != 0;
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.createIntArray();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.createIntArray();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.createIntArray();
        this.T = parcel.readInt();
        this.U = parcel.createIntArray();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
    }

    public int A() {
        return this.f35173q;
    }

    public int B() {
        return this.f35159c;
    }

    public int C() {
        return this.f35165i;
    }

    public int D() {
        return this.f35170n;
    }

    public int E() {
        return this.f35164h;
    }

    public String F() {
        return this.f35166j;
    }

    public int G() {
        return this.f35168l;
    }

    public int H() {
        return this.f35167k;
    }

    public int I() {
        return this.f35169m;
    }

    public int J() {
        return this.f35181y;
    }

    public int K() {
        return this.f35177u;
    }

    public String L() {
        return this.f35174r;
    }

    public int M() {
        return this.f35176t;
    }

    public int N() {
        return this.f35175s;
    }

    public String O() {
        return this.f35178v;
    }

    public int P() {
        return this.f35180x;
    }

    public int Q() {
        return this.f35179w;
    }

    public int R() {
        return this.f35158b;
    }

    public boolean S() {
        return this.A;
    }

    public boolean T() {
        return this.f35161e;
    }

    public boolean U() {
        return this.f35160d;
    }

    public boolean V() {
        return this.f35163g;
    }

    public boolean W() {
        return this.f35172p;
    }

    public boolean X() {
        return this.f35162f;
    }

    public boolean Y() {
        return this.f35171o;
    }

    public void Z(boolean z10) {
        this.f35160d = z10;
    }

    public void a0(int i10) {
        this.f35173q = i10;
    }

    public void b0(int i10) {
        this.f35170n = i10;
    }

    public int c() {
        return this.K;
    }

    public void c0(int i10) {
        this.f35169m = i10;
    }

    public int d() {
        return this.L;
    }

    public void d0(int i10) {
        this.f35176t = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.M;
    }

    public void e0(String str) {
        this.f35178v = str;
    }

    public int f() {
        return this.N;
    }

    public void f0(int i10) {
        this.f35180x = i10;
    }

    public int g() {
        return this.O;
    }

    public void g0(int i10) {
        this.f35158b = i10;
    }

    public int h() {
        return this.J;
    }

    public int i() {
        return this.F;
    }

    public int[] j() {
        return this.I;
    }

    public int k() {
        return this.H;
    }

    public int l() {
        return this.G;
    }

    public int[] m() {
        return this.U;
    }

    public int n() {
        return this.T;
    }

    public int o() {
        return this.f35182z;
    }

    public int p() {
        return this.W;
    }

    public int q() {
        return this.V;
    }

    public int r() {
        return this.X;
    }

    public int s() {
        return this.C;
    }

    public int[] t() {
        return this.E;
    }

    public int u() {
        return this.D;
    }

    public int v() {
        return this.B;
    }

    public int w() {
        return this.P;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35158b);
        parcel.writeInt(this.f35159c);
        parcel.writeByte(this.f35160d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35161e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35162f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35163g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35164h);
        parcel.writeInt(this.f35165i);
        parcel.writeString(this.f35166j);
        parcel.writeInt(this.f35167k);
        parcel.writeInt(this.f35168l);
        parcel.writeInt(this.f35169m);
        parcel.writeInt(this.f35170n);
        parcel.writeByte(this.f35171o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35172p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35173q);
        parcel.writeString(this.f35174r);
        parcel.writeInt(this.f35175s);
        parcel.writeInt(this.f35176t);
        parcel.writeInt(this.f35177u);
        parcel.writeString(this.f35178v);
        parcel.writeInt(this.f35179w);
        parcel.writeInt(this.f35180x);
        parcel.writeInt(this.f35181y);
        parcel.writeInt(this.f35182z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeIntArray(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeIntArray(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeIntArray(this.S);
        parcel.writeInt(this.T);
        parcel.writeIntArray(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
    }

    public int[] x() {
        return this.S;
    }

    public int y() {
        return this.R;
    }

    public int z() {
        return this.Q;
    }
}
