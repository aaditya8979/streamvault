package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class H implements Parcelable {

    @NotNull
    public static final G CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68387b;

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }

    public H(boolean z10, long j10) {
        this.f68386a = z10;
        this.f68387b = j10;
    }

    public final long a() {
        return this.f68387b;
    }

    public final boolean b() {
        return this.f68386a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f68386a + ", delaySeconds=" + this.f68387b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f68386a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f68387b);
    }
}
