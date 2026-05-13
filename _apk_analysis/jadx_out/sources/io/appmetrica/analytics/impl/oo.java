package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class oo implements La {
    @Override // io.appmetrica.analytics.impl.La
    @Nullable
    public final String a(@NotNull Context context) {
        C4920km c4920km;
        try {
            Rm rmA = Qm.a(C4920km.class);
            if (rmA != null) {
                Sm sm2 = (Sm) rmA;
                ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                if (protobufStateStorageA != null && (c4920km = (C4920km) protobufStateStorageA.read()) != null) {
                    return c4920km.f67146a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
