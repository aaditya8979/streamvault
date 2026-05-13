package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4054h8 extends C4261t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4054h8 f31842d = new C4054h8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4057hb f31843b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4057hb f31844c = null;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31845a;

        public a(AdInfo adInfo) {
            this.f31845a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.e(c4054h8.a(this.f31845a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4054h8.this.a(this.f31845a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31848b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f31847a = ironSourceError;
            this.f31848b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.a(this.f31847a, c4054h8.a(this.f31848b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4054h8.this.a(this.f31848b) + ", error = " + this.f31847a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31851b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f31850a = ironSourceError;
            this.f31851b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.a(this.f31850a, c4054h8.a(this.f31851b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4054h8.this.a(this.f31851b) + ", error = " + this.f31850a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31853a;

        public d(AdInfo adInfo) {
            this.f31853a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.d(c4054h8.a(this.f31853a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4054h8.this.a(this.f31853a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31855a;

        public e(AdInfo adInfo) {
            this.f31855a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.d(c4054h8.a(this.f31855a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4054h8.this.a(this.f31855a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31857a;

        public f(AdInfo adInfo) {
            this.f31857a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.a(c4054h8.a(this.f31857a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4054h8.this.a(this.f31857a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31859a;

        public g(AdInfo adInfo) {
            this.f31859a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.a(c4054h8.a(this.f31859a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4054h8.this.a(this.f31859a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31861a;

        public h(IronSourceError ironSourceError) {
            this.f31861a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4057hb interfaceC4057hb = C4054h8.this.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.b(this.f31861a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31861a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31863a;

        public i(IronSourceError ironSourceError) {
            this.f31863a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4057hb interfaceC4057hb = C4054h8.this.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.b(this.f31863a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31863a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31865a;

        public j(AdInfo adInfo) {
            this.f31865a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.c(c4054h8.a(this.f31865a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4054h8.this.a(this.f31865a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$k */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31867a;

        public k(AdInfo adInfo) {
            this.f31867a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.c(c4054h8.a(this.f31867a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4054h8.this.a(this.f31867a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31869a;

        public l(AdInfo adInfo) {
            this.f31869a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.b(c4054h8.a(this.f31869a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4054h8.this.a(this.f31869a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$m */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31871a;

        public m(AdInfo adInfo) {
            this.f31871a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31843b;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.b(c4054h8.a(this.f31871a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4054h8.this.a(this.f31871a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$n */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31873a;

        public n(AdInfo adInfo) {
            this.f31873a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4054h8 c4054h8 = C4054h8.this;
            InterfaceC4057hb interfaceC4057hb = c4054h8.f31844c;
            if (interfaceC4057hb != null) {
                interfaceC4057hb.e(c4054h8.a(this.f31873a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4054h8.this.a(this.f31873a));
            }
        }
    }

    private C4054h8() {
    }

    public static synchronized C4054h8 a() {
        return f31842d;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public synchronized void a(InterfaceC4057hb interfaceC4057hb) {
        this.f31843b = interfaceC4057hb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    public synchronized void b(InterfaceC4057hb interfaceC4057hb) {
        this.f31844c = interfaceC4057hb;
    }

    public void b(AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void c(AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f31844c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f31843b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }
}
