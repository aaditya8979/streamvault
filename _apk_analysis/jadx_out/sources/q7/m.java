package q7;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.m1;
import com.google.common.primitives.Ints;
import d6.u1;
import d6.v1;
import e7.g0;
import e7.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import q7.a;
import q7.m;
import q7.r;
import q7.t;
import q7.y;
import s7.m0;

/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public class m extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ordering<Integer> f78046k = Ordering.from(new Comparator() { // from class: q7.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.P((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ordering<Integer> f78047l = Ordering.from(new Comparator() { // from class: q7.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.Q((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f78048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Context f78049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r.b f78050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("lock")
    public d f78052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public f f78053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @GuardedBy("lock")
    public com.google.android.exoplayer2.audio.a f78054j;

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class b extends h<b> implements Comparable<b> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f78055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f78056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f78057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f78058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f78059j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f78060k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f78061l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f78062m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f78063n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f78064o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f78065p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f78066q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f78067r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f78068s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f78069t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f78070u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f78071v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f78072w;

        public b(int i10, g0 g0Var, int i11, d dVar, int i12, boolean z10, y7.m<com.google.android.exoplayer2.m> mVar) {
            int i13;
            int iD;
            int iD2;
            super(i10, g0Var, i11);
            this.f78058i = dVar;
            this.f78057h = m.T(this.f78097e.f21742d);
            this.f78059j = m.L(i12, false);
            int i14 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i14 >= dVar.f78141o.size()) {
                    iD = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    iD = m.D(this.f78097e, dVar.f78141o.get(i14), false);
                    if (iD > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f78061l = i14;
            this.f78060k = iD;
            this.f78062m = m.H(this.f78097e.f21744f, dVar.f78142p);
            com.google.android.exoplayer2.m mVar2 = this.f78097e;
            int i15 = mVar2.f21744f;
            this.f78063n = i15 == 0 || (i15 & 1) != 0;
            this.f78066q = (mVar2.f21743e & 1) != 0;
            int i16 = mVar2.f21764z;
            this.f78067r = i16;
            this.f78068s = mVar2.A;
            int i17 = mVar2.f21747i;
            this.f78069t = i17;
            this.f78056g = (i17 == -1 || i17 <= dVar.f78144r) && (i16 == -1 || i16 <= dVar.f78143q) && mVar.apply(mVar2);
            String[] strArrC0 = m0.c0();
            int i18 = 0;
            while (true) {
                if (i18 >= strArrC0.length) {
                    iD2 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    iD2 = m.D(this.f78097e, strArrC0[i18], false);
                    if (iD2 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f78064o = i18;
            this.f78065p = iD2;
            int i19 = 0;
            while (true) {
                if (i19 < dVar.f78145s.size()) {
                    String str = this.f78097e.f21751m;
                    if (str != null && str.equals(dVar.f78145s.get(i19))) {
                        i13 = i19;
                        break;
                    }
                    i19++;
                } else {
                    break;
                }
            }
            this.f78070u = i13;
            this.f78071v = u1.getDecoderSupport(i12) == 128;
            this.f78072w = u1.getHardwareAccelerationSupport(i12) == 64;
            this.f78055f = f(i12, z10);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static ImmutableList<b> e(int i10, g0 g0Var, d dVar, int[] iArr, boolean z10, y7.m<com.google.android.exoplayer2.m> mVar) {
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (int i11 = 0; i11 < g0Var.f60866b; i11++) {
                aVarBuilder.a(new b(i10, g0Var, i11, dVar, iArr[i11], z10, mVar));
            }
            return aVarBuilder.m();
        }

        @Override // q7.m.h
        public int a() {
            return this.f78055f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            Ordering orderingReverse = (this.f78056g && this.f78059j) ? m.f78046k : m.f78046k.reverse();
            m1 m1VarG = m1.k().h(this.f78059j, bVar.f78059j).g(Integer.valueOf(this.f78061l), Integer.valueOf(bVar.f78061l), Ordering.natural().reverse()).d(this.f78060k, bVar.f78060k).d(this.f78062m, bVar.f78062m).h(this.f78066q, bVar.f78066q).h(this.f78063n, bVar.f78063n).g(Integer.valueOf(this.f78064o), Integer.valueOf(bVar.f78064o), Ordering.natural().reverse()).d(this.f78065p, bVar.f78065p).h(this.f78056g, bVar.f78056g).g(Integer.valueOf(this.f78070u), Integer.valueOf(bVar.f78070u), Ordering.natural().reverse()).g(Integer.valueOf(this.f78069t), Integer.valueOf(bVar.f78069t), this.f78058i.f78150x ? m.f78046k.reverse() : m.f78047l).h(this.f78071v, bVar.f78071v).h(this.f78072w, bVar.f78072w).g(Integer.valueOf(this.f78067r), Integer.valueOf(bVar.f78067r), orderingReverse).g(Integer.valueOf(this.f78068s), Integer.valueOf(bVar.f78068s), orderingReverse);
            Integer numValueOf = Integer.valueOf(this.f78069t);
            Integer numValueOf2 = Integer.valueOf(bVar.f78069t);
            if (!m0.c(this.f78057h, bVar.f78057h)) {
                orderingReverse = m.f78047l;
            }
            return m1VarG.g(numValueOf, numValueOf2, orderingReverse).j();
        }

        public final int f(int i10, boolean z10) {
            if (!m.L(i10, this.f78058i.O)) {
                return 0;
            }
            if (!this.f78056g && !this.f78058i.I) {
                return 0;
            }
            if (m.L(i10, false) && this.f78056g && this.f78097e.f21747i != -1) {
                d dVar = this.f78058i;
                if (!dVar.f78151y && !dVar.f78150x && (dVar.Q || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q7.m.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f78058i;
            if ((dVar.L || ((i11 = this.f78097e.f21764z) != -1 && i11 == bVar.f78097e.f21764z)) && (dVar.J || ((str = this.f78097e.f21751m) != null && TextUtils.equals(str, bVar.f78097e.f21751m)))) {
                d dVar2 = this.f78058i;
                if ((dVar2.K || ((i10 = this.f78097e.A) != -1 && i10 == bVar.f78097e.A)) && (dVar2.M || (this.f78071v == bVar.f78071v && this.f78072w == bVar.f78072w))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78074c;

        public c(com.google.android.exoplayer2.m mVar, int i10) {
            this.f78073b = (mVar.f21743e & 1) != 0;
            this.f78074c = m.L(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return m1.k().h(this.f78074c, cVar.f78074c).h(this.f78073b, cVar.f78073b).j();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class d extends y {
        public static final d T;

        @Deprecated
        public static final d U;
        public static final f.a<d> V;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final SparseArray<Map<i0, e>> R;
        public final SparseBooleanArray S;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public static final class a extends y.a {
            public boolean A;
            public boolean B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public final SparseArray<Map<i0, e>> N;
            public final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                e0();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                e0();
            }

            public a(Bundle bundle) {
                super(bundle);
                e0();
                d dVar = d.T;
                s0(bundle.getBoolean(y.c(1000), dVar.E));
                n0(bundle.getBoolean(y.c(1001), dVar.F));
                o0(bundle.getBoolean(y.c(1002), dVar.G));
                m0(bundle.getBoolean(y.c(1014), dVar.H));
                q0(bundle.getBoolean(y.c(1003), dVar.I));
                j0(bundle.getBoolean(y.c(1004), dVar.J));
                k0(bundle.getBoolean(y.c(1005), dVar.K));
                h0(bundle.getBoolean(y.c(1006), dVar.L));
                i0(bundle.getBoolean(y.c(1015), dVar.M));
                p0(bundle.getBoolean(y.c(1016), dVar.N));
                r0(bundle.getBoolean(y.c(1007), dVar.O));
                z0(bundle.getBoolean(y.c(1008), dVar.P));
                l0(bundle.getBoolean(y.c(1009), dVar.Q));
                this.N = new SparseArray<>();
                x0(bundle);
                this.O = f0(bundle.getIntArray(y.c(1013)));
            }

            public a(d dVar) {
                super(dVar);
                this.A = dVar.E;
                this.B = dVar.F;
                this.C = dVar.G;
                this.D = dVar.H;
                this.E = dVar.I;
                this.F = dVar.J;
                this.G = dVar.K;
                this.H = dVar.L;
                this.I = dVar.M;
                this.J = dVar.N;
                this.K = dVar.O;
                this.L = dVar.P;
                this.M = dVar.Q;
                this.N = d0(dVar.R);
                this.O = dVar.S.clone();
            }

            public static SparseArray<Map<i0, e>> d0(SparseArray<Map<i0, e>> sparseArray) {
                SparseArray<Map<i0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a K(int i10, int i11, boolean z10) {
                super.K(i10, i11, z10);
                return this;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public a L(Context context, boolean z10) {
                super.L(context, z10);
                return this;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public a B(int i10) {
                super.B(i10);
                return this;
            }

            public final void e0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            public final SparseBooleanArray f0(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            public a g0(y yVar) {
                super.E(yVar);
                return this;
            }

            public a h0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a o0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a p0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a q0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a r0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a s0(boolean z10) {
                this.A = z10;
                return this;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a F(int i10) {
                super.F(i10);
                return this;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
            public a G(w wVar) {
                super.G(wVar);
                return this;
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a H(Context context) {
                super.H(context);
                return this;
            }

            @Deprecated
            public a w0(int i10, i0 i0Var, @Nullable e eVar) {
                Map<i0, e> map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i10, map);
                }
                if (map.containsKey(i0Var) && m0.c(map.get(i0Var), eVar)) {
                    return this;
                }
                map.put(i0Var, eVar);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void x0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(y.c(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.c(1011));
                ImmutableList immutableListOf = parcelableArrayList == null ? ImmutableList.of() : s7.c.b(i0.f60876f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(y.c(1012));
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : s7.c.c(e.f78075f, sparseParcelableArray);
                if (intArray == null || intArray.length != immutableListOf.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    w0(intArray[i10], (i0) immutableListOf.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // q7.y.a
            /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
            public a J(int i10, boolean z10) {
                super.J(i10, z10);
                return this;
            }

            public a z0(boolean z10) {
                this.L = z10;
                return this;
            }
        }

        static {
            d dVarA = new a().A();
            T = dVarA;
            U = dVarA;
            V = new f.a() { // from class: q7.n
                @Override // com.google.android.exoplayer2.f.a
                public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                    return m.d.p(bundle);
                }
            };
        }

        public d(a aVar) {
            super(aVar);
            this.E = aVar.A;
            this.F = aVar.B;
            this.G = aVar.C;
            this.H = aVar.D;
            this.I = aVar.E;
            this.J = aVar.F;
            this.K = aVar.G;
            this.L = aVar.H;
            this.M = aVar.I;
            this.N = aVar.J;
            this.O = aVar.K;
            this.P = aVar.L;
            this.Q = aVar.M;
            this.R = aVar.N;
            this.S = aVar.O;
        }

        public static boolean g(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean h(SparseArray<Map<i0, e>> sparseArray, SparseArray<Map<i0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !i(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean i(Map<i0, e> map, Map<i0, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<i0, e> entry : map.entrySet()) {
                i0 key = entry.getKey();
                if (!map2.containsKey(key) || !m0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d k(Context context) {
            return new a(context).A();
        }

        public static int[] l(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        public static /* synthetic */ d p(Bundle bundle) {
            return new a(bundle).A();
        }

        public static void q(Bundle bundle, SparseArray<Map<i0, e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry<i0, e> entry : sparseArray.valueAt(i10).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(y.c(1010), Ints.n(arrayList));
                bundle.putParcelableArrayList(y.c(1011), s7.c.d(arrayList2));
                bundle.putSparseParcelableArray(y.c(1012), s7.c.e(sparseArray2));
            }
        }

        @Override // q7.y
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && this.M == dVar.M && this.N == dVar.N && this.O == dVar.O && this.P == dVar.P && this.Q == dVar.Q && g(this.S, dVar.S) && h(this.R, dVar.R);
        }

        @Override // q7.y
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0);
        }

        @Override // q7.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean m(int i10) {
            return this.S.get(i10);
        }

        @Nullable
        @Deprecated
        public e n(int i10, i0 i0Var) {
            Map<i0, e> map = this.R.get(i10);
            if (map != null) {
                return map.get(i0Var);
            }
            return null;
        }

        @Deprecated
        public boolean o(int i10, i0 i0Var) {
            Map<i0, e> map = this.R.get(i10);
            return map != null && map.containsKey(i0Var);
        }

        @Override // q7.y, com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(y.c(1000), this.E);
            bundle.putBoolean(y.c(1001), this.F);
            bundle.putBoolean(y.c(1002), this.G);
            bundle.putBoolean(y.c(1014), this.H);
            bundle.putBoolean(y.c(1003), this.I);
            bundle.putBoolean(y.c(1004), this.J);
            bundle.putBoolean(y.c(1005), this.K);
            bundle.putBoolean(y.c(1006), this.L);
            bundle.putBoolean(y.c(1015), this.M);
            bundle.putBoolean(y.c(1016), this.N);
            bundle.putBoolean(y.c(1007), this.O);
            bundle.putBoolean(y.c(1008), this.P);
            bundle.putBoolean(y.c(1009), this.Q);
            q(bundle, this.R);
            bundle.putIntArray(y.c(1013), l(this.S));
            return bundle;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class e implements com.google.android.exoplayer2.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f.a<e> f78075f = new f.a() { // from class: q7.o
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return m.e.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f78077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f78078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78079e;

        public e(int i10, int[] iArr, int i11) {
            this.f78076b = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f78077c = iArrCopyOf;
            this.f78078d = iArr.length;
            this.f78079e = i11;
            Arrays.sort(iArrCopyOf);
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ e c(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i11 = bundle.getInt(b(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            s7.a.a(z10);
            s7.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f78076b == eVar.f78076b && Arrays.equals(this.f78077c, eVar.f78077c) && this.f78079e == eVar.f78079e;
        }

        public int hashCode() {
            return (((this.f78076b * 31) + Arrays.hashCode(this.f78077c)) * 31) + this.f78079e;
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(b(0), this.f78076b);
            bundle.putIntArray(b(1), this.f78077c);
            bundle.putInt(b(2), this.f78079e);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    @RequiresApi(32)
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f78080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Handler f78082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Spatializer.OnSpatializerStateChangedListener f78083d;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f78084a;

            public a(f fVar, m mVar) {
                this.f78084a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f78084a.S();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f78084a.S();
            }
        }

        public f(Spatializer spatializer) {
            this.f78080a = spatializer;
            this.f78081b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(com.google.android.exoplayer2.audio.a aVar, com.google.android.exoplayer2.m mVar) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m0.D(("audio/eac3-joc".equals(mVar.f21751m) && mVar.f21764z == 16) ? 12 : mVar.f21764z));
            int i10 = mVar.A;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f78080a.canBeSpatialized(aVar.b().f21273a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f78083d == null && this.f78082c == null) {
                this.f78083d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f78082c = handler;
                Spatializer spatializer = this.f78080a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new androidx.emoji2.text.b(handler), this.f78083d);
            }
        }

        public boolean c() {
            return this.f78080a.isAvailable();
        }

        public boolean d() {
            return this.f78080a.isEnabled();
        }

        public boolean e() {
            return this.f78081b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f78083d;
            if (onSpatializerStateChangedListener == null || this.f78082c == null) {
                return;
            }
            this.f78080a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) m0.j(this.f78082c)).removeCallbacksAndMessages(null);
            this.f78082c = null;
            this.f78083d = null;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class g extends h<g> implements Comparable<g> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f78085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f78086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f78087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f78088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f78089j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f78090k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f78091l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f78092m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f78093n;

        public g(int i10, g0 g0Var, int i11, d dVar, int i12, @Nullable String str) {
            int iD;
            super(i10, g0Var, i11);
            int i13 = 0;
            this.f78086g = m.L(i12, false);
            int i14 = this.f78097e.f21743e & (~dVar.f78148v);
            this.f78087h = (i14 & 1) != 0;
            this.f78088i = (i14 & 2) != 0;
            int i15 = Integer.MAX_VALUE;
            ImmutableList<String> immutableListOf = dVar.f78146t.isEmpty() ? ImmutableList.of("") : dVar.f78146t;
            int i16 = 0;
            while (true) {
                if (i16 >= immutableListOf.size()) {
                    iD = 0;
                    break;
                }
                iD = m.D(this.f78097e, immutableListOf.get(i16), dVar.f78149w);
                if (iD > 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            this.f78089j = i15;
            this.f78090k = iD;
            int iH = m.H(this.f78097e.f21744f, dVar.f78147u);
            this.f78091l = iH;
            this.f78093n = (this.f78097e.f21744f & 1088) != 0;
            int iD2 = m.D(this.f78097e, str, m.T(str) == null);
            this.f78092m = iD2;
            boolean z10 = iD > 0 || (dVar.f78146t.isEmpty() && iH > 0) || this.f78087h || (this.f78088i && iD2 > 0);
            if (m.L(i12, dVar.O) && z10) {
                i13 = 1;
            }
            this.f78085f = i13;
        }

        public static int c(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static ImmutableList<g> e(int i10, g0 g0Var, d dVar, int[] iArr, @Nullable String str) {
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (int i11 = 0; i11 < g0Var.f60866b; i11++) {
                aVarBuilder.a(new g(i10, g0Var, i11, dVar, iArr[i11], str));
            }
            return aVarBuilder.m();
        }

        @Override // q7.m.h
        public int a() {
            return this.f78085f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            m1 m1VarD = m1.k().h(this.f78086g, gVar.f78086g).g(Integer.valueOf(this.f78089j), Integer.valueOf(gVar.f78089j), Ordering.natural().reverse()).d(this.f78090k, gVar.f78090k).d(this.f78091l, gVar.f78091l).h(this.f78087h, gVar.f78087h).g(Boolean.valueOf(this.f78088i), Boolean.valueOf(gVar.f78088i), this.f78090k == 0 ? Ordering.natural() : Ordering.natural().reverse()).d(this.f78092m, gVar.f78092m);
            if (this.f78091l == 0) {
                m1VarD = m1VarD.i(this.f78093n, gVar.f78093n);
            }
            return m1VarD.j();
        }

        @Override // q7.m.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(g gVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static abstract class h<T extends h<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f78095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f78096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f78097e;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public interface a<T extends h<T>> {
            List<T> a(int i10, g0 g0Var, int[] iArr);
        }

        public h(int i10, g0 g0Var, int i11) {
            this.f78094b = i10;
            this.f78095c = g0Var;
            this.f78096d = i11;
            this.f78097e = g0Var.c(i11);
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class i extends h<i> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f78098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f78099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f78100h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f78101i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f78102j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f78103k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f78104l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f78105m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f78106n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f78107o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f78108p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f78109q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f78110r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f78111s;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r5, e7.g0 r6, int r7, q7.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.m.i.<init>(int, e7.g0, int, q7.m$d, int, int, boolean):void");
        }

        public static int e(i iVar, i iVar2) {
            m1 m1VarH = m1.k().h(iVar.f78101i, iVar2.f78101i).d(iVar.f78105m, iVar2.f78105m).h(iVar.f78106n, iVar2.f78106n).h(iVar.f78098f, iVar2.f78098f).h(iVar.f78100h, iVar2.f78100h).g(Integer.valueOf(iVar.f78104l), Integer.valueOf(iVar2.f78104l), Ordering.natural().reverse()).h(iVar.f78109q, iVar2.f78109q).h(iVar.f78110r, iVar2.f78110r);
            if (iVar.f78109q && iVar.f78110r) {
                m1VarH = m1VarH.d(iVar.f78111s, iVar2.f78111s);
            }
            return m1VarH.j();
        }

        public static int f(i iVar, i iVar2) {
            Ordering orderingReverse = (iVar.f78098f && iVar.f78101i) ? m.f78046k : m.f78046k.reverse();
            return m1.k().g(Integer.valueOf(iVar.f78102j), Integer.valueOf(iVar2.f78102j), iVar.f78099g.f78150x ? m.f78046k.reverse() : m.f78047l).g(Integer.valueOf(iVar.f78103k), Integer.valueOf(iVar2.f78103k), orderingReverse).g(Integer.valueOf(iVar.f78102j), Integer.valueOf(iVar2.f78102j), orderingReverse).j();
        }

        public static int g(List<i> list, List<i> list2) {
            return m1.k().g((i) Collections.max(list, new Comparator() { // from class: q7.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q7.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: q7.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }).d(list.size(), list2.size()).g((i) Collections.max(list, new Comparator() { // from class: q7.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q7.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: q7.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }).j();
        }

        public static ImmutableList<i> i(int i10, g0 g0Var, d dVar, int[] iArr, int i11) {
            int iE = m.E(g0Var, dVar.f78136j, dVar.f78137k, dVar.f78138l);
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (int i12 = 0; i12 < g0Var.f60866b; i12++) {
                int iF = g0Var.c(i12).f();
                aVarBuilder.a(new i(i10, g0Var, i12, dVar, iArr[i12], i11, iE == Integer.MAX_VALUE || (iF != -1 && iF <= iE)));
            }
            return aVarBuilder.m();
        }

        @Override // q7.m.h
        public int a() {
            return this.f78108p;
        }

        public final int j(int i10, int i11) {
            if ((this.f78097e.f21744f & 16384) != 0 || !m.L(i10, this.f78099g.O)) {
                return 0;
            }
            if (!this.f78098f && !this.f78099g.E) {
                return 0;
            }
            if (m.L(i10, false) && this.f78100h && this.f78098f && this.f78097e.f21747i != -1) {
                d dVar = this.f78099g;
                if (!dVar.f78151y && !dVar.f78150x && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q7.m.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean b(i iVar) {
            return (this.f78107o || m0.c(this.f78097e.f21751m, iVar.f78097e.f21751m)) && (this.f78099g.H || (this.f78109q == iVar.f78109q && this.f78110r == iVar.f78110r));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    public m(Context context, r.b bVar) {
        this(context, d.k(context), bVar);
    }

    public m(Context context, y yVar, r.b bVar) {
        this(yVar, bVar, context);
    }

    public m(y yVar, r.b bVar, @Nullable Context context) {
        this.f78048d = new Object();
        this.f78049e = context != null ? context.getApplicationContext() : null;
        this.f78050f = bVar;
        if (yVar instanceof d) {
            this.f78052h = (d) yVar;
        } else {
            this.f78052h = (context == null ? d.T : d.k(context)).a().g0(yVar).A();
        }
        this.f78054j = com.google.android.exoplayer2.audio.a.f21265h;
        boolean z10 = context != null && m0.r0(context);
        this.f78051g = z10;
        if (!z10 && context != null && m0.f79487a >= 32) {
            this.f78053i = f.g(context);
        }
        if (this.f78052h.N && context == null) {
            s7.q.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void A(t.a aVar, d dVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i0 i0VarF = aVar.f(i10);
            if (dVar.o(i10, i0VarF)) {
                e eVarN = dVar.n(i10, i0VarF);
                aVarArr[i10] = (eVarN == null || eVarN.f78077c.length == 0) ? null : new r.a(i0VarF.b(eVarN.f78076b), eVarN.f78077c, eVarN.f78079e);
            }
        }
    }

    public static void B(t.a aVar, y yVar, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            C(aVar.f(i10), yVar, map);
        }
        C(aVar.h(), yVar, map);
        for (int i11 = 0; i11 < iD; i11++) {
            w wVar = (w) map.get(Integer.valueOf(aVar.e(i11)));
            if (wVar != null) {
                aVarArr[i11] = (wVar.f78127c.isEmpty() || aVar.f(i11).c(wVar.f78126b) == -1) ? null : new r.a(wVar.f78126b, Ints.n(wVar.f78127c));
            }
        }
    }

    public static void C(i0 i0Var, y yVar, Map<Integer, w> map) {
        w wVar;
        for (int i10 = 0; i10 < i0Var.f60877b; i10++) {
            w wVar2 = yVar.f78152z.get(i0Var.b(i10));
            if (wVar2 != null && ((wVar = map.get(Integer.valueOf(wVar2.getType()))) == null || (wVar.f78127c.isEmpty() && !wVar2.f78127c.isEmpty()))) {
                map.put(Integer.valueOf(wVar2.getType()), wVar2);
            }
        }
    }

    public static int D(com.google.android.exoplayer2.m mVar, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(mVar.f21742d)) {
            return 4;
        }
        String strT = T(str);
        String strT2 = T(mVar.f21742d);
        if (strT2 == null || strT == null) {
            return (z10 && strT2 == null) ? 1 : 0;
        }
        if (strT2.startsWith(strT) || strT.startsWith(strT2)) {
            return 3;
        }
        return m0.I0(strT2, "-")[0].equals(m0.I0(strT, "-")[0]) ? 2 : 0;
    }

    public static int E(g0 g0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < g0Var.f60866b; i14++) {
                com.google.android.exoplayer2.m mVarC = g0Var.c(i14);
                int i15 = mVarC.f21756r;
                if (i15 > 0 && (i12 = mVarC.f21757s) > 0) {
                    Point pointF = F(z10, i10, i11, i15, i12);
                    int i16 = mVarC.f21756r;
                    int i17 = mVarC.f21757s;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointF.x * 0.98f)) && i17 >= ((int) (pointF.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point F(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = s7.m0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = s7.m0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.m.F(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int H(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int I(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean K(com.google.android.exoplayer2.m mVar) {
        String str = mVar.f21751m;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    public static boolean L(int i10, boolean z10) {
        int formatSupport = u1.getFormatSupport(i10);
        return formatSupport == 4 || (z10 && formatSupport == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List M(d dVar, boolean z10, int i10, g0 g0Var, int[] iArr) {
        return b.e(i10, g0Var, dVar, iArr, z10, new y7.m() { // from class: q7.l
            @Override // y7.m
            public final boolean apply(Object obj) {
                return this.f78045b.J((com.google.android.exoplayer2.m) obj);
            }
        });
    }

    public static /* synthetic */ List N(d dVar, String str, int i10, g0 g0Var, int[] iArr) {
        return g.e(i10, g0Var, dVar, iArr, str);
    }

    public static /* synthetic */ List O(d dVar, int[] iArr, int i10, g0 g0Var, int[] iArr2) {
        return i.i(i10, g0Var, dVar, iArr2, iArr[i10]);
    }

    public static /* synthetic */ int P(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int Q(Integer num, Integer num2) {
        return 0;
    }

    public static void R(t.a aVar, int[][][] iArr, v1[] v1VarArr, r[] rVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((iE == 1 || iE == 2) && rVar != null && U(iArr[i12], aVar.f(i12), rVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            v1 v1Var = new v1(true);
            v1VarArr[i11] = v1Var;
            v1VarArr[i10] = v1Var;
        }
    }

    @Nullable
    public static String T(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean U(int[][] iArr, i0 i0Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iC = i0Var.c(rVar.getTrackGroup());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (u1.getTunnelingSupport(iArr[iC][rVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Override // q7.a0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public d b() {
        d dVar;
        synchronized (this.f78048d) {
            dVar = this.f78052h;
        }
        return dVar;
    }

    public final boolean J(com.google.android.exoplayer2.m mVar) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f78048d) {
            z10 = !this.f78052h.N || this.f78051g || mVar.f21764z <= 2 || (K(mVar) && (m0.f79487a < 32 || (fVar2 = this.f78053i) == null || !fVar2.e())) || (m0.f79487a >= 32 && (fVar = this.f78053i) != null && fVar.e() && this.f78053i.c() && this.f78053i.d() && this.f78053i.a(this.f78054j, mVar));
        }
        return z10;
    }

    public final void S() {
        boolean z10;
        f fVar;
        synchronized (this.f78048d) {
            z10 = this.f78052h.N && !this.f78051g && m0.f79487a >= 32 && (fVar = this.f78053i) != null && fVar.e();
        }
        if (z10) {
            d();
        }
    }

    public r.a[] V(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws ExoPlaybackException {
        String str;
        int iD = aVar.d();
        r.a[] aVarArr = new r.a[iD];
        Pair<r.a, Integer> pairA0 = a0(aVar, iArr, iArr2, dVar);
        if (pairA0 != null) {
            aVarArr[((Integer) pairA0.second).intValue()] = (r.a) pairA0.first;
        }
        Pair<r.a, Integer> pairW = W(aVar, iArr, iArr2, dVar);
        if (pairW != null) {
            aVarArr[((Integer) pairW.second).intValue()] = (r.a) pairW.first;
        }
        if (pairW == null) {
            str = null;
        } else {
            Object obj = pairW.first;
            str = ((r.a) obj).f78112a.c(((r.a) obj).f78113b[0]).f21742d;
        }
        Pair<r.a, Integer> pairY = Y(aVar, iArr, dVar, str);
        if (pairY != null) {
            aVarArr[((Integer) pairY.second).intValue()] = (r.a) pairY.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3) {
                aVarArr[i10] = X(iE, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    @Nullable
    public Pair<r.a, Integer> W(t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) throws ExoPlaybackException {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f60877b > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return Z(1, aVar, iArr, new h.a() { // from class: q7.j
            @Override // q7.m.h.a
            public final List a(int i11, g0 g0Var, int[] iArr3) {
                return this.f78042a.M(dVar, z10, i11, g0Var, iArr3);
            }
        }, new Comparator() { // from class: q7.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.c((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    public r.a X(int i10, i0 i0Var, int[][] iArr, d dVar) throws ExoPlaybackException {
        g0 g0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < i0Var.f60877b; i12++) {
            g0 g0VarB = i0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < g0VarB.f60866b; i13++) {
                if (L(iArr2[i13], dVar.O)) {
                    c cVar2 = new c(g0VarB.c(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        g0Var = g0VarB;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (g0Var == null) {
            return null;
        }
        return new r.a(g0Var, i11);
    }

    @Nullable
    public Pair<r.a, Integer> Y(t.a aVar, int[][][] iArr, final d dVar, @Nullable final String str) throws ExoPlaybackException {
        return Z(3, aVar, iArr, new h.a() { // from class: q7.d
            @Override // q7.m.h.a
            public final List a(int i10, g0 g0Var, int[] iArr2) {
                return m.N(dVar, str, i10, g0Var, iArr2);
            }
        }, new Comparator() { // from class: q7.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.c((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    public final <T extends h<T>> Pair<r.a, Integer> Z(int i10, t.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessOf;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                i0 i0VarF = aVar3.f(i12);
                for (int i13 = 0; i13 < i0VarF.f60877b; i13++) {
                    g0 g0VarB = i0VarF.b(i13);
                    List<T> listA = aVar2.a(i12, g0VarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[g0VarB.f60866b];
                    int i14 = 0;
                    while (i14 < g0VarB.f60866b) {
                        T t10 = listA.get(i14);
                        int iA = t10.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessOf = ImmutableList.of(t10);
                                i11 = iD;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < g0VarB.f60866b) {
                                    T t11 = listA.get(i15);
                                    int i16 = iD;
                                    if (t11.a() == 2 && t10.b(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                i11 = iD;
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f78096d;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new r.a(hVar.f78095c, iArr2), Integer.valueOf(hVar.f78094b));
    }

    @Nullable
    public Pair<r.a, Integer> a0(t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) throws ExoPlaybackException {
        return Z(2, aVar, iArr, new h.a() { // from class: q7.h
            @Override // q7.m.h.a
            public final List a(int i10, g0 g0Var, int[] iArr3) {
                return m.O(dVar, iArr2, i10, g0Var, iArr3);
            }
        }, new Comparator() { // from class: q7.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.g((List) obj, (List) obj2);
            }
        });
    }

    public final void b0(d dVar) {
        boolean z10;
        s7.a.e(dVar);
        synchronized (this.f78048d) {
            z10 = !this.f78052h.equals(dVar);
            this.f78052h = dVar;
        }
        if (z10) {
            if (dVar.N && this.f78049e == null) {
                s7.q.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            d();
        }
    }

    @Override // q7.a0
    public boolean e() {
        return true;
    }

    @Override // q7.a0
    public void g() {
        f fVar;
        synchronized (this.f78048d) {
            if (m0.f79487a >= 32 && (fVar = this.f78053i) != null) {
                fVar.f();
            }
        }
        super.g();
    }

    @Override // q7.a0
    public void i(com.google.android.exoplayer2.audio.a aVar) {
        boolean z10;
        synchronized (this.f78048d) {
            z10 = !this.f78054j.equals(aVar);
            this.f78054j = aVar;
        }
        if (z10) {
            S();
        }
    }

    @Override // q7.a0
    public void j(y yVar) {
        if (yVar instanceof d) {
            b0((d) yVar);
        }
        b0(new d.a().g0(yVar).A());
    }

    @Override // q7.t
    public final Pair<v1[], r[]> n(t.a aVar, int[][][] iArr, int[] iArr2, i.b bVar, c0 c0Var) throws ExoPlaybackException {
        d dVar;
        f fVar;
        synchronized (this.f78048d) {
            dVar = this.f78052h;
            if (dVar.N && m0.f79487a >= 32 && (fVar = this.f78053i) != null) {
                fVar.b(this, (Looper) s7.a.i(Looper.myLooper()));
            }
        }
        int iD = aVar.d();
        r.a[] aVarArrV = V(aVar, iArr, iArr2, dVar);
        B(aVar, dVar, aVarArrV);
        A(aVar, dVar, aVarArrV);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (dVar.m(i10) || dVar.A.contains(Integer.valueOf(iE))) {
                aVarArrV[i10] = null;
            }
        }
        r[] rVarArrA = this.f78050f.a(aVarArrV, a(), bVar, c0Var);
        v1[] v1VarArr = new v1[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            boolean z10 = true;
            if ((dVar.m(i11) || dVar.A.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && rVarArrA[i11] == null)) {
                z10 = false;
            }
            v1VarArr[i11] = z10 ? v1.f59706b : null;
        }
        if (dVar.P) {
            R(aVar, iArr, v1VarArr, rVarArrA);
        }
        return Pair.create(v1VarArr, rVarArrA);
    }
}
