package com.moloco.sdk.internal.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class f implements d.c<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final mo.a f47616b;

    public f(@NotNull mo.a aVar) {
        p.k(aVar, "mutex");
        this.f47616b = aVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && p.f(this.f47616b, ((f) obj).f47616b);
    }

    public int hashCode() {
        return this.f47616b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f47616b + ')';
    }
}
