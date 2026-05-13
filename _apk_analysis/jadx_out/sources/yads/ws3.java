package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class ws3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f96486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f96487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws3(zs3 zs3Var, wp3 wp3Var) {
        super(0);
        this.f96486b = zs3Var;
        this.f96487c = wp3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f96486b.f97763a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToShow(this.f96487c);
        }
        return bn.r.f5635a;
    }
}
