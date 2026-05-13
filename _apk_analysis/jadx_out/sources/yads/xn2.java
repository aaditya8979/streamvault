package yads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class xn2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f96830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r62 f96831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn2 f96832c;

    public xn2(dk3 dk3Var, r62 r62Var, vn2 vn2Var) {
        this.f96830a = dk3Var;
        this.f96831b = r62Var;
        this.f96832c = vn2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e72 e72Var = (e72) this.f96830a.b();
        if (e72Var != null) {
            un2 un2Var = e72Var.f89137c.f92744a;
            this.f96832c.getClass();
            vn2.a(un2Var);
            s62 s62Var = this.f96831b.f94294a;
            s62Var.a(s62Var.f94720g);
        }
    }
}
