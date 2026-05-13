package yads;

import android.content.Context;
import android.util.AttributeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class gw1 extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xv1 f90139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fo3 f90140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kw1 f90141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ij1 f90142o;

    public gw1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, new tn3(), attributeSet);
    }

    public /* synthetic */ gw1(Context context, tn3 tn3Var, int i10) {
        this(context, (i10 & 2) != 0 ? new tn3() : tn3Var, (AttributeSet) null);
    }

    public gw1(Context context, tn3 tn3Var, AttributeSet attributeSet) {
        super(context, tn3Var, attributeSet, 56);
        xv1 xv1Var = new xv1();
        this.f90139l = xv1Var;
        this.f90140m = eo3.f89342a;
        this.f90141n = new kw1(this, xv1Var);
        this.f90142o = new cz2();
    }

    @Override // yads.hb2, yads.m11
    public final void a() {
        super.a();
        fo3 fo3Var = this.f90140m;
        do3 do3Var = fo3Var instanceof do3 ? (do3) fo3Var : null;
        if (do3Var != null) {
            fw1 fw1Var = do3Var.f88942a;
            if (fw1Var != null) {
                fw1Var.b();
            }
            this.f90140m = co3.f88558a;
        }
    }

    @Override // yads.hb2, yads.m11
    public final void a(int i10) {
        super.a(i10);
        fo3 fo3Var = this.f90140m;
        do3 do3Var = fo3Var instanceof do3 ? (do3) fo3Var : null;
        if (do3Var != null) {
            fw1 fw1Var = do3Var.f88942a;
            if (fw1Var != null) {
                fw1Var.a();
            }
            stopLoading();
            this.f90140m = eo3.f89342a;
        }
    }

    public final void a(String str, fw1 fw1Var) {
        if (this.f90140m instanceof eo3) {
            this.f90140m = new do3(fw1Var);
            kw1 kw1Var = this.f90141n;
            kw1Var.f91790e.getClass();
            boolean zFind = uv1.f95853a.matcher(str).find();
            kw1Var.f91791f.getClass();
            j11 yv1Var = zFind ? new yv1() : new go();
            gw1 gw1Var = kw1Var.f91786a;
            lh3 lh3Var = kw1Var.f91788c;
            xv1 xv1Var = kw1Var.f91787b;
            yv1Var.a(gw1Var, kw1Var, lh3Var, xv1Var, xv1Var, xv1Var).a(str);
        }
    }

    @Override // yads.hb2
    public final void e() {
        this.f90141n.f91789d.a(kotlin.collections.a.j());
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f90142o.a(i10, i11);
        super.onMeasure(hj1VarA.f90433a, hj1VarA.f90434b);
    }

    public final void setAspectRatio(float f10) {
        this.f90142o = new ok2(f10);
    }

    public final void setClickListener(@NotNull ev evVar) {
        this.f90141n.f91793h = evVar;
    }

    public final void setPreloadingState(@NotNull fo3 fo3Var) {
        this.f90140m = fo3Var;
    }
}
