package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.v0;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f15945d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1 f15949h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v0 f15951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f15953l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f15946e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15948g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f15950i = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15947f = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15954m = IAConfigManager.O.f15975u.f16144b.a(false, "should_decode_url");

    public r(boolean z10) {
        this.f15944c = true;
        this.f15944c = z10;
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (!rVar.f15944c) {
            rVar.f15947f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
            rVar.a(a(str2, "followRedirects", "internal browser not usable"));
            return;
        }
        Intent intent = new Intent(rVar.f15942a, (Class<?>) InneractiveInternalBrowserActivity.class);
        if (!TextUtils.isEmpty(str)) {
            InneractiveInternalBrowserActivity.setHtmlExtra(str);
        }
        intent.putExtra("extra_url", str2);
        intent.putExtra("spotId", str3);
        if (!(rVar.f15942a instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            Context context = rVar.f15942a;
            if (context != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            }
            ArrayList arrayList = rVar.f15947f;
            boolean z10 = exc == null;
            q qVar = q.OPENED_IN_INTERNAL_BROWSER;
            arrayList.add(new j(str2, z10, qVar, v.a(exc)));
            rVar.a(new b(str2, qVar, "followRedirects", null));
        } catch (ActivityNotFoundException unused) {
            rVar.f15947f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
            rVar.a(a(str2, "followRedirects", "internal browser not registered"));
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53142p);
        context.startActivity(intent);
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.f15947f;
        bVar.f15914f.clear();
        bVar.f15914f.addAll(arrayList);
        bVar.f15913e = System.currentTimeMillis() - this.f15948g;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.f19556b.post(new n(this, bVar));
        return bVar;
    }

    public final b a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f15947f.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.f15950i.isEmpty()) {
            this.f15947f.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        for (a aVar : this.f15950i) {
            if (aVar.a(uri, this)) {
                Context context = this.f15942a;
                b bVarA = context != null ? aVar.a(context, uri, this.f15947f) : null;
                if (bVarA != null) {
                    return a(bVarA);
                }
            }
        }
        return null;
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z10, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.f15942a = context;
        this.f15943b = str;
        this.f15945d = oVar;
        this.f15952k = z10;
        this.f15948g = System.currentTimeMillis();
        this.f15951j = v0Var;
        this.f15953l = mVar;
        b bVarA = a(this.f15943b);
        IAlog.d("%s EVENT_CLICK %s %s", "VAST_EVENT", bVarA, str);
        if (bVarA == null) {
            String str3 = this.f15943b;
            try {
                try {
                    uri = this.f15954m ? !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3) : h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3);
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String string = uri.toString();
                    h1 h1Var = new h1(new m(this, string, str2), string);
                    this.f15949h = h1Var;
                    IAConfigManager.O.f15973s.a(h1Var);
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e10);
                this.f15947f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e10));
            }
        }
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.f15947f.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.f15947f.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }
}
