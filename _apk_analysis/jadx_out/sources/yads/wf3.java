package yads;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final class wf3 extends wn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf3 f96371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf3(yf3 yf3Var) {
        super(null);
        this.f96371a = yf3Var;
    }

    @Override // wn.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        tn.p.k(kProperty, "property");
        this.f96371a.f97124f.f88000e = (ag3) obj2;
    }
}
