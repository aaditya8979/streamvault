package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3052mK implements InterfaceC1771Ej, CD {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public AnonymousClass56 A01;
    public H1 A02;
    public boolean A04;
    public final Uri A06;
    public final C3W A07;
    public final C16369b A08;
    public final InterfaceC1711Cb A09;
    public final GY A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C9A A0D;
    public final C1833Gt A0B = new C1833Gt();
    public boolean A03 = true;
    public final long A05 = CE.A00();

    public C3052mK(C9A c9a, Uri uri, InterfaceC3141nl interfaceC3141nl, InterfaceC1711Cb interfaceC1711Cb, GY gy, C3W c3w) {
        this.A0D = c9a;
        this.A06 = uri;
        this.A08 = new C16369b(interfaceC3141nl);
        this.A09 = interfaceC1711Cb;
        this.A0A = gy;
        this.A07 = c3w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j10, long j11) {
        this.A0B.A00 = j10;
        this.A00 = j11;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1771Ej
    public final void A4j() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1771Ej
    public final void AAi() throws IOException {
        int iAGc = 0;
        while (iAGc == 0 && !this.A0C) {
            try {
                long j10 = this.A0B.A00;
                this.A01 = new AnonymousClass56(this.A06, j10, -1L, this.A0D.A0b);
                long jAFy = this.A08.AFy(this.A01);
                if (jAFy != -1) {
                    jAFy += j10;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC3141nl interfaceC3141nl = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final C16369b c16369b = this.A08;
                    final int i10 = this.A0D.A09.A01;
                    interfaceC3141nl = new InterfaceC3141nl(c16369b, i10, this) { // from class: com.facebook.ads.redexgen.X.9B
                        public int A00;
                        public final int A01;
                        public final InterfaceC3141nl A02;
                        public final CD A03;
                        public final byte[] A04;

                        {
                            C3M.A07(i10 > 0);
                            this.A02 = c16369b;
                            this.A01 = i10;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i10;
                        }

                        private boolean A00() throws IOException {
                            if (this.A02.read(this.A04, 0, 1) == -1) {
                                return false;
                            }
                            int i11 = (this.A04[0] & 255) << 4;
                            if (i11 == 0) {
                                return true;
                            }
                            int i12 = 0;
                            int i13 = i11;
                            byte[] bArr = new byte[i11];
                            while (i13 > 0) {
                                int i14 = this.A02.read(bArr, i12, i13);
                                if (i14 == -1) {
                                    return false;
                                }
                                i12 += i14;
                                i13 -= i14;
                            }
                            while (i11 > 0 && bArr[i11 - 1] == 0) {
                                i11--;
                            }
                            if (i11 > 0) {
                                this.A03.ADR(new C4J(bArr, i11));
                            }
                            return true;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3141nl
                        public final void A3v(C5H c5h) {
                            C3M.A01(c5h);
                            this.A02.A3v(c5h);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3141nl
                        public final Map<String, List<String>> A8l() {
                            return this.A02.A8l();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3141nl
                        public final Uri A9H() {
                            return this.A02.A9H();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3141nl
                        public final long AFy(AnonymousClass56 anonymousClass56) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3141nl
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i11, int i12) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int i13 = this.A02.read(bArr, i11, Math.min(this.A00, i12));
                            if (i13 != -1) {
                                this.A00 -= i13;
                            }
                            return i13;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6W(C9A.A0g);
                }
                this.A09.AA3(interfaceC3141nl, this.A06, this.A08.A8l(), j10, jAFy, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5q();
                }
                if (this.A03) {
                    this.A09.AIM(j10, this.A00);
                    this.A03 = false;
                }
                while (iAGc == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        iAGc = this.A09.AGc(this.A0B);
                        long jA7S = this.A09.A7S();
                        if (jA7S > this.A0D.A0M + j10) {
                            j10 = jA7S;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iAGc == 1) {
                    iAGc = 0;
                } else {
                    long jA7S2 = this.A09.A7S();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (jA7S2 != -1) {
                        this.A0B.A00 = this.A09.A7S();
                    }
                }
                AnonymousClass51.A00(this.A08);
            } catch (Throwable th2) {
                if (iAGc != 1 && this.A09.A7S() != -1) {
                    this.A0B.A00 = this.A09.A7S();
                }
                AnonymousClass51.A00(this.A08);
                throw th2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.CD
    public final void ADR(C4J c4j) {
        long jMax = !this.A04 ? this.A00 : Math.max(this.A0D.A03(true), this.A00);
        int iA07 = c4j.A07();
        H1 h12 = (H1) C3M.A01(this.A02);
        h12.AI7(c4j, iA07);
        h12.AIA(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
