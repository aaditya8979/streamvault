package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f50936a = "WebBrowserUserAgentService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final bn.g f50937b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.f
        @Override // sn.a
        public final Object invoke() {
            return g.b(this.f50935b);
        }
    });

    public static final String b(g gVar) {
        try {
            String property = System.getProperty("http.agent");
            return property != null ? d0.u0(property) ? "" : property : "";
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, gVar.f50936a, e10.toString(), null, false, 12, null);
            return "";
        }
    }

    public final String a() {
        return (String) this.f50937b.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.a
    @NotNull
    public String invoke() {
        return a();
    }
}
