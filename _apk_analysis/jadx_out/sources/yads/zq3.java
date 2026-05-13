package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class zq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f97749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f97750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq3(er3 er3Var, AdRequestError adRequestError) {
        super(0);
        this.f97749b = er3Var;
        this.f97750c = adRequestError;
    }

    @Override // sn.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f97749b.f89370a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdFailedToLoad(this.f97750c);
        }
        return bn.r.f5635a;
    }
}
