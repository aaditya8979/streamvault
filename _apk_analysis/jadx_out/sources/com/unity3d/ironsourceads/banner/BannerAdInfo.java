package com.unity3d.ironsourceads.banner;

import com.ironsource.sdk.controller.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53413b;

    public BannerAdInfo(@NotNull String str, @NotNull String str2) {
        p.k(str, "instanceId");
        p.k(str2, f.b.f33716c);
        this.f53412a = str;
        this.f53413b = str2;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f53412a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f53413b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f53412a;
    }

    @NotNull
    public final String component2() {
        return this.f53413b;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String str, @NotNull String str2) {
        p.k(str, "instanceId");
        p.k(str2, f.b.f33716c);
        return new BannerAdInfo(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return p.f(this.f53412a, bannerAdInfo.f53412a) && p.f(this.f53413b, bannerAdInfo.f53413b);
    }

    @NotNull
    public final String getAdId() {
        return this.f53413b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53412a;
    }

    public int hashCode() {
        return (this.f53412a.hashCode() * 31) + this.f53413b.hashCode();
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f53412a + "', adId: '" + this.f53413b + "']";
    }
}
