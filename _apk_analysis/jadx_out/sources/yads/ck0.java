package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class ck0 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk0 f88482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f88483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(dk0 dk0Var, String str) {
        super(1);
        this.f88482b = dk0Var;
        this.f88483c = str;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        gk0 gk0Var = (gk0) obj;
        dk0 dk0Var = this.f88482b;
        String str = this.f88483c;
        ak0 ak0Var = (ak0) dk0Var.f88885d.remove(str);
        if (ak0Var != null) {
            dk0Var.f88884c.a(str, gk0Var.f90016a, gk0Var.f90017b);
            dk0Var.a(str, ak0Var, gk0Var.f90016a, null);
        }
        return bn.r.f5635a;
    }
}
