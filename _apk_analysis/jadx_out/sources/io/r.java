package io;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f71306e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71307f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f71308g = AtomicLongFieldUpdater.newUpdater(r.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e0 f71309h = new e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f71313d;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71314a;

        public b(int i10) {
            this.f71314a = i10;
        }
    }

    public r(int i10, boolean z10) {
        this.f71310a = i10;
        this.f71311b = z10;
        int i11 = i10 - 1;
        this.f71312c = i11;
        this.f71313d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f71313d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@org.jetbrains.annotations.NotNull E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
        L4:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            io.r$a r14 = io.r.f71306e
            int r14 = r14.a(r3)
            return r14
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f71312c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L34
            return r6
        L34:
            boolean r2 = r13.f71311b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L55
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f()
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L55
            int r2 = r13.f71310a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L54
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L54:
            return r6
        L55:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = i()
            io.r$a r5 = io.r.f71306e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f()
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L74:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8d
            io.r r0 = r0.l()
            io.r r0 = r0.e(r10, r14)
            if (r0 != 0) goto L74
        L8d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.r.a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r<E> b(long j10) {
        r<E> rVar = new r<>(this.f71310a * 2, this.f71311b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f71312c;
            if ((i10 & i12) == (i12 & i11)) {
                f71308g.set(rVar, f71306e.d(j10, 1152921504606846976L));
                return rVar;
            }
            Object bVar = f().get(this.f71312c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            rVar.f().set(rVar.f71312c & i10, bVar);
            i10++;
        }
    }

    public final r<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71307f;
        while (true) {
            r<E> rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar != null) {
                return rVar;
            }
            androidx.concurrent.futures.a.a(f71307f, this, null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71308g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final r<E> e(int i10, E e10) {
        Object obj = f().get(this.f71312c & i10);
        if (!(obj instanceof b) || ((b) obj).f71314a != i10) {
            return null;
        }
        f().set(i10 & this.f71312c, e10);
        return this;
    }

    public final int g() {
        long j10 = f71308g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f71308g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71308g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    @NotNull
    public final r<E> l() {
        return c(k());
    }

    @Nullable
    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71308g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f71309h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = this.f71312c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f71312c & i10);
            if (obj == null) {
                if (this.f71311b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f71308g.compareAndSet(this, j10, f71306e.b(j10, i12))) {
                    f().set(this.f71312c & i10, null);
                    return obj;
                }
                if (this.f71311b) {
                    r<E> rVarN = this;
                    do {
                        rVarN = rVarN.n(i10, i12);
                    } while (rVarN != null);
                    return obj;
                }
            }
        }
    }

    public final r<E> n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71308g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f71308g.compareAndSet(this, j10, f71306e.b(j10, i11)));
        f().set(this.f71312c & i12, null);
        return null;
    }
}
