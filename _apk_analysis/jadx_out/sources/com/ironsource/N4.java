package com.ironsource;

import com.ironsource.AbstractC4211q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class N4<Smash extends AbstractC4211q3<?>> extends Lg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(int i10, boolean z10, @NotNull List<? extends Smash> list) {
        super(i10, z10, list);
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
    }

    @Override // com.ironsource.Lg
    public void c(@NotNull Smash smash) {
        tn.p.k(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
