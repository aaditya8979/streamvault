package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5303g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(@NotNull C5301e c5301e) {
        N n10 = new N();
        n10.f68397a = c5301e.f68436a;
        return n10;
    }

    @NotNull
    public final C5301e a(@NotNull N n10) {
        return new C5301e(n10.f68397a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5301e(((N) obj).f68397a);
    }
}
