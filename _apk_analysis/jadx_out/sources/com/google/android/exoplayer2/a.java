package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.c0;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e7.c0 f21180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21181f;

    public a(boolean z10, e7.c0 c0Var) {
        this.f21181f = z10;
        this.f21180e = c0Var;
        this.f21179d = c0Var.getLength();
    }

    public static Object B(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object C(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object E(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public abstract Object D(int i10);

    public abstract int F(int i10);

    public abstract int G(int i10);

    public final int H(int i10, boolean z10) {
        if (z10) {
            return this.f21180e.getNextIndex(i10);
        }
        if (i10 < this.f21179d - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int I(int i10, boolean z10) {
        if (z10) {
            return this.f21180e.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract c0 J(int i10);

    @Override // com.google.android.exoplayer2.c0
    public int e(boolean z10) {
        if (this.f21179d == 0) {
            return -1;
        }
        if (this.f21181f) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f21180e.getFirstIndex() : 0;
        while (J(firstIndex).u()) {
            firstIndex = H(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return G(firstIndex) + J(firstIndex).e(z10);
    }

    @Override // com.google.android.exoplayer2.c0
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objC = C(obj);
        Object objB = B(obj);
        int iY = y(objC);
        if (iY == -1 || (iF = J(iY).f(objB)) == -1) {
            return -1;
        }
        return F(iY) + iF;
    }

    @Override // com.google.android.exoplayer2.c0
    public int g(boolean z10) {
        int i10 = this.f21179d;
        if (i10 == 0) {
            return -1;
        }
        if (this.f21181f) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f21180e.getLastIndex() : i10 - 1;
        while (J(lastIndex).u()) {
            lastIndex = I(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return G(lastIndex) + J(lastIndex).g(z10);
    }

    @Override // com.google.android.exoplayer2.c0
    public int i(int i10, int i11, boolean z10) {
        if (this.f21181f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iA = A(i10);
        int iG = G(iA);
        int i12 = J(iA).i(i10 - iG, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return iG + i12;
        }
        int iH = H(iA, z10);
        while (iH != -1 && J(iH).u()) {
            iH = H(iH, z10);
        }
        if (iH != -1) {
            return G(iH) + J(iH).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.c0
    public final c0.b k(int i10, c0.b bVar, boolean z10) {
        int iZ = z(i10);
        int iG = G(iZ);
        J(iZ).k(i10 - F(iZ), bVar, z10);
        bVar.f21389d += iG;
        if (z10) {
            bVar.f21388c = E(D(iZ), s7.a.e(bVar.f21388c));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.c0
    public final c0.b l(Object obj, c0.b bVar) {
        Object objC = C(obj);
        Object objB = B(obj);
        int iY = y(objC);
        int iG = G(iY);
        J(iY).l(objB, bVar);
        bVar.f21389d += iG;
        bVar.f21388c = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.c0
    public int p(int i10, int i11, boolean z10) {
        if (this.f21181f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iA = A(i10);
        int iG = G(iA);
        int iP = J(iA).p(i10 - iG, i11 != 2 ? i11 : 0, z10);
        if (iP != -1) {
            return iG + iP;
        }
        int I = I(iA, z10);
        while (I != -1 && J(I).u()) {
            I = I(I, z10);
        }
        if (I != -1) {
            return G(I) + J(I).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.c0
    public final Object q(int i10) {
        int iZ = z(i10);
        return E(D(iZ), J(iZ).q(i10 - F(iZ)));
    }

    @Override // com.google.android.exoplayer2.c0
    public final c0.d s(int i10, c0.d dVar, long j10) {
        int iA = A(i10);
        int iG = G(iA);
        int iF = F(iA);
        J(iA).s(i10 - iG, dVar, j10);
        Object objD = D(iA);
        if (!c0.d.f21398s.equals(dVar.f21402b)) {
            objD = E(objD, dVar.f21402b);
        }
        dVar.f21402b = objD;
        dVar.f21416p += iF;
        dVar.f21417q += iF;
        return dVar;
    }

    public abstract int y(Object obj);

    public abstract int z(int i10);
}
