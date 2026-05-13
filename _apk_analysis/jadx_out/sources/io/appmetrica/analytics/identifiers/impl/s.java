package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f64861a;

    public s(IBinder iBinder) {
        this.f64861a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f64861a;
    }
}
