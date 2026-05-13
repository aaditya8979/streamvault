package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C5065qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f67584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4940lg f67585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ma f67586c;

    public C5065qg(Oa oa2, InterfaceC4940lg interfaceC4940lg, Ma ma2) {
        this.f67584a = oa2;
        this.f67585b = interfaceC4940lg;
        this.f67586c = ma2;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Oa a() {
        return this.f67584a;
    }

    public final void a(@Nullable C5015og c5015og) {
        if (this.f67584a.a(c5015og)) {
            this.f67585b.a(c5015og);
            this.f67586c.a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final InterfaceC4940lg b() {
        return this.f67585b;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Ma c() {
        return this.f67586c;
    }
}
