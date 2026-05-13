package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f68379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68380c;

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }

    public B(boolean z10, List list, long j10) {
        this.f68378a = z10;
        this.f68379b = list;
        this.f68380c = j10;
    }

    public final long a() {
        return this.f68380c;
    }

    public final boolean b() {
        return this.f68378a;
    }

    public final List c() {
        return this.f68379b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f68378a + ", mediaStoreColumnNames=" + this.f68379b + ", detectWindowSeconds=" + this.f68380c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f68378a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f68379b);
        parcel.writeLong(this.f68380c);
    }
}
