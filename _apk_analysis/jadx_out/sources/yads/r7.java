package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class r7 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f94316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(f8 f8Var) {
        super(1);
        this.f94316b = f8Var;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        xo.b bVar = (xo.b) obj;
        Iterator it = this.f94316b.f89512g.iterator();
        while (it.hasNext()) {
            xo.h.a(bVar, (String) it.next());
        }
        return bn.r.f5635a;
    }
}
