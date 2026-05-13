package yads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f88092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f88093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88094d;

    public bn1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public bn1(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var, long j10) {
        this.f88093c = copyOnWriteArrayList;
        this.f88091a = i10;
        this.f88092b = ym1Var;
        this.f88094d = j10;
    }

    public final long a(long j10) {
        long jB = ib3.b(j10);
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f88094d + jB;
    }

    public final void a(Handler handler, cn1 cn1Var) {
        cn1Var.getClass();
        this.f88093c.add(new an1(handler, cn1Var));
    }

    public final /* synthetic */ void a(cn1 cn1Var, hm1 hm1Var) {
        cn1Var.b(this.f88091a, this.f88092b, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.c(this.f88091a, this.f88092b, vf1Var, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        cn1Var.a(this.f88091a, this.f88092b, vf1Var, hm1Var, iOException, z10);
    }

    public final /* synthetic */ void a(cn1 cn1Var, ym1 ym1Var, hm1 hm1Var) {
        cn1Var.a(this.f88091a, ym1Var, hm1Var);
    }

    public final void a(final hm1 hm1Var) {
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6209b.a(cn1Var, hm1Var);
                }
            });
        }
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6252b.a(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var, final IOException iOException, final boolean z10) {
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6230b.a(cn1Var, vf1Var, hm1Var, iOException, z10);
                }
            });
        }
    }

    public final /* synthetic */ void b(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.a(this.f88091a, this.f88092b, vf1Var, hm1Var);
    }

    public final void b(final hm1 hm1Var) {
        final ym1 ym1Var = this.f88092b;
        ym1Var.getClass();
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6189b.a(cn1Var, ym1Var, hm1Var);
                }
            });
        }
    }

    public final void b(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6165b.b(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final /* synthetic */ void c(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.b(this.f88091a, this.f88092b, vf1Var, hm1Var);
    }

    public final void c(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f88093c) {
            final cn1 cn1Var = an1Var.f87757b;
            ib3.a(an1Var.f87756a, new Runnable() { // from class: bt.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6147b.c(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }
}
