package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes12.dex */
public final class wn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn1 f96457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw1 f96458b;

    public /* synthetic */ wn1() {
        this(new mn1(), new lw1());
    }

    public wn1(mn1 mn1Var, lw1 lw1Var) {
        this.f96457a = mn1Var;
        this.f96458b = lw1Var;
    }

    public final fv2 a(CustomizableMediaView customizableMediaView, oj1 oj1Var, x51 x51Var, o72 o72Var, ao1 ao1Var) {
        Context context = customizableMediaView.getContext();
        this.f96458b.getClass();
        gw1 gw1Var = (gw1) sw1.f94966c.a(context).f94969b.remove(oj1Var);
        if (gw1Var == null) {
            gw1Var = new gw1(context, (tn3) null, 6);
        }
        xv1 xv1Var = gw1Var.f90139l;
        xv1Var.f96887a.add(x51Var);
        xv1Var.f96888b.add(o72Var);
        xv1Var.f96889c.add(o72Var);
        this.f96457a.getClass();
        if (!pr0.a(customizableMediaView.getContext(), or0.f93313e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(gw1Var, new FrameLayout.LayoutParams(-1, -1));
        return new fv2(customizableMediaView, ao1Var, new ik3(new iw1(gw1Var)));
    }
}
