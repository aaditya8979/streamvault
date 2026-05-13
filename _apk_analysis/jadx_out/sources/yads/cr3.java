package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cr3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f88593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr3(er3 er3Var) {
        super(0);
        this.f88593b = er3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f88593b.f89370a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onLeftApplication();
        }
        return bn.r.f5635a;
    }
}
