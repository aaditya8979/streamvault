package io;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a0<T> extends kotlinx.coroutines.a<T> implements jn.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final hn.c<T> f64327e;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@NotNull kotlin.coroutines.d dVar, @NotNull hn.c<? super T> cVar) {
        super(dVar, true, true);
        this.f64327e = cVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean B0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void W(@Nullable Object obj) {
        i.b(IntrinsicsKt__IntrinsicsJvmKt.d(this.f64327e), p000do.z.a(obj, this.f64327e));
    }

    @Override // kotlinx.coroutines.a
    public void f1(@Nullable Object obj) {
        hn.c<T> cVar = this.f64327e;
        cVar.resumeWith(p000do.z.a(obj, cVar));
    }

    @Override // jn.c
    @Nullable
    public final jn.c getCallerFrame() {
        hn.c<T> cVar = this.f64327e;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    public void j1() {
    }
}
