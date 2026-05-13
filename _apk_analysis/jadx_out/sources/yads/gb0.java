package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class gb0 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb0 f89901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var) {
        super(0);
        this.f89901b = hb0Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return Long.valueOf(this.f89901b.f90340a.toMillis(1L));
    }
}
