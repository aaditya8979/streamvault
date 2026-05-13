package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5200w2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 fromModel(@NonNull C5250y2 c5250y2) {
        W1 w12 = new W1();
        EnumC5225x2 enumC5225x2 = c5250y2.f68002a;
        if (enumC5225x2 != null) {
            int iOrdinal = enumC5225x2.ordinal();
            if (iOrdinal == 0) {
                w12.f66073a = 6;
            } else if (iOrdinal == 1) {
                w12.f66073a = 1;
            } else if (iOrdinal == 2) {
                w12.f66073a = 2;
            } else if (iOrdinal == 3) {
                w12.f66073a = 3;
            } else if (iOrdinal == 4) {
                w12.f66073a = 4;
            } else if (iOrdinal != 5) {
                w12.f66073a = 0;
            } else {
                w12.f66073a = 5;
            }
        }
        Boolean bool = c5250y2.f68003b;
        if (bool != null) {
            if (bool.booleanValue()) {
                w12.f66074b = 1;
            } else {
                w12.f66074b = 0;
            }
        }
        return w12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5250y2 toModel(@NonNull W1 w12) {
        EnumC5225x2 enumC5225x2;
        Boolean bool = null;
        switch (w12.f66073a) {
            case 1:
                enumC5225x2 = EnumC5225x2.ACTIVE;
                break;
            case 2:
                enumC5225x2 = EnumC5225x2.WORKING_SET;
                break;
            case 3:
                enumC5225x2 = EnumC5225x2.FREQUENT;
                break;
            case 4:
                enumC5225x2 = EnumC5225x2.RARE;
                break;
            case 5:
                enumC5225x2 = EnumC5225x2.RESTRICTED;
                break;
            case 6:
                enumC5225x2 = EnumC5225x2.EXEMPTED;
                break;
            default:
                enumC5225x2 = null;
                break;
        }
        int i10 = w12.f66074b;
        if (i10 == 0) {
            bool = Boolean.FALSE;
        } else if (i10 == 1) {
            bool = Boolean.TRUE;
        }
        return new C5250y2(enumC5225x2, bool);
    }
}
