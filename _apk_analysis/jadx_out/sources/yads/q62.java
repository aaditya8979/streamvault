package yads;

import yads.q62;

/* JADX INFO: loaded from: classes3.dex */
public final class q62 implements ef3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s62 f93908a;

    public q62(s62 s62Var) {
        this.f93908a = s62Var;
    }

    public static final void a(s62 s62Var) {
        s62Var.a(s62Var.f94720g);
    }

    @Override // yads.ef3
    public final void a() {
        this.f93908a.f94715b.a();
    }

    @Override // yads.ef3
    public final void b() {
        final s62 s62Var = this.f93908a;
        s62Var.f94725l = null;
        my2 my2Var = s62Var.f94716c;
        if (my2Var == null || !my2Var.f92647d) {
            s62Var.f94722i.a();
        } else {
            nh1 nh1Var = s62Var.f94724k;
            nh1Var.f92855a.post(new Runnable() { // from class: bt.q8
                @Override // java.lang.Runnable
                public final void run() {
                    q62.a(s62Var);
                }
            });
        }
        this.f93908a.f94715b.b();
    }

    @Override // yads.ef3
    public final void c() {
        e72 e72Var = (e72) this.f93908a.f94714a.b();
        if (e72Var != null) {
            e72Var.setClickable(true);
        }
    }
}
