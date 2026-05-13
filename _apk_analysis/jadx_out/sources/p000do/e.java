package p000do;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Thread f59849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final c1 f59850f;

    public e(@NotNull d dVar, @NotNull Thread thread, @Nullable c1 c1Var) {
        super(dVar, true, true);
        this.f59849e = thread;
        this.f59850f = c1Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean B0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void W(@Nullable Object obj) {
        if (p.f(Thread.currentThread(), this.f59849e)) {
            return;
        }
        Thread thread = this.f59849e;
        b.a();
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T j1() throws Throwable {
        b.a();
        try {
            c1 c1Var = this.f59850f;
            if (c1Var != null) {
                c1.R(c1Var, false, 1, null);
            }
            while (true) {
                try {
                    c1 c1Var2 = this.f59850f;
                    long jU = c1Var2 != null ? c1Var2.U() : Long.MAX_VALUE;
                    if (d()) {
                        break;
                    }
                    b.a();
                    LockSupport.parkNanos(this, jU);
                    if (Thread.interrupted()) {
                        Z(new InterruptedException());
                    }
                } finally {
                    c1 c1Var3 = this.f59850f;
                    if (c1Var3 != null) {
                        c1.L(c1Var3, false, 1, null);
                    }
                }
            }
            b.a();
            T t10 = (T) v1.h(u0());
            yVar = t10 instanceof y ? (y) t10 : null;
            if (yVar == null) {
                return t10;
            }
            throw yVar.f59911a;
        } catch (Throwable th2) {
            b.a();
            throw th2;
        }
    }
}
