package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.ironsource.C3978d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class InterstitialFinder extends com.safedk.android.analytics.brandsafety.b {
    private static final String J = "InterstitialFinder";
    private static final long K = 500;
    private static final long L = 1000;
    private static final int M = 2;
    private static final int N = 3;
    public final InterstitialInfoCollection F;
    FullScreenActivitiesCollection G;
    boolean H;
    protected String I;
    private long O;
    private final Map<String, List<o>> P;
    private String Q;
    private final Set<String> R;

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.InterstitialFinder$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f51788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f51789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f51790c;

        AnonymousClass9(n nVar, Bitmap bitmap) {
            this.f51789b = nVar;
            this.f51790c = bitmap;
            this.f51788a = this.f51789b.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.9.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.a(AnonymousClass9.this.f51789b, AnonymousClass9.this.f51788a, AnonymousClass9.this.f51790c);
                }
            });
        }
    }

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f51793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f51794b;

        public a(String str, String str2) {
            this.f51793a = str;
            this.f51794b = str2;
        }

        public String a() {
            return (this.f51793a != null ? this.f51793a : "") + "_" + (this.f51794b != null ? this.f51794b : "");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            boolean zEquals = this.f51793a.equals(aVar.f51793a);
            return this.f51794b != null ? zEquals && this.f51794b.equals(aVar.f51794b) : zEquals;
        }

        public int hashCode() {
            return this.f51794b != null ? this.f51793a.hashCode() * this.f51794b.hashCode() : this.f51793a.hashCode();
        }

        public String toString() {
            return "{placementId=" + this.f51793a + ", eventId=" + this.f51794b + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f51797b;

        private b() {
            this.f51797b = null;
        }

        public b(String str) {
            this.f51797b = null;
            this.f51797b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f51797b == null) {
                Logger.d(InterstitialFinder.J, "interstitial finder task event id is null, skipping.");
                return;
            }
            n nVar = InterstitialFinder.this.F.get(this.f51797b);
            if (nVar != null) {
                Logger.d(InterstitialFinder.J, "interstitial finder task timer for info " + nVar.L + ", isCancelled = " + (nVar.f52699ak != null ? Boolean.valueOf(nVar.f52699ak.isCancelled()) : "?") + ", isDone = " + (nVar.f52699ak != null ? Boolean.valueOf(nVar.f52699ak.isDone()) : "?") + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (nVar.i() == null && nVar.f52701am != null && CreativeInfoManager.a(BrandSafetyUtils.b(nVar.f52701am.getClass()), AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task timer for info " + nVar.L + " calling tryToFindCI");
                    InterstitialFinder.this.a(nVar, nVar.f52701am);
                }
                if (nVar.f52701am != null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task activity sdk is " + BrandSafetyUtils.b(nVar.f52701am.getClass()));
                }
                if (!nVar.E && nVar.f51892y == 2) {
                    InterstitialFinder.this.e(nVar, "timer task run");
                }
                if (InterstitialFinder.this.O == 0 || jCurrentTimeMillis - InterstitialFinder.this.O >= 900.0d) {
                    InterstitialFinder.this.O = jCurrentTimeMillis;
                    if (nVar.f52693ae) {
                        Logger.d(InterstitialFinder.J, "request to stop taking screenshots has been received, skipping.");
                    } else {
                        InterstitialFinder.this.a(nVar);
                    }
                    int i10 = nVar.f51892y + 1;
                    nVar.f51892y = i10;
                    if (i10 == 120) {
                        Logger.d(InterstitialFinder.J, "max number of screenshots threshold reached, no need to start timers");
                        InterstitialFinder.this.a(this.f51797b);
                        return;
                    }
                    InterstitialFinder.this.e(nVar);
                    if (nVar.j().isEmpty()) {
                        Logger.d(InterstitialFinder.J, "interstitial finder task checking for pending CIs");
                        for (o oVar : InterstitialFinder.this.a(nVar.f51889v, nVar)) {
                            if (oVar != null && oVar.f52705a != null) {
                                Logger.d(InterstitialFinder.J, "interstitial finder task calling set CI");
                                InterstitialFinder.this.b(oVar, nVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public InterstitialFinder() {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, Arrays.asList(BrandSafetyUtils.f51653j, BrandSafetyUtils.f51654k, BrandSafetyUtils.f51655l), J, 120);
        this.F = new InterstitialInfoCollection();
        this.O = 0L;
        this.P = new HashMap();
        this.G = new FullScreenActivitiesCollection();
        this.H = false;
        this.I = "";
        this.R = new HashSet(Arrays.asList(CreativeInfo.f52481j, CreativeInfo.f52480i));
    }

    private static View a(ViewGroup viewGroup, String str) {
        Logger.d(J, "find views " + viewGroup.toString());
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Logger.d(J, "find views child " + childAt.toString());
            if (str != null && childAt.getClass().getName().equals(str)) {
                Logger.d(J, "find views found " + str + " : " + childAt.toString());
                return childAt;
            }
            if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    private BrandSafetyEvent a(n nVar, l lVar, boolean z10, String str, String str2) {
        return new BrandSafetyEvent(nVar.c(), nVar.f51893z, str2, z10, nVar.d() ? nVar.e() : null, lVar.c(), nVar.a(), nVar.C, lVar.f52673a != null ? lVar.f52673a : "", nVar.D, nVar.Z, nVar.Z > 0, nVar.A, lVar.f52674b != null ? lVar.f52674b.f52624f : null, lVar.f52674b != null ? lVar.f52674b.f52625g : false, lVar.f52674b != null ? lVar.f52674b.f52621c : 0L, lVar.f52674b != null ? lVar.f52674b.a(1000) : 0.0f, nVar.f51892y, SafeDK.getInstance().e(), str, nVar.M, nVar.N, nVar.P, nVar.Q, b(nVar, lVar).toString(), lVar.f52678f, lVar.f52679g, nVar.T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<o> a(String str, n nVar) {
        ArrayList arrayList = new ArrayList();
        List<o> list = this.P.get(str);
        com.safedk.android.utils.k.b(J, "pending ci check, number of pending CIs: " + (list != null ? list.size() : 0) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(J, "pending ci check, pending object addresses are: " + a(list));
        if (list != null) {
            synchronized (this) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    Logger.d(J, "pending ci check, matching method: " + next.f52706b + ", ci: " + next.f52705a.X());
                    if (a(next.f52705a, nVar) && next.f52705a != null) {
                        nVar.e("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + "|i=" + next.f52707c + ";" + next.f52706b + "|o=" + next.f52705a.ae() + ";" + next.f52705a.af());
                        it.remove();
                        Logger.d(J, "pending ci check, creative info is the pending creative info: " + next);
                        arrayList.add(next);
                    }
                }
            }
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                list.clear();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, n nVar) {
        if (activity == null) {
            Logger.d(J, "cannot set interstitial info activity details, activity is null");
            return;
        }
        String[] strArr = {BrandSafetyUtils.a(activity.toString(), false), BrandSafetyUtils.a(activity.toString(), true)};
        String string = activity.toString();
        nVar.f52691ac = string;
        nVar.f52701am = activity;
        nVar.a(strArr);
        synchronized (this.G) {
            this.G.remove((Object) activity.toString());
        }
        Logger.d(J, "interstitial info activity details set : " + activity.getClass() + ", sdk = " + nVar.f51889v + ", activity name = " + string + ", activities = " + this.G.a() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
    }

    public static void a(View view, int i10) {
        Logger.d(J, "find views view : " + new String(new char[i10 * 2]).replace("\u0000", "-") + view.getClass().toString() + new StringBuilder().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final n nVar, final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.2
            @Override // java.lang.Runnable
            public void run() {
                BrandSafetyUtils.AdType adTypeB;
                BrandSafetyUtils.AdType adTypeA;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
                String strB = BrandSafetyUtils.b(activity.getClass());
                try {
                    if (nVar != null && nVar.j().isEmpty() && CreativeInfoManager.a(strB) == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.get("ad_format") != null && CreativeInfoManager.a(strB, AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                        String strY = nVar.y();
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.A);
                        Logger.d(InterstitialFinder.J, "try to find CI, ad format = " + adFormatTypeA + ", placement = " + strY + ", activity sdk = " + strB);
                        List<CreativeInfo> listB = InterstitialFinder.this.b(viewGroup, strB);
                        if (listB == null) {
                            Logger.d(InterstitialFinder.J, "try to find CI - did not find CIs for event id: " + nVar.L);
                            return;
                        }
                        Logger.d(InterstitialFinder.J, "try to find CI, updating ad format value to " + adFormatTypeA);
                        InterstitialFinder.this.a(activity, nVar);
                        for (CreativeInfo creativeInfo : listB) {
                            if (creativeInfo.I() == null || adFormatTypeA == null || (adTypeB = BrandSafetyUtils.b(creativeInfo.I())) == (adTypeA = BrandSafetyUtils.a(adFormatTypeA))) {
                                creativeInfo.p(adFormatTypeA != null ? adFormatTypeA.name() : null);
                                nVar.e("ad_type_upd(tryTFndCI):" + adFormatTypeA);
                                creativeInfo.f(nVar.A.getString("id"));
                                creativeInfo.h(nVar.A.getString(BrandSafetyEvent.f52756k));
                                Logger.d(InterstitialFinder.J, "try to find CI - ci event id : " + creativeInfo.m() + ", placement id : " + creativeInfo.F());
                                InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f52485n, ""));
                            } else {
                                Logger.d(InterstitialFinder.J, "try to find CI, skipping CI due to incompatible ad type - CI:" + adTypeB + ", max: " + adTypeA);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Logger.d(InterstitialFinder.J, "Exception while attempting to find CI : " + th2.getMessage(), th2);
                }
            }
        });
    }

    private void a(final n nVar, final View view, final Activity activity) {
        try {
            if (nVar == null || activity == null) {
                Logger.d(J, "currentActivityInterstitial or activity are null");
            } else {
                final String strC = nVar.c();
                Logger.d(J, "taking screenshot on UIThread, view=" + view);
                activity.runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CreativeInfoManager.a(strC, AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, false)) {
                            Logger.d(InterstitialFinder.J, "Taking screenshot - network supports copying bitmap using PixelCopy");
                            ScreenshotHelper.a(activity, nVar, view, SafeDK.getInstance().F());
                            return;
                        }
                        final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().F());
                        if (bitmapA != null) {
                            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    InterstitialFinder.this.a(nVar, strC, bitmapA);
                                }
                            });
                        } else {
                            nVar.G();
                            Logger.d(InterstitialFinder.J, "taking screenshot, black screenshot detected index = " + nVar.F());
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            Logger.e(J, "taking screenshot taking screenshot exception:", th2);
        }
    }

    private void a(n nVar, j jVar) {
        Logger.d(J, "remove file and report event, file: " + jVar.f52620b);
        BrandSafetyUtils.d(jVar.f52620b);
        jVar.f52619a = null;
        jVar.f52620b = null;
        BrandSafetyUtils.d(nVar.b());
        nVar.f51886s = null;
        e(nVar, "removeFileAndReportEvent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, String str, Bitmap bitmap) {
        if (bitmap != null) {
            BrandSafetyUtils.a aVarA = BrandSafetyUtils.a(str, bitmap);
            int iA = aVarA.a();
            BrandSafetyUtils.ScreenshotValidity screenshotValidityA = BrandSafetyUtils.a(str, aVarA);
            if (screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                nVar.G();
                Logger.d(J, "process screenshot, black/uniform screenshot detected index = " + nVar.F());
                return;
            }
            if (screenshotValidityA != BrandSafetyUtils.ScreenshotValidity.VALID) {
                Logger.d(J, "process screenshot is not valid: " + screenshotValidityA.name() + ", pixel count: " + iA + ", try again...");
                if (nVar.f52689aa && nVar.H) {
                    Logger.d(J, "process screenshot back from background - reset video completed indication to false");
                    nVar.f52689aa = false;
                    nVar.H = false;
                    return;
                }
                return;
            }
            String strA = BrandSafetyUtils.a(bitmap);
            Logger.d(J, "process screenshot found interstitial, hash = " + strA);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && !adNetworkDiscoveryH.a(strA, this.Q)) {
                Logger.d(J, "process screenshot skipping file, not valid for " + str);
                nVar.e("SkippedImageHash=" + strA);
                return;
            }
            nVar.f52695ag = BrandSafetyUtils.b(bitmap);
            String strN = nVar.n();
            Logger.d(J, "process screenshot impressionId is " + strN);
            String strA2 = BrandSafetyUtils.a(bitmap, BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.f52695ag);
            Logger.d(J, "process screenshot screenshot file created, filename = " + strA2);
            long jC = BrandSafetyUtils.c(strA2);
            float f10 = (iA / 1000.0f) * 100.0f;
            if (adNetworkDiscoveryH != null && jC < adNetworkDiscoveryH.a(nVar.i())) {
                Logger.d(J, "process screenshot file size too small " + jC + " (bytes). This image will not be used");
                BrandSafetyUtils.d(strA2);
                return;
            }
            Logger.d(J, "process screenshot stored file size is " + jC + " bytes, counter is " + nVar.f51892y + ", uniform pixel count is " + iA + " (" + f10 + "%)");
            int size = this.B.size();
            if (e(strA, strN)) {
                Logger.d(J, "process screenshot not saving file for interstitial " + strA + "_" + strN);
                BrandSafetyUtils.d(strA2);
                if (e(strA, strN)) {
                    Logger.d(J, "process screenshot interstitial " + strA + "_" + strN + " was already reported");
                } else {
                    Logger.d(J, "process screenshot waiting to report stored interstitial " + nVar.f52690ab);
                }
                if (nVar.f52690ab != null) {
                    if (d(nVar.f52690ab, nVar.n())) {
                        BrandSafetyUtils.d(nVar.f51887t);
                    } else {
                        Logger.d(J, "process screenshot not deleting not best image " + nVar.f51887t);
                    }
                }
            } else {
                boolean z10 = false;
                if (size < SafeDK.getInstance().J()) {
                    Logger.d(J, "process screenshot impressions to report size=" + size + ", max images to store=" + SafeDK.getInstance().J());
                    if (nVar.f52690ab == null) {
                        z10 = true;
                    } else if (!nVar.f52690ab.equals(strA)) {
                        Logger.d(J, "process screenshot removing previous file : " + nVar.f51887t);
                        BrandSafetyUtils.d(nVar.f51887t);
                        z10 = true;
                    }
                    if (z10) {
                        Logger.d(J, "process screenshot keeping file of interstitial " + strA + ". file size is " + jC + " (bytes), orientation: " + nVar.f52695ag);
                        BrandSafetyUtils.a(nVar.t(), BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.f52695ag);
                    }
                } else if (d(strA, strN)) {
                    Logger.d(J, "process screenshot image " + strA + "_" + strN + " is already scheduled for upload");
                } else {
                    Logger.d(J, "process screenshot no open slot for interstitial " + strA);
                    BrandSafetyUtils.d(strA2);
                    strA = null;
                }
            }
            boolean z11 = false;
            if (strA != null) {
                Logger.d(J, "process screenshot setting interstitial info data (previous hash = " + nVar.f52690ab + ", current hash = " + strA + ")");
                z11 = (nVar.f52690ab == null || strA.equals(nVar.f52690ab)) ? false : true;
            }
            if (nVar.f52695ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED)) {
                nVar.f52695ag = BrandSafetyUtils.b(bitmap);
            }
            l lVarH = nVar.h();
            if (lVarH != null) {
                lVarH.b(ImpressionLog.f51750t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                Logger.d(J, "process screenshot setting image details: " + lVarH.f52674b);
                lVarH.f52674b = new j(strA, strA2, jC, iA, nVar.f51892y, nVar.f52695ag, z11);
                e(nVar, "processScreenshot");
            }
            if (nVar.f52690ab == null) {
                Logger.d(J, "process screenshot no previous hash to detect animation, keep sampling");
                nVar.f52690ab = strA;
                nVar.f51887t = strA2;
                nVar.f51888u = nVar.f52695ag;
                return;
            }
            boolean z12 = true;
            CreativeInfo creativeInfoI = nVar.i();
            if (creativeInfoI != null && creativeInfoI.D()) {
                if (z11) {
                    Logger.d(J, "process screenshot, shopping collage didn't finished loading");
                    z12 = false;
                } else {
                    Logger.d(J, "process screenshot, shopping collage finished loading");
                }
            }
            if (!a(iA, jC) || !z12) {
                nVar.f52690ab = strA;
                nVar.f51887t = strA2;
                nVar.f51888u = nVar.f52695ag;
                return;
            }
            if (lVarH != null) {
                lVarH.a(ImpressionLog.f51750t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
            }
            j jVarL = nVar.l();
            if (jVarL != null) {
                jVarL.f52625g = z11;
                Logger.d(J, "process screenshot setting interstitial is_animated field to " + z11);
            }
            if (!TextUtils.isEmpty(strA)) {
                if (nVar.f52695ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) && jVarL != null) {
                    jVarL.f52624f = BrandSafetyUtils.b(bitmap);
                }
                Logger.d(J, "process screenshot - before reporting, debug info is: " + nVar.B());
                e(nVar, "processScreenshot");
                nVar.d(true);
            }
            a(nVar.L);
        }
    }

    private void a(n nVar, String str, ViewGroup viewGroup, List<WeakReference<WebView>> list, List<String> list2, List<String> list3, int i10) {
        int i11 = i10 + 1;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= viewGroup.getChildCount()) {
                return;
            }
            View childAt = viewGroup.getChildAt(i13);
            list2.add(BrandSafetyUtils.a(childAt));
            list3.add("h" + i11 + "c" + (i13 + 1) + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt);
            if (childAt instanceof WebView) {
                list.add(new WeakReference<>((WebView) childAt));
                Logger.d(J, "find WebViews in view group - found view: " + childAt + " , parent: " + childAt.getParent().toString());
            } else if (childAt instanceof ViewGroup) {
                a(nVar, str, (ViewGroup) childAt, list, list2, list3, i11);
            }
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null) {
                if (a(str, childAt) && nVar.f51880m != null && nVar.i() == null) {
                    Logger.d(J, "find WebViews in view group - found ad view: " + childAt + " , parent: " + childAt.getParent().toString());
                    String strC = adNetworkDiscoveryH.c(childAt);
                    if (strC != null) {
                        Logger.d(J, "find WebViews in view group - found adId: " + strC);
                        CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) strC);
                        if (creativeInfoA != null) {
                            Logger.d(J, "find WebViews in view group - found CI for adId " + strC + " : " + creativeInfoA);
                            creativeInfoA.a((Object) childAt);
                            if (nVar.A != null) {
                                String strName = BrandSafetyUtils.a(nVar.A).name();
                                Logger.d(J, "find WebViews in view group - setting ad format type to " + strName);
                                creativeInfoA.p(strName);
                                nVar.e("ad_type_upd(fndWVUndrVGroup):" + strName);
                            }
                            a(new o(creativeInfoA, CreativeInfo.f52485n, BrandSafetyUtils.a(childAt)));
                        }
                    }
                }
                if (!nVar.V && adNetworkDiscoveryH.a(childAt)) {
                    Logger.d(J, "find WebViews in view group - native player identified");
                    nVar.a(ImpressionLog.f51745o, new ImpressionLog.a(ImpressionLog.K, "native"));
                }
                nVar.V = nVar.V || adNetworkDiscoveryH.a(childAt);
            }
            i12 = i13 + 1;
        }
    }

    private void a(n nVar, boolean z10) {
        Logger.d(J, "set on video completed started, eventId  : " + nVar.L);
        if (nVar.H || !z10) {
            if (z10) {
                return;
            }
            nVar.H = false;
            nVar.f52689aa = false;
            nVar.a(ImpressionLog.f51745o, new ImpressionLog.a(ImpressionLog.K, C3978d4.i.K));
            return;
        }
        a((c) nVar, z10);
        CreativeInfo creativeInfoI = nVar.i();
        if (creativeInfoI != null && !creativeInfoI.v()) {
            creativeInfoI.d(true);
        }
        nVar.H = true;
        nVar.a(ImpressionLog.f51746p, new ImpressionLog.a[0]);
    }

    private synchronized void a(o oVar, String str) {
        if (oVar != null) {
            if (oVar.f52705a != null) {
                List<o> arrayList = this.P.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.P.put(str, arrayList);
                }
                if (CreativeInfoManager.a(str, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                    Logger.d(J, "NOT adding as pending (config based), sdk: " + str + " matching info: " + oVar);
                } else {
                    Logger.d(J, "adding as pending for SDK: " + oVar.f52705a.Q() + " matching info: " + oVar);
                    arrayList.add(oVar);
                }
            }
        }
    }

    private void a(String str, a aVar, String str2) {
        Logger.d(J, "match CI started, sdk = " + str + ", interstitial key = " + aVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (aVar.f51794b != null) {
            Logger.d(J, "match CI - interstitial key: " + aVar);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH == null || adNetworkDiscoveryH.d() == null || !adNetworkDiscoveryH.d().a(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false)) {
                Logger.d(J, "match CI - sdk not configured to allow max events based matching");
                return;
            }
            Logger.d(J, "match CI - discovery configuration: " + adNetworkDiscoveryH.d());
            String str3 = aVar.f51793a + "_" + aVar.f51794b + "_" + str;
            CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) str3);
            if (creativeInfoA == null) {
                Logger.d(J, "match CI - ci not found");
                return;
            }
            Logger.d(J, "match CI - discovery class returned a ci: " + creativeInfoA);
            if (creativeInfoA.m() == null) {
                creativeInfoA.f(aVar.f51794b);
            }
            creativeInfoA.p(BrandSafetyEvent.AdFormatType.INTER.name());
            creativeInfoA.u("ad_type_upd(matchCI):" + BrandSafetyEvent.AdFormatType.INTER.name());
            a(new o(creativeInfoA, CreativeInfo.f52485n, str3));
        }
    }

    private void a(List<WeakReference<WebView>> list, n nVar) {
        Iterator<WeakReference<WebView>> it = list.iterator();
        while (it.hasNext()) {
            WebView webView = it.next().get();
            if (webView != null) {
                String strA = BrandSafetyUtils.a((Class) webView.getClass());
                if (!TextUtils.isEmpty(strA) && !strA.equals(nVar.c()) && strA.equals(com.safedk.android.utils.g.f53134h)) {
                    Logger.d(J, "identify scar-admob - webView is Admob: " + webView + ", current interstitial info: " + nVar);
                    nVar.T = true;
                }
            }
        }
    }

    private boolean a(int i10, int i11) {
        return i10 == BrandSafetyUtils.a() && i11 == BrandSafetyUtils.b();
    }

    private boolean a(int i10, long j10) {
        Logger.d(J, "should stop sampling started, maxUniformedPixelsCount=" + i10 + ", fileSize=" + j10 + " (bytes), stopSamplingFileSize=" + SafeDK.getInstance().K());
        boolean z10 = BrandSafetyUtils.a(i10) && j10 > SafeDK.getInstance().K();
        Logger.d(J, "should stop sampling returned " + z10);
        return z10;
    }

    private boolean a(CreativeInfo creativeInfo, n nVar) {
        if (creativeInfo == null || nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching - current activity interstitial: " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar.L != null && creativeInfo.m() != null && !nVar.L.equals(creativeInfo.m())) {
            Logger.d(J, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + nVar.L);
            if (!CreativeInfoManager.a(nVar.f51889v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.m());
        }
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(creativeInfo.R() == null ? creativeInfo.Q() : creativeInfo.R());
        if (adNetworkDiscoveryH != null) {
            if (adNetworkDiscoveryH.b() != AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                return a(creativeInfo.ae(), creativeInfo.af(), nVar);
            }
            if (nVar.r() != null) {
                String string = nVar.r().getString(BrandSafetyEvent.f52756k);
                String string2 = nVar.r().getString("ad_format");
                if (creativeInfo.F() == null || (string != null && string.equals(creativeInfo.F()))) {
                    Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                    return true;
                }
                Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, verification failed for CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                nVar.e("verifyMatchingFailed|placement=(" + string + StringUtils.COMMA + creativeInfo.F() + ")|format=(" + string2 + StringUtils.COMMA + creativeInfo.F() + ")");
                return false;
            }
        }
        Logger.d(J, "verify matching, no InterstitialInfo or no discovery for " + creativeInfo.Q());
        return false;
    }

    private boolean a(n nVar, View view) {
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.c());
        if (adNetworkDiscoveryH == null || !nVar.V || !adNetworkDiscoveryH.b(view)) {
            return false;
        }
        if (nVar.H) {
            return true;
        }
        Logger.d(J, "is native video player completed - native video end, info:" + nVar);
        nVar.a(ImpressionLog.f51746p, new ImpressionLog.a[0]);
        nVar.H = true;
        return true;
    }

    private boolean a(o oVar, n nVar) {
        BrandSafetyEvent.AdFormatType adFormatTypeA;
        if (nVar == null) {
            return false;
        }
        CreativeInfo creativeInfo = oVar.f52705a;
        Logger.d(J, "set CI details - ad info sdk: " + nVar.c() + ", CI sdk: " + creativeInfo.Q() + " ad info webview address: " + nVar.K + ", ci matching object address: " + creativeInfo.af());
        if (nVar.A != null) {
            Logger.d(J, "set CI details - CI ad format: " + creativeInfo.I() + ", max ad type: " + nVar.A.getString("ad_format"));
            BrandSafetyEvent.AdFormatType adFormatTypeA2 = BrandSafetyUtils.a(nVar.A);
            if ((creativeInfo.I() == null || !creativeInfo.I().equals(adFormatTypeA2.name())) && adFormatTypeA2 != null) {
                Logger.d(J, "set CI details - updating ad format value to " + adFormatTypeA2.name());
                creativeInfo.p(adFormatTypeA2.name());
                nVar.e("ad_type_upd(sCrInfoDtls):" + adFormatTypeA2.name());
            }
        }
        if (nVar.f51889v != null && (nVar.f51889v.equals(creativeInfo.Q()) || nVar.f51889v.equals(creativeInfo.R()))) {
            if (nVar.U) {
                Logger.d(J, "set CI details - ad is already finished, cannot set creative info");
                return false;
            }
            Logger.d(J, "set CI details - currentMaxPackageName: " + nVar.f51889v);
            if (a(creativeInfo, nVar)) {
                Logger.d(J, "set CI details - setting as current CI for SDK: " + creativeInfo.Q());
                if (nVar.i() != null) {
                    Logger.d(J, "set CI details - replacing CI " + nVar.i());
                }
                if (creativeInfo.I() == null && (adFormatTypeA = BrandSafetyUtils.a(nVar.A)) != null) {
                    Logger.d(J, "set CI details - Start monitoring ad check, updating ad format value to " + adFormatTypeA.name());
                    creativeInfo.p(adFormatTypeA.name());
                    nVar.e("ad_type_upd(shldStrtMntrngAd):" + adFormatTypeA.name());
                }
                b(creativeInfo, nVar);
                if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false) && creativeInfo.F() != null && nVar.y() != null && creativeInfo.F().contains(nVar.y())) {
                    Logger.d(J, "set CI details - replacing ci placement " + creativeInfo.F() + " with Max placement " + nVar.y());
                    creativeInfo.h(nVar.y());
                }
                try {
                    boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    com.safedk.android.utils.k.b(J, "set CI details - Multi ad detectMultipleAdsByWebview =  " + zA + ", currentActivityInterstitial.isMultiAd() = " + nVar.f() + ", currentActivityInterstitial.getImpression() != null ?" + (nVar.h() != null) + ", currentActivityInterstitial.getImpression().getCreativeInfo() != null ? " + (nVar.h().c() != null) + ", getImpressionList = " + nVar.g());
                    if (zA && nVar.f() && nVar.h() != null && nVar.h().c() != null) {
                        Logger.d(J, "set CI details - Multi ad, current impression already has a CI. not calling setCreativeInfo.");
                        return false;
                    }
                } catch (Throwable th2) {
                    Logger.d(J, "Exception in set CI details - Multi ad : " + th2.getMessage(), th2);
                }
                return b(oVar, nVar);
            }
        }
        a(oVar, creativeInfo.Q());
        creativeInfo.u("apci|ts=" + System.currentTimeMillis() + "|i=" + oVar.f52707c + ";" + oVar.f52706b + "|o=" + oVar.f52705a.ae() + ";" + oVar.f52705a.af());
        b(creativeInfo, nVar);
        return false;
    }

    private boolean a(String str, String str2, n nVar) {
        if (nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching object started, event ID: " + nVar.L + ", object address: " + str2 + ", webview address: " + nVar.K + ", object type: " + str + ", currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        boolean zA = CreativeInfoManager.a(nVar.f51889v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str) || zA) {
            Logger.d(J, "verify matching object skipped, event ID: " + nVar.L + ", object address: " + str2 + ", object type: " + str + ", sdkInterstitialsRunOnAppActivity: " + zA);
            return true;
        }
        if (nVar.x() == null || !nVar.x().contains(str2)) {
            Logger.d(J, "verify matching object failed, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
            return false;
        }
        Logger.d(J, "verify matching object done, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CreativeInfo> b(ViewGroup viewGroup, String str) {
        List<CreativeInfo> listA;
        Logger.d(J, "get creative info from ad view started : " + viewGroup.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Logger.d(J, "get creative info from ad view - child " + childAt.toString());
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && (listA = adNetworkDiscoveryH.a(new WeakReference<>(childAt), (String) null, false)) != null) {
                for (CreativeInfo creativeInfo : listA) {
                    creativeInfo.a((Object) childAt);
                    creativeInfo.u("ci_source_sdk_class=" + childAt.getClass().getName());
                    Logger.d(J, "get creative info from ad view - ci found, object : " + childAt.toString());
                }
                return listA;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    private void b(CreativeInfo creativeInfo, n nVar) {
        if (nVar != null) {
            if (nVar.f52699ak == null || nVar.f52699ak.isCancelled()) {
                Logger.d(J, "Set CI details - task future is: " + nVar.f52699ak + ", is scanning? " + nVar.f52700al + " is ad finished? " + nVar.U);
                if (nVar.f52700al) {
                    Logger.d(J, "set CI details - avoid recursive call to web view scanning");
                    creativeInfo.u("avoidRecWebScan");
                } else {
                    Logger.d(J, "set CI details - starting timer for InterstitialInfo with event id: " + nVar.w());
                    e(nVar);
                    nVar.Z = 0L;
                    nVar.f52699ak = this.D.scheduleAtFixedRate(new b(nVar.L), 500L, 1000L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    private void b(n nVar) {
        Logger.d(J, "handle DID_CLICKED started , isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null) {
            Logger.d(J, "current activity interstitial is null");
            return;
        }
        nVar.a(true);
        if (nVar.e() != null) {
            Logger.d(J, "current activity interstitial already have click url");
            return;
        }
        if (nVar.f52697ai == null) {
            Logger.d(J, "current activity interstitial doesn't have click url candidate");
            return;
        }
        if (nVar.f52697ai.f52580a == 0) {
            Logger.d(J, "current click url candidate has zero timestamp");
            return;
        }
        Logger.d(J, "handle DID_CLICKED checking click url candidate");
        if (System.currentTimeMillis() - nVar.f52697ai.f52580a >= 20000) {
            Logger.d(J, "click url candidate's timestamp is not within the time range");
        } else {
            Logger.d(J, "handle DID_CLICKED setting click url");
            nVar.c(nVar.f52697ai.f52581b);
        }
    }

    private void b(n nVar, boolean z10) {
        Logger.d(J, "stop taking screenshots for impression. starting. address = " + nVar.K);
        if (nVar == null) {
            Logger.d(J, "stop taking screenshots for impression. info is null.");
            return;
        }
        if (!z10 && !this.H) {
            Logger.d(J, "stop taking screenshots for impression. Request to stop taking screenshots received when no max ad is active. ignoring");
            return;
        }
        nVar.f52693ae = true;
        a(nVar.h());
        Logger.d(J, "stop taking screenshots for impression. attempting to clear image hash and files");
        j jVarL = nVar.l();
        if (jVarL == null || jVarL.f52620b == null) {
            Logger.d(J, "stop taking screenshots for impression. no active ci or no image taken.");
        } else {
            a(nVar, jVarL);
        }
        e(nVar, "stopTakingScreenshotsForImpression");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object obj) {
        Logger.d(J, "on video completed - sdk = " + str + ", source = " + obj);
        n nVarA = null;
        if (obj != null) {
            nVarA = this.F.a(BrandSafetyUtils.a(obj), false);
            Logger.d(J, "on video completed - sdk = " + str + ", found interstitialInfo : " + nVarA);
        }
        if (nVarA != null) {
            c(nVarA, str);
            return;
        }
        synchronized (this) {
            Iterator<n> it = this.F.values().iterator();
            while (it.hasNext()) {
                c(it.next(), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b(o oVar, n nVar) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        boolean z10 = false;
        synchronized (this) {
            Logger.d(J, "set CI started, matching info=" + (oVar == null ? "null" : oVar.toString()) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (oVar == null) {
                Logger.d(J, "set CI, matching info is null");
            } else {
                CreativeInfo creativeInfo = oVar.f52705a;
                if (creativeInfo != null) {
                    Logger.d(J, "set CI, matching info is " + oVar);
                    if (nVar != null) {
                        if (nVar.i() == null || nVar.i().ah()) {
                            creativeInfo.a(oVar.f52706b, oVar.f52707c);
                            Logger.d(J, "set CI: " + creativeInfo);
                            nVar.a(creativeInfo);
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false) && (adNetworkDiscoveryH = CreativeInfoManager.h(creativeInfo.Q())) != null) {
                                adNetworkDiscoveryH.b(creativeInfo);
                            }
                            if (nVar.J != AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || nVar.K == null) {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo, (String) null);
                            } else {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(nVar.K, creativeInfo);
                            }
                            if (oVar.f52706b.startsWith(CreativeInfo.f52479h)) {
                                nVar.u();
                            }
                            b(nVar, creativeInfo);
                            e(nVar, "setCreativeInfo");
                            if (creativeInfo.v()) {
                                nVar.H = false;
                            }
                            if (!nVar.f52696ah && StatsReporter.b().a(creativeInfo, nVar)) {
                                nVar.f52696ah = true;
                            }
                            z10 = true;
                        } else {
                            CreativeInfoManager.b(creativeInfo);
                            com.safedk.android.utils.k.b(J, "set CI, already matched! ignore matching attempt CI: " + creativeInfo);
                        }
                    }
                }
            }
        }
        return z10;
    }

    private String c(View view) {
        return BrandSafetyUtils.b(view.getClass());
    }

    private void c(n nVar, String str) {
        if (nVar != null) {
            Logger.d(J, "on video completed - started, sdkPackageName = " + str + ", eventId = " + nVar.L);
            if (!nVar.f51889v.equals(str) || nVar.H) {
                return;
            }
            a((c) nVar, true);
            nVar.H = true;
            nVar.a(ImpressionLog.f51746p, new ImpressionLog.a[0]);
            Logger.d(J, "on video completed - set to true, sdkPackageName = " + str + ", eventId = " + nVar.L);
        }
    }

    private boolean c(n nVar) {
        ScheduledFuture<?> scheduledFuture = nVar != null ? nVar.f52699ak : null;
        Logger.d(J, "shouldStartTimer started, taskFuture = " + scheduledFuture + ", isisCancelled = " + (scheduledFuture != null ? Boolean.valueOf(scheduledFuture.isCancelled()) : null));
        if (nVar != null) {
            Logger.d(J, "shouldStartTimer - inter activity is: " + nVar.f52701am);
            Logger.d(J, "shouldStartTimer - inter activity CI is: " + nVar.i());
        }
        boolean z10 = nVar != null && (scheduledFuture == null || scheduledFuture.isCancelled()) && !(nVar.f52701am == null && (nVar.i() == null || nVar.i().f() == null));
        Logger.d(J, "shouldStartTimer returned: " + z10);
        return z10;
    }

    private Activity d(n nVar) {
        return nVar.f52698aj ? com.safedk.android.internal.b.getInstance().getForegroundActivity() : nVar.f52701am;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(n nVar, String str) {
        if (nVar == null) {
            Logger.d(J, "clean and report - current interstitial info is NULL, SKIPPING");
            return;
        }
        synchronized (this.F) {
            if (nVar.E()) {
                Logger.d(J, "clean and report - already run, SKIPPING");
            } else {
                nVar.f(true);
                try {
                    Logger.d(J, "clean and report started, activity class=" + str + ", eventId = " + nVar.L + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    if (str == null) {
                        str = nVar.f52691ac;
                        Logger.d(J, "clean and report - activity class set to (curr intractname) " + nVar.f52691ac);
                    }
                    String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
                    for (l lVar : nVar.g()) {
                        if (lVar.c() != null) {
                            Logger.d(J, "clean and report - activity SDK = " + sdkPackageByClass + ", CI SDK = " + lVar.c().Q() + ", interstitial activity name=" + nVar.f52691ac);
                            Logger.d(J, "clean and report - currentMaxPackageName = " + nVar.f51889v + ", activitySdk = " + sdkPackageByClass);
                            if (nVar.f51889v != null && !nVar.f51889v.equals(sdkPackageByClass) && !nVar.f51889v.equals(lVar.c().Q()) && !nVar.f52698aj) {
                                Logger.d(J, "clean and report - skip reporting as no related WILL_DISPLAY message received, current Max package name: " + nVar.f51889v + ", activity SDK: " + sdkPackageByClass + ", CI SDK: " + lVar.c().Q());
                                lVar.a((CreativeInfo) null);
                            }
                        }
                        if (lVar.f52674b != null && lVar.f52674b.f52620b != null) {
                            lVar.f52675c = lVar.f52674b.f52620b;
                        } else if (nVar.b() != null) {
                            lVar.f52675c = nVar.b();
                        }
                        Logger.d(J, "clean and report - last impression screenshot filename set to " + lVar.f52675c);
                    }
                    if ((nVar.B == null || !nVar.B.equals(BrandSafetyUtils.a(str, true))) && !CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                        Logger.d(J, "clean and report - DID NOT enter unload logic, current interstitial info=" + nVar);
                    } else {
                        for (l lVar2 : nVar.g()) {
                            if (lVar2 != null && lVar2.f52674b != null && lVar2.f52674b.f52620b != null && nVar.b() != null) {
                                if (this.B.size() < SafeDK.getInstance().J()) {
                                    Logger.d(J, "clean and report - image files: " + lVar2.f52674b.f52620b + ", " + nVar.f51887t);
                                    Logger.d(J, "clean and report - waiting to report file: " + nVar.f51887t + ", impression ID: " + lVar2.f52673a);
                                    a(nVar, lVar2);
                                    com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload addAdInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
                                } else if (!d(nVar.f51886s, lVar2.f52673a)) {
                                    BrandSafetyUtils.d(nVar.f51887t);
                                    nVar.f52690ab = null;
                                    nVar.f51887t = null;
                                }
                                Logger.d(J, "clean and report - hash value: " + lVar2.f52674b.f52619a + " orientation: " + lVar2.f52674b.f52624f);
                                if (lVar2.f52674b.f52619a == null && !nVar.f52693ae) {
                                    Logger.d(J, "clean and report - assigning last captured hash to interstitial: " + nVar.f52690ab);
                                    lVar2.f52674b.f52619a = nVar.f52690ab;
                                    lVar2.f52674b.f52624f = nVar.f51888u;
                                }
                                this.Q = lVar2.f52674b.f52619a;
                            }
                        }
                        nVar.f52694af = SystemClock.elapsedRealtime();
                        nVar.Z += nVar.f52694af - nVar.f52692ad;
                        Logger.d(J, "clean and report - Viewing time (ms) = " + nVar.Z);
                        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.f51889v);
                        if (adNetworkDiscoveryH != null) {
                            AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscoveryH.b();
                            for (CreativeInfo creativeInfo : nVar.j()) {
                                if (nVar.K != null) {
                                    String strL = nVar.K;
                                    if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                                        strL = creativeInfo.L();
                                        com.safedk.android.analytics.brandsafety.creatives.e.a(adNetworkDiscoveryH, strL);
                                    }
                                    Logger.d(J, "clean and report - attach resources to CI for webview/adId: " + strL);
                                    com.safedk.android.analytics.brandsafety.creatives.e.a(strL, creativeInfo);
                                    com.safedk.android.analytics.brandsafety.creatives.e.a(nVar.f51881n);
                                }
                                com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo);
                            }
                            Logger.d(J, "clean and report - number of CIs to report: " + nVar.j().size());
                            e(nVar, "onAdHidden");
                        }
                    }
                    if (str != null) {
                        Logger.d(J, "clean and report - removing from activities : " + str);
                        synchronized (this.G) {
                            this.G.remove((Object) str);
                        }
                    }
                    b((c) nVar);
                } catch (Throwable th2) {
                    Logger.e(J, "Exception in clean and report : " + th2.getMessage(), th2);
                } finally {
                    a(nVar.L);
                    p(nVar.L);
                }
            }
        }
    }

    private synchronized void e() {
        ArrayList<String> arrayList = new ArrayList();
        for (n nVar : this.F.values()) {
            if (nVar.N && nVar.B == null) {
                arrayList.add(nVar.L);
                e(nVar, "reportPreviousFailedImpressions");
                b((c) nVar);
            }
        }
        for (String str : arrayList) {
            Logger.d(J, "report previous failed impression, event ID: " + str);
            a(str);
            p(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final n nVar) {
        if (nVar == null || nVar.f52700al) {
            return;
        }
        Activity activity = nVar.f52701am;
        Logger.d(J, "scan for webViews started, activity: " + (activity == null ? "null" : activity.toString()) + ", currentActivityInterstitial.resourceMatching: " + nVar.J + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity == null || !BrandSafetyUtils.h(activity.getClass().getName())) {
            try {
                if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                    Logger.d(J, "scan for webViews : resourceMatching DEFAULT");
                    if (nVar.i() != null) {
                        View viewF = nVar.i().f();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList2.add(BrandSafetyUtils.a(viewF));
                        arrayList3.add("h1c1:" + viewF);
                        String strC = nVar.c() != null ? nVar.c() : "";
                        a(nVar, strC, (ViewGroup) viewF, arrayList, arrayList2, arrayList3, 1);
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT found viewHierarchy " + arrayList3);
                        if (nVar.x() != null) {
                            Logger.d(J, "scan for webViews resourceMatching DEFAULT previous ViewsHierarchy size :  " + nVar.x().size() + " , current : " + arrayList2.size());
                            long jA = CreativeInfoManager.a(strC, AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
                            if (jA > 0 && nVar.x().size() >= jA + ((long) arrayList2.size())) {
                                Logger.d(J, "scan for webViews resourceMatching DEFAULT End of video detected");
                                a(strC, (Object) viewF);
                            }
                        } else {
                            nVar.a(ImpressionLog.f51742l, new ImpressionLog.a(ImpressionLog.G, "none"));
                        }
                        nVar.a(arrayList2);
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                Logger.e(J, "scan for webViews resourceMatching DEFAULT exception : ", th2);
                return;
            } finally {
                Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                nVar.f52700al = false;
            }
        }
        try {
            nVar.f52700al = true;
            View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
            final AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.c());
            String strC2 = nVar.c() != null ? nVar.c() : "";
            if (adNetworkDiscoveryH == null) {
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            if (viewFindViewById != null) {
                arrayList5.add(BrandSafetyUtils.a(viewFindViewById));
                arrayList6.add("h1c1:" + viewFindViewById);
                a(nVar, strC2, (ViewGroup) viewFindViewById, arrayList4, arrayList5, arrayList6, 1);
                a(arrayList4, nVar);
                com.safedk.android.utils.k.b(J, "scan for webViews found views hierarchy : " + arrayList6);
            }
            if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP) {
                final WeakReference<WebView> weakReferenceA = adNetworkDiscoveryH.a((List<WeakReference<WebView>>) arrayList4, nVar.i() != null ? nVar.i().L() : null);
                if (weakReferenceA == null || weakReferenceA.get() == null) {
                    Logger.d(J, "scan for webViews - WebView not found");
                    if (nVar.f51880m == null) {
                        nVar.a(ImpressionLog.f51742l, new ImpressionLog.a(ImpressionLog.G, "none"));
                    }
                    nVar.a(arrayList5);
                } else {
                    nVar.a(arrayList5);
                    nVar.b(arrayList4);
                    final String strA = BrandSafetyUtils.a(weakReferenceA.get());
                    if (nVar.K == null) {
                        a(strA, ImpressionLog.f51742l, new ImpressionLog.a(ImpressionLog.G, strA));
                    }
                    SafeDKWebAppInterface.a(strA);
                    com.safedk.android.analytics.brandsafety.creatives.e.a(strA);
                    a((c) nVar);
                    if (nVar.K != null && nVar.K.equals(strA)) {
                        return;
                    }
                    Logger.d(J, "scan for webViews found " + weakReferenceA.get());
                    boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    Logger.d(J, "scan for webViews, should detect multiple ads by web view change? " + zA);
                    if (zA && nVar.K != null && !nVar.K.equals(strA)) {
                        g(nVar, strA);
                    }
                    nVar.K = strA;
                    Logger.d(J, "scan for webViews address set to " + strA);
                    Iterator<l> it = nVar.g().iterator();
                    while (it.hasNext()) {
                        CreativeInfo creativeInfoC = it.next().c();
                        Logger.d(J, "scan for webViews - current ci is: " + creativeInfoC);
                        if (creativeInfoC == null) {
                            Logger.d(J, "scan for webViews will check for pending CIs for package " + nVar.c());
                            Iterator<o> it2 = a(nVar.c(), nVar).iterator();
                            while (it2.hasNext()) {
                                b(it2.next(), nVar);
                            }
                        } else if (creativeInfoC.af() == null || arrayList5.contains(creativeInfoC.af())) {
                            Logger.d(J, "scan for webViews attempting to collect resources for " + strA + ", CI: " + creativeInfoC);
                            com.safedk.android.analytics.brandsafety.creatives.e.a(strA, creativeInfoC);
                        } else {
                            Logger.d(J, "scan for webViews skip resources collection for address: " + strA + ", CI: " + creativeInfoC);
                        }
                    }
                    if (adNetworkDiscoveryH.d() != null && adNetworkDiscoveryH.d().a(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f51655l)) {
                        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.10
                            @Override // java.lang.Runnable
                            public void run() {
                                if (weakReferenceA == null || weakReferenceA.get() == null) {
                                    return;
                                }
                                List<CreativeInfo> listA = adNetworkDiscoveryH.a(new WeakReference<>((View) weakReferenceA.get()), (String) null, false);
                                if (listA == null) {
                                    Logger.d(InterstitialFinder.J, "scan for webViews ci not found by View");
                                    return;
                                }
                                for (CreativeInfo creativeInfo : listA) {
                                    com.safedk.android.utils.k.b(InterstitialFinder.J, "scan for webViews ci returned : " + creativeInfo);
                                    if (creativeInfo.m() == null) {
                                        creativeInfo.f(nVar.L);
                                    }
                                    if (nVar.A != null && nVar.A.containsKey("ad_format")) {
                                        String strName = BrandSafetyUtils.a(nVar.A).name();
                                        creativeInfo.p(strName);
                                        nVar.e("ad_type_upd(scnFrWVs):" + strName);
                                        Logger.d(InterstitialFinder.J, "scan for webViews ad_format set to  : " + strName);
                                    }
                                    InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f52485n, strA));
                                }
                            }
                        });
                    }
                }
            } else if (viewFindViewById != null && nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                WeakReference<WebView> weakReferenceA2 = adNetworkDiscoveryH.a((List<WeakReference<WebView>>) arrayList4, (String) null);
                if (weakReferenceA2 == null || weakReferenceA2.get() == null) {
                    Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) - WebView not found");
                } else {
                    String strA2 = BrandSafetyUtils.a(weakReferenceA2.get());
                    if (nVar.K == null) {
                        a(strA2, ImpressionLog.f51742l, new ImpressionLog.a(ImpressionLog.G, strA2));
                    }
                    Logger.d(J, "scan for webViews found (DIRECT_CREATIVE_INFO) " + strA2);
                    nVar.K = strA2;
                    a((c) nVar);
                    CreativeInfo creativeInfoC2 = nVar.h().c();
                    if (creativeInfoC2 != null) {
                        Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) attempting to collect resources for " + strA2 + ", CI: " + creativeInfoC2);
                        com.safedk.android.analytics.brandsafety.creatives.e.a(strA2, creativeInfoC2);
                    }
                }
            } else if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                if (nVar.f51880m == null) {
                    nVar.a(ImpressionLog.f51742l, new ImpressionLog.a(ImpressionLog.G, "none"));
                }
                nVar.a(arrayList5);
            }
        } catch (Throwable th3) {
            Logger.e(J, "scan for webViews execution: ", th3);
        } finally {
            Logger.d(J, "scan for webViews - exit scanning");
            nVar.f52700al = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(n nVar, String str) {
        com.safedk.android.utils.k.b(J, "reporting event started, root= " + str + ", info=" + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null || !nVar.Y) {
            Logger.d(J, "reporting event - info is not interstitial, don't report info");
            return;
        }
        boolean z10 = !nVar.E;
        boolean z11 = !nVar.F && nVar.d();
        String string = null;
        if (nVar.A == null || !nVar.A.containsKey("id")) {
            Logger.d(J, "reporting event - no event ID");
        } else {
            string = nVar.A.getString("id");
            Logger.d(J, "reporting event - event ID: " + string);
        }
        ArrayList arrayList = new ArrayList();
        if (nVar.j().isEmpty()) {
            arrayList.add(a(nVar, nVar.h(), z11, string, (String) null));
            a((c) nVar);
        } else {
            Logger.d(J, "reporting event - number of CIs: " + nVar.j().size());
            synchronized (this) {
                for (l lVar : nVar.g()) {
                    if (lVar.c() != null && !nVar.c().equals(lVar.c().Q())) {
                        Logger.d(J, "reporting event without CI - sdk: " + nVar.c() + ", CI sdk: " + lVar.c().Q() + ", CI actual sdk: " + lVar.c().R());
                        lVar.a((CreativeInfo) null);
                    }
                    Logger.d(J, "reporting event (Check) root = " + str + ", debug info = " + nVar.B());
                    List listAsList = Arrays.asList(com.safedk.android.utils.g.f53135i, com.safedk.android.utils.g.f53128b, "com.unity3d.ads");
                    if (!TextUtils.isEmpty(nVar.B()) && str.equals("onAdHidden") && lVar.c() != null && listAsList.contains(lVar.c().Q()) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format") != null && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f51655l)) {
                        lVar.c().u(nVar.B());
                        String string2 = p.a().c().toString();
                        com.safedk.android.utils.k.b(J, "reporting event Invalid AppOpen impression detected ciDebugInfo = " + nVar.B() + " , lastMaxEvents = " + string2);
                        lVar.c().u(string2);
                    }
                    String str2 = null;
                    if (lVar.f52674b != null) {
                        Logger.d(J, "reporting event - image uniformity: " + lVar.f52674b.a(1000));
                        if (lVar.f52674b.f52619a != null && !nVar.f52693ae) {
                            str2 = lVar.f52674b.f52619a + "_" + lVar.f52673a;
                        }
                        f(nVar, str2);
                    }
                    arrayList.add(a(nVar, lVar, z11, string, str2));
                }
            }
        }
        Logger.d(J, "reporting event " + string + ", viewingTime = " + nVar.Z);
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(J, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z10) {
            nVar.b(true);
        }
        if (z11) {
            nVar.c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        String strB;
        String strA;
        String strA2;
        n nVarB;
        Set<String> set;
        n nVar;
        n nVar2;
        WeakReference<Activity> weakReferenceB;
        if (activity != null) {
            strA2 = BrandSafetyUtils.a(activity.toString(), true);
            strA = BrandSafetyUtils.a(activity.toString(), false);
            strB = BrandSafetyUtils.b(activity.getClass());
        } else {
            strB = null;
            strA = null;
            strA2 = null;
        }
        Logger.d(J, "interstitial finder start - activity name = " + activity + ", sdk = " + strB + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity != null) {
            nVarB = this.F.b(BrandSafetyUtils.a((Object) activity));
            Logger.d(J, "interstitial finder start - attempt to find by activity address, currentActivityInterstitial = " + nVarB);
        } else {
            nVarB = this.F.a(true) == 1 ? this.F.get(this.F.keySet().toArray()[0]) : null;
        }
        if (nVarB == null || strA2 == null || !strA2.equals(nVarB.B)) {
            Logger.d(J, "interstitial finder start - current activity interstitial = " + nVarB);
            if (nVarB == null) {
                set = null;
            } else if (strA == null || !nVarB.C.equals(strA)) {
                Set<String> set2 = nVarB.W;
                if (set2.contains(strA2)) {
                    Logger.d(J, "interstitial finder start - Ignoring restart of suspected mediation " + nVarB.f52691ac);
                    return;
                } else {
                    if (nVarB.B != null) {
                        set2.add(nVarB.B);
                    }
                    set = set2;
                }
            } else {
                Logger.d(J, "interstitial finder start - current activity interstitial class name = " + nVarB.C + ", activity class name = " + strA);
                set = null;
            }
            List<o> arrayList = new ArrayList<>();
            Logger.d(J, "interstitial finder start - start current activity interstitial is " + nVarB);
            if (nVarB != null && !nVarB.E && !nVarB.j().isEmpty()) {
                Logger.d(J, "interstitial finder start - current activity interstitial != null : " + nVarB);
                List<CreativeInfo> listJ = nVarB.j();
                if (listJ.isEmpty()) {
                    Logger.d(J, "interstitial finder start - current CI is null");
                } else {
                    for (CreativeInfo creativeInfo : listJ) {
                        if (creativeInfo != null) {
                            Logger.d(J, "interstitial finder start - setting current activity interstitials CI: " + creativeInfo);
                            arrayList.add(new o(creativeInfo, creativeInfo.V(), creativeInfo.U()));
                        } else {
                            Logger.d(J, "interstitial finder start - current CI matching method not equal, current CI: " + creativeInfo);
                        }
                    }
                }
                Logger.d(J, "interstitial finder start - current activity interstitial impression reported? " + nVarB.E);
                b(nVarB, true);
            }
            Logger.d(J, "interstitial finder start - activity : " + activity + ", activities : " + this.G.a());
            if (this.F.a(true) > 0 && this.G.size() > 0) {
                for (n nVar3 : this.F.c()) {
                    if (activity == null && (weakReferenceB = this.G.b(nVar3.f51889v)) != null && weakReferenceB.get() != null) {
                        Activity activity2 = weakReferenceB.get();
                        Logger.d(J, "interstitial finder start - activity set to " + activity2);
                        activity = activity2;
                    }
                    if (activity != null) {
                        String strB2 = BrandSafetyUtils.b(activity.getClass());
                        Logger.d(J, "interstitial finder start - activity : " + activity + ", activitySdk : " + strB2 + ", InterstitialInfo sdk : " + nVar3.f51889v);
                        nVar3.f52692ad = SystemClock.elapsedRealtime();
                        if (nVar3.f51889v != null && strB2 != null && strB2.equals(nVar3.f51889v)) {
                            a(activity, nVar3);
                            nVar2 = nVar3;
                        } else if (com.safedk.android.utils.g.f53134h.equals(strB2) && A.contains(nVar3.f51889v)) {
                            Logger.d(J, "interstitial finder start - maybe scar-admob");
                            nVar2 = nVarB;
                        } else {
                            Logger.d(J, "interstitial finder start - activity SDK is not compatible with interstitial SDK");
                        }
                    } else {
                        nVar2 = nVarB;
                    }
                    a(nVar3, activity);
                    nVarB = nVar2;
                }
            }
            synchronized (this) {
                Logger.d(J, "interstitial finder start - scanning " + this.F.a(false) + " inter infos");
                for (n nVar4 : this.F.values()) {
                    if (nVar4.U) {
                        Logger.d(J, "interstitial finder start - skipping on iterating ad that finished, interstitial info: " + nVar4);
                    } else {
                        Logger.d(J, "interstitial finder start - setting the current activity interstitial to: " + nVar4);
                        if (nVar4.f51889v != null) {
                            Logger.d(J, "interstitial finder start - current Max package name: " + nVar4.f51889v);
                            boolean zA = CreativeInfoManager.a(nVar4.f51889v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
                            if (activity != null && !BrandSafetyUtils.d(activity.getClass()) && !zA) {
                                Logger.d(J, "interstitial finder start - current foreground activity is not a supported ad activity");
                                return;
                            }
                            if (!zA && activity != null) {
                                Logger.d(J, "interstitial finder start - checking pending ci for no activity sdk " + nVar4.f51889v);
                                arrayList = a(nVar4.f51889v, nVar4);
                                for (o oVar : arrayList) {
                                    Logger.d(J, "interstitial finder start - found pending ci(s) for no activity sdk, mi : " + oVar);
                                    b(oVar, nVar4);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(this.I)) {
                            nVar4.L();
                            Logger.d(J, "interstitial finder start - no CI so adding the noCIDebug to CIDebugInfo");
                        } else {
                            nVar4.e(this.I);
                            Logger.d(J, "interstitial finder start - ci_debug_info set to " + this.I);
                        }
                        if (nVar4.f52701am != null) {
                            e(nVar4);
                            if (arrayList.isEmpty()) {
                                arrayList = a(strB, nVar4);
                            }
                            nVar4.Z = 0L;
                        }
                        if (CreativeInfoManager.a(nVar4.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                            nVar4.f52692ad = SystemClock.elapsedRealtime();
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. sdk = " + nVar4.c());
                            arrayList = a(nVar4.c(), nVar4);
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. found " + arrayList.size() + " items");
                        }
                        for (o oVar2 : arrayList) {
                            if (oVar2 != null && oVar2.f52705a != null) {
                                b(oVar2, nVar4);
                            }
                        }
                        if (set != null) {
                            nVar4.W = set;
                        }
                        nVarB = nVar4;
                    }
                }
                nVar = nVarB;
            }
        } else {
            boolean zA2 = CreativeInfoManager.a(strB, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            j jVarL = nVarB.l();
            if (!zA2 && jVarL != null && !TextUtils.isEmpty(jVarL.f52619a) && a(jVarL.f52622d, jVarL.f52621c)) {
                Logger.d(J, "interstitial finder start - Not starting timer on activity " + nVarB.f52691ac + " -- impression already logged");
                return;
            } else {
                Logger.d(J, "interstitial finder start - Starting counter from previous value " + nVarB.s());
                nVarB.I();
                nVar = nVarB;
            }
        }
        Logger.d(J, "interstitial finder start - before timer, time interstitial info event id is: " + (nVar != null ? nVar.L : null));
        if (c(nVar)) {
            Logger.d(J, "interstitial finder start - starting timer for InterstitialInfo with eventId " + nVar.w());
            nVar.f52699ak = this.D.scheduleAtFixedRate(new b(nVar.L), 500L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void f(n nVar, String str) {
        Logger.d(J, "add CI debug info started, hashValue " + str + ", info=" + nVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        for (l lVar : nVar.g()) {
            if (lVar.c() == null || lVar.f52674b == null || str == null || lVar.f52674b.f52619a == null || lVar.f52674b.f52624f == null || nVar.n() == null) {
                Logger.d(J, "add CI debug info - no creative info or hash is null");
            } else {
                String strA = BrandSafetyUtils.a(BrandSafetyUtils.AdType.INTERSTITIAL, lVar.f52674b.f52619a, nVar.c(), nVar.n(), lVar.f52674b.f52624f);
                if (!new File(strA).exists()) {
                    Logger.d(J, "add CI debug info - screenshot file path doesn't exist: " + strA);
                } else if (lVar.c().U() == null || !lVar.c().U().contains("screenshot_datetime")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    lVar.c().u("screenshot_datetime=" + jCurrentTimeMillis);
                    Logger.d(J, "add CI debug info: " + jCurrentTimeMillis);
                } else {
                    Logger.d(J, "add CI debug info - stats repo is null or already contains this event");
                }
            }
            if (lVar != null && lVar.c() != null && this.B.size() > 2) {
                synchronized (this.B) {
                    Logger.d(J, "add CI debug info - adding pending images info to ci_debug_info : image_id_pending : " + this.B.keySet());
                    lVar.c().u("image_id_pending : " + this.B.keySet());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Activity activity) {
        try {
            Logger.d(J, "interstitial finder stop, activity = " + activity.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            n nVarB = this.F.b(activity.toString());
            if (nVarB != null) {
                if (nVarB.f52691ac == null || activity.toString().equals(nVarB.f52691ac)) {
                    Logger.d(J, "Stopping interstitial finder for activity " + nVarB.f52691ac);
                    a(nVarB.L);
                    Logger.d(J, "interstitial finder, viewing time (ms) = " + nVarB.Z);
                }
            }
        } catch (Throwable th2) {
            Logger.e(J, th2.getMessage(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private void g(n nVar, String str) {
        Logger.d(J, "handle web view change, web view change detected from: " + nVar.K + ", to: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        l lVarH = nVar.h();
        if (lVarH != null && lVarH.c() != null && !lVarH.c().ah()) {
            lVarH.c().ai();
            String strH = lVarH.c().h();
            if (strH != null) {
                lVarH.c().c(strH + CreativeInfo.aJ);
            }
        }
        nVar.g().add(new l(UUID.randomUUID().toString()));
        Logger.d(J, "handle WebView Change - new Impression info object created. number of impressions in ad : " + nVar.g().size());
        if (nVar.D == null) {
            nVar.D = UUID.randomUUID().toString();
        }
        nVar.f52693ae = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        n nVarB = this.F.b(str);
        if (str == null || nVarB == null || nVarB.c() == null) {
            return false;
        }
        Logger.d(J, "instances of same activity - current activity class name = " + nVarB.p() + ",  current activity address = " + nVarB.o());
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVarB.c());
        if (adNetworkDiscoveryH == null || adNetworkDiscoveryH.d() == null || !adNetworkDiscoveryH.d().a(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false)) {
            return false;
        }
        Logger.d(J, "instances of same activity - discovery configuration = " + adNetworkDiscoveryH.d());
        String str2 = nVarB.p() + "@" + nVarB.o();
        Logger.d(J, "instances of same activity - current activity = " + str2);
        if (str.equals(str2)) {
            return false;
        }
        Logger.d(J, "instances of same activity - activityClass " + str2 + " is a different instance of the same activity");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        Logger.d(J, "stop timers - canceling timer for interstitials, eventId = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        n nVarD = this.F.d(str);
        if (nVarD != null) {
            if (nVarD.s() == 0) {
                nVarD.f52690ab = null;
            }
            if (this.F.size() < 1 || this.F.a()) {
                this.O = 0L;
            }
            if (nVarD.f52699ak != null) {
                Logger.d(J, "stop timers - calling timer cancel.");
                if (nVarD.f52699ak.cancel(true)) {
                    return;
                }
                Logger.d(J, "stop timers - failed to call timer cancel.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (str != null) {
            synchronized (this.G) {
                Logger.d(J, "Activity destroyed activity class: " + str + ", activities: " + this.G.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                this.G.remove((Object) str);
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
            n nVarB = this.F.b(str);
            if (nVarB != null) {
                if (sdkPackageByClass != null && nVarB.f51889v != null && !sdkPackageByClass.equals(nVarB.f51889v)) {
                    Logger.d(J, "Activity destroyed, activity SDK does not fit the WILL_DISPLAY msg: " + sdkPackageByClass);
                    return;
                }
                if (nVarB.f52691ac != null && !nVarB.f52691ac.equals(str)) {
                    Logger.d(J, "Activity destroyed, activity address (" + str + " ) does not match the address of the ad's activity (" + nVarB.f52691ac + ")");
                    return;
                }
                Logger.d(J, "Activity destroyed, calling onAdHidden");
                nVarB.a(ImpressionLog.C, new ImpressionLog.a[0]);
                a(nVarB, str);
            }
        }
    }

    private void p(String str) {
        Logger.d(J, "clearing AppLovin bundle, eventId = " + str);
        this.H = this.F.size() != 0;
        Logger.d(J, "clear variables, maxAdIsActive set to " + this.H);
        if (str != null) {
            synchronized (this) {
                this.F.remove(str);
            }
            Logger.d(J, "clear variables, removing " + str + " from currentInterstitialInfos");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new n(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        for (n nVar : this.F.values()) {
            Logger.d(J, "get CI by webView address, hierarchy:" + nVar.f51880m + ", webViewAddress: " + str2);
            if (nVar != null) {
                boolean z10 = nVar.K != null && nVar.K.equals(str2);
                boolean z11 = nVar.f51880m != null && nVar.f51880m.contains(str2);
                if (z10 || z11) {
                    return nVar.k();
                }
            }
        }
        return null;
    }

    public void a(Bitmap bitmap, n nVar, Activity activity) {
        activity.runOnUiThread(new AnonymousClass9(nVar, bitmap));
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public void a(l lVar) {
        Logger.d(J, "remove impression screenshots started");
        if (lVar == null || lVar.f52675c == null) {
            Logger.d(J, "no last activity impression screenshot filename");
        } else {
            Logger.d(J, "Calling remove ad files, filename = " + lVar.f52675c);
            BrandSafetyUtils.d(lVar.f52675c);
            lVar.f52675c = null;
        }
        this.C.clear();
    }

    public void a(n nVar) {
        if (nVar == null) {
            return;
        }
        Logger.d(J, "take screenshot started - currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Activity activity = nVar.f52701am;
        if (nVar.J()) {
            Logger.d(J, "take screenshot - sdk Interstitials Run On App Activity = " + nVar.f52698aj);
            if (nVar.f52701am != null && !BrandSafetyUtils.d(activity.getClass()) && !nVar.f52698aj) {
                Logger.d(J, "take screenshot - The activity is not supported : " + activity.getClass());
                return;
            }
            String str = nVar.f51889v;
            Activity activityD = d(nVar);
            Logger.d(J, "take screenshot - activity = " + activityD);
            try {
                Logger.d(J, "take screenshot - Run on UI thread in " + nVar.f52691ac);
                View viewK = nVar.K();
                Logger.d(J, "take screenshot - screenshot view: " + viewK);
                int iF = nVar.F();
                if (iF > 0 && (viewK instanceof ViewGroup)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(viewK));
                    a((ViewGroup) viewK, arrayList);
                    Logger.d(J, "take screenshot - views hierarchy size: " + arrayList.size());
                    if (iF < arrayList.size()) {
                        View view = (View) ((WeakReference) arrayList.get(iF)).get();
                        Logger.d(J, "take screenshot - get screenshot view, index: " + iF + ", view: " + view);
                        viewK = view;
                    } else {
                        nVar.H();
                        Logger.d(J, "take screenshot - reset screenshot view: " + viewK);
                    }
                }
                CreativeInfo creativeInfoI = nVar.i();
                String strC = (creativeInfoI == null || creativeInfoI.R() == null) ? nVar.c() : creativeInfoI.R();
                Logger.d(J, "take screenshot - AdMob sdk package name is " + strC);
                boolean zEquals = com.safedk.android.utils.g.f53134h.equals(strC);
                boolean zEquals2 = com.safedk.android.utils.g.f53132f.equals(nVar.c());
                if (creativeInfoI != null && VungleCreativeInfo.f52542a.equals(creativeInfoI.h())) {
                    Logger.d(J, "take screenshot - This ad is a VUNGLE_MRAID_AD");
                }
                if (creativeInfoI != null) {
                    Logger.d(J, "take screenshot - is video ad? " + creativeInfoI.v() + ", is vast video ad? " + creativeInfoI.y() + ", is multi ad? " + creativeInfoI.ah());
                }
                boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (SafeDK.getInstance().I() || zEquals || zEquals2) {
                    if (SafeDK.getInstance().I()) {
                        Logger.d(J, "take screenshot - SafeDK Config item 'AlwaysTakeScreenshot' is true");
                        a(nVar, viewK, activityD);
                        return;
                    } else if (creativeInfoI == null) {
                        Logger.d(J, "don't take screenshot - Admob/IronSource SDK but no ci yet");
                        return;
                    } else if (creativeInfoI.ah() && !zA) {
                        Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                        return;
                    } else {
                        Logger.d(J, "take screenshot - Admob/IronSource SDK");
                        a(nVar, viewK, activityD);
                        return;
                    }
                }
                if (creativeInfoI == null) {
                    Logger.d(J, "don't take screenshot - no creative info yet");
                    return;
                }
                if (creativeInfoI.w()) {
                    if (!creativeInfoI.f52512bb) {
                        Logger.d(J, "don't take screenshot - ad is playable. no endcard displaying");
                        return;
                    } else {
                        Logger.d(J, "take screenshot - playable ad finished. endcard is displaying");
                        a(nVar, viewK, activityD);
                        return;
                    }
                }
                if (creativeInfoI.ah() && !zA) {
                    Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                    return;
                }
                if (!creativeInfoI.v()) {
                    Logger.d(J, "take screenshot - ad is not a video/playable ad");
                    a(nVar, viewK, activityD);
                } else if (nVar.H || CreativeInfoManager.a(creativeInfoI.Q(), AdNetworkConfiguration.SHOULD_TAKE_INTERSTITIAL_SCREENSHOTS_THROUGHOUT_IMPRESSION, false)) {
                    Logger.d(J, "take screenshot - video ad finished playing or sdk configured to take screenshots throughout the impression");
                    a(nVar, viewK, activityD);
                } else if (!a(nVar, viewK)) {
                    Logger.d(J, "don't take screenshot - video hasn't finished playing yet, waiting for video completed event");
                } else {
                    Logger.d(J, "take screenshot - native video player completed");
                    a(nVar, viewK, activityD);
                }
            } catch (Throwable th2) {
                Logger.e(J, "Failed while taking screenshot", th2);
                new CrashReporter().caughtException(th2);
            }
        }
    }

    public void a(final n nVar, final String str) {
        Logger.d(J, "Ad hidden started, activityClass=" + (str == null ? "null" : str) + ", interstitial infos=" + this.F.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar != null) {
            if (m(str)) {
                Logger.d(J, "Ad hidden " + nVar.c() + " activity " + str + " unloaded but this is not the end of impression. not calling cleanAndReport");
            } else {
                nVar.U = true;
                this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.7
                    @Override // java.lang.Runnable
                    public void run() {
                        InterstitialFinder.this.d(nVar, str);
                    }
                }, 3L, TimeUnit.SECONDS);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.n(str);
                }
            });
        } else {
            n(str);
        }
    }

    public void a(String str, Bundle bundle) {
        n nVar;
        if (!this.F.containsKey(str) || (nVar = this.F.get(str)) == null) {
            Logger.d(J, "Revenue event - no interstitial info found for event " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        if (bundle.getString("revenue_event") != null) {
            nVar.P = bundle.getString("revenue_event");
        } else {
            nVar.P = "unknown";
        }
        e(nVar, "handleRevenueEvent");
        Logger.d(J, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId: " + str);
    }

    public void a(final String str, final Object obj) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.b(str, obj);
                }
            });
        } else {
            b(str, obj);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, boolean z10) {
        n nVarA;
        if (str2 != null && (nVarA = this.F.a(str2, false)) != null) {
            Logger.d(J, "on video completed triggered - for view address  : " + str2 + ", sdkPackageName : " + str + ", video completed: " + z10);
            a(nVarA, z10);
            return;
        }
        for (n nVar : this.F.a(str)) {
            Logger.d(J, "on video completed triggered - sdkPackageName : " + str + ", view address: " + str2 + ", video completed: " + z10);
            a(nVar, z10);
        }
    }

    public void a(String str, AtomicReference<Bundle> atomicReference) {
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        Logger.d(J, "start ad monitoring - slot = " + this.f51866d + ", max package name = " + str + ", AppLovin data bundle is " + atomicReference.get() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (CreativeInfoManager.h(str) == null) {
            Logger.d(J, "start ad monitoring - slot = " + this.f51866d + ", max package name = " + str + ", ad network is not supported");
            return;
        }
        n nVar = new n(str, this.f51866d, atomicReference.get());
        nVar.L = atomicReference.get().getString("id");
        synchronized (this) {
            this.F.put(nVar.L, nVar);
        }
        Logger.d(J, "start ad monitoring - new interstitial info created : " + nVar);
        f((Activity) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        Logger.d(J, "set CI details started, matchingInfo = " + oVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        CreativeInfo creativeInfo = oVar.f52705a;
        if (creativeInfo == null) {
            return false;
        }
        creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
        n nVar = null;
        if (creativeInfo.m() != null) {
            n nVarD = this.F.d(creativeInfo.m());
            Logger.d(J, "set CI details, attempt to locate interstitial info by eventId " + creativeInfo.m() + ", success? " + (nVarD != null));
            nVar = nVarD;
        }
        if (nVar == null && creativeInfo.af() != null) {
            n nVarA = this.F.a(creativeInfo.af(), true);
            Logger.d(J, "set CI details, attempt to locate interstitial info by matching object address " + creativeInfo.af() + ", success ? " + (nVarA != null));
            nVar = nVarA;
        }
        if (nVar != null) {
            return a(oVar, nVar);
        }
        List<n> listA = this.F.a(creativeInfo.Q());
        if (listA.size() <= 0) {
            Logger.d(J, "set CI details, failed to locate interstitial info");
            a(oVar, creativeInfo.Q());
            return false;
        }
        Logger.d(J, "set CI details, attempt to locate interstitial info, list size: " + listA.size());
        Iterator<n> it = this.F.a(creativeInfo.Q()).iterator();
        while (it.hasNext()) {
            if (a(oVar, it.next())) {
                List<o> list = this.P.get(creativeInfo.Q());
                if (list != null) {
                    list.remove(oVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        Logger.d(J, "set ad click URL started, sdk: " + str2 + ", url: " + str + ", view address: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str2);
        n nVarA = this.F.a(str3, false);
        if (nVarA == null && this.F.a(mainSdkPackage).size() == 1) {
            Logger.d(J, "InterstitialInfo not found by address, trying by SdkPackageName " + mainSdkPackage);
            nVarA = this.F.a(mainSdkPackage).get(0);
        }
        if (nVarA == null || nVarA.c() == null || !SdksMapping.isSameSdkByPackages(nVarA.c(), mainSdkPackage)) {
            Logger.d(J, "set ad click URL skipped, SDK: " + (nVarA != null ? nVarA.c() : "null"));
            return false;
        }
        Logger.d(J, "set ad click URL - applying clickUrl candidate logic. url: " + str);
        if (!nVarA.d()) {
            Logger.d(J, "set ad click URL - current Activity Interstitial is not marked as clicked, setting click URL: " + str);
            b(nVarA, str);
        } else if (nVarA.e() == null) {
            Logger.d(J, "set ad click URL - no click URL yet, setting clickUrl: " + str);
            nVarA.c(str);
        } else {
            Logger.d(J, "set ad click URL - click URL already set: " + nVarA.e());
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        for (n nVar : this.F.values()) {
            if (nVar != null && nVar.f51880m != null && nVar.f51880m.contains(str)) {
                return nVar;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n a(String str, RedirectDetails redirectDetails, m mVar, boolean z10, boolean z11) {
        return null;
    }

    protected String b(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WebView) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                Logger.d(J, "View = " + childAt + ": width = " + width + " height = " + height);
                if (childAt.getVisibility() == 0 && a(width, height)) {
                    String strC = c(childAt);
                    Logger.d(J, "Found full screen webview of SDK = " + strC);
                    return strC;
                }
            } else if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
            i10 = i11 + 1;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
        synchronized (this.B) {
            com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
        }
    }

    public void b(n nVar, String str) {
        nVar.f52697ai = new h(System.currentTimeMillis(), str);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
        n nVarA = this.F.a(str3, false);
        if (nVarA == null || !nVarA.d() || str2 == null || !str2.equals(nVarA.c()) || nVarA.f52701am == null) {
            return;
        }
        String string = nVarA.f52701am.toString();
        Logger.d(J, "set previous activity click url, click activity: " + string + ", ad activity: " + nVarA.f52691ac);
        String strA = BrandSafetyUtils.a(string, true);
        if (strA == null || strA.equals(nVarA.B)) {
            return;
        }
        Logger.d(J, "set previous activity click url - detected URL for click in previous activity (not yet destroyed), url: " + str);
        if (nVarA.c(str)) {
            e(nVarA, "setPreviousActivityClickUrl");
        }
    }

    public void b(String str, String str2, boolean z10) {
        if (str2 != null && this.F.a(str2, false) != null) {
            b(this.F.a(str2, false), z10);
        }
        List<n> listA = this.F.a(str);
        if (listA != null) {
            Iterator<n> it = listA.iterator();
            while (it.hasNext()) {
                b(it.next(), z10);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        List<CreativeInfo> listJ;
        synchronized (this) {
            for (n nVar : this.F.values()) {
                if (nVar != null && (listJ = nVar.j()) != null && !listJ.isEmpty() && listJ.get(0) != null && listJ.get(0).L() != null && listJ.get(0).L().equals(str2)) {
                    return listJ;
                }
            }
            List<o> list = this.P.get(str);
            if (list == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (o oVar : list) {
                if (oVar.f52705a != null && oVar.f52705a.L() != null && oVar.f52705a.L().equals(str2)) {
                    arrayList.add(oVar.f52705a);
                }
            }
            return arrayList;
        }
    }

    public void c(final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.3
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(InterstitialFinder.J, "start ad monitoring - activity : " + activity + ", current interstitial infos :" + InterstitialFinder.this.F.toString());
                if (activity == null) {
                    return;
                }
                if (InterstitialFinder.this.F.c(activity.toString())) {
                    Logger.d(InterstitialFinder.J, "start ad monitoring - activity null or already registered.");
                } else {
                    synchronized (InterstitialFinder.this.G) {
                        InterstitialFinder.this.G.put(activity.toString(), new WeakReference<>(activity));
                    }
                    if (!InterstitialFinder.this.H) {
                        InterstitialFinder.this.H = true;
                    }
                    Logger.d(InterstitialFinder.J, "start ad monitoring - activity added : " + activity.toString());
                }
                if (InterstitialFinder.this.m(activity.toString())) {
                    Logger.d(InterstitialFinder.J, "start ad monitoring - sdk: " + InterstitialFinder.this.F.b() + ", activity " + activity + " started but this is not the start of impression. not starting ad monitoring");
                } else {
                    Logger.d(InterstitialFinder.J, "start ad monitoring calling 'start', activity is " + activity);
                    InterstitialFinder.this.f(activity);
                }
            }
        });
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.6
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.o(str);
                }
            });
        } else {
            o(str);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        return false;
    }

    public n d(Activity activity) {
        if (activity != null) {
            return this.F.b(activity.toString());
        }
        Logger.d(J, "get activity interstitial by activity, activity is null");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void d(String str, String str2, String str3) {
        n nVarA = this.F.a(str, false);
        if (nVarA == null) {
            Logger.d(J, "pass message to ad info - info is null");
            return;
        }
        if (com.safedk.android.analytics.brandsafety.b.f51861y.equals(str3)) {
            nVarA.a(str2, true);
        } else {
            nVarA.e(str2);
        }
        Logger.d(J, "pass message to ad info - message: " + str2 + " has passed to info: " + nVarA);
    }

    public boolean d() {
        Iterator<n> it = this.F.values().iterator();
        while (it.hasNext()) {
            if (!it.next().U) {
                return true;
            }
        }
        return false;
    }

    public void e(final Activity activity) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.g(activity);
                }
            });
        } else {
            g(activity);
        }
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null && nVar.Y) {
                    nVar.a(ImpressionLog.f51756z, new ImpressionLog.a[0]);
                    e(nVar, "onBackground");
                }
            }
        }
    }

    public void g(String str, String str2) {
        Logger.d(J, "setCurrentInterstitialDownstreamStruct started");
        List<n> listA = this.F.a(str);
        if (listA.size() != 1) {
            Logger.d(J, "setCurrentInterstitialDownstreamStruct number of Infos for " + str + " is " + listA.size() + ", cannot set downstream struct");
            return;
        }
        n nVar = listA.get(0);
        if (nVar != null) {
            List<CreativeInfo> listJ = nVar.j();
            if (listJ.isEmpty() || str2 == null) {
                return;
            }
            for (CreativeInfo creativeInfo : listJ) {
                creativeInfo.c(creativeInfo.h() + "/" + str2);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f51529a;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null) {
                    nVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    e(nVar, "onForeground");
                    if (!nVar.H) {
                        nVar.f52689aa = true;
                    }
                }
            }
        }
    }

    public boolean i(String str) {
        List<n> listA = this.F.a(str);
        com.safedk.android.utils.k.b(J, "activeImpressionExists current impressions are " + this.F.toString());
        return listA != null && listA.size() > 0;
    }

    public void j(String str) {
        for (n nVar : this.F.a(str)) {
            CreativeInfo creativeInfoI = nVar.i();
            if (creativeInfoI != null && creativeInfoI.w()) {
                Logger.d(J, "set on endcard displayed - setting ci endcard detected. ci= " + creativeInfoI);
                creativeInfoI.f52512bb = true;
            } else if (creativeInfoI != null && creativeInfoI.v()) {
                Logger.d(J, "set on endcard displayed - ci is video ad, setting video complete. ci= " + creativeInfoI);
                c(nVar, str);
            }
        }
    }

    public n k(String str) {
        if (str == null) {
            Logger.d(J, "get activity interstitial by package, package is null");
            return null;
        }
        List<n> listA = this.F.a(str);
        if (listA.size() == 1) {
            Logger.d(J, "get activity interstitial by package, ci found : " + listA.get(0));
            return listA.get(0);
        }
        Logger.d(J, "there are " + listA.size() + " interstitial infos, exisitng");
        return null;
    }

    public void l(String str) {
        List<CreativeInfo> listJ;
        Logger.d(J, "setStopCollectingResources started");
        List<n> listA = this.F.a(str);
        if (listA.size() != 1) {
            Logger.d(J, "setStopCollectingResources number of Infos for " + str + " is " + listA.size() + ", cannot stop collecting resources");
            return;
        }
        n nVar = listA.get(0);
        if (nVar == null || (listJ = nVar.j()) == null || listJ.isEmpty()) {
            return;
        }
        for (CreativeInfo creativeInfo : listJ) {
            String strH = creativeInfo.h();
            if (strH != null && strH.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.j.f52336c)) {
                creativeInfo.a(true);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string;
        n nVarD;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return;
        }
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f51864b.contains(messageData.getString("ad_format"))) {
            Logger.d(J, "Revenue event detected : " + messageData);
            string = "revenue_event";
        } else {
            string = messageData.getString("type");
        }
        String string2 = messageData.getString("ad_format");
        String string3 = messageData.getString(BrandSafetyEvent.f52756k);
        String string4 = messageData.getString(BrandSafetyEvent.f52736ad);
        String string5 = messageData.getString("dsp_name");
        String strB = CreativeInfoManager.b(string4);
        long jB = com.safedk.android.utils.k.b(System.currentTimeMillis());
        String string6 = messageData.containsKey("creative_id") ? messageData.getString("creative_id") : null;
        MaxEvent maxEvent = new MaxEvent(string, jB, string2, string4, string6, string5);
        p.a().a(maxEvent);
        boolean zContains = this.f51864b.contains(string2);
        String strA = CreativeInfoManager.a(strB, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        if (zContains && string4 != null && string4.equals(strA)) {
            Logger.d(J, "full screen type but ad network not supported (" + strA + ")");
            return;
        }
        String string7 = messageData.getString("id", null);
        if (string7 == null) {
            Logger.d(J, "No eventId in data bundle.");
        }
        if (zContains) {
            Logger.d(J, "Max message received, package: " + strB + ", ts (seconds): " + jB + ", message received: " + appLovinCommunicatorMessage.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if ("WILL_DISPLAY".equals(string)) {
                com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count: " + this.B.size());
                e();
                this.f51866d++;
                if (strB != null) {
                    p.a().b(maxEvent);
                    this.H = true;
                    a(string7, ImpressionLog.f51736f, new ImpressionLog.a[0]);
                    BrandSafetyUtils.m(strB);
                    a(strB, new AtomicReference<>(messageData));
                    CreativeInfoManager.a(strB, string3, string6, (String) null, string2);
                    a aVar = new a(string3, string7);
                    Logger.d(J, "WILL_DISPLAY event for package: " + strB + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string7);
                    a(strB, aVar, string7);
                    return;
                }
                return;
            }
            if ("revenue_event".equals(string)) {
                Logger.d(J, "REVENUE_EVENT event for package: " + strB + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string7);
                a(string7, ImpressionLog.f51741k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                a(string7, messageData);
                return;
            }
            if ("DID_CLICKED".equals(string)) {
                n nVarD2 = this.F.d(string7);
                if (nVarD2 != null) {
                    StringBuilder sbAppend = new StringBuilder().append("DID_CLICKED event for package: ");
                    if (strB != null) {
                        string4 = strB;
                    }
                    Logger.d(J, sbAppend.append(string4).toString());
                    a(string7, ImpressionLog.f51738h, new ImpressionLog.a[0]);
                    b(nVarD2);
                    if (TextUtils.isEmpty(nVarD2.e())) {
                        return;
                    }
                    e(nVarD2, "onMessageReceived");
                    return;
                }
                return;
            }
            if ("WILL_LOAD".equals(string)) {
                if (strB != null) {
                    Logger.d(J, "WILL_LOAD event for package: " + strB + " placement: " + string3);
                    a(string7, ImpressionLog.f51734d, new ImpressionLog.a(ImpressionLog.I, string4));
                    com.safedk.android.analytics.brandsafety.creatives.e.b(strB, string3);
                    CreativeInfoManager.a(strB, string3, string6, (String) null, string2);
                    return;
                }
                return;
            }
            if ("DID_HIDE".equals(string)) {
                if (strB != null) {
                    BrandSafetyUtils.n(strB);
                    Logger.d(J, "DID_HIDE event for package: " + strB + " placement: " + string3 + ", event id: " + string7);
                    n nVarD3 = this.F.d(string7);
                    if (nVarD3 != null) {
                        a(string7, ImpressionLog.f51739i, new ImpressionLog.a[0]);
                        a(nVarD3, (String) null);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DID_LOAD".equals(string)) {
                if (strB != null) {
                    Logger.d(J, "DID_LOAD event for package: " + strB + " placement: " + string3);
                    a(string7, ImpressionLog.f51735e, new ImpressionLog.a(ImpressionLog.I, string4));
                    return;
                }
                return;
            }
            if (!"DID_DISPLAY".equals(string)) {
                if ("DID_FAIL_DISPLAY".equals(string)) {
                    Logger.d(J, "DID_FAIL_DISPLAY event for package: " + strB + " placement: " + string3);
                    a(string7, ImpressionLog.f51740j, new ImpressionLog.a[0]);
                    n nVarD4 = this.F.d(string7);
                    if (nVarD4 != null) {
                        nVarD4.N = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (strB != null) {
                Logger.d(J, "DID_DISPLAY event for package: " + strB + " placement: " + string3);
                a(string7, ImpressionLog.f51737g, new ImpressionLog.a[0]);
                if (string6 == null || (nVarD = this.F.d(string7)) == null) {
                    return;
                }
                if (nVarD.A == null || !nVarD.A.containsKey("id") || nVarD.A.getString("id") == null || !nVarD.A.getString("id").equals(string7)) {
                    Logger.d(J, "cannot update Max creative id. event id check failed.");
                } else {
                    Logger.d(J, "setting Max creative id to: " + string6 + " for event id: " + string7);
                    nVarD.M = string6;
                }
            }
        }
    }
}
