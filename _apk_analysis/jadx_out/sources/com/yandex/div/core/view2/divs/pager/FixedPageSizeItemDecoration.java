package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import vn.c;

/* JADX INFO: compiled from: FixedPageSizeItemDecoration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FixedPageSizeItemDecoration extends RecyclerView.ItemDecoration {
    private final int offsetBottom;
    private final int offsetLeft;
    private final int offsetRight;
    private final int offsetTop;

    @NotNull
    private final FixedPageSizeProvider sizeProvider;

    public FixedPageSizeItemDecoration(@NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull FixedPageSizeProvider fixedPageSizeProvider) {
        this.sizeProvider = fixedPageSizeProvider;
        this.offsetLeft = toOffset(divPagerPaddingsHolder.getAlignedLeft());
        this.offsetTop = toOffset(divPagerPaddingsHolder.getAlignedTop());
        this.offsetRight = toOffset(divPagerPaddingsHolder.getAlignedRight());
        this.offsetBottom = toOffset(divPagerPaddingsHolder.getAlignedBottom());
    }

    private final int toOffset(Integer num) {
        return num != null ? num.intValue() : c.d(this.sizeProvider.getNeighbourSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        rect.set(this.offsetLeft, this.offsetTop, this.offsetRight, this.offsetBottom);
    }
}
