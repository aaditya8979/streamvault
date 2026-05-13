package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.l;
import tn.p;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, l {
    private final /* synthetic */ sn.l function;

    public Transformations$sam$androidx_lifecycle_Observer$0(sn.l lVar) {
        p.k(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof Observer) && (obj instanceof l)) {
            return p.f(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // tn.l
    @NotNull
    public final bn.e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
