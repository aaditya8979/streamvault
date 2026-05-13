package com.facebook.ads.redexgen.core;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2197Uz {
    public final InterfaceC2195Ux A0B;
    public final boolean A0F;
    public final String A0C = C2197Uz.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C2196Uy> A0D = new LinkedList();

    public C2197Uz(SQ sq2, InterfaceC2195Ux interfaceC2195Ux) {
        int iA0D = U9.A0D(sq2);
        if (iA0D < 1) {
            this.A0F = false;
        } else {
            this.A0F = sq2.A09().A00() < 1.0d / ((double) iA0D);
        }
        this.A0B = interfaceC2195Ux;
    }

    private int A00() {
        return this.A0B.A7V();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C2196Uy c2196Uy) {
        synchronized (this.A0D) {
            this.A0D.add(c2196Uy);
        }
    }

    public final void A04() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 110, A00(), null));
        }
    }

    public final void A05() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 106, A00(), null));
        }
    }

    public final void A06() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 104, A00(), null));
        }
    }

    public final void A07() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 109, -1, null));
        }
    }

    public final void A08() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 108, A00(), null));
        }
    }

    public final void A09() {
        if (this.A0F) {
            this.A00 = System.currentTimeMillis();
            A03(new C2196Uy(0, 101, -1, null));
        }
    }

    public final void A0A() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 105, A00(), null));
        }
    }

    public final void A0B() {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 102, A00(), null));
        }
    }

    public final void A0C(SQ sq2, String str) {
        if (this.A0F) {
            A03(new C2196Uy(A01(), 103, A00(), null));
            XU.A06.execute(new RunnableC2194Uw(this, str, sq2));
        }
    }
}
