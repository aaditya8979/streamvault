package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.yandex.div.R$style;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGallery;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivRecyclerView.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<Div.d> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ DivHolderViewMixin<Div.d> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;

    @NotNull
    private DivGallery.ScrollMode scrollMode;
    private int scrollPointerId;

    /* JADX INFO: compiled from: DivRecyclerView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(new ContextThemeWrapper(context, R$style.Div_Gallery), attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = DivGallery.ScrollMode.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private int toTouchPoint(float f10) {
        return (int) Math.ceil(f10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j10) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i10, int i11) {
        boolean zFling = super.fling(i10, i11);
        if (getScrollMode() == DivGallery.ScrollMode.PAGING) {
            this.needFling = !zFling;
        }
        return zFling;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Div.d getDiv() {
        return (Div.d) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Nullable
    public View getItemView(int i10) {
        View childAt = getChildAt(i10);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Nullable
    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    @NotNull
    public DivGallery.ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i10, int i11) {
        this.$$delegate_0.onBoundsChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) {
            return true;
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.scrollPointerId = motionEvent.getPointerId(0);
            this.pointTouchX = toTouchPoint(motionEvent.getX());
            this.pointTouchY = toTouchPoint(motionEvent.getY());
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.scrollPointerId = motionEvent.getPointerId(actionIndex);
            this.pointTouchX = toTouchPoint(motionEvent.getX(actionIndex));
            this.pointTouchY = toTouchPoint(motionEvent.getY(actionIndex));
            return super.onInterceptTouchEvent(motionEvent);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (iFindPointerIndex = motionEvent.findPointerIndex(this.scrollPointerId)) < 0) {
            return false;
        }
        int touchPoint = toTouchPoint(motionEvent.getX(iFindPointerIndex));
        int touchPoint2 = toTouchPoint(motionEvent.getY(iFindPointerIndex));
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iAbs = Math.abs(touchPoint - this.pointTouchX);
        int iAbs2 = Math.abs(touchPoint2 - this.pointTouchY);
        if (iAbs == 0 && iAbs2 == 0) {
            return false;
        }
        double dAtan = iAbs != 0 ? (Math.atan(((double) iAbs2) / ((double) iAbs)) * ((double) BaseTransientBottomBar.ANIMATION_FADE_DURATION)) / 3.141592653589793d : 90.0d;
        return (layoutManager.canScrollHorizontally() && dAtan <= ((double) getScrollInterceptionAngle())) || (layoutManager.canScrollVertically() && dAtan > ((double) getScrollInterceptionAngle()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        if (i10 == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.beforeScrollFocusPosition
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.getOrientation()
            goto L21
        L15:
            boolean r1 = r0 instanceof com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager
            if (r1 == 0) goto L20
            com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager r0 = (com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager) r0
            int r0 = r0.getOrientation()
            goto L21
        L20:
            r0 = 0
        L21:
            r1 = 1
            if (r0 != r1) goto L2a
            if (r5 <= 0) goto L2a
            int r0 = r3.beforeScrollFocusPosition
        L28:
            int r0 = r0 + r1
            goto L39
        L2a:
            if (r0 != r1) goto L31
            if (r5 > 0) goto L31
            int r0 = r3.beforeScrollFocusPosition
            goto L38
        L31:
            if (r4 <= 0) goto L36
            int r0 = r3.beforeScrollFocusPosition
            goto L28
        L36:
            int r0 = r3.beforeScrollFocusPosition
        L38:
            int r0 = r0 - r1
        L39:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.findViewHolderForAdapterPosition(r0)
            r1 = 0
            if (r0 == 0) goto L43
            android.view.View r0 = r0.itemView
            goto L44
        L43:
            r0 = r1
        L44:
            boolean r2 = r0 instanceof com.yandex.div.core.widget.DivViewWrapper
            if (r2 == 0) goto L4b
            r1 = r0
            com.yandex.div.core.widget.DivViewWrapper r1 = (com.yandex.div.core.widget.DivViewWrapper) r1
        L4b:
            if (r1 == 0) goto L56
            android.view.View r0 = r1.getChild()
            if (r0 == 0) goto L56
            r0.requestFocus()
        L56:
            super.onScrolled(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivRecyclerView.onScrolled(int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        RecyclerView.LayoutManager layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View viewFindSnapView;
        int i10;
        DivGallery.ScrollMode scrollMode = getScrollMode();
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
        if (scrollMode == scrollMode2) {
            this.needFling = true;
        }
        boolean z10 = super.onTouchEvent(motionEvent) && canScroll();
        if (motionEvent == null || motionEvent.getActionMasked() != 1 || getScrollMode() != scrollMode2 || !this.needFling || (layoutManager = getLayoutManager()) == null || (pagerSnapStartHelper = getPagerSnapStartHelper()) == null || (viewFindSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) == null) {
            return z10;
        }
        int[] iArrCalculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        if (iArrCalculateDistanceToFinalSnap.length >= 2 && ((i10 = iArrCalculateDistanceToFinalSnap[0]) != 0 || iArrCalculateDistanceToFinalSnap[1] != 0)) {
            smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
        }
        return z10;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, divBorder, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Div.d dVar) {
        this.$$delegate_0.setDiv(dVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(@Nullable PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    public void setScrollInterceptionAngle(float f10) {
        this.scrollInterceptionAngle = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? 0.0f : Math.abs(f10) % 90;
    }

    public void setScrollMode(@NotNull DivGallery.ScrollMode scrollMode) {
        this.scrollMode = scrollMode;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }
}
