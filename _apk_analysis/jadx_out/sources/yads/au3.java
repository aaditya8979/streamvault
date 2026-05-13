package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class au3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f87813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f87814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(eu3 eu3Var, wp3 wp3Var) {
        super(0);
        this.f87813b = eu3Var;
        this.f87814c = wp3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f87813b.f89385a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(this.f87814c);
        }
        return bn.r.f5635a;
    }
}
