package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4224r0 implements InterfaceC4048h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4028g0 f33379a;

    public C4224r0(@NotNull C4028g0 c4028g0) {
        tn.p.k(c4028g0, "adProperties");
        this.f33379a = c4028g0;
    }

    @Override // com.ironsource.InterfaceC4048h2
    public void a(@NotNull com.ironsource.mediationsdk.i iVar) {
        tn.p.k(iVar, "auctionRequestParams");
        iVar.b(this.f33379a.c());
        iVar.a(this.f33379a.a().toString());
        iVar.a(Boolean.TRUE);
    }
}
