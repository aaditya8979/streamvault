package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class J3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(@NotNull Context context) {
        C4666b0 c4666b0B = C4696c4.l().b();
        c4666b0B.f66405c.a().executeDelayed(new C4640a0(c4666b0B, context), c4666b0B.f66406d);
    }
}
