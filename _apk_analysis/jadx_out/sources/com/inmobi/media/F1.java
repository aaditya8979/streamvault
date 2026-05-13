package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes6.dex */
public abstract class F1 {
    public static boolean a(Context context, String str, InterfaceC3613nh interfaceC3613nh, String str2, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "url");
        tn.p.k(interfaceC3613nh, "redirectionValidator");
        tn.p.k(str2, "api");
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        tn.p.k(str, "url");
        if (str.length() != 0) {
            Uri uri = Uri.parse(str);
            if (tn.p.f("market", uri.getScheme()) || tn.p.f("play.google.com", uri.getHost()) || tn.p.f("market.android.com", uri.getHost())) {
                Uri uri2 = Uri.parse(str);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!interfaceC3613nh.c()) {
                            interfaceC3613nh.a("EX_" + str2);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                            if (interfaceC3580m9 != null) {
                                ((C3605n9) interfaceC3580m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e10) {
                            if (interfaceC3580m9 != null) {
                                ((C3605n9) interfaceC3580m9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e10.getMessage());
                            }
                            return false;
                        } catch (Exception e11) {
                            if (interfaceC3580m9 != null) {
                                ((C3605n9) interfaceC3580m9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e11.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                    }
                }
                int iA = AbstractC3551l5.a(context, str, interfaceC3613nh, str2, interfaceC3580m9);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53135i);
        context.startActivity(intent);
    }
}
