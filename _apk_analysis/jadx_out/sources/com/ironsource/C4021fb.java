package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3967cb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4021fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final L7 f31693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3967cb f31694b;

    /* JADX INFO: renamed from: com.ironsource.fb$a */
    public static final class a implements InterfaceC4326x0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4326x0
        @NotNull
        public AbstractC4309w0 a(boolean z10, @NotNull C4028g0 c4028g0) {
            tn.p.k(c4028g0, "adProperties");
            return F9.f29308z.a(c4028g0, C4021fb.this.f31693a.e().a(), z10);
        }
    }

    public C4021fb(@NotNull String str, @NotNull C3967cb.b bVar, @NotNull C4173o0 c4173o0, @NotNull C4070i6 c4070i6, @NotNull L7 l72, @NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull C4367z7 c4367z7) {
        tn.p.k(str, "adUnitId");
        tn.p.k(bVar, "config");
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4070i6, "adControllerFactory");
        tn.p.k(l72, IronSourceConstants.EVENTS_PROVIDER);
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(c4367z7, "idFactory");
        this.f31693a = l72;
        this.f31694b = new C3967cb(LevelPlay.AdFormat.INTERSTITIAL, str, bVar, c4173o0, c4070i6, a(), l72, interfaceC4262t4, c4367z7);
    }

    private final InterfaceC4326x0 a() {
        return new a();
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f31694b.a(activity, str);
    }

    public final void a(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f31694b.a(levelPlayInterstitialAdListener != null ? C4039gb.b(levelPlayInterstitialAdListener) : null);
    }

    @NotNull
    public final String b() {
        String string = this.f31694b.e().toString();
        tn.p.j(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f31694b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f31694b.n();
    }
}
