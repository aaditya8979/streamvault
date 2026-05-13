package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5173v0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f67796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f67797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4773f4 f67798c;

    public C5173v0() {
        IHandlerExecutor iHandlerExecutorA = C4696c4.l().g().a();
        this.f67797b = iHandlerExecutorA;
        this.f67796a = iHandlerExecutorA.getHandler();
        this.f67798c = new C4773f4();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C4773f4 a() {
        return this.f67798c;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull Ua ua2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final Handler b() {
        return this.f67796a;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final T1 c() {
        return new T1();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C4935lb d() {
        return new C4935lb();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f67797b;
    }
}
