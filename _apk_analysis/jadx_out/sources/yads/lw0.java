package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lw0 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mw0 f92131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(mw0 mw0Var) {
        super(0);
        this.f92131b = mw0Var;
    }

    @Override // sn.a
    public final Object invoke() {
        Context context = this.f92131b.f92588a;
        cp2 cp2VarA = dp2.a(context, j82.a(context));
        cp2VarA.a();
        return cp2VarA;
    }
}
