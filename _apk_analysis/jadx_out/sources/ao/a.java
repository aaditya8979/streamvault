package ao;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<i<T>> f5179a;

    public a(@NotNull i<? extends T> iVar) {
        tn.p.k(iVar, "sequence");
        this.f5179a = new AtomicReference<>(iVar);
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        i<T> andSet = this.f5179a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
