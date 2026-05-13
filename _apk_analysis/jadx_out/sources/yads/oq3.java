package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class oq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f93309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f93310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq3(tq3 tq3Var, AdRequestError adRequestError) {
        super(0);
        this.f93309b = tq3Var;
        this.f93310c = adRequestError;
    }

    @Override // sn.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f93309b.f95323a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(this.f93310c);
        }
        return bn.r.f5635a;
    }
}
