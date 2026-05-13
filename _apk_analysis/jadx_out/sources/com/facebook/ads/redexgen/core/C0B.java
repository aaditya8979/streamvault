package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0B extends C0E {
    @Override // com.facebook.ads.redexgen.core.P2
    public final PK A07(View view, PK pk2) {
        WindowInsets windowInsets = (WindowInsets) PK.A01(pk2);
        WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return PK.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.core.P2
    public final PK A08(View view, PK pk2) {
        WindowInsets windowInsets = (WindowInsets) PK.A01(pk2);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return PK.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.core.P2
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.P2
    public final void A0E(View view, InterfaceC2031On interfaceC2031On) {
        if (interfaceC2031On == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new P1(this, interfaceC2031On));
        }
    }
}
