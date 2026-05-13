package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.InterfaceC4349y6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4052h6 extends AbstractC4134m implements InterfaceC4315w6, InterfaceC4332x6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4087j6 f31839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4028g0 f31840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4349y6 f31841d;

    public C4052h6(@NotNull InterfaceC4087j6 interfaceC4087j6, @NotNull C4173o0 c4173o0, @NotNull C4028g0 c4028g0, @NotNull InterfaceC4349y6.b bVar, @NotNull InterfaceC4281u6 interfaceC4281u6) {
        tn.p.k(interfaceC4087j6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(bVar, "adUnitStrategyFactory");
        tn.p.k(interfaceC4281u6, "fullscreenAdUnitFactory");
        this.f31839b = interfaceC4087j6;
        this.f31840c = c4028g0;
        this.f31841d = bVar.a(c4173o0, c4173o0.b(c4028g0.e(), c4028g0.c()), interfaceC4281u6, this, this);
    }

    public /* synthetic */ C4052h6(InterfaceC4087j6 interfaceC4087j6, C4173o0 c4173o0, C4028g0 c4028g0, InterfaceC4349y6.b bVar, InterfaceC4281u6 interfaceC4281u6, int i10, tn.i iVar) {
        this(interfaceC4087j6, c4173o0, c4028g0, (i10 & 8) != 0 ? new InterfaceC4349y6.b() : bVar, interfaceC4281u6);
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void a() {
        this.f31839b.a();
    }

    public final void a(@NotNull Activity activity, @Nullable C4041gd c4041gd) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f31840c.a(c4041gd);
        this.f31841d.a(activity);
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC4087j6 interfaceC4087j6 = this.f31839b;
        String string = this.f31840c.b().toString();
        tn.p.j(string, "adProperties.adId.toString()");
        interfaceC4087j6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f31840c.c()));
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31839b.onAdDisplayed(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4315w6
    public void a(@NotNull LevelPlayReward levelPlayReward) {
        tn.p.k(levelPlayReward, "reward");
        this.f31839b.a(levelPlayReward);
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31839b.onAdLoaded(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void c(@Nullable IronSourceError ironSourceError) {
        InterfaceC4087j6 interfaceC4087j6 = this.f31839b;
        String string = this.f31840c.b().toString();
        tn.p.j(string, "adProperties.adId.toString()");
        interfaceC4087j6.a(new LevelPlayAdError(ironSourceError, string, this.f31840c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f31839b.onAdClicked();
    }

    public final void m() {
        this.f31841d.loadAd();
    }

    @Override // com.ironsource.InterfaceC4332x6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31839b.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4315w6
    public void onClosed() {
        this.f31839b.onAdClosed();
    }
}
