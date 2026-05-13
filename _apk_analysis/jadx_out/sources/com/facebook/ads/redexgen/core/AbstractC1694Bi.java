package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1694Bi implements InterfaceC2650fK {
    public final By A00;
    public final EnumC2655fP A01;

    public AbstractC1694Bi(By by, EnumC2655fP enumC2655fP) {
        this.A00 = by;
        this.A01 = enumC2655fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2650fK
    public void A45(Map<InterfaceC2633f2, EnumC2655fP> map, Map<SyncModifiableBundle, EnumC2642fC> map2) {
        map.put(this.A00, this.A01);
    }
}
