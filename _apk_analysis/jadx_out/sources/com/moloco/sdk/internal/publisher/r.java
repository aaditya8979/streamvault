package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements RewardedInterstitialAd, p0, FullscreenAd<RewardedInterstitialAdShowListener> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f46954f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u<RewardedInterstitialAdShowListener> f46955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.config.a f46957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46958e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull u<? super RewardedInterstitialAdShowListener> uVar, @NotNull String str, @NotNull com.moloco.sdk.internal.services.config.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(uVar, "fullscreenAd");
        tn.p.k(str, "adUnitId");
        tn.p.k(aVar, "configService");
        tn.p.k(aVar2, "metricsRecorder");
        this.f46955b = uVar;
        this.f46956c = str;
        this.f46957d = aVar;
        this.f46958e = aVar2;
    }

    public static final bn.r a(x xVar) {
        xVar.a();
        return bn.r.f5635a;
    }

    public static final bn.r b(x xVar, r rVar, boolean z10) {
        xVar.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(rVar.f46956c, null, null, 6, null));
        return bn.r.f5635a;
    }

    public static final A c(r rVar) {
        return rVar.f46955b.t();
    }

    public static final Boolean d(r rVar) {
        return rVar.f46955b.y();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e(r rVar) {
        return rVar.f46955b.q();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f46955b.destroy();
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void show(@Nullable RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final x xVar = new x(new y(rewardedInterstitialAdShowListener, new sn.a() { // from class: com.moloco.sdk.internal.publisher.i
            @Override // sn.a
            public final Object invoke() {
                return r.c(this.f46649b);
            }
        }, com.moloco.sdk.internal.k0.b()), this.f46955b.q() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f47726a, new sn.a() { // from class: com.moloco.sdk.internal.publisher.j
            @Override // sn.a
            public final Object invoke() {
                return r.d(this.f46657b);
            }
        }, this.f46956c, this.f46957d.a("reward_on_skip_visible"), new sn.a() { // from class: com.moloco.sdk.internal.publisher.k
            @Override // sn.a
            public final Object invoke() {
                return r.e(this.f46659b);
            }
        }, this.f46958e);
        this.f46955b.m(new sn.l() { // from class: com.moloco.sdk.internal.publisher.p
            @Override // sn.l
            public final Object invoke(Object obj) {
                return r.b(xVar, this, ((Boolean) obj).booleanValue());
            }
        });
        this.f46955b.l(new sn.a() { // from class: com.moloco.sdk.internal.publisher.q
            @Override // sn.a
            public final Object invoke() {
                return r.a(xVar);
            }
        });
        this.f46955b.show(xVar);
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46955b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        this.f46955b.load(str, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46955b.setCreateAdObjectStartTime(j10);
    }
}
