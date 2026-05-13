package com.ironsource;

import com.ironsource.InterfaceC3964c8;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3928a8 extends InterfaceC3964c8.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30925b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30924a = str;
            this.f30925b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30924a, "onInterstitialAdReady()");
            this.f30925b.onInterstitialAdReady(this.f30924a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f30928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30929c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30927a = str;
            this.f30928b = ironSourceError;
            this.f30929c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30927a, "onInterstitialAdLoadFailed() error = " + this.f30928b.getErrorMessage());
            this.f30929c.onInterstitialAdLoadFailed(this.f30927a, this.f30928b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30932b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30931a = str;
            this.f30932b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30931a, "onInterstitialAdOpened()");
            this.f30932b.onInterstitialAdOpened(this.f30931a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f30935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30936c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30934a = str;
            this.f30935b = ironSourceError;
            this.f30936c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30934a, "onInterstitialAdShowFailed() error = " + this.f30935b.getErrorMessage());
            this.f30936c.onInterstitialAdShowFailed(this.f30934a, this.f30935b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30939b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30938a = str;
            this.f30939b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30938a, "onInterstitialAdClicked()");
            this.f30939b.onInterstitialAdClicked(this.f30938a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f30942b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f30941a = str;
            this.f30942b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3928a8.this.a(this.f30941a, "onInterstitialAdClosed()");
            this.f30942b.onInterstitialAdClosed(this.f30941a);
        }
    }

    public C3928a8() {
    }

    public C3928a8(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new e(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new f(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new c(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new a(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }
}
