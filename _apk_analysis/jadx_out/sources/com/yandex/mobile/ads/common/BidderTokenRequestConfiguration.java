package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BidderTokenRequestConfiguration {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdapterIdentity f59161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f59162b;

    public static final class AppOpenAd extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f59163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f59164d;

        public AppOpenAd(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f59163c = adapterIdentity;
            this.f59164d = map;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppOpenAd)) {
                return false;
            }
            AppOpenAd appOpenAd = (AppOpenAd) obj;
            return p.f(this.f59163c, appOpenAd.f59163c) && p.f(this.f59164d, appOpenAd.f59164d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.f59164d;
        }

        public int hashCode() {
            return this.f59164d.hashCode() + (this.f59163c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AppOpenAd(adapterIdentity=" + this.f59163c + ", parameters=" + this.f59164d + ")";
        }
    }

    public static final class Banner extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f59165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final BannerAdSize f59166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f59167e;

        public Banner(@NotNull AdapterIdentity adapterIdentity, @Nullable BannerAdSize bannerAdSize, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f59165c = adapterIdentity;
            this.f59166d = bannerAdSize;
            this.f59167e = map;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return p.f(this.f59165c, banner.f59165c) && p.f(this.f59166d, banner.f59166d) && p.f(this.f59167e, banner.f59167e);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @Nullable
        public BannerAdSize getBannerAdSize() {
            return this.f59166d;
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.f59167e;
        }

        public int hashCode() {
            int iHashCode = this.f59165c.hashCode() * 31;
            BannerAdSize bannerAdSize = this.f59166d;
            return this.f59167e.hashCode() + ((iHashCode + (bannerAdSize == null ? 0 : bannerAdSize.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Banner(adapterIdentity=" + this.f59165c + ", bannerAdSize=" + this.f59166d + ", parameters=" + this.f59167e + ")";
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AdapterIdentity f59168e = new AdapterIdentity("unknown", "0.0.0");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdType f59169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AdapterIdentity f59170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BannerAdSize f59171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f59172d = kotlin.collections.a.j();

        public Builder(@NotNull AdType adType) {
            this.f59169a = adType;
        }

        @NotNull
        public final BidderTokenRequestConfiguration build() {
            AdapterIdentity adapterIdentity = this.f59170b;
            if (adapterIdentity == null) {
                adapterIdentity = f59168e;
            }
            switch (a.f59182a[this.f59169a.ordinal()]) {
                case 1:
                    return new Banner(adapterIdentity, this.f59171c, this.f59172d);
                case 2:
                    return new Interstitial(adapterIdentity, this.f59172d);
                case 3:
                    return new Rewarded(adapterIdentity, this.f59172d);
                case 4:
                    return new Native(adapterIdentity, this.f59172d);
                case 5:
                    return new AppOpenAd(adapterIdentity, this.f59172d);
                case 6:
                    return new Interstitial(adapterIdentity, this.f59172d);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @NotNull
        public final Builder setBannerAdSize(@Nullable BannerAdSize bannerAdSize) {
            this.f59171c = bannerAdSize;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> map) {
            this.f59172d = map;
            return this;
        }
    }

    public static final class Interstitial extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f59173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f59174d;

        public Interstitial(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f59173c = adapterIdentity;
            this.f59174d = map;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj;
            return p.f(this.f59173c, interstitial.f59173c) && p.f(this.f59174d, interstitial.f59174d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.f59174d;
        }

        public int hashCode() {
            return this.f59174d.hashCode() + (this.f59173c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Interstitial(adapterIdentity=" + this.f59173c + ", parameters=" + this.f59174d + ")";
        }
    }

    public static final class Native extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f59175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f59176d;

        public Native(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f59175c = adapterIdentity;
            this.f59176d = map;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Native)) {
                return false;
            }
            Native r52 = (Native) obj;
            return p.f(this.f59175c, r52.f59175c) && p.f(this.f59176d, r52.f59176d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.f59176d;
        }

        public int hashCode() {
            return this.f59176d.hashCode() + (this.f59175c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Native(adapterIdentity=" + this.f59175c + ", parameters=" + this.f59176d + ")";
        }
    }

    public static final class Rewarded extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f59177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f59178d;

        public Rewarded(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f59177c = adapterIdentity;
            this.f59178d = map;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rewarded)) {
                return false;
            }
            Rewarded rewarded = (Rewarded) obj;
            return p.f(this.f59177c, rewarded.f59177c) && p.f(this.f59178d, rewarded.f59178d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.f59178d;
        }

        public int hashCode() {
            return this.f59178d.hashCode() + (this.f59177c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rewarded(adapterIdentity=" + this.f59177c + ", parameters=" + this.f59178d + ")";
        }
    }

    private BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map) {
        this.f59161a = adapterIdentity;
        this.f59162b = map;
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map, i iVar) {
        this(adapterIdentity, map);
    }

    @Nullable
    public BannerAdSize getBannerAdSize() {
        return null;
    }

    @NotNull
    public abstract Map<String, String> getParameters();
}
