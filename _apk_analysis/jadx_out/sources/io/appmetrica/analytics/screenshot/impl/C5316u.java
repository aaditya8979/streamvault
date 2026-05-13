package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5316u implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5317v f68474a;

    public C5316u(C5317v c5317v) {
        this.f68474a = c5317v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = AbstractC5315t.f68473a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C5307k c5307k = this.f68474a.f68477c;
                if (c5307k == null || !c5307k.f68452a) {
                } else {
                    this.f68474a.f68475a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f68474a.f68478d);
                }
            } else if (i10 != 2) {
            } else {
                this.f68474a.f68475a.getContext().getContentResolver().unregisterContentObserver(this.f68474a.f68478d);
            }
        } catch (Throwable unused) {
        }
    }
}
