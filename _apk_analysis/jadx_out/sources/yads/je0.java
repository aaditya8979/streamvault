package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class je0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f91187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f91188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f91189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f91190d;

    public je0(w5 w5Var, int i10, g62 g62Var, z30 z30Var) {
        this.f91187a = w5Var;
        this.f91188b = g62Var;
        this.f91189c = z30Var;
        this.f91190d = new AtomicInteger(i10);
    }

    @Override // yads.zg3
    public final void a() {
        if (this.f91190d.decrementAndGet() == 0) {
            this.f91187a.a(v5.f95937p);
            this.f91188b.a();
        }
    }

    @Override // yads.zg3
    public final void b() {
        if (this.f91190d.getAndSet(0) > 0) {
            this.f91187a.a(v5.f95937p);
            this.f91189c.a(y30.f96983f);
            this.f91188b.a();
        }
    }

    @Override // yads.zg3
    public final void c() {
    }
}
