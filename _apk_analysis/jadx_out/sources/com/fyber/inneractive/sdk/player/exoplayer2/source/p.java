package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements s, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public boolean A;
    public long C;
    public int E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f18533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f18535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f18536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f18537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f18538g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f18541j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f18547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.q f18548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f18554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f18555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean[] f18556y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean[] f18557z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18539h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 f18540i = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f18542k = new com.fyber.inneractive.sdk.player.exoplayer2.util.e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f18543l = new i(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f18544m = new j(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f18545n = new Handler();
    public long D = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f18546o = new SparseArray();
    public long B = -1;

    public p(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, int i10, Handler handler, b0 b0Var, t tVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f18532a = uri;
        this.f18533b = hVar;
        this.f18534c = i10;
        this.f18535d = handler;
        this.f18536e = b0Var;
        this.f18537f = tVar;
        this.f18538g = bVar;
        this.f18541j = new n(iVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f18525i;
        }
        Handler handler = this.f18535d;
        if (handler != null && this.f18536e != null) {
            handler.post(new l(this, iOException));
        }
        if ((iOException instanceof a0) || (iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) || ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i10 = h() > this.E ? 1 : 0;
        if (this.B == -1 && ((qVar = this.f18548q) == null || qVar.c() == -9223372036854775807L)) {
            this.C = 0L;
            this.f18552u = this.f18550s;
            int size = this.f18546o.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i11)).a(!this.f18550s || this.f18556y[i11]);
            }
            mVar.f18521e.f17970a = 0L;
            mVar.f18524h = 0L;
            mVar.f18523g = true;
        }
        this.E = h();
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        if (!this.f18548q.a()) {
            j10 = 0;
        }
        this.C = j10;
        int size = this.f18546o.size();
        boolean zA = !(this.D != -9223372036854775807L);
        for (int i10 = 0; zA && i10 < size; i10++) {
            if (this.f18556y[i10]) {
                zA = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i10)).a(false, j10);
            }
        }
        if (!zA) {
            this.D = j10;
            this.F = false;
            if (this.f18540i.a()) {
                this.f18540i.f18604b.a(false);
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i11)).a(this.f18556y[i11]);
                }
            }
        }
        this.f18552u = false;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        if (!this.f18550s) {
            throw new IllegalStateException();
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            if (vVar != null && (bVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((o) vVar).f18530a;
                boolean[] zArr3 = this.f18556y;
                if (!zArr3[i11]) {
                    throw new IllegalStateException();
                }
                this.f18553v--;
                zArr3[i11] = false;
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i11)).b();
                vVarArr[i10] = null;
            }
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (vVarArr[i12] == null && (bVar = bVarArr[i12]) != null) {
                int[] iArr = bVar.f18587c;
                if (iArr.length != 1) {
                    throw new IllegalStateException();
                }
                if (iArr[0] != 0) {
                    throw new IllegalStateException();
                }
                z zVar = this.f18554w;
                y yVar = bVar.f18585a;
                int i13 = 0;
                while (true) {
                    if (i13 >= zVar.f18577a) {
                        i13 = -1;
                        break;
                    }
                    if (zVar.f18578b[i13] == yVar) {
                        break;
                    }
                    i13++;
                }
                boolean[] zArr4 = this.f18556y;
                if (!(!zArr4[i13])) {
                    throw new IllegalStateException();
                }
                this.f18553v++;
                zArr4[i13] = true;
                vVarArr[i12] = new o(this, i13);
                zArr2[i12] = true;
                z10 = true;
            }
        }
        if (!this.f18551t) {
            int size = this.f18546o.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (!this.f18556y[i14]) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i14)).b();
                }
            }
        }
        if (this.f18553v == 0) {
            this.f18552u = false;
            if (this.f18540i.a()) {
                this.f18540i.f18604b.a(false);
            }
        } else if (!this.f18551t ? j10 != 0 : z10) {
            j10 = a(j10);
            for (int i15 = 0; i15 < vVarArr.length; i15++) {
                if (vVarArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.f18551t = true;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.get(i10);
        if (gVar != null) {
            return gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f18538g);
        gVar2.f17466n = this;
        this.f18546o.put(i10, gVar2);
        return gVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f18554w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
        this.f18548q = qVar;
        this.f18545n.post(this.f18543l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        this.f18547p = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f18542k;
        synchronized (eVar) {
            if (!eVar.f18767a) {
                eVar.f18767a = true;
                eVar.notifyAll();
            }
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f18525i;
        }
        this.F = true;
        if (this.f18555x == -9223372036854775807L) {
            int size = this.f18546o.size();
            long jMax = Long.MIN_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i10)).d());
            }
            long j12 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f18555x = j12;
            this.f18537f.a(new x(j12, j12, 0L, 0L, this.f18548q.a(), false), null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f18547p;
        lVar.getClass();
        lVar.f18356f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f18525i;
        }
        if (z10 || this.f18553v <= 0) {
            return;
        }
        int size = this.f18546o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i10)).a(this.f18556y[i10]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f18547p;
        lVar.getClass();
        lVar.f18356f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f18549r = true;
        this.f18545n.post(this.f18543l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean z10 = false;
        if (this.F || (this.f18550s && this.f18553v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f18542k;
        synchronized (eVar) {
            if (!eVar.f18767a) {
                eVar.f18767a = true;
                eVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f18540i.a()) {
            return z10;
        }
        i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        if (this.F) {
            return Long.MIN_VALUE;
        }
        long j10 = this.D;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        int i10 = 0;
        if (this.A) {
            jMax = Long.MAX_VALUE;
            int size = this.f18546o.size();
            while (i10 < size) {
                if (this.f18557z[i10]) {
                    jMax = Math.min(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i10)).d());
                }
                i10++;
            }
        } else {
            int size2 = this.f18546o.size();
            jMax = Long.MIN_VALUE;
            while (i10 < size2) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i10)).d());
                i10++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        this.f18540i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f18545n.post(this.f18543l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        if (this.f18553v == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        if (!this.f18552u) {
            return -9223372036854775807L;
        }
        this.f18552u = false;
        return this.C;
    }

    public final int h() {
        int size = this.f18546o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18546o.valueAt(i11)).f17455c;
            i10 += eVar.f17419j + eVar.f17418i;
        }
        return i10;
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = new m(this, this.f18532a, this.f18533b, this.f18541j, this.f18542k);
        if (this.f18550s) {
            long j10 = this.D;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.f18555x;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.F = true;
                this.D = -9223372036854775807L;
                return;
            }
            long jA = this.f18548q.a(j10);
            long j12 = this.D;
            mVar.f18521e.f17970a = jA;
            mVar.f18524h = j12;
            mVar.f18523g = true;
            this.D = -9223372036854775807L;
        }
        this.E = h();
        int i10 = this.f18534c;
        if (i10 == -1) {
            i10 = (this.f18550s && this.B == -1 && ((qVar = this.f18548q) == null || qVar.c() == -9223372036854775807L)) ? 6 : 3;
        }
        int i11 = i10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.f18540i;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, looperMyLooper, mVar, this, i11, SystemClock.elapsedRealtime());
        if (b0Var.f18604b != null) {
            throw new IllegalStateException();
        }
        b0Var.f18604b = yVar;
        yVar.f18755e = null;
        b0Var.f18603a.execute(yVar);
    }
}
