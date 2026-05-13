package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kx1 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi2 f91796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f91797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9 f91798e;

    public kx1(ViewPager2 viewPager2, mi2 mi2Var, at1 at1Var, v9 v9Var) {
        super(viewPager2);
        this.f91796c = mi2Var;
        this.f91797d = at1Var;
        this.f91798e = v9Var;
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof hx1;
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new hx1(this.f91796c, (List) obj, this.f91798e));
        } catch (IllegalArgumentException e10) {
            io2 io2Var = this.f91797d;
            String message = e10.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            io2Var.reportError(message, e10);
        }
    }
}
