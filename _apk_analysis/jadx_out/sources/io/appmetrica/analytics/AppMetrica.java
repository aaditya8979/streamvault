package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC5174v1;
import io.appmetrica.analytics.impl.C5149u1;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC5174v1.f67799a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC5174v1.f67799a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC5174v1.f67799a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC5174v1.f67799a.a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return AbstractC5174v1.f67799a.b();
    }

    public static int getLibraryApiLevel() {
        return 116;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.14.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return K0.f65456a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC5174v1.f67799a.a(context, str);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return AbstractC5174v1.f67799a.a(context).f68099id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC5174v1.f67799a.a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        AbstractC5174v1.f67799a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC5174v1.f67799a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC5174v1.f67799a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC5174v1.f67799a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC5174v1.f67799a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC5174v1.f67799a.a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC5174v1.f67799a.b(activity);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC5174v1.f67799a.a(intent);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC5174v1.f67799a.a(str);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC5174v1.f67799a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        AbstractC5174v1.f67799a.a(str, str2, (Throwable) null);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        AbstractC5174v1.f67799a.a(str, str2, th2);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th2) {
        AbstractC5174v1.f67799a.a(str, th2);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC5174v1.f67799a.b(str);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        AbstractC5174v1.f67799a.c(str, str2);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        AbstractC5174v1.f67799a.a(str, map);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC5174v1.f67799a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC5174v1.f67799a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC5174v1.f67799a.d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC5174v1.f67799a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th2) {
        AbstractC5174v1.f67799a.a(th2);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC5174v1.f67799a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC5174v1.f67799a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC5174v1.f67799a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C5149u1 c5149u1 = AbstractC5174v1.f67799a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c5149u1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(@Nullable Activity activity) {
        AbstractC5174v1.f67799a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC5174v1.f67799a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        AbstractC5174v1.f67799a.a(z10);
    }

    public static void setDataSendingEnabled(boolean z10) {
        AbstractC5174v1.f67799a.b(z10);
    }

    public static void setLocation(@Nullable Location location) {
        AbstractC5174v1.f67799a.a(location);
    }

    public static void setLocationTracking(boolean z10) {
        AbstractC5174v1.f67799a.c(z10);
    }

    public static void setUserProfileID(@Nullable String str) {
        AbstractC5174v1.f67799a.e(str);
    }
}
