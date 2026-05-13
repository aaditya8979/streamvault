package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5317v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f68476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5307k f68477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f68478d;

    public C5317v(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f68475a = clientContext;
        this.f68476b = u10;
        this.f68478d = new Z(clientContext, new C5314s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f68475a.getActivityLifecycleRegistry().registerListener(new C5316u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5309m c5309m) {
        this.f68477c = c5309m != null ? c5309m.f68464c : null;
        this.f68478d.f68425c = this.f68477c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }
}
