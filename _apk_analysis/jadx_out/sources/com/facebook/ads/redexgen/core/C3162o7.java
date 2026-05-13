package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3162o7 implements C1S {
    public final int A00;
    public final C3172oH A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = AbstractC15184a.A0h(0);
    public static final String A09 = AbstractC15184a.A0h(1);
    public static final String A08 = AbstractC15184a.A0h(3);
    public static final String A06 = AbstractC15184a.A0h(4);
    public static final C1R<C3162o7> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.o8
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C3162o7.A00(bundle);
        }
    };

    public C3162o7(C3172oH c3172oH, boolean z10, int[] iArr, boolean[] zArr) {
        this.A00 = c3172oH.A01;
        boolean z11 = false;
        C3M.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c3172oH;
        if (z10 && this.A00 > 1) {
            z11 = true;
        }
        this.A02 = z11;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C3162o7 A00(Bundle bundle) {
        C3172oH c3172oH = (C3172oH) C3172oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A07)));
        return new C3162o7(c3172oH, bundle.getBoolean(A06, false), (int[]) AbstractC2863j1.A00(bundle.getIntArray(A09), new int[c3172oH.A01]), (boolean[]) AbstractC2863j1.A00(bundle.getBooleanArray(A08), new boolean[c3172oH.A01]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3162o7 c3162o7 = (C3162o7) obj;
        return this.A02 == c3162o7.A02 && this.A01.equals(c3162o7.A01) && Arrays.equals(this.A03, c3162o7.A03) && Arrays.equals(this.A04, c3162o7.A04);
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
