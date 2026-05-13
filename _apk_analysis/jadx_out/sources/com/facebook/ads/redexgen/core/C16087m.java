package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16087m {
    public static final C16087m A03;
    public final String A00;
    public final C16077l A01;
    public final Object A02;

    static {
        A03 = AbstractC15184a.A02 < 31 ? new C16087m("") : new C16087m(C16077l.A01, "");
    }

    public C16087m(C16077l c16077l, String str) {
        this.A01 = c16077l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C16087m(String str) {
        C3M.A08(AbstractC15184a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C16077l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16087m)) {
            return false;
        }
        C16087m c16087m = (C16087m) obj;
        return Objects.equals(this.A00, c16087m.A00) && Objects.equals(this.A01, c16087m.A01) && Objects.equals(this.A02, c16087m.A02);
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
