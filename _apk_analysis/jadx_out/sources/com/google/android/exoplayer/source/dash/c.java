package com.google.android.exoplayer.source.dash;

import a6.k0;
import a6.p;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.BehindLiveWindowException;
import com.google.android.exoplayer.source.dash.a;
import com.google.android.exoplayer.source.dash.d;
import com.google.android.exoplayer.upstream.HttpDataSource;
import com.google.android.exoplayer.upstream.a;
import e4.k;
import e4.t0;
import g5.e;
import g5.l;
import g5.m;
import i5.h;
import i5.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k4.g;
import k4.s;
import k4.u;
import q4.f;
import y5.n;
import y5.q;

/* JADX INFO: compiled from: DefaultDashChunkSource.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.google.android.exoplayer.source.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f20472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f20475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final d.c f20478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b[] f20479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer.trackselection.c f20480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i5.b f20481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f20483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20485n;

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class a implements a.InterfaceC0288a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0296a f20486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20487b;

        public a(a.InterfaceC0296a interfaceC0296a) {
            this(interfaceC0296a, 1);
        }

        public a(a.InterfaceC0296a interfaceC0296a, int i10) {
            this.f20486a = interfaceC0296a;
            this.f20487b = i10;
        }

        @Override // com.google.android.exoplayer.source.dash.a.InterfaceC0288a
        public com.google.android.exoplayer.source.dash.a a(n nVar, i5.b bVar, int i10, int[] iArr, com.google.android.exoplayer.trackselection.c cVar, int i11, long j10, boolean z10, List<Format> list, @Nullable d.c cVar2, @Nullable q qVar) {
            com.google.android.exoplayer.upstream.a aVarCreateDataSource = this.f20486a.createDataSource();
            if (qVar != null) {
                aVarCreateDataSource.b(qVar);
            }
            return new c(nVar, bVar, i10, iArr, cVar, i11, aVarCreateDataSource, j10, this.f20487b, z10, list, cVar2);
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final e f20488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f20489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final h5.c f20490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f20491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f20492e;

        public b(long j10, int i10, i iVar, boolean z10, List<Format> list, @Nullable u uVar) {
            this(j10, iVar, d(i10, iVar, z10, list, uVar), 0L, iVar.b());
        }

        public b(long j10, i iVar, @Nullable e eVar, long j11, @Nullable h5.c cVar) {
            this.f20491d = j10;
            this.f20489b = iVar;
            this.f20492e = j11;
            this.f20488a = eVar;
            this.f20490c = cVar;
        }

        @Nullable
        public static e d(int i10, i iVar, boolean z10, List<Format> list, @Nullable u uVar) {
            g fVar;
            String str = iVar.f63782b.f19926i;
            if (m(str)) {
                return null;
            }
            if ("application/x-rawcc".equals(str)) {
                fVar = new s4.a(iVar.f63782b);
            } else if (n(str)) {
                fVar = new o4.e(1);
            } else {
                fVar = new f(z10 ? 4 : 0, null, null, list, uVar);
            }
            return new e(fVar, i10, iVar.f63782b);
        }

        public static boolean m(String str) {
            return p.m(str) || "application/ttml+xml".equals(str);
        }

        public static boolean n(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        @CheckResult
        public b b(long j10, i iVar) throws BehindLiveWindowException {
            int segmentCount;
            long segmentNum;
            h5.c cVarB = this.f20489b.b();
            h5.c cVarB2 = iVar.b();
            if (cVarB == null) {
                return new b(j10, iVar, this.f20488a, this.f20492e, cVarB);
            }
            if (cVarB.isExplicit() && (segmentCount = cVarB.getSegmentCount(j10)) != 0) {
                long firstSegmentNum = cVarB.getFirstSegmentNum();
                long timeUs = cVarB.getTimeUs(firstSegmentNum);
                long j11 = (((long) segmentCount) + firstSegmentNum) - 1;
                long timeUs2 = cVarB.getTimeUs(j11) + cVarB.getDurationUs(j11, j10);
                long firstSegmentNum2 = cVarB2.getFirstSegmentNum();
                long timeUs3 = cVarB2.getTimeUs(firstSegmentNum2);
                long j12 = this.f20492e;
                if (timeUs2 == timeUs3) {
                    segmentNum = j12 + ((j11 + 1) - firstSegmentNum2);
                } else {
                    if (timeUs2 < timeUs3) {
                        throw new BehindLiveWindowException();
                    }
                    segmentNum = timeUs3 < timeUs ? j12 - (cVarB2.getSegmentNum(timeUs, j10) - firstSegmentNum) : (cVarB.getSegmentNum(timeUs3, j10) - firstSegmentNum2) + j12;
                }
                return new b(j10, iVar, this.f20488a, segmentNum, cVarB2);
            }
            return new b(j10, iVar, this.f20488a, this.f20492e, cVarB2);
        }

        @CheckResult
        public b c(h5.c cVar) {
            return new b(this.f20491d, this.f20489b, this.f20488a, this.f20492e, cVar);
        }

        public long e(i5.b bVar, int i10, long j10) {
            if (h() != -1 || bVar.f63741f == -9223372036854775807L) {
                return f();
            }
            return Math.max(f(), j(((j10 - k.a(bVar.f63736a)) - k.a(bVar.c(i10).f63768b)) - k.a(bVar.f63741f)));
        }

        public long f() {
            return this.f20490c.getFirstSegmentNum() + this.f20492e;
        }

        public long g(i5.b bVar, int i10, long j10) {
            int iH = h();
            return (iH == -1 ? j((j10 - k.a(bVar.f63736a)) - k.a(bVar.c(i10).f63768b)) : f() + ((long) iH)) - 1;
        }

        public int h() {
            return this.f20490c.getSegmentCount(this.f20491d);
        }

        public long i(long j10) {
            return k(j10) + this.f20490c.getDurationUs(j10 - this.f20492e, this.f20491d);
        }

        public long j(long j10) {
            return this.f20490c.getSegmentNum(j10, this.f20491d) + this.f20492e;
        }

        public long k(long j10) {
            return this.f20490c.getTimeUs(j10 - this.f20492e);
        }

        public h l(long j10) {
            return this.f20490c.getSegmentUrl(j10 - this.f20492e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.dash.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class C0289c extends g5.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f20493e;

        public C0289c(b bVar, long j10, long j11) {
            super(j10, j11);
            this.f20493e = bVar;
        }
    }

    public c(n nVar, i5.b bVar, int i10, int[] iArr, com.google.android.exoplayer.trackselection.c cVar, int i11, com.google.android.exoplayer.upstream.a aVar, long j10, int i12, boolean z10, List<Format> list, @Nullable d.c cVar2) {
        this.f20472a = nVar;
        this.f20481j = bVar;
        this.f20473b = iArr;
        this.f20480i = cVar;
        this.f20474c = i11;
        this.f20475d = aVar;
        this.f20482k = i10;
        this.f20476e = j10;
        this.f20477f = i12;
        this.f20478g = cVar2;
        long jF = bVar.f(i10);
        this.f20485n = -9223372036854775807L;
        ArrayList<i> arrayListI = i();
        this.f20479h = new b[cVar.length()];
        for (int i13 = 0; i13 < this.f20479h.length; i13++) {
            this.f20479h[i13] = new b(jF, i11, arrayListI.get(cVar.getIndexInTrackGroup(i13)), z10, list, cVar2);
        }
    }

    @Override // g5.h
    public long a(long j10, t0 t0Var) {
        for (b bVar : this.f20479h) {
            if (bVar.f20490c != null) {
                long j11 = bVar.j(j10);
                long jK = bVar.k(j11);
                return k0.x0(j10, t0Var, jK, (jK >= j10 || j11 >= ((long) (bVar.h() + (-1)))) ? jK : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer.source.dash.a
    public void b(com.google.android.exoplayer.trackselection.c cVar) {
        this.f20480i = cVar;
    }

    @Override // g5.h
    public void d(g5.d dVar) {
        s sVarB;
        if (dVar instanceof g5.k) {
            int iB = this.f20480i.b(((g5.k) dVar).f62012c);
            b bVar = this.f20479h[iB];
            if (bVar.f20490c == null && (sVarB = bVar.f20488a.b()) != null) {
                this.f20479h[iB] = bVar.c(new h5.d((k4.b) sVarB, bVar.f20489b.f63784d));
            }
        }
        d.c cVar = this.f20478g;
        if (cVar != null) {
            cVar.h(dVar);
        }
    }

    @Override // g5.h
    public void e(long j10, long j11, List<? extends l> list, g5.f fVar) {
        int i10;
        int i11;
        m[] mVarArr;
        boolean z10;
        long j12;
        if (this.f20483l != null) {
            return;
        }
        long j13 = j11 - j10;
        long jM = m(j10);
        long jA = k.a(this.f20481j.f63736a) + k.a(this.f20481j.c(this.f20482k).f63768b) + j11;
        d.c cVar = this.f20478g;
        if (cVar == null || !cVar.f(jA)) {
            long jH = h();
            boolean z11 = true;
            l lVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f20480i.length();
            m[] mVarArr2 = new m[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f20479h[i12];
                if (bVar.f20490c == null) {
                    mVarArr2[i12] = m.f62078a;
                    i10 = i12;
                    i11 = length;
                    mVarArr = mVarArr2;
                    z10 = z11;
                    j12 = jH;
                } else {
                    long jE = bVar.e(this.f20481j, this.f20482k, jH);
                    long jG = bVar.g(this.f20481j, this.f20482k, jH);
                    i10 = i12;
                    i11 = length;
                    mVarArr = mVarArr2;
                    z10 = true;
                    j12 = jH;
                    long j14 = j(bVar, lVar, j11, jE, jG);
                    if (j14 < jE) {
                        mVarArr[i10] = m.f62078a;
                    } else {
                        mVarArr[i10] = new C0289c(bVar, j14, jG);
                    }
                }
                i12 = i10 + 1;
                z11 = z10;
                length = i11;
                mVarArr2 = mVarArr;
                jH = j12;
            }
            boolean z12 = z11;
            long j15 = jH;
            this.f20480i.a(j10, j13, jM, list, mVarArr2);
            b bVar2 = this.f20479h[this.f20480i.getSelectedIndex()];
            e eVar = bVar2.f20488a;
            if (eVar != null) {
                i iVar = bVar2.f20489b;
                h hVarD = eVar.a() == null ? iVar.d() : null;
                h hVarC = bVar2.f20490c == null ? iVar.c() : null;
                if (hVarD != null || hVarC != null) {
                    fVar.f62034a = k(bVar2, this.f20475d, this.f20480i.getSelectedFormat(), this.f20480i.getSelectionReason(), this.f20480i.getSelectionData(), hVarD, hVarC);
                    return;
                }
            }
            long j16 = bVar2.f20491d;
            boolean z13 = j16 != -9223372036854775807L ? z12 : false;
            if (bVar2.h() == 0) {
                fVar.f62035b = z13;
                return;
            }
            long jE2 = bVar2.e(this.f20481j, this.f20482k, j15);
            long jG2 = bVar2.g(this.f20481j, this.f20482k, j15);
            n(bVar2, jG2);
            boolean z14 = z13;
            long j17 = j(bVar2, lVar, j11, jE2, jG2);
            if (j17 < jE2) {
                this.f20483l = new BehindLiveWindowException();
                return;
            }
            if (j17 > jG2 || (this.f20484m && j17 >= jG2)) {
                fVar.f62035b = z14;
                return;
            }
            if (z14 && bVar2.k(j17) >= j16) {
                fVar.f62035b = true;
                return;
            }
            int iMin = (int) Math.min(this.f20477f, (jG2 - j17) + 1);
            if (j16 != -9223372036854775807L) {
                while (iMin > 1 && bVar2.k((((long) iMin) + j17) - 1) >= j16) {
                    iMin--;
                }
            }
            fVar.f62034a = l(bVar2, this.f20475d, this.f20474c, this.f20480i.getSelectedFormat(), this.f20480i.getSelectionReason(), this.f20480i.getSelectionData(), j17, iMin, list.isEmpty() ? j11 : -9223372036854775807L);
        }
    }

    @Override // g5.h
    public boolean f(g5.d dVar, boolean z10, Exception exc, long j10) {
        b bVar;
        int iH;
        if (!z10) {
            return false;
        }
        d.c cVar = this.f20478g;
        if (cVar != null && cVar.g(dVar)) {
            return true;
        }
        if (!this.f20481j.f63739d && (dVar instanceof l) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).responseCode == 404 && (iH = (bVar = this.f20479h[this.f20480i.b(dVar.f62012c)]).h()) != -1 && iH != 0) {
            if (((l) dVar).e() > (bVar.f() + ((long) iH)) - 1) {
                this.f20484m = true;
                return true;
            }
        }
        if (j10 == -9223372036854775807L) {
            return false;
        }
        com.google.android.exoplayer.trackselection.c cVar2 = this.f20480i;
        return cVar2.blacklist(cVar2.b(dVar.f62012c), j10);
    }

    @Override // com.google.android.exoplayer.source.dash.a
    public void g(i5.b bVar, int i10) {
        try {
            this.f20481j = bVar;
            this.f20482k = i10;
            long jF = bVar.f(i10);
            ArrayList<i> arrayListI = i();
            for (int i11 = 0; i11 < this.f20479h.length; i11++) {
                i iVar = arrayListI.get(this.f20480i.getIndexInTrackGroup(i11));
                b[] bVarArr = this.f20479h;
                bVarArr[i11] = bVarArr[i11].b(jF, iVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f20483l = e10;
        }
    }

    @Override // g5.h
    public int getPreferredQueueSize(long j10, List<? extends l> list) {
        return (this.f20483l != null || this.f20480i.length() < 2) ? list.size() : this.f20480i.evaluateQueueSize(j10, list);
    }

    public final long h() {
        return (this.f20476e != 0 ? SystemClock.elapsedRealtime() + this.f20476e : System.currentTimeMillis()) * 1000;
    }

    public final ArrayList<i> i() {
        List<i5.a> list = this.f20481j.c(this.f20482k).f63769c;
        ArrayList<i> arrayList = new ArrayList<>();
        for (int i10 : this.f20473b) {
            arrayList.addAll(list.get(i10).f63732c);
        }
        return arrayList;
    }

    public final long j(b bVar, @Nullable l lVar, long j10, long j11, long j12) {
        return lVar != null ? lVar.e() : k0.r(bVar.j(j10), j11, j12);
    }

    public g5.d k(b bVar, com.google.android.exoplayer.upstream.a aVar, Format format, int i10, Object obj, h hVar, h hVar2) {
        String str = bVar.f20489b.f63783c;
        if (hVar == null || (hVar2 = hVar.a(hVar2, str)) != null) {
            hVar = hVar2;
        }
        return new g5.k(aVar, new y5.h(hVar.b(str), hVar.f63777a, hVar.f63778b, bVar.f20489b.a()), format, i10, obj, bVar.f20488a);
    }

    public g5.d l(b bVar, com.google.android.exoplayer.upstream.a aVar, int i10, Format format, int i11, Object obj, long j10, int i12, long j11) {
        i iVar = bVar.f20489b;
        long jK = bVar.k(j10);
        h hVarL = bVar.l(j10);
        String str = iVar.f63783c;
        if (bVar.f20488a == null) {
            return new g5.n(aVar, new y5.h(hVarL.b(str), hVarL.f63777a, hVarL.f63778b, iVar.a()), format, i11, obj, jK, bVar.i(j10), j10, i10, format);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            h hVarA = hVarL.a(bVar.l(((long) i13) + j10), str);
            if (hVarA == null) {
                break;
            }
            i14++;
            i13++;
            hVarL = hVarA;
        }
        long jI = bVar.i((((long) i14) + j10) - 1);
        long j12 = bVar.f20491d;
        return new g5.i(aVar, new y5.h(hVarL.b(str), hVarL.f63777a, hVarL.f63778b, iVar.a()), format, i11, obj, jK, jI, j11, (j12 == -9223372036854775807L || j12 > jI) ? -9223372036854775807L : j12, j10, i14, -iVar.f63784d, bVar.f20488a);
    }

    public final long m(long j10) {
        if (this.f20481j.f63739d && this.f20485n != -9223372036854775807L) {
            return this.f20485n - j10;
        }
        return -9223372036854775807L;
    }

    @Override // g5.h
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f20483l;
        if (iOException != null) {
            throw iOException;
        }
        this.f20472a.maybeThrowError();
    }

    public final void n(b bVar, long j10) {
        this.f20485n = this.f20481j.f63739d ? bVar.i(j10) : -9223372036854775807L;
    }
}
