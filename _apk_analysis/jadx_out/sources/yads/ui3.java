package yads;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class ui3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g72 f95670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj2 f95671b;

    public ui3(g72 g72Var, gj2 gj2Var) {
        this.f95670a = g72Var;
        this.f95671b = gj2Var;
    }

    public final void a(e72 e72Var) {
        e72Var.f89136b.setVisibility(0);
        ei3 ei3Var = e72Var.f89135a;
        this.f95671b.getClass();
        ei3Var.f89269a.setVisibility(8);
        ImageView imageView = ei3Var.f89270b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f95670a.a(e72Var.f89137c.f92745b);
    }
}
