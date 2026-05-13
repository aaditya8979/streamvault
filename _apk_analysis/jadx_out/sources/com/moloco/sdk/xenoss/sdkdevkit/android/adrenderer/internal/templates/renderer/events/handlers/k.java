package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.v0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w0 f48848a;

    public k(@NotNull w0 w0Var) {
        p.k(w0Var, "externalLinkHandler");
        this.f48848a = w0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return v0.d("launchUrl");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        p.k(jSONObject, "event");
        String string = jSONObject.getString("url");
        w0 w0Var = this.f48848a;
        p.h(string);
        w0Var.a(string);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "LaunchUrlHandler";
    }
}
