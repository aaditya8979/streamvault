package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f68440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f68441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f68442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C5310n f68443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f68444f = new d0(this);

    public g0(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f68439a = clientContext;
        this.f68440b = u10;
        this.f68441c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f68439a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5309m c5309m) {
        this.f68443e = c5309m != null ? c5309m.f68463b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }
}
