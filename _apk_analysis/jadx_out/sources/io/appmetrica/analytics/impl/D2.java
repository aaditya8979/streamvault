package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D2 implements InterfaceC5158ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65144a;

    public D2(int i10) {
        this.f65144a = i10;
    }

    @VisibleForTesting(otherwise = 4)
    public final int a() {
        return this.f65144a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5158ua
    @NonNull
    public abstract /* synthetic */ Nn a(@Nullable Object obj);
}
