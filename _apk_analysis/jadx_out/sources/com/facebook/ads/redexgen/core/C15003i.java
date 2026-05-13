package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15003i extends C1738Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C2532dO A01;
    public boolean A02;
    public final AbstractC2152Tf<C14953d> A03;
    public final AbstractC2152Tf<C3Y> A04;
    public final AbstractC2152Tf<DQ> A05;
    public final AbstractC2152Tf<C3Q> A06;
    public final AbstractC2152Tf<DL> A07;
    public final AbstractC2152Tf<DJ> A08;
    public final AbstractC2152Tf<DI> A09;
    public final AbstractC2152Tf<DD> A0A;
    public final AbstractC2152Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C15003i(C2529dL c2529dL, US us2, E1 e12, String str) {
        this(c2529dL, us2, e12, str, 0, 0, false, null, null);
    }

    public C15003i(C2529dL c2529dL, US us2, E1 e12, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c2529dL, us2, e12, str, !e12.A0p(), i10, i11, z10, bundle, map, new C1737Db(c2529dL, e12));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df2) {
                this.A00.A0f();
            }
        };
        this.A08 = new C1748Dm(this);
        this.A04 = new C1747Dl(this);
        this.A05 = new C1746Dk(this);
        this.A06 = new C1745Dj(this);
        this.A03 = new C1744Di(this);
        this.A07 = new C1743Dh(this);
        this.A0A = new C1742Dg(this);
        this.A0B = new C1741Df(this);
        this.A09 = new C1753Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e12;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c2529dL)) {
            this.A01 = new C2532dO(e12, str, z10, null);
        }
    }

    public C15003i(C2529dL c2529dL, US us2, E1 e12, String str, Bundle bundle, Map<String, String> map) {
        this(c2529dL, us2, e12, str, 0, 0, false, bundle, map);
    }

    @Override // com.facebook.ads.redexgen.core.C1738Dc
    public final void A0n(EnumC2536dS enumC2536dS, Map<String, String> map) {
        super.A0n(enumC2536dS, map);
        if (this.A01 == null || enumC2536dS != EnumC2536dS.A09) {
            return;
        }
        Map<String, String> mapA06 = this.A01.A06();
        String[] strArr = A0F;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0F[2] = "tc9";
        map.putAll(mapA06);
    }

    public final void A0p() {
        C1750Do c1750Do = new C1750Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c1750Do);
            return;
        }
        E1 e12 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e12.getStateHandler().post(c1750Do);
    }
}
