package com.ironsource;

import com.ironsource.G;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4295v3 extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4295v3(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull yg ygVar) {
        super(abstractC4309w0, ygVar);
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(ygVar, "waterfallInstances");
    }

    @Override // com.ironsource.G
    public void a(@NotNull A a10, @NotNull G.b bVar) {
        String str;
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(bVar, "loadSelection");
        if (!a10.u()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.p() + " (non-bidder) is ready to load");
            bVar.a().add(a10);
            return;
        }
        bVar.a(true);
        if (bVar.e()) {
            str = "Advanced Loading: Starting to load bidder " + a10.p() + ". No other instances will be loaded at the same time.";
            bVar.a().add(a10);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + a10.p() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(a10.d().name() + " - " + str);
    }

    @Override // com.ironsource.G
    public boolean a(@NotNull G.b bVar) {
        tn.p.k(bVar, "loadSelection");
        return super.a(bVar) || bVar.d();
    }
}
