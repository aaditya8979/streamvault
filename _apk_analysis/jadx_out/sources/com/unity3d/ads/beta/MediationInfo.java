package com.unity3d.ads.beta;

import com.ironsource.Df;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MediationInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MediationInfo {

    @NotNull
    private final String adapterVersion;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    public MediationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p.k(str, "name");
        p.k(str2, "version");
        p.k(str3, Df.f29182b);
        this.name = str;
        this.version = str2;
        this.adapterVersion = str3;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}
