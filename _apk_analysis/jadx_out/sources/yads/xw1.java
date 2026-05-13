package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class xw1 extends dt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96902g = {wb.a(xw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx1 f96903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx1 f96904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f96905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww1 f96906f = ww1.f96546b;

    public xw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var) {
        this.f96903c = jx1Var;
        this.f96904d = bx1Var;
        this.f96905e = mm2.a(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bn.r rVar;
        ViewPager2 viewPager2;
        lm2 lm2Var = this.f96905e;
        KProperty kProperty = f96902g[0];
        ViewPager2 viewPager22 = (ViewPager2) lm2Var.f92035a.get();
        if (viewPager22 != null) {
            if (kl3.f91651a.a(viewPager22).f96809a > 0) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager22.getCurrentItem();
                    if (currentItem == 0) {
                        this.f96906f = ww1.f96546b;
                    } else if (currentItem == itemCount - 1) {
                        this.f96906f = ww1.f96547c;
                    }
                } else {
                    this.f88975b = ct.f88598c;
                }
                int iOrdinal = this.f96906f.ordinal();
                if (iOrdinal == 0) {
                    ViewPager2 viewPager23 = (ViewPager2) this.f96903c.f91406a.get();
                    if (viewPager23 != null) {
                        viewPager23.setCurrentItem(viewPager23.getCurrentItem() + 1, true);
                    }
                } else if (iOrdinal == 1 && (viewPager2 = (ViewPager2) this.f96903c.f91406a.get()) != null) {
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
                }
                bx1 bx1Var = this.f96904d;
                if (bx1Var.f88187e) {
                    bx1Var.a("first_auto_swipe");
                    bx1Var.f88187e = false;
                }
            }
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f88975b = ct.f88598c;
        }
    }
}
