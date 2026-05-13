package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class br3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f88119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f88120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br3(er3 er3Var, lr3 lr3Var) {
        super(0);
        this.f88119b = er3Var;
        this.f88120c = lr3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f88119b.f89370a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onImpression(this.f88120c);
        }
        return bn.r.f5635a;
    }
}
