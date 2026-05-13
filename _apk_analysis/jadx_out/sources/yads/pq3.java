package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class pq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f93723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(tq3 tq3Var) {
        super(0);
        this.f93723b = tq3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f93723b.f95323a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoaded();
        }
        return bn.r.f5635a;
    }
}
