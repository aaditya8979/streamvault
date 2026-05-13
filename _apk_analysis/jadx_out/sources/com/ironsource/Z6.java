package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Z6 implements InterfaceC3927a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC3981d7 f30776b;

    public Z6(long j10, @NotNull EnumC3981d7 enumC3981d7) {
        tn.p.k(enumC3981d7, "recoveryStrategy");
        this.f30775a = j10;
        this.f30776b = enumC3981d7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z6(@NotNull C3963c7 c3963c7) {
        this(c3963c7.a(), c3963c7.c());
        tn.p.k(c3963c7, "feature");
    }

    @Override // com.ironsource.InterfaceC3927a7
    public long a() {
        return this.f30775a;
    }

    @Override // com.ironsource.InterfaceC3927a7
    @NotNull
    public EnumC3981d7 b() {
        return this.f30776b;
    }
}
