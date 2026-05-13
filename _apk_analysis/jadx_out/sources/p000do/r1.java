package p000do;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class r1 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<Throwable, r> f59885f;

    /* JADX WARN: Multi-variable type inference failed */
    public r1(@NotNull l<? super Throwable, r> lVar) {
        this.f59885f = lVar;
    }

    @Override // p000do.u1
    public boolean u() {
        return false;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        this.f59885f.invoke(th2);
    }
}
