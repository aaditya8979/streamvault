package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cn.b0;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.t;
import zn.n;

/* JADX INFO: compiled from: FrameContainerLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {t.f(new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    @NotNull
    private final wn.d aspectRatio$delegate;
    private int childState;

    @NotNull
    private final Rect foregroundPadding;

    @NotNull
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;

    @NotNull
    private final Set<View> measuredMatchParentChildren;

    @NotNull
    private final Set<View> skippedMatchParentChildren;

    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void considerMatchParentChildrenInMaxSize(int i10, int i11) {
        if (this.matchParentChildren.isEmpty()) {
            return;
        }
        boolean zIsExact = ViewsKt.isExact(i10);
        boolean zIsExact2 = ViewsKt.isExact(i11);
        if (zIsExact && zIsExact2) {
            return;
        }
        boolean z10 = !zIsExact && this.maxWidth == 0;
        boolean z11 = (zIsExact2 || getUseAspect() || this.maxHeight != 0) ? false : true;
        if (!z10 && !z11) {
            Iterator<T> it = this.matchParentChildren.iterator();
            while (it.hasNext()) {
                considerMatchParentMargins((View) it.next(), zIsExact, zIsExact2);
            }
            return;
        }
        for (View view : this.matchParentChildren) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z10) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z11))) {
                measureChildWithMargins(view, i10, 0, i11, 0);
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                this.skippedMatchParentChildren.remove(view);
            }
            if (z10) {
                updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
            }
            if (z11) {
                updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            }
        }
    }

    private final void considerMatchParentMargins(View view, boolean z10, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (matchDynamicWidth(divLayoutParams, z10)) {
            updateMaxWidth(view.getMinimumWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (matchDynamicHeight(divLayoutParams, z11)) {
            updateMaxHeight(view.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final int getDynamicHeight(int i10, int i11, int i12) {
        if (ViewsKt.isExact(i11)) {
            return 0;
        }
        if (isDynamicAspect(i10)) {
            return vn.c.d(i12 / getAspectRatio());
        }
        int iE = n.e(this.maxHeight + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        return foreground != null ? n.e(iE, foreground.getMinimumHeight()) : iE;
    }

    private final int getDynamicWidth(int i10) {
        if (ViewsKt.isExact(i10)) {
            return 0;
        }
        int iE = n.e(this.maxWidth + getHorizontalPadding(), getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        return foreground != null ? n.e(iE, foreground.getMinimumWidth()) : iE;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int i10) {
        return getUseAspect() && !ViewsKt.isExact(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void layoutChildren(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getPaddingLeftWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingRightWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingTopWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingBottomWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r11) goto L91
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L8e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams"
            tn.p.i(r3, r4)
            com.yandex.div.internal.widget.DivLayoutParams r3 = (com.yandex.div.internal.widget.DivLayoutParams) r3
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            int r6 = r3.getGravity()
            int r7 = r9.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            int r7 = r3.getGravity()
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 & 7
            r8 = 1
            if (r6 == r8) goto L5d
            r8 = 5
            if (r6 == r8) goto L57
            int r6 = r3.leftMargin
            goto L68
        L57:
            int r6 = r12 - r4
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            goto L69
        L5d:
            int r6 = r12 - r0
            int r6 = r6 - r4
            int r8 = r3.leftMargin
            int r6 = r6 + r8
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            int r6 = r6 / 2
        L68:
            int r6 = r6 + r0
        L69:
            r8 = 16
            if (r7 == r8) goto L7c
            r8 = 80
            if (r7 == r8) goto L75
            int r3 = r3.topMargin
            int r3 = r3 + r10
            goto L89
        L75:
            int r7 = r13 - r5
            int r3 = r3.bottomMargin
            int r3 = r7 - r3
            goto L89
        L7c:
            int r7 = r13 - r10
            int r7 = r7 - r5
            int r8 = r3.topMargin
            int r7 = r7 + r8
            int r3 = r3.bottomMargin
            int r7 = r7 - r3
            int r7 = r7 / 2
            int r3 = r10 + r7
        L89:
            int r4 = r4 + r6
            int r5 = r5 + r3
            r2.layout(r6, r3, r4, r5)
        L8e:
            int r1 = r1 + 1
            goto L19
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.FrameContainerLayout.layoutChildren(int, int, int, int):void");
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z10, boolean z11) {
        return matchDynamicWidth(divLayoutParams, z10) || matchDynamicHeight(divLayoutParams, z11);
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final void measureChildWithDefinedSize(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean zIsExact = ViewsKt.isExact(i10);
        boolean zIsExact2 = ViewsKt.isExact(i11);
        boolean z10 = false;
        boolean z11 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z12 = i12 == -1;
        if ((zIsExact && zIsExact2) || (!zIsExact2 ? !(!zIsExact ? z11 && i12 <= 0 : z12) : !z11)) {
            z10 = true;
        }
        if (!z10) {
            if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
                this.skippedMatchParentChildren.add(view);
                return;
            }
            return;
        }
        measureChildWithMargins(view, i10, 0, i11, 0);
        this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
            this.measuredMatchParentChildren.add(view);
        }
        if (!zIsExact && !z11) {
            updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (zIsExact2 || z12 || getUseAspect()) {
            return;
        }
        updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
    }

    private final void remeasureMatchParentChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.getHorizontalMargins$div_release();
        int verticalPadding = getVerticalPadding() + divLayoutParams.getVerticalMargins$div_release();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            i10 = ViewsKt.makeExactSpec(getMeasuredWidth());
        }
        int i12 = i10;
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int childMeasureSpec = companion.getChildMeasureSpec(i12, horizontalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            i11 = ViewsKt.makeExactSpec(getMeasuredHeight());
        }
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i11, verticalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(view)) {
            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(view, i10, 0, i11, 0);
            this.matchParentChildren.remove(view);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int i10, int i11) {
        if (isDynamicAspect(i10)) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    remeasureWrapContentConstrainedChild(childAt, i10, i11);
                }
            }
        }
    }

    private final void updateMaxHeight(int i10) {
        this.maxHeight = Math.max(this.maxHeight, i10);
    }

    private final void updateMaxWidth(int i10) {
        this.maxWidth = Math.max(this.maxWidth, i10);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean zIsExact = ViewsKt.isExact(i10);
        if (getUseAspect()) {
            i11 = !zIsExact ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.makeExactSpec(vn.c.d(View.MeasureSpec.getSize(i10) / getAspectRatio()));
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, i10, i11);
            }
        }
        b0.F(this.matchParentChildren, this.measuredMatchParentChildren);
        b0.F(this.matchParentChildren, this.skippedMatchParentChildren);
        considerMatchParentChildrenInMaxSize(i10, i11);
        int iResolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(i10), i10, this.childState);
        int dynamicHeight = getDynamicHeight(i10, i11, 16777215 & iResolveSizeAndState);
        if (ViewsKt.isUnspecified(i11)) {
            i11 = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(i10, i11);
        }
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(dynamicHeight, i11, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), i10, i11);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (getForegroundGravity() == i10) {
            return;
        }
        super.setForegroundGravity(i10);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.foregroundPadding.setEmpty();
        } else {
            getForeground().getPadding(this.foregroundPadding);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
