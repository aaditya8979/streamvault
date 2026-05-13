package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class D9 implements ProtobufConverter {
    @NotNull
    public final C9 a(@NotNull C5095rm c5095rm) {
        return new C9(c5095rm.f67630a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5095rm fromModel(@Nullable C9 c92) {
        C5095rm c5095rm = new C5095rm();
        if (c92 != null) {
            c5095rm.f67630a = c92.f65100a;
        }
        return c5095rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C9(((C5095rm) obj).f67630a);
    }
}
