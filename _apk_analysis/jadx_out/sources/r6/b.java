package r6;

import androidx.annotation.Nullable;
import i6.l;
import i6.q;
import i6.r;
import i6.s;
import i6.t;
import i6.z;
import java.util.Arrays;
import r6.i;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public t f78677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public a f78678o;

    /* JADX INFO: compiled from: FlacReader.java */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f78679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t.a f78680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f78681c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f78682d = -1;

        public a(t tVar, t.a aVar) {
            this.f78679a = tVar;
            this.f78680b = aVar;
        }

        @Override // r6.g
        public long a(l lVar) {
            long j10 = this.f78682d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f78682d = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f78681c = j10;
        }

        @Override // r6.g
        public z createSeekMap() {
            s7.a.g(this.f78681c != -1);
            return new s(this.f78679a, this.f78681c);
        }

        @Override // r6.g
        public void startSeek(long j10) {
            long[] jArr = this.f78680b.f63933a;
            this.f78682d = jArr[m0.i(jArr, j10, true, true)];
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.D() == 127 && a0Var.F() == 1179402563;
    }

    @Override // r6.i
    public long f(a0 a0Var) {
        if (o(a0Var.d())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // r6.i
    public boolean i(a0 a0Var, long j10, i.b bVar) {
        byte[] bArrD = a0Var.d();
        t tVar = this.f78677n;
        if (tVar == null) {
            t tVar2 = new t(bArrD, 17);
            this.f78677n = tVar2;
            bVar.f78719a = tVar2.g(Arrays.copyOfRange(bArrD, 9, a0Var.f()), null);
            return true;
        }
        if ((bArrD[0] & 127) == 3) {
            t.a aVarG = r.g(a0Var);
            t tVarB = tVar.b(aVarG);
            this.f78677n = tVarB;
            this.f78678o = new a(tVarB, aVarG);
            return true;
        }
        if (!o(bArrD)) {
            return true;
        }
        a aVar = this.f78678o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f78720b = this.f78678o;
        }
        s7.a.e(bVar.f78719a);
        return false;
    }

    @Override // r6.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f78677n = null;
            this.f78678o = null;
        }
    }

    public final int n(a0 a0Var) {
        int i10 = (a0Var.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.Q(4);
            a0Var.K();
        }
        int iJ = q.j(a0Var, i10);
        a0Var.P(0);
        return iJ;
    }
}
