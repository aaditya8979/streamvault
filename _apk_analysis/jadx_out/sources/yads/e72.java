package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class e72 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei3 f89135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureView f89136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n52 f89137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i62 f89138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ij1 f89139e;

    public e72(Context context, ei3 ei3Var, TextureView textureView, n52 n52Var) {
        super(context);
        this.f89135a = ei3Var;
        this.f89136b = textureView;
        this.f89137c = n52Var;
        this.f89139e = new cz2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i62 i62Var = this.f89138d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f87593a.a(a62Var.f87594b.f89136b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i62 i62Var = this.f89138d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f87594b.f89135a.f89269a.clearAnimation();
            a62Var.f87593a.a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f89139e.a(i10, i11);
        super.onMeasure(hj1VarA.f90433a, hj1VarA.f90434b);
    }

    public final void setAspectRatio(float f10) {
        this.f89139e = new ok2(f10);
    }

    public final void setOnAttachStateChangeListener(@Nullable i62 i62Var) {
        this.f89138d = i62Var;
    }
}
