package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class at3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ct3 f87807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f87808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at3(ct3 ct3Var, AdRequestError adRequestError) {
        super(0);
        this.f87807b = ct3Var;
        this.f87808c = adRequestError;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f87807b.f88604a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.f87808c);
        }
        return bn.r.f5635a;
    }
}
