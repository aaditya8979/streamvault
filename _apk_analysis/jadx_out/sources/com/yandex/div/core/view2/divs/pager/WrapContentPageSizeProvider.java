package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WrapContentPageSizeProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;

    @NotNull
    private final RecyclerView recyclerView;

    public WrapContentPageSizeProvider(@NotNull RecyclerView recyclerView, boolean z10, int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        super(i10, divPagerPaddingsHolder, itemAlignment);
        this.recyclerView = recyclerView;
        this.isHorizontal = z10;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @Nullable
    public Float getItemSize(int i10) {
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i10)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? viewFindViewByPosition.getWidth() : viewFindViewByPosition.getHeight());
    }
}
