package no;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class l extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f75928b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater<l> f75929c = AtomicIntegerFieldUpdater.newUpdater(l.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f75930a;

    /* JADX INFO: compiled from: SegmentPool.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @Override // no.n
    public void a() {
        f75929c.incrementAndGet(this);
    }

    @Override // no.n
    public boolean b() {
        return this.f75930a > 0;
    }

    @Override // no.n
    public boolean c() {
        if (this.f75930a == 0) {
            return false;
        }
        int iDecrementAndGet = f75929c.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.f75930a = 0;
            return false;
        }
        throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
    }
}
