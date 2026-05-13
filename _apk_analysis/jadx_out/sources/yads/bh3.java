package yads;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes10.dex */
public final class bh3 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e72 f88012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b20 f88013b;

    public bh3(e72 e72Var, b20 b20Var) {
        this.f88012a = e72Var;
        this.f88013b = b20Var;
    }

    @Override // yads.fv
    public final void a(if1 if1Var, hv hvVar) {
        ou ouVar = new ou(this.f88012a.getContext(), new ah3(if1Var, hvVar, this.f88013b));
        e72 e72Var = this.f88012a;
        e72Var.setOnTouchListener(ouVar);
        e72Var.setOnClickListener(ouVar);
        ImageView imageView = this.f88012a.f89135a.f89270b;
        if (imageView != null) {
            imageView.setOnTouchListener(ouVar);
            imageView.setOnClickListener(ouVar);
        }
    }
}
