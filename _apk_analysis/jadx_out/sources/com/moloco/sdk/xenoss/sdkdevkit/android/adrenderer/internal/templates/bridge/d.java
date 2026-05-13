package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f48632c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48633d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebView f48634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48635b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(@NotNull WebView webView, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        p.k(webView, "webView");
        p.k(aVar, "metricsRecorder");
        this.f48634a = webView;
        this.f48635b = aVar;
    }

    public static final void b(d dVar, String str) {
        dVar.f48635b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.T.c()).e("attached", String.valueOf(dVar.f48634a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "notifyReadyEvent call completed, result: " + str, null, false, 12, null);
    }

    public static final void c(d dVar, boolean z10, String str) {
        dVar.f48635b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.V.c()).e("viewable", String.valueOf(z10)).e("attached", String.valueOf(dVar.f48634a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "setIsViewable call completed, result: " + str, null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        this.f48635b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.S.c()).e("attached", String.valueOf(this.f48634a.isAttachedToWindow())));
        this.f48634a.evaluateJavascript("notifyReadyEvent()", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.b(this.f48629a, (String) obj);
            }
        });
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a(final boolean z10) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "viewVisible: " + z10 + " called, invoking setIsViewable in WebView", null, false, 12, null);
        this.f48635b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.U.c()).e("viewable", String.valueOf(z10)).e("attached", String.valueOf(this.f48634a.isAttachedToWindow())));
        this.f48634a.evaluateJavascript("setIsViewable(" + z10 + ')', new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.c(this.f48630a, z10, (String) obj);
            }
        });
    }
}
