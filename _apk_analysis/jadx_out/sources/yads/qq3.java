package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class qq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f94121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f94122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq3(tq3 tq3Var, lr3 lr3Var) {
        super(0);
        this.f94121b = tq3Var;
        this.f94122c = lr3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f94121b.f95323a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(this.f94122c);
        }
        return bn.r.f5635a;
    }
}
