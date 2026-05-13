package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3967cb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4219qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3967cb f33348a;

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    public static final class a implements InterfaceC4326x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L7 f33349a;

        public a(L7 l72) {
            this.f33349a = l72;
        }

        @Override // com.ironsource.InterfaceC4326x0
        @NotNull
        public AbstractC4309w0 a(boolean z10, @NotNull C4028g0 c4028g0) {
            tn.p.k(c4028g0, "adProperties");
            return Td.f30507z.a(c4028g0, this.f33349a.e().a(), z10);
        }
    }

    public C4219qb(@NotNull String str, @NotNull C3967cb.b bVar, @NotNull C4173o0 c4173o0, @NotNull C4070i6 c4070i6, @NotNull L7 l72, @NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull C4367z7 c4367z7) {
        tn.p.k(str, "adUnitId");
        tn.p.k(bVar, "config");
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4070i6, "adControllerFactory");
        tn.p.k(l72, IronSourceConstants.EVENTS_PROVIDER);
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(c4367z7, "idFactory");
        this.f33348a = new C3967cb(LevelPlay.AdFormat.REWARDED, str, bVar, c4173o0, c4070i6, a(l72), l72, interfaceC4262t4, c4367z7);
    }

    private final a a(L7 l72) {
        return new a(l72);
    }

    @NotNull
    public final String a() {
        String string = this.f33348a.e().toString();
        tn.p.j(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f33348a.a(activity, str);
    }

    public final void a(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f33348a.a(levelPlayRewardedAdListener != null ? C4235rb.b(levelPlayRewardedAdListener) : null);
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f33348a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f33348a.n();
    }
}
