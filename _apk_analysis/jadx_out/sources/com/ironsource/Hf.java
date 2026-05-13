package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Boolean f29567d;

    public Hf(@Nullable String str, boolean z10, @Nullable Boolean bool, @Nullable String str2) {
        this.f29564a = str2;
        this.f29565b = str;
        this.f29566c = z10;
        this.f29567d = bool;
    }

    public /* synthetic */ Hf(String str, boolean z10, Boolean bool, String str2, int i10, tn.i iVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }

    @Nullable
    public final String a() {
        return this.f29564a;
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        tn.p.k(networkSettings, "networkSettings");
        tn.p.k(aVar, "adUnit");
        String str = this.f29565b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Kf kf2 = Kf.f29735a;
        return tn.p.f(kf2.a(networkSettings), this.f29565b) && kf2.a(networkSettings, aVar) == this.f29566c;
    }

    public final boolean b() {
        return tn.p.f(this.f29567d, Boolean.TRUE);
    }
}
