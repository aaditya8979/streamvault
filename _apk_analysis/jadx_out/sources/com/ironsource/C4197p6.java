package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C4105k6;
import com.ironsource.InterfaceC4081j0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4197p6 implements InterfaceC4247s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f33220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f33221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f33223d;

    public C4197p6(@NotNull C3967cb c3967cb, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(c3967cb, "adInternal");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f33220a = c3967cb;
        this.f33221b = interfaceC4262t4;
        this.f33222c = interfaceC4262t4.a();
        String string = c3967cb.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f33223d = new LevelPlayAdInfo(string, c3967cb.h(), c3967cb.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a() {
        this.f33220a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f33220a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f33220a.a(new LevelPlayAdError(string, this.f33220a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f33223d);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33220a.a("onAdDisplayFailed on loading state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f33223d;
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public InterfaceC4081j0 c() {
        return new InterfaceC4081j0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void loadAd() {
        String string = this.f33220a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f33220a.a(new LevelPlayAdError(string, this.f33220a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f33221b.a() - this.f33222c);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClicked() {
        this.f33220a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClosed() {
        this.f33220a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33220a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33220a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33220a.a(levelPlayAdError, this.f33221b.a() - this.f33222c);
        this.f33220a.a(C4105k6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        C3967cb c3967cb = this.f33220a;
        c3967cb.a(new C4179o6(c3967cb, levelPlayAdInfo, this.f33221b));
        this.f33220a.a(levelPlayAdInfo);
    }
}
