package com.ironsource;

import com.ironsource.G;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class K4 extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull yg ygVar) {
        super(abstractC4309w0, ygVar);
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(ygVar, "waterfallInstances");
    }

    @Override // com.ironsource.G
    public void a(@NotNull A a10, @NotNull G.b bVar) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(bVar, "loadSelection");
        IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is ready to load");
        bVar.a().add(a10);
    }
}
