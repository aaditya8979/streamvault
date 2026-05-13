package com.google.android.exoplayer.trackselection;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.trackselection.c;
import g5.l;
import g5.m;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f20843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f20847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f20848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a6.c f20849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f20850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20853q;

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public interface b {
        long a();
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5.c f20854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f20855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public long[][] f20857d;

        public c(y5.c cVar, float f10, long j10) {
            this.f20854a = cVar;
            this.f20855b = f10;
            this.f20856c = j10;
        }

        @Override // com.google.android.exoplayer.trackselection.a.b
        public long a() {
            long[][] jArr;
            long jMax = Math.max(0L, ((long) (this.f20854a.getBitrateEstimate() * this.f20855b)) - this.f20856c);
            if (this.f20857d == null) {
                return jMax;
            }
            int i10 = 1;
            while (true) {
                jArr = this.f20857d;
                if (i10 >= jArr.length - 1 || jArr[i10][0] >= jMax) {
                    break;
                }
                i10++;
            }
            long[] jArr2 = jArr[i10 - 1];
            long[] jArr3 = jArr[i10];
            long j10 = jArr2[0];
            float f10 = (jMax - j10) / (jArr3[0] - j10);
            return jArr2[1] + ((long) (f10 * (jArr3[1] - r4)));
        }

        public void b(long[][] jArr) {
            a6.a.a(jArr.length >= 2);
            this.f20857d = jArr;
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class d implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final y5.c f20858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f20862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f20863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a6.c f20865h;

        public d() {
            this(10000, 25000, 25000, 0.7f, 0.75f, 2000L, a6.c.f3524a);
        }

        public d(int i10, int i11, int i12, float f10, float f11, long j10, a6.c cVar) {
            this(null, i10, i11, i12, f10, f11, j10, cVar);
        }

        @Deprecated
        public d(@Nullable y5.c cVar, int i10, int i11, int i12, float f10, float f11, long j10, a6.c cVar2) {
            this.f20858a = cVar;
            this.f20859b = i10;
            this.f20860c = i11;
            this.f20861d = i12;
            this.f20862e = f10;
            this.f20863f = f11;
            this.f20864g = j10;
            this.f20865h = cVar2;
        }

        @Override // com.google.android.exoplayer.trackselection.c.b
        public final com.google.android.exoplayer.trackselection.c[] a(c.a[] aVarArr, y5.c cVar) {
            y5.c cVar2 = this.f20858a;
            if (cVar2 != null) {
                cVar = cVar2;
            }
            com.google.android.exoplayer.trackselection.c[] cVarArr = new com.google.android.exoplayer.trackselection.c[aVarArr.length];
            int i10 = 0;
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                c.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f20875b;
                    if (iArr.length == 1) {
                        cVarArr[i11] = new w5.b(aVar.f20874a, iArr[0], aVar.f20876c, aVar.f20877d);
                        int i12 = aVar.f20874a.b(aVar.f20875b[0]).f19923f;
                        if (i12 != -1) {
                            i10 += i12;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                c.a aVar2 = aVarArr[i13];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.f20875b;
                    if (iArr2.length > 1) {
                        a aVarB = b(aVar2.f20874a, cVar, iArr2, i10);
                        arrayList.add(aVarB);
                        cVarArr[i13] = aVarB;
                    }
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a aVar3 = (a) arrayList.get(i14);
                    jArr[i14] = new long[aVar3.length()];
                    for (int i15 = 0; i15 < aVar3.length(); i15++) {
                        jArr[i14][i15] = aVar3.getFormat((aVar3.length() - i15) - 1).f19923f;
                    }
                }
                long[][][] jArrI = a.i(jArr);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((a) arrayList.get(i16)).h(jArrI[i16]);
                }
            }
            return cVarArr;
        }

        public a b(TrackGroup trackGroup, y5.c cVar, int[] iArr, int i10) {
            return new a(trackGroup, iArr, new c(cVar, this.f20862e, i10), this.f20859b, this.f20860c, this.f20861d, this.f20863f, this.f20864g, this.f20865h);
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, b bVar, long j10, long j11, long j12, float f10, long j13, a6.c cVar) {
        super(trackGroup, iArr);
        this.f20843g = bVar;
        this.f20844h = j10 * 1000;
        this.f20845i = j11 * 1000;
        this.f20846j = j12 * 1000;
        this.f20847k = f10;
        this.f20848l = j13;
        this.f20849m = cVar;
        this.f20850n = 1.0f;
        this.f20852p = 0;
        this.f20853q = -9223372036854775807L;
    }

    public static int f(double[][] dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        return length;
    }

    public static long[][][] i(long[][] jArr) {
        int i10;
        double[][] dArrJ = j(jArr);
        double[][] dArrL = l(dArrJ);
        int iF = f(dArrL) + 3;
        int i11 = 0;
        long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, dArrJ.length, iF, 2);
        int[] iArr = new int[dArrJ.length];
        n(jArr2, 1, jArr, iArr);
        int i12 = 2;
        while (true) {
            i10 = iF - 1;
            if (i12 >= i10) {
                break;
            }
            double d10 = Double.MAX_VALUE;
            int i13 = i11;
            int i14 = i13;
            while (i13 < dArrJ.length) {
                int i15 = iArr[i13];
                if (i15 + 1 != dArrJ[i13].length) {
                    double d11 = dArrL[i13][i15];
                    if (d11 < d10) {
                        i14 = i13;
                        d10 = d11;
                    }
                }
                i13++;
            }
            iArr[i14] = iArr[i14] + 1;
            n(jArr2, i12, jArr, iArr);
            i12++;
            i11 = 0;
        }
        for (long[][] jArr3 : jArr2) {
            long[] jArr4 = jArr3[i10];
            long[] jArr5 = jArr3[iF - 2];
            jArr4[0] = jArr5[0] * 2;
            jArr4[1] = jArr5[1] * 2;
        }
        return jArr2;
    }

    public static double[][] j(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            dArr[i10] = new double[jArr[i10].length];
            int i11 = 0;
            while (true) {
                long[] jArr2 = jArr[i10];
                if (i11 < jArr2.length) {
                    double[] dArr2 = dArr[i10];
                    long j10 = jArr2[i11];
                    dArr2[i11] = j10 == -1 ? 0.0d : Math.log(j10);
                    i11++;
                }
            }
        }
        return dArr;
    }

    public static double[][] l(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double[] dArr3 = new double[dArr[i10].length - 1];
            dArr2[i10] = dArr3;
            if (dArr3.length != 0) {
                double[] dArr4 = dArr[i10];
                double d10 = dArr4[dArr4.length - 1] - dArr4[0];
                int i11 = 0;
                while (true) {
                    double[] dArr5 = dArr[i10];
                    if (i11 < dArr5.length - 1) {
                        int i12 = i11 + 1;
                        dArr2[i10][i11] = d10 == 0.0d ? 1.0d : (((dArr5[i11] + dArr5[i12]) * 0.5d) - dArr5[0]) / d10;
                        i11 = i12;
                    }
                }
            }
        }
        return dArr2;
    }

    public static void n(long[][][] jArr, int i10, long[][] jArr2, int[] iArr) {
        long j10 = 0;
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long[] jArr3 = jArr[i11][i10];
            long j11 = jArr2[i11][iArr[i11]];
            jArr3[1] = j11;
            j10 += j11;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i10][0] = j10;
        }
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr) {
        long jElapsedRealtime = this.f20849m.elapsedRealtime();
        if (this.f20852p == 0) {
            this.f20852p = 1;
            this.f20851o = g(jElapsedRealtime);
            return;
        }
        int i10 = this.f20851o;
        int iG = g(jElapsedRealtime);
        this.f20851o = iG;
        if (iG == i10) {
            return;
        }
        if (!c(i10, jElapsedRealtime)) {
            Format format = getFormat(i10);
            Format format2 = getFormat(this.f20851o);
            if (format2.f19923f > format.f19923f && j11 < m(j12)) {
                this.f20851o = i10;
            } else if (format2.f19923f < format.f19923f && j11 >= this.f20845i) {
                this.f20851o = i10;
            }
        }
        if (this.f20851o != i10) {
            this.f20852p = 3;
        }
    }

    public boolean e(Format format, int i10, float f10, long j10) {
        return ((long) Math.round(((float) i10) * f10)) <= j10;
    }

    @Override // w5.a, com.google.android.exoplayer.trackselection.c
    public void enable() {
        this.f20853q = -9223372036854775807L;
    }

    @Override // w5.a, com.google.android.exoplayer.trackselection.c
    public int evaluateQueueSize(long j10, List<? extends l> list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f20849m.elapsedRealtime();
        if (!o(jElapsedRealtime)) {
            return list.size();
        }
        this.f20853q = jElapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jT = k0.T(list.get(size - 1).f62015f - j10, this.f20850n);
        long jK = k();
        if (jT < jK) {
            return size;
        }
        Format format = getFormat(g(jElapsedRealtime));
        for (int i12 = 0; i12 < size; i12++) {
            l lVar = list.get(i12);
            Format format2 = lVar.f62012c;
            if (k0.T(lVar.f62015f - j10, this.f20850n) >= jK && format2.f19923f < format.f19923f && (i10 = format2.f19933p) != -1 && i10 < 720 && (i11 = format2.f19932o) != -1 && i11 < 1280 && i10 < format.f19933p) {
                return i12;
            }
        }
        return size;
    }

    public final int g(long j10) {
        long jA = this.f20843g.a();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f86326b; i11++) {
            if (j10 == Long.MIN_VALUE || !c(i11, j10)) {
                Format format = getFormat(i11);
                if (e(format, format.f19923f, this.f20850n, jA)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public int getSelectedIndex() {
        return this.f20851o;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public int getSelectionReason() {
        return this.f20852p;
    }

    public void h(long[][] jArr) {
        ((c) this.f20843g).b(jArr);
    }

    public long k() {
        return this.f20846j;
    }

    public final long m(long j10) {
        return (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) != 0 && (j10 > this.f20844h ? 1 : (j10 == this.f20844h ? 0 : -1)) <= 0 ? (long) (j10 * this.f20847k) : this.f20844h;
    }

    public boolean o(long j10) {
        long j11 = this.f20853q;
        return j11 == -9223372036854775807L || j10 - j11 >= this.f20848l;
    }

    @Override // w5.a, com.google.android.exoplayer.trackselection.c
    public void onPlaybackSpeed(float f10) {
        this.f20850n = f10;
    }
}
