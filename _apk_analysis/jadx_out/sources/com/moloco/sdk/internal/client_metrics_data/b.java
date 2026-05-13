package com.moloco.sdk.internal.client_metrics_data;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ b[] f45941a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ kn.a f45943b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final String f45968c0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f45940a = new b("SDKInitAttempt", 0, "sdk_init_attempt");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45942b = new b("SDKInitSuccess", 1, "sdk_init_success");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f45944c = new b("SDKInitFailure", 2, "sdk_init_failure");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f45945d = new b("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f45946e = new b("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f45947f = new b("SDKInitCacheRead", 5, "sdk_init_cache_read");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f45948g = new b("SDKInitCacheWrite", 6, "sdk_init_cache_write");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f45949h = new b("SDKInitCacheClear", 7, "sdk_init_cache_clear");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f45950i = new b("SDKInitFailureDifferentAppKey", 8, "sdk_init_failure_different_app_key");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f45951j = new b("CreateAd", 9, "create_ad");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f45952k = new b("LoadAdAttempt", 10, "load_ad_attempted");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f45953l = new b("LoadAdSuccess", 11, "load_ad_success");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f45954m = new b("LoadAdFailed", 12, "load_ad_failed");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f45955n = new b("NativeAdLoadAdAttempted", 13, "native_ad_load_attempted");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f45956o = new b("NativeLoadAd", 14, "native_ad_load");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f45957p = new b("BidTokenGetRequest", 15, "bid_token_get_request");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f45958q = new b("BidTokenGetResponse", 16, "bid_token_get_response");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f45959r = new b("BidTokenFetch", 17, "bid_token_fetch");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f45960s = new b("BidTokenDurationTimeoutOneSecond", 18, "bid_token_duration_crossed_1s");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f45961t = new b("BidTokenDurationTimeoutThreeSecond", 19, "bid_token_duration_crossed_3s");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f45962u = new b("ServerBidTokenFetch", 20, "sbt_fetch");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f45963v = new b("ServerBidTokenCached", 21, "sbt_cached");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f45964w = new b("ServerBidTokenApiFetch", 22, "sbt_api_fetch");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f45965x = new b("ServerBidTokenAsyncRefresh", 23, "sbt_async_fetch");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f45966y = new b("ClientBidTokenBuild", 24, "bid_token_build");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f45967z = new b("ClientBidTokenCached", 25, "cbt_cached");
    public static final b A = new b("ShowAdAttempt", 26, "show_ad_attempted");
    public static final b B = new b("ShowAdSuccess", 27, "show_ad_success");
    public static final b C = new b("ShowAdFailed", 28, "show_ad_failed");
    public static final b D = new b("AdClicked", 29, "ad_clicked");
    public static final b E = new b("AdClickedDeduped", 30, "ad_clicked_deduped");
    public static final b F = new b("CrashDetected", 31, "crash_detected");
    public static final b G = new b("WebviewLoadAd", 32, "webview_load_ad");
    public static final b H = new b("WebviewHtmlAdError", 33, "webview_html_ad_error");
    public static final b I = new b("WebviewHtmlAdRetryAttempt", 34, "webview_html_ad_retry_attempt");
    public static final b J = new b("WebviewHtmlAdIgnoredError", 35, "webview_html_ad_ignored_error");
    public static final b K = new b("WebviewEventHandled", 36, "webview_event_handled");
    public static final b L = new b("WebviewEventMultipleHandlers", 37, "webview_event_multiple_handlers");
    public static final b M = new b("WebviewPageLoadStart", 38, "webview_page_load_start");
    public static final b N = new b("WebviewPageLoadEnd", 39, "webview_page_load_end");
    public static final b O = new b("WebviewPageLoadFinishCallback", 40, "webview_page_load_finish_callback");
    public static final b P = new b("WebviewRequiredContentLoaded", 41, "webview_required_content_loaded");
    public static final b Q = new b("StoreLaunchStarted", 42, "store_launch_started");
    public static final b R = new b("StoreLaunchComplete", 43, "store_launch_complete");
    public static final b S = new b("TemplateBridgeNotifyReadyInvoked", 44, "template_bridge_notify_ready_invoked");
    public static final b T = new b("TemplateBridgeNotifyReadyCompleted", 45, "template_bridge_notify_ready_completed");
    public static final b U = new b("TemplateBridgeViewVisibleInvoked", 46, "template_bridge_view_visible_invoked");
    public static final b V = new b("TemplateBridgeViewVisibleCompleted", 47, "template_bridge_view_visible_completed");
    public static final b W = new b("FullscreenWebviewActivityOnCreate", 48, "fullscreen_webview_activity_create");
    public static final b X = new b("RewardIssued", 49, "reward_issued");
    public static final b Y = new b("UnknownCreativeType", 50, "unknown_creative_type");
    public static final b Z = new b("WebViewNotAvailable", 51, "webview_not_available");

    static {
        b[] bVarArrA = a();
        f45941a0 = bVarArrA;
        f45943b0 = kotlin.enums.a.a(bVarArrA);
    }

    public b(String str, int i10, String str2) {
        this.f45968c0 = str2;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f45940a, f45942b, f45944c, f45945d, f45946e, f45947f, f45948g, f45949h, f45950i, f45951j, f45952k, f45953l, f45954m, f45955n, f45956o, f45957p, f45958q, f45959r, f45960s, f45961t, f45962u, f45963v, f45964w, f45965x, f45966y, f45967z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
    }

    @NotNull
    public static kn.a<b> b() {
        return f45943b0;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45941a0.clone();
    }

    @NotNull
    public final String c() {
        return this.f45968c0;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f45968c0;
    }
}
