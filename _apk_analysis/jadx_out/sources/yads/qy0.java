package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.Q6;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qy0 extends u73 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d4 f94208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final by0 f94209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5 f94210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w5 f94211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n43 f94212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d9 f94213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f94214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public iy0 f94215l;

    public /* synthetic */ qy0(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, by0 by0Var, m5 m5Var) {
        w5 w5Var = new w5();
        n43 n43Var = n43.f92737b;
        n43 n43VarA = m43.a();
        i12 i12Var = new i12(d4Var);
        i12Var.a(v9Var);
        iu3 iu3Var = (iu3) lu2Var;
        this(context, v9Var, d4Var, lu2Var, by0Var, m5Var, w5Var, n43VarA, new d9(context, v9Var, d4Var, w5Var, i12Var, iu3Var.a()), new c1(iu3Var.a(), d4Var, v9Var));
    }

    public qy0(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, by0 by0Var, m5 m5Var, w5 w5Var, n43 n43Var, d9 d9Var, c1 c1Var) {
        super(context, v9Var, lu2Var, d4Var);
        this.f94208e = d4Var;
        this.f94209f = by0Var;
        this.f94210g = m5Var;
        this.f94211h = w5Var;
        this.f94212i = n43Var;
        this.f94213j = d9Var;
        this.f94214k = c1Var;
        k2.f91463b.a().a("window_type_fullscreen", new d2(lu2Var));
    }

    public final Object a(Activity activity) {
        Result.a aVar = Result.Companion;
        Result.m7534constructorimpl(kotlin.c.a(o7.f93135b));
        synchronized (this) {
        }
        w5 w5Var = this.f94211h;
        v5 v5Var = v5.f95927f;
        w5Var.a(v5Var, null);
        n43 n43Var = this.f94212i;
        ie1 ie1Var = ie1.f90788c;
        n43Var.b(ie1Var, this);
        Object objA = this.f94209f.a(f(), activity);
        if (Result.m7537exceptionOrNullimpl(objA) != null) {
            this.f94211h.a(v5Var);
            if (!tb.a((mu) this)) {
                this.f94212i.a(ie1Var, this);
                this.f94209f.a(this.f92892a);
                super.c();
            }
        }
        return objA;
    }

    @Override // yads.u73, yads.f4
    public void a(int i10, Bundle bundle) {
        getClass().toString();
        boolean z10 = ad1.f87661a;
        if (i10 == 0) {
            this.f94211h.a(v5.f95927f);
            d9 d9Var = this.f94213j;
            fo2 fo2VarA = d9Var.f88777c.a();
            fo2VarA.b(bo2.f88105a, Q6.G1);
            fo2VarA.f89652a.putAll(d9Var.f88779e.a());
            a03 a03Var = d9Var.f88776b.f88743d.f87866a;
            if (a03Var != null) {
                fo2VarA.b(a03Var.b().f97849b, "size_type");
                fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
                fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
            }
            nt2 nt2Var = d9Var.f88780f;
            if (nt2Var != null) {
                fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
            }
            c cVar = d9Var.f88775a.f95998i;
            fo2VarA.f89653b = cVar;
            d9Var.f88778d.a(new eo2(co2.f88534d.a(), kotlin.collections.a.C(fo2VarA.f89652a), cVar));
            iy0 iy0Var = this.f94215l;
            if (iy0Var != null) {
                iy0Var.onAdShown();
                return;
            }
            return;
        }
        if (i10 == 16) {
            if (bundle == null) {
                a((j5) null);
                return;
            } else {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof j5 ? (j5) parcelable : null);
                return;
            }
        }
        if (i10 == 17) {
            iy0 iy0Var2 = this.f94215l;
            if (iy0Var2 != null) {
                iy0Var2.onAdClicked();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f94214k.b();
            return;
        }
        if (i10 == 3) {
            this.f94214k.a();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, bundle);
            }
        } else {
            this.f94212i.a(ie1.f90788c, this);
            iy0 iy0Var3 = this.f94215l;
            if (iy0Var3 != null) {
                iy0Var3.onAdDismissed();
            }
        }
    }

    public final void a(iy0 iy0Var) {
        this.f94215l = iy0Var;
    }

    @Override // yads.y51
    public final void a(j5 j5Var) {
        iy0 iy0Var = this.f94215l;
        if (iy0Var != null) {
            iy0Var.a(j5Var);
        }
    }

    public final c00 d() {
        List listB = this.f94209f.b();
        m5 m5Var = this.f94210g;
        Context context = this.f92892a;
        v9 v9Var = this.f92893b;
        d4 d4Var = this.f94208e;
        String adInfo = this.f94209f.getAdInfo();
        m5Var.getClass();
        String str = v9Var.f95994e;
        if (str == null && (str = d4Var.f88742c.f90339a) == null) {
            str = "";
        }
        nv0 nv0VarC = v9Var.c();
        if (nv0VarC.f92998c == 0 || nv0VarC.f92999d == 0) {
            nv0VarC = null;
        }
        return new c00(str, nv0VarC != null ? new la(nv0VarC.c(context), nv0VarC.a(context)) : null, adInfo, listB);
    }

    public final List e() {
        return this.f94209f.a();
    }

    public abstract qy0 f();

    public final void g() {
        iy0 iy0Var = this.f94215l;
        if (iy0Var != null) {
            iy0Var.onAdClicked();
        }
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
    }
}
