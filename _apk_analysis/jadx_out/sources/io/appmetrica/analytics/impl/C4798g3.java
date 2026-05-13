package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4798g3 implements ProtobufConverter {
    @NonNull
    public final C4746e3 a(@NonNull C5046pm c5046pm) {
        return new C4746e3(c5046pm.f67541a);
    }

    @NonNull
    public final C5046pm a(@NonNull C4746e3 c4746e3) {
        C5046pm c5046pm = new C5046pm();
        c5046pm.f67541a = c4746e3.f66649a;
        return c5046pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5046pm c5046pm = new C5046pm();
        c5046pm.f67541a = ((C4746e3) obj).f66649a;
        return c5046pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C4746e3(((C5046pm) obj).f67541a);
    }
}
