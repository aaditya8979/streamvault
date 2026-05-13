package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3167oC implements C1S {
    public final C3172oH A00;
    public final AbstractC1673Am<Integer> A01;
    public static final String A04 = AbstractC15184a.A0h(0);
    public static final String A03 = AbstractC15184a.A0h(1);
    public static final C1R<C3167oC> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oD
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C3167oC.A00(bundle);
        }
    };

    public C3167oC(C3172oH c3172oH, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c3172oH.A01)) {
            throw new IndexOutOfBoundsException();
        }
        this.A00 = c3172oH;
        this.A01 = AbstractC1673Am.A05(list);
    }

    public static /* synthetic */ C3167oC A00(Bundle bundle) {
        return new C3167oC((C3172oH) C3172oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A04))), AD.A0A((int[]) C3M.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3167oC c3167oC = (C3167oC) obj;
        return this.A00.equals(c3167oC.A00) && this.A01.equals(c3167oC.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
