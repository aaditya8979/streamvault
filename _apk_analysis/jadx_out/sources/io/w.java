package io;

import org.jetbrains.annotations.NotNull;
import p000do.y0;

/* JADX INFO: compiled from: NamedDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends p000do.h0 implements p000do.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.r0 f71734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p000do.h0 f71735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71736d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull p000do.h0 h0Var, @NotNull String str) {
        p000do.r0 r0Var = h0Var instanceof p000do.r0 ? (p000do.r0) h0Var : null;
        this.f71734b = r0Var == null ? p000do.o0.a() : r0Var;
        this.f71735c = h0Var;
        this.f71736d = str;
    }

    @Override // p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.d dVar) {
        return this.f71734b.A(j10, runnable, dVar);
    }

    @Override // p000do.r0
    public void a(long j10, @NotNull p000do.k<? super bn.r> kVar) {
        this.f71734b.a(j10, kVar);
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        this.f71735c.dispatch(dVar, runnable);
    }

    @Override // p000do.h0
    public void dispatchYield(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        this.f71735c.dispatchYield(dVar, runnable);
    }

    @Override // p000do.h0
    public boolean isDispatchNeeded(@NotNull kotlin.coroutines.d dVar) {
        return this.f71735c.isDispatchNeeded(dVar);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return this.f71736d;
    }
}
