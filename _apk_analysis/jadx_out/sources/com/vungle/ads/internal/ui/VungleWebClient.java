package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import bo.a0;
import bo.d0;
import bo.z;
import cn.f0;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3978d4;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import xo.b0;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u009f\u00012\u00020\u00012\u00020\u0002:\u0004\u009f\u0001 \u0001BE\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002J8\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J/\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e0 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0017J\u001c\u0010%\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0016\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\bJ\u0010\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00102\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0016J\u0012\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000103H\u0016J*\u0010:\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0017J&\u0010<\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010;\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010:\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010>\u001a\u0004\u0018\u00010=H\u0016J\u001c\u0010A\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u0004\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR(\u0010S\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010Z\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010[\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010Z\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010b\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bb\u0010\\\u0012\u0004\be\u0010Z\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R*\u0010f\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010\\\u0012\u0004\bi\u0010Z\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R*\u0010j\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010\\\u0012\u0004\bm\u0010Z\u001a\u0004\bk\u0010^\"\u0004\bl\u0010`R*\u0010n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010Z\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010u\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bu\u0010T\u0012\u0004\bx\u0010Z\u001a\u0004\bv\u0010V\"\u0004\bw\u0010XR*\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010y\u0012\u0004\b~\u0010Z\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R/\u00101\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0004\b1\u0010\u007f\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R0\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b4\u0010\u008a\u0001\u0012\u0005\b\u008f\u0001\u0010Z\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R0\u0010.\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b.\u0010\u0090\u0001\u0012\u0005\b\u0095\u0001\u0010Z\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "", "errorMsg", "url", "", "didCrash", "Lbn/r;", "handleWebViewError", "isCriticalAsset", "Landroid/webkit/WebView;", "webView", "injectJs", "runJavascriptOnWebView", "collectedConsent", "title", "message", "accept", "deny", "setConsentStatus", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "mraidDelegate", "setMraidDelegate", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/webkit/WebResourceRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "rangeHeader", "", "contentLength", "Lkotlin/Pair;", "parseRange$vungle_ads_release", "(Ljava/lang/String;J)Lkotlin/Pair;", "parseRange", "shouldOverrideUrlLoading", "onPageFinished", "skipCmdQueue", "notifyPropertiesChange", "availableDiskSize", "appFolderSize", "notifyDiskAvailableSize", "silentModeEnabled", "notifySilentModeChange", "notifyPresentAppStoreFailed", C3978d4.i.f31353o, "setAdVisibility", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "errorHandler", "setErrorHandler", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "webViewObserver", "setWebViewObserver", "", IronSourceConstants.EVENTS_ERROR_CODE, UnifiedMediationParams.KEY_DESCRIPTION, "failingUrl", "onReceivedError", "errorResponse", "onReceivedHttpError", "Landroid/webkit/WebResourceError;", "error", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "Ljava/util/concurrent/ExecutorService;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "Ljava/lang/Long;", "collectConsent", "Z", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "getCollectConsent$vungle_ads_release$annotations", "()V", "gdprTitle", "Ljava/lang/String;", "getGdprTitle$vungle_ads_release", "()Ljava/lang/String;", "setGdprTitle$vungle_ads_release", "(Ljava/lang/String;)V", "getGdprTitle$vungle_ads_release$annotations", "gdprBody", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "getGdprBody$vungle_ads_release$annotations", "gdprAccept", "getGdprAccept$vungle_ads_release", "setGdprAccept$vungle_ads_release", "getGdprAccept$vungle_ads_release$annotations", "gdprDeny", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "getGdprDeny$vungle_ads_release$annotations", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "getLoadedWebView$vungle_ads_release$annotations", C3978d4.i.f31361s, "getReady$vungle_ads_release", "setReady$vungle_ads_release", "getReady$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "getMraidDelegate$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "getErrorHandler$vungle_ads_release$annotations", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$vungle_ads_release", "()Landroid/os/Handler;", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "getWebViewObserver$vungle_ads_release$annotations", "Ljava/lang/Boolean;", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "isViewable$vungle_ads_release$annotations", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadErrorMetric", "Lcom/vungle/ads/SingleValueMetric;", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "<init>", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", VastTagName.COMPANION, "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleWebClient extends WebViewClient implements WebViewAPI {

    @NotNull
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";

    @NotNull
    private static final String TAG = "VungleWebClient";

    @NotNull
    private final AdPayload advertisement;
    private boolean collectConsent;

    @Nullable
    private final PreloadDelegate delegate;

    @Nullable
    private WebViewAPI.WebClientErrorHandler errorHandler;

    @Nullable
    private String gdprAccept;

    @Nullable
    private String gdprBody;

    @Nullable
    private String gdprDeny;

    @Nullable
    private String gdprTitle;

    @NotNull
    private final Handler handler;

    @Nullable
    private Boolean isViewable;

    @Nullable
    private final Long loadDuration;

    @Nullable
    private WebView loadedWebView;

    @Nullable
    private WebViewAPI.MraidDelegate mraidDelegate;

    @NotNull
    private final ExecutorService offloadExecutor;

    @NotNull
    private final OneShotSingleValueMetric partialDownloadErrorMetric;

    @NotNull
    private final OneShotSingleValueMetric partialDownloadMetric;

    @NotNull
    private final Placement placement;

    @Nullable
    private final Platform platform;
    private boolean ready;

    @NotNull
    private final SingleValueMetric skippedUrlMetric;

    @Nullable
    private WebViewObserver webViewObserver;

    /* JADX INFO: compiled from: VungleWebClient.kt */
    @RequiresApi(29)
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "Lbn/r;", "onRenderProcessUnresponsive", "onRenderProcessResponsive", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "<init>", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {

        @Nullable
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(@Nullable WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessResponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            p.k(webView, "webView");
        }

        public void onRenderProcessUnresponsive(@NotNull final WebView webView, @Nullable final WebViewRenderProcess webViewRenderProcess) {
            p.k(webView, "webView");
            Logger.INSTANCE.w(VungleWebClient.TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onRenderProcessUnresponsive(Title = ");
                    sb2.append(webView.getTitle());
                    sb2.append(", URL = ");
                    sb2.append(webView.getOriginalUrl());
                    sb2.append(", (webViewRenderProcess != null) = ");
                    sb2.append(webViewRenderProcess != null);
                    return sb2.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public VungleWebClient(@NotNull AdPayload adPayload, @NotNull Placement placement, @NotNull ExecutorService executorService, @Nullable Platform platform, @Nullable PreloadDelegate preloadDelegate, @Nullable Long l10) {
        p.k(adPayload, "advertisement");
        p.k(placement, "placement");
        p.k(executorService, "offloadExecutor");
        this.advertisement = adPayload;
        this.placement = placement;
        this.offloadExecutor = executorService;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l10;
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l10, int i10, tn.i iVar) {
        this(adPayload, placement, executorService, (i10 & 8) != 0 ? null : platform, (i10 & 16) != 0 ? null : preloadDelegate, (i10 & 32) != 0 ? null : l10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m7353notifyPropertiesChange$lambda25(boolean z10, final VungleWebClient vungleWebClient) {
        p.k(vungleWebClient, "this$0");
        b0 b0Var = new b0();
        xo.h.d(b0Var, "placementType", vungleWebClient.advertisement.templateType());
        Boolean bool = vungleWebClient.isViewable;
        if (bool != null) {
            xo.h.b(b0Var, C3978d4.i.f31353o, Boolean.valueOf(bool.booleanValue()));
        }
        xo.h.d(b0Var, Q6.F, "android");
        xo.h.d(b0Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        xo.h.b(b0Var, "incentivized", Boolean.valueOf(vungleWebClient.placement.isRewardedVideo()));
        Platform platform = vungleWebClient.platform;
        if (platform != null) {
            xo.h.b(b0Var, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l10 = vungleWebClient.loadDuration;
        if (l10 != null) {
            l10.longValue();
            xo.h.c(b0Var, "timeLoaded", vungleWebClient.loadDuration);
        }
        if (vungleWebClient.collectConsent) {
            xo.h.b(b0Var, "consentRequired", Boolean.TRUE);
            xo.h.d(b0Var, "consentTitleText", vungleWebClient.gdprTitle);
            xo.h.d(b0Var, "consentBodyText", vungleWebClient.gdprBody);
            xo.h.d(b0Var, "consentAcceptButtonText", vungleWebClient.gdprAccept);
            xo.h.d(b0Var, "consentDenyButtonText", vungleWebClient.gdprDeny);
        } else {
            xo.h.b(b0Var, "consentRequired", Boolean.FALSE);
        }
        xo.h.d(b0Var, "sdkVersion", BuildConfig.VERSION_NAME);
        final String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + b0Var.a() + ',' + z10 + ')';
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7354notifyPropertiesChange$lambda25$lambda24(this.f53643b, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m7354notifyPropertiesChange$lambda25$lambda24(VungleWebClient vungleWebClient, String str) {
        p.k(vungleWebClient, "this$0");
        p.k(str, "$injectJs");
        WebView webView = vungleWebClient.loadedWebView;
        if (webView != null) {
            vungleWebClient.runJavascriptOnWebView(webView, str);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, final String str) {
        try {
            Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final String invoke() {
                    return "mraid Injecting JS " + str;
                }
            });
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Throwable th2) {
            new EvaluateJsError("Evaluate js failed " + th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m7355shouldOverrideUrlLoading$lambda16$lambda10(final VungleWebClient vungleWebClient, final WebView webView) {
        p.k(vungleWebClient, "this$0");
        PreloadDelegate preloadDelegate = vungleWebClient.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7356shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f53652b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m7356shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient vungleWebClient, WebView webView) {
        p.k(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m7357shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient vungleWebClient, WebView webView) {
        p.k(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m7358shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate mraidDelegate, String str, JsonObject jsonObject, final VungleWebClient vungleWebClient, final WebView webView) {
        p.k(mraidDelegate, "$it");
        p.k(str, "$command");
        p.k(jsonObject, "$args");
        p.k(vungleWebClient, "this$0");
        if (mraidDelegate.processCommand(str, jsonObject)) {
            vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m7359shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f53636b, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m7359shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient vungleWebClient, WebView webView) {
        p.k(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m7360shouldOverrideUrlLoading$lambda16$lambda6(final VungleWebClient vungleWebClient, final WebView webView) {
        p.k(vungleWebClient, "this$0");
        final String str = "window.vungle.mraidBridge.notifyReadyEvent(" + vungleWebClient.advertisement.createMRAIDArgs() + ')';
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7361shouldOverrideUrlLoading$lambda16$lambda6$lambda5(this.f53647b, webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m7361shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient vungleWebClient, WebView webView, String str) {
        p.k(vungleWebClient, "this$0");
        p.k(str, "$injectJs");
        vungleWebClient.runJavascriptOnWebView(webView, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m7362shouldOverrideUrlLoading$lambda16$lambda8(final VungleWebClient vungleWebClient, final WebView webView) {
        p.k(vungleWebClient, "this$0");
        PreloadDelegate preloadDelegate = vungleWebClient.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7363shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f53645b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m7363shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient vungleWebClient, WebView webView) {
        p.k(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: getHandler$vungle_ads_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    @Nullable
    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    @Nullable
    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    @Nullable
    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j10 + '-' + j11 + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean z10) {
        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7353notifyPropertiesChange$lambda25(z10, this);
            }
        });
    }

    public final void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            b0 b0Var = new b0();
            xo.h.b(b0Var, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + b0Var.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53130d, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53130d, webView, str);
        safedk_VungleWebClient_onPageFinished_d298b859bb4101fde140002b07454561(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, int i10, @NotNull String str, @NotNull String str2) {
        p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        p.k(str2, "failingUrl");
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z10);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable final WebView view, @Nullable final RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onRenderProcessGone url: ");
                    WebView webView = view;
                    sb2.append(webView != null ? webView.getUrl() : null);
                    return sb2.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, Boolean.TRUE);
            }
            return true;
        }
        Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onRenderProcessGone url: ");
                WebView webView = view;
                sb2.append(webView != null ? webView.getUrl() : null);
                sb2.append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail = detail;
                sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                return sb2.toString();
            }
        });
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    @NotNull
    public final Pair<Long, Long> parseRange$vungle_ads_release(@Nullable String rangeHeader, long contentLength) {
        Object objM7534constructorimpl;
        Pair pair;
        try {
            Result.a aVar = Result.Companion;
            if (rangeHeader != null && a0.W(rangeHeader, "bytes=", false, 2, null)) {
                List listU0 = d0.U0(d0.L0(rangeHeader, "bytes="), new String[]{"-"}, false, 0, 6, null);
                String str = (String) f0.w0(listU0, 0);
                Long lT = str != null ? z.t(str) : null;
                String str2 = (String) f0.w0(listU0, 1);
                Long lT2 = str2 != null ? z.t(str2) : null;
                if (lT == null) {
                    if (lT2 == null) {
                        lT = 0L;
                    } else {
                        lT = Long.valueOf(contentLength - lT2.longValue());
                        lT2 = null;
                    }
                }
                pair = new Pair(lT, lT2);
            } else {
                pair = new Pair(0L, null);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(pair);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            objM7534constructorimpl = new Pair(0L, null);
        }
        return (Pair) objM7534constructorimpl;
    }

    public void safedk_VungleWebClient_onPageFinished_d298b859bb4101fde140002b07454561(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onPageFinished.1
            @Override // sn.a
            @NotNull
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Nullable
    public WebResourceResponse safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null || (scheme = url.getScheme()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        p.j(locale, NativeAdContent.ViewTag.ROOT);
        String lowerCase = scheme.toLowerCase(locale);
        p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        if (!p.f(lowerCase, "http") && !p.f(lowerCase, "https")) {
            return null;
        }
        if (!this.advertisement.isPartialDownloadEnabled()) {
            Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.1
                @Override // sn.a
                @NotNull
                public final String invoke() {
                    return "shouldInterceptRequest called but partial download is disabled.";
                }
            });
            return null;
        }
        String string = url.toString();
        p.j(string, "uri.toString()");
        AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
        String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
        if (localPath == null || localPath.length() == 0) {
            return null;
        }
        File file = new File(localPath);
        if (!file.exists()) {
            return null;
        }
        long contentLength = localPartialDownloadAssets.getContentLength();
        if (contentLength <= 0) {
            return null;
        }
        long length = file.length();
        final String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
        this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
        Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
        localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.getFirst().longValue());
        localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.getSecond());
        long jLongValue = range$vungle_ads_release.component1().longValue();
        Long lComponent2 = range$vungle_ads_release.component2();
        long j10 = length - jLongValue;
        Logger.Companion companion = Logger.INSTANCE;
        companion.i(TAG, ">>request: " + str + " rangeStart=" + jLongValue + " rangeEnd=" + lComponent2 + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
        if (j10 <= 0) {
            companion.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final String invoke() {
                    return "Requested range exceeds cached file: " + str;
                }
            });
            localPartialDownloadAssets.waitForDownload();
            length = file.length();
        }
        long jLongValue2 = lComponent2 != null ? lComponent2.longValue() : length - 1;
        long j11 = (jLongValue2 - jLongValue) + 1;
        try {
            Result.a aVar = Result.Companion;
            WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", "UTF-8", 206, "Partial Content", kotlin.collections.a.m(bn.h.a("Content-Type", "video/mp4"), bn.h.a("Accept-Ranges", "bytes"), bn.h.a("Content-Length", String.valueOf(j11)), bn.h.a("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(new FileInputStream(file), 1024));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<<Return:");
            sb2.append(webResourceResponse.getResponseHeaders());
            companion.i(TAG, sb2.toString());
            return webResourceResponse;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(Result.m7534constructorimpl(kotlin.c.a(th2)));
            if (thM7537exceptionOrNullimpl != null) {
                Logger.INSTANCE.e(TAG, "Error serving local range video: " + thM7537exceptionOrNullimpl.getMessage(), thM7537exceptionOrNullimpl);
                this.partialDownloadErrorMetric.setMeta(string + ' ' + thM7537exceptionOrNullimpl.getMessage());
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[Catch: all -> 0x0167, TryCatch #0 {all -> 0x0167, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00c3, B:52:0x00d0, B:54:0x00d6, B:55:0x00e9, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x010c, B:57:0x00fb, B:59:0x0103, B:64:0x013b, B:66:0x0153), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(final android.webkit.WebView r14, final java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ui.VungleWebClient.safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(@NotNull WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        p.k(webClientErrorHandler, "errorHandler");
        this.errorHandler = webClientErrorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(@Nullable WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(@Nullable String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(@Nullable String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(@Nullable String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(@Nullable String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(@Nullable WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(@Nullable WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(@Nullable WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(@Nullable Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53130d, view, request, safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(view, request));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53130d, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb = safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53130d, view, url, zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb);
        return zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb;
    }
}
