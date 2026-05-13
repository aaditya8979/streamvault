package wl;

import com.ironsource.C4157n2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import tn.p;
import wl.f;

/* JADX INFO: compiled from: DefaultPool.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T> implements f<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f86443g = AtomicLongFieldUpdater.newUpdater(d.class, "top");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicReferenceArray<T> f86447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final int[] f86448f;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    @NotNull
    private volatile /* synthetic */ long f86449top;

    public d(int i10) {
        this.f86444b = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i10).toString());
        }
        if (!(i10 <= 536870911)) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i10).toString());
        }
        this.f86449top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f86445c = iHighestOneBit;
        this.f86446d = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.f86447e = new AtomicReferenceArray<>(iHighestOneBit + 1);
        this.f86448f = new int[iHighestOneBit + 1];
    }

    @Override // wl.f
    @NotNull
    public final T E() {
        T tA;
        T tL = l();
        return (tL == null || (tA = a(tL)) == null) ? h() : tA;
    }

    @NotNull
    public T a(@NotNull T t10) {
        p.k(t10, C4157n2.f33007p);
        return t10;
    }

    public void b(@NotNull T t10) {
        p.k(t10, C4157n2.f33007p);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    public final int d() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.f86449top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!f86443g.compareAndSet(this, j10, (j11 << 32) | ((long) this.f86448f[i10])));
        return i10;
    }

    @Override // wl.f
    public final void dispose() {
        while (true) {
            T tL = l();
            if (tL == null) {
                return;
            } else {
                b(tL);
            }
        }
    }

    @NotNull
    public abstract T h();

    public final void k(int i10) {
        long j10;
        long j11;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("index should be positive".toString());
        }
        do {
            j10 = this.f86449top;
            j11 = ((long) i10) | ((((j10 >> 32) & 4294967295L) + 1) << 32);
            this.f86448f[i10] = (int) (4294967295L & j10);
        } while (!f86443g.compareAndSet(this, j10, j11));
    }

    public final T l() {
        int iD = d();
        if (iD == 0) {
            return null;
        }
        return this.f86447e.getAndSet(iD, null);
    }

    public final boolean m(T t10) {
        int iIdentityHashCode = ((System.identityHashCode(t10) * (-1640531527)) >>> this.f86446d) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (c.a(this.f86447e, iIdentityHashCode, null, t10)) {
                k(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f86445c;
            }
        }
        return false;
    }

    public void n(@NotNull T t10) {
        p.k(t10, C4157n2.f33007p);
    }

    @Override // wl.f
    public final void r(@NotNull T t10) {
        p.k(t10, C4157n2.f33007p);
        n(t10);
        if (m(t10)) {
            return;
        }
        b(t10);
    }
}
