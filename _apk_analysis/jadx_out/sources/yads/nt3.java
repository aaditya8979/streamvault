package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class nt3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt3 f92988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f92989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt3(pt3 pt3Var, AdRequestError adRequestError) {
        super(0);
        this.f92988b = pt3Var;
        this.f92989c = adRequestError;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f92988b.f93772a.onAdFailedToLoad(this.f92989c);
        return bn.r.f5635a;
    }
}
