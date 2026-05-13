package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Ei implements InterfaceC4695c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f65200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4695c3 f65201b;

    public Ei(@NonNull Object obj, @NonNull InterfaceC4695c3 interfaceC4695c3) {
        this.f65200a = obj;
        this.f65201b = interfaceC4695c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4695c3
    public final int getBytesTruncated() {
        return this.f65201b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f65200a + ", metaInfo=" + this.f65201b + '}';
    }
}
