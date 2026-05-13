package io.ktor.utils.io;

import bn.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import no.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl.f;
import sl.k;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ByteChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ByteChannel implements io.ktor.utils.io.a, f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71231g = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71232h = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "_closedCause");

    @NotNull
    public volatile /* synthetic */ Object _closedCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final no.a f71234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Object f71235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final no.a f71236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final no.a f71237f;
    private volatile int flushBufferSize;

    @NotNull
    public volatile /* synthetic */ Object suspensionSlot;

    /* JADX INFO: compiled from: ByteChannel.kt */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f71238a = b.f71240a;

        /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteChannel.kt */
        public static final class C0845a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final Throwable f71239b;

            public C0845a(@Nullable Throwable th2) {
                this.f71239b = th2;
            }

            @Nullable
            public final Throwable e() {
                return this.f71239b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0845a) && p.f(this.f71239b, ((C0845a) obj).f71239b);
            }

            public int hashCode() {
                Throwable th2 = this.f71239b;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @NotNull
            public String toString() {
                return "Closed(cause=" + this.f71239b + ')';
            }
        }

        /* JADX INFO: compiled from: ByteChannel.kt */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ b f71240a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C0845a f71241b = new C0845a(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public static final Object f71242c;

            static {
                Result.a aVar = Result.Companion;
                f71242c = Result.m7534constructorimpl(r.f5635a);
            }

            @NotNull
            public final C0845a a() {
                return f71241b;
            }

            @NotNull
            public final Object b() {
                return f71242c;
            }
        }

        /* JADX INFO: compiled from: ByteChannel.kt */
        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f71243b = new c();

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -231472095;
            }

            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: compiled from: ByteChannel.kt */
        public static final class d implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final hn.c<r> f71244b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Throwable f71245c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(@NotNull hn.c<? super r> cVar) {
                p.k(cVar, "continuation");
                this.f71244b = cVar;
                if (sl.b.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ReadTask 0x");
                    String string = Integer.toString(d().hashCode(), bo.a.a(16));
                    p.j(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    bn.d.b(th2);
                    e(th2);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @NotNull
            public String a() {
                return "read";
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            public void b(@Nullable Throwable th2) {
                e.C0846a.b(this, th2);
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @Nullable
            public Throwable c() {
                return this.f71245c;
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @NotNull
            public hn.c<r> d() {
                return this.f71244b;
            }

            public void e(@Nullable Throwable th2) {
                this.f71245c = th2;
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            public void resume() {
                e.C0846a.a(this);
            }
        }

        /* JADX INFO: compiled from: ByteChannel.kt */
        public interface e extends a {

            /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$a$e$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ByteChannel.kt */
            public static final class C0846a {
                public static void a(@NotNull e eVar) {
                    eVar.d().resumeWith(a.f71238a.b());
                }

                public static void b(@NotNull e eVar, @Nullable Throwable th2) {
                    Object objB;
                    hn.c<r> cVarD = eVar.d();
                    if (th2 != null) {
                        Result.a aVar = Result.Companion;
                        objB = Result.m7534constructorimpl(kotlin.c.a(th2));
                    } else {
                        objB = a.f71238a.b();
                    }
                    cVarD.resumeWith(objB);
                }
            }

            @NotNull
            String a();

            void b(@Nullable Throwable th2);

            @Nullable
            Throwable c();

            @NotNull
            hn.c<r> d();

            void resume();
        }

        /* JADX INFO: compiled from: ByteChannel.kt */
        public static final class f implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final hn.c<r> f71246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Throwable f71247c;

            /* JADX WARN: Multi-variable type inference failed */
            public f(@NotNull hn.c<? super r> cVar) {
                p.k(cVar, "continuation");
                this.f71246b = cVar;
                if (sl.b.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WriteTask 0x");
                    String string = Integer.toString(d().hashCode(), bo.a.a(16));
                    p.j(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    bn.d.b(th2);
                    e(th2);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @NotNull
            public String a() {
                return "write";
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            public void b(@Nullable Throwable th2) {
                e.C0846a.b(this, th2);
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @Nullable
            public Throwable c() {
                return this.f71247c;
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            @NotNull
            public hn.c<r> d() {
                return this.f71246b;
            }

            public void e(@Nullable Throwable th2) {
                this.f71247c = th2;
            }

            @Override // io.ktor.utils.io.ByteChannel.a.e
            public void resume() {
                e.C0846a.a(this);
            }
        }
    }

    public ByteChannel() {
        this(false, 1, null);
    }

    public ByteChannel(boolean z10) {
        this.f71233b = z10;
        this.f71234c = new no.a();
        this.f71235d = new Object();
        this.suspensionSlot = a.c.f71243b;
        this.f71236e = new no.a();
        this.f71237f = new no.a();
        this._closedCause = null;
    }

    public /* synthetic */ ByteChannel(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // io.ktor.utils.io.a, sl.f
    public void a(@Nullable Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(th2);
        androidx.concurrent.futures.a.a(f71232h, this, null, closeToken);
        l(CloseToken.c(closeToken, null, 1, null));
    }

    @Override // io.ktor.utils.io.a, sl.f
    @Nullable
    public Throwable b() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return CloseToken.c(closeToken, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sl.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteChannel$flushAndClose$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.ByteChannel$flushAndClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.ByteChannel$flushAndClose$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r5)     // Catch: java.lang.Throwable -> L45
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.c.b(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L45
            r0.label = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L3f
            return r1
        L3f:
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L45
            kotlin.Result.m7534constructorimpl(r5)     // Catch: java.lang.Throwable -> L45
            goto L4f
        L45:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.c.a(r5)
            kotlin.Result.m7534constructorimpl(r5)
        L4f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.ByteChannel.f71232h
            io.ktor.utils.io.CloseToken r0 = sl.k.a()
            r1 = 0
            boolean r5 = androidx.concurrent.futures.a.a(r5, r4, r1, r0)
            if (r5 != 0) goto L5f
            bn.r r5 = bn.r.f5635a
            return r5
        L5f:
            r4.l(r1)
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.c(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sl.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.d(hn.c):java.lang.Object");
    }

    @Override // sl.f
    @NotNull
    public q e() throws ClosedWriteChannelException {
        CloseToken closeToken;
        if (o() && ((closeToken = (CloseToken) this._closedCause) == null || closeToken.a(ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this.f71237f;
    }

    @Override // io.ktor.utils.io.a
    @NotNull
    public no.r f() throws Throwable {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.a(ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this.f71236e.exhausted()) {
            p();
        }
        return this.f71236e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(int r13, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.g(int, hn.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.a
    public boolean h() {
        return b() != null || (o() && this.flushBufferSize == 0 && this.f71236e.exhausted());
    }

    public void k() {
        m();
        if (androidx.concurrent.futures.a.a(f71232h, this, null, k.a())) {
            l(null);
        }
    }

    public final void l(Throwable th2) {
        a aVar = (a) f71231g.getAndSet(this, th2 != null ? new a.C0845a(th2) : a.f71238a.a());
        if (aVar instanceof a.e) {
            ((a.e) aVar).b(th2);
        }
    }

    public void m() {
        if (this.f71237f.exhausted()) {
            return;
        }
        synchronized (this.f71235d) {
            int iN = (int) this.f71237f.n();
            this.f71234c.j(this.f71237f);
            this.flushBufferSize += iN;
            r rVar = r.f5635a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.d) && androidx.concurrent.futures.a.a(f71231g, this, aVar, a.c.f71243b)) {
            ((a.e) aVar).resume();
        }
    }

    public final boolean n() {
        return this.f71233b;
    }

    public boolean o() {
        return this._closedCause != null;
    }

    public final void p() {
        synchronized (this.f71235d) {
            this.f71234c.i(this.f71236e);
            this.flushBufferSize = 0;
            r rVar = r.f5635a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.f) && androidx.concurrent.futures.a.a(f71231g, this, aVar, a.c.f71243b)) {
            ((a.e) aVar).resume();
        }
    }

    @NotNull
    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
