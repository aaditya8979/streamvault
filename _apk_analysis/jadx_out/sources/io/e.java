package io;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements p000do.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f71034b;

    public e(@NotNull kotlin.coroutines.d dVar) {
        this.f71034b = dVar;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f71034b;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
