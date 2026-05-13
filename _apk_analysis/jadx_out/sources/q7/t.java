package q7;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import d6.u1;
import d6.v1;
import e7.g0;
import e7.i0;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class t extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f78117c;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f78119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f78120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i0[] f78121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f78122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f78123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i0 f78124g;

        @VisibleForTesting
        public a(String[] strArr, int[] iArr, i0[] i0VarArr, int[] iArr2, int[][][] iArr3, i0 i0Var) {
            this.f78119b = strArr;
            this.f78120c = iArr;
            this.f78121d = i0VarArr;
            this.f78123f = iArr3;
            this.f78122e = iArr2;
            this.f78124g = i0Var;
            this.f78118a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f78121d[i10].b(i11).f60866b;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f78121d[i10].b(i11).c(iArr[i12]).f21751m;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !m0.c(str, str2);
                }
                iMin = Math.min(iMin, u1.getAdaptiveSupport(this.f78123f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f78122e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f78123f[i10][i11][i12];
        }

        public int d() {
            return this.f78118a;
        }

        public int e(int i10) {
            return this.f78120c[i10];
        }

        public i0 f(int i10) {
            return this.f78121d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return u1.getFormatSupport(c(i10, i11, i12));
        }

        public i0 h() {
            return this.f78124g;
        }
    }

    public static int k(u1[] u1VarArr, g0 g0Var, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = u1VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < u1VarArr.length; i11++) {
            u1 u1Var = u1VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < g0Var.f60866b; i12++) {
                iMax = Math.max(iMax, u1.getFormatSupport(u1Var.a(g0Var.c(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    public static int[] l(u1 u1Var, g0 g0Var) throws ExoPlaybackException {
        int[] iArr = new int[g0Var.f60866b];
        for (int i10 = 0; i10 < g0Var.f60866b; i10++) {
            iArr[i10] = u1Var.a(g0Var.c(i10));
        }
        return iArr;
    }

    public static int[] m(u1[] u1VarArr) throws ExoPlaybackException {
        int length = u1VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = u1VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // q7.a0
    public final void f(@Nullable Object obj) {
        this.f78117c = (a) obj;
    }

    @Override // q7.a0
    public final b0 h(u1[] u1VarArr, i0 i0Var, i.b bVar, c0 c0Var) throws ExoPlaybackException {
        int[] iArr = new int[u1VarArr.length + 1];
        int length = u1VarArr.length + 1;
        g0[][] g0VarArr = new g0[length][];
        int[][][] iArr2 = new int[u1VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i0Var.f60877b;
            g0VarArr[i10] = new g0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrM = m(u1VarArr);
        for (int i12 = 0; i12 < i0Var.f60877b; i12++) {
            g0 g0VarB = i0Var.b(i12);
            int iK = k(u1VarArr, g0VarB, iArr, g0VarB.f60868d == 5);
            int[] iArrL = iK == u1VarArr.length ? new int[g0VarB.f60866b] : l(u1VarArr[iK], g0VarB);
            int i13 = iArr[iK];
            g0VarArr[iK][i13] = g0VarB;
            iArr2[iK][i13] = iArrL;
            iArr[iK] = i13 + 1;
        }
        i0[] i0VarArr = new i0[u1VarArr.length];
        String[] strArr = new String[u1VarArr.length];
        int[] iArr3 = new int[u1VarArr.length];
        for (int i14 = 0; i14 < u1VarArr.length; i14++) {
            int i15 = iArr[i14];
            i0VarArr[i14] = new i0((g0[]) m0.A0(g0VarArr[i14], i15));
            iArr2[i14] = (int[][]) m0.A0(iArr2[i14], i15);
            strArr[i14] = u1VarArr[i14].getName();
            iArr3[i14] = u1VarArr[i14].getTrackType();
        }
        a aVar = new a(strArr, iArr3, i0VarArr, iArrM, iArr2, new i0((g0[]) m0.A0(g0VarArr[u1VarArr.length], iArr[u1VarArr.length])));
        Pair<v1[], r[]> pairN = n(aVar, iArr2, iArrM, bVar, c0Var);
        return new b0((v1[]) pairN.first, (r[]) pairN.second, z.b(aVar, (u[]) pairN.second), aVar);
    }

    public abstract Pair<v1[], r[]> n(a aVar, int[][][] iArr, int[] iArr2, i.b bVar, c0 c0Var) throws ExoPlaybackException;
}
