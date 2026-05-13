package e5;

import android.util.Pair;
import e4.v0;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f60337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f60338d;

    public a(boolean z10, k0 k0Var) {
        this.f60338d = z10;
        this.f60337c = k0Var;
        this.f60336b = k0Var.getLength();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public final int B(int i10, boolean z10) {
        if (z10) {
            return this.f60337c.getNextIndex(i10);
        }
        if (i10 < this.f60336b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int C(int i10, boolean z10) {
        if (z10) {
            return this.f60337c.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract v0 D(int i10);

    @Override // e4.v0
    public int a(boolean z10) {
        if (this.f60336b == 0) {
            return -1;
        }
        if (this.f60338d) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f60337c.getFirstIndex() : 0;
        while (D(firstIndex).q()) {
            firstIndex = B(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return A(firstIndex) + D(firstIndex).a(z10);
    }

    @Override // e4.v0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // e4.v0
    public int c(boolean z10) {
        int i10 = this.f60336b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f60338d) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f60337c.getLastIndex() : i10 - 1;
        while (D(lastIndex).q()) {
            lastIndex = C(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return A(lastIndex) + D(lastIndex).c(z10);
    }

    @Override // e4.v0
    public int e(int i10, int i11, boolean z10) {
        if (this.f60338d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // e4.v0
    public final v0.b g(int i10, v0.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f60306c += iA;
        if (z10) {
            bVar.f60305b = y(x(iT), a6.a.e(bVar.f60305b));
        }
        return bVar;
    }

    @Override // e4.v0
    public final v0.b h(Object obj, v0.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f60306c += iA;
        bVar.f60305b = obj;
        return bVar;
    }

    @Override // e4.v0
    public int l(int i10, int i11, boolean z10) {
        if (this.f60338d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // e4.v0
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // e4.v0
    public final v0.c o(int i10, v0.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!v0.c.f60310n.equals(cVar.f60311a)) {
            objX = y(objX, cVar.f60311a);
        }
        cVar.f60311a = objX;
        cVar.f60319i += iZ;
        cVar.f60320j += iZ;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i10);

    public abstract int u(int i10);

    public abstract Object x(int i10);

    public abstract int z(int i10);
}
