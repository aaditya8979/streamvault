package p000do;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class n2 extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59871h = AtomicIntegerFieldUpdater.newUpdater(n2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Thread f59872f = Thread.currentThread();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public y0 f59873g;

    public final void A(@NotNull g gVar) {
        int i10;
        this.f59873g = JobKt__JobKt.o(gVar, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59871h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                z(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f59871h.compareAndSet(this, i10, 0));
    }

    @Override // p000do.u1
    public boolean u() {
        return true;
    }

    @Override // p000do.u1
    public void v(@Nullable Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59871h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                z(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f59871h.compareAndSet(this, i10, 2));
        this.f59872f.interrupt();
        f59871h.set(this, 3);
    }

    public final void x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59871h;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        z(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f59871h.compareAndSet(this, i10, 1)) {
                y0 y0Var = this.f59873g;
                if (y0Var != null) {
                    y0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final Void z(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }
}
