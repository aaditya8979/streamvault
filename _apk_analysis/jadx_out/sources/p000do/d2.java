package p000do;

import kotlin.Result;
import kotlinx.coroutines.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d2<T> extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c<T> f59848f;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(@NotNull c<? super T> cVar) {
        this.f59848f = cVar;
    }

    @Override // p000do.u1
    public boolean u() {
        return false;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        Object objU0 = t().u0();
        if (objU0 instanceof y) {
            c<T> cVar = this.f59848f;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(((y) objU0).f59911a)));
        } else {
            c<T> cVar2 = this.f59848f;
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(v1.h(objU0)));
        }
    }
}
