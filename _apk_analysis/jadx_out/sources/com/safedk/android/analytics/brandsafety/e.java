package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public class e extends c {

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    protected static final String f52553aq = "network_name";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    protected static final String f52554ar = "ad_format";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    protected static final String f52555as = "BANNER";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    protected static final String f52556at = "MREC";
    public static final String au = "NATIVE";
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    boolean f52557aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public String f52558ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    boolean f52559ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    boolean f52560ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    ScheduledFuture<?> f52561ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    WeakReference<Activity> f52562af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    boolean f52563ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    boolean f52564ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    long f52565ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    long f52566aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    float f52567ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    String f52568al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public BannerFinder.a f52569am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    boolean f52570an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    String f52571ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    String f52572ap;

    public e(String str, long j10) {
        this(str, j10, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String str, long j10, BrandSafetyUtils.AdType adType) {
        super(str, j10, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f52557aa = false;
        this.f52558ab = "";
        this.f52559ac = false;
        this.f52560ad = false;
        this.f52563ag = false;
        this.f52564ah = false;
        this.f52565ai = 0L;
        this.f52566aj = 0L;
        this.f52567ak = 0.0f;
        this.f52568al = null;
        this.f52569am = null;
        this.f52570an = false;
        this.f52571ao = null;
        this.f52572ap = null;
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f52557aa = false;
        this.f52558ab = "";
        this.f52559ac = false;
        this.f52560ad = false;
        this.f52563ag = false;
        this.f52564ah = false;
        this.f52565ai = 0L;
        this.f52566aj = 0L;
        this.f52567ak = 0.0f;
        this.f52568al = null;
        this.f52569am = null;
        this.f52570an = false;
        this.f52571ao = null;
        this.f52572ap = null;
        this.f51884q = str5;
    }

    public e(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3) {
        this(strArr, str, i10, str2, bundle, str3, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f52557aa = false;
        this.f52558ab = "";
        this.f52559ac = false;
        this.f52560ad = false;
        this.f52563ag = false;
        this.f52564ah = false;
        this.f52565ai = 0L;
        this.f52566aj = 0L;
        this.f52567ak = 0.0f;
        this.f52568al = null;
        this.f52569am = null;
        this.f52570an = false;
        this.f52571ao = null;
        this.f52572ap = null;
        this.f52568al = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.f51889v = null;
        this.f52562af = null;
        this.f52568al = null;
        this.f52557aa = false;
        this.f52563ag = false;
    }

    public boolean E() {
        if (this.A == null || !this.A.containsKey("network_name")) {
            return false;
        }
        return this.A.getString("network_name").contains("NATIVE");
    }

    public boolean F() {
        if (this.A == null || !this.A.containsKey("ad_format")) {
            return false;
        }
        return this.A.getString("ad_format").equals("MREC");
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i10) {
        super.a(dVar, bundle, i10);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] strArrA = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.C = strArrA[0];
            this.B = strArrA[1];
        }
        this.f51889v = CreativeInfoManager.b(bundle.getString("network_name"));
        this.f52562af = new WeakReference<>(BannerFinder.a(bundle));
        this.f52568al = BrandSafetyUtils.c().name().toLowerCase();
        this.f52557aa = true;
        this.f52563ag = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void e(boolean z10) {
        super.e(z10);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f52557aa = false;
        this.f52558ab = "";
        this.f52559ac = false;
        this.f52560ad = false;
        this.f52564ah = false;
        if (z10) {
            this.f52567ak = 0.0f;
        }
        this.f52568al = null;
        this.T = false;
        if (this.f52569am != null && this.f52569am.f51628d != null) {
            this.f52569am.f51628d.cancel(false);
        }
        this.f52569am = null;
        this.f52562af = null;
        this.f52570an = false;
        this.f52571ao = null;
        this.f52572ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarL = l();
        return super.toString() + " webView: " + this.K + " hash: " + (jVarL != null ? jVarL.f52619a : null) + " url: " + e() + " isClicked: " + d() + " touch timestamp: " + v() + " activity address: " + this.B + " activity class name: " + this.C + " filename: " + (jVarL != null ? jVarL.f52620b : null) + " type: " + this.f51883p + ", eventId: " + this.L + ", requestNoSamplingReceived: " + this.O + ", onVideoCompletedEventHasBeenTriggered: " + this.H;
    }
}
