package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9I extends AbstractC3092my {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = AbstractC15184a.A07;

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        if (anonymousClass36.A02 != 2) {
            throw new AnonymousClass37(anonymousClass36);
        }
        this.A05 = true;
        return (this.A03 == 0 && this.A02 == 0) ? AnonymousClass36.A05 : anonymousClass36;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final void A0A() {
        if (this.A05) {
            this.A05 = false;
            this.A06 = new byte[this.A02 * super.A05.A00];
            this.A01 = this.A03 * super.A05.A00;
        }
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final void A0B() {
        if (this.A05) {
            if (this.A00 > 0) {
                this.A04 += (long) (this.A00 / super.A05.A00);
            }
            this.A00 = 0;
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D() {
        this.A04 = 0L;
    }

    public final void A0E(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my, com.facebook.ads.redexgen.core.AnonymousClass38
    public final ByteBuffer A8V() {
        if (super.AAG() && this.A00 > 0) {
            A00(this.A00).put(this.A06, 0, this.A00).flip();
            this.A00 = 0;
        }
        return super.A8V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my, com.facebook.ads.redexgen.core.AnonymousClass38
    public final boolean AAG() {
        return super.AAG() && this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.A01);
        this.A04 += (long) (iMin / super.A05.A00);
        this.A01 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.A01 > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.A00 + i11) - this.A06.length;
        ByteBuffer byteBufferA00 = A00(length);
        int iA07 = AbstractC15184a.A07(length, 0, this.A00);
        byteBufferA00.put(this.A06, 0, iA07);
        int iA072 = AbstractC15184a.A07(length - iA07, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iA072);
        byteBufferA00.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iA072;
        this.A00 -= iA07;
        System.arraycopy(this.A06, iA07, this.A06, 0, this.A00);
        byteBuffer.get(this.A06, this.A00, i12);
        this.A00 += i12;
        byteBufferA00.flip();
    }
}
