package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class c23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f88286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f88287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f88288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f88291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f88292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f88293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f88295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f88296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f88297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f88298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f88299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f88300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f88301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f88302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f88303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f88304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f88305v;

    public c23(int i10, int i11, float f10, float f11, int i12) {
        this.f88284a = i10;
        this.f88285b = i11;
        this.f88286c = f10;
        this.f88287d = f11;
        this.f88288e = i10 / i12;
        this.f88289f = i10 / 400;
        int i13 = i10 / 65;
        this.f88290g = i13;
        int i14 = i13 * 2;
        this.f88291h = i14;
        this.f88292i = new short[i14];
        int i15 = i14 * i11;
        this.f88293j = new short[i15];
        this.f88295l = new short[i15];
        this.f88297n = new short[i15];
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
        int i13 = i10 * this.f88285b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i14 * i11) {
                i16 = i11;
                i14 = iAbs;
            }
            if (iAbs * i15 > i17 * i11) {
                i15 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f88304u = i14 / i16;
        this.f88305v = i17 / i15;
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018e A[EDGE_INSN: B:108:0x018e->B:64:0x018e BREAK  A[LOOP:4: B:12:0x004a->B:98:0x025e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025e A[LOOP:4: B:12:0x004a->B:98:0x025e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c23.a():void");
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f88291h / i11;
        int i13 = this.f88285b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f88292i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f88285b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }
}
