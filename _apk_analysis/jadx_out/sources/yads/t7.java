package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f95083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(f8 f8Var) {
        super(1);
        this.f95083b = f8Var;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        xo.b0 b0Var = (xo.b0) obj;
        for (Map.Entry entry : this.f95083b.f89513h.entrySet()) {
            xo.h.f(b0Var, (String) entry.getKey(), new s7(entry));
        }
        return bn.r.f5635a;
    }
}
