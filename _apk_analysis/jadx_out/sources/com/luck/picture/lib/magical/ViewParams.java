package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35126e;

    public class a implements Parcelable.Creator<ViewParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewParams[] newArray(int i10) {
            return new ViewParams[i10];
        }
    }

    public ViewParams() {
    }

    public ViewParams(Parcel parcel) {
        this.f35123b = parcel.readInt();
        this.f35124c = parcel.readInt();
        this.f35125d = parcel.readInt();
        this.f35126e = parcel.readInt();
    }

    public void b(int i10) {
        this.f35126e = i10;
    }

    public void c(int i10) {
        this.f35123b = i10;
    }

    public void d(int i10) {
        this.f35124c = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i10) {
        this.f35125d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35123b);
        parcel.writeInt(this.f35124c);
        parcel.writeInt(this.f35125d);
        parcel.writeInt(this.f35126e);
    }
}
