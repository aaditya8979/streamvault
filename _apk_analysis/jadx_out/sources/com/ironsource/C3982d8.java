package com.ironsource;

import com.ironsource.InterfaceC3964c8;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3982d8 extends InterfaceC3964c8.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: com.ironsource.d8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31458b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31457a = str;
            this.f31458b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31457a, "onRewardedVideoAdLoadSuccess()");
            this.f31458b.onRewardedVideoAdLoadSuccess(this.f31457a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31462c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31460a = str;
            this.f31461b = ironSourceError;
            this.f31462c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31460a, "onRewardedVideoAdLoadFailed() error = " + this.f31461b.getErrorMessage());
            this.f31462c.onRewardedVideoAdLoadFailed(this.f31460a, this.f31461b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31465b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31464a = str;
            this.f31465b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31464a, "onRewardedVideoAdOpened()");
            this.f31465b.onRewardedVideoAdOpened(this.f31464a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31469c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31467a = str;
            this.f31468b = ironSourceError;
            this.f31469c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31467a, "onRewardedVideoAdShowFailed() error = " + this.f31468b.getErrorMessage());
            this.f31469c.onRewardedVideoAdShowFailed(this.f31467a, this.f31468b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31472b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31471a = str;
            this.f31472b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31471a, "onRewardedVideoAdClicked()");
            this.f31472b.onRewardedVideoAdClicked(this.f31471a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31475b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31474a = str;
            this.f31475b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31474a, "onRewardedVideoAdRewarded()");
            this.f31475b.onRewardedVideoAdRewarded(this.f31474a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f31478b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f31477a = str;
            this.f31478b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3982d8.this.a(this.f31477a, "onRewardedVideoAdClosed()");
            this.f31478b.onRewardedVideoAdClosed(this.f31477a);
        }
    }

    public C3982d8() {
    }

    public C3982d8(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new e(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new g(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new a(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new c(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new f(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }
}
