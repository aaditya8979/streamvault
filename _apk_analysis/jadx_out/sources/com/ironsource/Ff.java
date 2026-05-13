package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4375zf f29335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Gf f29336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final V8 f29337c;

    public Ff(@NotNull C4375zf c4375zf, @NotNull V8 v82, @NotNull Gf gf2) {
        tn.p.k(c4375zf, "adsManager");
        tn.p.k(v82, "uiLifeCycleListener");
        tn.p.k(gf2, "javaScriptEvaluator");
        this.f29335a = c4375zf;
        this.f29336b = gf2;
        this.f29337c = v82;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f29336b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f29335a.a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f29337c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f29335a.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(Boolean.valueOf(this.f29335a.c())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(Boolean.valueOf(this.f29335a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(@Nullable String str, @NotNull String str2, boolean z10, boolean z11, @NotNull String str3, int i10, int i11) {
        tn.p.k(str2, "adNetwork");
        tn.p.k(str3, UnifiedMediationParams.KEY_DESCRIPTION);
        this.f29335a.a(new Hf(str2, z10, Boolean.valueOf(z11), str), str3, i10, i11);
    }

    @JavascriptInterface
    public final void loadBannerAd(@NotNull String str, boolean z10, boolean z11, @NotNull String str2, int i10, int i11) {
        tn.p.k(str, "adNetwork");
        tn.p.k(str2, UnifiedMediationParams.KEY_DESCRIPTION);
        loadBannerAd(null, str, z10, z11, str2, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@Nullable String str, @NotNull String str2, boolean z10, boolean z11) {
        tn.p.k(str2, "adNetwork");
        this.f29335a.a(new Hf(str2, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@NotNull String str, boolean z10, boolean z11) {
        tn.p.k(str, "adNetwork");
        loadInterstitialAd(null, str, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@Nullable String str, @NotNull String str2, boolean z10, boolean z11) {
        tn.p.k(str2, "adNetwork");
        this.f29335a.b(new Hf(str2, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@NotNull String str, boolean z10, boolean z11) {
        tn.p.k(str, "adNetwork");
        loadRewardedVideoAd(null, str, z10, z11);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f29337c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f29335a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f29335a.f();
    }
}
