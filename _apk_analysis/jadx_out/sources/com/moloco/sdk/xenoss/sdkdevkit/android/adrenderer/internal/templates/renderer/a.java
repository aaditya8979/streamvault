package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0625a f48664b = new C0625a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48665c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f48666a;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C0625a {
        public C0625a() {
        }

        public /* synthetic */ C0625a(i iVar) {
            this();
        }
    }

    public a(@NotNull g gVar) {
        p.k(gVar, "eventHandler");
        this.f48666a = gVar;
    }

    @JavascriptInterface
    public final void log(@NotNull String str) {
        p.k(str, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateJavascript", str, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String str) throws JSONException {
        p.k(str, "event");
        this.f48666a.c(str);
    }

    @JavascriptInterface
    @NotNull
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
