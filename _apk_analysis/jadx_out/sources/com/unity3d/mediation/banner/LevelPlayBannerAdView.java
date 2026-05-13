package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C3978d4;
import com.ironsource.C4367z7;
import com.ironsource.Fa;
import com.ironsource.W2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fa f53506a;

    public static final class Config {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final LevelPlayAdSize f53507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Double f53508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f53509c;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private LevelPlayAdSize f53510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private Double f53511b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private String f53512c;

            @NotNull
            public final Config build() {
                return new Config(this.f53510a, this.f53511b, this.f53512c);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize levelPlayAdSize) {
                p.k(levelPlayAdSize, C3978d4.i.O);
                this.f53510a = levelPlayAdSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d10) {
                this.f53511b = Double.valueOf(d10);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String str) {
                p.k(str, "placementName");
                this.f53512c = str;
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public Config(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d10, @Nullable String str) {
            this.f53507a = levelPlayAdSize;
            this.f53508b = d10;
            this.f53509c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : levelPlayAdSize, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                levelPlayAdSize = config.f53507a;
            }
            if ((i10 & 2) != 0) {
                d10 = config.f53508b;
            }
            if ((i10 & 4) != 0) {
                str = config.f53509c;
            }
            return config.copy(levelPlayAdSize, d10, str);
        }

        @Nullable
        public final LevelPlayAdSize component1() {
            return this.f53507a;
        }

        @Nullable
        public final Double component2() {
            return this.f53508b;
        }

        @Nullable
        public final String component3() {
            return this.f53509c;
        }

        @NotNull
        public final Config copy(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d10, @Nullable String str) {
            return new Config(levelPlayAdSize, d10, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return p.f(this.f53507a, config.f53507a) && p.f(this.f53508b, config.f53508b) && p.f(this.f53509c, config.f53509c);
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.f53507a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.f53508b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.f53509c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f53507a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d10 = this.f53508b;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str = this.f53509c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Config(adSize=" + this.f53507a + ", bidFloor=" + this.f53508b + ", placementName=" + this.f53509c + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.k(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> pairA = Fa.f29315n.a(context, attributeSet);
        this.f53506a = a(pairA.component1(), pairA.component2());
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str) {
        this(context, str, Config.Companion.empty());
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str, @NotNull Config config) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "adUnitId");
        p.k(config, "config");
        IronLog.API.info("adUnitId: " + str + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f53506a = a(str, config);
    }

    private final Fa a(String str, Config config) {
        Context context = getContext();
        p.j(context, GAMConfig.KEY_CONTEXT);
        W2 w2A = a(context);
        addView(w2A);
        return new Fa(C4367z7.f34502a.a(), str, w2A, config, null, 16, null);
    }

    private final W2 a(Context context) {
        W2 w22 = new W2(context);
        w22.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w22;
    }

    public final void destroy() {
        this.f53506a.b();
    }

    @NotNull
    public final String getAdId() {
        String string = this.f53506a.c().toString();
        p.j(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.f53506a.d();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f53506a.e();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f53506a.f();
    }

    @NotNull
    public final String getPlacementName() {
        return this.f53506a.g();
    }

    public final void loadAd() {
        this.f53506a.i();
    }

    public final void pauseAutoRefresh() {
        this.f53506a.j();
    }

    public final void resumeAutoRefresh() {
        this.f53506a.k();
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f53506a.a(levelPlayBannerAdViewListener);
    }
}
