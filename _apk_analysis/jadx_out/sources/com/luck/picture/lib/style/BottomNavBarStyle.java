package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class BottomNavBarStyle implements Parcelable {
    public static final Parcelable.Creator<BottomNavBarStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35153t;

    public class a implements Parcelable.Creator<BottomNavBarStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle createFromParcel(Parcel parcel) {
            return new BottomNavBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle[] newArray(int i10) {
            return new BottomNavBarStyle[i10];
        }
    }

    public BottomNavBarStyle() {
        this.f35153t = true;
    }

    public BottomNavBarStyle(Parcel parcel) {
        this.f35153t = true;
        this.f35135b = parcel.readInt();
        this.f35136c = parcel.readInt();
        this.f35137d = parcel.readInt();
        this.f35138e = parcel.readString();
        this.f35139f = parcel.readInt();
        this.f35140g = parcel.readInt();
        this.f35141h = parcel.readString();
        this.f35142i = parcel.readInt();
        this.f35143j = parcel.readString();
        this.f35144k = parcel.readInt();
        this.f35145l = parcel.readInt();
        this.f35146m = parcel.readInt();
        this.f35147n = parcel.readString();
        this.f35148o = parcel.readInt();
        this.f35149p = parcel.readInt();
        this.f35150q = parcel.readInt();
        this.f35151r = parcel.readInt();
        this.f35152s = parcel.readInt();
        this.f35153t = parcel.readByte() != 0;
    }

    public void A(boolean z10) {
        this.f35153t = z10;
    }

    public String c() {
        return this.f35143j;
    }

    public int d() {
        return this.f35145l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f35144k;
    }

    public int f() {
        return this.f35135b;
    }

    public int g() {
        return this.f35137d;
    }

    public int h() {
        return this.f35146m;
    }

    public String i() {
        return this.f35147n;
    }

    public int j() {
        return this.f35149p;
    }

    public int k() {
        return this.f35148o;
    }

    public int l() {
        return this.f35136c;
    }

    public String m() {
        return this.f35138e;
    }

    public int n() {
        return this.f35140g;
    }

    public int o() {
        return this.f35139f;
    }

    public String p() {
        return this.f35141h;
    }

    public int q() {
        return this.f35142i;
    }

    public int r() {
        return this.f35150q;
    }

    public int s() {
        return this.f35152s;
    }

    public int t() {
        return this.f35151r;
    }

    public boolean u() {
        return this.f35153t;
    }

    public void v(int i10) {
        this.f35145l = i10;
    }

    public void w(int i10) {
        this.f35135b = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35135b);
        parcel.writeInt(this.f35136c);
        parcel.writeInt(this.f35137d);
        parcel.writeString(this.f35138e);
        parcel.writeInt(this.f35139f);
        parcel.writeInt(this.f35140g);
        parcel.writeString(this.f35141h);
        parcel.writeInt(this.f35142i);
        parcel.writeString(this.f35143j);
        parcel.writeInt(this.f35144k);
        parcel.writeInt(this.f35145l);
        parcel.writeInt(this.f35146m);
        parcel.writeString(this.f35147n);
        parcel.writeInt(this.f35148o);
        parcel.writeInt(this.f35149p);
        parcel.writeInt(this.f35150q);
        parcel.writeInt(this.f35151r);
        parcel.writeInt(this.f35152s);
        parcel.writeByte(this.f35153t ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f35149p = i10;
    }

    public void y(int i10) {
        this.f35140g = i10;
    }

    public void z(int i10) {
        this.f35142i = i10;
    }
}
