package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ViewPagerFixedSizeLayout.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;

    @Nullable
    private HeightCalculator heightCalculator;

    @Nullable
    private Integer lastHeightMeasureSpec;

    @Nullable
    private Rect visibleRect;

    /* JADX INFO: compiled from: ViewPagerFixedSizeLayout.kt */
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int i10, int i11);

        void setPositionAndOffsetForMeasure(int i10, float f10);

        boolean shouldRequestLayoutOnScroll(int i10, float f10);
    }

    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.animateOnScroll = true;
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i10, int i11, tn.i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    public final int getCollapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.lastHeightMeasureSpec = Integer.valueOf(i11);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            p.h(heightCalculator);
            i11 = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(i10, i11), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public final void setAnimateOnScroll(boolean z10) {
        this.animateOnScroll = z10;
    }

    public final void setCollapsiblePaddingBottom(int i10) {
        if (this._collapsiblePaddingBottom != i10) {
            this._collapsiblePaddingBottom = i10;
        }
    }

    public final void setHeightCalculator(@Nullable HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        HeightCalculator heightCalculator;
        if (!this.animateOnScroll || (heightCalculator = this.heightCalculator) == null || !heightCalculator.shouldRequestLayoutOnScroll(i10, f10)) {
            return false;
        }
        Rect rect = this.visibleRect;
        if (rect == null) {
            rect = new Rect();
            this.visibleRect = rect;
        }
        getLocalVisibleRect(rect);
        if (rect.height() == getHeight()) {
            return true;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        Integer num = this.lastHeightMeasureSpec;
        int iMeasureHeight = heightCalculator.measureHeight(iMakeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
        if (iMeasureHeight != getHeight()) {
            return iMeasureHeight <= rect.bottom && rect.top <= iMeasureHeight;
        }
        return false;
    }
}
