package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Nn implements InterfaceC4695c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f65673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4695c3 f65674b;

    public Nn(@Nullable Object obj, @NonNull InterfaceC4695c3 interfaceC4695c3) {
        this.f65673a = obj;
        this.f65674b = interfaceC4695c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4695c3
    public final int getBytesTruncated() {
        return this.f65674b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f65673a + ", metaInfo=" + this.f65674b + '}';
    }
}
