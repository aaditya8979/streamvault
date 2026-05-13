package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class r8 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8 f94322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(t8 t8Var) {
        super(0);
        this.f94322b = t8Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new b9(new p8(), new q8(), new z8()).a(this.f94322b.f95094b.getApplicationContext());
    }
}
