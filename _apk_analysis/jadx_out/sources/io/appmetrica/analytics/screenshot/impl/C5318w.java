package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5318w implements InterfaceC5305i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f68480b;

    public C5318w(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f68479a = clientContext;
        this.f68480b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5305i
    @NotNull
    public final List<T> a() {
        return cn.w.p(new C5300d(this.f68479a, this.f68480b), new C5317v(this.f68479a, this.f68480b), new g0(this.f68479a, this.f68480b));
    }
}
