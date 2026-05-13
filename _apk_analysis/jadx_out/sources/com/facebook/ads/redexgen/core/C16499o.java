package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16499o extends AbstractC3184oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC15184a.A0h(1);
    public static final String A03 = AbstractC15184a.A0h(2);
    public static final C1R<C16499o> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oS
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C16499o.A00(bundle);
        }
    };

    public C16499o() {
        this.A01 = false;
        this.A00 = false;
    }

    public C16499o(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static C16499o A00(Bundle bundle) {
        C3M.A07(bundle.getInt(AbstractC3184oU.A02, -1) == 3);
        return bundle.getBoolean(A04, false) ? new C16499o(bundle.getBoolean(A03, false)) : new C16499o();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16499o)) {
            return false;
        }
        C16499o c16499o = (C16499o) obj;
        return this.A00 == c16499o.A00 && this.A01 == c16499o.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
