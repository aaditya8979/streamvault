package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class F3 implements InterfaceC4231r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f29295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f29296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final N3 f29297c;

    public F3(@Nullable Boolean bool, @Nullable Integer num, @Nullable N3 n32) {
        this.f29295a = bool;
        this.f29296b = num;
        this.f29297c = n32;
    }

    public /* synthetic */ F3(Boolean bool, Integer num, N3 n32, int i10, tn.i iVar) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : n32);
    }

    private final Object a(N3 n32) {
        return new G3(this.f29295a, this.f29296b, n32).a();
    }

    @Override // com.ironsource.InterfaceC4231r7
    @NotNull
    public Object a() {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(new Q4(this.f29295a).a());
        if (thM7537exceptionOrNullimpl != null) {
            return Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
        }
        Boolean bool = this.f29295a;
        return Result.m7534constructorimpl(bool != null ? new P4(bool.booleanValue()) : null);
    }

    @Override // com.ironsource.InterfaceC4231r7
    @NotNull
    public Object b() {
        Integer num;
        N3 n32 = N3.Second;
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(a(n32));
        if (thM7537exceptionOrNullimpl != null) {
            return Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
        }
        return Result.m7534constructorimpl((!tn.p.f(this.f29295a, Boolean.TRUE) || (num = this.f29296b) == null) ? null : new Wc(n32.a(num), null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.ironsource.InterfaceC4231r7
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c() {
        /*
            r3 = this;
            com.ironsource.N3 r0 = r3.f29297c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Throwable r0 = kotlin.Result.m7537exceptionOrNullimpl(r0)
            if (r0 == 0) goto L15
            java.lang.Object r0 = kotlin.c.a(r0)
            java.lang.Object r0 = kotlin.Result.m7534constructorimpl(r0)
            return r0
        L15:
            java.lang.Boolean r0 = r3.f29295a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = tn.p.f(r0, r1)
            if (r0 == 0) goto L31
            java.lang.Integer r0 = r3.f29296b
            if (r0 == 0) goto L31
            int r0 = r0.intValue()
            com.ironsource.N3 r1 = r3.f29297c
            if (r1 == 0) goto L31
            com.ironsource.lf r2 = new com.ironsource.lf
            r2.<init>(r0, r1)
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.Object r0 = kotlin.Result.m7534constructorimpl(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.F3.c():java.lang.Object");
    }

    @Nullable
    public final Boolean d() {
        return this.f29295a;
    }

    @Nullable
    public final Integer e() {
        return this.f29296b;
    }

    @Nullable
    public final N3 f() {
        return this.f29297c;
    }
}
