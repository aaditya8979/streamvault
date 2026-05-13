package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class us3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f95775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us3(zs3 zs3Var) {
        super(0);
        this.f95775b = zs3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f95775b.f97763a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
        return bn.r.f5635a;
    }
}
