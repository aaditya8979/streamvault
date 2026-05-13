package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class du3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f88986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wt3 f88987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du3(eu3 eu3Var, wt3 wt3Var) {
        super(0);
        this.f88986b = eu3Var;
        this.f88987c = wt3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f88986b.f89385a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(this.f88987c);
        }
        return bn.r.f5635a;
    }
}
