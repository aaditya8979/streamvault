package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public final int f22029e;

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

    public StreamKey(Parcel parcel) {
        this.f22026b = parcel.readInt();
        this.f22027c = parcel.readInt();
        int i10 = parcel.readInt();
        this.f22028d = i10;
        this.f22029e = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f22026b - streamKey.f22026b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f22027c - streamKey.f22027c;
        return i11 == 0 ? this.f22028d - streamKey.f22028d : i11;
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
        return this.f22026b == streamKey.f22026b && this.f22027c == streamKey.f22027c && this.f22028d == streamKey.f22028d;
    }

    public int hashCode() {
        return (((this.f22026b * 31) + this.f22027c) * 31) + this.f22028d;
    }

    public String toString() {
        return this.f22026b + "." + this.f22027c + "." + this.f22028d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22026b);
        parcel.writeInt(this.f22027c);
        parcel.writeInt(this.f22028d);
    }
}
