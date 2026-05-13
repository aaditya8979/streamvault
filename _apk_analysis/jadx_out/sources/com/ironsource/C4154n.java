package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4154n extends J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f32997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f32998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f32999c;

    public C4154n(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str) {
        tn.p.k(aVar, "adFormat");
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(str, "adUnitId");
        this.f32997a = aVar;
        this.f32998b = uuid;
        this.f32999c = str;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b02) {
        return a(new C4028g0(this.f32997a, this.f32998b, this.f32999c, null, null, null, 56, null));
    }
}
