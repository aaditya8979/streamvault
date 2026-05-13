package io;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class m0<T> implements k2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f71298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<T> f71299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d.c<?> f71300d;

    public m0(T t10, @NotNull ThreadLocal<T> threadLocal) {
        this.f71298b = t10;
        this.f71299c = threadLocal;
        this.f71300d = new n0(threadLocal);
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) k2.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        if (!tn.p.f(getKey(), cVar)) {
            return null;
        }
        tn.p.i(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public d.c<?> getKey() {
        return this.f71300d;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return tn.p.f(getKey(), cVar) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return k2.a.b(this, dVar);
    }

    @Override // p000do.k2
    public void restoreThreadContext(@NotNull kotlin.coroutines.d dVar, T t10) {
        this.f71299c.set(t10);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.f71298b + ", threadLocal = " + this.f71299c + ')';
    }

    @Override // p000do.k2
    public T updateThreadContext(@NotNull kotlin.coroutines.d dVar) {
        T t10 = this.f71299c.get();
        this.f71299c.set(this.f71298b);
        return t10;
    }
}
