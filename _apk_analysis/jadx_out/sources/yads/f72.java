package yads;

import android.view.TextureView;

/* JADX INFO: loaded from: classes9.dex */
public final class f72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f89500a;

    public f72(p52 p52Var) {
        this.f89500a = p52Var;
    }

    public final void a(e72 e72Var) {
        TextureView textureView = e72Var.f89136b;
        this.f89500a.a(textureView);
        textureView.setVisibility(0);
        e72Var.f89137c.setVisibility(0);
        e72Var.f89135a.setVisibility(0);
    }

    public final void b(e72 e72Var) {
        TextureView textureView = e72Var.f89136b;
        this.f89500a.a((TextureView) null);
        textureView.setVisibility(8);
        e72Var.f89137c.setVisibility(8);
        e72Var.f89135a.setVisibility(8);
    }
}
