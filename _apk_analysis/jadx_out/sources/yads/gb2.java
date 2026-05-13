package yads;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class gb2 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx1 f89902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f89903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89904c;

    public gb2(bx1 bx1Var, vw1 vw1Var) {
        this.f89902a = bx1Var;
        this.f89903b = vw1Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
        if (i10 == 0) {
            this.f89904c = false;
            return;
        }
        if (i10 != 1) {
            return;
        }
        vw1 vw1Var = this.f89903b;
        if (vw1Var != null) {
            vw1Var.a();
            vw1Var.f96211f = false;
        }
        this.f89904c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        if (this.f89904c) {
            bx1 bx1Var = this.f89902a;
            if (bx1Var.f88186d) {
                bx1Var.a("first_user_swipe");
                bx1Var.f88186d = false;
            }
            this.f89904c = false;
        }
    }
}
