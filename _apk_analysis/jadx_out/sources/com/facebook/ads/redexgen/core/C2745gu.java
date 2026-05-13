package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2745gu implements InterfaceC2007Nn {
    public final /* synthetic */ C2746gv A00;
    public final /* synthetic */ C2744gt A01;

    public C2745gu(C2744gt c2744gt, C2746gv c2746gv) {
        this.A01 = c2744gt;
        this.A00 = c2746gv;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Nn
    public final InterfaceC2006Nm A5K(InterfaceC1994Na interfaceC1994Na, AbstractC2763hD abstractC2763hD, HandlerC2001Nh handlerC2001Nh) {
        return new C2743gs(this.A00.A05(), this.A00, interfaceC1994Na, abstractC2763hD, handlerC2001Nh);
    }
}
