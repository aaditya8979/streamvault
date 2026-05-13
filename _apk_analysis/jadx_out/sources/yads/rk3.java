package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class rk3 extends Lambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk3 f94474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk3(wk3 wk3Var) {
        super(2);
        this.f94474b = wk3Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (qk3.f94060a[((z90) obj).ordinal()] == 1) {
            this.f94474b.f96430a.invoke(new c90(zBooleanValue));
        }
        return bn.r.f5635a;
    }
}
