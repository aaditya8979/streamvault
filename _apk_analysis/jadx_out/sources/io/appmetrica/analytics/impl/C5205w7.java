package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5205w7 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4829h8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC5255y7.f68030a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC5255y7.f68030a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC5255y7.f68031b) >= 0) {
                Pair pairA = bn.h.a(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
                C5230x7 c5230x7 = new C5230x7(((Number) pairA.getFirst()).longValue(), ((Number) pairA.getSecond()).intValue());
                C4829h8 c4829h8 = new C4829h8();
                c4829h8.f66896a = c5230x7.f67931a;
                c4829h8.f66897b = c5230x7.f67932b;
                return c4829h8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
    }

    @NonNull
    public final BigDecimal a(@NonNull C4829h8 c4829h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
