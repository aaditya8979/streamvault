package p000do;

import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a2 implements y0, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a2 f59823b = new a2();

    @Override // p000do.q
    public boolean a(@NotNull Throwable th2) {
        return false;
    }

    @Override // p000do.y0
    public void dispose() {
    }

    @Override // p000do.q
    @Nullable
    public g getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
