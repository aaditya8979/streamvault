package com.google.android.exoplayer.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format[] f20389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20390d;

    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int i10) {
            return new TrackGroup[i10];
        }
    }

    public TrackGroup(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f20388b = i10;
        this.f20389c = new Format[i10];
        for (int i11 = 0; i11 < this.f20388b; i11++) {
            this.f20389c[i11] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        a6.a.f(formatArr.length > 0);
        this.f20389c = formatArr;
        this.f20388b = formatArr.length;
    }

    public Format b(int i10) {
        return this.f20389c[i10];
    }

    public int c(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.f20389c;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f20388b == trackGroup.f20388b && Arrays.equals(this.f20389c, trackGroup.f20389c);
    }

    public int hashCode() {
        if (this.f20390d == 0) {
            this.f20390d = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f20389c);
        }
        return this.f20390d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20388b);
        for (int i11 = 0; i11 < this.f20388b; i11++) {
            parcel.writeParcelable(this.f20389c[i11], 0);
        }
    }
}
