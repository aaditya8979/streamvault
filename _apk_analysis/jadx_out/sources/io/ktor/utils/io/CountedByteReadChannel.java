package io.ktor.utils.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CountedByteReadChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CountedByteReadChannel implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f71262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final no.a f71263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f71264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f71265e;

    public CountedByteReadChannel(@NotNull a aVar) {
        p.k(aVar, "delegate");
        this.f71262b = aVar;
        this.f71263c = new no.a();
    }

    @Override // io.ktor.utils.io.a, sl.f
    public void a(@Nullable Throwable th2) {
        this.f71262b.a(th2);
        this.f71263c.close();
    }

    @Override // io.ktor.utils.io.a, sl.f
    @Nullable
    public Throwable b() {
        return this.f71262b.b();
    }

    @Override // io.ktor.utils.io.a
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public no.a f() {
        e();
        return this.f71263c;
    }

    public final long d() {
        i();
        return this.f71265e;
    }

    public final void e() {
        i();
        this.f71264d += this.f71263c.j(this.f71262b.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(int r9, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.CountedByteReadChannel$awaitContent$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 r0 = (io.ktor.utils.io.CountedByteReadChannel$awaitContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 r0 = new io.ktor.utils.io.CountedByteReadChannel$awaitContent$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r10)
            goto L51
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.c.b(r10)
            no.a r10 = r8.f()
            long r4 = r10.n()
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L46
            java.lang.Boolean r9 = jn.a.a(r3)
            return r9
        L46:
            io.ktor.utils.io.a r10 = r8.f71262b
            r0.label = r3
            java.lang.Object r10 = r10.g(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L61
            r8.e()
            java.lang.Boolean r9 = jn.a.a(r3)
            return r9
        L61:
            r9 = 0
            java.lang.Boolean r9 = jn.a.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CountedByteReadChannel.g(int, hn.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.a
    public boolean h() {
        return this.f71263c.exhausted() && this.f71262b.h();
    }

    public final void i() {
        this.f71265e += this.f71264d - this.f71263c.n();
        this.f71264d = this.f71263c.n();
    }
}
