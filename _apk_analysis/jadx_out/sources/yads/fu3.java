package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class fu3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu3 f89681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f89682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(hu3 hu3Var, AdRequestError adRequestError) {
        super(0);
        this.f89681b = hu3Var;
        this.f89682c = adRequestError;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f89681b.f90566a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.f89682c);
        }
        return bn.r.f5635a;
    }
}
