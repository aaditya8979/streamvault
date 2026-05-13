package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull C5312p c5312p) {
        O o10 = new O();
        o10.f68399a = c5312p.f68469a;
        Object[] array = c5312p.f68470b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o10.f68401c = (String[]) array;
        o10.f68400b = c5312p.f68471c;
        return o10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5312p toModel(@NotNull O o10) {
        return new C5312p(o10.f68399a, cn.r.G0(o10.f68401c), o10.f68400b);
    }
}
