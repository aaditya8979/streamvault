package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3235pb {
    public static C3235pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3246pm A02;

    public C3235pb(ViewpointQeConfig viewpointQeConfig, AbstractC3251ps abstractC3251ps, C3246pm c3246pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3246pm;
        abstractC3251ps.A03(new A4(c3246pm));
    }

    public static C3235pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC3251ps abstractC3251ps, InterfaceC3256px interfaceC3256px, A6 a62) {
        C3235pb c3235pb = A03;
        if (c3235pb != null) {
            return c3235pb;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C3235pb(viewpointQeConfig, abstractC3251ps, new C3246pm(viewpointQeConfig, interfaceC3256px, C1692Bg.A00, a62, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC3250pr interfaceC3250pr) {
        this.A02.A0E(interfaceC3250pr);
    }

    public final void A02(InterfaceC3248pp interfaceC3248pp) {
        this.A02.A0F(interfaceC3248pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C3257q0 c3257q0) {
        if (!this.A00.A00 || c3257q0 == null) {
            this.A01.A05(dspViewableNode);
        } else {
            this.A01.A06(dspViewableNode, c3257q0);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C3257q0 c3257q0, C3253pu c3253pu) {
        if (!this.A00.A00 || c3257q0 == null) {
            this.A01.A08(dspViewableNode, c3253pu);
        } else {
            this.A01.A07(dspViewableNode, c3257q0, c3253pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C3253pu c3253pu) {
        A05(dspViewableNode, null, c3253pu);
    }
}
