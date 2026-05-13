package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1695Bj implements InterfaceC2650fK {
    public final EnumC2642fC A00;
    public final AbstractC14671z A01;

    public AbstractC1695Bj(AbstractC14671z abstractC14671z, EnumC2642fC enumC2642fC) {
        this.A01 = abstractC14671z;
        this.A00 = enumC2642fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2650fK
    public void A45(Map<InterfaceC2633f2, EnumC2655fP> map, Map<SyncModifiableBundle, EnumC2642fC> map2) {
        map2.put(null, this.A00);
    }
}
