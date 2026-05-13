package q7;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.a2;
import e7.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import q7.r;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r7.d f78000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f78001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f78002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f78003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f78004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f78005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f78006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f78007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImmutableList<C0935a> f78008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s7.d f78009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f78010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f78011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f78012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f78013u;

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class C0935a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f78014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f78015b;

        public C0935a(long j10, long j11) {
            this.f78014a = j10;
            this.f78015b = j11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0935a)) {
                return false;
            }
            C0935a c0935a = (C0935a) obj;
            return this.f78014a == c0935a.f78014a && this.f78015b == c0935a.f78015b;
        }

        public int hashCode() {
            return (((int) this.f78014a) * 31) + ((int) this.f78015b);
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f78019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f78021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f78022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s7.d f78023h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, s7.d.f79450a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, s7.d dVar) {
            this.f78016a = i10;
            this.f78017b = i11;
            this.f78018c = i12;
            this.f78019d = i13;
            this.f78020e = i14;
            this.f78021f = f10;
            this.f78022g = f11;
            this.f78023h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q7.r.b
        public final r[] a(r.a[] aVarArr, r7.d dVar, i.b bVar, c0 c0Var) {
            ImmutableList immutableListE = a.e(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f78113b;
                    if (iArr.length != 0) {
                        rVarArr[i10] = iArr.length == 1 ? new s(aVar.f78112a, iArr[0], aVar.f78114c) : b(aVar.f78112a, iArr, aVar.f78114c, dVar, (ImmutableList) immutableListE.get(i10));
                    }
                }
            }
            return rVarArr;
        }

        public a b(g0 g0Var, int[] iArr, int i10, r7.d dVar, ImmutableList<C0935a> immutableList) {
            return new a(g0Var, iArr, i10, dVar, this.f78016a, this.f78017b, this.f78018c, this.f78019d, this.f78020e, this.f78021f, this.f78022g, immutableList, this.f78023h);
        }
    }

    public a(g0 g0Var, int[] iArr, int i10, r7.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0935a> list, s7.d dVar2) {
        r7.d dVar3;
        long j13;
        super(g0Var, iArr, i10);
        if (j12 < j10) {
            s7.q.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            dVar3 = dVar;
            j13 = j10;
        } else {
            dVar3 = dVar;
            j13 = j12;
        }
        this.f78000h = dVar3;
        this.f78001i = j10 * 1000;
        this.f78002j = j11 * 1000;
        this.f78003k = j13 * 1000;
        this.f78004l = i11;
        this.f78005m = i12;
        this.f78006n = f10;
        this.f78007o = f11;
        this.f78008p = ImmutableList.copyOf((Collection) list);
        this.f78009q = dVar2;
        this.f78010r = 1.0f;
        this.f78012t = 0;
        this.f78013u = -9223372036854775807L;
    }

    public static void d(List<ImmutableList.a<C0935a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImmutableList.a<C0935a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0935a(j10, jArr[i10]));
            }
        }
    }

    public static ImmutableList<ImmutableList<C0935a>> e(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f78113b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.a aVarBuilder = ImmutableList.builder();
                aVarBuilder.a(new C0935a(0L, 0L));
                arrayList.add(aVarBuilder);
            }
        }
        long[][] jArrF = f(aVarArr);
        int[] iArr = new int[jArrF.length];
        long[] jArr = new long[jArrF.length];
        for (int i10 = 0; i10 < jArrF.length; i10++) {
            long[] jArr2 = jArrF[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        d(arrayList, jArr);
        ImmutableList<Integer> immutableListG = g(jArrF);
        for (int i11 = 0; i11 < immutableListG.size(); i11++) {
            int iIntValue = immutableListG.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrF[iIntValue][i12];
            d(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        d(arrayList, jArr);
        ImmutableList.a aVarBuilder2 = ImmutableList.builder();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ImmutableList.a aVar2 = (ImmutableList.a) arrayList.get(i14);
            aVarBuilder2.a(aVar2 == null ? ImmutableList.of() : aVar2.m());
        }
        return aVarBuilder2.m();
    }

    public static long[][] f(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f78113b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f78113b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f78112a.c(iArr[i11]).f21747i;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public static ImmutableList<Integer> g(long[][] jArr) {
        a2 a2VarG = MultimapBuilder.e().a().g();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    a2VarG.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return ImmutableList.copyOf(a2VarG.values());
    }

    @Override // q7.c, q7.r
    @CallSuper
    public void disable() {
    }

    @Override // q7.c, q7.r
    @CallSuper
    public void enable() {
        this.f78013u = -9223372036854775807L;
    }

    @Override // q7.r
    public int getSelectedIndex() {
        return this.f78011s;
    }

    @Override // q7.c, q7.r
    public void onPlaybackSpeed(float f10) {
        this.f78010r = f10;
    }
}
