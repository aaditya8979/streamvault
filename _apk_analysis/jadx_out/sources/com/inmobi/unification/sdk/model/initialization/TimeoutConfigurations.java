package com.inmobi.unification.sdk.model.initialization;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.AbstractC3691qk;
import com.inmobi.media.C3715rk;
import com.inmobi.media.Xh;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C4157n2;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.Serializable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;

    @NotNull
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;

    @NotNull
    public static final C3715rk Companion = new C3715rk();

    @NotNull
    private static final String APPLOVIN_KEY = "c_applovin";

    @NotNull
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC3691qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC3691qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC3691qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC3691qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC3691qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC3691qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC3691qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC3691qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerloadTimeout = AbstractC3691qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntloadTimeout = AbstractC3691qk.a(29500, 29500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeloadTimeout = AbstractC3691qk.a(14500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioloadTimeout = AbstractC3691qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioMaxRetries = AbstractC3691qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioRetryInterval = AbstractC3691qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultPreloadBannerPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerLoadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadBannerRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadIntPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadIntRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadNativePreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeloadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadNativeRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadAudioPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioloadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadAudioRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final p<JSONObject, Integer, Boolean> validator = new p() { // from class: p9.a
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;

    @NotNull
    private MediationConfig mediationConfig = new MediationConfig();

    @Keep
    public static final class ABConfig {

        @NotNull
        private AdABConfig audio;

        @NotNull
        private AdABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @NotNull
        private AdABConfig f26int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @NotNull
        private AdABConfig f27native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries);
            this.f26int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries);
            this.f27native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries);
        }

        @NotNull
        public final AdABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        public final AdABConfig getInterstitial() {
            return this.f26int;
        }

        @NotNull
        public final AdABConfig getNative() {
            return this.f27native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f26int.isValid() && this.f27native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    public static final class AdABConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3) {
            this();
            tn.p.k(jSONObject, C4157n2.f33011t);
            tn.p.k(jSONObject2, "retryInterval");
            tn.p.k(jSONObject3, "maxRetries");
            this.loadTimeout = jSONObject;
            this.loadRetryInterval = jSONObject2;
            this.maxLoadRetries = jSONObject3;
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.maxLoadRetries, 1)).booleanValue();
        }
    }

    @Keep
    public static final class AdNonABConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3, @NotNull JSONObject jSONObject4) {
            this();
            tn.p.k(jSONObject, C4157n2.f33011t);
            tn.p.k(jSONObject2, "muttTimeout");
            tn.p.k(jSONObject3, "retryInterval");
            tn.p.k(jSONObject4, "maxRetries");
            this.loadTimeout = jSONObject;
            this.muttTimeout = jSONObject2;
            this.loadRetryInterval = jSONObject3;
            this.maxLoadRetries = jSONObject4;
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.maxLoadRetries, 1)).booleanValue();
        }
    }

    @Keep
    public static final class AdPreloadConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        @NotNull
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3, @NotNull JSONObject jSONObject4, @NotNull JSONObject jSONObject5) {
            this();
            tn.p.k(jSONObject, "preloadTimeout");
            tn.p.k(jSONObject2, "muttTimeout");
            tn.p.k(jSONObject3, C4157n2.f33011t);
            tn.p.k(jSONObject4, "retryInterval");
            tn.p.k(jSONObject5, "maxRetries");
            this.preloadTimeout = jSONObject;
            this.muttTimeout = jSONObject2;
            this.loadTimeout = jSONObject3;
            this.loadRetryInterval = jSONObject4;
            this.maxLoadRetries = jSONObject5;
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        @NotNull
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo2invoke(this.maxLoadRetries, 1)).booleanValue();
        }
    }

    @Keep
    public static final class MediationConfig {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        @NotNull
        private ABConfig f28675ab = new ABConfig();

        @NotNull
        private NonABConfig nonAb = new NonABConfig();

        @NotNull
        private PreloadConfig preload = new PreloadConfig();

        @NotNull
        public final ABConfig getABConfig() {
            return this.f28675ab;
        }

        @NotNull
        public final NonABConfig getNonABConfig() {
            return this.nonAb;
        }

        @NotNull
        public final PreloadConfig getPreloadConfig() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.f28675ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @Keep
    public static final class NonABConfig {

        @NotNull
        private AdNonABConfig audio;

        @NotNull
        private AdNonABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @NotNull
        private AdNonABConfig f28int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @NotNull
        private AdNonABConfig f29native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.f28int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.f29native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }

        @NotNull
        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        public final AdNonABConfig getInterstitial() {
            return this.f28int;
        }

        @NotNull
        public final AdNonABConfig getNative() {
            return this.f29native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f28int.isValid() && this.f29native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    public static final class PreloadConfig {

        @NotNull
        private AdPreloadConfig audio;

        @NotNull
        private AdPreloadConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @NotNull
        private AdPreloadConfig f30int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @NotNull
        private AdPreloadConfig f31native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.f30int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.f31native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        @NotNull
        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        @NotNull
        public final AdPreloadConfig getInterstitial() {
            return this.f30int;
        }

        @NotNull
        public final AdPreloadConfig getNative() {
            return this.f31native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f30int.isValid() && this.f31native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    public static final class RenderTimeoutByType {

        @NotNull
        public static final a Companion = new a();
        private int audio;
        private int banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private int f32int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private int f33native;

        private RenderTimeoutByType() {
        }

        public /* synthetic */ RenderTimeoutByType(i iVar) {
            this();
        }

        public final int getAudio$media_release() {
            return this.audio;
        }

        public final int getBanner$media_release() {
            return this.banner;
        }

        public final int getInt$media_release() {
            return this.f32int;
        }

        public final int getNative$media_release() {
            return this.f33native;
        }

        public final int getTimeoutByType$media_release(@NotNull String str, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            tn.p.k(str, "adType");
            int iHashCode = str.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && str.equals("audio") && (i14 = this.audio) > 0) {
                            return i14;
                        }
                    } else if (str.equals(ImpressionLog.f51753w) && (i13 = this.f32int) > 0) {
                        return i13;
                    }
                } else if (str.equals("native") && (i12 = this.f33native) > 0) {
                    return i12;
                }
            } else if (str.equals("banner") && (i11 = this.banner) > 0) {
                return i11;
            }
            return i10;
        }

        public final void setAudio$media_release(int i10) {
            this.audio = i10;
        }

        public final void setBanner$media_release(int i10) {
            this.banner = i10;
        }

        public final void setInt$media_release(int i10) {
            this.f32int = i10;
        }

        public final void setNative$media_release(int i10) {
            this.f33native = i10;
        }

        @VisibleForTesting(otherwise = 5)
        public final void setTimeoutByType(@NotNull String str, int i10) {
            tn.p.k(str, "adType");
            int iHashCode = str.hashCode();
            if (iHashCode == -1396342996) {
                if (str.equals("banner")) {
                    this.banner = i10;
                }
            } else if (iHashCode == -1052618729) {
                if (str.equals("native")) {
                    this.f33native = i10;
                }
            } else if (iHashCode == 104431) {
                if (str.equals(ImpressionLog.f51753w)) {
                    this.f32int = i10;
                }
            } else if (iHashCode == 93166550 && str.equals("audio")) {
                this.audio = i10;
            }
        }
    }

    public static final boolean a(JSONObject jSONObject, int i10) {
        tn.p.k(jSONObject, "param");
        Iterator<String> itKeys = jSONObject.keys();
        tn.p.j(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (jSONObject.getInt(itKeys.next()) < i10) {
                z10 = false;
            }
        }
        return z10;
    }

    public final MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }
}
