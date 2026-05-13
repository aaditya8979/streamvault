package com.ironsource;

import com.ironsource.C4208q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private C4208q0.a f29569a;

    public I(@NotNull C4208q0.a aVar) {
        tn.p.k(aVar, "performance");
        this.f29569a = aVar;
    }

    public static /* synthetic */ I a(I i10, C4208q0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = i10.f29569a;
        }
        return i10.a(aVar);
    }

    @NotNull
    public final I a(@NotNull C4208q0.a aVar) {
        tn.p.k(aVar, "performance");
        return new I(aVar);
    }

    @NotNull
    public final C4208q0.a a() {
        return this.f29569a;
    }

    @NotNull
    public final C4208q0.a b() {
        return this.f29569a;
    }

    public final void b(@NotNull C4208q0.a aVar) {
        tn.p.k(aVar, "<set-?>");
        this.f29569a = aVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.f29569a == ((I) obj).f29569a;
    }

    public int hashCode() {
        return this.f29569a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.f29569a + ")";
    }
}
