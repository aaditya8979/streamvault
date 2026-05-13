package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public final class r23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94265b;

    public r23(int i10, long j10) {
        this.f94264a = i10;
        this.f94265b = j10;
    }

    public static r23 a(Parcel parcel) {
        return new r23(parcel.readInt(), parcel.readLong());
    }
}
