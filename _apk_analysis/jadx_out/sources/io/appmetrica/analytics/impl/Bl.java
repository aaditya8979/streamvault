package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Bl implements L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65056a;

    public Bl(@NotNull Context context) {
        this.f65056a = context;
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.impl.InterfaceC4946lm
    public final void a(@NotNull C4817gm c4817gm) {
    }

    @NotNull
    public final Context b() {
        return this.f65056a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
