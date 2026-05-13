package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BannerLoadOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BannerLoadOptions {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final Pair<Integer, Integer> bannerSize;

    @Nullable
    private final Map<String, String> extras;

    @Nullable
    private final BannerShowListener listener;

    @NotNull
    private final String placementId;

    /* JADX INFO: compiled from: BannerLoadOptions.kt */
    public static final class Builder {

        @Nullable
        private String adMarkup;

        @NotNull
        private final Pair<Integer, Integer> bannerSize;

        @Nullable
        private Map<String, String> extras;

        @Nullable
        private BannerShowListener listener;

        @NotNull
        private final String placementId;

        public Builder(@NotNull String str, @NotNull Pair<Integer, Integer> pair) {
            p.k(str, "placementId");
            p.k(pair, "bannerSize");
            this.placementId = str;
            this.bannerSize = pair;
        }

        @NotNull
        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        @NotNull
        public final Builder withAdMarkup(@NotNull String str) {
            p.k(str, "adMarkup");
            this.adMarkup = str;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> map) {
            p.k(map, "extras");
            this.extras = map;
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull BannerShowListener bannerShowListener) {
            p.k(bannerShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.listener = bannerShowListener;
            return this;
        }
    }

    public BannerLoadOptions(@NotNull String str, @NotNull Pair<Integer, Integer> pair, @Nullable String str2, @Nullable Map<String, String> map, @Nullable BannerShowListener bannerShowListener) {
        p.k(str, "placementId");
        p.k(pair, "bannerSize");
        this.placementId = str;
        this.bannerSize = pair;
        this.adMarkup = str2;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public /* synthetic */ BannerLoadOptions(String str, Pair pair, String str2, Map map, BannerShowListener bannerShowListener, int i10, i iVar) {
        this(str, pair, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : bannerShowListener);
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final Pair<Integer, Integer> getBannerSize() {
        return this.bannerSize;
    }

    @Nullable
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final BannerShowListener getListener() {
        return this.listener;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }
}
