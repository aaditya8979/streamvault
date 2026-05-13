package p000do;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final y0 f59822f;

    public a1(@NotNull y0 y0Var) {
        this.f59822f = y0Var;
    }

    @Override // p000do.u1
    public boolean u() {
        return false;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        this.f59822f.dispose();
    }
}
