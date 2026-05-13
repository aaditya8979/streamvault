package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9J extends AbstractC3092my {
    public static String[] A0C = {"kTOKNBh1Wp6avXYwKxrfNqHQCe6IowZb", "fsh7jTNUZTGCSew0VT63IO4tkQUYppyQ", "CGsUWOpaOXfE7pNtsFBesiWCOQ75lYHg", "3QzqyUj5HYGt0uXrFXWs5fdma44AOfyL", "C3DxIlHWWAPwLuHgY8W8WEDh6NP", "cCeo7h1kMT8v6dcJbz1RM5PEEOyjnS1I", "8Ip3ivaO", "u5WK46JzMVMnhOVxX0VDjJ353j7WObAc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public final long A09;
    public final long A0A;
    public final short A0B;

    public C9J() {
        this(150000L, 20000L, (short) 1024);
    }

    public C9J(long j10, long j11, short s10) {
        C3M.A07(j11 <= j10);
        this.A09 = j10;
        this.A0A = j11;
        this.A0B = s10;
        this.A07 = AbstractC15184a.A07;
        this.A08 = AbstractC15184a.A07;
    }

    private int A00(long j10) {
        return (int) ((((long) super.A05.A03) * j10) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 2; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.getShort(iLimit)) > this.A0B) {
                return (this.A00 * (iLimit / this.A00)) + this.A00;
            }
        }
        return byteBuffer.position();
    }

    private int A02(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.A0B) {
                return this.A00 * (iPosition / this.A00);
            }
        }
        return byteBuffer.limit();
    }

    private void A03(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        A00(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.A06 = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        int iPosition = iA02 - byteBuffer.position();
        int length = this.A07.length - this.A01;
        if (iA02 < iLimit && iPosition < length) {
            byte[] bArr = this.A07;
            int i10 = this.A01;
            if (A0C[4].length() == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "id1mOky4Zsioh8kkFhZ0Iqg9uH7l7sht";
            strArr[7] = "uHcgX8Q5LBy4SketH3HUZ8MVXP73GzFI";
            A08(bArr, i10);
            this.A01 = 0;
            this.A03 = 0;
            return;
        }
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.A07, this.A01, iMin);
        this.A01 += iMin;
        if (this.A01 == this.A07.length) {
            if (this.A06) {
                A08(this.A07, this.A02);
                this.A04 += (long) ((this.A01 - (this.A02 * 2)) / this.A00);
            } else {
                this.A04 += (long) ((this.A01 - this.A02) / this.A00);
            }
            A07(byteBuffer, this.A07, this.A01);
            this.A01 = 0;
            this.A03 = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.A07.length));
        int iA01 = A01(byteBuffer);
        if (iA01 == byteBuffer.position()) {
            this.A03 = 1;
        } else {
            byteBuffer.limit(iA01);
            A03(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        this.A04 += (long) (byteBuffer.remaining() / this.A00);
        A07(byteBuffer, this.A08, this.A02);
        if (iA02 < iLimit) {
            A08(this.A08, this.A02);
            this.A03 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A07(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.A02);
        int i11 = this.A02 - iMin;
        System.arraycopy(bArr, i10 - i11, this.A08, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.A08, i11, iMin);
    }

    private void A08(byte[] bArr, int i10) {
        A00(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.A06 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        if (anonymousClass36.A02 == 2) {
            return this.A05 ? anonymousClass36 : AnonymousClass36.A05;
        }
        throw new AnonymousClass37(anonymousClass36);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final void A0A() {
        if (this.A05) {
            this.A00 = super.A05.A00;
            int iA00 = A00(this.A09) * this.A00;
            if (this.A07.length != iA00) {
                this.A07 = new byte[iA00];
            }
            this.A02 = A00(this.A0A) * this.A00;
            if (this.A08.length != this.A02) {
                this.A08 = new byte[this.A02];
            }
        }
        this.A03 = 0;
        this.A04 = 0L;
        this.A01 = 0;
        this.A06 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my
    public final void A0B() {
        if (this.A01 > 0) {
            A08(this.A07, this.A01);
        }
        boolean z10 = this.A06;
        if (A0C[0].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A0C[3] = "3PybTV2kdzhjV0AdFBUr0i874h0Ge15Q";
        if (z10) {
            return;
        }
        this.A04 += (long) (this.A02 / this.A00);
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D(boolean z10) {
        this.A05 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3092my, com.facebook.ads.redexgen.core.AnonymousClass38
    public final boolean AAC() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !A01()) {
            switch (this.A03) {
                case 0:
                    A05(byteBuffer);
                    break;
                case 1:
                    A04(byteBuffer);
                    break;
                case 2:
                    A06(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }
}
