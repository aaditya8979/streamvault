package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class ej1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f89271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f89272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f89273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f89274d;

    public /* synthetic */ ej1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    public ej1(View view, float f10, Context context, hj1 hj1Var) {
        this.f89271a = view;
        this.f89272b = f10;
        this.f89273c = context;
        this.f89274d = hj1Var;
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        Context context = this.f89273c;
        wl3 wl3Var = kl3.f91651a;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f89272b);
        ViewGroup.LayoutParams layoutParams = this.f89271a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f89274d.f90433a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), 0.0d), mode);
        hj1 hj1Var = this.f89274d;
        hj1Var.f90434b = i11;
        return hj1Var;
    }
}
