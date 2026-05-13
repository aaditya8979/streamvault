package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class dj1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f88868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f88870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f88871d;

    public /* synthetic */ dj1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    public dj1(View view, float f10, Context context, hj1 hj1Var) {
        this.f88868a = view;
        this.f88869b = f10;
        this.f88870c = context;
        this.f88871d = hj1Var;
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int iRound = Math.round(kl3.c(this.f88870c) * this.f88869b);
        ViewGroup.LayoutParams layoutParams = this.f88868a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), 0.0d);
        hj1 hj1Var = this.f88871d;
        hj1Var.f90433a = i10;
        hj1Var.f90434b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f88871d;
    }
}
