package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class wz extends xz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx1 f96563c;

    public wz(jx1 jx1Var, bx1 bx1Var, vw1 vw1Var) {
        super(bx1Var, vw1Var, 0);
        this.f96563c = jx1Var;
    }

    @Override // yads.xz, android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.f96563c.f91406a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        }
        super.onClick(view);
    }
}
