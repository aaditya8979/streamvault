package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17421l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f17426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17427r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17410a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f17411b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f17412c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f17415f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f17414e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17413d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[][] f17416g = new byte[1000][];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f17417h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17422m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17423n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17425p = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17424o = true;

    public final synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
        if (this.f17424o) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f17424o = false;
            }
        }
        if (!(!this.f17425p)) {
            throw new IllegalStateException();
        }
        b(j10);
        long[] jArr = this.f17415f;
        int i12 = this.f17421l;
        jArr[i12] = j10;
        long[] jArr2 = this.f17412c;
        jArr2[i12] = j11;
        this.f17413d[i12] = i11;
        this.f17414e[i12] = i10;
        this.f17416g[i12] = bArr;
        this.f17417h[i12] = this.f17426q;
        this.f17411b[i12] = this.f17427r;
        int i13 = this.f17418i + 1;
        this.f17418i = i13;
        int i14 = this.f17410a;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr3 = new long[i15];
            long[] jArr4 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            byte[][] bArr2 = new byte[i15][];
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i15];
            int i16 = this.f17420k;
            int i17 = i14 - i16;
            System.arraycopy(jArr2, i16, jArr3, 0, i17);
            System.arraycopy(this.f17415f, this.f17420k, jArr4, 0, i17);
            System.arraycopy(this.f17414e, this.f17420k, iArr2, 0, i17);
            System.arraycopy(this.f17413d, this.f17420k, iArr3, 0, i17);
            System.arraycopy(this.f17416g, this.f17420k, bArr2, 0, i17);
            System.arraycopy(this.f17417h, this.f17420k, oVarArr, 0, i17);
            System.arraycopy(this.f17411b, this.f17420k, iArr, 0, i17);
            int i18 = this.f17420k;
            System.arraycopy(this.f17412c, 0, jArr3, i17, i18);
            System.arraycopy(this.f17415f, 0, jArr4, i17, i18);
            System.arraycopy(this.f17414e, 0, iArr2, i17, i18);
            System.arraycopy(this.f17413d, 0, iArr3, i17, i18);
            System.arraycopy(this.f17416g, 0, bArr2, i17, i18);
            System.arraycopy(this.f17417h, 0, oVarArr, i17, i18);
            System.arraycopy(this.f17411b, 0, iArr, i17, i18);
            this.f17412c = jArr3;
            this.f17415f = jArr4;
            this.f17414e = iArr2;
            this.f17413d = iArr3;
            this.f17416g = bArr2;
            this.f17417h = oVarArr;
            this.f17411b = iArr;
            this.f17420k = 0;
            int i19 = this.f17410a;
            this.f17421l = i19;
            this.f17418i = i19;
            this.f17410a = i15;
        } else {
            int i20 = i12 + 1;
            this.f17421l = i20;
            if (i20 == i14) {
                this.f17421l = 0;
            }
        }
    }

    public final synchronized boolean a(long j10) {
        if (this.f17422m >= j10) {
            return false;
        }
        int i10 = this.f17418i;
        while (i10 > 0 && this.f17415f[((this.f17420k + i10) - 1) % this.f17410a] >= j10) {
            i10--;
        }
        int i11 = this.f17419j;
        int i12 = this.f17418i;
        int i13 = (i11 + i12) - (i10 + i11);
        if (i13 < 0 || i13 > i12) {
            throw new IllegalArgumentException();
        }
        if (i13 != 0) {
            int i14 = i12 - i13;
            this.f17418i = i14;
            int i15 = this.f17421l;
            int i16 = this.f17410a;
            this.f17421l = ((i15 + i16) - i13) % i16;
            this.f17423n = Long.MIN_VALUE;
            for (int i17 = i14 - 1; i17 >= 0; i17--) {
                int i18 = (this.f17420k + i17) % this.f17410a;
                this.f17423n = Math.max(this.f17423n, this.f17415f[i18]);
                if ((this.f17414e[i18] & 1) != 0) {
                    break;
                }
            }
            long j11 = this.f17412c[this.f17421l];
        } else if (i11 != 0) {
            int i19 = this.f17421l;
            if (i19 == 0) {
                i19 = this.f17410a;
            }
            int i20 = i19 - 1;
            long j12 = this.f17412c[i20];
            int i21 = this.f17413d[i20];
        }
        return true;
    }

    public final synchronized void b(long j10) {
        this.f17423n = Math.max(this.f17423n, j10);
    }
}
