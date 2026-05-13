package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3298b5 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r4, androidx.browser.customtabs.CustomTabsIntent r5, android.net.Uri r6, com.inmobi.media.Rh r7, com.inmobi.media.Ya r8, com.inmobi.media.InterfaceC3613nh r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "context"
            tn.p.k(r4, r0)
            java.lang.String r0 = "customTabsIntent"
            tn.p.k(r5, r0)
            java.lang.String r0 = "uri"
            tn.p.k(r6, r0)
            java.lang.String r0 = "redirectionValidator"
            tn.p.k(r9, r0)
            java.lang.String r0 = "api"
            tn.p.k(r10, r0)
            java.lang.String r1 = com.inmobi.media.AbstractC3427g5.a(r4)
            java.lang.String r2 = "toString(...)"
            if (r1 != 0) goto L43
            java.lang.String r5 = "e5"
            java.lang.String r1 = "access$getLOG_TAG$cp(...)"
            tn.p.j(r5, r1)     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L98
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L60
            tn.p.j(r5, r2)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "url"
            tn.p.k(r5, r1)     // Catch: java.lang.Exception -> L60
            tn.p.k(r10, r0)     // Catch: java.lang.Exception -> L60
            com.inmobi.media.ci r0 = r7.f26262a     // Catch: java.lang.Exception -> L60
            com.inmobi.media.Ua r0 = r0.getLandingPageHandler()     // Catch: java.lang.Exception -> L60
            r0.a(r5, r10, r8)     // Catch: java.lang.Exception -> L60
            return
        L43:
            android.content.Intent r0 = r5.intent     // Catch: java.lang.Exception -> L60
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)     // Catch: java.lang.Exception -> L60
            android.content.Intent r0 = r5.intent     // Catch: java.lang.Exception -> L60
            r0.setPackage(r1)     // Catch: java.lang.Exception -> L60
            safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(r5, r4, r6)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L58
            java.lang.String r5 = "IN_NATIVE"
            r8.f26632f = r5     // Catch: java.lang.Exception -> L60
        L58:
            if (r7 == 0) goto L98
            com.inmobi.media.Na r5 = com.inmobi.media.Na.f26022f     // Catch: java.lang.Exception -> L60
            com.inmobi.media.J2.a(r7, r5, r8)     // Catch: java.lang.Exception -> L60
            return
        L60:
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L6c
            tn.p.j(r5, r2)     // Catch: java.lang.Exception -> L6c
            int r4 = com.inmobi.media.AbstractC3848x3.a(r4, r5, r9, r10)     // Catch: java.lang.Exception -> L6c
            goto L6e
        L6c:
            r4 = 9
        L6e:
            if (r8 == 0) goto L74
            java.lang.String r5 = "EX_NATIVE"
            r8.f26632f = r5
        L74:
            if (r4 == 0) goto L91
            r5 = 1
            if (r4 != r5) goto L7a
            goto L91
        L7a:
            if (r7 == 0) goto L98
            com.inmobi.media.Na r5 = com.inmobi.media.Na.f26023g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "landingPageFunnelState"
            tn.p.k(r5, r6)
            com.inmobi.media.ci r6 = r7.f26262a
            com.inmobi.media.Ua r6 = r6.getLandingPageHandler()
            r6.a(r5, r8, r4)
            goto L98
        L91:
            if (r7 == 0) goto L98
            com.inmobi.media.Na r4 = com.inmobi.media.Na.f26022f
            com.inmobi.media.J2.a(r7, r4, r8)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3298b5.a(android.content.Context, androidx.browser.customtabs.CustomTabsIntent, android.net.Uri, com.inmobi.media.Rh, com.inmobi.media.Ya, com.inmobi.media.nh, java.lang.String):void");
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent customTabsIntent, Context context, Uri uri) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (uri == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(uri, com.safedk.android.utils.g.f53135i);
        customTabsIntent.launchUrl(context, uri);
    }
}
