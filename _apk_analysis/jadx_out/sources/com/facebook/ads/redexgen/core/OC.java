package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C14230h A00;

    public OC(C14230h c14230h) {
        this.A00 = c14230h;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C15766g c15766g, int i10) {
        int iA25;
        InterfaceC2267Xu interfaceC2267Xu;
        super.A0L(c15766g, i10);
        C2709gI layoutManager = this.A00.getLayoutManager();
        if (layoutManager != null && (iA25 = layoutManager.A25()) >= 0) {
            C14230h c14230h = this.A00;
            if (A01[3].charAt(13) == '0') {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c14230h.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC2267Xu = (InterfaceC2267Xu) c15766g.A1F(iA25)) == null) {
                return;
            }
            interfaceC2267Xu.AIV();
        }
    }
}
