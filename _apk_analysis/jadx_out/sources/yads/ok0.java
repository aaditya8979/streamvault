package yads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class ok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f93244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f93245c;

    public ok0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public ok0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var) {
        this.f93245c = copyOnWriteArrayList;
        this.f93243a = i10;
        this.f93244b = ym1Var;
    }

    public final void a() {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.v7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6348b.a(pk0Var);
                }
            });
        }
    }

    public final void a(final int i10) {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.q7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6241b.a(pk0Var, i10);
                }
            });
        }
    }

    public final void a(Handler handler, pk0 pk0Var) {
        pk0Var.getClass();
        this.f93245c.add(new nk0(handler, pk0Var));
    }

    public final void a(final Exception exc) {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.s7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6288b.a(pk0Var, exc);
                }
            });
        }
    }

    public final /* synthetic */ void a(pk0 pk0Var) {
        pk0Var.a(this.f93243a, this.f93244b);
    }

    public final /* synthetic */ void a(pk0 pk0Var, int i10) {
        pk0Var.getClass();
        pk0Var.a(this.f93243a, this.f93244b, i10);
    }

    public final /* synthetic */ void a(pk0 pk0Var, Exception exc) {
        pk0Var.a(this.f93243a, this.f93244b, exc);
    }

    public final void b() {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.t7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6307b.b(pk0Var);
                }
            });
        }
    }

    public final /* synthetic */ void b(pk0 pk0Var) {
        pk0Var.d(this.f93243a, this.f93244b);
    }

    public final void c() {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.u7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6327b.c(pk0Var);
                }
            });
        }
    }

    public final /* synthetic */ void c(pk0 pk0Var) {
        pk0Var.c(this.f93243a, this.f93244b);
    }

    public final void d() {
        for (nk0 nk0Var : this.f93245c) {
            final pk0 pk0Var = nk0Var.f92861b;
            ib3.a(nk0Var.f92860a, new Runnable() { // from class: bt.r7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6264b.d(pk0Var);
                }
            });
        }
    }

    public final /* synthetic */ void d(pk0 pk0Var) {
        pk0Var.b(this.f93243a, this.f93244b);
    }
}
