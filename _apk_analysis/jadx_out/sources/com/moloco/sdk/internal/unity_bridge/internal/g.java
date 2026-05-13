package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.internal.unity_bridge.internal.g;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ml.a<String, InterstitialAd> f47594a = new ml.a<>(0, 1, null);

    public static final class a implements AdLoad.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterstitialAd f47597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f47598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityLoadCallback f47599e;

        public a(String str, InterstitialAd interstitialAd, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
            this.f47596b = str;
            this.f47597c = interstitialAd;
            this.f47598d = handler;
            this.f47599e = molocoUnityLoadCallback;
        }

        public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
            molocoUnityLoadCallback.onAdLoadSuccess(str);
        }

        public static final void b(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError molocoAdError) {
            molocoUnityLoadCallback.onAdLoadFailed(str, molocoAdError.toString());
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(final MolocoAdError molocoAdError) {
            p.k(molocoAdError, "molocoAdError");
            Handler handler = this.f47598d;
            final MolocoUnityLoadCallback molocoUnityLoadCallback = this.f47599e;
            final String str = this.f47596b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.a.b(molocoUnityLoadCallback, str, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            p.k(molocoAd, "molocoAd");
            g.this.f47594a.put(this.f47596b, this.f47597c);
            Handler handler = this.f47598d;
            final MolocoUnityLoadCallback molocoUnityLoadCallback = this.f47599e;
            final String str = this.f47596b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.a.a(molocoUnityLoadCallback, str);
                }
            });
        }
    }

    public static final class b implements InterstitialAdShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f47600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityShowCallback f47601b;

        public b(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
            this.f47600a = handler;
            this.f47601b = molocoUnityShowCallback;
        }

        public static final void a(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
        }

        public static final void b(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAdError molocoAdError) {
            molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
        }

        public static final void c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
        }

        public static final void d(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(final MolocoAd molocoAd) {
            p.k(molocoAd, "molocoAd");
            Handler handler = this.f47600a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f47601b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.a(molocoUnityShowCallback, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(final MolocoAd molocoAd) {
            p.k(molocoAd, "molocoAd");
            Handler handler = this.f47600a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f47601b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(molocoUnityShowCallback, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(final MolocoAdError molocoAdError) {
            p.k(molocoAdError, "molocoAdError");
            Handler handler = this.f47600a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f47601b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.b(molocoUnityShowCallback, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(final MolocoAd molocoAd) {
            p.k(molocoAd, "molocoAd");
            Handler handler = this.f47600a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f47601b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.j
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.d(molocoUnityShowCallback, molocoAd);
                }
            });
        }
    }

    public static final r b(Handler handler, g gVar, final String str, String str2, final MolocoUnityLoadCallback molocoUnityLoadCallback, InterstitialAd interstitialAd, final MolocoAdError.AdCreateError adCreateError) {
        if (adCreateError != null) {
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    g.e(molocoUnityLoadCallback, str, adCreateError);
                }
            });
            return r.f5635a;
        }
        p.i(interstitialAd, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd");
        gVar.g(interstitialAd, str, str2, handler, molocoUnityLoadCallback);
        return r.f5635a;
    }

    public static final void d(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
        molocoUnityLoadCallback.onAdLoadSuccess(str);
    }

    public static final void e(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError.AdCreateError adCreateError) {
        molocoUnityLoadCallback.onAdLoadFailed(str, adCreateError.toString());
    }

    public static final void f(MolocoUnityShowCallback molocoUnityShowCallback, String str) {
        molocoUnityShowCallback.onAdShowFailed(str, "Ad cannot be shown as it was not loaded");
    }

    public final Handler a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return new Handler(looperMyLooper);
        }
        throw new IllegalStateException("Can't create handler inside thread " + Thread.currentThread() + " that has not called Looper.prepare()");
    }

    public final void g(InterstitialAd interstitialAd, final String str, String str2, Handler handler, final MolocoUnityLoadCallback molocoUnityLoadCallback) {
        InterstitialAd interstitialAd2 = this.f47594a.get(str);
        if (interstitialAd2 != null) {
            if (interstitialAd2.isLoaded()) {
                handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.d(molocoUnityLoadCallback, str);
                    }
                });
                return;
            }
            interstitialAd2.destroy();
        }
        interstitialAd.load(str2, new a(str, interstitialAd, handler, molocoUnityLoadCallback));
    }

    public final void h(@NotNull final String str, @NotNull final MolocoUnityShowCallback molocoUnityShowCallback) {
        p.k(str, "adUnitId");
        p.k(molocoUnityShowCallback, "callback");
        Handler handlerA = a();
        InterstitialAd interstitialAd = this.f47594a.get(str);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new b(handlerA, molocoUnityShowCallback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        handlerA.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                g.f(molocoUnityShowCallback, str);
            }
        });
    }

    public final void i(@NotNull String str, @NotNull final String str2, @NotNull final String str3, @NotNull final MolocoUnityLoadCallback molocoUnityLoadCallback) {
        p.k(str, "mediation");
        p.k(str2, "adUnitId");
        p.k(str3, "bidResponse");
        p.k(molocoUnityLoadCallback, "unityLoadCallback");
        final Handler handlerA = a();
        Moloco.createInterstitial$default(new MediationInfo(str), str2, null, new sn.p() { // from class: com.moloco.sdk.internal.unity_bridge.internal.b
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return g.b(handlerA, this, str2, str3, molocoUnityLoadCallback, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }
}
