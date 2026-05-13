package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Ri implements InterfaceC5157u9 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5157u9
    @Nullable
    public final Integer a(@NonNull O8 o82) {
        EnumC4703cb enumC4703cb = o82.f65695h;
        if (enumC4703cb != null) {
            return (Integer) Qf.f65815c.get(enumC4703cb);
        }
        Map map = Qf.f65813a;
        return null;
    }
}
