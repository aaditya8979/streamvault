package com.google.android.exoplayer.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrackGroup[] f20393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TrackGroupArray f20391e = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    public class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray[] newArray(int i10) {
            return new TrackGroupArray[i10];
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f20392b = i10;
        this.f20393c = new TrackGroup[i10];
        for (int i11 = 0; i11 < this.f20392b; i11++) {
            this.f20393c[i11] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f20393c = trackGroupArr;
        this.f20392b = trackGroupArr.length;
    }

    public TrackGroup b(int i10) {
        return this.f20393c[i10];
    }

    public int c(TrackGroup trackGroup) {
        for (int i10 = 0; i10 < this.f20392b; i10++) {
            if (this.f20393c[i10] == trackGroup) {
                return i10;
            }
        }
        return -1;
    }

    public boolean d() {
        return this.f20392b == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f20392b == trackGroupArray.f20392b && Arrays.equals(this.f20393c, trackGroupArray.f20393c);
    }

    public int hashCode() {
        if (this.f20394d == 0) {
            this.f20394d = Arrays.hashCode(this.f20393c);
        }
        return this.f20394d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20392b);
        for (int i11 = 0; i11 < this.f20392b; i11++) {
            parcel.writeParcelable(this.f20393c[i11], 0);
        }
    }
}
