package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.moloco.sdk.internal.MolocoLogger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 {
    public static final boolean b(Context context, String str) {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().setUrlBarHidingEnabled(true).build();
            tn.p.j(customTabsIntentBuild, "build(...)");
            customTabsIntentBuild.intent.addFlags(268435456);
            safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentBuild, context, Uri.parse(str));
            return true;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e10, false, 8, null);
            return false;
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent customTabsIntent, Context context, Uri uri) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (uri == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(uri, com.safedk.android.utils.g.D);
        customTabsIntent.launchUrl(context, uri);
    }
}
