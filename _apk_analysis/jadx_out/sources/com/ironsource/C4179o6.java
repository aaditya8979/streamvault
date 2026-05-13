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

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4179o6 implements InterfaceC4247s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f33143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f33144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f33145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33146d;

    public C4179o6(@NotNull C3967cb c3967cb, @NotNull LevelPlayAdInfo levelPlayAdInfo, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(c3967cb, "adInternal");
        tn.p.k(levelPlayAdInfo, "adInfo");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f33143a = c3967cb;
        this.f33144b = levelPlayAdInfo;
        this.f33145c = interfaceC4262t4;
        this.f33146d = interfaceC4262t4.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4179o6 c4179o6, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4179o6, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        InterfaceC3985db interfaceC3985dbK = c4179o6.f33143a.k();
        if (interfaceC3985dbK != null) {
            interfaceC3985dbK.onAdInfoChanged(levelPlayAdInfo);
        }
    }

    private final long d() {
        return this.f33145c.a() - this.f33146d;
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33143a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f33143a.a(C4105k6.a.Expired);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C4041gd c4041gdA = this.f33143a.f().a(this.f33143a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f33144b, str);
        this.f33144b = levelPlayAdInfo;
        C3967cb c3967cb = this.f33143a;
        c3967cb.a(new C4214q6(c3967cb, levelPlayAdInfo));
        this.f33143a.c().a(activity, c4041gdA);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33143a.a("onAdDisplayFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f33144b;
    }

    @Override // com.ironsource.InterfaceC4247s6
    @NotNull
    public InterfaceC4081j0 c() {
        M3 m3A = this.f33143a.l().f().a(this.f33143a.h());
        return m3A.d() ? InterfaceC4081j0.a.f31975c.a(m3A.e()) : InterfaceC4081j0.b.f31978a;
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void loadAd() {
        this.f33143a.f().e().h().a(Long.valueOf(d()));
        this.f33143a.a(this.f33144b);
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClicked() {
        this.f33143a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdClosed() {
        this.f33143a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33143a.a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        C4173o0 c4173o0F = this.f33143a.f();
        IronLog.INTERNAL.verbose(C4173o0.a(c4173o0F, "onAdInfoChanged adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c4173o0F.e().h().a(this.f33144b, levelPlayAdInfo);
        this.f33144b = levelPlayAdInfo;
        c4173o0F.e(new Runnable() { // from class: com.ironsource.ml
            @Override // java.lang.Runnable
            public final void run() {
                C4179o6.a(this.f32993b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f33143a.a("onAdLoadFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4247s6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f33143a.a("onAdLoaded on loaded state");
    }
}
