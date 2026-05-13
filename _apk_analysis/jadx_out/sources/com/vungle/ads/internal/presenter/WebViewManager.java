package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import bn.g;
import bn.r;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: WebViewManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JM\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&0%j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager;", "", "", "key", "Lbn/r;", "destroyWebViewInternal", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/model/AdPayload;", "adv", "Lcom/vungle/ads/internal/model/Placement;", "placement", "templatePath", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "webSettings", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "delegate", "", "loadDuration", "preloadWebView$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "preloadWebView", "Landroid/webkit/WebView;", "getOrCreateWebView", "advertisement", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "offloadExecutor", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "getOrCreateWebViewClient", "destroyWebView", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/LinkedHashMap;", "Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "Lkotlin/collections/LinkedHashMap;", "webViewCache", "Ljava/util/LinkedHashMap;", "<init>", "()V", "WebViewEntry", "Lcom/vungle/ads/internal/executor/Executors;", "executors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class WebViewManager {

    @NotNull
    private static final String TAG = "WebViewManager";

    @NotNull
    public static final WebViewManager INSTANCE = new WebViewManager();

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    @NotNull
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: compiled from: WebViewManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "(Landroid/webkit/WebView;Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "getWebView", "()Landroid/webkit/WebView;", "getWebViewClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WebViewEntry {

        @NotNull
        private final WebView webView;

        @NotNull
        private final VungleWebClient webViewClient;

        public WebViewEntry(@NotNull WebView webView, @NotNull VungleWebClient vungleWebClient) {
            p.k(webView, "webView");
            p.k(vungleWebClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = vungleWebClient;
        }

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WebView getWebView() {
            return this.webView;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        @NotNull
        public final WebViewEntry copy(@NotNull WebView webView, @NotNull VungleWebClient webViewClient) {
            p.k(webView, "webView");
            p.k(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) other;
            return p.f(this.webView, webViewEntry.webView) && p.f(this.webViewClient, webViewEntry.webViewClient);
        }

        @NotNull
        public final WebView getWebView() {
            return this.webView;
        }

        @NotNull
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        @NotNull
        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(@NotNull String str) {
        p.k(str, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(str);
            r rVar = r.f5635a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final WebView getOrCreateWebView(@NotNull Context context, @Nullable String key) {
        WebView webView;
        p.k(context, GAMConfig.KEY_CONTEXT);
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(key);
            if (webViewEntry != null) {
                Logger.INSTANCE.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.INSTANCE.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final VungleWebClient getOrCreateWebViewClient(@NotNull AdPayload advertisement, @NotNull Placement placement, @NotNull VungleThreadPoolExecutor offloadExecutor, @NotNull Platform platform) {
        p.k(advertisement, "advertisement");
        p.k(placement, "placement");
        p.k(offloadExecutor, "offloadExecutor");
        p.k(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(@NotNull final Context context, @NotNull final AdPayload adv, @NotNull final Placement placement, @NotNull final String templatePath, @Nullable final AdPayload.WebViewSettings webSettings, @NotNull final PreloadDelegate delegate, @Nullable final Long loadDuration) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(adv, "adv");
        p.k(placement, "placement");
        p.k(templatePath, "templatePath");
        p.k(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            companion.d(TAG, sb2.toString());
            final String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new sn.a<r>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
                    private static final Executors m7338invoke$lambda3$lambda1(g<? extends Executors> gVar) {
                        return gVar.getValue();
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
                    private static final Platform m7339invoke$lambda3$lambda2(g<? extends Platform> gVar) {
                        return gVar.getValue();
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f5635a;
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object objM7534constructorimpl;
                        WebViewManager webViewManager = WebViewManager.INSTANCE;
                        final Context context2 = context;
                        AdPayload adPayload = adv;
                        Placement placement2 = placement;
                        PreloadDelegate preloadDelegate = delegate;
                        Long l10 = loadDuration;
                        String str = templatePath;
                        String str2 = strEventId;
                        AdPayload.WebViewSettings webViewSettings = webSettings;
                        try {
                            Result.a aVar = Result.Companion;
                            WebView webView = new WebView(context2.getApplicationContext());
                            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
                            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement2, m7338invoke$lambda3$lambda1(kotlin.b.a(lazyThreadSafetyMode, new sn.a<Executors>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                                @Override // sn.a
                                @NotNull
                                public final Executors invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Executors.class);
                                }
                            })).getOFFLOAD_EXECUTOR(), m7339invoke$lambda3$lambda2(kotlin.b.a(lazyThreadSafetyMode, new sn.a<Platform>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                                @Override // sn.a
                                @NotNull
                                public final Platform invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Platform.class);
                                }
                            })), preloadDelegate, l10);
                            ConfigManager configManager = ConfigManager.INSTANCE;
                            vungleWebClient.setConsentStatus(configManager.getGDPRIsCountryDataProtected() && p.f("unknown", PrivacyManager.INSTANCE.getConsentStatus()), configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
                            webView.setWebViewClient(vungleWebClient);
                            LiftoffMonetizeNetworkBridge.webviewLoadUrl(webView, str);
                            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.WebViewEntry(webView, vungleWebClient));
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT, WebViewManager.webViewCache.size(), adPayload.getLogEntry(), null, 8, null);
                            objM7534constructorimpl = Result.m7534constructorimpl(Integer.valueOf(Logger.INSTANCE.d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.Companion;
                            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                        }
                        PreloadDelegate preloadDelegate2 = delegate;
                        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
                        if (thM7537exceptionOrNullimpl != null) {
                            Logger.INSTANCE.e("WebViewManager", "Preload webview failed", thM7537exceptionOrNullimpl);
                            preloadDelegate2.onAdReadyToPlay();
                        }
                    }
                });
            }
            r rVar = r.f5635a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
