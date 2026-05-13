package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class F1 implements InterfaceC4763ek {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final E1 f65230b = new E1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65231c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5098s0 f65232a;

    public F1(@NotNull InterfaceC5098s0 interfaceC5098s0) {
        this.f65232a = interfaceC5098s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4763ek
    @WorkerThread
    public final void reportData(int i10, @NotNull Bundle bundle) {
        ((C1) this.f65232a).a(bundle);
    }
}
