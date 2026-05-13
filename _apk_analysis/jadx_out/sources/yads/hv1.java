package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class hv1 implements ss1 {
    public static final Parcelable.Creator<hv1> CREATOR = new gv1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90580f;

    public hv1(long j10, long j11, long j12, long j13, long j14) {
        this.f90576b = j10;
        this.f90577c = j11;
        this.f90578d = j12;
        this.f90579e = j13;
        this.f90580f = j14;
    }

    public hv1(Parcel parcel) {
        this.f90576b = parcel.readLong();
        this.f90577c = parcel.readLong();
        this.f90578d = parcel.readLong();
        this.f90579e = parcel.readLong();
        this.f90580f = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv1.class != obj.getClass()) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return this.f90576b == hv1Var.f90576b && this.f90577c == hv1Var.f90577c && this.f90578d == hv1Var.f90578d && this.f90579e == hv1Var.f90579e && this.f90580f == hv1Var.f90580f;
    }

    public final int hashCode() {
        long j10 = this.f90576b;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j11 = this.f90577c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f90578d;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f90579e;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f90580f;
        return i13 + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f90576b + ", photoSize=" + this.f90577c + ", photoPresentationTimestampUs=" + this.f90578d + ", videoStartPosition=" + this.f90579e + ", videoSize=" + this.f90580f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f90576b);
        parcel.writeLong(this.f90577c);
        parcel.writeLong(this.f90578d);
        parcel.writeLong(this.f90579e);
        parcel.writeLong(this.f90580f);
    }
}
