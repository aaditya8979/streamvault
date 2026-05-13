package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class ar3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f87793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar3(er3 er3Var) {
        super(0);
        this.f87793b = er3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f87793b.f89370a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdLoaded();
        }
        return bn.r.f5635a;
    }
}
