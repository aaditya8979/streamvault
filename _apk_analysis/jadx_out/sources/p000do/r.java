package p000do;

import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class r extends u1 implements q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final s f59884f;

    public r(@NotNull s sVar) {
        this.f59884f = sVar;
    }

    @Override // p000do.q
    public boolean a(@NotNull Throwable th2) {
        return t().g0(th2);
    }

    @Override // p000do.q
    @NotNull
    public g getParent() {
        return t();
    }

    @Override // p000do.u1
    public boolean u() {
        return true;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        this.f59884f.J(t());
    }
}
