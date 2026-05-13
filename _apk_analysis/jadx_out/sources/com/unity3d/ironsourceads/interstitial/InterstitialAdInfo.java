package com.unity3d.ironsourceads.interstitial;

import com.ironsource.sdk.controller.f;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53447b;

    public InterstitialAdInfo(@NotNull String str, @NotNull String str2) {
        p.k(str, "instanceId");
        p.k(str2, f.b.f33716c);
        this.f53446a = str;
        this.f53447b = str2;
    }

    @NotNull
    public final String getAdId() {
        return this.f53447b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53446a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f53446a + "', adId: '" + this.f53447b + "']";
    }
}
