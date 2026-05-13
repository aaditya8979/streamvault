package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yt3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f97293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(eu3 eu3Var) {
        super(0);
        this.f97293b = eu3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f97293b.f89385a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        return bn.r.f5635a;
    }
}
