package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4766en implements Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mn f66712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66713b;

    public C4766en(@NonNull Mn mn2, @Nullable Object obj) {
        this.f66712a = mn2;
        this.f66713b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.f66712a.a(obj) ? this.f66713b : obj;
    }
}
