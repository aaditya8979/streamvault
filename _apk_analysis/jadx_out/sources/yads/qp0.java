package yads;

import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class qp0 implements me2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f94096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f94097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp0 f94099d;

    public qp0(sp0 sp0Var) {
        this.f94099d = sp0Var;
    }

    @Override // yads.me2
    public final void a(pn0 pn0Var) {
        sp0 sp0Var = this.f94099d;
        n62 n62Var = sp0Var.f94904h;
        n62 n62Var2 = sp0Var.f94905i;
        Pair pairA = (n62Var == null || n62Var2 == null) ? null : bn.h.a(n62Var, n62Var2);
        if (pairA != null && !this.f94099d.f94908l.contains(pairA)) {
            this.f94099d.f94908l.add(pairA);
            this.f94099d.a((cf3) pairA.getSecond());
            return;
        }
        this.f94096a = false;
        ((zb2) this.f94099d.f94903g.f93665b).a();
        zn0 zn0Var = (zn0) this.f94099d.f94897a;
        zn0Var.r();
        zn0Var.r();
        yk ykVar = zn0Var.f97720v;
        zn0Var.r();
        ykVar.a(zn0Var.Z.f88441l, 1);
        zn0Var.a((pn0) null);
        int i10 = q20.f93867b;
        String message = pn0Var.getMessage();
        qi3 qi3Var = this.f94099d.f94899c;
        fo2 fo2VarA = qi3Var.f94044b.a();
        fo2VarA.b(message, "error_message");
        qi3Var.f94043a.a(new eo2(co2.f88542l.a(), kotlin.collections.a.C(fo2VarA.f89652a), fo2VarA.f89653b));
        sp0 sp0Var2 = this.f94099d;
        kf3 kf3Var = sp0Var2.f94907k;
        cf3 cf3Var = sp0Var2.f94906j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        sp0Var2.f94900d.getClass();
        kf3Var.a(new jf3(o52.a(pn0Var), pn0Var));
    }

    @Override // yads.me2
    public final void onIsPlayingChanged(boolean z10) {
        if (!z10) {
            if (this.f94097b) {
                return;
            }
            this.f94098c = true;
            sp0 sp0Var = this.f94099d;
            kf3 kf3Var = sp0Var.f94907k;
            cf3 cf3Var = sp0Var.f94906j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.i();
            return;
        }
        if (!this.f94096a) {
            sp0 sp0Var2 = this.f94099d;
            kf3 kf3Var2 = sp0Var2.f94907k;
            cf3 cf3Var2 = sp0Var2.f94906j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            this.f94096a = true;
            kf3Var2.c();
            return;
        }
        if (this.f94098c) {
            this.f94098c = false;
            sp0 sp0Var3 = this.f94099d;
            kf3 kf3Var3 = sp0Var3.f94907k;
            cf3 cf3Var3 = sp0Var3.f94906j;
            if (kf3Var3 == null || cf3Var3 == null) {
                return;
            }
            kf3Var3.f();
        }
    }

    @Override // yads.me2
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            this.f94097b = true;
            sp0 sp0Var = this.f94099d;
            kf3 kf3Var = sp0Var.f94907k;
            cf3 cf3Var = sp0Var.f94906j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.b();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f94096a = false;
            sp0 sp0Var2 = this.f94099d;
            kf3 kf3Var2 = sp0Var2.f94907k;
            cf3 cf3Var2 = sp0Var2.f94906j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            kf3Var2.d();
            return;
        }
        ((zb2) this.f94099d.f94903g.f93665b).a();
        sp0 sp0Var3 = this.f94099d;
        kf3 kf3Var3 = sp0Var3.f94907k;
        cf3 cf3Var3 = sp0Var3.f94906j;
        if (kf3Var3 != null && cf3Var3 != null) {
            kf3Var3.h();
        }
        if (this.f94097b) {
            this.f94097b = false;
            sp0 sp0Var4 = this.f94099d;
            kf3 kf3Var4 = sp0Var4.f94907k;
            cf3 cf3Var4 = sp0Var4.f94906j;
            if (kf3Var4 == null || cf3Var4 == null) {
                return;
            }
            kf3Var4.a();
        }
    }
}
