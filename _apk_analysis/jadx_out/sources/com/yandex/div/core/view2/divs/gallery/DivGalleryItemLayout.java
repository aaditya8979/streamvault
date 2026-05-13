package com.yandex.div.core.view2.divs.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.DivLayoutParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivGalleryItemLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivGalleryItemLayout extends DivViewWrapper {
    public DivGalleryItemLayout(@NotNull Context context) {
        super(context, null, 0, 6, null);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (getLayoutParams() == null) {
            if ((view != null ? view.getLayoutParams() : null) != null) {
                setLayoutParams(view.getLayoutParams());
            }
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !p.f(layoutParams, getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof DivLayoutParams ? layoutParams : layoutParams == null ? new DivLayoutParams(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return DivGalleryItemLayoutKt.setBy(generateDefaultLayoutParams(), layoutParams);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View child = getChild();
        if (child != null) {
            child.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        View child = getChild();
        if (child != null) {
            child.measure(i10, i11);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
        } else {
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getSuggestedMinimumWidth() + getPaddingRight(), i10, 0), View.resolveSizeAndState(getPaddingTop() + getSuggestedMinimumHeight() + getPaddingBottom(), i11, 0));
        }
    }

    @Override // android.view.View
    public void setLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            DivGalleryItemLayoutKt.setBy(layoutParams, child.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        child.setLayoutParams(layoutParams);
    }
}
