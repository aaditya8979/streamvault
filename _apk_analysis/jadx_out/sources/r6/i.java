package r6;

import i6.b0;
import i6.l;
import i6.m;
import i6.y;
import i6.z;
import java.io.IOException;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f78707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f78708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f78709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78714i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f78716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f78718m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f78706a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f78715j = new b();

    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.android.exoplayer2.m f78719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f78720b;
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements g {
        public c() {
        }

        @Override // r6.g
        public long a(l lVar) {
            return -1L;
        }

        @Override // r6.g
        public z createSeekMap() {
            return new z.b(-9223372036854775807L);
        }

        @Override // r6.g
        public void startSeek(long j10) {
        }
    }

    public final void a() {
        s7.a.i(this.f78707b);
        m0.j(this.f78708c);
    }

    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f78714i);
    }

    public long c(long j10) {
        return (((long) this.f78714i) * j10) / 1000000;
    }

    public void d(m mVar, b0 b0Var) {
        this.f78708c = mVar;
        this.f78707b = b0Var;
        l(true);
    }

    public void e(long j10) {
        this.f78712g = j10;
    }

    public abstract long f(a0 a0Var);

    public final int g(l lVar, y yVar) throws IOException {
        a();
        int i10 = this.f78713h;
        if (i10 == 0) {
            return j(lVar);
        }
        if (i10 == 1) {
            lVar.skipFully((int) this.f78711f);
            this.f78713h = 2;
            return 0;
        }
        if (i10 == 2) {
            m0.j(this.f78709d);
            return k(lVar, yVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(l lVar) throws IOException {
        while (this.f78706a.d(lVar)) {
            this.f78716k = lVar.getPosition() - this.f78711f;
            if (!i(this.f78706a.c(), this.f78711f, this.f78715j)) {
                return true;
            }
            this.f78711f = lVar.getPosition();
        }
        this.f78713h = 3;
        return false;
    }

    public abstract boolean i(a0 a0Var, long j10, b bVar) throws IOException;

    public final int j(l lVar) throws IOException {
        if (!h(lVar)) {
            return -1;
        }
        com.google.android.exoplayer2.m mVar = this.f78715j.f78719a;
        this.f78714i = mVar.A;
        if (!this.f78718m) {
            this.f78707b.b(mVar);
            this.f78718m = true;
        }
        g gVar = this.f78715j.f78720b;
        if (gVar != null) {
            this.f78709d = gVar;
        } else if (lVar.getLength() == -1) {
            this.f78709d = new c();
        } else {
            f fVarB = this.f78706a.b();
            this.f78709d = new r6.a(this, this.f78711f, lVar.getLength(), fVarB.f78699h + fVarB.f78700i, fVarB.f78694c, (fVarB.f78693b & 4) != 0);
        }
        this.f78713h = 2;
        this.f78706a.f();
        return 0;
    }

    public final int k(l lVar, y yVar) throws IOException {
        long jA = this.f78709d.a(lVar);
        if (jA >= 0) {
            yVar.f63944a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f78717l) {
            this.f78708c.h((z) s7.a.i(this.f78709d.createSeekMap()));
            this.f78717l = true;
        }
        if (this.f78716k <= 0 && !this.f78706a.d(lVar)) {
            this.f78713h = 3;
            return -1;
        }
        this.f78716k = 0L;
        a0 a0VarC = this.f78706a.c();
        long jF = f(a0VarC);
        if (jF >= 0) {
            long j10 = this.f78712g;
            if (j10 + jF >= this.f78710e) {
                long jB = b(j10);
                this.f78707b.e(a0VarC, a0VarC.f());
                this.f78707b.c(jB, 1, a0VarC.f(), 0, null);
                this.f78710e = -1L;
            }
        }
        this.f78712g += jF;
        return 0;
    }

    public void l(boolean z10) {
        if (z10) {
            this.f78715j = new b();
            this.f78711f = 0L;
            this.f78713h = 0;
        } else {
            this.f78713h = 1;
        }
        this.f78710e = -1L;
        this.f78712g = 0L;
    }

    public final void m(long j10, long j11) {
        this.f78706a.e();
        if (j10 == 0) {
            l(!this.f78717l);
        } else if (this.f78713h != 0) {
            this.f78710e = c(j11);
            ((g) m0.j(this.f78709d)).startSeek(this.f78710e);
            this.f78713h = 2;
        }
    }
}
