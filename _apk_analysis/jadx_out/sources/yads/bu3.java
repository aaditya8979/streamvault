package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class bu3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f88151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f88152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(eu3 eu3Var, lr3 lr3Var) {
        super(0);
        this.f88151b = eu3Var;
        this.f88152c = lr3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f88151b.f89385a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(this.f88152c);
        }
        return bn.r.f5635a;
    }
}
