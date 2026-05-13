package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import yads.mo;
import yads.s63;

/* JADX INFO: loaded from: classes8.dex */
public final class in1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye2 f90907a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn1 f90911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f90912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ok0 f90913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f90914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f90915i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f90917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r83 f90918l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sy2 f90916j = new sy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f90909c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f90910d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f90908b = new ArrayList();

    public in1(hn1 hn1Var, se seVar, Handler handler, ye2 ye2Var) {
        this.f90907a = ye2Var;
        this.f90911e = hn1Var;
        bn1 bn1Var = new bn1();
        this.f90912f = bn1Var;
        ok0 ok0Var = new ok0();
        this.f90913g = ok0Var;
        this.f90914h = new HashMap();
        this.f90915i = new HashSet();
        bn1Var.a(handler, seVar);
        ok0Var.a(handler, seVar);
    }

    public final s63 a() {
        if (this.f90908b.isEmpty()) {
            return s63.f94726b;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f90908b.size(); i10++) {
            gn1 gn1Var = (gn1) this.f90908b.get(i10);
            gn1Var.f90044d = iB;
            iB += gn1Var.f90041a.f96111o.f93823c.b();
        }
        return new xf2(this.f90908b, this.f90916j);
    }

    public final s63 a(int i10, List list, sy2 sy2Var) {
        if (!list.isEmpty()) {
            this.f90916j = sy2Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                gn1 gn1Var = (gn1) list.get(i11 - i10);
                if (i11 > 0) {
                    gn1 gn1Var2 = (gn1) this.f90908b.get(i11 - 1);
                    gn1Var.f90044d = gn1Var2.f90041a.f96111o.f93823c.b() + gn1Var2.f90044d;
                    gn1Var.f90045e = false;
                    gn1Var.f90043c.clear();
                } else {
                    gn1Var.f90044d = 0;
                    gn1Var.f90045e = false;
                    gn1Var.f90043c.clear();
                }
                int iB = gn1Var.f90041a.f96111o.f93823c.b();
                for (int i12 = i11; i12 < this.f90908b.size(); i12++) {
                    ((gn1) this.f90908b.get(i12)).f90044d += iB;
                }
                this.f90908b.add(i11, gn1Var);
                this.f90910d.put(gn1Var.f90042b, gn1Var);
                if (this.f90917k) {
                    a(gn1Var);
                    if (this.f90909c.isEmpty()) {
                        this.f90915i.add(gn1Var);
                    } else {
                        fn1 fn1Var = (fn1) this.f90914h.get(gn1Var);
                        if (fn1Var != null) {
                            fn1Var.f89638a.a(fn1Var.f89639b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final void a(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            gn1 gn1Var = (gn1) this.f90908b.remove(i12);
            this.f90910d.remove(gn1Var.f90042b);
            int i13 = -gn1Var.f90041a.f96111o.f93823c.b();
            for (int i14 = i12; i14 < this.f90908b.size(); i14++) {
                ((gn1) this.f90908b.get(i14)).f90044d += i13;
            }
            gn1Var.f90045e = true;
            if (this.f90917k && gn1Var.f90043c.isEmpty()) {
                fn1 fn1Var = (fn1) this.f90914h.remove(gn1Var);
                fn1Var.getClass();
                fn1Var.f89638a.c(fn1Var.f89639b);
                fn1Var.f89638a.a((cn1) fn1Var.f89640c);
                fn1Var.f89638a.a((pk0) fn1Var.f89640c);
                this.f90915i.remove(gn1Var);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(gn1 gn1Var) {
        vi1 vi1Var = gn1Var.f90041a;
        zm1 zm1Var = new zm1() { // from class: bt.e3
            @Override // yads.zm1
            public final void a(mo moVar, s63 s63Var) {
                this.f6009a.a(moVar, s63Var);
            }
        };
        en1 en1Var = new en1(this, gn1Var);
        this.f90914h.put(gn1Var, new fn1(vi1Var, zm1Var, en1Var));
        Handler handlerB = ib3.b((Handler.Callback) null);
        vi1Var.getClass();
        bn1 bn1Var = vi1Var.f92476c;
        bn1Var.getClass();
        bn1Var.f88093c.add(new an1(handlerB, en1Var));
        Handler handlerB2 = ib3.b((Handler.Callback) null);
        ok0 ok0Var = vi1Var.f92477d;
        ok0Var.getClass();
        ok0Var.f93245c.add(new nk0(handlerB2, en1Var));
        r83 r83Var = this.f90918l;
        ye2 ye2Var = this.f90907a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = vi1Var.f92478e;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        vi1Var.f92480g = ye2Var;
        s63 s63Var = vi1Var.f92479f;
        vi1Var.f92474a.add(zm1Var);
        if (vi1Var.f92478e == null) {
            vi1Var.f92478e = looperMyLooper;
            vi1Var.f92475b.add(zm1Var);
            vi1Var.a(r83Var);
        } else if (s63Var != null) {
            vi1Var.b(zm1Var);
            zm1Var.a(vi1Var, s63Var);
        }
    }

    public final void a(mo moVar, s63 s63Var) {
        ((go0) this.f90911e).f90061i.f90680a.sendEmptyMessage(22);
    }
}
