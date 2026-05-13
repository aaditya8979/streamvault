package io;

import androidx.core.internal.view.SupportMenu;
import io.b0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b2;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b0<S extends b0<S>> extends c<S> implements b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68503e = AtomicIntegerFieldUpdater.newUpdater(b0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68504d;

    public b0(long j10, @Nullable S s10, int i10) {
        super(s10);
        this.f68504d = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // io.c
    public boolean k() {
        return f68503e.get(this) == r() && !l();
    }

    public final boolean p() {
        return f68503e.addAndGet(this, SupportMenu.CATEGORY_MASK) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, @Nullable Throwable th2, @NotNull kotlin.coroutines.d dVar);

    public final void t() {
        if (f68503e.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f68503e;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != r() || l())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
