package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class SingleObserverBackgroundThenForegroundAnalyticsListener implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.analytics.a f47106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f47107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Long f47108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47109e;

    public SingleObserverBackgroundThenForegroundAnalyticsListener(@NotNull com.moloco.sdk.internal.services.analytics.a aVar, @NotNull j jVar) {
        tn.p.k(aVar, "analyticsService");
        tn.p.k(jVar, "timeProviderService");
        this.f47106b = aVar;
        this.f47107c = jVar;
    }

    public final void a() {
        this.f47109e = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        super.onStart(lifecycleOwner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l10 = this.f47108d;
        if (l10 != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.f47106b.a(this.f47107c.invoke(), l10.longValue());
            this.f47108d = null;
            this.f47109e = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        super.onStop(lifecycleOwner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.f47109e) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            long jInvoke = this.f47107c.invoke();
            this.f47108d = Long.valueOf(jInvoke);
            this.f47106b.a(jInvoke);
        }
    }
}
