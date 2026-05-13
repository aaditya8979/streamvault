package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5127t4 extends K2 {
    public C5127t4(@NonNull InterfaceC4900k2 interfaceC4900k2) {
        super(interfaceC4900k2);
    }

    @Override // io.appmetrica.analytics.impl.K2
    public final C4819go a(@NonNull C4767eo c4767eo, @Nullable C4819go c4819go, @NonNull InterfaceC4874j2 interfaceC4874j2) {
        if (c4819go == null || c4819go.f66882c.f66947b) {
            return this.f65460a.a(c4767eo, ((Bd) interfaceC4874j2).a());
        }
        c4819go.f66882c = new C4845ho();
        return c4819go;
    }
}
