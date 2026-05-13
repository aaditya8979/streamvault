package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class X7 implements N1 {
    @Override // com.ironsource.N1
    public void a(@NotNull InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(interfaceC4145ma);
    }

    @Override // com.ironsource.N1
    public void b(@NotNull InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(interfaceC4145ma);
    }
}
