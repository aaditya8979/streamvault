package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2826iO extends AbstractRunnableC2216Vt {
    public final /* synthetic */ C2825iN A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2826iO(C2825iN c2825iN, Map map, Map map2) {
        this.A00 = c2825iN;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        if (TextUtils.isEmpty(this.A00.A01.A7G())) {
            return;
        }
        HashMap map = new HashMap();
        map.putAll(this.A02);
        map.putAll(this.A01);
        this.A00.A0A.A0A().ABT(this.A00.A01.A7G(), map);
    }
}
