package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4304vc implements InterfaceC4287uc {
    @Override // com.ironsource.InterfaceC4287uc
    @NotNull
    public String a() {
        String version = IronSourceNetwork.getVersion();
        tn.p.j(version, "getVersion()");
        return version;
    }

    @Override // com.ironsource.InterfaceC4287uc
    public void a(@NotNull O9 o92, @NotNull C4321wc c4321wc) throws Exception {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(c4321wc, "loadParams");
        IronSourceNetwork.loadAd(o92, c4321wc.a());
    }
}
