package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class b12 implements yo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eq2 f87867a;

    public /* synthetic */ b12(Context context, at1 at1Var) {
        this(new h12(context, at1Var));
    }

    public b12(eq2 eq2Var) {
        this.f87867a = eq2Var;
    }

    @Override // yads.yo2
    public final Object a(e82 e82Var) {
        return (d12) this.f87867a.a(e82Var);
    }

    @Override // yads.yo2
    public final boolean a() {
        return true;
    }
}
