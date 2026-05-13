package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.C5149u1;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5149u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5273z0 f67758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f67759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5042pi f67760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E7 f67761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4867il f67762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f67763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4844hn f67764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Xk f67765h;

    public C5149u1() {
        this(C4696c4.l().d(), new Io());
    }

    public C5149u1(C5273z0 c5273z0, B2 b22, C4867il c4867il, Io io2, C4844hn c4844hn, C5042pi c5042pi, E7 e72, Xk xk2) {
        this.f67758a = c5273z0;
        this.f67759b = io2;
        this.f67760c = c5042pi;
        this.f67761d = e72;
        this.f67763f = b22;
        this.f67764g = c4844hn;
        this.f67762e = c4867il;
        this.f67765h = xk2;
    }

    public C5149u1(C5273z0 c5273z0, Io io2) {
        this(c5273z0, new B2(c5273z0), new C4867il(c5273z0), io2, new C4844hn(c5273z0, io2), C5042pi.a(), C4696c4.l().j(), C4696c4.l().o());
    }

    public static Ja a(C5149u1 c5149u1) {
        return c5149u1.d().f67119a;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C4696c4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public static IHandlerExecutor c() {
        return C4696c4.l().f66453c.a();
    }

    @NonNull
    public final Sa a(@NonNull Context context, @NonNull String str) {
        B2 b22 = this.f67763f;
        b22.f64995f.a(context);
        b22.f65000k.a(str);
        C4844hn c4844hn = this.f67764g;
        c4844hn.f66943e.a(context.getApplicationContext());
        return this.f67760c.a(context.getApplicationContext(), str);
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f67763f.f64995f.a(context);
        C4844hn c4844hn = this.f67764g;
        Context applicationContext = context.getApplicationContext();
        c4844hn.f66943e.a(applicationContext);
        c4844hn.f66944f.a(applicationContext);
        return C4696c4.l().a(context.getApplicationContext()).a();
    }

    public final void a() {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4848i1(this));
    }

    public final void a(@Nullable Activity activity) {
        this.f67763f.f64990a.a(null);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4975n1(this, activity));
    }

    public final void a(@NonNull Application application) {
        this.f67763f.f64994e.a(application);
        this.f67764g.f66941c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Runnable() { // from class: mh.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74284b.e();
            }
        });
    }

    public final void a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        B2 b22 = this.f67763f;
        b22.f64995f.a(context);
        b22.f64991b.a(appMetricaConfig);
        C4844hn c4844hn = this.f67764g;
        Context applicationContext = context.getApplicationContext();
        c4844hn.f66943e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c4844hn.f66942d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c4844hn.f66939a.getClass();
        C5248y0 c5248y0A = C5248y0.a(applicationContext);
        c5248y0A.f68001d.a(appMetricaConfig, c5248y0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Runnable() { // from class: mh.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74288b.b(context, appMetricaConfig);
            }
        });
        this.f67758a.getClass();
        C5273z0.b();
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        B2 b22 = this.f67763f;
        b22.f64995f.a(context);
        b22.f64997h.a(reporterConfig);
        C4844hn c4844hn = this.f67764g;
        c4844hn.f66943e.a(context.getApplicationContext());
        C5042pi c5042pi = this.f67760c;
        Context applicationContext = context.getApplicationContext();
        if (((C4839hi) c5042pi.f67533a.get(reporterConfig.apiKey)) == null) {
            synchronized (c5042pi.f67533a) {
                if (((C4839hi) c5042pi.f67533a.get(reporterConfig.apiKey)) == null) {
                    String str = reporterConfig.apiKey;
                    IHandlerExecutor iHandlerExecutorA = C4696c4.l().f66453c.a();
                    c5042pi.f67534b.getClass();
                    if (C5248y0.f67995e == null) {
                        ((A9) iHandlerExecutorA).f64970b.post(new RunnableC4992ni(c5042pi, applicationContext));
                    }
                    C4839hi c4839hi = new C4839hi(applicationContext.getApplicationContext(), str, new C5273z0());
                    c5042pi.f67533a.put(str, c4839hi);
                    c4839hi.a(reporterConfig);
                }
            }
        }
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        B2 b22 = this.f67763f;
        b22.f64995f.a(context);
        b22.f65005p.a(startupParamsCallback);
        C4844hn c4844hn = this.f67764g;
        c4844hn.f66943e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4873j1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull Intent intent) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64993d.a(intent);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new O0(this, intent));
    }

    public final void a(@Nullable Location location) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Q0(this, location));
    }

    public final void a(@NonNull WebView webView) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65002m.a(webView);
        Io io2 = this.f67764g.f66940b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo2 = new Fo();
                synchronized (io2) {
                    PublicLogger publicLogger = io2.f65381b;
                    if (publicLogger == null) {
                        io2.f65380a.add(fo2);
                    } else {
                        fo2.consume(publicLogger);
                    }
                }
            } else {
                io2.a(new Go());
            }
        } catch (Throwable th2) {
            io2.a(new Ho(th2));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4719d1(this));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65014y.a(adRevenue);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Y0(this, adRevenue));
    }

    public final void a(@NonNull AnrListener anrListener) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65006q.a(anrListener);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4899k1(this, anrListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64996g.a(deferredDeeplinkListener);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4667b1(this, deferredDeeplinkListener));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64996g.a(deferredDeeplinkParametersListener);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4641a1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65007r.a(externalAttribution);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4925l1(this, externalAttribution));
    }

    public final void a(@NonNull Revenue revenue) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65013x.a(revenue);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new X0(this, revenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65015z.a(eCommerceEvent);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Z0(this, eCommerceEvent));
    }

    public final void a(@NonNull UserProfile userProfile) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65012w.a(userProfile);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new V0(this, userProfile));
    }

    public final void a(@NonNull String str) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64998i.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new N0(this, str));
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4796g1(this, str, str2));
    }

    public final void a(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65010u.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5099s1(this, str, str2, th2));
    }

    public final void a(@NonNull String str, @Nullable Throwable th2) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65009t.a(str);
        this.f67764g.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5074r1(this, str, th2));
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65008s.a(str);
        this.f67764g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5050q1(this, str, listFromMap));
    }

    public final void a(@NonNull Throwable th2) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65011v.a(th2);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5124t1(this, th2));
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f67763f.A.a(map);
        this.f67764g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4950m1(this, listFromMap));
    }

    public final void a(boolean z10) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new S0(this, z10));
    }

    @Nullable
    public final String b() {
        this.f67758a.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        if (c5248y0 == null) {
            return null;
        }
        return c5248y0.f().e();
    }

    public final void b(@NonNull Activity activity) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64992c.a(activity);
        this.f67764g.getClass();
        Intent intentA = C4844hn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new M0(this, intentA));
    }

    public final void b(@NonNull Context context) {
        this.f67763f.f64995f.a(context);
        this.f67764g.f66943e.a(context);
        this.f67758a.getClass();
        C5248y0.a(context);
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C5273z0 c5273z0 = this.f67758a;
        Context applicationContext = context.getApplicationContext();
        c5273z0.getClass();
        C5248y0 c5248y0A = C5248y0.a(applicationContext);
        c5248y0A.f().b(this.f67761d.a(appMetricaConfig));
        Context context2 = c5248y0A.f67998a;
        ((A9) C4696c4.l().f66453c.a()).execute(new RunnableC5224x1(context2));
    }

    public final void b(@NonNull String str) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65008s.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5000o1(this, str));
    }

    public final void b(@NonNull String str, @Nullable String str2) {
        this.f67763f.f65001l.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4693c1(this, str, str2));
    }

    public final void b(boolean z10) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new T0(this, z10));
    }

    public final void b(@NonNull final Object... objArr) {
        this.f67763f.f64990a.a(null);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new Runnable() { // from class: mh.r0
            @Override // java.lang.Runnable
            public final void run() {
                C5149u1.a(objArr);
            }
        });
    }

    public final void c(@Nullable Activity activity) {
        this.f67763f.f64990a.a(null);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4822h1(this, activity));
    }

    public final void c(@NonNull String str) {
        if (this.f67762e.a((Void) null).f67631a && this.f67763f.f65003n.a(str).f67631a) {
            this.f67764g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4770f1(this, str));
        }
    }

    public final void c(@NonNull String str, @Nullable String str2) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f65008s.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new RunnableC5025p1(this, str, str2));
    }

    public final void c(boolean z10) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new R0(this, z10));
    }

    public final C4910kc d() {
        this.f67758a.getClass();
        return C5248y0.f67995e.f().i();
    }

    public final void d(@NonNull String str) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        b22.f64999j.a(str);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new P0(this, str));
    }

    public final void d(@NonNull String str, @Nullable String str2) {
        B2 b22 = this.f67763f;
        b22.f64990a.a(null);
        if (b22.f65004o.a(str).f67631a) {
            this.f67764g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f64970b.post(new RunnableC4744e1(this, str, str2));
        }
    }

    public final void e() {
        d().f67119a.a(this.f67765h.a());
    }

    public final void e(@Nullable String str) {
        this.f67763f.getClass();
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new U0(this, str));
    }

    public final void f() {
        this.f67763f.f64990a.a(null);
        this.f67764g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f64970b.post(new W0(this));
    }
}
