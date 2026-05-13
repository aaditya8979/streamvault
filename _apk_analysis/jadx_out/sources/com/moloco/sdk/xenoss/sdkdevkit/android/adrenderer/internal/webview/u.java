package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class u implements v {
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.v
    @NotNull
    public String a(@NotNull String str) {
        tn.p.k(str, "content");
        byte[] bytes = bo.t.j(str).getBytes(bo.c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 1);
        tn.p.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
