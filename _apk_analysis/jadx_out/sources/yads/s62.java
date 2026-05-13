package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f94714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m62 f94715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final my2 f94716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q52 f94717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gj2 f94718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f72 f94719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ae2 f94720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ae2 f94721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tn2 f94722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q62 f94723j = new q62(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nh1 f94724k = new nh1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ae2 f94725l;

    public s62(Context context, v9 v9Var, lu2 lu2Var, p52 p52Var, sd3 sd3Var, ai3 ai3Var, dk3 dk3Var, ff3 ff3Var, zj3 zj3Var, vh3 vh3Var, m62 m62Var, mi2 mi2Var, my2 my2Var) {
        this.f94714a = dk3Var;
        this.f94715b = m62Var;
        this.f94716c = my2Var;
        this.f94722i = new tn2(dk3Var, new r62(this));
        i72 i72Var = new i72(dk3Var);
        this.f94717d = new q52(p52Var);
        this.f94719f = new f72(p52Var);
        rf3 rf3Var = new rf3();
        new x52(dk3Var, p52Var, i72Var, m62Var).a(rf3Var);
        l62 l62Var = new l62(context, v9Var, lu2Var, p52Var, sd3Var.a(), i72Var, ff3Var, zj3Var, rf3Var, vh3Var);
        ao2 ao2Var = new ao2(p52Var, sd3Var.a(), rf3Var);
        g72 g72Var = new g72(p52Var, ai3Var);
        gj2 gj2Var = new gj2(sd3Var, new w31(context, new s32(v9Var), mi2Var));
        this.f94718e = gj2Var;
        this.f94721h = new ae2(dk3Var, l62Var, g72Var, gj2Var);
        this.f94720g = new ae2(dk3Var, ao2Var, g72Var, gj2Var);
    }

    public final void a(ae2 ae2Var) {
        this.f94725l = ae2Var;
        if (ae2Var != null) {
            ae2Var.f87677e.f97539a = this.f94723j;
        }
        if (ae2Var != null) {
            ae2Var.f87674b.a(ae2Var.f87677e);
            ae2Var.f87674b.play();
        }
    }
}
