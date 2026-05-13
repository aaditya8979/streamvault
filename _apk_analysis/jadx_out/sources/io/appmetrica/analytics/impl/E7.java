package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class E7 implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f65176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f65177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f65178c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f65180e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f65183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f65184i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f65186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C5241xi f65187l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f65179d = Boolean.FALSE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f65181f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f65182g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public List<String> f65185j = new ArrayList();

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f65186k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (mo.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (mo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (mo.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (mo.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (mo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (mo.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (mo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (mo.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (mo.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (mo.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (mo.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (mo.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (mo.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (mo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (mo.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (mo.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (mo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (mo.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f65181f;
        if (!mo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!mo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f65182g;
        if (!mo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!mo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!mo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f65177b;
        if (appMetricaConfig.locationTracking == null && mo.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f65176a;
        if (appMetricaConfig.location == null && mo.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f65180e;
        if (appMetricaConfig.dataSendingEnabled == null && mo.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!mo.a(appMetricaConfig.userProfileID) && mo.a(this.f65184i)) {
            builderNewConfigBuilder.withUserProfileID(this.f65184i);
        }
        Boolean bool3 = this.f65178c;
        if (appMetricaConfig.advIdentifiersTracking == null && mo.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f65186k = true;
        this.f65176a = null;
        this.f65177b = null;
        this.f65178c = null;
        this.f65179d = Boolean.FALSE;
        this.f65180e = null;
        this.f65181f.clear();
        this.f65182g.clear();
        this.f65183h = false;
        this.f65184i = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@Nullable Location location) {
        this.f65176a = location;
    }

    public final void a(C5241xi c5241xi) {
        Boolean bool = this.f65177b;
        if (bool != null || this.f65180e != null || this.f65178c != null) {
            c5241xi.a(bool, this.f65180e, this.f65178c, this.f65179d);
        }
        this.f65187l = c5241xi;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f65185j.add(str);
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        this.f65182g.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f65177b = boolValueOf;
        C5241xi c5241xi = this.f65187l;
        if (c5241xi != null) {
            c5241xi.a(boolValueOf, this.f65180e, this.f65178c, this.f65179d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10, boolean z11) {
        boolean z12 = this.f65178c == null;
        boolean zBooleanValue = true ^ this.f65179d.booleanValue();
        if (z11 || z12 || zBooleanValue) {
            this.f65178c = Boolean.valueOf(z10);
            Boolean boolValueOf = Boolean.valueOf(z11);
            this.f65179d = boolValueOf;
            C5241xi c5241xi = this.f65187l;
            if (c5241xi != null) {
                c5241xi.a(this.f65177b, this.f65180e, this.f65178c, boolValueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void clearAppEnvironment() {
        this.f65183h = true;
        this.f65181f.clear();
    }

    public final C4924l0 j() {
        return new C4924l0(this.f65185j, this.f65183h);
    }

    public final Location k() {
        return this.f65176a;
    }

    public final Boolean l() {
        return this.f65178c;
    }

    public final Boolean m() {
        return this.f65180e;
    }

    public final Boolean n() {
        return this.f65177b;
    }

    public final boolean o() {
        return this.f65183h;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f65181f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setDataSendingEnabled(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f65180e = boolValueOf;
        C5241xi c5241xi = this.f65187l;
        if (c5241xi != null) {
            c5241xi.a(this.f65177b, boolValueOf, this.f65178c, this.f65179d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setUserProfileID(@Nullable String str) {
        this.f65184i = str;
    }
}
