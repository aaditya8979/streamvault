package p000do;

import kotlinx.coroutines.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class p extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c<?> f59878f;

    public p(@NotNull c<?> cVar) {
        this.f59878f = cVar;
    }

    @Override // p000do.u1
    public boolean u() {
        return true;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        c<?> cVar = this.f59878f;
        cVar.S(cVar.x(t()));
    }
}
