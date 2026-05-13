package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class AlbumWindowStyle implements Parcelable {
    public static final Parcelable.Creator<AlbumWindowStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35134e;

    public class a implements Parcelable.Creator<AlbumWindowStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle createFromParcel(Parcel parcel) {
            return new AlbumWindowStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle[] newArray(int i10) {
            return new AlbumWindowStyle[i10];
        }
    }

    public AlbumWindowStyle() {
    }

    public AlbumWindowStyle(Parcel parcel) {
        this.f35131b = parcel.readInt();
        this.f35132c = parcel.readInt();
        this.f35133d = parcel.readInt();
        this.f35134e = parcel.readInt();
    }

    public int c() {
        return this.f35131b;
    }

    public int d() {
        return this.f35132c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f35134e;
    }

    public int f() {
        return this.f35133d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35131b);
        parcel.writeInt(this.f35132c);
        parcel.writeInt(this.f35133d);
        parcel.writeInt(this.f35134e);
    }
}
