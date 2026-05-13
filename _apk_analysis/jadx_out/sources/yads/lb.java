package yads;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class lb implements f32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ix0 f91921a;

    public lb(ix0 ix0Var) {
        this.f91921a = ix0Var;
    }

    @Override // yads.f32
    public final void a(x51 x51Var) {
        lm2 lm2Var = this.f91921a.f91027a;
        KProperty kProperty = ix0.f91026b[0];
        lm2Var.getClass();
        lm2Var.f92035a = new WeakReference(x51Var);
    }
}
