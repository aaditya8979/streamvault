package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z51 implements d61, uu1, vh3, nn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51 f97399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5 f97400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b61 f97401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f97402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f97403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j5 f97404f;

    public z51(Context context, uz1 uz1Var, f5 f5Var, b61 b61Var) {
        this.f97399a = uz1Var;
        this.f97400b = f5Var;
        this.f97401c = b61Var;
        this.f97402d = context.getApplicationContext();
    }

    public final void a() {
        f5 f5Var = this.f97400b;
        String str = f5Var.f89483a.f89055a;
        if (str != null && str.length() != 0) {
            e5 e5Var = f5Var.f89484b;
            e5Var.getClass();
            synchronized (e5.f89096c) {
                e5Var.f89099b.remove(str);
                e5Var.f89099b.add(str);
            }
        }
        this.f97399a.a(this.f97404f);
    }

    public final void a(List list, j5 j5Var) {
        this.f97403e = list;
        this.f97404f = j5Var;
        b61 b61Var = this.f97401c;
        b61Var.f87923c = false;
        b61Var.f87924d = false;
    }

    @Override // yads.uu1
    public final void b() {
        if (j()) {
            return;
        }
        b61 b61Var = this.f97401c;
        if (!b61Var.f87924d) {
            b61Var.f87924d = true;
            for (co2 co2Var : b61.f87920f) {
                c61 c61Var = b61Var.f87921a;
                Map map = b61Var.f87922b;
                fo2 fo2VarA = c61Var.a();
                fo2VarA.f89652a.putAll(map);
                c61Var.a(co2Var, fo2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // yads.d61
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // yads.vh3
    public final void d() {
        if (j()) {
            return;
        }
        b61 b61Var = this.f97401c;
        if (!b61Var.f87923c) {
            b61Var.f87923c = true;
            for (co2 co2Var : b61.f87919e) {
                c61 c61Var = b61Var.f87921a;
                Map map = b61Var.f87922b;
                fo2 fo2VarA = c61Var.a();
                fo2VarA.f89652a.putAll(map);
                c61Var.a(co2Var, fo2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.uu1
    public final void e() {
        if (j()) {
            return;
        }
        b61 b61Var = this.f97401c;
        if (!b61Var.f87923c) {
            b61Var.f87923c = true;
            for (co2 co2Var : b61.f87919e) {
                c61 c61Var = b61Var.f87921a;
                Map map = b61Var.f87922b;
                fo2 fo2VarA = c61Var.a();
                fo2VarA.f89652a.putAll(map);
                c61Var.a(co2Var, fo2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.nn2
    public final void f() {
    }

    @Override // yads.d61
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.vh3
    public final void h() {
        if (j()) {
            return;
        }
        b61 b61Var = this.f97401c;
        if (!b61Var.f87924d) {
            b61Var.f87924d = true;
            for (co2 co2Var : b61.f87920f) {
                c61 c61Var = b61Var.f87921a;
                Map map = b61Var.f87922b;
                fo2 fo2VarA = c61Var.a();
                fo2VarA.f89652a.putAll(map);
                c61Var.a(co2Var, fo2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(this.f97402d);
        return nt2VarA == null || nt2VarA.f92976u;
    }

    public final boolean j() {
        List list = this.f97403e;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
