package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1815Gb {
    public static final InterfaceC1815Gb A00 = new InterfaceC1815Gb() { // from class: com.facebook.ads.redexgen.X.lL
        @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
        public final GX[] A5F() {
            return AbstractC1814Ga.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1814Ga.A01(this, uri, map);
        }
    };

    GX[] A5F();

    GX[] A5G(Uri uri, Map<String, List<String>> map);
}
