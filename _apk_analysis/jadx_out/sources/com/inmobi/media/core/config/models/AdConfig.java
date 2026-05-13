package com.inmobi.media.core.config.models;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import bn.h;
import bo.d0;
import cn.w;
import com.inmobi.media.AbstractC3414fi;
import com.inmobi.media.C3894z;
import com.inmobi.media.F3;
import com.inmobi.media.H6;
import com.inmobi.media.N0;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.mbridge.msdk.foundation.entity.b;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class AdConfig extends Config {
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final long DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;

    @NotNull
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final long DEFAULT_AUDIO_PROCESSING_INTERVAL = 500;
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final long DEFAULT_EXPOSURE_PROCESSING_INTERVAL = 500;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final int DEFAULT_NATIVE_ICON_MIN_DIM = 34;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_PING_V2_CALL_TIMEOUT = 60;
    public static final int DEFAULT_PING_V2_CONNECT_TIMEOUT = 30;
    public static final boolean DEFAULT_PING_V2_ENABLE = false;
    public static final int DEFAULT_PING_V2_EXPIRY_HIGH = 172800;
    public static final int DEFAULT_PING_V2_EXPIRY_NORMAL = 86400;
    public static final int DEFAULT_PING_V2_HIGH_MAX_BATCH_SIZE = 64;
    public static final int DEFAULT_PING_V2_INTERVAL_HIGH = 30;
    public static final int DEFAULT_PING_V2_INTERVAL_NORMAL = 120;
    public static final int DEFAULT_PING_V2_MAX_ENTRIES = 1000;
    public static final int DEFAULT_PING_V2_NORMAL_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_PING_V2_READ_TIMEOUT = 30;
    public static final double DEFAULT_PING_V2_RETRY_HIGH_FACTOR = 1.0d;
    public static final int DEFAULT_PING_V2_RETRY_HIGH_MAX_RETRIES = 5;
    public static final long DEFAULT_PING_V2_RETRY_HIGH_RETRY_INTERVAL = 10;
    public static final double DEFAULT_PING_V2_RETRY_NORMAL_FACTOR = 2.0d;
    public static final int DEFAULT_PING_V2_RETRY_NORMAL_MAX_RETRIES = 3;
    public static final long DEFAULT_PING_V2_RETRY_NORMAL_RETRY_INTERVAL = 120;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final long DEFAULT_SCROLL_THROTTLE_INTERVAL = 500;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final int DEFAULT_UPPER_BOUND_FOR_ACTIVITY_CONTEXT = 10;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    private static final long DEFAULT_WINDOW_POLLING_INTERVAL = 500;
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    private static final String TAG = "AdConfig";

    @NotNull
    private AdQualityConfig adQuality;

    @NotNull
    private AdReportConfig adReport;

    @Nullable
    private N0 adReqDeprecateChecker;
    private boolean applyGzipReq;

    @NotNull
    private AudioConfig audio;

    @NotNull
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;

    @NotNull
    private ContextualDataConfig contextualData;

    @Nullable
    private String deprecate;
    private boolean enableCookiesOnInAppBrowser;

    @NotNull
    private ImaiConfig imai;

    @NotNull
    private final InlineInstaller inlineInstaller;

    @NotNull
    private MraidConfig mraid;
    private boolean partialTabsEnabled;

    @NotNull
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private boolean skipNetworkValidationFeatureEnabled;

    @NotNull
    private TimeoutConfigurations timeouts;

    @NotNull
    private VastVideoConfig vastVideo;

    @NotNull
    private ViewabilityConfig viewability;

    @NotNull
    private WebAssetCacheConfig webAssetCache;

    @NotNull
    public static final C3894z Companion = new C3894z();

    @NotNull
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = w.m();
    private int maxPoolSize = 10;

    @NotNull
    private String url = DEFAULT_AD_SERVER_URL;

    @Nullable
    private CustomNetworkValidation customNwValidation = new CustomNetworkValidation();
    private int minimumRefreshInterval = 20;
    private int defaultRefreshInterval = 60;
    private boolean watermarkEnabled = true;

    @NotNull
    private Mraid3Config mraid3 = new Mraid3Config();

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @NotNull
    private final NativeConfig f23native = new NativeConfig();

    @NotNull
    private PingsV2Config pingV2 = new PingsV2Config();

    @NotNull
    private HybridNativeConfig hybridNative = new HybridNativeConfig();

    @Keep
    public static final class AdChoiceConfig {
        private final int height;
        private final int width;

        @NotNull
        private final String url = "https://supply.inmobicdn.net/lagom-icons/AdChoices-11.png";

        @NotNull
        private final String link = "https://www.inmobi.com";

        @NotNull
        private final String openMode = "DEFAULT";
        private final int loadTimeout = 5000;

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final int getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        public final String getOpenMode() {
            return this.openMode;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    @Keep
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private long retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            return this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setEnableAdQuality(boolean z10) {
            this.enabled = z10;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMaxImageSize(int i10) {
            this.maxImageSize = i10;
        }
    }

    @Keep
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i10) {
            this.cridls = i10;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }
    }

    @Keep
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        public final boolean isAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            return this.minDeviceVolume > 0 && this.minRefreshInterval > 0;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setAudioEnabled(boolean z10) {
            this.isAudioEnabled = z10;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMinDeviceVolume(int i10) {
            this.minDeviceVolume = i10;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMinRefreshInterval(int i10) {
            this.minRefreshInterval = i10;
        }
    }

    @Keep
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    public static final class BitRateConfig {
        private final boolean bitrate_mandatory;
        private final boolean fetchFromHead;
        private final long headerTimeout = 2000;

        public final boolean getBitrate_mandatory() {
            return this.bitrate_mandatory;
        }

        public final boolean getFetchFromHead() {
            return this.fetchFromHead;
        }

        public final long getHeaderTimeout() {
            return this.headerTimeout;
        }
    }

    @Keep
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return this.timeToLive >= 0;
        }

        public final void setTimeToLive(long j10) {
            this.timeToLive = j10;
        }
    }

    @Keep
    public static final class CompanionViewabilityConfig {
        private int impressionMinPercentageViewed = 10;
        private int visibilityPollIntervalMillis = 500;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getVisibilityPollIntervalMillis() {
            return this.visibilityPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setVisibilityPollIntervalMillis(int i10) {
            this.visibilityPollIntervalMillis = i10;
        }
    }

    @Keep
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;

        @NotNull
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = 86400;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        @NotNull
        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            return this.maxAdRecords >= 0 && this.expiryTime >= 0;
        }
    }

    @Keep
    public static final class CustomNetworkValidation {
        private boolean enabled;

        @NotNull
        private String urlDomain = "supply.inmobicdn.net";
        private long refreshDebounceTime = 1000;
        private long validatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        private long nonValidatedExpiry = 30000;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getNonValidatedExpiry() {
            return this.nonValidatedExpiry;
        }

        public final long getRefreshDebounceTime() {
            return this.refreshDebounceTime;
        }

        @NotNull
        public final String getUrlDomain() {
            return this.urlDomain;
        }

        public final long getValidatedExpiry() {
            return this.validatedExpiry;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }

        public final void setNonValidatedExpiry(long j10) {
            this.nonValidatedExpiry = j10;
        }

        public final void setRefreshDebounceTime(long j10) {
            this.refreshDebounceTime = j10;
        }

        public final void setUrlDomain(@NotNull String str) {
            p.k(str, "<set-?>");
            this.urlDomain = str;
        }

        public final void setValidatedExpiry(long j10) {
            this.validatedExpiry = j10;
        }
    }

    @Keep
    public static final class HybridNativeConfig {

        @Nullable
        private final String maxSupportedPlayerVersion;
        private final boolean isEnabled = true;
        private final long minProgressInterval = 500;

        @NotNull
        private final VideoCacheConfig videoCache = new VideoCacheConfig();

        @Nullable
        public final String getMaxSupportedPlayerVersion() {
            return this.maxSupportedPlayerVersion;
        }

        public final long getMinProgressInterval() {
            return this.minProgressInterval;
        }

        @NotNull
        public final VideoCacheConfig getVideoCache() {
            return this.videoCache;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    @Keep
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = 120;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            return getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0;
        }
    }

    @Keep
    public static final class InlineInstaller {
        private final boolean shouldPingInWebView = true;

        public final boolean getShouldPingInWebView() {
            return this.shouldPingInWebView;
        }
    }

    @Keep
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }
    }

    @Keep
    public static final class Mraid3Config {
        private boolean bannerEnabled = true;
        private boolean interstitialEnabled = true;
        private long exposureChangeInterval = 500;
        private long muteChangeInterval = 500;

        public final boolean getBannerEnabled() {
            return this.bannerEnabled;
        }

        public final long getExposureChangeInterval() {
            return this.exposureChangeInterval;
        }

        public final boolean getInterstitialEnabled() {
            return this.interstitialEnabled;
        }

        public final long getMuteChangeInterval() {
            return this.muteChangeInterval;
        }

        public final void setBannerEnabled(boolean z10) {
            this.bannerEnabled = z10;
        }

        public final void setExposureChangeInterval(long j10) {
            this.exposureChangeInterval = j10;
        }

        public final void setInterstitialEnabled(boolean z10) {
            this.interstitialEnabled = z10;
        }

        public final void setMuteChangeInterval(long j10) {
            this.muteChangeInterval = j10;
        }
    }

    @Keep
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;

        @NotNull
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1110/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !H6.a(this.url);
        }
    }

    @Keep
    public static final class NativeAssetConfig {
        private final int maxImageSize = 10;

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }
    }

    @Keep
    public static final class NativeConfig {

        @NotNull
        private final AdChoiceConfig adChoiceConfig = new AdChoiceConfig();

        @NotNull
        private final VideoPlayerConfig videoPlayerConfig = new VideoPlayerConfig();

        @NotNull
        private final NativeViewabilityConfig viewabilityConfig = new NativeViewabilityConfig();

        @NotNull
        private final NativeAssetConfig assetConfig = new NativeAssetConfig();

        @NotNull
        public final AdChoiceConfig getAdChoiceConfig() {
            return this.adChoiceConfig;
        }

        @NotNull
        public final NativeAssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final VideoPlayerConfig getVideoPlayerConfig() {
            return this.videoPlayerConfig;
        }

        @NotNull
        public final NativeViewabilityConfig getViewabilityConfig() {
            return this.viewabilityConfig;
        }

        public final boolean isValid() {
            return this.viewabilityConfig.isValid() && this.videoPlayerConfig.isValid();
        }
    }

    @Keep
    public static final class NativeViewabilityConfig {

        @NotNull
        private ImpressionConfig impressionConfig = new ImpressionConfig();

        @NotNull
        private MRC50Config mrc50Config = new MRC50Config();

        @NotNull
        private DimensionConfig parentMinDimension = new DimensionConfig();

        @NotNull
        private DimensionConfig iconMinDimension = new DimensionConfig();

        @NotNull
        private DimensionConfig mediaMinDimension = new DimensionConfig();

        @Keep
        public static final class DimensionConfig {

            @NotNull
            private List<Integer> dimensions;

            public DimensionConfig() {
                ArrayList arrayList = new ArrayList(2);
                for (int i10 = 0; i10 < 2; i10++) {
                    arrayList.add(34);
                }
                this.dimensions = arrayList;
            }

            @NotNull
            public final List<Integer> getDimensions() {
                return this.dimensions;
            }

            public final void setDimensions(@NotNull List<Integer> list) {
                p.k(list, "<set-?>");
                this.dimensions = list;
            }
        }

        @Keep
        public static final class ImpressionConfig {
            private byte impressionType = 1;
            private int minPercentageViewed = 1;
            private int minTimeViewed = 1000;
            private int videoMinTimeViewed = 2000;
            private int pollInterval = 500;

            public final byte getImpressionType() {
                return this.impressionType;
            }

            public final int getMinPercentageViewed() {
                return this.minPercentageViewed;
            }

            public final int getMinTimeViewed() {
                return this.minTimeViewed;
            }

            public final int getPollInterval() {
                return this.pollInterval;
            }

            public final int getVideoMinTimeViewed() {
                return this.videoMinTimeViewed;
            }

            public final void setImpressionType(byte b10) {
                this.impressionType = b10;
            }

            public final void setMinPercentageViewed(int i10) {
                this.minPercentageViewed = i10;
            }

            public final void setMinTimeViewed(int i10) {
                this.minTimeViewed = i10;
            }

            public final void setPollInterval(int i10) {
                this.pollInterval = i10;
            }

            public final void setVideoMinTimeViewed(int i10) {
                this.videoMinTimeViewed = i10;
            }
        }

        @Keep
        public static final class MRC50Config {
            private int minTimeViewed = 1000;
            private int videoMinTimeViewed = 2000;

            public final int getMinTimeViewed() {
                return this.minTimeViewed;
            }

            public final int getVideoMinTimeViewed() {
                return this.videoMinTimeViewed;
            }

            public final void setMinTimeViewed(int i10) {
                this.minTimeViewed = i10;
            }

            public final void setVideoMinTimeViewed(int i10) {
                this.videoMinTimeViewed = i10;
            }
        }

        @NotNull
        public final DimensionConfig getIconMinDimension() {
            return this.iconMinDimension;
        }

        @NotNull
        public final ImpressionConfig getImpressionConfig() {
            return this.impressionConfig;
        }

        @NotNull
        public final DimensionConfig getMediaMinDimension() {
            return this.mediaMinDimension;
        }

        @NotNull
        public final MRC50Config getMrc50Config() {
            return this.mrc50Config;
        }

        @NotNull
        public final DimensionConfig getParentMinDimension() {
            return this.parentMinDimension;
        }

        public final boolean isValid() {
            return this.mediaMinDimension.getDimensions().size() == 2 && this.iconMinDimension.getDimensions().size() == 2 && this.parentMinDimension.getDimensions().size() == 2;
        }

        public final void setIconMinDimension(@NotNull DimensionConfig dimensionConfig) {
            p.k(dimensionConfig, "<set-?>");
            this.iconMinDimension = dimensionConfig;
        }

        public final void setImpressionConfig(@NotNull ImpressionConfig impressionConfig) {
            p.k(impressionConfig, "<set-?>");
            this.impressionConfig = impressionConfig;
        }

        public final void setMediaMinDimension(@NotNull DimensionConfig dimensionConfig) {
            p.k(dimensionConfig, "<set-?>");
            this.mediaMinDimension = dimensionConfig;
        }

        public final void setMrc50Config(@NotNull MRC50Config mRC50Config) {
            p.k(mRC50Config, "<set-?>");
            this.mrc50Config = mRC50Config;
        }

        public final void setParentMinDimension(@NotNull DimensionConfig dimensionConfig) {
            p.k(dimensionConfig, "<set-?>");
            this.parentMinDimension = dimensionConfig;
        }
    }

    @Keep
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;

        @NotNull
        private String partnerKey = "Inmobi";

        @NotNull
        private String url = "https://supply.inmobicdn.net/javascript/1.5.7/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        @NotNull
        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            return getMaxRetries() >= 0 && getRetryInterval() >= 0 && F3.a(d0.s1(this.url).toString()) && !TextUtils.isEmpty(getPartnerKey());
        }

        public final void setOmidEnabled(boolean z10) {
            this.omidEnabled = z10;
        }
    }

    @Keep
    public static final class PingsV2Config {
        private final boolean enabled;
        private final int maxEntries = 1000;

        @NotNull
        private final PingBatchSizeConfig maxBatchSize = new PingBatchSizeConfig();
        private final int readTimeout = 30;
        private final int connectTimeout = 30;
        private final int callTimeout = 60;

        @NotNull
        private final PingExpiryConfig expiry = new PingExpiryConfig();

        @NotNull
        private final PingRetryConfig retryConfig = new PingRetryConfig();

        @NotNull
        private final PingIntervalConfig interval = new PingIntervalConfig();

        @Keep
        public static final class PingBatchSizeConfig {
            private final int normal = 20;
            private final int high = 64;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Keep
        public static final class PingExpiryConfig {
            private final int normal = 86400;
            private final int high = AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Keep
        public static final class PingIntervalConfig {
            private int normal = 120;
            private int high = 30;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }

            public final void setHigh(int i10) {
                this.high = i10;
            }

            public final void setNormal(int i10) {
                this.normal = i10;
            }
        }

        @Keep
        public static final class PingRetryConfig {

            @NotNull
            private PriorityRetryConfig normal = new PriorityRetryConfig(3, 120, 2.0d);

            @NotNull
            private PriorityRetryConfig high = new PriorityRetryConfig(5, 10, 1.0d);

            @Keep
            public static final class PriorityRetryConfig {
                private double factor;
                private int maxRetries;
                private long retryInterval;

                public PriorityRetryConfig(int i10, long j10, double d10) {
                    this.maxRetries = i10;
                    this.retryInterval = j10;
                    this.factor = d10;
                }

                public final double getFactor() {
                    return this.factor;
                }

                public final int getMaxRetries() {
                    return this.maxRetries;
                }

                public final long getRetryInterval() {
                    return this.retryInterval;
                }

                public final void setFactor(double d10) {
                    this.factor = d10;
                }

                public final void setMaxRetries(int i10) {
                    this.maxRetries = i10;
                }

                public final void setRetryInterval(long j10) {
                    this.retryInterval = j10;
                }
            }

            @NotNull
            public final PriorityRetryConfig getHigh() {
                return this.high;
            }

            @NotNull
            public final PriorityRetryConfig getNormal() {
                return this.normal;
            }

            public final void setHigh(@NotNull PriorityRetryConfig priorityRetryConfig) {
                p.k(priorityRetryConfig, "<set-?>");
                this.high = priorityRetryConfig;
            }

            public final void setNormal(@NotNull PriorityRetryConfig priorityRetryConfig) {
                p.k(priorityRetryConfig, "<set-?>");
                this.normal = priorityRetryConfig;
            }
        }

        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final PingExpiryConfig getExpiry() {
            return this.expiry;
        }

        @NotNull
        public final PingIntervalConfig getInterval() {
            return this.interval;
        }

        @NotNull
        public final PingBatchSizeConfig getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getReadTimeout() {
            return this.readTimeout;
        }

        @NotNull
        public final PingRetryConfig getRetryConfig() {
            return this.retryConfig;
        }
    }

    @Keep
    public static final class RenderingConfig {
        private boolean enableActivityContextOnBannerAttach;
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;
        private boolean useDispatchTouchEvent;

        @NotNull
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;

        @NotNull
        private List<Integer> gestures = w.s(0, 1, 2, 3, 4, 5);
        private long scrollThrottleInterval = 500;
        private int upperBoundForActivityContext = 10;
        private boolean disableShowCustomView = true;

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getDisableShowCustomView() {
            return this.disableShowCustomView;
        }

        public final boolean getEnableActivityContextOnBannerAttach() {
            return this.enableActivityContextOnBannerAttach;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        public final long getScrollThrottleInterval() {
            return this.scrollThrottleInterval;
        }

        @NotNull
        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final int getUpperBoundForActivityContext() {
            return this.upperBoundForActivityContext;
        }

        public final boolean getUseDispatchTouchEvent() {
            return this.useDispatchTouchEvent;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * ((long) 1000);
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                String unused2 = AdConfig.TAG;
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            if (d0.s1(this.webviewBackground).toString().length() != 0 && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty()) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                    String unused2 = AdConfig.TAG;
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final void setScrollThrottleInterval(long j10) {
            this.scrollThrottleInterval = j10;
        }

        public final boolean shouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Keep
    public static final class VastVideoConfig {
        private final int maxWrapperLimit = 5;
        private final long optimalVastVideoSize = 3145728;
        private final long vastMaxAssetSize = 31457280;

        @NotNull
        private final BitRateConfig bitRate = new BitRateConfig();

        @NotNull
        private final List<String> allowedContentType = w.s("video/mp4", "video/3gp", "video/3gpp", "video/webm");

        @NotNull
        private final List<String> allowedCompanionType = w.s("image/jpeg", "image/jpg", "image/png");

        @NotNull
        public final List<String> getAllowedCompanionType() {
            return this.allowedCompanionType;
        }

        @NotNull
        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        @NotNull
        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            long j10 = this.optimalVastVideoSize;
            if (j10 > 31457280 || j10 <= 0 || this.maxWrapperLimit < 0) {
                return false;
            }
            long j11 = this.vastMaxAssetSize;
            return j11 > 0 && j11 <= 31457280;
        }
    }

    @Keep
    public static final class VideoCacheConfig {
        private final boolean isEnabled = true;
        private final long maxSize = 100;

        public final long getMaxSize() {
            return this.maxSize;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    @Keep
    public static final class VideoPlayerAudioConfig {

        @NotNull
        private final List<Integer> muteIconMargin;
        private final int muteIconPosition;
        private final boolean startMuted = true;
        private final int muteIconWidth = 25;
        private final int muteIconHeight = 25;

        public VideoPlayerAudioConfig() {
            ArrayList arrayList = new ArrayList(4);
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.add(10);
            }
            this.muteIconMargin = arrayList;
        }

        public final int getMuteIconHeight() {
            return this.muteIconHeight;
        }

        @NotNull
        public final List<Integer> getMuteIconMargin() {
            return this.muteIconMargin;
        }

        public final int getMuteIconPosition() {
            return this.muteIconPosition;
        }

        public final int getMuteIconWidth() {
            return this.muteIconWidth;
        }

        public final boolean getStartMuted() {
            return this.startMuted;
        }

        public final boolean isValid() {
            return this.muteIconMargin.size() == 4;
        }
    }

    @Keep
    public static final class VideoPlayerConfig {
        private final boolean loopVideoOnComplete;

        @NotNull
        private final VideoPlayerProgressConfig progressConfig = new VideoPlayerProgressConfig();

        @NotNull
        private final VideoPlayerAudioConfig audioConfig = new VideoPlayerAudioConfig();

        @NotNull
        private final VideoPlayerViewabilityConfig viewability = new VideoPlayerViewabilityConfig();

        @NotNull
        public final VideoPlayerAudioConfig getAudioConfig() {
            return this.audioConfig;
        }

        public final boolean getLoopVideoOnComplete() {
            return this.loopVideoOnComplete;
        }

        @NotNull
        public final VideoPlayerProgressConfig getProgressConfig() {
            return this.progressConfig;
        }

        @NotNull
        public final VideoPlayerViewabilityConfig getViewability() {
            return this.viewability;
        }

        public final boolean isValid() {
            return this.progressConfig.isValid() && this.audioConfig.isValid() && this.viewability.isValid();
        }
    }

    @Keep
    public static final class VideoPlayerProgressConfig {

        @NotNull
        private final List<Integer> backgroundColor;

        @NotNull
        private final List<Integer> foregroundColor;
        private final int height;
        private final long progressPolling;
        private final boolean showProgress;

        public VideoPlayerProgressConfig() {
            ArrayList arrayList = new ArrayList(4);
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.add(255);
            }
            this.foregroundColor = arrayList;
            ArrayList arrayList2 = new ArrayList(4);
            for (int i11 = 0; i11 < 4; i11++) {
                arrayList2.add(0);
            }
            this.backgroundColor = arrayList2;
            this.height = 4;
            this.progressPolling = 100L;
        }

        @NotNull
        public final List<Integer> getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<Integer> getForegroundColor() {
            return this.foregroundColor;
        }

        public final int getHeight() {
            return this.height;
        }

        public final long getProgressPolling() {
            return this.progressPolling;
        }

        public final boolean getShowProgress() {
            return this.showProgress;
        }

        public final boolean isValid() {
            return this.foregroundColor.size() == 4 && this.backgroundColor.size() == 4;
        }
    }

    @Keep
    public static final class VideoPlayerViewabilityConfig {

        @NotNull
        private final List<Integer> minDimensions;
        private final int minPercentageVisible = 50;
        private final int pollingInterval = 200;

        public VideoPlayerViewabilityConfig() {
            ArrayList arrayList = new ArrayList(2);
            for (int i10 = 0; i10 < 2; i10++) {
                arrayList.add(50);
            }
            this.minDimensions = arrayList;
        }

        @NotNull
        public final List<Integer> getMinDimensions() {
            return this.minDimensions;
        }

        public final int getMinPercentageVisible() {
            return this.minPercentageVisible;
        }

        public final int getPollingInterval() {
            return this.pollingInterval;
        }

        public final boolean isValid() {
            return this.minDimensions.size() == 2;
        }
    }

    @Keep
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setVideoMinPercentagePlay(int i10) {
            this.videoMinPercentagePlay = i10;
        }
    }

    @Keep
    public static final class ViewabilityConfig {
        private long windowPollingInterval = 500;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;

        @NotNull
        private VideoViewabilityConfig video = new VideoViewabilityConfig();

        @NotNull
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();

        @NotNull
        private WebViewabilityConfig web = new WebViewabilityConfig();

        @NotNull
        private OmidConfig omidConfig = new OmidConfig();

        @NotNull
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @NotNull
        private InterstitialImpressionTypeConfig f24int = new InterstitialImpressionTypeConfig();

        @NotNull
        private CompanionViewabilityConfig companion = new CompanionViewabilityConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getCompanionVisibilityMinPercentageViewed() {
            return this.companion.getImpressionMinPercentageViewed();
        }

        public final int getCompanionVisibilityThrottleMillis() {
            return this.companion.getVisibilityPollIntervalMillis();
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.f24int.getImpressionType();
        }

        @NotNull
        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final long getWindowPollingInterval() {
            return this.windowPollingInterval;
        }

        public final boolean isValid() {
            return getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getCompanionVisibilityMinPercentageViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getImpressionPollIntervalMillis() >= 50 && getCompanionVisibilityThrottleMillis() >= 50 && this.omidConfig.isValid();
        }

        public final void setOmidConfig(@NotNull OmidConfig omidConfig) {
            p.k(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }
    }

    @Keep
    public static final class WebAssetCacheConfig {

        @NotNull
        public static final a Companion = new a();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14) {
            this.cacheSize = i10;
            this.timeout = i11;
            this.maxRetries = i12;
            this.minAvailableDiskSpace = i13;
            this.cacheSizeToDiskSpaceMaxPercent = i14;
        }

        public /* synthetic */ WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14, int i15, i iVar) {
            this((i15 & 1) != 0 ? 15 : i10, (i15 & 2) != 0 ? 5000 : i11, (i15 & 4) != 0 ? 1 : i12, (i15 & 8) != 0 ? 50 : i13, (i15 & 16) != 0 ? 10 : i14);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i10 = webAssetCacheConfig.cacheSize;
            }
            if ((i15 & 2) != 0) {
                i11 = webAssetCacheConfig.timeout;
            }
            int i16 = i11;
            if ((i15 & 4) != 0) {
                i12 = webAssetCacheConfig.maxRetries;
            }
            int i17 = i12;
            if ((i15 & 8) != 0) {
                i13 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            int i18 = i13;
            if ((i15 & 16) != 0) {
                i14 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            return webAssetCacheConfig.copy(i10, i16, i17, i18, i14);
        }

        public final int component1() {
            return this.cacheSize;
        }

        public final int component2() {
            return this.timeout;
        }

        public final int component3() {
            return this.maxRetries;
        }

        public final int component4() {
            return this.minAvailableDiskSpace;
        }

        public final int component5() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        @NotNull
        public final WebAssetCacheConfig copy(int i10, int i11, int i12, int i13, int i14) {
            return new WebAssetCacheConfig(i10, i11, i12, i13, i14);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) obj;
            return this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return Integer.hashCode(this.cacheSizeToDiskSpaceMaxPercent) + AbstractC3414fi.a(this.minAvailableDiskSpace, AbstractC3414fi.a(this.maxRetries, AbstractC3414fi.a(this.timeout, Integer.hashCode(this.cacheSize) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            return "WebAssetCacheConfig(cacheSize=" + this.cacheSize + ", timeout=" + this.timeout + ", maxRetries=" + this.maxRetries + ", minAvailableDiskSpace=" + this.minAvailableDiskSpace + ", cacheSizeToDiskSpaceMaxPercent=" + this.cacheSizeToDiskSpaceMaxPercent + ")";
        }
    }

    @Keep
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionPollIntervalMillis(int i10) {
            this.impressionPollIntervalMillis = i10;
        }
    }

    public AdConfig() {
        TimeoutConfigurations.Companion.getClass();
        TimeoutConfigurations timeoutConfigurations = new TimeoutConfigurations();
        timeoutConfigurations.a0();
        this.timeouts = timeoutConfigurations;
        this.inlineInstaller = new InlineInstaller();
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = kotlin.collections.a.o(h.a("base", new CacheConfig()), h.a("banner", new CacheConfig()), h.a("audio", new CacheConfig()), h.a(ImpressionLog.f51753w, new CacheConfig()), h.a("native", new CacheConfig()));
    }

    @NotNull
    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    @NotNull
    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    @Nullable
    public final N0 getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            N0 n02 = null;
            if (str != null) {
                if (!F3.a(str)) {
                    str = null;
                }
                if (str != null) {
                    n02 = new N0(str);
                }
            }
            this.adReqDeprecateChecker = n02;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    @NotNull
    public final AudioConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final CacheConfig getCacheConfig(@NotNull String str) {
        p.k(str, "adType");
        CacheConfig cacheConfig = this.cache.get(str);
        if (cacheConfig != null) {
            return cacheConfig;
        }
        CacheConfig cacheConfig2 = this.cache.get("base");
        return cacheConfig2 == null ? new CacheConfig() : cacheConfig2;
    }

    @NotNull
    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    @Nullable
    public final CustomNetworkValidation getCustomNwValidation() {
        return this.customNwValidation;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final boolean getEnableCookiesOnInAppBrowser() {
        return this.enableCookiesOnInAppBrowser;
    }

    @NotNull
    public final HybridNativeConfig getHybridNative() {
        return this.hybridNative;
    }

    @NotNull
    public final ImaiConfig getImaiConfig() {
        return this.imai;
    }

    @NotNull
    public final InlineInstaller getInlineInstaller() {
        return this.inlineInstaller;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    @NotNull
    public final Mraid3Config getMraid3Config() {
        return this.mraid3;
    }

    @NotNull
    public final MraidConfig getMraidConfig() {
        return this.mraid;
    }

    @NotNull
    public final NativeConfig getNative() {
        return this.f23native;
    }

    public final boolean getPartialTabsEnabled() {
        return this.partialTabsEnabled;
    }

    @NotNull
    public final PingsV2Config getPingsV2Config() {
        return this.pingV2;
    }

    @NotNull
    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final boolean getSkipNetworkValidationFeatureEnabled() {
        return this.skipNetworkValidationFeatureEnabled;
    }

    @NotNull
    public final TimeoutConfigurations getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @NotNull
    public String getType() {
        return b.JSON_KEY_ADS;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    @NotNull
    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    @NotNull
    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    public final boolean isCCTEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        int i10;
        int i11;
        if (this.maxPoolSize > 0 && !H6.a(this.url) && (i10 = this.minimumRefreshInterval) >= 0 && (i11 = this.defaultRefreshInterval) >= 0 && i10 <= i11) {
            Iterator<Map.Entry<String, CacheConfig>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    return false;
                }
            }
            this.timeouts.a0();
            if (this.contextualData.isValid() && this.adQuality.isValid() && this.imai.isValid() && this.mraid.isValid() && this.timeouts.Z() && this.rendering.isValid() && this.vastVideo.isValid() && this.viewability.isValid() && this.audio.isValid() && this.f23native.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAdQuality(@NotNull AdQualityConfig adQualityConfig) {
        p.k(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(@NotNull AdReportConfig adReportConfig) {
        p.k(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(@Nullable N0 n02) {
        this.adReqDeprecateChecker = n02;
    }

    public final void setApplyGzipReq(boolean z10) {
        this.applyGzipReq = z10;
    }

    public final void setAudio(@NotNull AudioConfig audioConfig) {
        p.k(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(@NotNull ContextualDataConfig contextualDataConfig) {
        p.k(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setCustomNwValidation(@Nullable CustomNetworkValidation customNetworkValidation) {
        this.customNwValidation = customNetworkValidation;
    }

    public final void setDefaultRefreshInterval(int i10) {
        this.defaultRefreshInterval = i10;
    }

    public final void setEnableCookiesOnInAppBrowser(boolean z10) {
        this.enableCookiesOnInAppBrowser = z10;
    }

    public final void setHybridNative(@NotNull HybridNativeConfig hybridNativeConfig) {
        p.k(hybridNativeConfig, "<set-?>");
        this.hybridNative = hybridNativeConfig;
    }

    public final void setMinimumRefreshInterval(int i10) {
        this.minimumRefreshInterval = i10;
    }

    public final void setPartialTabsEnabled(boolean z10) {
        this.partialTabsEnabled = z10;
    }

    public final void setRendering(@NotNull RenderingConfig renderingConfig) {
        p.k(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z10) {
        this.skipNetCheckHB = z10;
    }

    public final void setSkipNetworkValidationFeatureEnabled(boolean z10) {
        this.skipNetworkValidationFeatureEnabled = z10;
    }

    public final void setTimeouts(@NotNull TimeoutConfigurations timeoutConfigurations) {
        p.k(timeoutConfigurations, "<set-?>");
        this.timeouts = timeoutConfigurations;
    }

    public final void setUrl(@NotNull String str) {
        p.k(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(@NotNull VastVideoConfig vastVideoConfig) {
        p.k(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(@NotNull ViewabilityConfig viewabilityConfig) {
        p.k(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(@NotNull WebAssetCacheConfig webAssetCacheConfig) {
        p.k(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }
}
