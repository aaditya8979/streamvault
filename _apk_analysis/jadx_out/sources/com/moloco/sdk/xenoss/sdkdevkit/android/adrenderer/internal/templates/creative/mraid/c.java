package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f48656c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48657d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f48658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48659b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public c(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "mraidCommunicationHub");
        this.f48658a = context;
        this.f48659b = aVar;
    }

    @JavascriptInterface
    public final void close() {
        this.f48659b.a();
    }

    @JavascriptInterface
    public final void expand(@NotNull String str) {
        p.k(str, "url");
    }

    @JavascriptInterface
    public final void open(@NotNull String str) throws JSONException {
        p.k(str, "jsonParams");
        String string = new JSONObject(str).getString("url");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar = this.f48659b;
        p.h(string);
        aVar.a(string);
    }

    @JavascriptInterface
    public final void resize(@NotNull String str) {
        p.k(str, "url");
    }

    @JavascriptInterface
    public final void setOrientationProperties(@NotNull String str) {
        p.k(str, "jsonParams");
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            String strOptString = jSONObject.optString("forceOrientation", "none");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Orientation Set from JSON: " + zOptBoolean + ", " + strOptString, false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f48424a.a(strOptString);
            if (pVarA != null) {
                this.f48659b.a(zOptBoolean, pVarA);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Error parsing orientation properties JSON", e10, false, 8, null);
        }
    }
}
