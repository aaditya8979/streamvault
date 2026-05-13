package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4277u2 extends C4261t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4277u2 f34161d = new C4277u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ga f34162b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ga f34163c = null;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34164a;

        public a(AdInfo adInfo) {
            this.f34164a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34162b;
            if (ga2 != null) {
                ga2.g(c4277u2.a(this.f34164a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4277u2.this.a(this.f34164a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34166a;

        public b(AdInfo adInfo) {
            this.f34166a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34163c;
            if (ga2 != null) {
                ga2.d(c4277u2.a(this.f34166a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4277u2.this.a(this.f34166a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34168a;

        public c(AdInfo adInfo) {
            this.f34168a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34162b;
            if (ga2 != null) {
                ga2.d(c4277u2.a(this.f34168a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4277u2.this.a(this.f34168a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34170a;

        public d(AdInfo adInfo) {
            this.f34170a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34163c;
            if (ga2 != null) {
                ga2.e(c4277u2.a(this.f34170a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4277u2.this.a(this.f34170a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34172a;

        public e(AdInfo adInfo) {
            this.f34172a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34162b;
            if (ga2 != null) {
                ga2.e(c4277u2.a(this.f34172a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4277u2.this.a(this.f34172a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f34174a;

        public f(IronSourceError ironSourceError) {
            this.f34174a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C4277u2.this.f34163c;
            if (ga2 != null) {
                ga2.b(this.f34174a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f34174a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f34176a;

        public g(IronSourceError ironSourceError) {
            this.f34176a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C4277u2.this.f34162b;
            if (ga2 != null) {
                ga2.b(this.f34176a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f34176a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34178a;

        public h(AdInfo adInfo) {
            this.f34178a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34163c;
            if (ga2 != null) {
                ga2.h(c4277u2.a(this.f34178a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4277u2.this.a(this.f34178a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34180a;

        public i(AdInfo adInfo) {
            this.f34180a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34162b;
            if (ga2 != null) {
                ga2.h(c4277u2.a(this.f34180a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4277u2.this.a(this.f34180a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34182a;

        public j(AdInfo adInfo) {
            this.f34182a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34163c;
            if (ga2 != null) {
                ga2.f(c4277u2.a(this.f34182a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4277u2.this.a(this.f34182a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$k */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34184a;

        public k(AdInfo adInfo) {
            this.f34184a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34162b;
            if (ga2 != null) {
                ga2.f(c4277u2.a(this.f34184a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4277u2.this.a(this.f34184a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f34186a;

        public l(AdInfo adInfo) {
            this.f34186a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277u2 c4277u2 = C4277u2.this;
            Ga ga2 = c4277u2.f34163c;
            if (ga2 != null) {
                ga2.g(c4277u2.a(this.f34186a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4277u2.this.a(this.f34186a));
            }
        }
    }

    private C4277u2() {
    }

    public static C4277u2 a() {
        return f34161d;
    }

    public void a(Ga ga2) {
        this.f34162b = ga2;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Ga b() {
        return this.f34162b;
    }

    public void b(Ga ga2) {
        this.f34163c = ga2;
    }

    public void b(AdInfo adInfo) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }

    public void c(AdInfo adInfo) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f34163c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f34162b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }
}
