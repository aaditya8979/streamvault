package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import vn.c;

/* JADX INFO: compiled from: WrapContentPageSizeItemDecoration.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class WrapContentPageSizeItemDecoration extends RecyclerView.ItemDecoration {

    @NotNull
    private final DivPager.ItemAlignment alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    /* JADX INFO: compiled from: WrapContentPageSizeItemDecoration.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivPager.ItemAlignment.values().length];
            try {
                iArr[DivPager.ItemAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivPager.ItemAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivPager.ItemAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WrapContentPageSizeItemDecoration(int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i10;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = itemAlignment;
    }

    private final int getBottomOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = (this.parentSize - this.paddings.getStart()) - view.getMeasuredHeight();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = this.paddings.getEnd();
        }
        return c.d(start);
    }

    private final int getHorizontalOffset(View view) {
        float start;
        int measuredWidth;
        float measuredWidth2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = this.parentSize - this.paddings.getStart();
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i10 == 2) {
                measuredWidth2 = (this.parentSize - view.getMeasuredWidth()) / 2.0f;
                return c.d(measuredWidth2);
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = this.parentSize - this.paddings.getEnd();
            measuredWidth = view.getMeasuredWidth();
        }
        measuredWidth2 = start - measuredWidth;
        return c.d(measuredWidth2);
    }

    private final int getTopOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = this.paddings.getStart();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = (this.parentSize - this.paddings.getEnd()) - view.getMeasuredHeight();
        }
        return c.d(start);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        View child;
        int width = recyclerView.getWidth();
        DivPagerPaddingsHolder divPagerPaddingsHolder = this.paddings;
        int iD = width - c.d(divPagerPaddingsHolder.getLeft() + divPagerPaddingsHolder.getRight());
        int height = recyclerView.getHeight();
        DivPagerPaddingsHolder divPagerPaddingsHolder2 = this.paddings;
        view.measure(ViewsKt.makeExactSpec(iD), ViewsKt.makeExactSpec(height - c.d(divPagerPaddingsHolder2.getTop() + divPagerPaddingsHolder2.getBottom())));
        DivPagerPageLayout divPagerPageLayout = view instanceof DivPagerPageLayout ? (DivPagerPageLayout) view : null;
        if (divPagerPageLayout == null || (child = divPagerPageLayout.getChild()) == null) {
            return;
        }
        Integer alignedLeft = this.paddings.getAlignedLeft();
        int iIntValue = alignedLeft != null ? alignedLeft.intValue() : getHorizontalOffset(child);
        Integer alignedTop = this.paddings.getAlignedTop();
        int iIntValue2 = alignedTop != null ? alignedTop.intValue() : getTopOffset(child);
        Integer alignedRight = this.paddings.getAlignedRight();
        int iIntValue3 = alignedRight != null ? alignedRight.intValue() : getHorizontalOffset(child);
        Integer alignedBottom = this.paddings.getAlignedBottom();
        rect.set(iIntValue, iIntValue2, iIntValue3, alignedBottom != null ? alignedBottom.intValue() : getBottomOffset(child));
    }
}
