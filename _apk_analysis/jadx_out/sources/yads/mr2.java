package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class mr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f92516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f92517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f92518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cz1 f92519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d42 f92520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k63 f92521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gi0 f92522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jw f92523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f92524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kr2 f92525j;

    public mr2(v9 v9Var, b2 b2Var, kz kzVar, ez1 ez1Var, d42 d42Var, k63 k63Var, gi0 gi0Var, jw jwVar) {
        this.f92516a = v9Var;
        this.f92517b = b2Var;
        this.f92518c = kzVar;
        this.f92519d = ez1Var;
        this.f92520e = d42Var;
        this.f92521f = k63Var;
        this.f92522g = gi0Var;
        this.f92523h = jwVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        View viewC = this.f92519d.c(viewGroup);
        if (viewC != null) {
            kr2 kr2Var = new kr2(this);
            this.f92517b.f87878b.add(kr2Var);
            this.f92525j = kr2Var;
            Context context = viewC.getContext();
            Object obj = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(context);
            boolean z10 = false;
            boolean z11 = nt2VarA != null && nt2VarA.D;
            eg0[] eg0VarArr = eg0.f89242b;
            if (tn.p.f("divkit", this.f92516a.f96000k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new jr2(this.f92518c));
            }
            viewC.setVisibility(8);
            lr2 lr2Var = new lr2(new WeakReference(viewC));
            jw jwVar = this.f92523h;
            v9 v9Var = this.f92516a;
            d42 d42Var = this.f92520e;
            k63 k63Var = this.f92521f;
            gi0 gi0Var = this.f92522g;
            jwVar.getClass();
            d62 d62Var = d42Var.f88757a;
            o72 o72Var = d42Var.f88758b;
            ay0 ay0Var = null;
            String str = gi0Var != null ? gi0Var.f89988a : null;
            fg0[] fg0VarArr = fg0.f89568b;
            ay0 a32Var = (tn.p.f(str, "pack_shot") && k63Var.f91500d.a()) ? new a32(v9Var, lr2Var, k63Var) : d62Var != null ? new b62(d62Var, lr2Var, v9Var.f95999j, k63Var.f91501e, k63Var.f91500d) : o72Var != null ? new m72(o72Var, lr2Var) : k63Var.f91500d.a() ? new a32(v9Var, lr2Var, k63Var) : null;
            if (a32Var != null) {
                a32Var.start();
                ay0Var = a32Var;
            }
            this.f92524i = ay0Var;
        }
    }

    @Override // yads.zf0
    public final void c() {
        kr2 kr2Var = this.f92525j;
        if (kr2Var != null) {
            this.f92517b.f87878b.remove(kr2Var);
        }
        ay0 ay0Var = this.f92524i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }
}
