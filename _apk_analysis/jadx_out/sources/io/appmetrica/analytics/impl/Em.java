package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Em implements ProtobufConverter {
    @NotNull
    public final Dm a(@NotNull C5195vm c5195vm) {
        return new Dm(c5195vm.f67864a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5195vm fromModel(@NotNull Dm dm2) {
        C5195vm c5195vm = new C5195vm();
        c5195vm.f67864a = dm2.f65166a;
        return c5195vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C5195vm) obj).f67864a);
    }
}
