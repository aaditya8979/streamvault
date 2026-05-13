package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5300d implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f68432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5306j f68433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn.g f68434d = kotlin.b.b(new C5297a(this));

    public C5300d(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f68431a = clientContext;
        this.f68432b = u10;
    }

    public static final Activity.ScreenCaptureCallback d(C5300d c5300d) {
        return (Activity.ScreenCaptureCallback) c5300d.f68434d.getValue();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f68431a.getActivityLifecycleRegistry().registerListener(new C5299c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5309m c5309m) {
        this.f68433c = c5309m != null ? c5309m.f68462a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }
}
