package com.moloco.sdk.internal.client_metrics_data;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f45979b = new e("SDKInit", 0, "sdk_init_time");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f45980c = new e("SDKPerformInitAttempt", 1, "sdk_perform_init_time_ms");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f45981d = new e("SDKInitHttpRequest", 2, "sdk_init_request_time_ms");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f45982e = new e("SDKInitCacheRead", 3, "sdk_init_cache_read_time_ms");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f45983f = new e("SDKInitCacheWrite", 4, "sdk_init_cache_write_time_ms");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f45984g = new e("SDKInitCacheClear", 5, "sdk_init_cache_clear_time_ms");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f45985h = new e("CreateAd", 6, "create_ad_time_ms");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f45986i = new e("CreateAdAwaitAdFactory", 7, "create_ad_await_ad_factory_time_ms");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f45987j = new e("LoadAd", 8, "load_ad_time");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f45988k = new e("NativePrepareAd", 9, "native_ad_load_prepare_time");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f45989l = new e("BidTokenFetch", 10, "bid_token_fetch_time");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f45990m = new e("ServerBidTokenFetch", 11, "sbt_fetch_time_ms");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f45991n = new e("ServerBidTokenApiFetchTime", 12, "sbt_api_fetch_time_ms");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f45992o = new e("ClientBidTokenBuild", 13, "bid_token_build_time_ms");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f45993p = new e("LoadToShow", 14, "load_to_show_time");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f45994q = new e("CreateToLoad", 15, "ad_create_to_load_ms");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f45995r = new e("WebviewLoadAd", 16, "webview_load_ad_ms");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f45996s = new e("WebviewEventHandled", 17, "webview_event_handled_time_ms");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f45997t = new e("WebviewEventHandlerLatency", 18, "webview_event_handler_latency_ms");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f45998u = new e("WebviewPageLoadLatency", 19, "webview_page_load_ms");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f45999v = new e("WebviewRequiredContentLoadLatency", 20, "webview_required_content_load_ms");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e[] f46000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46001x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46002a;

    static {
        e[] eVarArrA = a();
        f46000w = eVarArrA;
        f46001x = kotlin.enums.a.a(eVarArrA);
    }

    public e(String str, int i10, String str2) {
        this.f46002a = str2;
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{f45979b, f45980c, f45981d, f45982e, f45983f, f45984g, f45985h, f45986i, f45987j, f45988k, f45989l, f45990m, f45991n, f45992o, f45993p, f45994q, f45995r, f45996s, f45997t, f45998u, f45999v};
    }

    @NotNull
    public static kn.a<e> b() {
        return f46001x;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f46000w.clone();
    }

    @NotNull
    public final String c() {
        return this.f46002a;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f46002a;
    }
}
