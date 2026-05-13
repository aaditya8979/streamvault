package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m63 extends j23 {
    public static final Parcelable.Creator<m63> CREATOR = new l63();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92275c;

    public m63(long j10, long j11) {
        this.f92274b = j10;
        this.f92275c = j11;
    }

    public static long a(long j10, jb2 jb2Var) {
        long jM = jb2Var.m();
        if ((128 & jM) != 0) {
            return 8589934591L & ((((jM & 1) << 32) | jb2Var.n()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f92274b);
        parcel.writeLong(this.f92275c);
    }
}
