package yads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class wq2 extends qy0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wk2 f96477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zs2 f96478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final or2 f96479o;

    public wq2(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, by0 by0Var, wk2 wk2Var, pr2 pr2Var, i12 i12Var, zs2 zs2Var) {
        super(context, v9Var, d4Var, lu2Var, by0Var, new m5());
        this.f96477m = wk2Var;
        this.f96478n = zs2Var;
        this.f96479o = pr2Var.a(context, v9Var, lu2Var, d4Var);
        i12Var.a(v9Var);
    }

    @Override // yads.qy0, yads.u73, yads.f4
    public final void a(int i10, Bundle bundle) {
        if (i10 == 13) {
            h();
        } else {
            super.a(i10, bundle);
        }
    }

    public final void a(vk2 vk2Var) {
        this.f94215l = vk2Var;
        this.f96477m.f96429a = vk2Var;
    }

    @Override // yads.qy0
    public final qy0 f() {
        return this;
    }

    public final void h() {
        Map mapJ;
        qq2 qq2Var;
        zs2 zs2Var = this.f96478n;
        Context context = this.f92892a;
        v9 v9Var = this.f92893b;
        zs2Var.getClass();
        Boolean boolValueOf = null;
        fo2 fo2Var = new fo2((Map) null, 3);
        if (v9Var != null && (qq2Var = v9Var.f96007r) != null) {
            boolValueOf = Boolean.valueOf(qq2Var.f94118b);
        }
        if (tn.p.f(boolValueOf, Boolean.TRUE)) {
            mapJ = cn.p0.g(bn.h.a("rewarding_side", "server_side"));
        } else if (tn.p.f(boolValueOf, Boolean.FALSE)) {
            mapJ = cn.p0.g(bn.h.a("rewarding_side", "client_side"));
        } else {
            if (boolValueOf != null) {
                throw new NoWhenBranchMatchedException();
            }
            mapJ = kotlin.collections.a.j();
        }
        fo2Var.b(mapJ, "reward_info");
        zs2Var.a(context, v9Var, co2.C, fo2Var);
        or2 or2Var = this.f96479o;
        if (or2Var != null) {
            or2Var.a();
        }
    }
}
