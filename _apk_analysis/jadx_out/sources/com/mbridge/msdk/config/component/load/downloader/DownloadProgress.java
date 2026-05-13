package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36041c;

    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f36039a = j10;
        this.f36041c = j11;
        this.f36040b = i10;
    }

    public DownloadProgress(Parcel parcel) {
        this.f36039a = parcel.readLong();
        this.f36041c = parcel.readLong();
        this.f36040b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f36039a;
    }

    public int getCurrentDownloadRate() {
        return this.f36040b;
    }

    public long getTotal() {
        return this.f36041c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f36039a);
        parcel.writeLong(this.f36041c);
        parcel.writeInt(this.f36040b);
    }
}
