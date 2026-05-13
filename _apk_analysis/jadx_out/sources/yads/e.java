package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends s63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sy2 f89033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89034e = false;

    public e(sy2 sy2Var) {
        this.f89033d = sy2Var;
        this.f89032c = sy2Var.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // yads.s63
    public final int a(int i10, int i11, boolean z10) {
        if (this.f89034e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        xf2 xf2Var = (xf2) this;
        int iA = ib3.a(xf2Var.f96760i, i10 + 1, false, false);
        int i12 = xf2Var.f96760i[iA];
        int iA2 = xf2Var.f96761j[iA].a(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iA2 != -1) {
            return i12 + iA2;
        }
        int iA3 = a(z10, iA);
        while (iA3 != -1 && xf2Var.f96761j[iA3].c()) {
            iA3 = a(z10, iA3);
        }
        if (iA3 != -1) {
            return xf2Var.f96761j[iA3].a(z10) + xf2Var.f96760i[iA3];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        xf2 xf2Var = (xf2) this;
        Integer num = (Integer) xf2Var.f96763l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iA = xf2Var.f96761j[iIntValue].a(obj3)) == -1) {
            return -1;
        }
        return xf2Var.f96759h[iIntValue] + iA;
    }

    @Override // yads.s63
    public final int a(boolean z10) {
        if (this.f89032c == 0) {
            return -1;
        }
        int iA = 0;
        if (this.f89034e) {
            z10 = false;
        }
        if (z10) {
            int[] iArr = this.f89033d.f95015b;
            iA = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            xf2 xf2Var = (xf2) this;
            if (!xf2Var.f96761j[iA].c()) {
                return xf2Var.f96761j[iA].a(z10) + xf2Var.f96760i[iA];
            }
            iA = a(z10, iA);
        } while (iA != -1);
        return -1;
    }

    public final int a(boolean z10, int i10) {
        if (z10) {
            sy2 sy2Var = this.f89033d;
            int i11 = sy2Var.f95016c[i10] + 1;
            int[] iArr = sy2Var.f95015b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
        } else if (i10 < this.f89032c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        xf2 xf2Var = (xf2) this;
        int iA = ib3.a(xf2Var.f96759h, i10 + 1, false, false);
        return Pair.create(xf2Var.f96762k[iA], xf2Var.f96761j[iA].a(i10 - xf2Var.f96759h[iA]));
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        xf2 xf2Var = (xf2) this;
        int iA = ib3.a(xf2Var.f96759h, i10 + 1, false, false);
        int i11 = xf2Var.f96760i[iA];
        xf2Var.f96761j[iA].a(i10 - xf2Var.f96759h[iA], p63Var, z10);
        p63Var.f93449d += i11;
        if (z10) {
            Object obj = xf2Var.f96762k[iA];
            Object obj2 = p63Var.f93448c;
            obj2.getClass();
            p63Var.f93448c = Pair.create(obj, obj2);
        }
        return p63Var;
    }

    @Override // yads.s63
    public final p63 a(Object obj, p63 p63Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        xf2 xf2Var = (xf2) this;
        Integer num = (Integer) xf2Var.f96763l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = xf2Var.f96760i[iIntValue];
        xf2Var.f96761j[iIntValue].a(obj3, p63Var);
        p63Var.f93449d += i10;
        p63Var.f93448c = obj;
        return p63Var;
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        xf2 xf2Var = (xf2) this;
        int iA = ib3.a(xf2Var.f96760i, i10 + 1, false, false);
        int i11 = xf2Var.f96760i[iA];
        int i12 = xf2Var.f96759h[iA];
        xf2Var.f96761j[iA].a(i10 - i11, r63Var, j10);
        Object objCreate = xf2Var.f96762k[iA];
        if (!r63.f94295s.equals(r63Var.f94299b)) {
            objCreate = Pair.create(objCreate, r63Var.f94299b);
        }
        r63Var.f94299b = objCreate;
        r63Var.f94313p += i12;
        r63Var.f94314q += i12;
        return r63Var;
    }

    @Override // yads.s63
    public final int b(int i10, int i11, boolean z10) {
        if (this.f89034e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        xf2 xf2Var = (xf2) this;
        int iA = ib3.a(xf2Var.f96760i, i10 + 1, false, false);
        int i12 = xf2Var.f96760i[iA];
        int iB = xf2Var.f96761j[iA].b(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iB != -1) {
            return i12 + iB;
        }
        int iB2 = b(z10, iA);
        while (iB2 != -1 && xf2Var.f96761j[iB2].c()) {
            iB2 = b(z10, iB2);
        }
        if (iB2 != -1) {
            return xf2Var.f96761j[iB2].b(z10) + xf2Var.f96760i[iB2];
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final int b(boolean z10) {
        int iB;
        int i10 = this.f89032c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f89034e) {
            z10 = false;
        }
        if (z10) {
            int[] iArr = this.f89033d.f95015b;
            iB = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iB = i10 - 1;
        }
        do {
            xf2 xf2Var = (xf2) this;
            if (!xf2Var.f96761j[iB].c()) {
                return xf2Var.f96761j[iB].b(z10) + xf2Var.f96760i[iB];
            }
            iB = b(z10, iB);
        } while (iB != -1);
        return -1;
    }

    public final int b(boolean z10, int i10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        sy2 sy2Var = this.f89033d;
        int i11 = sy2Var.f95016c[i10] - 1;
        if (i11 >= 0) {
            return sy2Var.f95015b[i11];
        }
        return -1;
    }
}
