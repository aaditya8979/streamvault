package om;

import gm.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import qm.j;

/* JADX INFO: compiled from: SpscLinkedArrayQueue.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f76470j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f76471k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f76474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicReferenceArray<Object> f76476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicReferenceArray<Object> f76478h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f76472b = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f76479i = new AtomicLong();

    public a(int i10) {
        int iA = j.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.f76476f = atomicReferenceArray;
        this.f76475e = i11;
        a(iA);
        this.f76478h = atomicReferenceArray;
        this.f76477g = i11;
        this.f76474d = i11 - 1;
        s(0L);
    }

    public static int b(int i10) {
        return i10;
    }

    public static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    public static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    public static void q(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    public final void a(int i10) {
        this.f76473c = Math.min(i10 / 4, f76470j);
    }

    @Override // gm.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final long d() {
        return this.f76479i.get();
    }

    public final long e() {
        return this.f76472b.get();
    }

    public final long f() {
        return this.f76479i.get();
    }

    public final AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        q(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    public final long i() {
        return this.f76472b.get();
    }

    @Override // gm.h
    public boolean isEmpty() {
        return i() == f();
    }

    public final T j(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f76478h = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j10, i10));
    }

    public final T k(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f76478h = atomicReferenceArray;
        int iC = c(j10, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        if (t10 != null) {
            q(atomicReferenceArray, iC, null);
            p(j10 + 1);
        }
        return t10;
    }

    public boolean l(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76476f;
        long jI = i();
        int i10 = this.f76475e;
        long j10 = 2 + jI;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            int iC = c(jI, i10);
            q(atomicReferenceArray, iC + 1, t11);
            q(atomicReferenceArray, iC, t10);
            s(j10);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f76476f = atomicReferenceArray2;
        int iC2 = c(jI, i10);
        q(atomicReferenceArray2, iC2 + 1, t11);
        q(atomicReferenceArray2, iC2, t10);
        r(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, iC2, f76471k);
        s(j10);
        return true;
    }

    public T m() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76478h;
        long jD = d();
        int i10 = this.f76477g;
        T t10 = (T) g(atomicReferenceArray, c(jD, i10));
        return t10 == f76471k ? j(h(atomicReferenceArray, i10 + 1), jD, i10) : t10;
    }

    public final void n(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f76476f = atomicReferenceArray2;
        this.f76474d = (j11 + j10) - 1;
        q(atomicReferenceArray2, i10, t10);
        r(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, i10, f76471k);
        s(j10 + 1);
    }

    public int o() {
        long jF = f();
        while (true) {
            long jI = i();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jI - jF2);
            }
            jF = jF2;
        }
    }

    @Override // gm.h
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76476f;
        long jE = e();
        int i10 = this.f76475e;
        int iC = c(jE, i10);
        if (jE < this.f76474d) {
            return t(atomicReferenceArray, t10, jE, iC);
        }
        long j10 = ((long) this.f76473c) + jE;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f76474d = j10 - 1;
            return t(atomicReferenceArray, t10, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i10)) == null) {
            return t(atomicReferenceArray, t10, jE, iC);
        }
        n(atomicReferenceArray, jE, iC, t10, i10);
        return true;
    }

    public final void p(long j10) {
        this.f76479i.lazySet(j10);
    }

    @Override // gm.g, gm.h
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76478h;
        long jD = d();
        int i10 = this.f76477g;
        int iC = c(jD, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        boolean z10 = t10 == f76471k;
        if (t10 == null || z10) {
            if (z10) {
                return k(h(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        q(atomicReferenceArray, iC, null);
        p(jD + 1);
        return t10;
    }

    public final void r(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        q(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public final void s(long j10) {
        this.f76472b.lazySet(j10);
    }

    public final boolean t(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        q(atomicReferenceArray, i10, t10);
        s(j10 + 1);
        return true;
    }
}
