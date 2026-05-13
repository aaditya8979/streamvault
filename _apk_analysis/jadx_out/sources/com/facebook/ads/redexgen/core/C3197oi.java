package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3197oi implements C1S {
    public final C3201om A00;

    @Deprecated
    public final C16529r A01;
    public final C3199ok A02;
    public final C2Q A03;

    @Deprecated
    public final C3198oj A04;
    public final C3195og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C3197oi A09 = new C2I().A05();
    public static final C1R<C3197oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C3197oi.A00(bundle);
        }
    };

    public C3197oi(String str, C16529r c16529r, C3198oj c3198oj, C3199ok c3199ok, C3195og c3195og) {
        this.A06 = str;
        this.A03 = c3198oj;
        this.A04 = c3198oj;
        this.A02 = c3199ok;
        this.A05 = c3195og;
        this.A00 = c16529r;
        this.A01 = c16529r;
    }

    public static C3197oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C3199ok c3199ok = bundle2 == null ? C3199ok.A07 : (C3199ok) C3199ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C3195og c3195og = bundle3 == null ? C3195og.A0Z : (C3195og) C3195og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C3197oi(str, bundle4 == null ? C16529r.A00 : (C16529r) C3201om.A05.A6X(bundle4), null, c3199ok, c3195og);
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3197oi)) {
            return false;
        }
        C3197oi c3197oi = (C3197oi) obj;
        if (AbstractC15184a.A1E(this.A06, c3197oi.A06)) {
            C3201om c3201om = this.A00;
            C3201om c3201om2 = c3197oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c3201om.equals(c3201om2) && AbstractC15184a.A1E(this.A03, c3197oi.A03) && AbstractC15184a.A1E(this.A02, c3197oi.A02) && AbstractC15184a.A1E(this.A05, c3197oi.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.A06.hashCode() * 31) + (this.A03 != null ? this.A03.hashCode() : 0)) * 31) + this.A02.hashCode()) * 31;
        C3201om c3201om = this.A00;
        String[] strArr = A07;
        if (strArr[4].charAt(31) != strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        return ((iHashCode + c3201om.hashCode()) * 31) + this.A05.hashCode();
    }
}
