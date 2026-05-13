package yads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import yads.ot;
import yads.ua0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pt implements s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f93763a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f93764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f93765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nt f93766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f93767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f93768f;

    public pt() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f93763a.add(new nt());
        }
        this.f93764b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f93764b.add(new ot(new ta0() { // from class: bt.o8
                @Override // yads.ta0
                public final void a(ua0 ua0Var) {
                    this.f6203a.a((ot) ua0Var);
                }
            }));
        }
        this.f93765c = new PriorityQueue();
    }

    @Override // yads.s43
    public final void a(long j10) {
        this.f93767e = j10;
    }

    public abstract void a(nt ntVar);

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        if (w43Var != this.f93766d) {
            throw new IllegalArgumentException();
        }
        nt ntVar = (nt) w43Var;
        if (ntVar.b(Integer.MIN_VALUE)) {
            ntVar.b();
            this.f93763a.add(ntVar);
        } else {
            long j10 = this.f93768f;
            this.f93768f = 1 + j10;
            ntVar.f92934k = j10;
            this.f93765c.add(ntVar);
        }
        this.f93766d = null;
    }

    public final void a(x43 x43Var) {
        x43Var.f94912b = 0;
        x43Var.f96631d = null;
        this.f93764b.add(x43Var);
    }

    @Override // yads.oa0
    public final Object b() {
        if (this.f93766d != null) {
            throw new IllegalStateException();
        }
        if (this.f93763a.isEmpty()) {
            return null;
        }
        nt ntVar = (nt) this.f93763a.pollFirst();
        this.f93766d = ntVar;
        return ntVar;
    }

    public abstract qt c();

    @Override // yads.oa0
    /* JADX INFO: renamed from: d */
    public x43 a() {
        if (this.f93764b.isEmpty()) {
            return null;
        }
        while (!this.f93765c.isEmpty()) {
            nt ntVar = (nt) this.f93765c.peek();
            int i10 = ib3.f90737a;
            if (ntVar.f94751f > this.f93767e) {
                break;
            }
            nt ntVar2 = (nt) this.f93765c.poll();
            if (ntVar2.b(4)) {
                x43 x43Var = (x43) this.f93764b.pollFirst();
                x43Var.f94912b = 4 | x43Var.f94912b;
                ntVar2.b();
                this.f93763a.add(ntVar2);
                return x43Var;
            }
            a(ntVar2);
            if (f()) {
                qt qtVarC = c();
                x43 x43Var2 = (x43) this.f93764b.pollFirst();
                long j10 = ntVar2.f94751f;
                x43Var2.f95584c = j10;
                x43Var2.f96631d = qtVarC;
                x43Var2.f96632e = j10;
                ntVar2.b();
                this.f93763a.add(ntVar2);
                return x43Var2;
            }
            ntVar2.b();
            this.f93763a.add(ntVar2);
        }
        return null;
    }

    public final x43 e() {
        return (x43) this.f93764b.pollFirst();
    }

    public abstract boolean f();

    @Override // yads.oa0
    public void flush() {
        this.f93768f = 0L;
        this.f93767e = 0L;
        while (!this.f93765c.isEmpty()) {
            nt ntVar = (nt) this.f93765c.poll();
            int i10 = ib3.f90737a;
            ntVar.b();
            this.f93763a.add(ntVar);
        }
        nt ntVar2 = this.f93766d;
        if (ntVar2 != null) {
            ntVar2.b();
            this.f93763a.add(ntVar2);
            this.f93766d = null;
        }
    }

    @Override // yads.oa0
    public void release() {
    }
}
