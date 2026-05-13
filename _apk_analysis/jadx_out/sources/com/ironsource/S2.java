package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class S2 extends C4224r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final ISBannerSize f30365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(@NotNull C4028g0 c4028g0, @Nullable ISBannerSize iSBannerSize) {
        super(c4028g0);
        tn.p.k(c4028g0, "adProperties");
        this.f30365b = iSBannerSize;
    }

    @Override // com.ironsource.C4224r0, com.ironsource.InterfaceC4048h2
    public void a(@NotNull com.ironsource.mediationsdk.i iVar) {
        tn.p.k(iVar, "auctionRequestParams");
        super.a(iVar);
        iVar.a(this.f30365b);
    }
}
