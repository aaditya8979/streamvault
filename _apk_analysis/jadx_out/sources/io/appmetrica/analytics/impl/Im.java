package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes7.dex */
public final class Im implements ProtobufConverter {
    @NonNull
    public final Hm a(@NonNull C5220wm c5220wm) {
        return new Hm(c5220wm.f67913a);
    }

    @NonNull
    public final C5220wm a(@NonNull Hm hm2) {
        C5220wm c5220wm = new C5220wm();
        c5220wm.f67913a = hm2.f65339a;
        return c5220wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5220wm c5220wm = new C5220wm();
        c5220wm.f67913a = ((Hm) obj).f65339a;
        return c5220wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Hm(((C5220wm) obj).f67913a);
    }
}
