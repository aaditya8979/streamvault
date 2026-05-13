package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uq3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f95765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f95766c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq3(wq3 wq3Var) {
        super(0);
        this.f95765b = wq3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f95765b.f96480a.onBidderTokenFailedToLoad(this.f95766c);
        return bn.r.f5635a;
    }
}
