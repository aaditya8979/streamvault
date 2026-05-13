package com.unity3d.mediation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f53496b;

    public LevelPlayConfiguration(boolean z10, @Nullable String str) {
        this.f53495a = z10;
        this.f53496b = str;
    }

    @Nullable
    public final String getAb() {
        return this.f53496b;
    }

    public final boolean isAdQualityEnabled() {
        return this.f53495a;
    }
}
