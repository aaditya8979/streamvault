package no;

import bo.z;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f75939a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f75940b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final m f75941c = m.f75931h.b(new byte[0], 0, 0, null, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f75943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f75944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final AtomicReferenceArray<m> f75947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final AtomicReferenceArray<m> f75948j;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f75942d = iHighestOneBit;
        int iE = zn.n.e(iHighestOneBit / 2, 1);
        f75943e = iE;
        String str = tn.p.f(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        f75944f = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        tn.p.j(property, "getProperty(...)");
        Integer numR = z.r(property);
        int iE2 = numR != null ? zn.n.e(numR.intValue(), 0) : 0;
        f75945g = iE2;
        f75946h = zn.n.e(iE2 / iE, 8192);
        f75947i = new AtomicReferenceArray<>(iHighestOneBit);
        f75948j = new AtomicReferenceArray<>(iE);
    }

    public static final void d(@NotNull m mVar) {
        tn.p.k(mVar, "segment");
        if (!(mVar.e() == null && mVar.g() == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        n nVarC = mVar.c();
        if (nVarC != null && nVarC.c()) {
            return;
        }
        AtomicReferenceArray<m> atomicReferenceArray = f75947i;
        int iB = f75939a.b();
        mVar.r(0);
        mVar.f75936e = true;
        while (true) {
            m mVar2 = atomicReferenceArray.get(iB);
            if (mVar2 != f75941c) {
                int iD = mVar2 != null ? mVar2.d() : 0;
                if (iD >= f75940b) {
                    if (f75945g > 0) {
                        e(mVar);
                        return;
                    }
                    return;
                } else {
                    mVar.q(mVar2);
                    mVar.p(iD + 8192);
                    if (wl.c.a(atomicReferenceArray, iB, mVar2, mVar)) {
                        return;
                    }
                }
            }
        }
    }

    public static final void e(m mVar) {
        mVar.r(0);
        mVar.f75936e = true;
        int iC = f75939a.c();
        AtomicReferenceArray<m> atomicReferenceArray = f75948j;
        int i10 = 0;
        while (true) {
            m mVar2 = atomicReferenceArray.get(iC);
            if (mVar2 != f75941c) {
                int iD = (mVar2 != null ? mVar2.d() : 0) + 8192;
                if (iD > f75946h) {
                    int i11 = f75943e;
                    if (i10 >= i11) {
                        return;
                    }
                    i10++;
                    iC = (iC + 1) & (i11 - 1);
                } else {
                    mVar.q(mVar2);
                    mVar.p(iD);
                    if (wl.c.a(atomicReferenceArray, iC, mVar2, mVar)) {
                        return;
                    }
                }
            }
        }
    }

    @NotNull
    public static final m f() {
        m mVar;
        m andSet;
        AtomicReferenceArray<m> atomicReferenceArray = f75947i;
        int iB = f75939a.b();
        do {
            mVar = f75941c;
            andSet = atomicReferenceArray.getAndSet(iB, mVar);
        } while (tn.p.f(andSet, mVar));
        if (andSet == null) {
            atomicReferenceArray.set(iB, null);
            return f75945g > 0 ? g() : m.f75931h.a();
        }
        atomicReferenceArray.set(iB, andSet.e());
        andSet.q(null);
        andSet.p(0);
        return andSet;
    }

    public static final m g() {
        AtomicReferenceArray<m> atomicReferenceArray = f75948j;
        int iC = f75939a.c();
        int i10 = 0;
        while (true) {
            m mVar = f75941c;
            m andSet = atomicReferenceArray.getAndSet(iC, mVar);
            if (!tn.p.f(andSet, mVar)) {
                if (andSet != null) {
                    atomicReferenceArray.set(iC, andSet.e());
                    andSet.q(null);
                    andSet.p(0);
                    return andSet;
                }
                atomicReferenceArray.set(iC, null);
                int i11 = f75943e;
                if (i10 >= i11) {
                    return m.f75931h.a();
                }
                iC = (iC + 1) & (i11 - 1);
                i10++;
            }
        }
    }

    @NotNull
    public static final n h() {
        return new l();
    }

    public final int a(long j10) {
        return (int) (j10 & Thread.currentThread().getId());
    }

    public final int b() {
        return a(((long) f75942d) - 1);
    }

    public final int c() {
        return a(((long) f75943e) - 1);
    }
}
