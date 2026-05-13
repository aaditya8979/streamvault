package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ot3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt3 f93326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.d f93327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(pt3 pt3Var, com.yandex.mobile.ads.nativeads.d dVar) {
        super(0);
        this.f93326b = pt3Var;
        this.f93327c = dVar;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f93326b.f93772a.onAdLoaded(this.f93327c);
        return bn.r.f5635a;
    }
}
