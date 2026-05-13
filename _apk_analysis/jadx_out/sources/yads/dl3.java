package yads;

import android.content.Context;
import com.ironsource.C3978d4;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f88905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f88906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa2 f88907c;

    public /* synthetic */ dl3(Context context, lu2 lu2Var) {
        n9 n9Var = new n9();
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this(n9Var, cf.a(context, iu3Var.b()), new xa2());
    }

    public dl3(n9 n9Var, io2 io2Var, xa2 xa2Var) {
        this.f88905a = n9Var;
        this.f88906b = io2Var;
        this.f88907c = xa2Var;
    }

    public final void a(bl3 bl3Var, d4 d4Var) {
        zz2 zz2VarB;
        g9 g9Var = d4Var.f88744e;
        fo2 fo2VarA = g9Var != null ? this.f88905a.a(g9Var) : new fo2((Map) null, 3);
        g9 g9Var2 = d4Var.f88744e;
        if (g9Var2 != null) {
            go2.a(fo2VarA, this.f88905a.a(g9Var2));
        }
        fo2VarA.b(d4Var.f88742c.f90339a, "ad_unit_id");
        xa2 xa2Var = this.f88907c;
        int i10 = d4Var.f88753n;
        xa2Var.getClass();
        fo2VarA.b(i10 != 1 ? i10 != 2 ? "undefined" : C3978d4.i.C : C3978d4.i.D, "orientation");
        a03 a03Var = d4Var.f88743d.f87866a;
        fo2VarA.a((a03Var == null || (zz2VarB = a03Var.b()) == null) ? null : zz2VarB.f97849b, "size_type");
        a03 a03Var2 = d4Var.f88743d.f87866a;
        fo2VarA.a(a03Var2 != null ? Integer.valueOf(a03Var2.getWidth()) : null, "size_info_width");
        a03 a03Var3 = d4Var.f88743d.f87866a;
        fo2VarA.a(a03Var3 != null ? Integer.valueOf(a03Var3.getHeight()) : null, "size_info_height");
        fo2VarA.b(Integer.valueOf(bl3Var.f88066a.f87741a), "view_width");
        fo2VarA.b(Integer.valueOf(bl3Var.f88066a.f87742b), "view_height");
        fo2VarA.a(bl3Var.f88067b.f87678a, "layout_width");
        fo2VarA.a(bl3Var.f88067b.f87679b, "layout_height");
        fo2VarA.b(Integer.valueOf(bl3Var.f88068c.f91248a.f91608a), "measured_width");
        String strName = bl3Var.f88068c.f91248a.f91609b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        fo2VarA.b(lowerCase, "measured_width_mode");
        fo2VarA.b(Integer.valueOf(bl3Var.f88068c.f91249b.f91608a), "measured_height");
        String lowerCase2 = bl3Var.f88068c.f91249b.f91609b.name().toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        fo2VarA.b(lowerCase2, "measured_height_mode");
        co2 co2Var = co2.f88533c;
        this.f88906b.a(new eo2("ad_view_size_info", kotlin.collections.a.C(fo2VarA.f89652a), fo2VarA.f89653b));
    }
}
