package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class m23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92232c;

    public m23(int i10, long j10, long j11) {
        this.f92230a = i10;
        this.f92231b = j10;
        this.f92232c = j11;
    }

    public static m23 a(Parcel parcel) {
        return new m23(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
