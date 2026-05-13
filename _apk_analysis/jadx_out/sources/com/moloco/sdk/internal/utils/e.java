package com.moloco.sdk.internal.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class e implements d.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f47615b;

    public e(@NotNull f fVar) {
        p.k(fVar, "key");
        this.f47615b = fVar;
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f getKey() {
        return this.f47615b;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }
}
