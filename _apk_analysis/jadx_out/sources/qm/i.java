package qm;

/* JADX INFO: compiled from: OpenHashSet.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f78363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T[] f78367e;

    public i() {
        this(16, 0.75f);
    }

    public i(int i10, float f10) {
        this.f78363a = f10;
        int iA = j.a(i10);
        this.f78364b = iA - 1;
        this.f78366d = (int) (f10 * iA);
        this.f78367e = (T[]) new Object[iA];
    }

    public static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(T t10) {
        T t11;
        T[] tArr = this.f78367e;
        int i10 = this.f78364b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                t11 = tArr[iC];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[iC] = t10;
        int i11 = this.f78365c + 1;
        this.f78365c = i11;
        if (i11 >= this.f78366d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f78367e;
    }

    public void d() {
        T t10;
        T[] tArr = this.f78367e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f78365c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f78364b = i11;
                this.f78366d = (int) (i10 * this.f78363a);
                this.f78367e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int iC = c(t10.hashCode()) & i11;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i12 = i13;
        }
    }

    public boolean e(T t10) {
        T t11;
        T[] tArr = this.f78367e;
        int i10 = this.f78364b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return f(iC, tArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            t11 = tArr[iC];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return f(iC, tArr, i10);
    }

    public boolean f(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f78365c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 == null) {
                    tArr[i10] = null;
                    return true;
                }
                int iC = c(t10.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iC || iC > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iC || iC <= i12) {
                    i13 = i12 + 1;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }

    public int g() {
        return this.f78365c;
    }
}
