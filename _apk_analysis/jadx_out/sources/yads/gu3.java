package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class gu3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu3 f90123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xt3 f90124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu3(hu3 hu3Var, xt3 xt3Var) {
        super(0);
        this.f90123b = hu3Var;
        this.f90124c = xt3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f90123b.f90566a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(this.f90124c);
        }
        return bn.r.f5635a;
    }
}
