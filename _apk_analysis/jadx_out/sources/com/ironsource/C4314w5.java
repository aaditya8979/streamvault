package com.ironsource;

import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4314w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f34319a;

    public C4314w5(@NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull String str, @NotNull InterfaceC4305vd interfaceC4305vd) {
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(str, "adRequestAdId");
        tn.p.k(interfaceC4305vd, "adRequestProviderName");
        this.f34319a = interfaceC4209q1;
        interfaceC4209q1.a(new C4136m1.s(interfaceC4305vd.value()), new C4136m1.b(str));
    }

    public final void a() {
        InterfaceC4082j1.c.f31994a.a().a(this.f34319a);
    }

    public final void a(@NotNull IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        InterfaceC4082j1.c.f31994a.a(new C4136m1.j(ironSourceError.getErrorCode()), new C4136m1.k(ironSourceError.getErrorMessage()), new C4136m1.f(0L)).a(this.f34319a);
    }
}
