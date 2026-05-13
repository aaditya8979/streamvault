package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2859ix implements InterfaceC15404w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC15374t A02;
    public InterfaceC15404w A04;
    public InterfaceC1956Ln A05;
    public boolean A07;
    public InterfaceC15404w A03 = new C3137nh();
    public InterfaceC1965Lw A06 = InterfaceC1965Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC15404w
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC3141nl interfaceC3141nl, int i10, int i11) {
        C2860iy c2860iyA59;
        InterfaceC1956Ln interfaceC1956Ln = (InterfaceC1956Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC3141nl == null) {
            c2860iyA59 = null;
        } else if (this.A02 != null) {
            InterfaceC15374t interfaceC15374t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c2860iyA59 = interfaceC15374t.A59();
        } else {
            c2860iyA59 = new C2861iz().A00(interfaceC1956Ln).A59();
        }
        return new C7S(interfaceC1956Ln, interfaceC3141nl, this.A03.A5A(), c2860iyA59, this.A06, i10, null, i11, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C2859ix A03(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2859ix A04(InterfaceC15404w interfaceC15404w) {
        this.A03 = interfaceC15404w;
        return this;
    }

    public final C2859ix A05(InterfaceC15404w interfaceC15404w) {
        this.A04 = interfaceC15404w;
        return this;
    }

    public final C2859ix A06(InterfaceC1956Ln interfaceC1956Ln) {
        this.A05 = interfaceC1956Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, -1000);
    }
}
