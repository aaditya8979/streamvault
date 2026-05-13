package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f88563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f88564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f88565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f88566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mr f88567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo f88568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bq2 f88569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a82[] f88570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public tr f88571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f88572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f88573k;

    public cp2(mr mrVar, xo xoVar, int i10) {
        this(mrVar, xoVar, i10, new gn0(new Handler(Looper.getMainLooper())));
    }

    public cp2(mr mrVar, xo xoVar, int i10, gn0 gn0Var) {
        this.f88563a = new AtomicInteger();
        this.f88564b = new HashSet();
        this.f88565c = new PriorityBlockingQueue();
        this.f88566d = new PriorityBlockingQueue();
        this.f88572j = new ArrayList();
        this.f88573k = new ArrayList();
        this.f88567e = mrVar;
        this.f88568f = xoVar;
        this.f88570h = new a82[i10];
        this.f88569g = gn0Var;
    }

    public final void a() {
        tr trVar = this.f88571i;
        if (trVar != null) {
            trVar.f95329f = true;
            trVar.interrupt();
        }
        for (a82 a82Var : this.f88570h) {
            if (a82Var != null) {
                a82Var.f87618f = true;
                a82Var.interrupt();
            }
        }
        tr trVar2 = new tr(this.f88565c, this.f88566d, this.f88567e, this.f88569g);
        this.f88571i = trVar2;
        trVar2.start();
        for (int i10 = 0; i10 < this.f88570h.length; i10++) {
            a82 a82Var2 = new a82(this.f88566d, this.f88568f, this.f88567e, this.f88569g);
            this.f88570h[i10] = a82Var2;
            a82Var2.start();
        }
    }

    public final void a(bp2 bp2Var) {
        synchronized (this.f88564b) {
            for (po2 po2Var : this.f88564b) {
                if (bp2Var.a(po2Var)) {
                    po2Var.a();
                }
            }
        }
    }

    public final void a(po2 po2Var) {
        po2Var.f93676i = this;
        synchronized (this.f88564b) {
            this.f88564b.add(po2Var);
        }
        po2Var.f93675h = Integer.valueOf(this.f88563a.incrementAndGet());
        po2Var.a("add-to-queue");
        a(po2Var, 0);
        if (po2Var.f93677j) {
            this.f88565c.add(po2Var);
        } else {
            this.f88566d.add(po2Var);
        }
    }

    public final void a(po2 po2Var, int i10) {
        uo2 uo2Var;
        synchronized (this.f88573k) {
            Iterator it = this.f88573k.iterator();
            while (it.hasNext()) {
                ((ro2) ((ap2) it.next())).getClass();
                po poVar = po2Var instanceof po ? (po) po2Var : null;
                if (poVar != null && i10 == 3 && (uo2Var = poVar.f93662u) != null) {
                    uo2Var.b();
                }
            }
        }
    }
}
