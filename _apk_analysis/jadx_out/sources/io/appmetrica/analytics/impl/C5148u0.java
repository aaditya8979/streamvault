package io.appmetrica.analytics.impl;

import android.app.Service;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5148u0 implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f67757a;

    public C5148u0(@NotNull Service service) {
        this.f67757a = service;
    }

    public final void a(int i10) {
        this.f67757a.stopSelf(i10);
    }
}
