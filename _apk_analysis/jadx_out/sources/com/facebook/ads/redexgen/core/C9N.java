package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9N extends AbstractC3092my {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        int[] iArr = this.A01;
        if (iArr == null) {
            return AnonymousClass36.A05;
        }
        if (anonymousClass36.A02 != 2) {
            throw new AnonymousClass37(anonymousClass36);
        }
        boolean z10 = anonymousClass36.A01 != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= anonymousClass36.A01) {
                throw new AnonymousClass37(anonymousClass36);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AnonymousClass36(anonymousClass36.A03, iArr.length, 2) : AnonymousClass36.A05;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C3M.A01(this.A00);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * ((iLimit - iPosition) / this.A05.A00));
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(iLimit);
        byteBufferA00.flip();
    }
}
