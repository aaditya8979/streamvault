package r4;

import a6.t;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f78615a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f78616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k4.i f78617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f78618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f78624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f78625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f78627m;

    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Format f78628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f78629b;
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements g {
        public c() {
        }

        @Override // r4.g
        public long a(k4.h hVar) {
            return -1L;
        }

        @Override // r4.g
        public s createSeekMap() {
            return new s.b(-9223372036854775807L);
        }

        @Override // r4.g
        public void startSeek(long j10) {
        }
    }

    public long a(long j10) {
        return (j10 * 1000000) / ((long) this.f78623i);
    }

    public long b(long j10) {
        return (((long) this.f78623i) * j10) / 1000000;
    }

    public void c(k4.i iVar, u uVar) {
        this.f78617c = iVar;
        this.f78616b = uVar;
        j(true);
    }

    public void d(long j10) {
        this.f78621g = j10;
    }

    public abstract long e(t tVar);

    public final int f(k4.h hVar, r rVar) throws InterruptedException, IOException {
        int i10 = this.f78622h;
        if (i10 == 0) {
            return g(hVar);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return i(hVar, rVar);
            }
            throw new IllegalStateException();
        }
        hVar.skipFully((int) this.f78620f);
        this.f78622h = 2;
        return 0;
    }

    public final int g(k4.h hVar) throws InterruptedException, IOException {
        boolean zH = true;
        while (zH) {
            if (!this.f78615a.d(hVar)) {
                this.f78622h = 3;
                return -1;
            }
            this.f78625k = hVar.getPosition() - this.f78620f;
            zH = h(this.f78615a.c(), this.f78620f, this.f78624j);
            if (zH) {
                this.f78620f = hVar.getPosition();
            }
        }
        Format format = this.f78624j.f78628a;
        this.f78623i = format.f19941x;
        if (!this.f78627m) {
            this.f78616b.d(format);
            this.f78627m = true;
        }
        g gVar = this.f78624j.f78629b;
        if (gVar != null) {
            this.f78618d = gVar;
        } else if (hVar.getLength() == -1) {
            this.f78618d = new c();
        } else {
            f fVarB = this.f78615a.b();
            this.f78618d = new r4.a(this, this.f78620f, hVar.getLength(), fVarB.f78609h + fVarB.f78610i, fVarB.f78604c, (fVarB.f78603b & 4) != 0);
        }
        this.f78624j = null;
        this.f78622h = 2;
        this.f78615a.f();
        return 0;
    }

    public abstract boolean h(t tVar, long j10, b bVar) throws InterruptedException, IOException;

    public final int i(k4.h hVar, r rVar) throws InterruptedException, IOException {
        long jA = this.f78618d.a(hVar);
        if (jA >= 0) {
            rVar.f72918a = jA;
            return 1;
        }
        if (jA < -1) {
            d(-(jA + 2));
        }
        if (!this.f78626l) {
            this.f78617c.c(this.f78618d.createSeekMap());
            this.f78626l = true;
        }
        if (this.f78625k <= 0 && !this.f78615a.d(hVar)) {
            this.f78622h = 3;
            return -1;
        }
        this.f78625k = 0L;
        t tVarC = this.f78615a.c();
        long jE = e(tVarC);
        if (jE >= 0) {
            long j10 = this.f78621g;
            if (j10 + jE >= this.f78619e) {
                long jA2 = a(j10);
                this.f78616b.a(tVarC, tVarC.d());
                this.f78616b.c(jA2, 1, tVarC.d(), 0, null);
                this.f78619e = -1L;
            }
        }
        this.f78621g += jE;
        return 0;
    }

    public void j(boolean z10) {
        if (z10) {
            this.f78624j = new b();
            this.f78620f = 0L;
            this.f78622h = 0;
        } else {
            this.f78622h = 1;
        }
        this.f78619e = -1L;
        this.f78621g = 0L;
    }

    public final void k(long j10, long j11) {
        this.f78615a.e();
        if (j10 == 0) {
            j(!this.f78626l);
        } else if (this.f78622h != 0) {
            long jB = b(j11);
            this.f78619e = jB;
            this.f78618d.startSeek(jB);
            this.f78622h = 2;
        }
    }
}
