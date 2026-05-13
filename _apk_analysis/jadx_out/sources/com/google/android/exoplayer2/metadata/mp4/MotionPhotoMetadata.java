package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b8.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21957f;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f21953b = j10;
        this.f21954c = j11;
        this.f21955d = j12;
        this.f21956e = j13;
        this.f21957f = j14;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f21953b = parcel.readLong();
        this.f21954c = parcel.readLong();
        this.f21955d = parcel.readLong();
        this.f21956e = parcel.readLong();
        this.f21957f = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f21953b == motionPhotoMetadata.f21953b && this.f21954c == motionPhotoMetadata.f21954c && this.f21955d == motionPhotoMetadata.f21955d && this.f21956e == motionPhotoMetadata.f21956e && this.f21957f == motionPhotoMetadata.f21957f;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + f.b(this.f21953b)) * 31) + f.b(this.f21954c)) * 31) + f.b(this.f21955d)) * 31) + f.b(this.f21956e)) * 31) + f.b(this.f21957f);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21953b + ", photoSize=" + this.f21954c + ", photoPresentationTimestampUs=" + this.f21955d + ", videoStartPosition=" + this.f21956e + ", videoSize=" + this.f21957f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21953b);
        parcel.writeLong(this.f21954c);
        parcel.writeLong(this.f21955d);
        parcel.writeLong(this.f21956e);
        parcel.writeLong(this.f21957f);
    }
}
