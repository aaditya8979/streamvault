package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Y2 extends C4148md {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4173o0 f30691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ISBannerSize f30692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(@NotNull C4173o0 c4173o0, @NotNull ISBannerSize iSBannerSize, @NotNull String str) {
        super(str);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(iSBannerSize, "size");
        tn.p.k(str, "placement");
        this.f30691b = c4173o0;
        this.f30692c = iSBannerSize;
    }

    @Override // com.ironsource.C4148md, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b02) {
        Map<String, Object> mapC = kotlin.collections.a.C(super.a(b02));
        this.f30691b.a(mapC, this.f30692c);
        return mapC;
    }
}
