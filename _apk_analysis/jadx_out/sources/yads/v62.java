package yads;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes2.dex */
public final class v62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h32 f95964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t62 f95965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yg3 f95966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v52 f95967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s62 f95968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g32 f95969f;

    public /* synthetic */ v62(Context context, dk3 dk3Var, ai3 ai3Var, d4 d4Var, lu2 lu2Var, v9 v9Var, vh3 vh3Var, d62 d62Var, h32 h32Var, mi2 mi2Var, my2 my2Var) {
        this(h32Var, new t62(dk3Var, ai3Var, d4Var, lu2Var, v9Var, vh3Var, d62Var, mi2Var, my2Var), new yg3(), new v52(context.getApplicationContext(), d4Var, lu2Var, v9Var));
    }

    public v62(h32 h32Var, t62 t62Var, yg3 yg3Var, v52 v52Var) {
        this.f95964a = h32Var;
        this.f95965b = t62Var;
        this.f95966c = yg3Var;
        this.f95967d = v52Var;
    }

    public final void a(e72 e72Var, sd3 sd3Var, zj3 zj3Var) {
        double dDoubleValue;
        u41 u41Var;
        v52 v52Var = this.f95967d;
        je3 je3Var = (je3) cn.f0.t0(sd3Var.f94800a);
        p52 p52VarA = v52Var.f95955c.a(je3Var);
        if (p52VarA == null || p52VarA.f()) {
            p52VarA = v52Var.f95954b.a();
            v52Var.f95955c.a(je3Var, p52VarA);
        }
        p52 p52Var = p52VarA;
        Context context = e72Var.getContext();
        t62 t62Var = this.f95965b;
        ff3 ff3Var = new ff3(t62Var.f95076c, t62Var.f95078e);
        v9 v9Var = t62Var.f95078e;
        lu2 lu2Var = t62Var.f95077d;
        ai3 ai3Var = t62Var.f95075b;
        s62 s62Var = new s62(context, v9Var, lu2Var, p52Var, sd3Var, ai3Var, t62Var.f95074a, ff3Var, zj3Var, t62Var.f95079f, t62Var.f95080g, t62Var.f95081h, t62Var.f95082i);
        this.f95968e = s62Var;
        q52 q52Var = s62Var.f94717d;
        q52Var.getClass();
        Double d10 = ai3Var.f87715d;
        w52 w52Var = q52Var.f93896b;
        if (d10 != null) {
            w52Var.getClass();
            dDoubleValue = d10.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        w52Var.f96292a.setVolume((float) dDoubleValue);
        q52Var.f93895a.a(ai3Var.f87712a);
        s62Var.f94719f.a(e72Var);
        ei3 ei3Var = e72Var.f89135a;
        gj2 gj2Var = s62Var.f94718e;
        gj2Var.getClass();
        ImageView imageView = ei3Var.f89270b;
        ProgressBar progressBar = ei3Var.f89269a;
        if (imageView == null || (u41Var = gj2Var.f90009a.f94802c) == null) {
            progressBar.setVisibility(0);
        } else {
            gj2Var.f90010b.a(u41Var, new fj2(imageView, progressBar));
        }
        s62Var.a(s62Var.f94721h);
        g32 g32Var = new g32(p52Var);
        this.f95969f = g32Var;
        h32 h32Var = this.f95964a;
        h32Var.f90231a.add(g32Var);
        if (h32Var.f90232b) {
            p52Var.g();
        }
        e72Var.setOnAttachStateChangeListener(new a62(p52Var, e72Var));
    }
}
