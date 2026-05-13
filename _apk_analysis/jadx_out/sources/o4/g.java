package o4;

import java.io.IOException;
import k4.h;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f76112d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f76113a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76115c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f76112d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f76112d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f76115c;
    }

    public long d(h hVar, boolean z10, boolean z11, int i10) throws InterruptedException, IOException {
        if (this.f76114b == 0) {
            if (!hVar.readFully(this.f76113a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f76113a[0] & 255);
            this.f76115c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f76114b = 1;
        }
        int i11 = this.f76115c;
        if (i11 > i10) {
            this.f76114b = 0;
            return -2L;
        }
        if (i11 != 1) {
            hVar.readFully(this.f76113a, 1, i11 - 1);
        }
        this.f76114b = 0;
        return a(this.f76113a, this.f76115c, z11);
    }

    public void e() {
        this.f76114b = 0;
        this.f76115c = 0;
    }
}
