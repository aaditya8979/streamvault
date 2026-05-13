package p000do;

import bn.r;
import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e2 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c<r> f59851f;

    /* JADX WARN: Multi-variable type inference failed */
    public e2(@NotNull c<? super r> cVar) {
        this.f59851f = cVar;
    }

    @Override // p000do.u1
    public boolean u() {
        return false;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        c<r> cVar = this.f59851f;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
    }
}
