package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3509jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3534kd f27398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ua f27402e;

    public C3509jd(C3534kd c3534kd) {
        tn.p.k(c3534kd, "landingPageModel");
        this.f27398a = c3534kd;
        C3460hd c3460hd = new C3460hd(this);
        C3485id c3485id = new C3485id(this);
        this.f27402e = new Ua(c3534kd.f27465a, new Va(false, c3534kd.f27468d.f26704i, c3534kd.f27466b.f25488a.f27824b.isCCTEnabled(), 16), c3460hd, c3485id, c3534kd.f27468d, c3534kd.f27471g, 128);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53135i);
        context.startActivity(intent);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f27399b = jElapsedRealtime;
        InterfaceC3580m9 interfaceC3580m9 = this.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + jElapsedRealtime + ", lastClickedAssetUrl=" + this.f27400c);
        }
        String str = this.f27400c;
        if (str != null) {
            a(str, this.f27401d);
        }
    }

    public final void a(Intent intent) {
        C3534kd c3534kd = this.f27398a;
        InterfaceC3580m9 interfaceC3580m9 = c3534kd.f27471g;
        if (interfaceC3580m9 != null) {
            G g10 = c3534kd.f27466b;
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g10.f25492e + ", placementId=" + g10.f25488a.f27823a.f25731a);
        }
        intent.putExtra("creativeId", this.f27398a.f27466b.f25492e);
        intent.putExtra("impressionId", this.f27398a.f27466b.f25500m.f25408b);
        intent.putExtra("placementId", this.f27398a.f27466b.f25488a.f27823a.f25731a);
        intent.putExtra("supportLockScreen", this.f27398a.f27467c);
        Context context = Ji.f25747a;
        Context context2 = this.f27398a.f27465a;
        tn.p.k(context2, GAMConfig.KEY_CONTEXT);
        tn.p.k(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
        InterfaceC3580m9 interfaceC3580m92 = this.f27398a.f27471g;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }

    public final void a(String str, String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        Ta taA = Ua.a(this.f27402e, "nativeOpen", (String) null, str, (Ya) null, 24);
        InterfaceC3580m9 interfaceC3580m92 = this.f27398a.f27471g;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("PublisherViewClickHandler", "processOpenRequest result: " + taA.f26350a);
        }
        if (taA.f26350a == 1) {
            InterfaceC3580m9 interfaceC3580m93 = this.f27398a.f27471g;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 == null) {
            InterfaceC3580m9 interfaceC3580m94 = this.f27398a.f27471g;
            if (interfaceC3580m94 != null) {
                ((C3605n9) interfaceC3580m94).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m95 = this.f27398a.f27471g;
        if (interfaceC3580m95 != null) {
            ((C3605n9) interfaceC3580m95).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
        }
        a(str2, null);
    }

    public final void b() {
        C3534kd c3534kd = this.f27398a;
        InterfaceC3580m9 interfaceC3580m9 = c3534kd.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c3534kd.f27466b.f25488a.f27823a.f25736f);
        }
        if (this.f27398a.f27466b.f25488a.f27823a.f25736f) {
            a();
        }
    }

    public final void b(String str, String str2) {
        tn.p.k(str, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + str + ", fallbackUrl=" + str2);
        }
        this.f27400c = str;
        this.f27401d = str2;
        C3534kd c3534kd = this.f27398a;
        if (c3534kd.f27466b.f25488a.f27823a.f25736f) {
            InterfaceC3580m9 interfaceC3580m92 = c3534kd.f27471g;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC3446h) this.f27398a.f27470f).a(kotlin.collections.a.j());
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = c3534kd.f27471g;
        if (interfaceC3580m93 != null) {
            ((C3605n9) interfaceC3580m93).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC3446h) this.f27398a.f27470f).a(kotlin.collections.a.j());
        a();
    }
}
