package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4147mc implements InterfaceC4129lc {
    @Override // com.ironsource.InterfaceC4129lc
    public void a(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        try {
            IronSourceNetwork.destroyAd(o92);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + o92.e() + " failed. error: " + e10.getMessage());
        }
    }
}
