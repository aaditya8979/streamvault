package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class sq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f94916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq3(tq3 tq3Var) {
        super(0);
        this.f94916b = tq3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f94916b.f95323a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
        return bn.r.f5635a;
    }
}
