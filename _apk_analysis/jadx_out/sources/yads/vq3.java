package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class vq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f96172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f96173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3Var, String str) {
        super(0);
        this.f96172b = wq3Var;
        this.f96173c = str;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f96172b.f96480a.onBidderTokenLoaded(this.f96173c);
        return bn.r.f5635a;
    }
}
