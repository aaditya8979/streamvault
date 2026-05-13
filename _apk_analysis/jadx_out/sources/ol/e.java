package ol;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f76468a;

    public e(@NotNull c cVar) {
        p.k(cVar, "ref");
        this.f76468a = cVar;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.f76468a + ']';
    }
}
