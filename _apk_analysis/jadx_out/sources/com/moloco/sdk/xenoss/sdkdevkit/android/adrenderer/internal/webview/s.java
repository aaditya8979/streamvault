package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.Y5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class s implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f50867a;

    public s(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f50867a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.y
    @NotNull
    public String a(@NotNull String str) throws IOException {
        tn.p.k(str, Y5.c.f30724b);
        InputStream inputStreamOpen = this.f50867a.getAssets().open(str);
        tn.p.j(inputStreamOpen, "open(...)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpen, bo.c.f5639b);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String strE = on.k.e(bufferedReader);
            on.b.a(bufferedReader, null);
            return strE;
        } finally {
        }
    }
}
