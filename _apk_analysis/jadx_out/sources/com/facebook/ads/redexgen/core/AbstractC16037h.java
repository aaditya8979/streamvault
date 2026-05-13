package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC16037h implements InterfaceC2945kN {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C14350t A02;
    public final ArrayDeque<C14350t> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC16047i> A04;
    public final PriorityQueue<C14350t> A05;

    public AbstractC16037h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C14350t());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque<AbstractC16047i> arrayDeque = this.A04;
            final C5S c5s = new C5S() { // from class: com.facebook.ads.redexgen.X.kL
                @Override // com.facebook.ads.redexgen.core.C5S
                public final void AGz(AbstractC3127nX abstractC3127nX) {
                    this.A00.A0c((C14340s) abstractC3127nX);
                }
            };
            arrayDeque.add(new AbstractC16047i(c5s) { // from class: com.facebook.ads.redexgen.X.0s
                public C5S<C14340s> A00;

                {
                    this.A00 = c5s;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC16047i, com.facebook.ads.redexgen.core.AbstractC3127nX
                public final void A0B() {
                    this.A00.AGz(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C14350t c14350t) {
        c14350t.A0A();
        this.A03.add(c14350t);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C16057j A5j() throws C2944kM {
        C3M.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        return null;
     */
    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.ads.redexgen.core.AbstractC16047i A5l() throws com.facebook.ads.redexgen.core.C2944kM {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC16037h.A5l():com.facebook.ads.redexgen.X.7i");
    }

    public final AbstractC16047i A0Y() {
        return this.A04.pollFirst();
    }

    public abstract C2940kI A0Z();

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGZ(C16057j c16057j) throws C2944kM {
        C3M.A07(c16057j == this.A02);
        C14350t c14350t = (C14350t) c16057j;
        if (c14350t.A04()) {
            A0U(c14350t);
        } else {
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c14350t.A00 = j10;
            this.A05.add(c14350t);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public abstract void A0b(C16057j c16057j);

    public final void A0c(AbstractC16047i abstractC16047i) {
        abstractC16047i.A0A();
        this.A04.add(abstractC16047i);
    }

    public abstract boolean A0d();

    @Override // com.facebook.ads.redexgen.core.C5O
    public void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2945kN
    public void AIx(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C14350t) AbstractC15184a.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
