package com.unity3d.mediation.rewarded;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3967cb;
import com.ironsource.C4070i6;
import com.ironsource.C4173o0;
import com.ironsource.C4219qb;
import com.ironsource.C4367z7;
import com.ironsource.E0;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class LevelPlayRewardedAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4219qb f53522b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final boolean isPlacementCapped(@NotNull String str) {
            p.k(str, "placementName");
            return C3967cb.f31136n.a(str, LevelPlay.AdFormat.REWARDED);
        }
    }

    public static final class Config implements C3967cb.b {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Double f53523a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private Double f53524a;

            @NotNull
            public final Config build() {
                return new Config(this.f53524a);
            }

            @NotNull
            public final Builder setBidFloor(double d10) {
                this.f53524a = Double.valueOf(d10);
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Config(@Nullable Double d10) {
            this.f53523a = d10;
        }

        public /* synthetic */ Config(Double d10, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : d10);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = config.f53523a;
            }
            return config.copy(d10);
        }

        @Nullable
        public final Double component1() {
            return this.f53523a;
        }

        @NotNull
        public final Config copy(@Nullable Double d10) {
            return new Config(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && p.f(this.f53523a, ((Config) obj).f53523a);
        }

        @Override // com.ironsource.C3967cb.b
        @Nullable
        public Double getBidFloor() {
            return this.f53523a;
        }

        public int hashCode() {
            Double d10 = this.f53523a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(bidFloor=" + this.f53523a + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(@NotNull String str) {
        this(str, Config.Companion.empty());
        p.k(str, "adUnitId");
    }

    public LevelPlayRewardedAd(@NotNull String str, @NotNull C3967cb.c cVar) {
        p.k(str, "adUnitId");
        p.k(cVar, "payload");
        IronLog.API.info("adUnitId: " + str + ", config: " + cVar.c());
        this.f53521a = str;
        this.f53522b = new C4219qb(str, cVar.c(), cVar.b(), cVar.a(), cVar.f(), cVar.d(), cVar.e());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(@NotNull String str, @NotNull Config config) {
        this(str, new C3967cb.c(new C4173o0(IronSource.a.REWARDED_VIDEO, E0.b.MEDIATION), new C4070i6(), Lb.f29764s.d(), new InterfaceC4262t4.a(), C4367z7.f34502a, config));
        p.k(str, "adUnitId");
        p.k(config, "config");
    }

    public static final boolean isPlacementCapped(@NotNull String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    @NotNull
    public final String getAdId() {
        return this.f53522b.a();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f53521a;
    }

    public final boolean isAdReady() {
        return this.f53522b.b();
    }

    public final void loadAd() {
        this.f53522b.c();
    }

    public final void setListener(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f53522b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(@NotNull Activity activity) {
        p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        showAd$default(this, activity, null, 2, null);
    }

    public final void showAd(@NotNull Activity activity, @Nullable String str) {
        p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f53522b.a(activity, str);
    }
}
