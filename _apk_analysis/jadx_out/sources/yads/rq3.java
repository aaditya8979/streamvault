package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class rq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f94575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq3(tq3 tq3Var) {
        super(0);
        this.f94575b = tq3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f94575b.f95323a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onLeftApplication();
        }
        return bn.r.f5635a;
    }
}
