package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[] f17333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[] f17335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f17337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f17339l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17347t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17351x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17340m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17341n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17348u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f17342o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f17343p = 1.0f;

    public w(int i10, int i11) {
        this.f17328a = i10;
        this.f17329b = i11;
        this.f17330c = i10 / 400;
        int i12 = i10 / 65;
        this.f17331d = i12;
        int i13 = i12 * 2;
        this.f17332e = i13;
        this.f17333f = new short[i13];
        this.f17334g = i13;
        int i14 = i11 * i13;
        this.f17335h = new short[i14];
        this.f17336i = i13;
        this.f17337j = new short[i14];
        this.f17338k = i13;
        this.f17339l = new short[i14];
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f17329b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f17350w = i14 / i16;
        this.f17351x = i17 / i15;
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024b A[LOOP:4: B:12:0x0045->B:101:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0172 A[EDGE_INSN: B:111:0x0172->B:64:0x0172 BREAK  A[LOOP:4: B:12:0x0045->B:101:0x024b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.w.a():void");
    }

    public final void a(int i10) {
        int i11 = this.f17344q + i10;
        int i12 = this.f17334g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f17334g = i13;
            this.f17335h = Arrays.copyOf(this.f17335h, i13 * this.f17329b);
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f17332e / i11;
        int i13 = this.f17329b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f17333f[i16] = (short) (i17 / i14);
        }
    }

    public final void b(int i10) {
        int i11 = this.f17345r + i10;
        int i12 = this.f17336i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f17336i = i13;
            this.f17337j = Arrays.copyOf(this.f17337j, i13 * this.f17329b);
        }
    }
}
