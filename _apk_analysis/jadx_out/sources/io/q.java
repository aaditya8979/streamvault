package io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
public class q<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71305a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public q(boolean z10) {
        this._cur$volatile = new r(8, z10);
    }

    public final boolean a(@NotNull E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71305a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int iA = rVar.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.a.a(f71305a, this, rVar, rVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71305a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f71305a, this, rVar, rVar.l());
            }
        }
    }

    public final int c() {
        return ((r) f71305a.get(this)).g();
    }

    @Nullable
    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71305a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) rVar.m();
            if (e10 != r.f71309h) {
                return e10;
            }
            androidx.concurrent.futures.a.a(f71305a, this, rVar, rVar.l());
        }
    }
}
