package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5058q9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008o9 fromModel(@NonNull C5033p9 c5033p9) {
        C5008o9 c5008o9 = new C5008o9();
        String str = c5033p9.f67514a;
        if (str != null) {
            c5008o9.f67417a = str.getBytes();
        }
        return c5008o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5033p9 toModel(@NonNull C5008o9 c5008o9) {
        return new C5033p9(new String(c5008o9.f67417a));
    }
}
