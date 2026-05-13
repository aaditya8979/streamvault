package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class s7 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f94727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Map.Entry entry) {
        super(1);
        this.f94727b = entry;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        xo.b0 b0Var = (xo.b0) obj;
        xo.h.c(b0Var, "usagePercent", Integer.valueOf(((h8) this.f94727b.getValue()).f90273a));
        xo.h.b(b0Var, "isDisabled", Boolean.valueOf(((h8) this.f94727b.getValue()).f90274b));
        return bn.r.f5635a;
    }
}
