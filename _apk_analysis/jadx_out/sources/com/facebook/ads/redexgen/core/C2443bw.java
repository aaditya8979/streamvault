package com.facebook.ads.redexgen.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2443bw extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C2503cu A01;
    public final InterfaceC2442bv A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public C2443bw(C2503cu c2503cu, FileInputStream fileInputStream, InterfaceC2442bv interfaceC2442bv) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC2442bv;
        this.A01 = c2503cu;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return read(new byte[1]);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A03.read(bArr, i10, i11);
        if (this.A00 != null) {
            try {
                if (i12 > 0) {
                    this.A00.update(bArr, i10, i12);
                } else if (i12 == -1) {
                    this.A02.A9k(C2235Wo.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e10) {
                this.A00 = null;
                this.A01.A08().ABR(A00(3, 3, 90), AbstractC2142Sv.A13, new C2143Sw(e10));
            }
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        int i10 = (int) j10;
        byte[] bArr = new byte[1024];
        long j11 = 0;
        while (i10 > 0) {
            int i11 = read(bArr, 0, Math.min(i10, 1024));
            if (i11 <= 0) {
                break;
            }
            i10 -= i11;
            j11 += (long) i11;
        }
        return j11;
    }
}
