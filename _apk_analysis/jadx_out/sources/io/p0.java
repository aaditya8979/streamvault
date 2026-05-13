package io;

import io.q0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes4.dex */
public class p0<T extends q0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71303b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T[] f71304a;

    public final void a(@NotNull T t10) {
        t10.c(this);
        q0[] q0VarArrG = g();
        int iC = c();
        k(iC + 1);
        q0VarArrG[iC] = t10;
        t10.setIndex(iC);
        m(iC);
    }

    @Nullable
    public final T b() {
        T[] tArr = this.f71304a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f71303b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    @Nullable
    public final T f() {
        T t10;
        synchronized (this) {
            t10 = (T) b();
        }
        return t10;
    }

    public final T[] g() {
        T[] tArr = this.f71304a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.f71304a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        tn.p.j(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((q0[]) objArrCopyOf);
        this.f71304a = tArr3;
        return tArr3;
    }

    public final boolean h(@NotNull T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.b() == null) {
                z10 = false;
            } else {
                i(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T i(int r6) {
        /*
            r5 = this;
            T extends io.q0 & java.lang.Comparable<? super T>[] r0 = r5.f71304a
            tn.p.h(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            tn.p.h(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            tn.p.h(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            tn.p.h(r6)
            r1 = 0
            r6.c(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p0.i(int):io.q0");
    }

    @Nullable
    public final T j() {
        T t10;
        synchronized (this) {
            t10 = c() > 0 ? (T) i(0) : null;
        }
        return t10;
    }

    public final void k(int i10) {
        f71303b.set(this, i10);
    }

    public final void l(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f71304a;
            tn.p.h(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                tn.p.h(t10);
                T t11 = tArr[i11];
                tn.p.h(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            tn.p.h(t12);
            T t13 = tArr[i11];
            tn.p.h(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f71304a;
            tn.p.h(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            tn.p.h(t10);
            T t11 = tArr[i10];
            tn.p.h(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int i11) {
        T[] tArr = this.f71304a;
        tn.p.h(tArr);
        T t10 = tArr[i11];
        tn.p.h(t10);
        T t11 = tArr[i10];
        tn.p.h(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
