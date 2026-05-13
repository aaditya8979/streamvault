package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public abstract class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f92474a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f92475b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bn1 f92476c = new bn1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ok0 f92477d = new ok0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f92478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s63 f92479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ye2 f92480g;

    public final ok0 a(ym1 ym1Var) {
        return new ok0(this.f92477d.f93245c, 0, ym1Var);
    }

    public abstract pm1 a(ym1 ym1Var, qe qeVar, long j10);

    public void a() {
    }

    public final void a(cn1 cn1Var) {
        bn1 bn1Var = this.f92476c;
        for (an1 an1Var : bn1Var.f88093c) {
            if (an1Var.f87757b == cn1Var) {
                bn1Var.f88093c.remove(an1Var);
            }
        }
    }

    public final void a(pk0 pk0Var) {
        ok0 ok0Var = this.f92477d;
        for (nk0 nk0Var : ok0Var.f93245c) {
            if (nk0Var.f92861b == pk0Var) {
                ok0Var.f93245c.remove(nk0Var);
            }
        }
    }

    public abstract void a(pm1 pm1Var);

    public abstract void a(r83 r83Var);

    public final void a(s63 s63Var) {
        this.f92479f = s63Var;
        Iterator it = this.f92474a.iterator();
        while (it.hasNext()) {
            ((zm1) it.next()).a(this, s63Var);
        }
    }

    public final void a(zm1 zm1Var) {
        boolean z10 = !this.f92475b.isEmpty();
        this.f92475b.remove(zm1Var);
        if (z10 && this.f92475b.isEmpty()) {
            a();
        }
    }

    public final bn1 b(ym1 ym1Var) {
        return new bn1(this.f92476c.f88093c, 0, ym1Var, 0L);
    }

    public void b() {
    }

    public final void b(zm1 zm1Var) {
        this.f92478e.getClass();
        boolean zIsEmpty = this.f92475b.isEmpty();
        this.f92475b.add(zm1Var);
        if (zIsEmpty) {
            b();
        }
    }

    public abstract fm1 c();

    public final void c(zm1 zm1Var) {
        this.f92474a.remove(zm1Var);
        if (!this.f92474a.isEmpty()) {
            a(zm1Var);
            return;
        }
        this.f92478e = null;
        this.f92479f = null;
        this.f92480g = null;
        this.f92475b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();
}
