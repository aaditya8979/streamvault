package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4758ef implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C5088rf f66683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C4733df> f66684b;

    public C4758ef(@NonNull C5088rf c5088rf, @NonNull List<C4733df> list) {
        this.f66683a = c5088rf;
        this.f66684b = list;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @NonNull
    public final List<C4733df> a() {
        return this.f66684b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @Nullable
    public final Object b() {
        return this.f66683a;
    }

    @Nullable
    public final C5088rf c() {
        return this.f66683a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f66683a + ", candidates=" + this.f66684b + '}';
    }
}
