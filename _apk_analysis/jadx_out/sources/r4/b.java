package r4;

import a6.k0;
import a6.t;
import java.io.IOException;
import java.util.Arrays;
import k4.l;
import k4.m;
import k4.n;
import k4.s;
import r4.i;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a6.j f78588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f78589o;

    /* JADX INFO: compiled from: FlacReader.java */
    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f78590a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f78591b = -1;

        public a() {
        }

        @Override // r4.g
        public long a(k4.h hVar) throws InterruptedException, IOException {
            long j10 = this.f78591b;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f78591b = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f78590a = j10;
        }

        @Override // r4.g
        public s createSeekMap() {
            a6.a.f(this.f78590a != -1);
            return new n(b.this.f78588n, this.f78590a);
        }

        @Override // r4.g
        public void startSeek(long j10) {
            a6.a.e(b.this.f78588n.f3569k);
            long[] jArr = b.this.f78588n.f3569k.f3571a;
            this.f78591b = jArr[k0.h(jArr, j10, true, true)];
        }
    }

    public static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(t tVar) {
        return tVar.a() >= 5 && tVar.y() == 127 && tVar.A() == 1179402563;
    }

    @Override // r4.i
    public long e(t tVar) {
        if (n(tVar.f3620a)) {
            return m(tVar);
        }
        return -1L;
    }

    @Override // r4.i
    public boolean h(t tVar, long j10, i.b bVar) {
        byte[] bArr = tVar.f3620a;
        if (this.f78588n == null) {
            this.f78588n = new a6.j(bArr, 17);
            bVar.f78628a = this.f78588n.i(Arrays.copyOfRange(bArr, 9, tVar.d()), null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.f78589o = new a();
            this.f78588n = this.f78588n.c(m.g(tVar));
            return true;
        }
        if (!n(bArr)) {
            return true;
        }
        a aVar = this.f78589o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f78629b = this.f78589o;
        }
        return false;
    }

    @Override // r4.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f78588n = null;
            this.f78589o = null;
        }
    }

    public final int m(t tVar) {
        int i10 = (tVar.f3620a[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            tVar.M(4);
            tVar.F();
        }
        int iJ = l.j(tVar, i10);
        tVar.L(0);
        return iJ;
    }
}
