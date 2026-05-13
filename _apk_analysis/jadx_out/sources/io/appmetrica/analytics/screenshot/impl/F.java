package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5321z f68383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f68384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f68385c;

    /* JADX WARN: Illegal instructions before constructor call */
    public F(k0 k0Var) {
        h0 h0VarA = k0Var.a();
        C5321z c5321z = h0VarA != null ? new C5321z(h0VarA) : null;
        l0 l0VarC = k0Var.c();
        H h10 = l0VarC != null ? new H(l0VarC) : null;
        i0 i0VarB = k0Var.b();
        this(c5321z, h10, i0VarB != null ? new B(i0VarB) : null);
    }

    public F(C5321z c5321z, H h10, B b10) {
        this.f68383a = c5321z;
        this.f68384b = h10;
        this.f68385c = b10;
    }

    public final C5321z a() {
        return this.f68383a;
    }

    public final B b() {
        return this.f68385c;
    }

    public final H c() {
        return this.f68384b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f68383a + ", serviceCaptorConfig=" + this.f68384b + ", contentObserverCaptorConfig=" + this.f68385c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f68383a, i10);
        parcel.writeParcelable(this.f68384b, i10);
        parcel.writeParcelable(this.f68385c, i10);
    }
}
