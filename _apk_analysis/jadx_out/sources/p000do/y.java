package p000do;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes7.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59910b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f59911a;

    public y(@NotNull Throwable th2, boolean z10) {
        this.f59911a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public /* synthetic */ y(Throwable th2, boolean z10, int i10, i iVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean a() {
        return f59910b.get(this) == 1;
    }

    public final boolean c() {
        return f59910b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return m0.a(this) + '[' + this.f59911a + ']';
    }
}
