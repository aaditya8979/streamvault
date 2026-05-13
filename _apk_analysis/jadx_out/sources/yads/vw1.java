package yads;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final class vw1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96205g = {wb.a(vw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx1 f96206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bx1 f96207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f96208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f96209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ph1 f96210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96211f = true;

    public vw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var, qh1 qh1Var) {
        this.f96206a = jx1Var;
        this.f96207b = bx1Var;
        this.f96208c = qh1Var;
        this.f96209d = mm2.a(viewPager2);
    }

    public final void a() {
        ph1 ph1Var = this.f96210e;
        if (ph1Var != null) {
            ph1Var.f93596a.removeCallbacksAndMessages(null);
        }
        this.f96210e = null;
    }
}
