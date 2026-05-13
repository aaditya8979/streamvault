package com.google.common.collect;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TopKSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<? super T> f23428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f23429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f23431e;

    public o2(Comparator<? super T> comparator, int i10) {
        this.f23428b = (Comparator) y7.l.n(comparator, "comparator");
        this.f23427a = i10;
        y7.l.f(i10 >= 0, "k (%s) must be >= 0", i10);
        y7.l.f(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f23429c = (T[]) new Object[a8.d.b(i10, 2)];
        this.f23430d = 0;
        this.f23431e = null;
    }

    public static <T> o2<T> a(int i10, Comparator<? super T> comparator) {
        return new o2<>(comparator, i10);
    }

    public void b(T t10) {
        int i10 = this.f23427a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f23430d;
        if (i11 == 0) {
            this.f23429c[0] = t10;
            this.f23431e = t10;
            this.f23430d = 1;
            return;
        }
        if (i11 < i10) {
            T[] tArr = this.f23429c;
            this.f23430d = i11 + 1;
            tArr[i11] = t10;
            if (this.f23428b.compare(t10, (Object) c2.a(this.f23431e)) > 0) {
                this.f23431e = t10;
                return;
            }
            return;
        }
        if (this.f23428b.compare(t10, (Object) c2.a(this.f23431e)) < 0) {
            T[] tArr2 = this.f23429c;
            int i12 = this.f23430d;
            int i13 = i12 + 1;
            this.f23430d = i13;
            tArr2[i12] = t10;
            if (i13 == this.f23427a * 2) {
                g();
            }
        }
    }

    public void c(Iterator<? extends T> it) {
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final int d(int i10, int i11, int i12) {
        Object objA = c2.a(this.f23429c[i12]);
        T[] tArr = this.f23429c;
        tArr[i12] = tArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f23428b.compare((Object) c2.a(this.f23429c[i10]), objA) < 0) {
                e(i13, i10);
                i13++;
            }
            i10++;
        }
        T[] tArr2 = this.f23429c;
        tArr2[i11] = tArr2[i13];
        tArr2[i13] = objA;
        return i13;
    }

    public final void e(int i10, int i11) {
        T[] tArr = this.f23429c;
        T t10 = tArr[i10];
        tArr[i10] = tArr[i11];
        tArr[i11] = t10;
    }

    public List<T> f() {
        T[] tArr = this.f23429c;
        Arrays.sort(tArr, 0, this.f23430d, this.f23428b);
        int i10 = this.f23430d;
        int i11 = this.f23427a;
        if (i10 > i11) {
            T[] tArr2 = this.f23429c;
            Arrays.fill(tArr2, i11, tArr2.length, (Object) null);
            int i12 = this.f23427a;
            this.f23430d = i12;
            this.f23431e = this.f23429c[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f23430d)));
    }

    public final void g() {
        int i10 = (this.f23427a * 2) - 1;
        int iF = a8.d.f(i10 + 0, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (iMax >= i10) {
                break;
            }
            int iD = d(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i13 = this.f23427a;
            if (iD <= i13) {
                if (iD >= i13) {
                    break;
                }
                iMax = Math.max(iD, iMax + 1);
                i12 = iD;
            } else {
                i10 = iD - 1;
            }
            i11++;
            if (i11 >= iF) {
                Arrays.sort(this.f23429c, iMax, i10 + 1, this.f23428b);
                break;
            }
        }
        this.f23430d = this.f23427a;
        this.f23431e = (T) c2.a(this.f23429c[i12]);
        while (true) {
            i12++;
            if (i12 >= this.f23427a) {
                return;
            }
            if (this.f23428b.compare((Object) c2.a(this.f23429c[i12]), (Object) c2.a(this.f23431e)) > 0) {
                this.f23431e = this.f23429c[i12];
            }
        }
    }
}
