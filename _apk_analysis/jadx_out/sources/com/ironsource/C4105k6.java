package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.InterfaceC4081j0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4105k6 implements InterfaceC4247s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f32127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f32128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f32129c;

    /* JADX INFO: renamed from: com.ironsource.k6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4105k6(@NotNull C3967cb c3967cb, @NotNull a aVar) {
        tn.p.k(c3967cb, "adInternal");
        tn.p.k(aVar, "status");
        this.f32127a = c3967cb;
        this.f32128b = aVar;
        String string = c3967cb.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f32129c = new LevelPlayAdInfo(string, c3967cb.h(), c3967cb.d().toString(), null, null, null, null, 120, null);
    }

    public /* synthetic */ C4105k6(C3967cb c3967cb, a aVar, int i10, tn.i iVar) {
        this(c3967cb, (i10 & 2) != 0 ? a.Created : aVar);
    }

    private final boolean d() {
        if (this.f32127a.h().length() == 0) {
            C3967cb c3967cb = this.f32127a;
            String string = this.f32127a.e().toString();
            tn.p.j(string, "adInternal.adId.toString()");
            C3967cb.a(c3967cb, new LevelPlayAdError(string, this.f32127a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f32127a.f().g()) {
            C3967cb c3967cb2 = this.f32127a;
            String string2 = this.f32127a.e().toString();
            tn.p.j(string2, "adInternal.adId.toString()");
            C3967cb.a(c3967cb2, new LevelPlayAdError(string2, this.f32127a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        C3931ab c3931abA = this.f32127a.l().e().a();
        if (c3931abA != null && c3931abA.a(this.f32127a.h(), this.f32127a.d())) {
            return true;
        }
        C3967cb c3967cb3 = this.f32127a;
        String string3 = this.f32127a.e().toString();
        tn.p.j(string3, "adInternal.adId.toString()");
        C3967cb.a(c3967cb3, new LevelPlayAdError(string3, this.f32127a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a() {
        this.f32127a.a("onAdExpired on " + this.f32128b + " state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String str2 = this.f32128b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f32127a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f32127a.a(new LevelPlayAdError(string, this.f32127a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f32129c);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f32127a.a("onAdDisplayFailed on " + this.f32128b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f32129c;
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public InterfaceC4081j0 c() {
        return new InterfaceC4081j0.a(this.f32128b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void loadAd() {
        if (d()) {
            this.f32127a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClicked() {
        this.f32127a.a("onAdClicked on " + this.f32128b + " state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClosed() {
        this.f32127a.a("onAdClosed on " + this.f32128b + " state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f32127a.a("onAdDisplayed on " + this.f32128b + " state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f32127a.a("onAdInfoChanged on " + this.f32128b + " state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f32127a.a("onAdLoadFailed on " + this.f32128b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f32127a.a("onAdLoaded on " + this.f32128b + " state");
    }
}
