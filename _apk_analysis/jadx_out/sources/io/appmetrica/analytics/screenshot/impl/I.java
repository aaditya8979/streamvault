package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class I implements InterfaceC5305i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f68389b;

    public I(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f68388a = clientContext;
        this.f68389b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5305i
    @NotNull
    public final List<T> a() {
        return cn.w.p(new C5317v(this.f68388a, this.f68389b), new g0(this.f68388a, this.f68389b));
    }
}
