package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes9.dex */
public class Dd extends C4261t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Dd f29134d = new Dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4252sb f29135b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4252sb f29136c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29138b;

        public a(boolean z10, AdInfo adInfo) {
            this.f29137a = z10;
            this.f29138b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                if (!this.f29137a) {
                    ((InterfaceC4269tb) interfaceC4252sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4269tb) interfaceC4252sb).d(dd2.a(this.f29138b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f29138b));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4041gd f29140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29141b;

        public b(C4041gd c4041gd, AdInfo adInfo) {
            this.f29140a = c4041gd;
            this.f29141b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.b(this.f29140a, dd2.a(this.f29141b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f29140a + ", adInfo = " + Dd.this.a(this.f29141b));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4041gd f29143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29144b;

        public c(C4041gd c4041gd, AdInfo adInfo) {
            this.f29143a = c4041gd;
            this.f29144b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.b(this.f29143a, dd2.a(this.f29144b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f29143a + ", adInfo = " + Dd.this.a(this.f29144b));
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29147b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f29146a = ironSourceError;
            this.f29147b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.a(this.f29146a, dd2.a(this.f29147b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f29147b) + ", error = " + this.f29146a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29150b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f29149a = ironSourceError;
            this.f29150b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.a(this.f29149a, dd2.a(this.f29150b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f29150b) + ", error = " + this.f29149a.getErrorMessage());
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4041gd f29152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29153b;

        public f(C4041gd c4041gd, AdInfo adInfo) {
            this.f29152a = c4041gd;
            this.f29153b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.a(this.f29152a, dd2.a(this.f29153b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f29152a + ", adInfo = " + Dd.this.a(this.f29153b));
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4041gd f29155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29156b;

        public g(C4041gd c4041gd, AdInfo adInfo) {
            this.f29155a = c4041gd;
            this.f29156b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.a(this.f29155a, dd2.a(this.f29156b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f29155a + ", adInfo = " + Dd.this.a(this.f29156b));
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29158a;

        public h(AdInfo adInfo) {
            this.f29158a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                ((InterfaceC4286ub) interfaceC4252sb).a(dd2.a(this.f29158a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f29158a));
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29160a;

        public i(AdInfo adInfo) {
            this.f29160a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                ((InterfaceC4286ub) interfaceC4252sb).a(dd2.a(this.f29160a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f29160a));
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29162a;

        public j(IronSourceError ironSourceError) {
            this.f29162a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4252sb interfaceC4252sb = Dd.this.f29136c;
            if (interfaceC4252sb != null) {
                ((InterfaceC4286ub) interfaceC4252sb).b(this.f29162a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f29162a.getErrorMessage());
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29164a;

        public k(IronSourceError ironSourceError) {
            this.f29164a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4252sb interfaceC4252sb = Dd.this.f29135b;
            if (interfaceC4252sb != null) {
                ((InterfaceC4286ub) interfaceC4252sb).b(this.f29164a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f29164a.getErrorMessage());
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29166a;

        public l(AdInfo adInfo) {
            this.f29166a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.c(dd2.a(this.f29166a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f29166a));
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29168a;

        public m(AdInfo adInfo) {
            this.f29168a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.c(dd2.a(this.f29168a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f29168a));
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29170a;

        public n(AdInfo adInfo) {
            this.f29170a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.b(dd2.a(this.f29170a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f29170a));
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29172a;

        public o(AdInfo adInfo) {
            this.f29172a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29135b;
            if (interfaceC4252sb != null) {
                interfaceC4252sb.b(dd2.a(this.f29172a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f29172a));
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29175b;

        public p(boolean z10, AdInfo adInfo) {
            this.f29174a = z10;
            this.f29175b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4252sb interfaceC4252sb = dd2.f29136c;
            if (interfaceC4252sb != null) {
                if (!this.f29174a) {
                    ((InterfaceC4269tb) interfaceC4252sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4269tb) interfaceC4252sb).d(dd2.a(this.f29175b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f29175b));
            }
        }
    }

    private Dd() {
    }

    public static Dd a() {
        return f29134d;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(C4041gd c4041gd, AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4041gd, adInfo));
        } else if (this.f29135b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4041gd, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4252sb interfaceC4252sb = this.f29135b;
        if (interfaceC4252sb == null || !(interfaceC4252sb instanceof InterfaceC4286ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f29135b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(InterfaceC4252sb interfaceC4252sb) {
        this.f29135b = interfaceC4252sb;
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC4252sb interfaceC4252sb = this.f29135b;
        if (interfaceC4252sb == null || !(interfaceC4252sb instanceof InterfaceC4269tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b() {
    }

    public void b(C4041gd c4041gd, AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4041gd, adInfo));
        } else if (this.f29135b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4041gd, adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f29135b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void b(InterfaceC4252sb interfaceC4252sb) {
        this.f29136c = interfaceC4252sb;
    }

    public void c() {
    }

    public void c(AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f29135b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f29136c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4252sb interfaceC4252sb = this.f29135b;
        if (interfaceC4252sb == null || !(interfaceC4252sb instanceof InterfaceC4286ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }
}
