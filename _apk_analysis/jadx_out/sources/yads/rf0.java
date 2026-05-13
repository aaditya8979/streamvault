package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class rf0 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f94430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(z1 z1Var, long j10) {
        super(1);
        this.f94430b = z1Var;
        this.f94431c = j10;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        this.f94430b.a(this.f94431c);
        return bn.r.f5635a;
    }
}
