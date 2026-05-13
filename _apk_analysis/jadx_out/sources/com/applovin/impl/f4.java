package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppLovinAdBase f8274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f8275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f8276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f8279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdEvents f8280g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f8274a = appLovinAdBase;
        this.f8275b = appLovinAdBase.getSdk();
        this.f8276c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + appLovinAdBase.getDspName();
        }
        this.f8277d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f8279f.registerAdView(view);
        this.f8279f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f8279f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8276c.a(this.f8277d, "Failed to add friendly obstruction (" + h4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f8279f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f8278e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8276c.a(this.f8277d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8276c.a(this.f8277d, "Failed to run operation: " + str, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8278e = false;
        this.f8279f.finish();
        this.f8279f = null;
        this.f8280g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f8274a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8276c.d(this.f8277d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f8279f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8276c.k(this.f8277d, "Attempting to start session again for ad: " + this.f8274a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8276c.a(this.f8277d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f8279f = adSessionCreateAdSession;
            try {
                this.f8280g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f8279f);
                this.f8279f.start();
                this.f8278e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8276c.a(this.f8277d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8276c.a(this.f8277d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8276c.a(this.f8277d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f8280g.impressionOccurred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8280g.loaded();
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void a(AdSession adSession) {
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                this.f8714b.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ia
            @Override // java.lang.Runnable
            public final void run() {
                this.f8531b.a(str);
            }
        });
    }

    public void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ha
            @Override // java.lang.Runnable
            public final void run() {
                this.f8437b.a(str, runnable);
            }
        });
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.na
            @Override // java.lang.Runnable
            public final void run() {
                this.f9346b.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f8789b.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.ja
            @Override // java.lang.Runnable
            public final void run() {
                this.f8571b.c();
            }
        });
    }

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f8621b.d();
            }
        });
    }
}
