package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.Ua;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class Ua {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f26424j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Va f26426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rh f26427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ma f26428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3613nh f26429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Za f26430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3580m9 f26431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f26432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26433i;

    public Ua(Context context, Va va2, Rh rh2, Ma ma2, InterfaceC3613nh interfaceC3613nh, Za za2, InterfaceC3580m9 interfaceC3580m9, WeakReference weakReference) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(va2, "landingPageState");
        tn.p.k(interfaceC3613nh, "redirectionValidator");
        this.f26425a = context;
        this.f26426b = va2;
        this.f26427c = rh2;
        this.f26428d = ma2;
        this.f26429e = interfaceC3613nh;
        this.f26430f = za2;
        this.f26431g = interfaceC3580m9;
        this.f26432h = weakReference;
    }

    public /* synthetic */ Ua(Context context, Va va2, C3460hd c3460hd, InterfaceC3613nh interfaceC3613nh, Za za2, InterfaceC3580m9 interfaceC3580m9, int i10) {
        this(context, va2, null, (i10 & 8) != 0 ? null : c3460hd, interfaceC3613nh, za2, interfaceC3580m9, null);
    }

    public static final bn.r a(Ua ua2, String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        Ma ma2 = ua2.f26428d;
        if (ma2 != null) {
            ma2.a(str, map);
        }
        return bn.r.f5635a;
    }

    public static /* synthetic */ Ta a(Ua ua2, String str, String str2, String str3, Ya ya2, int i10) {
        if ((i10 & 8) != 0) {
            ya2 = null;
        }
        return ua2.a(str, str2, str3, ya2, (i10 & 16) == 0);
    }

    public static final void a(Ua ua2, String str, String str2, String str3, Ya ya2, Exception exc) {
        InterfaceC3580m9 interfaceC3580m9 = ua2.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).b("Ua", "Error message in processing openExternal: " + exc.getMessage());
        }
        Ma ma2 = ua2.f26428d;
        if (ma2 != null) {
            try {
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                tn.p.h(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            ma2.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            ua2.f(str, str3, null, ya2);
        }
    }

    public final int a(String str, String str2, Ya ya2) {
        Ya yaA;
        Ya yaA2;
        tn.p.k(str, "url");
        tn.p.k(str2, "api");
        if (ya2 != null) {
            ya2.f26632f = "IN_CUSTOM";
        }
        if (str.length() == 0) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m9).b("Ua", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Na.f26021e, ya2, (Integer) null);
            return 2;
        }
        Uri uri = Uri.parse(str);
        tn.p.j(uri, "Uri.parse(this)");
        if (!AbstractC3848x3.a(uri)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 == null) {
                return 10;
            }
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m92).b("Ua", "Embedded request unable to handle " + str);
            return 10;
        }
        Intent intent = new Intent(this.f26425a, (Class<?>) InMobiAdActivity.class);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
        intent.putExtra("viewTouchTimestamp", this.f26429e.getViewTouchTimestamp());
        if (ya2 != null) {
            yaA = Ya.a(ya2);
            Na na2 = Na.f26020d;
            yaA.f26631e = 2;
            bn.r rVar = bn.r.f5635a;
        } else {
            yaA = null;
        }
        intent.putExtra("lpTelemetryControlInfo", yaA);
        if (ya2 != null) {
            yaA2 = Ya.a(ya2);
            Na na3 = Na.f26020d;
            yaA2.f26631e = 2;
            bn.r rVar2 = bn.r.f5635a;
        } else {
            yaA2 = null;
        }
        intent.putExtra("lpTelemetryControlInfo", yaA2);
        InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
        if (interfaceC3580m93 != null) {
            String string = UUID.randomUUID().toString();
            tn.p.j(string, "toString(...)");
            HashMap map = P8.f26116a;
            String string2 = string.toString();
            tn.p.k(string2, "key");
            tn.p.k(interfaceC3580m93, IconCompat.EXTRA_OBJ);
            P8.f26116a.put(string2, new WeakReference(interfaceC3580m93));
            intent.putExtra("loggerCacheKey", string);
        }
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.a(intent);
        }
        a(Na.f26022f, ya2, (Integer) null);
        Ma ma3 = this.f26428d;
        if (ma3 == null) {
            return 1;
        }
        ma3.b(null, null, str);
        return 1;
    }

    public final int a(String str, String str2, String str3) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).c("Ua", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + str3);
        }
        if (str2 == null || str2.length() == 0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 == null) {
                return 2;
            }
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m92).b("Ua", "InMobiDeepLinkScheme url is Empty or null");
            return 2;
        }
        if (AbstractC3551l5.a(str2, this.f26425a, this.f26429e, this.f26431g)) {
            if (F3.a(str3)) {
                C3823w3 c3823w3 = C3823w3.f28406a;
                tn.p.h(str3);
                InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
                tn.p.k(str3, "url");
                C3823w3.a(str3, true, interfaceC3580m93);
            } else {
                InterfaceC3580m9 interfaceC3580m94 = this.f26431g;
                if (interfaceC3580m94 != null) {
                    tn.p.j("Ua", "TAG");
                    ((C3605n9) interfaceC3580m94).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3580m9 interfaceC3580m95 = this.f26431g;
            if (interfaceC3580m95 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m95).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        int iA = AbstractC3551l5.a(this.f26425a, str2, this.f26429e, str, this.f26431g);
        if (iA != 0 && iA != 1) {
            InterfaceC3580m9 interfaceC3580m96 = this.f26431g;
            if (interfaceC3580m96 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m96).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handling failed");
            }
            return iA;
        }
        if (F3.a(str3)) {
            C3823w3 c3823w32 = C3823w3.f28406a;
            tn.p.h(str3);
            InterfaceC3580m9 interfaceC3580m97 = this.f26431g;
            tn.p.k(str3, "url");
            C3823w3.a(str3, true, interfaceC3580m97);
        } else {
            InterfaceC3580m9 interfaceC3580m98 = this.f26431g;
            if (interfaceC3580m98 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m98).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
            }
        }
        InterfaceC3580m9 interfaceC3580m99 = this.f26431g;
        if (interfaceC3580m99 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m99).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
        }
        return 0;
    }

    public final int a(String str, String str2, String str3, Ya ya2, P2 p22) {
        tn.p.k(str, "api");
        if (str3 == null || str3.length() == 0) {
            b(str, str2, str3);
            a(Na.f26021e, ya2, (Integer) 2);
            return 1;
        }
        Uri uri = Uri.parse(str3);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            b(str, str2, str3);
            a(Na.f26021e, ya2, (Integer) 4);
            return 1;
        }
        if (tn.p.f(uri.getScheme(), "inmobinativebrowser")) {
            b(str, str2, str3, ya2);
            return 2;
        }
        if (tn.p.f(uri.getScheme(), "inmobideeplink")) {
            return a(str, str2, str3, ya2).f26350a == 1 ? 2 : 4;
        }
        if (F1.a(this.f26425a, str3, this.f26429e, str, this.f26431g) || AbstractC3551l5.a(str3, this.f26425a, this.f26429e, this.f26431g)) {
            c(str, str2, str3);
            if (ya2 != null) {
                ya2.f26632f = "EX_NATIVE";
            }
            a(Na.f26022f, ya2, (Integer) null);
            return 2;
        }
        tn.p.h(uri);
        if (AbstractC3848x3.a(uri) && a(str, str3, ya2, p22)) {
            return 5;
        }
        if (AbstractC3848x3.a(uri)) {
            return 3;
        }
        int iA = AbstractC3551l5.a(this.f26425a, str3, this.f26429e, str, this.f26431g);
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        if (iA != 0 && iA != 1) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m9).b("Ua", "CustomExpand handling failed");
            }
            a(Na.f26026j, ya2, (Integer) null);
            return 4;
        }
        c(str, str2, str3);
        a(Na.f26022f, ya2, (Integer) null);
        InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
        if (interfaceC3580m92 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m92).c("Ua", "Deeplink url handled successfully");
        }
        return 2;
    }

    public final Sa a(InlineParams inlineParams) {
        Activity fullScreenActivity;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        if (inlineParams == null) {
            return new Qa(8700);
        }
        WeakReference weakReference = this.f26432h;
        if (weakReference == null || (gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) weakReference.get()) == null) {
            fullScreenActivity = null;
        } else {
            fullScreenActivity = gestureDetectorOnGestureListenerC3337ci.getFullScreenActivity();
            if (fullScreenActivity == null) {
                fullScreenActivity = gestureDetectorOnGestureListenerC3337ci.getBannerHolderActivity().get();
            }
        }
        String packageName = this.f26425a.getPackageName();
        String targetBundleId = inlineParams.getTargetBundleId();
        boolean overlay = inlineParams.getOverlay();
        String url = inlineParams.getUrl();
        if (targetBundleId == null || targetBundleId.length() == 0) {
            return new Qa(8702);
        }
        tn.p.h(packageName);
        if (packageName.length() == 0) {
            return new Qa(8703);
        }
        if (fullScreenActivity == null) {
            return new Qa(8704);
        }
        if (url == null || url.length() == 0) {
            return new Qa(2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url);
        sb2.append("id=" + targetBundleId);
        String referrer = inlineParams.getReferrer();
        String listing = inlineParams.getListing();
        if (referrer != null && !bo.d0.u0(referrer)) {
            sb2.append('&');
            sb2.append("referrer=" + referrer);
        }
        if (listing != null && !bo.d0.u0(listing)) {
            sb2.append('&');
            sb2.append("listing=" + listing);
        }
        return new Ra(fullScreenActivity, sb2.toString(), packageName, overlay);
    }

    public final Ta a(String str, String str2, Ya ya2, String str3, Ra ra2, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "Executing inline installer flow for URL: " + str3);
        }
        int iA = AbstractC3848x3.a(ra2, this.f26429e, str);
        if (iA != 0 && iA != 1) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m92).a("Ua", "Inline installer launch failed; executing fallback for URL: " + str3 + ", errorCode: " + iA);
            }
            return a(str3, str, str2, ya2, iA);
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
        if (interfaceC3580m93 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m93).a("Ua", "Inline installer launch succeeded for URL: " + str3);
        }
        if (z10) {
            C3823w3 c3823w3 = C3823w3.f28406a;
            InterfaceC3580m9 interfaceC3580m94 = this.f26431g;
            tn.p.k(str3, "url");
            Dg.a(Ag.f25163b, new C3649p3(str3, true, interfaceC3580m94, null));
        } else {
            C3823w3 c3823w32 = C3823w3.f28406a;
            InterfaceC3580m9 interfaceC3580m95 = this.f26431g;
            tn.p.k(str3, "url");
            C3823w3.a(str3, true, interfaceC3580m95);
        }
        a(Na.f26022f, ya2, (Integer) null);
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.b(str, str2, str3);
        }
        return new Ta(1);
    }

    public final Ta a(String str, String str2, InlineParams inlineParams, String str3, Ya ya2) {
        tn.p.k(str, "api");
        tn.p.k(str3, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "inline installer called with URL: " + str3);
        }
        if (ya2 != null) {
            ya2.f26632f = "SKSTORE";
        }
        Sa saA = a(inlineParams);
        if (saA instanceof Ra) {
            return a(str, str2, ya2, str3, (Ra) saA, inlineParams != null && inlineParams.getPingInWebView());
        }
        if (saA instanceof Qa) {
            return a(str3, str, str2, ya2, ((Qa) saA).f26176a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Ta a(String str, String str2, String str3, Ya ya2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA == 0 || iA == 1) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m92).c("Ua", "InMobiDeepLinkScheme Primary Url handled successfully");
            }
            if (ya2 != null) {
                ya2.f26632f = "EX_NATIVE";
            }
            a(Na.f26022f, ya2, (Integer) null);
            c(str, str2, str3);
            return new Ta(1);
        }
        int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        if (iA2 == 0 || iA2 == 1) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
            if (interfaceC3580m93 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m93).c("Ua", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Na.f26022f, ya2, (Integer) null);
            c(str, str2, str3);
            return new Ta(1);
        }
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.a(str2, "Invalid URL", str);
        }
        InterfaceC3580m9 interfaceC3580m94 = this.f26431g;
        if (interfaceC3580m94 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m94).c("Ua", "InMobiDeepLinkScheme Fallback Url handling failed");
        }
        a(Na.f26023g, ya2, Integer.valueOf(iA2));
        return new Ta(2, Integer.valueOf(iA2));
    }

    public final Ta a(String str, String str2, String str3, Ya ya2, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i10, ya2);
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        if (F1.a(this.f26425a, str, this.f26429e, str2, this.f26431g)) {
            a(Na.f26022f, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        if (AbstractC3551l5.a(str, this.f26425a, this.f26429e, this.f26431g)) {
            a(Na.f26022f, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        int iE = e(str2, str3, str, ya2);
        if (iE == 0 || iE == 1) {
            return new Ta(1);
        }
        a(Na.f26023g, ya2, Integer.valueOf(iE));
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.a(str3, "Launch failed", str2);
        }
        return new Ta(2, Integer.valueOf(iE));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.Ta a(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.inmobi.media.Ya r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ua.a(java.lang.String, java.lang.String, java.lang.String, com.inmobi.media.Ya, boolean):com.inmobi.media.Ta");
    }

    public final void a(int i10, Ya ya2) {
        Object objM7534constructorimpl;
        InterfaceC3580m9 interfaceC3580m9;
        Za za2;
        try {
            Result.a aVar = Result.Companion;
            if (ya2 == null || (za2 = ya2.f26627a) == null) {
                za2 = this.f26430f;
            }
            Map mapO = kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)));
            if (za2 != null) {
                mapO.put("plType", za2.f26698c);
                mapO.put("impressionId", za2.f26697b);
                mapO.put("plId", Long.valueOf(za2.f26696a));
                mapO.put("adType", za2.f26699d);
                mapO.put("markupType", za2.f26700e);
                mapO.put("creativeType", za2.f26701f);
                mapO.put("metadataBlob", za2.f26702g);
                mapO.put("isRewarded", Boolean.valueOf(za2.f26703h));
            }
            if (ya2 != null) {
                String str = ya2.f26632f;
                if (str == null) {
                    str = ya2.f26627a.f26704i;
                }
                mapO.put("trigger", str);
                mapO.put("urlType", ya2.f26628b);
                long j10 = ya2.f26630d;
                if (j10 != 0) {
                    p000do.l0 l0Var = AbstractC3492il.f27361a;
                    mapO.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                }
            }
            mapO.put("networkType", C3850x5.m());
            Wj wj2 = Wj.f26549a;
            Wj.b("InlineInstallFailed", mapO, EnumC3287ak.f26805a);
            objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || (interfaceC3580m9 = this.f26431g) == null) {
            return;
        }
        tn.p.j("Ua", "TAG");
        ((C3605n9) interfaceC3580m9).b("Ua", "Failed to submit inline install failed telemetry: " + thM7537exceptionOrNullimpl.getMessage());
    }

    public final void a(Na na2, Ya ya2, Integer num) {
        tn.p.k(na2, "funnelState");
        Pa.a(na2, ya2, num, new sn.p() { // from class: n9.l4
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Ua.a(this.f75479b, (String) obj, (Map) obj2);
            }
        });
    }

    public final boolean a(String str, String str2, Ya ya2, P2 p22) {
        String strA;
        try {
            if (this.f26426b.f26493d && p22 != null) {
                String strA2 = AbstractC3427g5.a(this.f26425a);
                if (strA2 != null) {
                    try {
                        if (Ef.b(Ef.a(J5.g()))) {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", Integer.TYPE);
                        } else {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", Integer.TYPE);
                        }
                        R2 r22 = new R2(str2, p22, this.f26425a, this.f26427c, this.f26429e, ya2, str);
                        C3375e5 c3375e5 = r22.f26221e;
                        Context context = r22.f26222f;
                        if (c3375e5.f27088a == null && context != null && (strA = AbstractC3427g5.a(context)) != null) {
                            C3324c5 c3324c5 = new C3324c5(c3375e5);
                            c3375e5.f27089b = c3324c5;
                            CustomTabsClient.bindCustomTabsService(context, strA, c3324c5);
                        }
                        return true;
                    } catch (Error | Exception unused) {
                    }
                }
                InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
                if (interfaceC3580m9 != null) {
                    tn.p.j("Ua", "TAG");
                    ((C3605n9) interfaceC3580m9).c("Ua", "Partial tabs not supported: packageName - " + strA2);
                }
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m92).c("Ua", "Error while opening partial tab: " + e10.getMessage());
            }
        }
        return false;
    }

    public final Ta b(String str, String str2, String str3, Ya ya2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).c("Ua", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ma ma2 = this.f26428d;
            if (ma2 != null) {
                ma2.a(str2, "Invalid URL", str);
            }
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m92).c("Ua", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Na.f26021e, ya2, (Integer) 8001);
            return new Ta(3, 8001);
        }
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        if (AbstractC3551l5.a(str3, this.f26425a, this.f26429e, this.f26431g)) {
            a(Na.f26022f, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
            if (interfaceC3580m93 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m93).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        int iA = AbstractC3551l5.a(this.f26425a, queryParameter, this.f26429e, str, this.f26431g);
        if (iA == 0 || iA == 1) {
            a(Na.f26022f, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3580m9 interfaceC3580m94 = this.f26431g;
            if (interfaceC3580m94 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m94).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        Ma ma3 = this.f26428d;
        if (ma3 != null) {
            ma3.a(str2, "Invalid URL", str);
        }
        InterfaceC3580m9 interfaceC3580m95 = this.f26431g;
        if (interfaceC3580m95 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m95).c("Ua", "InmobiNativeBrowser scheme url handling failed");
        }
        a(Na.f26023g, ya2, Integer.valueOf(iA));
        return new Ta(2, Integer.valueOf(iA));
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).c("Ua", str + " called with invalid url (" + str3 + ")");
        }
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.a(str2, "Invalid URL", str);
        }
    }

    public final int c(String str, String str2, String str3, Ya ya2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, ya2);
        } catch (Exception e10) {
            Ma ma2 = this.f26428d;
            if (ma2 != null) {
                ma2.a(str2, "Unexpected error", "open");
            }
            Kb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 == null) {
                return 9;
            }
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m92).b("Ua", "SDK encountered unexpected error in handling open() request from creative " + e10.getMessage());
            return 9;
        }
    }

    public final void c(String str, String str2, String str3) {
        Ma ma2 = this.f26428d;
        if (ma2 != null) {
            ma2.a();
        }
        Ma ma3 = this.f26428d;
        if (ma3 != null) {
            ma3.b(str, str2, str3);
        }
    }

    public final int d(String str, String str2, String str3, Ya ya2) {
        String strA;
        tn.p.k(str, "api");
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).c("Ua", "processOpenCCTRequest - url - " + str3);
        }
        if (ya2 != null) {
            ya2.f26632f = "IN_NATIVE";
        }
        if (str3 == null || (bo.a0.W(str3, "http", false, 2, null) && !URLUtil.isValidUrl(str3))) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m92).c("Ua", str + " called with invalid url (" + str3 + ")");
            }
            Ma ma2 = this.f26428d;
            if (ma2 != null) {
                ma2.a(str2, "Invalid URL", str);
            }
            a(Na.f26021e, ya2, (Integer) 3);
            return 3;
        }
        String strA2 = AbstractC3427g5.a(this.f26425a);
        try {
            try {
                boolean z10 = this.f26426b.f26492c;
                if (strA2 != null && z10) {
                    R2 r22 = new R2(str3, null, this.f26425a, this.f26427c, this.f26429e, ya2, str);
                    C3375e5 c3375e5 = r22.f26221e;
                    Context context = r22.f26222f;
                    if (c3375e5.f27088a == null && context != null && (strA = AbstractC3427g5.a(context)) != null) {
                        C3324c5 c3324c5 = new C3324c5(c3375e5);
                        c3375e5.f27089b = c3324c5;
                        CustomTabsClient.bindCustomTabsService(context, strA, c3324c5);
                    }
                    InterfaceC3580m9 interfaceC3580m93 = this.f26431g;
                    if (interfaceC3580m93 != null) {
                        tn.p.j("Ua", "TAG");
                        ((C3605n9) interfaceC3580m93).c("Ua", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3580m9 interfaceC3580m94 = this.f26431g;
                if (interfaceC3580m94 != null) {
                    tn.p.j("Ua", "TAG");
                    ((C3605n9) interfaceC3580m94).a("Ua", "ChromeCustomTab fallback to Embedded");
                }
                if (ya2 != null) {
                    ya2.f26632f = "IN_CUSTOM";
                }
                return a(str3, str, ya2);
            } catch (Exception unused) {
                int iA = AbstractC3848x3.a(this.f26425a, str3, this.f26429e, str);
                if (iA != 0 && iA != 1) {
                    return iA;
                }
                c(str, str2, str3);
                if (ya2 != null) {
                    ya2.f26632f = "EX_NATIVE";
                }
                a(Na.f26022f, ya2, (Integer) null);
                return iA;
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m95 = this.f26431g;
            if (interfaceC3580m95 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m95).a("Ua", "Exception occurred while opening External ", e10);
            }
            return 9;
        }
    }

    public final int e(String str, String str2, String str3, Ya ya2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ua", "In processOpenExternalNativeRequest");
        }
        int iA = AbstractC3551l5.a(this.f26425a, str3, this.f26429e, str, this.f26431g);
        if (iA != 0 && iA != 1) {
            return d(str, str2, str3, ya2);
        }
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        a(Na.f26022f, ya2, (Integer) null);
        c(str, str2, str3);
        InterfaceC3580m9 interfaceC3580m92 = this.f26431g;
        if (interfaceC3580m92 == null) {
            return 0;
        }
        tn.p.j("Ua", "TAG");
        ((C3605n9) interfaceC3580m92).c("Ua", "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, Ya ya2) {
        String strEncode;
        try {
            int iA = AbstractC3848x3.a(this.f26425a, str2, this.f26429e, "openExternal");
            if (iA != 0 && iA != 1) {
                a(Na.f26023g, ya2, Integer.valueOf(iA));
                Ma ma2 = this.f26428d;
                if (ma2 != null) {
                    try {
                        strEncode = URLEncoder.encode(str2, "UTF-8");
                        tn.p.h(strEncode);
                    } catch (UnsupportedEncodingException unused) {
                        strEncode = str2;
                    }
                    ma2.a(str, "Cannot resolve URI (" + strEncode + ")", "openExternal");
                    return;
                }
                return;
            }
            a(Na.f26022f, ya2, (Integer) null);
            c("openExternal", str, str2);
        } catch (ActivityNotFoundException e10) {
            a(this, str, str2, str3, ya2, e10);
        } catch (NullPointerException e11) {
            a(this, str, str2, str3, ya2, e11);
        } catch (URISyntaxException e12) {
            a(this, str, str2, str3, ya2, e12);
        } catch (Exception e13) {
            a(Na.f26023g, ya2, (Integer) 9);
            Ma ma3 = this.f26428d;
            if (ma3 != null) {
                ma3.a(str, "Unexpected error", "openExternal");
            }
            tn.p.j("Ua", "TAG");
            Kb.a((byte) 1, "Ua", "Could not open URL SDK encountered an unexpected error");
            InterfaceC3580m9 interfaceC3580m9 = this.f26431g;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ua", "TAG");
                ((C3605n9) interfaceC3580m9).b("Ua", "SDK encountered unexpected error in handling openExternal() request from creative " + e13.getMessage());
            }
        }
    }
}
