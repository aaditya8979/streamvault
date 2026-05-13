package com.yk.e.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class CurUtil {
    public static void adClick(Context context, boolean z10, String str) {
        if (z10) {
            openGooglePlay(context, parsePakName4Url(str), str);
        } else {
            CoreUtils.openBrowser(context, str);
        }
    }

    public static void openGooglePlay(Context context, String str, String str2) {
        try {
            AdLog.d("openGooglePlay " + str2 + Z7.f30794r + str);
            if (TextUtils.isEmpty(str)) {
                AdLog.d("openGooglePlay for Browser, " + str);
                CoreUtils.openBrowser(context, str2);
            } else {
                AdLog.d("openGooglePlay for market, " + str);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            }
        } catch (Exception e10) {
            AdLog.e("openGooglePlay is error, msg=" + e10.getMessage(), e10);
            CoreUtils.openBrowser(context, str2);
        }
    }

    private static String parsePakName4Url(String str) {
        try {
            if (!str.contains("play.google.com") && !str.contains("id=")) {
                return "";
            }
            int iIndexOf = str.indexOf("id=") + 3;
            int iIndexOf2 = str.indexOf(C3978d4.j.f31381c, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.length();
            }
            return str.substring(iIndexOf, iIndexOf2);
        } catch (Exception e10) {
            AdLog.e("getPakName4Url is error, msg " + e10.getMessage(), e10);
            return "";
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }
}
