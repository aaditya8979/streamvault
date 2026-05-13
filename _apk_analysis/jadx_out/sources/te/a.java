package te;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smart.refresh.layout.kernel.R$id;
import java.util.LinkedList;
import oe.e;
import qe.i;

/* JADX INFO: compiled from: RefreshContentWrapper.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements oe.b, qe.a, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f85238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f85239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f85240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f85241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f85242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85243g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85244h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85245i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public re.a f85246j = new re.a();

    public a(@NonNull View view) {
        this.f85240d = view;
        this.f85239c = view;
        this.f85238b = view;
    }

    @Override // oe.b
    public void a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f85238b.getLeft(), -this.f85238b.getTop());
        View view = this.f85240d;
        View view2 = this.f85238b;
        if (view != view2) {
            this.f85240d = l(view2, pointF, view);
        }
        if (this.f85240d == this.f85238b) {
            this.f85246j.f78895a = null;
        } else {
            this.f85246j.f78895a = pointF;
        }
    }

    @Override // oe.b
    public void b(boolean z10) {
        this.f85246j.f78897c = z10;
    }

    @Override // oe.b
    public ValueAnimator.AnimatorUpdateListener c(int i10) {
        View view = this.f85240d;
        if (view == null || i10 == 0) {
            return null;
        }
        if ((i10 >= 0 || !view.canScrollVertically(1)) && (i10 <= 0 || !this.f85240d.canScrollVertically(-1))) {
            return null;
        }
        this.f85243g = i10;
        return this;
    }

    @Override // oe.b
    public void d(int i10, int i11, int i12) {
        boolean z10;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z11 = true;
        if (i11 == -1 || (viewFindViewById2 = this.f85239c.findViewById(i11)) == null) {
            z10 = false;
        } else if (i10 > 0) {
            viewFindViewById2.setTranslationY(i10);
            z10 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z10 = false;
        }
        if (i12 == -1 || (viewFindViewById = this.f85239c.findViewById(i12)) == null) {
            z11 = z10;
        } else if (i10 < 0) {
            viewFindViewById.setTranslationY(i10);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z11 = z10;
        }
        if (z11) {
            this.f85239c.setTranslationY(0.0f);
        } else {
            this.f85239c.setTranslationY(i10);
        }
        View view = this.f85241e;
        if (view != null) {
            view.setTranslationY(Math.max(0, i10));
        }
        View view2 = this.f85242f;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i10));
        }
    }

    @Override // oe.b
    public boolean e() {
        return this.f85245i && this.f85246j.a(this.f85238b);
    }

    @Override // oe.b
    public void f(i iVar) {
        if (iVar instanceof re.a) {
            this.f85246j = (re.a) iVar;
        } else {
            this.f85246j.f78896b = iVar;
        }
    }

    @Override // oe.b
    @NonNull
    public View g() {
        return this.f85240d;
    }

    @Override // oe.b
    @NonNull
    public View getView() {
        return this.f85238b;
    }

    @Override // oe.b
    public boolean h() {
        return this.f85244h && this.f85246j.b(this.f85238b);
    }

    @Override // qe.a
    public void i(boolean z10, boolean z11) {
        this.f85244h = z10;
        this.f85245i = z11;
    }

    @Override // oe.b
    public void j(e eVar, View view, View view2) {
        k(this.f85238b, eVar);
        if (view == null && view2 == null) {
            return;
        }
        this.f85241e = view;
        this.f85242f = view2;
        FrameLayout frameLayout = new FrameLayout(this.f85238b.getContext());
        int iIndexOfChild = eVar.c().getLayout().indexOfChild(this.f85238b);
        eVar.c().getLayout().removeView(this.f85238b);
        frameLayout.addView(this.f85238b, 0, new ViewGroup.LayoutParams(-1, -1));
        eVar.c().getLayout().addView(frameLayout, iIndexOfChild, this.f85238b.getLayoutParams());
        this.f85238b = frameLayout;
        if (view != null) {
            view.setTag(R$id.srl_tag, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = se.b.h(view);
            viewGroup.addView(new Space(this.f85238b.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(R$id.srl_tag, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = se.b.h(view2);
            viewGroup2.addView(new Space(this.f85238b.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    public void k(View view, e eVar) {
        boolean zIsInEditMode = this.f85238b.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = m(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                se.a.a(view, eVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f85240d = view2;
        }
    }

    public View l(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (se.b.g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && se.b.e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewL = l(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewL;
                }
            }
        }
        return view2;
    }

    public View m(View view, boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z10 || view3 != view) && se.b.e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f85243g) * this.f85240d.getScaleY();
            View view = this.f85240d;
            if (view instanceof AbsListView) {
                se.b.j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f85243g = iIntValue;
    }
}
