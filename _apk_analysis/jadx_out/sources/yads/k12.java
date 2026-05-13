package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class k12 implements j52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22 f91459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f91460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f91461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l12 f91462d;

    public k12(ny1 ny1Var, v9 v9Var) {
        this.f91459a = ny1Var;
        this.f91460b = v9Var;
    }

    public tb3 a(int i10, Context context, boolean z10) {
        l12 l12Var = this.f91462d;
        View viewA = l12Var != null ? l12Var.f91863c.a() : null;
        if (viewA == null) {
            return new qb3(pb3.f93524g, null, null);
        }
        if (kl3.b(viewA)) {
            return new qb3(pb3.f93525h, null, null);
        }
        xl3 xl3VarA = kl3.f91651a.a(viewA);
        String str = xl3VarA.f96810b;
        this.f91461c = str;
        if (xl3VarA.f96809a < 1) {
            return new qb3(pb3.f93526i, null, str);
        }
        if (a(viewA, i10) && !z10) {
            return new qb3(pb3.f93522e, null, this.f91461c);
        }
        String str2 = this.f91460b.f96000k;
        eg0[] eg0VarArr = eg0.f89242b;
        return (!tn.p.f(str2, "divkit") || this.f91460b.H) ? ((ny1) this.f91459a).a(z10) : new rb3(cn.w.m());
    }

    public final void a(l12 l12Var) {
        ((ny1) this.f91459a).f93052d = l12Var;
        this.f91462d = l12Var;
    }

    public final boolean a() {
        View viewA;
        l12 l12Var = this.f91462d;
        if (l12Var == null || (viewA = l12Var.f91863c.a()) == null) {
            return true;
        }
        return kl3.b(viewA);
    }

    public final boolean a(View view, int i10) {
        int iA = kl3.a(view);
        this.f91461c = "actualPercent: " + iA + ", expectedPercent: " + i10;
        return iA < i10;
    }

    public final kp2 b() {
        return ((ny1) this.f91459a).e();
    }
}
