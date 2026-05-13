package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4168nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f33106b;

    public C4168nd(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        tn.p.k(str, "placementName");
        tn.p.k(adFormat, "adFormat");
        this.f33105a = str;
        this.f33106b = adFormat;
    }

    @NotNull
    public final String a() {
        return this.f33105a + "_" + this.f33106b;
    }
}
