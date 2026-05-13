package kotlinx.coroutines;

import io.a0;
import io.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.v1;
import p000do.y;
import p000do.z;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e<T> extends a0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73317f = AtomicIntegerFieldUpdater.newUpdater(e.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public e(@NotNull kotlin.coroutines.d dVar, @NotNull hn.c<? super T> cVar) {
        super(dVar, cVar);
    }

    @Override // io.a0, kotlinx.coroutines.JobSupport
    public void W(@Nullable Object obj) {
        f1(obj);
    }

    @Override // io.a0, kotlinx.coroutines.a
    public void f1(@Nullable Object obj) {
        if (m1()) {
            return;
        }
        i.b(IntrinsicsKt__IntrinsicsJvmKt.d(this.f64327e), z.a(obj, this.f64327e));
    }

    @Nullable
    public final Object k1() {
        if (n1()) {
            return in.a.g();
        }
        Object objH = v1.h(u0());
        if (objH instanceof y) {
            throw ((y) objH).f59911a;
        }
        return objH;
    }

    public final boolean m1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f73317f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f73317f.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean n1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f73317f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f73317f.compareAndSet(this, 0, 1));
        return true;
    }
}
