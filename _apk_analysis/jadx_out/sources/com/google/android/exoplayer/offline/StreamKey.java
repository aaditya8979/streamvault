package com.google.android.exoplayer.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20360d;

    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f20358b = i10;
        this.f20359c = i11;
        this.f20360d = i12;
    }

    public StreamKey(Parcel parcel) {
        this.f20358b = parcel.readInt();
        this.f20359c = parcel.readInt();
        this.f20360d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f20358b - streamKey.f20358b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f20359c - streamKey.f20359c;
        return i11 == 0 ? this.f20360d - streamKey.f20360d : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f20358b == streamKey.f20358b && this.f20359c == streamKey.f20359c && this.f20360d == streamKey.f20360d;
    }

    public int hashCode() {
        return (((this.f20358b * 31) + this.f20359c) * 31) + this.f20360d;
    }

    public String toString() {
        return this.f20358b + "." + this.f20359c + "." + this.f20360d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20358b);
        parcel.writeInt(this.f20359c);
        parcel.writeInt(this.f20360d);
    }
}
