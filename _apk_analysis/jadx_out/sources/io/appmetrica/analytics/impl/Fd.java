package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Fd implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Ed f65247a = new Ed();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f65248b = kotlin.collections.a.m(bn.h.a(NativeCrashSource.UNKNOWN, 0), bn.h.a(NativeCrashSource.CRASHPAD, 3));

    @NotNull
    public final Ld a(@NotNull W5 w52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NotNull Ld ld2) {
        W5 w52 = new W5();
        w52.f66089f = 1;
        V5 v52 = new V5();
        v52.f66023a = ld2.f65529a;
        Z5 z52 = new Z5();
        Integer num = (Integer) f65248b.get(ld2.f65530b.f65358a);
        if (num != null) {
            z52.f66284a = num.intValue();
        }
        String str = ld2.f65530b.f65359b;
        if (str == null) {
            str = "";
        }
        z52.f66285b = str;
        v52.f66024b = z52;
        w52.f66090g = v52;
        return w52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }
}
