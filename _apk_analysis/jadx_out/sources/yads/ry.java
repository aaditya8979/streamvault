package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import yads.mo;
import yads.s63;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ry extends mo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f94643h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f94644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r83 f94645j;

    public ym1 a(Object obj, ym1 ym1Var) {
        return ym1Var;
    }

    @Override // yads.mo
    public final void a() {
        for (qy qyVar : this.f94643h.values()) {
            qyVar.f94205a.a(qyVar.f94206b);
        }
    }

    public final void a(final Object obj, mo moVar) {
        if (!(!this.f94643h.containsKey(obj))) {
            throw new IllegalArgumentException();
        }
        zm1 zm1Var = new zm1() { // from class: bt.s9
            @Override // yads.zm1
            public final void a(mo moVar2, s63 s63Var) {
                this.f6292a.a(obj, moVar2, s63Var);
            }
        };
        py pyVar = new py(this, obj);
        this.f94643h.put(obj, new qy(moVar, zm1Var, pyVar));
        Handler handler = this.f94644i;
        handler.getClass();
        moVar.getClass();
        bn1 bn1Var = moVar.f92476c;
        bn1Var.getClass();
        bn1Var.f88093c.add(new an1(handler, pyVar));
        Handler handler2 = this.f94644i;
        handler2.getClass();
        ok0 ok0Var = moVar.f92477d;
        ok0Var.getClass();
        ok0Var.f93245c.add(new nk0(handler2, pyVar));
        r83 r83Var = this.f94645j;
        ye2 ye2Var = this.f92480g;
        if (ye2Var == null) {
            throw new IllegalStateException();
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = moVar.f92478e;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        moVar.f92480g = ye2Var;
        s63 s63Var = moVar.f92479f;
        moVar.f92474a.add(zm1Var);
        if (moVar.f92478e == null) {
            moVar.f92478e = looperMyLooper;
            moVar.f92475b.add(zm1Var);
            moVar.a(r83Var);
        } else if (s63Var != null) {
            moVar.b(zm1Var);
            zm1Var.a(moVar, s63Var);
        }
        if (!this.f92475b.isEmpty()) {
            return;
        }
        moVar.a(zm1Var);
    }

    @Override // yads.mo
    public final void b() {
        for (qy qyVar : this.f94643h.values()) {
            qyVar.f94205a.b(qyVar.f94206b);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, mo moVar, s63 s63Var);

    @Override // yads.mo
    public void d() {
        Iterator it = this.f94643h.values().iterator();
        while (it.hasNext()) {
            ((qy) it.next()).f94205a.d();
        }
    }

    @Override // yads.mo
    public void e() {
        for (qy qyVar : this.f94643h.values()) {
            qyVar.f94205a.c(qyVar.f94206b);
            qyVar.f94205a.a((cn1) qyVar.f94207c);
            qyVar.f94205a.a((pk0) qyVar.f94207c);
        }
        this.f94643h.clear();
    }
}
