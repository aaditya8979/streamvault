package com.luck.picture.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class LocalMediaFolder implements Parcelable {
    public static final Parcelable.Creator<LocalMediaFolder> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<LocalMedia> f35090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35092j;

    public class a implements Parcelable.Creator<LocalMediaFolder> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder createFromParcel(Parcel parcel) {
            return new LocalMediaFolder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder[] newArray(int i10) {
            return new LocalMediaFolder[i10];
        }
    }

    public LocalMediaFolder() {
        this.f35084b = -1L;
        this.f35090h = new ArrayList<>();
        this.f35091i = 1;
    }

    public LocalMediaFolder(Parcel parcel) {
        this.f35084b = -1L;
        this.f35090h = new ArrayList<>();
        this.f35091i = 1;
        this.f35084b = parcel.readLong();
        this.f35085c = parcel.readString();
        this.f35086d = parcel.readString();
        this.f35087e = parcel.readString();
        this.f35088f = parcel.readInt();
        this.f35089g = parcel.readByte() != 0;
        this.f35090h = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f35091i = parcel.readInt();
        this.f35092j = parcel.readByte() != 0;
    }

    public long c() {
        return this.f35084b;
    }

    public int d() {
        return this.f35091i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<LocalMedia> e() {
        ArrayList<LocalMedia> arrayList = this.f35090h;
        return arrayList != null ? arrayList : new ArrayList<>();
    }

    public String f() {
        return this.f35086d;
    }

    public String g() {
        return this.f35087e;
    }

    public String h() {
        return TextUtils.isEmpty(this.f35085c) ? "unknown" : this.f35085c;
    }

    public int i() {
        return this.f35088f;
    }

    public boolean j() {
        return this.f35092j;
    }

    public boolean k() {
        return this.f35089g;
    }

    public void l(long j10) {
        this.f35084b = j10;
    }

    public void m(int i10) {
        this.f35091i = i10;
    }

    public void n(ArrayList<LocalMedia> arrayList) {
        this.f35090h = arrayList;
    }

    public void o(String str) {
        this.f35086d = str;
    }

    public void p(String str) {
        this.f35087e = str;
    }

    public void q(String str) {
        this.f35085c = str;
    }

    public void r(int i10) {
        this.f35088f = i10;
    }

    public void s(boolean z10) {
        this.f35092j = z10;
    }

    public void t(boolean z10) {
        this.f35089g = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f35084b);
        parcel.writeString(this.f35085c);
        parcel.writeString(this.f35086d);
        parcel.writeString(this.f35087e);
        parcel.writeInt(this.f35088f);
        parcel.writeByte(this.f35089g ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f35090h);
        parcel.writeInt(this.f35091i);
        parcel.writeByte(this.f35092j ? (byte) 1 : (byte) 0);
    }
}
