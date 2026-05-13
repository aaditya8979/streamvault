package io.appmetrica.analytics;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C4821h0;
import io.appmetrica.analytics.impl.C5004o5;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.Fn;
import io.appmetrica.analytics.impl.H3;
import io.appmetrica.analytics.impl.mo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @Nullable
    public final Boolean advIdentifiersTracking;

    @Nullable
    public final Boolean anrMonitoring;

    @Nullable
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;

    @Nullable
    public final Integer appBuildNumber;

    @Nullable
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean appOpenTrackingEnabled;

    @Nullable
    public final String appVersion;

    @Nullable
    public final Boolean crashReporting;

    @Nullable
    public final ICrashTransformer crashTransformer;

    @Nullable
    public final List<String> customHosts;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final String deviceType;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Map<String, String> errorEnvironment;

    @Nullable
    public final Boolean firstActivationAsUpdate;

    @Nullable
    public final Location location;

    @Nullable
    public final Boolean locationTracking;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Boolean nativeCrashReporting;

    @Nullable
    public final PreloadInfo preloadInfo;

    @Nullable
    public final Boolean revenueAutoTrackingEnabled;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;

    @Nullable
    public final String userProfileID;

    public static class Builder {
        private static final Fn D = new Fn(new C4821h0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5004o5 f64340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f64341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f64342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f64343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f64344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f64345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Location f64346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f64347h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f64348i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f64349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private PreloadInfo f64350k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f64351l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Boolean f64352m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f64353n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f64354o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f64355p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Boolean f64356q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f64357r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f64358s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f64359t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f64360u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f64361v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f64362w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f64363x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ICrashTransformer f64364y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f64365z;

        private Builder(String str) {
            this.f64354o = new LinkedHashMap();
            this.f64363x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f64340a = new C5004o5(str);
            this.f64341b = str;
        }

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z10) {
            this.f64351l = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f64348i = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z10) {
            this.f64365z = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i10) {
            this.A = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f64360u = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f64363x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z10) {
            this.f64358s = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f64342c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z10) {
            this.f64344e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.f64364y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f64352m = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String str) {
            this.f64359t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f64361v = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f64354o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f64346g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z10) {
            this.f64347h = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f64349j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f64362w = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f64353n = Integer.valueOf(this.f64340a.a(i10));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z10) {
            this.f64345f = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f64350k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z10) {
            this.f64356q = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f64343d = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z10) {
            this.f64357r = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f64355p = str;
            return this;
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f64341b;
        this.appVersion = builder.f64342c;
        this.sessionTimeout = builder.f64343d;
        this.crashReporting = builder.f64344e;
        this.nativeCrashReporting = builder.f64345f;
        this.location = builder.f64346g;
        this.locationTracking = builder.f64347h;
        this.advIdentifiersTracking = builder.f64348i;
        this.logs = builder.f64349j;
        this.preloadInfo = builder.f64350k;
        this.firstActivationAsUpdate = builder.f64351l;
        this.dataSendingEnabled = builder.f64352m;
        this.maxReportsInDatabaseCount = builder.f64353n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f64354o);
        this.userProfileID = builder.f64355p;
        this.revenueAutoTrackingEnabled = builder.f64356q;
        this.sessionsAutoTrackingEnabled = builder.f64357r;
        this.appOpenTrackingEnabled = builder.f64358s;
        this.deviceType = builder.f64359t;
        this.appBuildNumber = builder.f64360u;
        this.dispatchPeriodSeconds = builder.f64361v;
        this.maxReportsCount = builder.f64362w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f64363x);
        this.crashTransformer = builder.f64364y;
        this.anrMonitoring = builder.f64365z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i10) {
        this(builder);
    }

    public AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }

    @Nullable
    public static AppMetricaConfig fromJson(String str) {
        Builder builderA = new H3().a(str);
        if (builderA == null) {
            return null;
        }
        return builderA.build();
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new D7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", H3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                    string = null;
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!mo.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }
}
