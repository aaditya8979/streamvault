package r6;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.common.collect.ImmutableList;
import i6.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import r6.i;
import s7.a0;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public a f78721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f78722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public e0.d f78724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public e0.b f78725r;

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0.d f78726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0.b f78727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f78728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e0.c[] f78729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78730e;

        public a(e0.d dVar, e0.b bVar, byte[] bArr, e0.c[] cVarArr, int i10) {
            this.f78726a = dVar;
            this.f78727b = bVar;
            this.f78728c = bArr;
            this.f78729d = cVarArr;
            this.f78730e = i10;
        }
    }

    @VisibleForTesting
    public static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.f() + 4) {
            a0Var.M(Arrays.copyOf(a0Var.d(), a0Var.f() + 4));
        } else {
            a0Var.O(a0Var.f() + 4);
        }
        byte[] bArrD = a0Var.d();
        bArrD[a0Var.f() - 4] = (byte) (j10 & 255);
        bArrD[a0Var.f() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrD[a0Var.f() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrD[a0Var.f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static int o(byte b10, a aVar) {
        return !aVar.f78729d[p(b10, aVar.f78730e, 1)].f63883a ? aVar.f78726a.f63893g : aVar.f78726a.f63894h;
    }

    @VisibleForTesting
    public static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return e0.m(1, a0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // r6.i
    public void e(long j10) {
        super.e(j10);
        this.f78723p = j10 != 0;
        e0.d dVar = this.f78724q;
        this.f78722o = dVar != null ? dVar.f63893g : 0;
    }

    @Override // r6.i
    public long f(a0 a0Var) {
        if ((a0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(a0Var.d()[0], (a) s7.a.i(this.f78721n));
        long j10 = this.f78723p ? (this.f78722o + iO) / 4 : 0;
        n(a0Var, j10);
        this.f78723p = true;
        this.f78722o = iO;
        return j10;
    }

    @Override // r6.i
    public boolean i(a0 a0Var, long j10, i.b bVar) throws IOException {
        if (this.f78721n != null) {
            s7.a.e(bVar.f78719a);
            return false;
        }
        a aVarQ = q(a0Var);
        this.f78721n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        e0.d dVar = aVarQ.f78726a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f63896j);
        arrayList.add(aVarQ.f78728c);
        bVar.f78719a = new m.b().e0("audio/vorbis").G(dVar.f63891e).Z(dVar.f63890d).H(dVar.f63888b).f0(dVar.f63889c).T(arrayList).X(e0.c(ImmutableList.copyOf(aVarQ.f78727b.f63881b))).E();
        return true;
    }

    @Override // r6.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f78721n = null;
            this.f78724q = null;
            this.f78725r = null;
        }
        this.f78722o = 0;
        this.f78723p = false;
    }

    @Nullable
    @VisibleForTesting
    public a q(a0 a0Var) throws IOException {
        e0.d dVar = this.f78724q;
        if (dVar == null) {
            this.f78724q = e0.k(a0Var);
            return null;
        }
        e0.b bVar = this.f78725r;
        if (bVar == null) {
            this.f78725r = e0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.f()];
        System.arraycopy(a0Var.d(), 0, bArr, 0, a0Var.f());
        return new a(dVar, bVar, bArr, e0.l(a0Var, dVar.f63888b), e0.a(r4.length - 1));
    }
}
