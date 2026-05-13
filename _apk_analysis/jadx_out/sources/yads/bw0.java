package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class bw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f88169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f88170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f88171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final aw0 f88172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ts1 f88173l;

    public bw0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, aw0 aw0Var, ts1 ts1Var) {
        this.f88162a = i10;
        this.f88163b = i11;
        this.f88164c = i12;
        this.f88165d = i13;
        this.f88166e = i14;
        this.f88167f = b(i14);
        this.f88168g = i15;
        this.f88169h = i16;
        this.f88170i = a(i16);
        this.f88171j = j10;
        this.f88172k = aw0Var;
        this.f88173l = ts1Var;
    }

    public bw0(int i10, byte[] bArr) {
        ib2 ib2Var = new ib2(bArr);
        ib2Var.b(i10 * 8);
        this.f88162a = ib2Var.a(16);
        this.f88163b = ib2Var.a(16);
        this.f88164c = ib2Var.a(24);
        this.f88165d = ib2Var.a(24);
        int iA = ib2Var.a(20);
        this.f88166e = iA;
        this.f88167f = b(iA);
        this.f88168g = ib2Var.a(3) + 1;
        int iA2 = ib2Var.a(5) + 1;
        this.f88169h = iA2;
        this.f88170i = a(iA2);
        this.f88171j = ib2Var.f();
        this.f88172k = null;
        this.f88173l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10;
        long j11;
        int i10 = this.f88165d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f88164c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f88162a;
            j10 = ((((i11 != this.f88163b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f88168g)) * ((long) this.f88169h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f88166e)) / 1000000;
        long j12 = this.f88171j - 1;
        int i10 = ib3.f90737a;
        return Math.max(0L, Math.min(j11, j12));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.mx0 a(byte[] r4, yads.ts1 r5) {
        /*
            r3 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r4[r0] = r1
            int r0 = r3.f88165d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            yads.ts1 r1 = r3.f88173l
            if (r1 != 0) goto L10
            goto L28
        L10:
            if (r5 != 0) goto L13
            goto L18
        L13:
            yads.ss1[] r5 = r5.f95344b
            int r2 = r5.length
            if (r2 != 0) goto L1a
        L18:
            r5 = r1
            goto L28
        L1a:
            yads.ts1 r2 = new yads.ts1
            yads.ss1[] r1 = r1.f95344b
            java.lang.Object[] r5 = yads.ib3.a(r1, r5)
            yads.ss1[] r5 = (yads.ss1[]) r5
            r2.<init>(r5)
            r5 = r2
        L28:
            yads.lx0 r1 = new yads.lx0
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.f92148k = r2
            r1.f92149l = r0
            int r0 = r3.f88168g
            r1.f92161x = r0
            int r0 = r3.f88166e
            r1.f92162y = r0
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.f92150m = r4
            r1.f92146i = r5
            yads.mx0 r4 = new yads.mx0
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bw0.a(byte[], yads.ts1):yads.mx0");
    }

    public final long b() {
        long j10 = this.f88171j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f88166e);
    }
}
