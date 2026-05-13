package com.ironsource;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.U8;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4375zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final U8.a f34544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<TestSuiteActivity> f34545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f34546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> f34547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> f34548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f34549f;

    public C4375zf(@NotNull TestSuiteActivity testSuiteActivity, @NotNull Handler handler) {
        tn.p.k(testSuiteActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(handler, "handler");
        this.f34544a = Lb.f29764s.a().c();
        this.f34545b = new WeakReference<>(testSuiteActivity);
        this.f34546c = handler;
        this.f34547d = new AtomicReference<>();
        this.f34548e = new AtomicReference<>();
        this.f34549f = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        tn.p.k(testSuiteActivity, "$testSuiteActivity");
        tn.p.k(levelPlayBannerAdView, "$banner");
        testSuiteActivity.getContainer().addView(levelPlayBannerAdView, Pf.f30178a.a((Context) testSuiteActivity));
    }

    private final TestSuiteActivity b() {
        return this.f34545b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        tn.p.k(testSuiteActivity, "$testSuiteActivity");
        tn.p.k(levelPlayBannerAdView, "$it");
        testSuiteActivity.getContainer().removeView(levelPlayBannerAdView);
    }

    public final void a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.f34547d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f34546c.post(new Runnable() { // from class: com.ironsource.in
            @Override // java.lang.Runnable
            public final void run() {
                C4375zf.b(testSuiteActivityB, andSet);
            }
        });
    }

    public final void a(double d10) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.f34547d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f34546c.post(new Runnable() { // from class: com.ironsource.jn
            @Override // java.lang.Runnable
            public final void run() {
                C4375zf.a(testSuiteActivityB, levelPlayBannerAdView);
            }
        });
    }

    public final void a(@NotNull Hf hf2) {
        tn.p.k(hf2, "loadAdConfig");
        this.f34544a.a(hf2);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f34548e;
        String strA = hf2.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new Ef());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void a(@NotNull Hf hf2, @NotNull String str, int i10, int i11) {
        tn.p.k(hf2, "loadAdConfig");
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.f34544a.a(hf2);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Kf.f29735a.b(str, i10, i11)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f34547d;
            String strA = hf2.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new Af());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(@NotNull Hf hf2) {
        tn.p.k(hf2, "loadAdConfig");
        this.f34544a.a(hf2);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f34549f;
        String strA = hf2.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new Nf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f34548e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f34549f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f34548e.get();
            tn.p.j(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f34549f.get();
            tn.p.j(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }
}
