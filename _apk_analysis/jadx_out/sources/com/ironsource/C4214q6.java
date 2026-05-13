package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C4105k6;
import com.ironsource.InterfaceC4081j0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4214q6 implements InterfaceC4247s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f33338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f33339b;

    public C4214q6(@NotNull C3967cb c3967cb, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "adInternal");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33338a = c3967cb;
        this.f33339b = levelPlayAdInfo;
    }

    private final InterfaceC4247s6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (!C4015f5.f31688a.a(Pf.f30178a.a(levelPlayAdError))) {
            return new C4105k6(this.f33338a, C4105k6.a.ShowFailed);
        }
        C3967cb c3967cb = this.f33338a;
        return new C4179o6(c3967cb, levelPlayAdInfo, c3967cb.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4214q6 c4214q6, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4214q6, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfoWithPlacement");
        InterfaceC3985db interfaceC3985dbK = c4214q6.f33338a.k();
        if (interfaceC3985dbK != null) {
            interfaceC3985dbK.onAdDisplayed(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a() {
        this.f33338a.a("onAdExpired on showing state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f33338a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f33338a.a(new LevelPlayAdError(string, this.f33338a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f33339b);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33338a.a(a(levelPlayAdError, this.f33339b));
        this.f33338a.a(levelPlayAdError, this.f33339b);
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f33339b;
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public InterfaceC4081j0 c() {
        return new InterfaceC4081j0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void loadAd() {
        String string = this.f33338a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        C3967cb.a(this.f33338a, new LevelPlayAdError(string, this.f33338a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClicked() {
        this.f33338a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClosed() {
        this.f33338a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        C4173o0 c4173o0F = this.f33338a.f();
        final LevelPlayAdInfo levelPlayAdInfo2 = new LevelPlayAdInfo(levelPlayAdInfo, this.f33339b.getPlacementName());
        IronLog.INTERNAL.verbose(C4173o0.a(c4173o0F, "onAdDisplayed adInfo: " + levelPlayAdInfo2, (String) null, 2, (Object) null));
        c4173o0F.e().h().e();
        C3967cb c3967cb = this.f33338a;
        c3967cb.a(new C4230r6(c3967cb, levelPlayAdInfo2));
        c4173o0F.e(new Runnable() { // from class: com.ironsource.rl
            @Override // java.lang.Runnable
            public final void run() {
                C4214q6.a(this.f33435b, levelPlayAdInfo2);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33338a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33338a.a("onAdLoadFailed on showing state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33338a.a("onAdLoaded on showing state");
    }
}
