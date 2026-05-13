package ko;

import io.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final j f73194b = new j();

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        b.f73178h.M(runnable, true, false);
    }

    @Override // p000do.h0
    public void dispatchYield(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        b.f73178h.M(runnable, true, true);
    }

    @Override // p000do.h0
    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return i10 >= i.f73191d ? n.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}
