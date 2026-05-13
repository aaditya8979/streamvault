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

/* JADX INFO: renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4230r6 implements InterfaceC4247s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f33410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f33411b;

    public C4230r6(@NotNull C3967cb c3967cb, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "adInternal");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33410a = c3967cb;
        this.f33411b = levelPlayAdInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4230r6 c4230r6) {
        tn.p.k(c4230r6, "this$0");
        InterfaceC3985db interfaceC3985dbK = c4230r6.f33410a.k();
        if (interfaceC3985dbK != null) {
            interfaceC3985dbK.onAdClicked(c4230r6.f33411b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4230r6 c4230r6) {
        tn.p.k(c4230r6, "this$0");
        c4230r6.f33410a.a(C4105k6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4230r6 c4230r6) {
        tn.p.k(c4230r6, "this$0");
        InterfaceC3985db interfaceC3985dbK = c4230r6.f33410a.k();
        if (interfaceC3985dbK != null) {
            interfaceC3985dbK.onAdClosed(c4230r6.f33411b);
        }
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a() {
        this.f33410a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f33410a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        this.f33410a.a(new LevelPlayAdError(string, this.f33410a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f33411b);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33410a.a("onAdDisplayFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f33411b;
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public InterfaceC4081j0 c() {
        return new InterfaceC4081j0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void loadAd() {
        String string = this.f33410a.e().toString();
        tn.p.j(string, "adInternal.adId.toString()");
        C3967cb.a(this.f33410a, new LevelPlayAdError(string, this.f33410a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33410a.f(), "onAdClicked adInfo: " + this.f33411b, (String) null, 2, (Object) null));
        this.f33410a.f().e(new Runnable() { // from class: com.ironsource.vl
            @Override // java.lang.Runnable
            public final void run() {
                C4230r6.a(this.f34294b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33410a.f(), "onAdClosed adInfo: " + this.f33411b, (String) null, 2, (Object) null));
        this.f33410a.f().d(new Runnable() { // from class: com.ironsource.tl
            @Override // java.lang.Runnable
            public final void run() {
                C4230r6.b(this.f34134b);
            }
        });
        this.f33410a.f().e(new Runnable() { // from class: com.ironsource.ul
            @Override // java.lang.Runnable
            public final void run() {
                C4230r6.c(this.f34233b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33410a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33410a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33410a.a("onAdLoadFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33410a.a("onAdLoaded on shown state");
    }
}
