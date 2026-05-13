package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class bt3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ct3 f88141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts3 f88142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt3(ct3 ct3Var, ts3 ts3Var) {
        super(0);
        this.f88141b = ct3Var;
        this.f88142c = ts3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f88141b.f88604a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdLoaded(this.f88142c);
        }
        return bn.r.f5635a;
    }
}
