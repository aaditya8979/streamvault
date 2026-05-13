package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16539s extends AbstractC3184oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC15184a.A0h(1);
    public static final String A03 = AbstractC15184a.A0h(2);
    public static final C1R<C16539s> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.op
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C16539s.A00(bundle);
        }
    };

    public C16539s() {
        this.A01 = false;
        this.A00 = false;
    }

    public C16539s(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static C16539s A00(Bundle bundle) {
        C3M.A07(bundle.getInt(AbstractC3184oU.A02, -1) == 0);
        return bundle.getBoolean(A04, false) ? new C16539s(bundle.getBoolean(A03, false)) : new C16539s();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16539s)) {
            return false;
        }
        C16539s c16539s = (C16539s) obj;
        return this.A00 == c16539s.A00 && this.A01 == c16539s.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
