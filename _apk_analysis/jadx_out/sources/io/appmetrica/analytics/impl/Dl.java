package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class Dl implements ProtobufConverter {
    @NonNull
    public final El a(@NonNull C4646a6 c4646a6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4646a6 fromModel(@NonNull El el2) {
        C4646a6 c4646a6 = new C4646a6();
        c4646a6.f66337a = (String) WrapUtils.getOrDefault(el2.f65216a, c4646a6.f66337a);
        c4646a6.f66338b = (String) WrapUtils.getOrDefault(el2.f65217b, c4646a6.f66338b);
        c4646a6.f66339c = ((Integer) WrapUtils.getOrDefault(el2.f65218c, Integer.valueOf(c4646a6.f66339c))).intValue();
        c4646a6.f66342f = ((Integer) WrapUtils.getOrDefault(el2.f65219d, Integer.valueOf(c4646a6.f66342f))).intValue();
        c4646a6.f66340d = (String) WrapUtils.getOrDefault(el2.f65220e, c4646a6.f66340d);
        c4646a6.f66341e = ((Boolean) WrapUtils.getOrDefault(el2.f65221f, Boolean.valueOf(c4646a6.f66341e))).booleanValue();
        return c4646a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
