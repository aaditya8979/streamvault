package io;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.y0;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends p000do.h0 implements p000do.r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71289h = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.r0 f71290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p000do.h0 f71291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f71293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final q<Runnable> f71294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Object f71295g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Runnable f71296b;

        public a(@NotNull Runnable runnable) {
            this.f71296b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f71296b.run();
                } catch (Throwable th2) {
                    p000do.j0.a(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable runnableQ = m.this.Q();
                if (runnableQ == null) {
                    return;
                }
                try {
                    this.f71296b = runnableQ;
                    i10++;
                    if (i10 >= 16 && i.d(m.this.f71291c, m.this)) {
                        i.c(m.this.f71291c, m.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = m.this.f71295g;
                    m mVar = m.this;
                    synchronized (obj) {
                        m.P().decrementAndGet(mVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull p000do.h0 h0Var, int i10, @Nullable String str) {
        p000do.r0 r0Var = h0Var instanceof p000do.r0 ? (p000do.r0) h0Var : null;
        this.f71290b = r0Var == null ? p000do.o0.a() : r0Var;
        this.f71291c = h0Var;
        this.f71292d = i10;
        this.f71293e = str;
        this.f71294f = new q<>(false);
        this.f71295g = new Object();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater P() {
        return f71289h;
    }

    @Override // p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.d dVar) {
        return this.f71290b.A(j10, runnable, dVar);
    }

    public final Runnable Q() {
        while (true) {
            Runnable runnableE = this.f71294f.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.f71295g) {
                f71289h.decrementAndGet(this);
                if (this.f71294f.c() == 0) {
                    return null;
                }
                f71289h.incrementAndGet(this);
            }
        }
    }

    public final boolean R() {
        synchronized (this.f71295g) {
            if (f71289h.get(this) >= this.f71292d) {
                return false;
            }
            f71289h.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000do.r0
    public void a(long j10, @NotNull p000do.k<? super bn.r> kVar) {
        this.f71290b.a(j10, kVar);
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        Runnable runnableQ;
        this.f71294f.a(runnable);
        if (f71289h.get(this) >= this.f71292d || !R() || (runnableQ = Q()) == null) {
            return;
        }
        try {
            i.c(this.f71291c, this, new a(runnableQ));
        } catch (Throwable th2) {
            f71289h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // p000do.h0
    public void dispatchYield(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        Runnable runnableQ;
        this.f71294f.a(runnable);
        if (f71289h.get(this) >= this.f71292d || !R() || (runnableQ = Q()) == null) {
            return;
        }
        try {
            this.f71291c.dispatchYield(this, new a(runnableQ));
        } catch (Throwable th2) {
            f71289h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // p000do.h0
    @NotNull
    public p000do.h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return i10 >= this.f71292d ? n.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        String str = this.f71293e;
        if (str != null) {
            return str;
        }
        return this.f71291c + ".limitedParallelism(" + this.f71292d + ')';
    }
}
