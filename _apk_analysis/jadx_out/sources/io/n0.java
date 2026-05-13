package io;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements d.c<m0<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<?> f71301b;

    public n0(@NotNull ThreadLocal<?> threadLocal) {
        this.f71301b = threadLocal;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && tn.p.f(this.f71301b, ((n0) obj).f71301b);
    }

    public int hashCode() {
        return this.f71301b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f71301b + ')';
    }
}
