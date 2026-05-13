package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class TitleBarStyle implements Parcelable {
    public static final Parcelable.Creator<TitleBarStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f35198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35201t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f35202u;

    public class a implements Parcelable.Creator<TitleBarStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle createFromParcel(Parcel parcel) {
            return new TitleBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle[] newArray(int i10) {
            return new TitleBarStyle[i10];
        }
    }

    public TitleBarStyle() {
    }

    public TitleBarStyle(Parcel parcel) {
        this.f35183b = parcel.readByte() != 0;
        this.f35184c = parcel.readInt();
        this.f35185d = parcel.readInt();
        this.f35186e = parcel.readString();
        this.f35187f = parcel.readInt();
        this.f35188g = parcel.readInt();
        this.f35189h = parcel.readInt();
        this.f35190i = parcel.readInt();
        this.f35191j = parcel.readInt();
        this.f35192k = parcel.readInt();
        this.f35193l = parcel.readByte() != 0;
        this.f35194m = parcel.readInt();
        this.f35195n = parcel.readInt();
        this.f35196o = parcel.readByte() != 0;
        this.f35197p = parcel.readInt();
        this.f35198q = parcel.readString();
        this.f35199r = parcel.readInt();
        this.f35200s = parcel.readInt();
        this.f35201t = parcel.readInt();
        this.f35202u = parcel.readByte() != 0;
    }

    public void A(int i10) {
        this.f35184c = i10;
    }

    public void B(int i10) {
        this.f35188g = i10;
    }

    public int c() {
        return this.f35197p;
    }

    public int d() {
        return this.f35190i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f35185d;
    }

    public int f() {
        return this.f35192k;
    }

    public int g() {
        return this.f35189h;
    }

    public int h() {
        return this.f35191j;
    }

    public int i() {
        return this.f35201t;
    }

    public int j() {
        return this.f35195n;
    }

    public String k() {
        return this.f35198q;
    }

    public int l() {
        return this.f35200s;
    }

    public int m() {
        return this.f35199r;
    }

    public String n() {
        return this.f35186e;
    }

    public int o() {
        return this.f35194m;
    }

    public int p() {
        return this.f35184c;
    }

    public int q() {
        return this.f35188g;
    }

    public int r() {
        return this.f35187f;
    }

    public boolean s() {
        return this.f35202u;
    }

    public boolean t() {
        return this.f35196o;
    }

    public boolean u() {
        return this.f35183b;
    }

    public void v(boolean z10) {
        this.f35202u = z10;
    }

    public void w(boolean z10) {
        this.f35196o = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f35183b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35184c);
        parcel.writeInt(this.f35185d);
        parcel.writeString(this.f35186e);
        parcel.writeInt(this.f35187f);
        parcel.writeInt(this.f35188g);
        parcel.writeInt(this.f35189h);
        parcel.writeInt(this.f35190i);
        parcel.writeInt(this.f35191j);
        parcel.writeInt(this.f35192k);
        parcel.writeByte(this.f35193l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35194m);
        parcel.writeInt(this.f35195n);
        parcel.writeByte(this.f35196o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35197p);
        parcel.writeString(this.f35198q);
        parcel.writeInt(this.f35199r);
        parcel.writeInt(this.f35200s);
        parcel.writeInt(this.f35201t);
        parcel.writeByte(this.f35202u ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f35189h = i10;
    }

    public void y(int i10) {
        this.f35200s = i10;
    }

    public void z(int i10) {
        this.f35194m = i10;
    }
}
