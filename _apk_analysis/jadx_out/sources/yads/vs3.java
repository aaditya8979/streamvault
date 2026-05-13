package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class vs3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f96184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs3(zs3 zs3Var) {
        super(0);
        this.f96184b = zs3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f96184b.f97763a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
        return bn.r.f5635a;
    }
}
