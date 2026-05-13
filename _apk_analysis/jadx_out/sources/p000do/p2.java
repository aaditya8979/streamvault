package p000do;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p2 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final p2 f59880b = new p2();

    @Override // p000do.h0
    public void dispatch(@NotNull d dVar, @NotNull Runnable runnable) {
        t2 t2Var = (t2) dVar.get(t2.f59888c);
        if (t2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        t2Var.f59889b = true;
    }

    @Override // p000do.h0
    public boolean isDispatchNeeded(@NotNull d dVar) {
        return false;
    }

    @Override // p000do.h0
    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
