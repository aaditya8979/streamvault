package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class tw1 implements f92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c92 f95398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n32 f95399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final va f95401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f95402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dw2 f95403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k73 f95404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d83 f95405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d61 f95406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f95407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f95408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f95409m = new ArrayList();

    public tw1(Context context, c92 c92Var, n32 n32Var, String str, va vaVar, za zaVar, dw2 dw2Var, k73 k73Var, d83 d83Var) {
        this.f95397a = context;
        this.f95398b = c92Var;
        this.f95399c = n32Var;
        this.f95400d = str;
        this.f95401e = vaVar;
        this.f95402f = zaVar;
        this.f95403g = dw2Var;
        this.f95404h = k73Var;
        this.f95405i = d83Var;
    }

    public final tb3 a(c83 c83Var) {
        nt2 nt2VarA = this.f95403g.a(this.f95397a);
        tb3 tb3VarA = (nt2VarA == null || !nt2VarA.g()) ? this.f95399c.a(c83Var.a()) : this.f95399c.b(c83Var.a());
        Objects.toString(tb3VarA);
        boolean z10 = ad1.f87661a;
        return tb3VarA;
    }

    public final synchronized void a() {
        boolean z10 = ad1.f87661a;
        if (wc2.f96340h.a(this.f95397a).a() && (!this.f95409m.isEmpty()) && !this.f95404h.a()) {
            this.f95404h.a(this);
        }
    }

    public final synchronized void a(List list) {
        qy2 qy2Var;
        this.f95409m.clear();
        d83 d83Var = this.f95405i;
        va vaVar = this.f95401e;
        d83Var.getClass();
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((py2) it.next()).f93833d);
        }
        Set setL1 = cn.f0.l1(arrayList);
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0) {
            if (!(setL1 instanceof Collection) || !setL1.isEmpty()) {
                Iterator it2 = setL1.iterator();
                while (it2.hasNext()) {
                    if (((qy2) it2.next()) == qy2.f94220c) {
                        qy2Var = null;
                        break;
                    }
                }
            }
            qy2Var = qy2.f94219b;
        } else if (iOrdinal == 1) {
            qy2Var = qy2.f94220c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qy2Var = qy2.f94219b;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<py2> arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((py2) obj).f93831b != null) {
                arrayList3.add(obj);
            }
        }
        for (py2 py2Var : arrayList3) {
            String str = py2Var.f93831b;
            long j10 = py2Var.f93830a;
            int i10 = py2Var.f93832c;
            qy2 qy2Var2 = py2Var.f93833d;
            qy2 qy2Var3 = (qy2Var2 != qy2.f94221d || qy2Var == null) ? qy2Var2 : qy2Var;
            if (str != null) {
                arrayList2.add(new c83(i10, j10, qy2Var3, str));
            }
        }
        this.f95409m.addAll(arrayList2);
    }

    public final synchronized void a(c83 c83Var, rb3 rb3Var) {
        za.a(this.f95402f, c83Var.f88390a, k83.f91517h);
        if (!this.f95407k) {
            this.f95407k = true;
            d61 d61Var = this.f95406j;
            if (d61Var != null) {
                d61Var.c();
            }
        }
        if (!this.f95408l && this.f95409m.isEmpty()) {
            this.f95408l = true;
            d61 d61Var2 = this.f95406j;
            if (d61Var2 != null) {
                d61Var2.g();
            }
        }
        this.f95398b.a(c83Var.f88393d, rb3Var);
        c92 c92Var = this.f95398b;
        qy2 qy2Var = c83Var.f88393d;
        ArrayList arrayList = this.f95409m;
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c83) it.next()).f88393d);
        }
        c92Var.a(qy2Var, arrayList2, rb3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(yads.rc2 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L1e
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L17
            r0 = 1
            if (r2 == r0) goto L13
            r0 = 2
            if (r2 == r0) goto L17
            goto L1c
        L13:
            r1.b()     // Catch: java.lang.Throwable -> L1e
            goto L1c
        L17:
            if (r3 == 0) goto L1c
            r1.a()     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tw1.a(yads.rc2, boolean):void");
    }

    public final synchronized void a(v9 v9Var, List list) {
        boolean z10 = ad1.f87661a;
        this.f95398b.a(v9Var);
        this.f95409m.clear();
        this.f95398b.invalidate();
        this.f95408l = false;
        b();
        a(list);
    }

    public final tb3 b(c83 c83Var) {
        tb3 tb3VarB = this.f95399c.b(c83Var.a());
        Objects.toString(tb3VarB);
        boolean z10 = ad1.f87661a;
        return tb3VarB;
    }

    public final synchronized void b() {
        boolean z10 = ad1.f87661a;
        this.f95404h.b();
        Iterator it = this.f95409m.iterator();
        while (it.hasNext()) {
            ((c83) it.next()).f88394e = null;
        }
    }
}
