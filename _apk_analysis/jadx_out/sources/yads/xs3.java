package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class xs3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f96864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f96865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs3(zs3 zs3Var, lr3 lr3Var) {
        super(0);
        this.f96864b = zs3Var;
        this.f96865c = lr3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f96864b.f97763a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(this.f96865c);
        }
        return bn.r.f5635a;
    }
}
