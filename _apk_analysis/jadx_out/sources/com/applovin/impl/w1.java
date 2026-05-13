package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.d6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {
    public int A;
    public boolean B;
    private ContentObserver C;
    private Float D;
    public AppLovinAdClickListener E;
    public AppLovinAdDisplayListener F;
    public AppLovinAdVideoPlaybackListener G;
    public g7 H;
    public g7 I;
    public boolean J;
    private final h0 K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f10567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f10568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f10569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f10570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f10572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.b f10573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i.a f10574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdView f10575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.applovin.impl.adview.k f10576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.applovin.impl.adview.g f10577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.applovin.impl.adview.g f10578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f10580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f10581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f10590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10591y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10592z;

    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f10569c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f10569c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f10569c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f10569c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    public class b implements i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i10) {
            w1 w1Var = w1.this;
            if (w1Var.A != com.applovin.impl.sdk.i.f10080h) {
                w1Var.B = true;
            }
            com.applovin.impl.adview.b bVarF = w1Var.f10575i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = w1.this.f10569c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f10569c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i10) && !com.applovin.impl.sdk.i.a(w1.this.A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            w1.this.A = i10;
        }
    }

    public class c extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f10595a;

        public c(com.applovin.impl.sdk.k kVar) {
            this.f10595a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(n7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f10595a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }
    }

    public class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f10597a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f10597a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f10597a.p().b();
            if (fB == null || w1.this.D == null || fB.equals(w1.this.D)) {
                return;
            }
            String str = fB.floatValue() > w1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.D = fB;
        }
    }

    public class e extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s4 f10599a;

        public e(s4 s4Var) {
            this.f10599a = s4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f10599a.b(null);
                w1.this.f10568b.e().b(this);
            }
        }
    }

    public class f implements h0.c {
        public f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f10567a);
            mapA.putAll(f2.a(w1.this.f10567a));
            mapA.put("details", "detection_count=" + i10 + ",total_checks=" + i11);
            w1.this.f10568b.D().d(d2.K0, mapA);
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11, int i12) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f10567a);
            mapA.putAll(f2.a(w1.this.f10567a));
            mapA.put("details", "detections_to_report=" + i10 + ",detection_count=" + i11 + ",total_checks=" + i12);
            w1.this.f10568b.D().d(d2.L0, mapA);
            if (((Boolean) w1.this.f10568b.a(x4.f10828r6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.f10568b.a(x4.P0)).booleanValue()) {
                w1.this.f10568b.G().c(w1.this.f10567a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) w1.this.f10568b.a(x4.f10796n6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.L = ((Boolean) w1Var.f10568b.a(x4.f10804o6)).booleanValue();
            if (((Boolean) w1.this.f10568b.a(x4.f10812p6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th2);
    }

    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        public /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.f10583q = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f10569c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f10569c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.E, appLovinAd);
            w1.this.f10592z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.f10577k || !((Boolean) w1Var.f10568b.a(x4.X1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = w1.this.f10569c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f10569c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.f10567a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.f10589w + StringUtils.COMMA + w1.this.f10591y + StringUtils.COMMA + w1.this.f10592z + ");");
            }
            List listF = w1.this.f10567a.F();
            com.applovin.impl.sdk.o oVar2 = w1.this.f10569c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f10569c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.f10589w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= w1.this.f10589w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.f10590x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.f10583q));
            List listD = w1.this.f10567a.D();
            if (listD != null && listD.size() > w1.this.f10589w) {
                w1 w1Var2 = w1.this;
                w1Var2.f10577k.a((e.a) listD.get(w1Var2.f10589w));
            }
            com.applovin.impl.sdk.o oVar3 = w1.this.f10569c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f10569c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(w1.this.f10589w));
            }
            w1.this.f10577k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.f10577k, ((Integer) listF.get(w1Var3.f10589w)).intValue(), new Runnable() { // from class: com.applovin.impl.zf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11088b.a();
                }
            });
        }
    }

    public w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10572f = handler;
        this.f10579m = SystemClock.elapsedRealtime();
        this.f10580n = new AtomicBoolean();
        this.f10581o = new AtomicBoolean();
        this.f10583q = -1L;
        this.f10589w = 0;
        this.f10590x = new ArrayList();
        this.f10591y = 0;
        this.f10592z = 0;
        this.A = com.applovin.impl.sdk.i.f10080h;
        this.L = false;
        this.f10567a = bVar;
        this.f10568b = kVar;
        this.f10569c = kVar.O();
        this.f10570d = activity;
        this.f10571e = bVar.R();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(x4.f10792n2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(x4.f10840t2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(kVar.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f10575i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.f10575i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", e8.a(this.f10575i));
        this.f10575i.getController().a(this);
        c2 c2Var = new c2(map, kVar);
        if (c2Var.c()) {
            this.f10576j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() >= 0 || listF != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.f10577k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.f10577k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f10578l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.wf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10655b.a(view);
            }
        });
        if (bVar.V0()) {
            this.f10574h = new b();
        } else {
            this.f10574h = null;
        }
        this.f10573g = new c(kVar);
        if (bVar.R0()) {
            this.D = kVar.p().b();
            this.C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void B() {
        if (this.f10574h != null) {
            this.f10568b.p().a(this.f10574h);
        }
        if (this.f10573g != null) {
            this.f10568b.e().a(this.f10573g);
        }
    }

    private s4 a(long j10) {
        final s4 s4Var = new s4("bringAdActivityToFront");
        final e eVar = new e(s4Var);
        this.f10568b.e().a(eVar);
        Intent intent = new Intent(this.f10570d, (Class<?>) (this.f10567a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f10570d, intent);
        a(new Runnable() { // from class: com.applovin.impl.yf
            @Override // java.lang.Runnable
            public final void run() {
                this.f10988b.a(eVar, s4Var);
            }
        }, j10);
        return s4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, s4 s4Var) {
        this.f10568b.e().b(bVar);
        if (s4Var.d()) {
            return;
        }
        s4Var.a((Object) null);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof o7) {
            try {
                z1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f10568b.D().a(d2.M0, "missingCachedAdResources", map2);
    }

    private void a(String str, Map map) {
        e(o8.a(str, map));
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f10568b.g().a(d2.K, aVar, mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r22, Void r32) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        e8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.tf
            @Override // java.lang.Runnable
            public final void run() {
                w1.a(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f10575i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    private void b(String str, Map map) {
        e(o8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.uf
            @Override // java.lang.Runnable
            public final void run() {
                w1.b(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void c(String str, Map map) {
        e(o8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!z()) {
            f("app_relaunch");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
        }
        this.f10582p = true;
        long jF = this.f10567a.f();
        if (jF < 0) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.sf
            @Override // java.lang.Runnable
            public final void run() {
                this.f10395b.j();
            }
        }, jF);
    }

    private void d(String str, Map map) {
        e(o8.d(str, map));
    }

    public static /* synthetic */ int f(w1 w1Var) {
        int i10 = w1Var.f10589w;
        w1Var.f10589w = i10 + 1;
        return i10;
    }

    private void f(final String str) {
        if (this.f10581o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pf
            @Override // java.lang.Runnable
            public final void run() {
                this.f9566b.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f10567a.R() <= this.f10571e && !com.applovin.impl.d.d(this.f10570d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10569c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f10582p = false;
            long jC = this.f10567a.c();
            if (jC > 0) {
                a(jC).a(s4.f9821i, new s4.b() { // from class: com.applovin.impl.xf
                    @Override // com.applovin.impl.s4.b
                    public final void a(boolean z10, Object obj, Object obj2) {
                        this.f10912a.a(z10, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f10567a.z0().getAndSet(true)) {
            return;
        }
        this.f10568b.q0().a((i5) new m6(this.f10567a, this.f10568b), d6.b.OTHER);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53127a);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    public abstract void A();

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f10567a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f10569c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f10569c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (!this.f10582p && this.f10580n.compareAndSet(false, true)) {
            if (this.f10567a.hasVideoUrl() || h()) {
                t2.a(this.G, this.f10567a, i10, z11);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10579m;
            this.f10568b.k().trackVideoEnd(this.f10567a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
            long jElapsedRealtime2 = this.f10583q != -1 ? SystemClock.elapsedRealtime() - this.f10583q : -1L;
            this.f10568b.k().trackFullScreenAdClosed(this.f10567a, jElapsedRealtime2, this.f10590x, j10, this.B, this.A);
            if (com.applovin.impl.sdk.o.a()) {
                this.f10569c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i10 + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public abstract void a(ViewGroup viewGroup);

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    public void a(final com.applovin.impl.adview.g gVar, long j10, final Runnable runnable) {
        if (j10 >= ((Long) this.f10568b.a(x4.W1)).longValue()) {
            return;
        }
        this.I = g7.a(TimeUnit.SECONDS.toMillis(j10), this.f10568b, new Runnable() { // from class: com.applovin.impl.vf
            @Override // java.lang.Runnable
            public final void run() {
                w1.c(gVar, runnable);
            }
        });
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.f10568b.a(x4.E4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", n7.b(this.f10570d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(o8.a(map));
        }
    }

    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f10572f);
    }

    public void a(String str) {
        this.f10585s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10579m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f10567a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f10572f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f10567a != null ? r0.w() : 0L);
        if (((Boolean) this.f10568b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f10567a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.K.b();
        if (this.f10574h != null) {
            this.f10568b.p().b(this.f10574h);
        }
        if (this.f10573g != null) {
            this.f10568b.e().b(this.f10573g);
        }
        if (this.C != null) {
            this.f10570d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (i()) {
            this.f10570d.finish();
            return;
        }
        this.f10568b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10568b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(final String str, long j10) {
        if (j10 < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.rf
            @Override // java.lang.Runnable
            public final void run() {
                this.f9795b.b(str);
            }
        }, j10);
    }

    public void a(boolean z10, long j10) {
        if (this.f10567a.H0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    public boolean a(boolean z10) {
        List listA = n7.a(z10, this.f10567a, this.f10568b, this.f10570d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f10568b.a(x4.W0)).booleanValue() && (!n7.a(listA, this.f10567a))) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f10567a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = f2.a((AppLovinAdImpl) this.f10567a);
        if (!((Boolean) this.f10568b.a(x4.T5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10569c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
            }
            this.f10567a.E0();
            a(str, "Streaming ad", mapA);
            return false;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
        }
        if (((Boolean) this.f10568b.a(x4.W5)).booleanValue()) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof l2) {
                t2.a(appLovinAdDisplayListener, "Missing ad resources");
            }
        } else {
            n2.a(this.f10567a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
        }
        a("missing_ad_resources");
        a(str, "Failing ad display", mapA);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
        CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
        this.f10568b.g().a(d2.F, this.f10567a, mapHashMap);
        return ((Boolean) this.f10568b.a(x4.V5)).booleanValue();
    }

    public AppLovinAdView b() {
        return this.f10575i;
    }

    public abstract void b(long j10);

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        g7 g7Var = this.I;
        if (g7Var != null) {
            if (z10) {
                g7Var.e();
            } else {
                g7Var.d();
            }
        }
    }

    public int c() {
        int iT = this.f10567a.t();
        return (iT <= 0 && ((Boolean) this.f10568b.a(x4.f10775l2)).booleanValue()) ? this.f10587u + 1 : iT;
    }

    public void c(long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.H = g7.a(j10, this.f10568b, new Runnable() { // from class: com.applovin.impl.qf
            @Override // java.lang.Runnable
            public final void run() {
                this.f9686b.k();
            }
        });
    }

    public void c(boolean z10) {
        a(z10, ((Long) this.f10568b.a(x4.f10784m2)).longValue());
        if (!this.f10567a.s0()) {
            t2.a(this.F, this.f10567a);
        }
        this.f10568b.H().a(this.f10567a);
        if (!this.f10567a.s0() && (this.f10567a.hasVideoUrl() || h())) {
            t2.a(this.G, this.f10567a);
        }
        new n4(this.f10570d).a(this.f10567a);
        this.f10567a.setHasShown(true);
    }

    public void d(String str) {
        if (this.f10567a.v0()) {
            a(str, 0L);
        }
    }

    public void d(boolean z10) {
        this.f10582p = z10;
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void e(String str) {
        a(str, 0L);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f10586t = true;
    }

    public boolean g() {
        return this.f10585s;
    }

    public boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f10567a.getType();
    }

    public boolean i() {
        return this.f10570d instanceof AppLovinFullscreenActivity;
    }

    public void l() {
        if (!this.f10582p && this.f10581o.compareAndSet(false, true)) {
            t2.b(this.F, this.f10567a);
            this.f10568b.H().b(this.f10567a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f10567a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", f2.b(this.f10567a), map);
            }
            this.f10568b.g().a(d2.G, this.f10567a, map);
        }
    }

    public abstract void m();

    public void n() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    public void o() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f10586t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f10575i == null || !this.f10567a.t0() || (bVarF = this.f10575i.getController().f()) == null) {
            return;
        }
        this.K.a(bVarF, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f10567a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f10575i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f10575i.destroy();
            this.f10575i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.E = null;
        this.F = null;
        this.G = null;
        this.f10570d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    public void x() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean y() {
        return this.f10582p;
    }
}
