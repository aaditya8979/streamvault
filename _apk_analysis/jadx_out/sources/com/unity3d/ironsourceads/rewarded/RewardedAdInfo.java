package com.unity3d.ironsourceads.rewarded;

import com.ironsource.sdk.controller.f;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53460b;

    public RewardedAdInfo(@NotNull String str, @NotNull String str2) {
        p.k(str, "instanceId");
        p.k(str2, f.b.f33716c);
        this.f53459a = str;
        this.f53460b = str2;
    }

    @NotNull
    public final String getAdId() {
        return this.f53460b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53459a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f53459a + "', adId: '" + this.f53460b + "']";
    }
}
