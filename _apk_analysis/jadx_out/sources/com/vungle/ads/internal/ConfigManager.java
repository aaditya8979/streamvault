package com.vungle.ads.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import bn.g;
import bn.r;
import bo.a0;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.t;
import tn.p;
import xo.u;

/* JADX INFO: compiled from: ConfigManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bi\u0010SJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002J\u0006\u0010!\u001a\u00020\u0002J\b\u0010\"\u001a\u0004\u0018\u00010\u0002J\b\u0010#\u001a\u0004\u0018\u00010\u0002J\b\u0010$\u001a\u0004\u0018\u00010\u0002J\b\u0010%\u001a\u0004\u0018\u00010\u0002J\b\u0010&\u001a\u0004\u0018\u00010\u0002J\u0006\u0010'\u001a\u00020\u0002J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010*\u001a\u0004\u0018\u00010)J\u0006\u0010+\u001a\u00020\u000bJ\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u0002J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020\u0002J\u0006\u00101\u001a\u00020\u0002J\u0006\u00102\u001a\u00020\u000bJ\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u00020.J\u0006\u00106\u001a\u00020.J\u0006\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020\u000bJ\u0006\u00109\u001a\u00020\u000bJ\u0006\u0010:\u001a\u00020\u000bJ\u0006\u0010;\u001a\u00020\u000bJ\u0006\u0010<\u001a\u00020\u000bJ\u0006\u0010=\u001a\u00020.J\u0019\u0010A\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b?\u0010@J\u0019\u0010D\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\bB\u0010CJ\u001b\u0010I\u001a\u00020\u000b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010EH\u0001¢\u0006\u0004\bG\u0010HJ\u0006\u0010J\u001a\u00020\u000bJ\u0006\u0010K\u001a\u00020.J\u0006\u0010L\u001a\u000203J\u0018\u0010P\u001a\u0004\u0018\u00010\u00142\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u0002J\u0016\u0010Q\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MJ\u000f\u0010T\u001a\u00020\u0004H\u0001¢\u0006\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020.8\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010\\\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0014\u0010]\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010ZR\u0014\u0010^\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010ZR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010`R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010V¨\u0006n²\u0006\f\u0010k\u001a\u00020j8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002²\u0006\f\u0010k\u001a\u00020j8\nX\u008a\u0084\u0002²\u0006\f\u0010m\u001a\u00020l8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "", "applicationId", "Lbn/r;", "setAppId$vungle_ads_release", "(Ljava/lang/String;)V", "setAppId", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lkotlin/Function1;", "", "onComplete", "fetchConfigAsync$vungle_ads_release", "(Landroid/content/Context;Lsn/l;)V", "fetchConfigAsync", "ext", "updateConfigExtension$vungle_ads_release", "(Landroid/content/Context;Ljava/lang/String;)V", "updateConfigExtension", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "fromCachedConfig", "Lcom/vungle/ads/SingleValueMetric;", "metric", "initWithConfig$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/ConfigPayload;ZLcom/vungle/ads/SingleValueMetric;)V", "initWithConfig", "", "Lcom/vungle/ads/internal/model/Placement;", "placements", "id", "getPlacement", "getAdsEndpoint", "getRiEndpoint", "getGDPRConsentMessage", "getGDPRConsentTitle", "getGDPRButtonAccept", "getGDPRButtonDeny", "getGDPRConsentMessageVersion", "getGDPRIsCountryDataProtected", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "getTcfStatus", "shouldDisableAdId", "isReportIncentivizedEnabled", "getConfigExtension", "", "configLastValidatedTimestamp", "getMetricsEndpoint", "getErrorLoggingEndpoint", "getMetricsEnabled", "", "getLogLevel", "getSessionTimeout", "getSignalsSessionTimeout", "rtaDebuggingEnabled", "otEnabled", "signalsDisabled", "fpdEnabled", "retryPriorityTPATs", "allowAutoRedirects", "afterClickDuration", "configPayload", "checkConfigPayload$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload;)I", "checkConfigPayload", "validateConfig$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload;)Z", "validateConfig", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "endpoints", "validateEndpoints$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;)Z", "validateEndpoints", "isCleverCacheEnabled", "getCleverCacheDiskSize", "getCleverCacheDiskPercentage", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "appId", "getCachedConfig", "updateCachedConfig", "clearConfig$vungle_ads_release", "()V", "clearConfig", "TAG", "Ljava/lang/String;", "CONFIG_LAST_VALIDATE_TS_DEFAULT", "J", "DEFAULT_SESSION_TIMEOUT_SECONDS", "I", "DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS", "CONFIG_NOT_AVAILABLE", "CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY", "CONFIG_ALL_DATA", "Lcom/vungle/ads/internal/model/ConfigPayload;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "Ljava/util/List;", "configExt", "Lxo/a;", "json$delegate", "Lbn/g;", "getJson", "()Lxo/a;", "json", "<init>", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;

    @NotNull
    public static final String TAG = "ConfigManager";
    private static String applicationId;

    @Nullable
    private static ConfigPayload config;

    @Nullable
    private static String configExt;

    @Nullable
    private static ConfigPayload.Endpoints endpoints;

    @Nullable
    private static List<Placement> placements;

    @NotNull
    public static final ConfigManager INSTANCE = new ConfigManager();

    /* JADX INFO: renamed from: json$delegate, reason: from kotlin metadata */
    @NotNull
    private static final g json = kotlin.b.a(LazyThreadSafetyMode.SYNCHRONIZED, new sn.a<xo.a>() { // from class: com.vungle.ads.internal.ConfigManager$json$2
        @Override // sn.a
        @NotNull
        public final xo.a invoke() {
            return u.b(null, new l<xo.d, r>() { // from class: com.vungle.ads.internal.ConfigManager$json$2.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(xo.d dVar) {
                    invoke2(dVar);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull xo.d dVar) {
                    p.k(dVar, "$this$Json");
                    dVar.f(true);
                    dVar.d(true);
                    dVar.e(false);
                }
            }, 1, null);
        }
    });

    private ConfigManager() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m7293fetchConfigAsync$lambda0(g<VungleApiClient> gVar) {
        return gVar.getValue();
    }

    private final xo.a getJson() {
        return (xo.a) json.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final FilePreferences m7294initWithConfig$lambda2(g<FilePreferences> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m7295initWithConfig$lambda4(g<VungleApiClient> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final Executors m7296initWithConfig$lambda5(g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z10, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z10, singleValueMetric);
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final FilePreferences m7297updateConfigExtension$lambda1(g<FilePreferences> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.Endpoints endpoints2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final long afterClickDuration() {
        ConfigPayload.AutoRedirect autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    @VisibleForTesting
    public final int checkConfigPayload$vungle_ads_release(@Nullable ConfigPayload configPayload) {
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null) {
            return 0;
        }
        Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
        if (configLastValidatedTimestamp != null && configLastValidatedTimestamp.longValue() == -1) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    @VisibleForTesting
    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(@NotNull final Context context, @NotNull final l<? super Boolean, r> onComplete) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        try {
            Call<ConfigPayload> callConfig = m7293fetchConfigAsync$lambda0(kotlin.b.a(LazyThreadSafetyMode.SYNCHRONIZED, new sn.a<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            })).config();
            if (callConfig != null) {
                callConfig.enqueue(new Callback<ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(@Nullable Call<ConfigPayload> call, @Nullable Throwable th2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error while fetching config: ");
                        sb2.append(th2 != null ? th2.getMessage() : null);
                        new NetworkUnreachable(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(@Nullable Call<ConfigPayload> call, @Nullable Response<ConfigPayload> response) {
                        if (response != null && response.isSuccessful() && response.body() != null) {
                            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                            onComplete.invoke(Boolean.TRUE);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("config API: ");
                        sb2.append(response != null ? Integer.valueOf(response.code()) : null);
                        new APIFailedStatusCodeError(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }
                });
            }
        } catch (Throwable th2) {
            if (th2 instanceof UnknownHostException ? true : th2 instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th2.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th2.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    @NotNull
    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        String str = adsEndpoint == null || adsEndpoint.length() == 0 ? null : adsEndpoint;
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    @Nullable
    public final ConfigPayload getCachedConfig(@NotNull FilePreferences filePreferences, @NotNull String appId) {
        Long refreshTime;
        p.k(filePreferences, "filePreferences");
        p.k(appId, "appId");
        try {
            String string = filePreferences.getString(Cookie.CONFIG_APP_ID);
            if (!(string == null || string.length() == 0) && a0.J(string, appId, true)) {
                String string2 = filePreferences.getString(Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j10 = filePreferences.getLong(Cookie.CONFIG_UPDATE_TIME, 0L);
                xo.a json2 = INSTANCE.getJson();
                KSerializer<Object> kSerializerB = t.b(json2.a(), tn.t.m(ConfigPayload.class));
                p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json2.c(kSerializerB, string2);
                ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j10 < System.currentTimeMillis()) {
                    Logger.INSTANCE.w(TAG, "cache config expired. re-config");
                    return null;
                }
                Logger.INSTANCE.w(TAG, "use cache config.");
                return configPayload;
            }
            Logger.INSTANCE.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Error while parsing cached config: " + e10.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j10 = 1024;
        return diskSize.longValue() * j10 * j10;
    }

    @NotNull
    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        String str = errorLogsEndpoint == null || errorLogsEndpoint.length() == 0 ? null : errorLogsEndpoint;
        return str == null ? Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    @Nullable
    public final String getGDPRButtonAccept() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    @Nullable
    public final String getGDPRButtonDeny() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    @Nullable
    public final String getGDPRConsentMessage() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    @NotNull
    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    @Nullable
    public final String getGDPRConsentTitle() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    @NotNull
    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        String str = metricsEndpoint == null || metricsEndpoint.length() == 0 ? null : metricsEndpoint;
        return str == null ? Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    @Nullable
    public final Placement getPlacement(@Nullable String id2) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (p.f(((Placement) next).getReferenceId(), id2)) {
                obj = next;
                break;
            }
        }
        return (Placement) obj;
    }

    @Nullable
    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? 900 : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    @Nullable
    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion companion = ConfigPayload.IABSettings.TcfStatus.INSTANCE;
        ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(@NotNull final Context context, @Nullable ConfigPayload config2, boolean fromCachedConfig, @Nullable SingleValueMetric metric) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            g gVarA = kotlin.b.a(lazyThreadSafetyMode, new sn.a<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final FilePreferences invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                }
            });
            int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(config2);
            if (iCheckConfigPayload$vungle_ads_release == 0) {
                Logger.INSTANCE.e(TAG, "Config is not available.");
                return;
            }
            if (iCheckConfigPayload$vungle_ads_release == 1) {
                if (!fromCachedConfig && config2 != null) {
                    Long configLastValidatedTimestamp = config2.getConfigLastValidatedTimestamp();
                    long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                    ConfigPayload configPayload = config;
                    if (configPayload != null) {
                        configPayload.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                    }
                    ConfigPayload configPayload2 = config;
                    if (configPayload2 != null) {
                        INSTANCE.updateCachedConfig(configPayload2, m7294initWithConfig$lambda2(gVarA));
                    }
                }
                return;
            }
            config = config2;
            endpoints = config2 != null ? config2.getEndpoints() : null;
            placements = config2 != null ? config2.getPlacements() : null;
            int logLevel = getLogLevel();
            boolean metricsEnabled = getMetricsEnabled();
            g gVarA2 = kotlin.b.a(lazyThreadSafetyMode, new sn.a<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            });
            g gVarA3 = kotlin.b.a(lazyThreadSafetyMode, new sn.a<Executors>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            analyticsClient.initOrUpdate$vungle_ads_release(m7295initWithConfig$lambda4(gVarA2), m7296initWithConfig$lambda5(gVarA3).getLOGGER_EXECUTOR(), logLevel, metricsEnabled);
            if (!fromCachedConfig && config2 != null) {
                updateCachedConfig(config2, m7294initWithConfig$lambda2(gVarA));
                String configExtension = config2.getConfigExtension();
                if (configExtension != null) {
                    INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                }
            }
            if (metric != null) {
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, metric, (LogEntry) null, (String) null, 6, (Object) null);
            }
            PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Error while validating config: " + e10.getMessage());
        }
    }

    public final boolean isCleverCacheEnabled() {
        ConfigPayload.CleverCache cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    @Nullable
    public final List<Placement> placements() {
        return placements;
    }

    public final boolean retryPriorityTPATs() {
        Boolean retryPriorityTPATs;
        ConfigPayload configPayload = config;
        if (configPayload == null || (retryPriorityTPATs = configPayload.getRetryPriorityTPATs()) == null) {
            return false;
        }
        return retryPriorityTPATs.booleanValue();
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(@NotNull String applicationId2) {
        p.k(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(@NotNull ConfigPayload configPayload, @NotNull FilePreferences filePreferences) {
        p.k(configPayload, "config");
        p.k(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                p.C("applicationId");
                str = null;
            }
            filePreferences.put(Cookie.CONFIG_APP_ID, str);
            filePreferences.put(Cookie.CONFIG_UPDATE_TIME, System.currentTimeMillis());
            xo.a json2 = getJson();
            KSerializer<Object> kSerializerB = t.b(json2.a(), tn.t.m(ConfigPayload.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(Cookie.CONFIG_RESPONSE, json2.b(kSerializerB, configPayload));
            filePreferences.apply();
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Exception: " + e10.getMessage() + " for updating cached config");
        }
    }

    @VisibleForTesting
    public final void updateConfigExtension$vungle_ads_release(@NotNull final Context context, @NotNull String ext) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        m7297updateConfigExtension$lambda1(kotlin.b.a(LazyThreadSafetyMode.SYNCHRONIZED, new sn.a<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$updateConfigExtension$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        })).put(Cookie.CONFIG_EXTENSION, ext).apply();
    }

    @VisibleForTesting
    public final boolean validateConfig$vungle_ads_release(@Nullable ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    @VisibleForTesting
    public final boolean validateEndpoints$vungle_ads_release(@Nullable ConfigPayload.Endpoints endpoints2) {
        boolean z10;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint == null || errorLogsEndpoint.length() == 0) {
            Logger.INSTANCE.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z10;
    }
}
