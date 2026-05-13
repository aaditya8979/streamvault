package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class FileDownloadTaskAtom implements Parcelable {
    public static final Parcelable.Creator<FileDownloadTaskAtom> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34710d;

    public class a implements Parcelable.Creator<FileDownloadTaskAtom> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom createFromParcel(Parcel parcel) {
            return new FileDownloadTaskAtom(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom[] newArray(int i10) {
            return new FileDownloadTaskAtom[i10];
        }
    }

    public FileDownloadTaskAtom(Parcel parcel) {
        this.f34708b = parcel.readString();
        this.f34709c = parcel.readString();
        this.f34710d = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f34708b);
        parcel.writeString(this.f34709c);
        parcel.writeLong(this.f34710d);
    }
}
