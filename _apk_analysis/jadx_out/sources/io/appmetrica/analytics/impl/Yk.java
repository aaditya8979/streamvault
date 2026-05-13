package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Yk extends K2 {
    public Yk(@NonNull InterfaceC4900k2 interfaceC4900k2) {
        super(interfaceC4900k2);
    }

    @Override // io.appmetrica.analytics.impl.K2
    public final C4819go a(@NonNull C4767eo c4767eo, @Nullable C4819go c4819go, @NonNull InterfaceC4874j2 interfaceC4874j2) {
        if (c4819go != null && !c4819go.f66882c.f66947b) {
            return null;
        }
        C4819go c4819goA = ((Bd) interfaceC4874j2).a();
        c4819goA.f66882c.f66946a = true;
        return this.f65460a.a(c4767eo, c4819goA);
    }
}
