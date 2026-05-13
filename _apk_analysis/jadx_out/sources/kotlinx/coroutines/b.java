package kotlinx.coroutines;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b2;
import p000do.m0;
import sn.l;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface b extends b2 {

    /* JADX INFO: compiled from: CancellableContinuationImpl.kt */
    public static final class a implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final l<Throwable, r> f73266b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull l<? super Throwable, r> lVar) {
            this.f73266b = lVar;
        }

        @Override // kotlinx.coroutines.b
        public void a(@Nullable Throwable th2) {
            this.f73266b.invoke(th2);
        }

        @NotNull
        public String toString() {
            return "CancelHandler.UserSupplied[" + m0.a(this.f73266b) + '@' + m0.b(this) + ']';
        }
    }

    void a(@Nullable Throwable th2);
}
