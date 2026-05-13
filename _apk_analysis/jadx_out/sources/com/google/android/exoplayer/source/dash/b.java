package com.google.android.exoplayer.source.dash;

import a6.k0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.source.dash.a;
import com.google.android.exoplayer.source.dash.d;
import e4.t0;
import e5.b0;
import e5.i0;
import e5.j0;
import e5.k;
import e5.q;
import g5.g;
import i5.e;
import i5.f;
import i5.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y5.m;
import y5.n;

/* JADX INFO: compiled from: DashMediaPeriod.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements q, j0.a<g<com.google.android.exoplayer.source.dash.a>>, g.b<com.google.android.exoplayer.source.dash.a> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f20442x = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0288a f20444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final y5.q f20445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f20446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f20447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f20449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y5.b f20450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TrackGroupArray f20451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f20452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e5.g f20453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f20454m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f20456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public q.a f20457p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j0 f20460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i5.b f20461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<e> f20463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20464w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g<com.google.android.exoplayer.source.dash.a>[] f20458q = v(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h5.e[] f20459r = new h5.e[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IdentityHashMap<g<com.google.android.exoplayer.source.dash.a>, d.c> f20455n = new IdentityHashMap<>();

    /* JADX INFO: compiled from: DashMediaPeriod.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f20465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20471g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f20466b = i10;
            this.f20465a = iArr;
            this.f20467c = i11;
            this.f20469e = i12;
            this.f20470f = i13;
            this.f20471g = i14;
            this.f20468d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(4, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(4, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, i5.b bVar, int i11, a.InterfaceC0288a interfaceC0288a, @Nullable y5.q qVar, com.google.android.exoplayer.drm.a<?> aVar, m mVar, b0.a aVar2, long j10, n nVar, y5.b bVar2, e5.g gVar, d.b bVar3) {
        this.f20443b = i10;
        this.f20461t = bVar;
        this.f20462u = i11;
        this.f20444c = interfaceC0288a;
        this.f20445d = qVar;
        this.f20446e = aVar;
        this.f20447f = mVar;
        this.f20456o = aVar2;
        this.f20448g = j10;
        this.f20449h = nVar;
        this.f20450i = bVar2;
        this.f20453l = gVar;
        this.f20454m = new d(bVar, bVar3, bVar2);
        this.f20460s = gVar.a(this.f20458q);
        f fVarC = bVar.c(i11);
        List<e> list = fVarC.f63770d;
        this.f20463v = list;
        Pair<TrackGroupArray, a[]> pairL = l(aVar, fVarC.f63769c, list);
        this.f20451j = (TrackGroupArray) pairL.first;
        this.f20452k = (a[]) pairL.second;
        aVar2.I();
    }

    public static Format g(int i10) {
        return h(i10, null, -1);
    }

    public static Format h(int i10, String str, int i11) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(":cea608");
        if (i11 != -1) {
            str2 = StringUtils.PROCESS_POSTFIX_DELIMITER + i11;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return Format.z(sb2.toString(), "application/cea-608", null, -1, 0, str, i11, null, Long.MAX_VALUE, null);
    }

    public static void i(List<e> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            trackGroupArr[i10] = new TrackGroup(Format.u(list.get(i11).a(), "application/x-emsg", null, -1, null));
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    public static int j(com.google.android.exoplayer.drm.a<?> aVar, List<i5.a> list, int[][] iArr, int i10, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f63732c);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i16 = 0; i16 < size; i16++) {
                Format formatF = ((i) arrayList.get(i16)).f63782b;
                DrmInitData drmInitData = formatF.f19930m;
                if (drmInitData != null) {
                    formatF = formatF.f(aVar.e(drmInitData));
                }
                formatArr2[i16] = formatF;
            }
            i5.a aVar2 = list.get(iArr2[0]);
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i17 + 1;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (formatArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            trackGroupArr[i14] = new TrackGroup(formatArr2);
            aVarArr[i14] = a.d(aVar2.f63731b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                trackGroupArr[i17] = new TrackGroup(Format.u(aVar2.f63730a + ":emsg", "application/x-emsg", null, -1, null));
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                trackGroupArr[i11] = new TrackGroup(formatArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    public static Pair<TrackGroupArray, a[]> l(com.google.android.exoplayer.drm.a<?> aVar, List<i5.a> list, List<e> list2) {
        int[][] iArrQ = q(list);
        int length = iArrQ.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int iU = u(length, list, iArrQ, zArr, formatArr) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iU];
        a[] aVarArr = new a[iU];
        i(list2, trackGroupArr, aVarArr, j(aVar, list, iArrQ, length, zArr, formatArr, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    public static i5.d m(List<i5.d> list) {
        return n(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    public static i5.d n(List<i5.d> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            i5.d dVar = list.get(i10);
            if (str.equals(dVar.f63759a)) {
                return dVar;
            }
        }
        return null;
    }

    @Nullable
    public static i5.d o(List<i5.d> list) {
        return n(list, "http://dashif.org/guidelines/trickmode");
    }

    public static Format[] p(List<i5.a> list, int[] iArr) {
        for (int i10 : iArr) {
            i5.a aVar = list.get(i10);
            List<i5.d> list2 = list.get(i10).f63733d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                i5.d dVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f63759a)) {
                    String str = dVar.f63760b;
                    if (str == null) {
                        return new Format[]{g(aVar.f63730a)};
                    }
                    String[] strArrD0 = k0.D0(str, ";");
                    Format[] formatArr = new Format[strArrD0.length];
                    for (int i12 = 0; i12 < strArrD0.length; i12++) {
                        Matcher matcher = f20442x.matcher(strArrD0[i12]);
                        if (!matcher.matches()) {
                            return new Format[]{g(aVar.f63730a)};
                        }
                        formatArr[i12] = h(aVar.f63730a, matcher.group(2), Integer.parseInt(matcher.group(1)));
                    }
                    return formatArr;
                }
            }
        }
        return new Format[0];
    }

    public static int[][] q(List<i5.a> list) {
        int iMin;
        i5.d dVarM;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(list.get(i10).f63730a, i10);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            i5.a aVar = list.get(i11);
            i5.d dVarO = o(aVar.f63734e);
            if (dVarO == null) {
                dVarO = o(aVar.f63735f);
            }
            if (dVarO == null || (iMin = sparseIntArray.get(Integer.parseInt(dVarO.f63760b), -1)) == -1) {
                iMin = i11;
            }
            if (iMin == i11 && (dVarM = m(aVar.f63735f)) != null) {
                for (String str : k0.D0(dVarM.f63760b, StringUtils.COMMA)) {
                    int i12 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i12 != -1) {
                        iMin = Math.min(iMin, i12);
                    }
                }
            }
            if (iMin != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] iArrI0 = k0.I0((List) arrayList.get(i13));
            iArr[i13] = iArrI0;
            Arrays.sort(iArrI0);
        }
        return iArr;
    }

    public static boolean t(List<i5.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<i> list2 = list.get(i10).f63732c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f63785e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int u(int i10, List<i5.a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (t(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            Format[] formatArrP = p(list, iArr[i12]);
            formatArr[i12] = formatArrP;
            if (formatArrP.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    public static g<com.google.android.exoplayer.source.dash.a>[] v(int i10) {
        return new g[i10];
    }

    public final void A(com.google.android.exoplayer.trackselection.c[] cVarArr, i0[] i0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            com.google.android.exoplayer.trackselection.c cVar = cVarArr[i10];
            if (cVar != null) {
                i0 i0Var = i0VarArr[i10];
                if (i0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f20452k[iArr[i10]];
                    int i11 = aVar.f20467c;
                    if (i11 == 0) {
                        i0VarArr[i10] = k(aVar, cVar, j10);
                    } else if (i11 == 2) {
                        i0VarArr[i10] = new h5.e(this.f20463v.get(aVar.f20468d), cVar.getTrackGroup().b(0), this.f20461t.f63739d);
                    }
                } else if (i0Var instanceof g) {
                    ((com.google.android.exoplayer.source.dash.a) ((g) i0Var).o()).b(cVar);
                }
            }
        }
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            if (i0VarArr[i12] == null && cVarArr[i12] != null) {
                a aVar2 = this.f20452k[iArr[i12]];
                if (aVar2.f20467c == 1) {
                    int iR = r(i12, iArr);
                    if (iR == -1) {
                        i0VarArr[i12] = new k();
                    } else {
                        i0VarArr[i12] = ((g) i0VarArr[iR]).C(j10, aVar2.f20466b);
                    }
                }
            }
        }
    }

    public void B(i5.b bVar, int i10) {
        this.f20461t = bVar;
        this.f20462u = i10;
        this.f20454m.p(bVar);
        g<com.google.android.exoplayer.source.dash.a>[] gVarArr = this.f20458q;
        if (gVarArr != null) {
            for (g<com.google.android.exoplayer.source.dash.a> gVar : gVarArr) {
                ((com.google.android.exoplayer.source.dash.a) gVar.o()).g(bVar, i10);
            }
            this.f20457p.c(this);
        }
        this.f20463v = bVar.c(i10).f63770d;
        for (h5.e eVar : this.f20459r) {
            Iterator<e> it = this.f20463v.iterator();
            while (true) {
                if (it.hasNext()) {
                    e next = it.next();
                    if (next.a().equals(eVar.a())) {
                        eVar.d(next, bVar.f63739d && i10 == bVar.d() - 1);
                    }
                }
            }
        }
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        for (g<com.google.android.exoplayer.source.dash.a> gVar : this.f20458q) {
            if (gVar.f62036b == 2) {
                return gVar.a(j10, t0Var);
            }
        }
        return j10;
    }

    @Override // g5.g.b
    public synchronized void b(g<com.google.android.exoplayer.source.dash.a> gVar) {
        d.c cVarRemove = this.f20455n.remove(gVar);
        if (cVarRemove != null) {
            cVarRemove.l();
        }
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        return this.f20460s.continueLoading(j10);
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        for (g<com.google.android.exoplayer.source.dash.a> gVar : this.f20458q) {
            gVar.discardBuffer(j10, z10);
        }
    }

    @Override // e5.q
    public long e(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        int[] iArrS = s(cVarArr);
        y(cVarArr, zArr, i0VarArr);
        z(cVarArr, i0VarArr, iArrS);
        A(cVarArr, i0VarArr, zArr2, j10, iArrS);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i0 i0Var : i0VarArr) {
            if (i0Var instanceof g) {
                arrayList.add((g) i0Var);
            } else if (i0Var instanceof h5.e) {
                arrayList2.add((h5.e) i0Var);
            }
        }
        g<com.google.android.exoplayer.source.dash.a>[] gVarArrV = v(arrayList.size());
        this.f20458q = gVarArrV;
        arrayList.toArray(gVarArrV);
        h5.e[] eVarArr = new h5.e[arrayList2.size()];
        this.f20459r = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f20460s = this.f20453l.a(this.f20458q);
        return j10;
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f20457p = aVar;
        aVar.d(this);
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        return this.f20460s.getBufferedPositionUs();
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        return this.f20460s.getNextLoadPositionUs();
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return this.f20451j;
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        return this.f20460s.isLoading();
    }

    public final g<com.google.android.exoplayer.source.dash.a> k(a aVar, com.google.android.exoplayer.trackselection.c cVar, long j10) {
        int i10;
        TrackGroup trackGroupB;
        TrackGroup trackGroupB2;
        int i11;
        int i12 = aVar.f20470f;
        boolean z10 = i12 != -1;
        d.c cVarK = null;
        if (z10) {
            trackGroupB = this.f20451j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            trackGroupB = null;
        }
        int i13 = aVar.f20471g;
        boolean z11 = i13 != -1;
        if (z11) {
            trackGroupB2 = this.f20451j.b(i13);
            i10 += trackGroupB2.f20388b;
        } else {
            trackGroupB2 = null;
        }
        Format[] formatArr = new Format[i10];
        int[] iArr = new int[i10];
        if (z10) {
            formatArr[0] = trackGroupB.b(0);
            iArr[0] = 4;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < trackGroupB2.f20388b; i14++) {
                Format formatB = trackGroupB2.b(i14);
                formatArr[i11] = formatB;
                iArr[i11] = 3;
                arrayList.add(formatB);
                i11++;
            }
        }
        if (this.f20461t.f63739d && z10) {
            cVarK = this.f20454m.k();
        }
        d.c cVar2 = cVarK;
        g<com.google.android.exoplayer.source.dash.a> gVar = new g<>(aVar.f20466b, iArr, formatArr, this.f20444c.a(this.f20449h, this.f20461t, this.f20462u, aVar.f20465a, cVar, aVar.f20466b, this.f20448g, z10, arrayList, cVar2, this.f20445d), this, this.f20450i, j10, this.f20446e, this.f20447f, this.f20456o);
        synchronized (this) {
            this.f20455n.put(gVar, cVar2);
        }
        return gVar;
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        this.f20449h.maybeThrowError();
    }

    public final int r(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f20452k[i11].f20469e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f20452k[i14].f20467c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // e5.q
    public long readDiscontinuity() {
        if (this.f20464w) {
            return -9223372036854775807L;
        }
        this.f20456o.L();
        this.f20464w = true;
        return -9223372036854775807L;
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
        this.f20460s.reevaluateBuffer(j10);
    }

    public final int[] s(com.google.android.exoplayer.trackselection.c[] cVarArr) {
        int[] iArr = new int[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            com.google.android.exoplayer.trackselection.c cVar = cVarArr[i10];
            if (cVar != null) {
                iArr[i10] = this.f20451j.c(cVar.getTrackGroup());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    @Override // e5.q
    public long seekToUs(long j10) {
        for (g<com.google.android.exoplayer.source.dash.a> gVar : this.f20458q) {
            gVar.B(j10);
        }
        for (h5.e eVar : this.f20459r) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(g<com.google.android.exoplayer.source.dash.a> gVar) {
        this.f20457p.c(this);
    }

    public void x() {
        this.f20454m.n();
        for (g<com.google.android.exoplayer.source.dash.a> gVar : this.f20458q) {
            gVar.A(this);
        }
        this.f20457p = null;
        this.f20456o.J();
    }

    public final void y(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr) {
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10] == null || !zArr[i10]) {
                i0 i0Var = i0VarArr[i10];
                if (i0Var instanceof g) {
                    ((g) i0Var).A(this);
                } else if (i0Var instanceof g.a) {
                    ((g.a) i0Var).c();
                }
                i0VarArr[i10] = null;
            }
        }
    }

    public final void z(com.google.android.exoplayer.trackselection.c[] cVarArr, i0[] i0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            i0 i0Var = i0VarArr[i10];
            if ((i0Var instanceof k) || (i0Var instanceof g.a)) {
                int iR = r(i10, iArr);
                if (iR == -1) {
                    z10 = i0VarArr[i10] instanceof k;
                } else {
                    i0 i0Var2 = i0VarArr[i10];
                    z10 = (i0Var2 instanceof g.a) && ((g.a) i0Var2).f62058b == i0VarArr[iR];
                }
                if (!z10) {
                    i0 i0Var3 = i0VarArr[i10];
                    if (i0Var3 instanceof g.a) {
                        ((g.a) i0Var3).c();
                    }
                    i0VarArr[i10] = null;
                }
            }
        }
    }
}
