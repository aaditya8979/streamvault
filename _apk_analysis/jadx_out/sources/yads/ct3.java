package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public final class ct3 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdLoadListener f88604a;

    public ct3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f88604a = interstitialAdLoadListener;
    }

    @Override // yads.w00
    public final void a(jd1 jd1Var) {
        new CallbackStackTraceMarker(new bt3(this, new ts3(jd1Var, new xp3(), new lk())));
    }

    @Override // yads.w00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new at3(this, new AdRequestError(l4Var.f91878a, l4Var.f91880c, l4Var.f91881d)));
    }
}
