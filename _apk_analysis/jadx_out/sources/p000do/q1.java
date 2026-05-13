package p000do;

import bn.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59881g = AtomicIntegerFieldUpdater.newUpdater(q1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<Throwable, r> f59882f;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(@NotNull l<? super Throwable, r> lVar) {
        this.f59882f = lVar;
    }

    @Override // p000do.u1
    public boolean u() {
        return true;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        if (f59881g.compareAndSet(this, 0, 1)) {
            this.f59882f.invoke(th2);
        }
    }
}
