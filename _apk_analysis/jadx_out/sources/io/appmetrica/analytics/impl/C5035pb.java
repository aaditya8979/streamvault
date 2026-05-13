package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5035pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f67516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f67517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC5060qb f67518c;

    public C5035pb(Handler handler, J2 j22) {
        this.f67516a = handler;
        this.f67517b = j22;
        this.f67518c = new RunnableC5060qb(handler, j22);
    }

    public static void a(Handler handler, J2 j22, Runnable runnable) {
        handler.removeCallbacks(runnable, j22.f65393b.f65350b.getApiKey());
        handler.postAtTime(runnable, j22.f65393b.f65350b.getApiKey(), SystemClock.uptimeMillis() + ((long) (((Integer) WrapUtils.getOrDefault(j22.f65393b.f65350b.getSessionTimeout(), 10)).intValue() * 500)));
    }
}
