package kotlinx.coroutines.channels;

import bn.r;
import fo.d;
import fo.h;
import io.b0;
import io.c0;
import io.d0;
import io.x;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.c;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import lo.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.n;
import p000do.s2;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes8.dex */
public class BufferedChannel<E> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73274e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73275f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73276g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73277h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73278i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73279j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73280k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73281l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73282m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73283b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l<E, r> f73284c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f73285d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public final class a implements fo.f<E>, s2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f73286b = BufferedChannelKt.f73306p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public c<? super Boolean> f73287c;

        public a() {
        }

        @Override // fo.f
        @Nullable
        public Object a(@NotNull hn.c<? super Boolean> cVar) throws Throwable {
            h<E> hVar;
            boolean zG = true;
            if (this.f73286b == BufferedChannelKt.f73306p || this.f73286b == BufferedChannelKt.z()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                h<E> hVar2 = (h) BufferedChannel.f0().get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.t0()) {
                        zG = g();
                        break;
                    }
                    long andIncrement = BufferedChannel.g0().getAndIncrement(bufferedChannel);
                    int i10 = BufferedChannelKt.f73292b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (hVar2.f68504d != j10) {
                        h<E> hVarW = bufferedChannel.W(j10, hVar2);
                        if (hVarW == null) {
                            continue;
                        } else {
                            hVar = hVarW;
                        }
                    } else {
                        hVar = hVar2;
                    }
                    Object objG1 = bufferedChannel.g1(hVar, i11, andIncrement, null);
                    if (objG1 == BufferedChannelKt.f73303m) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objG1 == BufferedChannelKt.f73305o) {
                        if (andIncrement < bufferedChannel.l0()) {
                            hVar.c();
                        }
                        hVar2 = hVar;
                    } else {
                        if (objG1 == BufferedChannelKt.f73304n) {
                            return f(hVar, i11, andIncrement, cVar);
                        }
                        hVar.c();
                        this.f73286b = objG1;
                    }
                }
            }
            return jn.a.a(zG);
        }

        @Override // p000do.s2
        public void b(@NotNull b0<?> b0Var, int i10) {
            c<? super Boolean> cVar = this.f73287c;
            if (cVar != null) {
                cVar.b(b0Var, i10);
            }
        }

        public final Object f(h<E> hVar, int i10, long j10, hn.c<? super Boolean> cVar) {
            Boolean boolA;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            c cVarB = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
            try {
                this.f73287c = cVarB;
                Object objG1 = bufferedChannel.g1(hVar, i10, j10, this);
                if (objG1 == BufferedChannelKt.f73303m) {
                    bufferedChannel.O0(this, hVar, i10);
                } else {
                    q qVarF = null;
                    if (objG1 == BufferedChannelKt.f73305o) {
                        if (j10 < bufferedChannel.l0()) {
                            hVar.c();
                        }
                        h hVar2 = (h) BufferedChannel.f0().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.t0()) {
                                h();
                                break;
                            }
                            long andIncrement = BufferedChannel.g0().getAndIncrement(bufferedChannel);
                            int i11 = BufferedChannelKt.f73292b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (hVar2.f68504d != j11) {
                                h hVarW = bufferedChannel.W(j11, hVar2);
                                if (hVarW != null) {
                                    hVar2 = hVarW;
                                }
                            }
                            Object objG12 = bufferedChannel.g1(hVar2, i12, andIncrement, this);
                            if (objG12 == BufferedChannelKt.f73303m) {
                                bufferedChannel.O0(this, hVar2, i12);
                                break;
                            }
                            if (objG12 == BufferedChannelKt.f73305o) {
                                if (andIncrement < bufferedChannel.l0()) {
                                    hVar2.c();
                                }
                            } else {
                                if (objG12 == BufferedChannelKt.f73304n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                hVar2.c();
                                this.f73286b = objG12;
                                this.f73287c = null;
                                boolA = jn.a.a(true);
                                l<E, r> lVar = bufferedChannel.f73284c;
                                if (lVar != null) {
                                    qVarF = bufferedChannel.F(lVar, objG12);
                                }
                            }
                        }
                    } else {
                        hVar.c();
                        this.f73286b = objG1;
                        this.f73287c = null;
                        boolA = jn.a.a(true);
                        l<E, r> lVar2 = bufferedChannel.f73284c;
                        if (lVar2 != null) {
                            qVarF = bufferedChannel.F(lVar2, objG1);
                        }
                    }
                    cVarB.y(boolA, qVarF);
                }
                Object objB = cVarB.B();
                if (objB == in.a.g()) {
                    jn.f.c(cVar);
                }
                return objB;
            } catch (Throwable th2) {
                cVarB.T();
                throw th2;
            }
        }

        public final boolean g() throws Throwable {
            this.f73286b = BufferedChannelKt.z();
            Throwable thB0 = BufferedChannel.this.b0();
            if (thB0 == null) {
                return false;
            }
            throw d0.a(thB0);
        }

        public final void h() {
            c<? super Boolean> cVar = this.f73287c;
            p.h(cVar);
            this.f73287c = null;
            this.f73286b = BufferedChannelKt.z();
            Throwable thB0 = BufferedChannel.this.b0();
            if (thB0 == null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thB0)));
            }
        }

        public final boolean i(E e10) {
            c<? super Boolean> cVar = this.f73287c;
            p.h(cVar);
            this.f73287c = null;
            this.f73286b = e10;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            l<E, r> lVar = bufferedChannel.f73284c;
            return BufferedChannelKt.B(cVar, bool, lVar != null ? bufferedChannel.F(lVar, e10) : null);
        }

        public final void j() {
            c<? super Boolean> cVar = this.f73287c;
            p.h(cVar);
            this.f73287c = null;
            this.f73286b = BufferedChannelKt.z();
            Throwable thB0 = BufferedChannel.this.b0();
            if (thB0 == null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thB0)));
            }
        }

        @Override // fo.f
        public E next() throws Throwable {
            E e10 = (E) this.f73286b;
            if (!(e10 != BufferedChannelKt.f73306p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f73286b = BufferedChannelKt.f73306p;
            if (e10 != BufferedChannelKt.z()) {
                return e10;
            }
            throw d0.a(BufferedChannel.this.e0());
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public static final class b implements s2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<Boolean> f73289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final k<Boolean> f73290c;

        @NotNull
        public final k<Boolean> a() {
            return this.f73290c;
        }

        @Override // p000do.s2
        public void b(@NotNull b0<?> b0Var, int i10) {
            this.f73289b.b(b0Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i10, @Nullable l<? super E, r> lVar) {
        this.f73283b = i10;
        this.f73284c = lVar;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = Z();
        h hVar = new h(0L, null, this, 3);
        this.sendSegment$volatile = hVar;
        this.receiveSegment$volatile = hVar;
        if (x0()) {
            hVar = BufferedChannelKt.f73291a;
            p.i(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = hVar;
        this.f73285d = lVar != 0 ? new q() { // from class: fo.b
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.M0(this.f61761b, (lo.f) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.f73309s;
    }

    public static final r G(l lVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        x.a(lVar, obj, dVar);
        return r.f5635a;
    }

    public static final q M0(final BufferedChannel bufferedChannel, final f fVar, Object obj, final Object obj2) {
        return new q() { // from class: fo.c
            @Override // sn.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.N0(obj2, bufferedChannel, fVar, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
            }
        };
    }

    public static final r N0(Object obj, BufferedChannel bufferedChannel, f fVar, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        if (obj != BufferedChannelKt.z()) {
            x.a(bufferedChannel.f73284c, obj, fVar.getContext());
        }
        return r.f5635a;
    }

    public static /* synthetic */ <E> Object Q0(BufferedChannel<E> bufferedChannel, hn.c<? super E> cVar) throws Throwable {
        h<E> hVar = (h) f0().get(bufferedChannel);
        while (!bufferedChannel.t0()) {
            long andIncrement = g0().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.f73292b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (hVar.f68504d != j10) {
                h<E> hVarW = bufferedChannel.W(j10, hVar);
                if (hVarW == null) {
                    continue;
                } else {
                    hVar = hVarW;
                }
            }
            Object objG1 = bufferedChannel.g1(hVar, i11, andIncrement, null);
            if (objG1 == BufferedChannelKt.f73303m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objG1 != BufferedChannelKt.f73305o) {
                if (objG1 == BufferedChannelKt.f73304n) {
                    return bufferedChannel.T0(hVar, i11, andIncrement, cVar);
                }
                hVar.c();
                return objG1;
            }
            if (andIncrement < bufferedChannel.l0()) {
                hVar.c();
            }
        }
        throw d0.a(bufferedChannel.e0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object R0(kotlinx.coroutines.channels.BufferedChannel<E> r14, hn.c<? super kotlinx.coroutines.channels.a<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = in.a.g()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.c.b(r15)
            kotlinx.coroutines.channels.a r15 = (kotlinx.coroutines.channels.a) r15
            java.lang.Object r14 = r15.k()
            goto Lb6
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            kotlin.c.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m()
            java.lang.Object r1 = r1.get(r14)
            fo.h r1 = (fo.h) r1
        L47:
            boolean r3 = r14.t0()
            if (r3 == 0) goto L59
            kotlinx.coroutines.channels.a$b r15 = kotlinx.coroutines.channels.a.f73311b
            java.lang.Throwable r14 = r14.b0()
            java.lang.Object r14 = r15.a(r14)
            goto Lb6
        L59:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = n()
            long r4 = r3.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.f73292b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f68504d
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L79
            fo.h r7 = g(r14, r7, r1)
            if (r7 != 0) goto L77
            goto L47
        L77:
            r13 = r7
            goto L7a
        L79:
            r13 = r1
        L7a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = C(r7, r8, r9, r10, r12)
            io.e0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.r()
            if (r1 == r7) goto Lb7
            io.e0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.h()
            if (r1 != r7) goto L9c
            long r7 = r14.l0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r13.c()
        L9a:
            r1 = r13
            goto L47
        L9c:
            io.e0 r15 = kotlinx.coroutines.channels.BufferedChannelKt.s()
            if (r1 != r15) goto Lad
            r6.label = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.S0(r2, r3, r4, r6)
            if (r14 != r0) goto Lb6
            return r0
        Lad:
            r13.c()
            kotlinx.coroutines.channels.a$b r14 = kotlinx.coroutines.channels.a.f73311b
            java.lang.Object r14 = r14.c(r1)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.R0(kotlinx.coroutines.channels.BufferedChannel, hn.c):java.lang.Object");
    }

    public static /* synthetic */ <E> Object Y0(BufferedChannel<E> bufferedChannel, E e10, hn.c<? super r> cVar) {
        h<E> hVar = (h) j0().get(bufferedChannel);
        while (true) {
            long andIncrement = k0().getAndIncrement(bufferedChannel);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zV0 = bufferedChannel.v0(andIncrement);
            int i10 = BufferedChannelKt.f73292b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (hVar.f68504d != j11) {
                h<E> hVarX = bufferedChannel.X(j11, hVar);
                if (hVarX != null) {
                    hVar = hVarX;
                } else if (zV0) {
                    Object objI0 = bufferedChannel.I0(e10, cVar);
                    if (objI0 == in.a.g()) {
                        return objI0;
                    }
                }
            }
            int iI1 = bufferedChannel.i1(hVar, i11, e10, j10, null, zV0);
            if (iI1 == 0) {
                hVar.c();
                break;
            }
            if (iI1 == 1) {
                break;
            }
            if (iI1 != 2) {
                if (iI1 == 3) {
                    Object objZ0 = bufferedChannel.Z0(hVar, i11, e10, j10, cVar);
                    if (objZ0 == in.a.g()) {
                        return objZ0;
                    }
                } else if (iI1 == 4) {
                    if (j10 < bufferedChannel.h0()) {
                        hVar.c();
                    }
                    Object objI02 = bufferedChannel.I0(e10, cVar);
                    if (objI02 == in.a.g()) {
                        return objI02;
                    }
                } else if (iI1 == 5) {
                    hVar.c();
                }
            } else if (zV0) {
                hVar.t();
                Object objI03 = bufferedChannel.I0(e10, cVar);
                if (objI03 == in.a.g()) {
                    return objI03;
                }
            }
        }
        return r.f5635a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater f0() {
        return f73279j;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater g0() {
        return f73275f;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater j0() {
        return f73278i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater k0() {
        return f73274e;
    }

    public static /* synthetic */ void p0(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.o0(j10);
    }

    public final void A0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73274e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 3)));
    }

    public final void B0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73274e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = BufferedChannelKt.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = BufferedChannelKt.w(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0(long j10, h<E> hVar) {
        boolean z10;
        h<E> hVar2;
        h<E> hVar3;
        while (hVar.f68504d < j10 && (hVar3 = (h) hVar.f()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.k() || (hVar2 = (h) hVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73280k;
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f68504d >= hVar.f68504d) {
                        break;
                    }
                    if (!hVar.u()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, hVar)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (hVar.p()) {
                        hVar.n();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                hVar = hVar2;
            }
        }
    }

    public final void D0(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        l<E, r> lVar = this.f73284c;
        p.h(lVar);
        Object objF = kotlinx.coroutines.channels.a.f(obj);
        p.h(objF);
        x.a(lVar, objF, dVar);
    }

    public final KFunction<r> E(l<? super E, r> lVar) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    public final void E0(Throwable th2, E e10, kotlin.coroutines.d dVar) {
        l<E, r> lVar = this.f73284c;
        p.h(lVar);
        x.a(lVar, e10, dVar);
    }

    public final q<Throwable, Object, kotlin.coroutines.d, r> F(final l<? super E, r> lVar, final E e10) {
        return new q() { // from class: fo.a
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.G(lVar, e10, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
            }
        };
    }

    public void F0() {
    }

    public final void G0(k<? super kotlinx.coroutines.channels.a<? extends E>> kVar) {
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f73311b.a(b0()))));
    }

    public final KFunction<r> H(l<? super E, r> lVar) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    public final void H0(k<? super E> kVar) {
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(e0())));
    }

    @Override // fo.p
    @Nullable
    public Object I(E e10, @NotNull hn.c<? super r> cVar) {
        return Y0(this, e10, cVar);
    }

    public final Object I0(E e10, hn.c<? super r> cVar) {
        UndeliveredElementException undeliveredElementExceptionC;
        c cVar2 = new c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        l<E, r> lVar = this.f73284c;
        if (lVar == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            Throwable thI0 = i0();
            Result.a aVar = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thI0)));
        } else {
            bn.d.a(undeliveredElementExceptionC, i0());
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(kotlin.c.a(undeliveredElementExceptionC)));
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : r.f5635a;
    }

    public final boolean J(long j10) {
        return j10 < Z() || j10 < h0() + ((long) this.f73283b);
    }

    public final void J0(E e10, k<? super r> kVar) {
        l<E, r> lVar = this.f73284c;
        if (lVar != null) {
            x.a(lVar, e10, kVar.getContext());
        }
        Throwable thI0 = i0();
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thI0)));
    }

    public boolean K(@Nullable Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return P(th2, true);
    }

    public void K0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(h<E> hVar, long j10) {
        Object objB = io.l.b(null, 1, null);
        loop0: while (hVar != null) {
            for (int i10 = BufferedChannelKt.f73292b - 1; -1 < i10; i10--) {
                if ((hVar.f68504d * ((long) BufferedChannelKt.f73292b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = hVar.B(i10);
                    if (objB2 != null && objB2 != BufferedChannelKt.f73295e) {
                        if (!(objB2 instanceof fo.q)) {
                            if (!(objB2 instanceof s2)) {
                                break;
                            }
                            if (hVar.v(i10, objB2, BufferedChannelKt.z())) {
                                objB = io.l.c(objB, objB2);
                                hVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (hVar.v(i10, objB2, BufferedChannelKt.z())) {
                                objB = io.l.c(objB, ((fo.q) objB2).f61771a);
                                hVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar.v(i10, objB2, BufferedChannelKt.z())) {
                            hVar.t();
                            break;
                        }
                    }
                }
            }
            hVar = (h) hVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                V0((s2) objB);
                return;
            }
            p.i(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                V0((s2) arrayList.get(size));
            }
        }
    }

    public void L0() {
    }

    @Override // fo.p
    public boolean M(@Nullable Throwable th2) {
        return P(th2, false);
    }

    public final h<E> N() {
        Object obj = f73280k.get(this);
        h hVar = (h) f73278i.get(this);
        if (hVar.f68504d > ((h) obj).f68504d) {
            obj = hVar;
        }
        h hVar2 = (h) f73279j.get(this);
        if (hVar2.f68504d > ((h) obj).f68504d) {
            obj = hVar2;
        }
        return (h) io.b.b((io.c) obj);
    }

    @Override // fo.p
    public void O(@NotNull l<? super Throwable, r> lVar) {
        if (androidx.concurrent.futures.a.a(f73282m, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73282m;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f73307q) {
                if (obj == BufferedChannelKt.f73308r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f73282m, this, BufferedChannelKt.f73307q, BufferedChannelKt.f73308r));
        lVar.invoke(b0());
    }

    public final void O0(s2 s2Var, h<E> hVar, int i10) {
        L0();
        s2Var.b(hVar, i10);
    }

    public boolean P(@Nullable Throwable th2, boolean z10) {
        if (z10) {
            z0();
        }
        boolean zA = androidx.concurrent.futures.a.a(f73281l, this, BufferedChannelKt.f73309s, th2);
        if (z10) {
            A0();
        } else {
            B0();
        }
        S();
        F0();
        if (zA) {
            q0();
        }
        return zA;
    }

    public final void P0(s2 s2Var, h<E> hVar, int i10) {
        s2Var.b(hVar, i10 + BufferedChannelKt.f73292b);
    }

    public final void Q(long j10) {
        U0(R(j10));
    }

    public final h<E> R(long j10) {
        h<E> hVarN = N();
        if (w0()) {
            long jY0 = y0(hVarN);
            if (jY0 != -1) {
                T(jY0);
            }
        }
        L(hVarN, j10);
        return hVarN;
    }

    public final void S() {
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(fo.h<E> r11, int r12, long r13, hn.c<? super kotlinx.coroutines.channels.a<? extends E>> r15) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.S0(fo.h, int, long, hn.c):java.lang.Object");
    }

    public final void T(long j10) {
        UndeliveredElementException undeliveredElementExceptionC;
        h<E> hVar = (h) f73279j.get(this);
        while (true) {
            long j11 = f73275f.get(this);
            if (j10 < Math.max(((long) this.f73283b) + j11, Z())) {
                return;
            }
            if (f73275f.compareAndSet(this, j11, j11 + 1)) {
                int i10 = BufferedChannelKt.f73292b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (hVar.f68504d != j12) {
                    h<E> hVarW = W(j12, hVar);
                    if (hVarW == null) {
                        continue;
                    } else {
                        hVar = hVarW;
                    }
                }
                Object objG1 = g1(hVar, i11, j11, null);
                if (objG1 != BufferedChannelKt.f73305o) {
                    hVar.c();
                    l<E, r> lVar = this.f73284c;
                    if (lVar != null && (undeliveredElementExceptionC = x.c(lVar, objG1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                } else if (j11 < l0()) {
                    hVar.c();
                }
            }
        }
    }

    public final Object T0(h<E> hVar, int i10, long j10, hn.c<? super E> cVar) {
        q qVar;
        c cVarB = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        try {
            Object objG1 = g1(hVar, i10, j10, cVarB);
            if (objG1 == BufferedChannelKt.f73303m) {
                O0(cVarB, hVar, i10);
            } else {
                if (objG1 == BufferedChannelKt.f73305o) {
                    if (j10 < l0()) {
                        hVar.c();
                    }
                    h hVar2 = (h) f0().get(this);
                    while (true) {
                        if (t0()) {
                            H0(cVarB);
                            break;
                        }
                        long andIncrement = g0().getAndIncrement(this);
                        int i11 = BufferedChannelKt.f73292b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (hVar2.f68504d != j11) {
                            h hVarW = W(j11, hVar2);
                            if (hVarW != null) {
                                hVar2 = hVarW;
                            }
                        }
                        objG1 = g1(hVar2, i12, andIncrement, cVarB);
                        if (objG1 == BufferedChannelKt.f73303m) {
                            c cVar2 = cVarB instanceof s2 ? cVarB : null;
                            if (cVar2 != null) {
                                O0(cVar2, hVar2, i12);
                            }
                        } else if (objG1 == BufferedChannelKt.f73305o) {
                            if (andIncrement < l0()) {
                                hVar2.c();
                            }
                        } else {
                            if (objG1 == BufferedChannelKt.f73304n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            hVar2.c();
                            l<E, r> lVar = this.f73284c;
                            qVar = (q) (lVar != null ? E(lVar) : null);
                        }
                    }
                } else {
                    hVar.c();
                    l<E, r> lVar2 = this.f73284c;
                    qVar = (q) (lVar2 != null ? E(lVar2) : null);
                }
                cVarB.y(objG1, qVar);
            }
            Object objB = cVarB.B();
            if (objB == in.a.g()) {
                jn.f.c(cVar);
            }
            return objB;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }

    public final void U() {
        if (x0()) {
            return;
        }
        h<E> hVar = (h) f73280k.get(this);
        while (true) {
            long andIncrement = f73276g.getAndIncrement(this);
            int i10 = BufferedChannelKt.f73292b;
            long j10 = andIncrement / ((long) i10);
            if (l0() <= andIncrement) {
                if (hVar.f68504d < j10 && hVar.f() != 0) {
                    C0(j10, hVar);
                }
                p0(this, 0L, 1, null);
                return;
            }
            if (hVar.f68504d != j10) {
                h<E> hVarV = V(j10, hVar, andIncrement);
                if (hVarV == null) {
                    continue;
                } else {
                    hVar = hVarV;
                }
            }
            if (e1(hVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                p0(this, 0L, 1, null);
                return;
            }
            p0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (fo.h) r12.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(fo.h<E> r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.U0(fo.h):void");
    }

    public final h<E> V(long j10, h<E> hVar, long j11) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73280k;
        sn.p pVar = (sn.p) BufferedChannelKt.y();
        do {
            objC = io.b.c(hVar, j10, pVar);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.f68504d >= b0VarB.f68504d) {
                    break;
                }
                if (!b0VarB.u()) {
                    z10 = false;
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (b0Var.p()) {
                        b0Var.n();
                    }
                } else if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
            z10 = true;
        } while (!z10);
        if (c0.c(objC)) {
            S();
            C0(j10, hVar);
            p0(this, 0L, 1, null);
            return null;
        }
        h<E> hVar2 = (h) c0.b(objC);
        if (hVar2.f68504d <= j10) {
            return hVar2;
        }
        long j12 = hVar2.f68504d;
        int i10 = BufferedChannelKt.f73292b;
        if (f73276g.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            o0((hVar2.f68504d * ((long) i10)) - j11);
            return null;
        }
        p0(this, 0L, 1, null);
        return null;
    }

    public final void V0(s2 s2Var) {
        X0(s2Var, true);
    }

    public final h<E> W(long j10, h<E> hVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73279j;
        sn.p pVar = (sn.p) BufferedChannelKt.y();
        do {
            objC = io.b.c(hVar, j10, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f68504d >= b0VarB.f68504d) {
                        break;
                    }
                    if (!b0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (c0.c(objC)) {
            S();
            if (hVar.f68504d * ((long) BufferedChannelKt.f73292b) >= l0()) {
                return null;
            }
            hVar.c();
            return null;
        }
        h<E> hVar2 = (h) c0.b(objC);
        if (!x0() && j10 <= Z() / ((long) BufferedChannelKt.f73292b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f73280k;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.f68504d >= hVar2.f68504d || !hVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, b0Var2, hVar2)) {
                    if (b0Var2.p()) {
                        b0Var2.n();
                    }
                } else if (hVar2.p()) {
                    hVar2.n();
                }
            }
        }
        long j11 = hVar2.f68504d;
        if (j11 <= j10) {
            return hVar2;
        }
        int i10 = BufferedChannelKt.f73292b;
        k1(j11 * ((long) i10));
        if (hVar2.f68504d * ((long) i10) >= l0()) {
            return null;
        }
        hVar2.c();
        return null;
    }

    public final void W0(s2 s2Var) {
        X0(s2Var, false);
    }

    public final h<E> X(long j10, h<E> hVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73278i;
        sn.p pVar = (sn.p) BufferedChannelKt.y();
        do {
            objC = io.b.c(hVar, j10, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f68504d >= b0VarB.f68504d) {
                        break;
                    }
                    if (!b0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (c0.c(objC)) {
            S();
            if (hVar.f68504d * ((long) BufferedChannelKt.f73292b) >= h0()) {
                return null;
            }
            hVar.c();
            return null;
        }
        h<E> hVar2 = (h) c0.b(objC);
        long j11 = hVar2.f68504d;
        if (j11 <= j10) {
            return hVar2;
        }
        int i10 = BufferedChannelKt.f73292b;
        l1(j11 * ((long) i10));
        if (hVar2.f68504d * ((long) i10) >= h0()) {
            return null;
        }
        hVar2.c();
        return null;
    }

    public final void X0(s2 s2Var, boolean z10) {
        if (s2Var instanceof b) {
            k<Boolean> kVarA = ((b) s2Var).a();
            Result.a aVar = Result.Companion;
            kVarA.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
            return;
        }
        if (s2Var instanceof k) {
            hn.c cVar = (hn.c) s2Var;
            Result.a aVar2 = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(z10 ? e0() : i0())));
        } else if (s2Var instanceof fo.n) {
            c<kotlinx.coroutines.channels.a<? extends E>> cVar2 = ((fo.n) s2Var).f61770b;
            Result.a aVar3 = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f73311b.a(b0()))));
        } else if (s2Var instanceof a) {
            ((a) s2Var).j();
        } else {
            if (s2Var instanceof f) {
                ((f) s2Var).e(this, BufferedChannelKt.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + s2Var).toString());
        }
    }

    public final long Z() {
        return f73276g.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(fo.h<E> r21, int r22, E r23, long r24, hn.c<? super bn.r> r26) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.Z0(fo.h, int, java.lang.Object, long, hn.c):java.lang.Object");
    }

    public final boolean a1(long j10) {
        if (v0(j10)) {
            return false;
        }
        return !J(j10 & 1152921504606846975L);
    }

    @Nullable
    public final Throwable b0() {
        return (Throwable) f73281l.get(this);
    }

    public final boolean b1(Object obj, E e10) {
        if (obj instanceof f) {
            return ((f) obj).e(this, e10);
        }
        if (obj instanceof fo.n) {
            p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            c<kotlinx.coroutines.channels.a<? extends E>> cVar = ((fo.n) obj).f61770b;
            kotlinx.coroutines.channels.a aVarB = kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f73311b.c(e10));
            l<E, r> lVar = this.f73284c;
            return BufferedChannelKt.B(cVar, aVarB, (q) (lVar != null ? H(lVar) : null));
        }
        if (obj instanceof a) {
            p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof k) {
            p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            k kVar = (k) obj;
            l<E, r> lVar2 = this.f73284c;
            return BufferedChannelKt.B(kVar, e10, (q) (lVar2 != null ? E(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean c1(Object obj, h<E> hVar, int i10) {
        if (obj instanceof k) {
            p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.C((k) obj, r.f5635a, null, 2, null);
        }
        if (obj instanceof f) {
            p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResultX = ((SelectImplementation) obj).x(this, r.f5635a);
            if (trySelectDetailedResultX == TrySelectDetailedResult.REREGISTER) {
                hVar.w(i10);
            }
            return trySelectDetailedResultX == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return BufferedChannelKt.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // fo.o
    public final void cancel(@Nullable CancellationException cancellationException) {
        K(cancellationException);
    }

    @NotNull
    public final Object d1(E e10) {
        h hVar;
        Object obj = BufferedChannelKt.f73294d;
        h hVar2 = (h) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zV0 = v0(andIncrement);
            int i10 = BufferedChannelKt.f73292b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (hVar2.f68504d != j11) {
                h hVarX = X(j11, hVar2);
                if (hVarX != null) {
                    hVar = hVarX;
                } else if (zV0) {
                    return kotlinx.coroutines.channels.a.f73311b.a(i0());
                }
            } else {
                hVar = hVar2;
            }
            int iI1 = i1(hVar, i11, e10, j10, obj, zV0);
            if (iI1 == 0) {
                hVar.c();
                return kotlinx.coroutines.channels.a.f73311b.c(r.f5635a);
            }
            if (iI1 == 1) {
                return kotlinx.coroutines.channels.a.f73311b.c(r.f5635a);
            }
            if (iI1 == 2) {
                if (zV0) {
                    hVar.t();
                    return kotlinx.coroutines.channels.a.f73311b.a(i0());
                }
                s2 s2Var = obj instanceof s2 ? (s2) obj : null;
                if (s2Var != null) {
                    P0(s2Var, hVar, i11);
                }
                T((hVar.f68504d * ((long) i10)) + ((long) i11));
                return kotlinx.coroutines.channels.a.f73311b.c(r.f5635a);
            }
            if (iI1 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iI1 == 4) {
                if (j10 < h0()) {
                    hVar.c();
                }
                return kotlinx.coroutines.channels.a.f73311b.a(i0());
            }
            if (iI1 == 5) {
                hVar.c();
            }
            hVar2 = hVar;
        }
    }

    public final Throwable e0() {
        Throwable thB0 = b0();
        return thB0 == null ? new ClosedReceiveChannelException("Channel was closed") : thB0;
    }

    public final boolean e1(h<E> hVar, int i10, long j10) {
        Object objB = hVar.B(i10);
        if (!(objB instanceof s2) || j10 < f73275f.get(this) || !hVar.v(i10, objB, BufferedChannelKt.f73297g)) {
            return f1(hVar, i10, j10);
        }
        if (c1(objB, hVar, i10)) {
            hVar.F(i10, BufferedChannelKt.f73294d);
            return true;
        }
        hVar.F(i10, BufferedChannelKt.f73300j);
        hVar.C(i10, false);
        return false;
    }

    public final boolean f1(h<E> hVar, int i10, long j10) {
        while (true) {
            Object objB = hVar.B(i10);
            if (objB instanceof s2) {
                if (j10 < f73275f.get(this)) {
                    if (hVar.v(i10, objB, new fo.q((s2) objB))) {
                        return true;
                    }
                } else if (hVar.v(i10, objB, BufferedChannelKt.f73297g)) {
                    if (c1(objB, hVar, i10)) {
                        hVar.F(i10, BufferedChannelKt.f73294d);
                        return true;
                    }
                    hVar.F(i10, BufferedChannelKt.f73300j);
                    hVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == BufferedChannelKt.f73300j) {
                    return false;
                }
                if (objB == null) {
                    if (hVar.v(i10, objB, BufferedChannelKt.f73295e)) {
                        return true;
                    }
                } else {
                    if (objB == BufferedChannelKt.f73294d || objB == BufferedChannelKt.f73298h || objB == BufferedChannelKt.f73299i || objB == BufferedChannelKt.f73301k || objB == BufferedChannelKt.z()) {
                        return true;
                    }
                    if (objB != BufferedChannelKt.f73296f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object g1(h<E> hVar, int i10, long j10, Object obj) {
        Object objB = hVar.B(i10);
        if (objB == null) {
            if (j10 >= (f73274e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f73304n;
                }
                if (hVar.v(i10, objB, obj)) {
                    U();
                    return BufferedChannelKt.f73303m;
                }
            }
        } else if (objB == BufferedChannelKt.f73294d && hVar.v(i10, objB, BufferedChannelKt.f73299i)) {
            U();
            return hVar.D(i10);
        }
        return h1(hVar, i10, j10, obj);
    }

    public final long h0() {
        return f73275f.get(this);
    }

    public final Object h1(h<E> hVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = hVar.B(i10);
            if (objB == null || objB == BufferedChannelKt.f73295e) {
                if (j10 < (f73274e.get(this) & 1152921504606846975L)) {
                    if (hVar.v(i10, objB, BufferedChannelKt.f73298h)) {
                        U();
                        return BufferedChannelKt.f73305o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.f73304n;
                    }
                    if (hVar.v(i10, objB, obj)) {
                        U();
                        return BufferedChannelKt.f73303m;
                    }
                }
            } else {
                if (objB != BufferedChannelKt.f73294d) {
                    if (objB != BufferedChannelKt.f73300j && objB != BufferedChannelKt.f73298h) {
                        if (objB == BufferedChannelKt.z()) {
                            U();
                            return BufferedChannelKt.f73305o;
                        }
                        if (objB != BufferedChannelKt.f73297g && hVar.v(i10, objB, BufferedChannelKt.f73296f)) {
                            boolean z10 = objB instanceof fo.q;
                            if (z10) {
                                objB = ((fo.q) objB).f61771a;
                            }
                            if (c1(objB, hVar, i10)) {
                                hVar.F(i10, BufferedChannelKt.f73299i);
                                U();
                                return hVar.D(i10);
                            }
                            hVar.F(i10, BufferedChannelKt.f73300j);
                            hVar.C(i10, false);
                            if (z10) {
                                U();
                            }
                            return BufferedChannelKt.f73305o;
                        }
                    }
                    return BufferedChannelKt.f73305o;
                }
                if (hVar.v(i10, objB, BufferedChannelKt.f73299i)) {
                    U();
                    return hVar.D(i10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        return kotlinx.coroutines.channels.a.f73311b.c(bn.r.f5635a);
     */
    @Override // fo.p
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = k0()
            long r0 = r0.get(r14)
            boolean r0 = r14.a1(r0)
            if (r0 == 0) goto L15
            kotlinx.coroutines.channels.a$b r15 = kotlinx.coroutines.channels.a.f73311b
            java.lang.Object r15 = r15.b()
            return r15
        L15:
            io.e0 r8 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r14)
            fo.h r0 = (fo.h) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = s(r14, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f73292b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f68504d
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L50
            fo.h r1 = k(r14, r2, r0)
            if (r1 != 0) goto L4e
            if (r11 == 0) goto L23
            goto L90
        L4e:
            r13 = r1
            goto L51
        L50:
            r13 = r0
        L51:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = D(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb2
            r1 = 1
            if (r0 == r1) goto Lb5
            r1 = 2
            if (r0 == r1) goto L8b
            r1 = 3
            if (r0 == r1) goto L7f
            r1 = 4
            if (r0 == r1) goto L73
            r1 = 5
            if (r0 == r1) goto L6e
            goto L71
        L6e:
            r13.c()
        L71:
            r0 = r13
            goto L23
        L73:
            long r0 = r14.h0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L90
            r13.c()
            goto L90
        L7f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L8b:
            if (r11 == 0) goto L9b
            r13.t()
        L90:
            kotlinx.coroutines.channels.a$b r15 = kotlinx.coroutines.channels.a.f73311b
            java.lang.Throwable r0 = r14.i0()
            java.lang.Object r15 = r15.a(r0)
            goto Lbd
        L9b:
            boolean r15 = r8 instanceof p000do.s2
            if (r15 == 0) goto La2
            do.s2 r8 = (p000do.s2) r8
            goto La3
        La2:
            r8 = 0
        La3:
            if (r8 == 0) goto La8
            A(r14, r8, r13, r12)
        La8:
            r13.t()
            kotlinx.coroutines.channels.a$b r15 = kotlinx.coroutines.channels.a.f73311b
            java.lang.Object r15 = r15.b()
            goto Lbd
        Lb2:
            r13.c()
        Lb5:
            kotlinx.coroutines.channels.a$b r15 = kotlinx.coroutines.channels.a.f73311b
            bn.r r0 = bn.r.f5635a
            java.lang.Object r15 = r15.c(r0)
        Lbd:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.i(java.lang.Object):java.lang.Object");
    }

    @NotNull
    public final Throwable i0() {
        Throwable thB0 = b0();
        return thB0 == null ? new ClosedSendChannelException("Channel was closed") : thB0;
    }

    public final int i1(h<E> hVar, int i10, E e10, long j10, Object obj, boolean z10) {
        hVar.G(i10, e10);
        if (z10) {
            return j1(hVar, i10, e10, j10, obj, z10);
        }
        Object objB = hVar.B(i10);
        if (objB == null) {
            if (J(j10)) {
                if (hVar.v(i10, null, BufferedChannelKt.f73294d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (hVar.v(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (objB instanceof s2) {
            hVar.w(i10);
            if (b1(objB, e10)) {
                hVar.F(i10, BufferedChannelKt.f73299i);
                K0();
                return 0;
            }
            if (hVar.x(i10, BufferedChannelKt.f73301k) != BufferedChannelKt.f73301k) {
                hVar.C(i10, true);
            }
            return 5;
        }
        return j1(hVar, i10, e10, j10, obj, z10);
    }

    @Override // fo.o
    @NotNull
    public fo.f<E> iterator() {
        return new a();
    }

    @Override // fo.o
    @Nullable
    public Object j(@NotNull hn.c<? super E> cVar) {
        return Q0(this, cVar);
    }

    public final int j1(h<E> hVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objB = hVar.B(i10);
            if (objB == null) {
                if (!J(j10) || z10) {
                    if (z10) {
                        if (hVar.v(i10, null, BufferedChannelKt.f73300j)) {
                            hVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (hVar.v(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (hVar.v(i10, null, BufferedChannelKt.f73294d)) {
                    return 1;
                }
            } else {
                if (objB != BufferedChannelKt.f73295e) {
                    if (objB == BufferedChannelKt.f73301k) {
                        hVar.w(i10);
                        return 5;
                    }
                    if (objB == BufferedChannelKt.f73298h) {
                        hVar.w(i10);
                        return 5;
                    }
                    if (objB == BufferedChannelKt.z()) {
                        hVar.w(i10);
                        S();
                        return 4;
                    }
                    hVar.w(i10);
                    if (objB instanceof fo.q) {
                        objB = ((fo.q) objB).f61771a;
                    }
                    if (b1(objB, e10)) {
                        hVar.F(i10, BufferedChannelKt.f73299i);
                        K0();
                        return 0;
                    }
                    if (hVar.x(i10, BufferedChannelKt.f73301k) != BufferedChannelKt.f73301k) {
                        hVar.C(i10, true);
                    }
                    return 5;
                }
                if (hVar.v(i10, objB, BufferedChannelKt.f73294d)) {
                    return 1;
                }
            }
        }
    }

    public final void k1(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73275f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f73275f.compareAndSet(this, j11, j10));
    }

    public final long l0() {
        return f73274e.get(this) & 1152921504606846975L;
    }

    public final void l1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73274e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f73274e.compareAndSet(this, j11, BufferedChannelKt.w(j12, (int) (j11 >> 60))));
    }

    public final void m1(long j10) {
        long j11;
        long j12;
        if (x0()) {
            return;
        }
        while (Z() <= j10) {
        }
        int i10 = BufferedChannelKt.f73293c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jZ = Z();
            if (jZ == (f73277h.get(this) & 4611686018427387903L) && jZ == Z()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73277h;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.v(j11 & 4611686018427387903L, true)));
        while (true) {
            long jZ2 = Z();
            long j13 = f73277h.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (jZ2 == j14 && jZ2 == Z()) {
                break;
            } else if (!z10) {
                f73277h.compareAndSet(this, j13, BufferedChannelKt.v(j14, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f73277h;
        do {
            j12 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, BufferedChannelKt.v(j12 & 4611686018427387903L, false)));
    }

    public final boolean n0() {
        while (true) {
            h<E> hVarW = (h) f73279j.get(this);
            long jH0 = h0();
            if (l0() <= jH0) {
                return false;
            }
            int i10 = BufferedChannelKt.f73292b;
            long j10 = jH0 / ((long) i10);
            if (hVarW.f68504d == j10 || (hVarW = W(j10, hVarW)) != null) {
                hVarW.c();
                if (r0(hVarW, (int) (jH0 % ((long) i10)), jH0)) {
                    return true;
                }
                f73275f.compareAndSet(this, jH0, 1 + jH0);
            } else if (((h) f73279j.get(this)).f68504d < j10) {
                return false;
            }
        }
    }

    public final void o0(long j10) {
        if ((f73277h.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f73277h.get(this) & 4611686018427387904L) != 0);
        }
    }

    @Override // fo.o
    @Nullable
    public Object q(@NotNull hn.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        return R0(this, cVar);
    }

    public final void q0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73282m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f73307q : BufferedChannelKt.f73308r));
        if (obj == null) {
            return;
        }
        ((l) obj).invoke(b0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fo.o
    @NotNull
    public Object r() {
        h hVar;
        long j10 = f73275f.get(this);
        long j11 = f73274e.get(this);
        if (u0(j11)) {
            return kotlinx.coroutines.channels.a.f73311b.a(b0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return kotlinx.coroutines.channels.a.f73311b.b();
        }
        Object obj = BufferedChannelKt.f73301k;
        h hVar2 = (h) f0().get(this);
        while (!t0()) {
            long andIncrement = g0().getAndIncrement(this);
            int i10 = BufferedChannelKt.f73292b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (hVar2.f68504d != j12) {
                h hVarW = W(j12, hVar2);
                if (hVarW == null) {
                    continue;
                } else {
                    hVar = hVarW;
                }
            } else {
                hVar = hVar2;
            }
            Object objG1 = g1(hVar, i11, andIncrement, obj);
            if (objG1 == BufferedChannelKt.f73303m) {
                s2 s2Var = obj instanceof s2 ? (s2) obj : null;
                if (s2Var != null) {
                    O0(s2Var, hVar, i11);
                }
                m1(andIncrement);
                hVar.t();
                return kotlinx.coroutines.channels.a.f73311b.b();
            }
            if (objG1 != BufferedChannelKt.f73305o) {
                if (objG1 == BufferedChannelKt.f73304n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                hVar.c();
                return kotlinx.coroutines.channels.a.f73311b.c(objG1);
            }
            if (andIncrement < l0()) {
                hVar.c();
            }
            hVar2 = hVar;
        }
        return kotlinx.coroutines.channels.a.f73311b.a(b0());
    }

    public final boolean r0(h<E> hVar, int i10, long j10) {
        Object objB;
        do {
            objB = hVar.B(i10);
            if (objB != null && objB != BufferedChannelKt.f73295e) {
                if (objB == BufferedChannelKt.f73294d) {
                    return true;
                }
                if (objB == BufferedChannelKt.f73300j || objB == BufferedChannelKt.z() || objB == BufferedChannelKt.f73299i || objB == BufferedChannelKt.f73298h) {
                    return false;
                }
                if (objB == BufferedChannelKt.f73297g) {
                    return true;
                }
                return objB != BufferedChannelKt.f73296f && j10 == h0();
            }
        } while (!hVar.v(i10, objB, BufferedChannelKt.f73298h));
        U();
        return false;
    }

    public final boolean s0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            R(j10 & 1152921504606846975L);
            if (z10 && n0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            Q(j10 & 1152921504606846975L);
        }
        return true;
    }

    public boolean t0() {
        return u0(f73274e.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01da, code lost:
    
        r3 = (fo.h) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e1, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    public final boolean u0(long j10) {
        return s0(j10, true);
    }

    @Override // fo.p
    public boolean v() {
        return v0(f73274e.get(this));
    }

    public final boolean v0(long j10) {
        return s0(j10, false);
    }

    public boolean w0() {
        return false;
    }

    public final boolean x0() {
        long jZ = Z();
        return jZ == 0 || jZ == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (fo.h) r8.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y0(fo.h<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f73292b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f68504d
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f73292b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.h0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f73294d
            if (r1 != r2) goto L39
            return r3
        L2c:
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            io.c r8 = r8.h()
            fo.h r8 = (fo.h) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.y0(fo.h):long");
    }

    public final void z0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73274e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 1)));
    }
}
