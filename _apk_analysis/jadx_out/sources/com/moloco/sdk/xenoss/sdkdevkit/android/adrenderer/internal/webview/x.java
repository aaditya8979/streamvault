package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import androidx.compose.runtime.internal.StabilityInferred;
import bo.a0;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final y f50869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final v f50870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final w f50871c;

    public x(@NotNull y yVar, @NotNull v vVar, @NotNull w wVar) {
        tn.p.k(yVar, "localAssetLoader");
        tn.p.k(vVar, "contentEncoder");
        tn.p.k(wVar, "cssMarginHandler");
        this.f50869a = yVar;
        this.f50870b = vVar;
        this.f50871c = wVar;
    }

    public /* synthetic */ x(y yVar, v vVar, w wVar, int i10, tn.i iVar) {
        this(yVar, vVar, (i10 & 4) != 0 ? new w() : wVar);
    }

    @NotNull
    public String a(@NotNull String str) {
        tn.p.k(str, CreativeInfo.f52467al);
        String strA = this.f50869a.a("mraid.js");
        return bo.t.j("\n            <script>" + this.f50869a.a("mraid-bridge.js") + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + this.f50870b.a(a0.S(this.f50871c.a(str), "<script src=\"mraid.js\"></script>", "<script>" + strA + "</script>", false, 4, null)) + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }
}
