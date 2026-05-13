package g5;

import a6.k0;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.upstream.Loader;
import e4.f0;
import e4.t0;
import e5.b0;
import e5.h0;
import e5.i0;
import e5.j0;
import g5.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<T extends h> implements i0, j0, Loader.b<d>, Loader.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final int[] f62037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Format[] f62038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f62039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f62040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0.a<g<T>> f62041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0.a f62042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y5.m f62043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Loader f62044j = new Loader("Loader:ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f62045k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<g5.a> f62046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<g5.a> f62047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f62048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0[] f62049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f62050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Format f62051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public b<T> f62052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f62053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f62054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f62055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f62056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62057w;

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<T> f62058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h0 f62059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f62061e;

        public a(g<T> gVar, h0 h0Var, int i10) {
            this.f62058b = gVar;
            this.f62059c = h0Var;
            this.f62060d = i10;
        }

        public final void a() {
            if (this.f62061e) {
                return;
            }
            g.this.f62042h.l(g.this.f62037c[this.f62060d], g.this.f62038d[this.f62060d], 0, null, g.this.f62054t);
            this.f62061e = true;
        }

        @Override // e5.i0
        public int b(f0 f0Var, i4.e eVar, boolean z10) {
            if (g.this.s()) {
                return -3;
            }
            a();
            h0 h0Var = this.f62059c;
            g gVar = g.this;
            return h0Var.K(f0Var, eVar, z10, gVar.f62057w, gVar.f62056v);
        }

        public void c() {
            a6.a.f(g.this.f62039e[this.f62060d]);
            g.this.f62039e[this.f62060d] = false;
        }

        @Override // e5.i0
        public boolean isReady() {
            return !g.this.s() && this.f62059c.E(g.this.f62057w);
        }

        @Override // e5.i0
        public void maybeThrowError() throws IOException {
        }

        @Override // e5.i0
        public int skipData(long j10) {
            if (g.this.s()) {
                return 0;
            }
            a();
            return (!g.this.f62057w || j10 <= this.f62059c.v()) ? this.f62059c.e(j10) : this.f62059c.f();
        }
    }

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface b<T extends h> {
        void b(g<T> gVar);
    }

    public g(int i10, @Nullable int[] iArr, @Nullable Format[] formatArr, T t10, j0.a<g<T>> aVar, y5.b bVar, long j10, com.google.android.exoplayer.drm.a<?> aVar2, y5.m mVar, b0.a aVar3) {
        this.f62036b = i10;
        this.f62037c = iArr;
        this.f62038d = formatArr;
        this.f62040f = t10;
        this.f62041g = aVar;
        this.f62042h = aVar3;
        this.f62043i = mVar;
        ArrayList<g5.a> arrayList = new ArrayList<>();
        this.f62046l = arrayList;
        this.f62047m = Collections.unmodifiableList(arrayList);
        int i11 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f62049o = new h0[length];
        this.f62039e = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        h0[] h0VarArr = new h0[i12];
        h0 h0Var = new h0(bVar, (Looper) a6.a.e(Looper.myLooper()), aVar2);
        this.f62048n = h0Var;
        iArr2[0] = i10;
        h0VarArr[0] = h0Var;
        while (i11 < length) {
            h0 h0Var2 = new h0(bVar, (Looper) a6.a.e(Looper.myLooper()), com.google.android.exoplayer.drm.a.a());
            this.f62049o[i11] = h0Var2;
            int i13 = i11 + 1;
            h0VarArr[i13] = h0Var2;
            iArr2[i13] = iArr[i11];
            i11 = i13;
        }
        this.f62050p = new c(iArr2, h0VarArr);
        this.f62053s = j10;
        this.f62054t = j10;
    }

    public void A(@Nullable b<T> bVar) {
        this.f62052r = bVar;
        this.f62048n.J();
        for (h0 h0Var : this.f62049o) {
            h0Var.J();
        }
        this.f62044j.l(this);
    }

    public void B(long j10) {
        boolean zS;
        this.f62054t = j10;
        if (s()) {
            this.f62053s = j10;
            return;
        }
        g5.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f62046l.size()) {
                break;
            }
            g5.a aVar2 = this.f62046l.get(i11);
            long j11 = aVar2.f62015f;
            if (j11 == j10 && aVar2.f62001j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (j11 > j10) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            zS = this.f62048n.R(aVar.g(0));
            this.f62056v = 0L;
        } else {
            zS = this.f62048n.S(j10, j10 < getNextLoadPositionUs());
            this.f62056v = this.f62054t;
        }
        if (zS) {
            this.f62055u = y(this.f62048n.x(), 0);
            h0[] h0VarArr = this.f62049o;
            int length = h0VarArr.length;
            while (i10 < length) {
                h0VarArr[i10].S(j10, true);
                i10++;
            }
            return;
        }
        this.f62053s = j10;
        this.f62057w = false;
        this.f62046l.clear();
        this.f62055u = 0;
        if (this.f62044j.i()) {
            this.f62044j.e();
            return;
        }
        this.f62044j.f();
        this.f62048n.O();
        h0[] h0VarArr2 = this.f62049o;
        int length2 = h0VarArr2.length;
        while (i10 < length2) {
            h0VarArr2[i10].O();
            i10++;
        }
    }

    public g<T>.a C(long j10, int i10) {
        for (int i11 = 0; i11 < this.f62049o.length; i11++) {
            if (this.f62037c[i11] == i10) {
                a6.a.f(!this.f62039e[i11]);
                this.f62039e[i11] = true;
                this.f62049o[i11].S(j10, true);
                return new a(this, this.f62049o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public long a(long j10, t0 t0Var) {
        return this.f62040f.a(j10, t0Var);
    }

    @Override // e5.i0
    public int b(f0 f0Var, i4.e eVar, boolean z10) {
        if (s()) {
            return -3;
        }
        t();
        return this.f62048n.K(f0Var, eVar, z10, this.f62057w, this.f62056v);
    }

    @Override // e5.j0
    public boolean continueLoading(long j10) {
        List<g5.a> listEmptyList;
        long j11;
        if (this.f62057w || this.f62044j.i() || this.f62044j.h()) {
            return false;
        }
        boolean zS = s();
        if (zS) {
            listEmptyList = Collections.emptyList();
            j11 = this.f62053s;
        } else {
            listEmptyList = this.f62047m;
            j11 = p().f62016g;
        }
        this.f62040f.e(j10, j11, listEmptyList, this.f62045k);
        f fVar = this.f62045k;
        boolean z10 = fVar.f62035b;
        d dVar = fVar.f62034a;
        fVar.a();
        if (z10) {
            this.f62053s = -9223372036854775807L;
            this.f62057w = true;
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (r(dVar)) {
            g5.a aVar = (g5.a) dVar;
            if (zS) {
                long j12 = aVar.f62015f;
                long j13 = this.f62053s;
                if (j12 == j13) {
                    j13 = 0;
                }
                this.f62056v = j13;
                this.f62053s = -9223372036854775807L;
            }
            aVar.i(this.f62050p);
            this.f62046l.add(aVar);
        } else if (dVar instanceof k) {
            ((k) dVar).e(this.f62050p);
        }
        this.f62042h.G(dVar.f62010a, dVar.f62011b, this.f62036b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, this.f62044j.m(dVar, this, this.f62043i.getMinimumLoadableRetryCount(dVar.f62011b)));
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        if (s()) {
            return;
        }
        int iT = this.f62048n.t();
        this.f62048n.m(j10, z10, true);
        int iT2 = this.f62048n.t();
        if (iT2 > iT) {
            long jU = this.f62048n.u();
            int i10 = 0;
            while (true) {
                h0[] h0VarArr = this.f62049o;
                if (i10 >= h0VarArr.length) {
                    break;
                }
                h0VarArr[i10].m(jU, z10, this.f62039e[i10]);
                i10++;
            }
        }
        m(iT2);
    }

    @Override // e5.j0
    public long getBufferedPositionUs() {
        if (this.f62057w) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.f62053s;
        }
        long jMax = this.f62054t;
        g5.a aVarP = p();
        if (!aVarP.f()) {
            if (this.f62046l.size() > 1) {
                aVarP = this.f62046l.get(r2.size() - 2);
            } else {
                aVarP = null;
            }
        }
        if (aVarP != null) {
            jMax = Math.max(jMax, aVarP.f62016g);
        }
        return Math.max(jMax, this.f62048n.v());
    }

    @Override // e5.j0
    public long getNextLoadPositionUs() {
        if (s()) {
            return this.f62053s;
        }
        if (this.f62057w) {
            return Long.MIN_VALUE;
        }
        return p().f62016g;
    }

    @Override // e5.j0
    public boolean isLoading() {
        return this.f62044j.i();
    }

    @Override // e5.i0
    public boolean isReady() {
        return !s() && this.f62048n.E(this.f62057w);
    }

    public final void m(int i10) {
        int iMin = Math.min(y(i10, 0), this.f62055u);
        if (iMin > 0) {
            k0.w0(this.f62046l, 0, iMin);
            this.f62055u -= iMin;
        }
    }

    @Override // e5.i0
    public void maybeThrowError() throws IOException {
        this.f62044j.maybeThrowError();
        this.f62048n.G();
        if (this.f62044j.i()) {
            return;
        }
        this.f62040f.maybeThrowError();
    }

    public final g5.a n(int i10) {
        g5.a aVar = this.f62046l.get(i10);
        ArrayList<g5.a> arrayList = this.f62046l;
        k0.w0(arrayList, i10, arrayList.size());
        this.f62055u = Math.max(this.f62055u, this.f62046l.size());
        int i11 = 0;
        this.f62048n.q(aVar.g(0));
        while (true) {
            h0[] h0VarArr = this.f62049o;
            if (i11 >= h0VarArr.length) {
                return aVar;
            }
            h0 h0Var = h0VarArr[i11];
            i11++;
            h0Var.q(aVar.g(i11));
        }
    }

    public T o() {
        return this.f62040f;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.f
    public void onLoaderReleased() {
        this.f62048n.M();
        for (h0 h0Var : this.f62049o) {
            h0Var.M();
        }
        b<T> bVar = this.f62052r;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public final g5.a p() {
        return this.f62046l.get(r0.size() - 1);
    }

    public final boolean q(int i10) {
        int iX;
        g5.a aVar = this.f62046l.get(i10);
        if (this.f62048n.x() > aVar.g(0)) {
            return true;
        }
        int i11 = 0;
        do {
            h0[] h0VarArr = this.f62049o;
            if (i11 >= h0VarArr.length) {
                return false;
            }
            iX = h0VarArr[i11].x();
            i11++;
        } while (iX <= aVar.g(i11));
        return true;
    }

    public final boolean r(d dVar) {
        return dVar instanceof g5.a;
    }

    @Override // e5.j0
    public void reevaluateBuffer(long j10) {
        int size;
        int preferredQueueSize;
        if (this.f62044j.i() || this.f62044j.h() || s() || (size = this.f62046l.size()) <= (preferredQueueSize = this.f62040f.getPreferredQueueSize(j10, this.f62047m))) {
            return;
        }
        while (true) {
            if (preferredQueueSize >= size) {
                preferredQueueSize = size;
                break;
            } else if (!q(preferredQueueSize)) {
                break;
            } else {
                preferredQueueSize++;
            }
        }
        if (preferredQueueSize == size) {
            return;
        }
        long j11 = p().f62016g;
        g5.a aVarN = n(preferredQueueSize);
        if (this.f62046l.isEmpty()) {
            this.f62053s = this.f62054t;
        }
        this.f62057w = false;
        this.f62042h.N(this.f62036b, aVarN.f62015f, j11);
    }

    public boolean s() {
        return this.f62053s != -9223372036854775807L;
    }

    @Override // e5.i0
    public int skipData(long j10) {
        if (s()) {
            return 0;
        }
        int iE = (!this.f62057w || j10 <= this.f62048n.v()) ? this.f62048n.e(j10) : this.f62048n.f();
        t();
        return iE;
    }

    public final void t() {
        int iY = y(this.f62048n.x(), this.f62055u - 1);
        while (true) {
            int i10 = this.f62055u;
            if (i10 > iY) {
                return;
            }
            this.f62055u = i10 + 1;
            u(i10);
        }
    }

    public final void u(int i10) {
        g5.a aVar = this.f62046l.get(i10);
        Format format = aVar.f62012c;
        if (!format.equals(this.f62051q)) {
            this.f62042h.l(this.f62036b, format, aVar.f62013d, aVar.f62014e, aVar.f62015f);
        }
        this.f62051q = format;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void l(d dVar, long j10, long j11, boolean z10) {
        this.f62042h.x(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f62036b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, dVar.a());
        if (z10) {
            return;
        }
        this.f62048n.O();
        for (h0 h0Var : this.f62049o) {
            h0Var.O();
        }
        this.f62041g.c(this);
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void j(d dVar, long j10, long j11) {
        this.f62040f.d(dVar);
        this.f62042h.A(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f62036b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, dVar.a());
        this.f62041g.c(this);
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Loader.c g(d dVar, long j10, long j11, IOException iOException, int i10) {
        long jA = dVar.a();
        boolean zR = r(dVar);
        int size = this.f62046l.size() - 1;
        boolean z10 = (jA != 0 && zR && q(size)) ? false : true;
        Loader.c cVarG = null;
        if (this.f62040f.f(dVar, z10, iOException, z10 ? this.f62043i.a(dVar.f62011b, j11, iOException, i10) : -9223372036854775807L)) {
            if (z10) {
                cVarG = Loader.f21018f;
                if (zR) {
                    a6.a.f(n(size) == dVar);
                    if (this.f62046l.isEmpty()) {
                        this.f62053s = this.f62054t;
                    }
                }
            } else {
                a6.m.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVarG == null) {
            long jB = this.f62043i.b(dVar.f62011b, j11, iOException, i10);
            cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f21019g;
        }
        Loader.c cVar = cVarG;
        boolean z11 = !cVar.c();
        this.f62042h.D(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f62036b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, jA, iOException, z11);
        if (z11) {
            this.f62041g.c(this);
        }
        return cVar;
    }

    public final int y(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f62046l.size()) {
                return this.f62046l.size() - 1;
            }
        } while (this.f62046l.get(i11).g(0) <= i10);
        return i11 - 1;
    }

    public void z() {
        A(null);
    }
}
