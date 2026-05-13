package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class iv3 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv3 f91021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv3(jv3 jv3Var) {
        super(0);
        this.f91021b = jv3Var;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f91021b.f91395a.onVideoComplete();
        return bn.r.f5635a;
    }
}
