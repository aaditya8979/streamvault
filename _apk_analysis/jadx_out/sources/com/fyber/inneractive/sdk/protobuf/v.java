package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f19254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19261l = Integer.MAX_VALUE;

    public v(ByteBuffer byteBuffer, boolean z10) {
        this.f19254e = byteBuffer;
        w3 w3Var = x3.f19289c;
        long j10 = w3Var.f19275a.getLong(byteBuffer, x3.f19293g);
        this.f19255f = j10;
        this.f19256g = ((long) byteBuffer.limit()) + j10;
        long jPosition = j10 + ((long) byteBuffer.position());
        this.f19257h = jPosition;
        this.f19258i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f19261l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - ((int) (this.f19257h - this.f19258i));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f19260k != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10, c2 c2Var, h0 h0Var) throws IOException {
        int i11 = this.f19262a;
        if (i11 >= this.f19263b) {
            throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.f19262a = i11 + 1;
        ((t0) c2Var).a(this, h0Var);
        a((i10 << 3) | 4);
        this.f19262a--;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f19262a >= this.f19263b) {
            throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iM);
        this.f19262a++;
        ((t0) c2Var).a(this, h0Var);
        a(0);
        this.f19262a--;
        this.f19261l = iD;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.f19257h - this.f19258i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f19261l = i10;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f19257h == this.f19256g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + ((int) (this.f19257h - this.f19258i));
        int i12 = this.f19261l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19261l = i11;
        z();
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f19256g;
            long j11 = this.f19257h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f19289c.a(j11, bArr, j12);
                this.f19257h += j12;
                q qVar = s.f19223b;
                return new q(bArr);
            }
        }
        if (iM == 0) {
            return s.f19223b;
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i10) throws n1 {
        int iT;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (((int) (this.f19256g - this.f19257h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f19257h;
                    this.f19257h = j10 + 1;
                    if (x3.f19289c.a(j10) < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                long j11 = this.f19257h;
                if (j11 == this.f19256g) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f19257h = j11 + 1;
                if (x3.f19289c.a(j11) < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            f(8);
            return true;
        }
        if (i11 == 2) {
            f(m());
            return true;
        }
        if (i11 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 == 5) {
            f(4);
            return true;
        }
        int i13 = n1.f19193a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            long j10 = this.f19256g;
            long j11 = this.f19257h;
            if (i10 <= ((int) (j10 - j11))) {
                this.f19257h = j11 + ((long) i10);
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[PHI: r6
      0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v.m():int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f19256g;
            long j11 = this.f19257h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f19289c.a(j11, bArr, j12);
                String str = new String(bArr, l1.f19181a);
                this.f19257h += j12;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f19256g;
            long j11 = this.f19257h;
            if (iM <= ((int) (j10 - j11))) {
                int i10 = (int) (j11 - this.f19255f);
                ByteBuffer byteBuffer = this.f19254e;
                z3 z3Var = d4.f19118a;
                z3Var.getClass();
                String strA = byteBuffer.hasArray() ? z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iM) : byteBuffer.isDirect() ? z3Var.b(byteBuffer, i10, iM) : z3.a(byteBuffer, i10, iM);
                this.f19257h += (long) iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f19260k = 0;
            return 0;
        }
        int iM = m();
        this.f19260k = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() throws n1 {
        long j10 = this.f19257h;
        if (this.f19256g - j10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19257h = 4 + j10;
        w3 w3Var = x3.f19289c;
        return ((w3Var.a(j10 + 3) & 255) << 24) | (w3Var.a(j10) & 255) | ((w3Var.a(1 + j10) & 255) << 8) | ((w3Var.a(2 + j10) & 255) << 16);
    }

    public final long x() throws n1 {
        long j10 = this.f19257h;
        if (this.f19256g - j10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19257h = 8 + j10;
        w3 w3Var = x3.f19289c;
        return ((((long) w3Var.a(j10 + 7)) & 255) << 56) | (((long) w3Var.a(j10)) & 255) | ((((long) w3Var.a(1 + j10)) & 255) << 8) | ((((long) w3Var.a(2 + j10)) & 255) << 16) | ((((long) w3Var.a(3 + j10)) & 255) << 24) | ((((long) w3Var.a(4 + j10)) & 255) << 32) | ((((long) w3Var.a(5 + j10)) & 255) << 40) | ((((long) w3Var.a(6 + j10)) & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        int i10;
        long j12 = this.f19257h;
        long j13 = 0;
        if (this.f19256g != j12) {
            long j14 = j12 + 1;
            w3 w3Var = x3.f19289c;
            byte bA = w3Var.a(j12);
            if (bA >= 0) {
                this.f19257h = j14;
                return bA;
            }
            if (this.f19256g - j14 >= 9) {
                long j15 = 2 + j12;
                int iA = (w3Var.a(j14) << 7) ^ bA;
                if (iA >= 0) {
                    long j16 = 3 + j12;
                    int iA2 = iA ^ (w3Var.a(j15) << 14);
                    if (iA2 >= 0) {
                        j10 = iA2 ^ 16256;
                        j15 = j16;
                    } else {
                        j15 = 4 + j12;
                        int iA3 = iA2 ^ (w3Var.a(j16) << 21);
                        if (iA3 < 0) {
                            i10 = (-2080896) ^ iA3;
                        } else {
                            long j17 = j12 + 5;
                            long jA = ((long) iA3) ^ (((long) w3Var.a(j15)) << 28);
                            if (jA >= 0) {
                                j10 = 266354560 ^ jA;
                                j15 = j17;
                            } else {
                                j15 = j12 + 6;
                                long jA2 = (((long) w3Var.a(j17)) << 35) ^ jA;
                                if (jA2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    long j18 = 7 + j12;
                                    long jA3 = jA2 ^ (((long) w3Var.a(j15)) << 42);
                                    if (jA3 >= 0) {
                                        j10 = 4363953127296L ^ jA3;
                                        j15 = j18;
                                    } else {
                                        j15 = j12 + 8;
                                        jA2 = jA3 ^ (((long) w3Var.a(j18)) << 49);
                                        if (jA2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            long j19 = 9 + j12;
                                            long jA4 = (jA2 ^ (((long) w3Var.a(j15)) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j20 = j12 + 10;
                                                if (w3Var.a(j19) >= 0) {
                                                    j15 = j20;
                                                }
                                            } else {
                                                j15 = j19;
                                            }
                                            j10 = jA4;
                                        }
                                    }
                                }
                                j10 = j11 ^ jA2;
                            }
                        }
                    }
                    this.f19257h = j15;
                    return j10;
                }
                i10 = iA ^ (-128);
                j10 = i10;
                this.f19257h = j15;
                return j10;
            }
        }
        for (int i11 = 0; i11 < 64; i11 += 7) {
            long j21 = this.f19257h;
            if (j21 == this.f19256g) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f19257h = j21 + 1;
            byte bA2 = x3.f19289c.a(j21);
            j13 |= ((long) (bA2 & 127)) << i11;
            if ((bA2 & 128) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        long j10 = this.f19256g + ((long) this.f19259j);
        this.f19256g = j10;
        int i10 = (int) (j10 - this.f19258i);
        int i11 = this.f19261l;
        if (i10 <= i11) {
            this.f19259j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f19259j = i12;
        this.f19256g = j10 - ((long) i12);
    }
}
