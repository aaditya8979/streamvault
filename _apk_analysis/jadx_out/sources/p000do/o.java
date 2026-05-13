package p000do;

import hn.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class o extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59874c = AtomicIntegerFieldUpdater.newUpdater(o.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public o(@NotNull c<?> cVar, @Nullable Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + cVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f59874c.compareAndSet(this, 0, 1);
    }
}
