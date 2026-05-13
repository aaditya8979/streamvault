package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UpdateStateScrollListener.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class UpdateStateScrollListener extends RecyclerView.OnScrollListener {

    @NotNull
    private final String blockId;

    @NotNull
    private final DivViewState divViewState;

    @NotNull
    private final DivGalleryItemHelper layoutManager;

    public UpdateStateScrollListener(@NotNull String str, @NotNull DivViewState divViewState, @NotNull DivGalleryItemHelper divGalleryItemHelper) {
        this.blockId = str;
        this.divViewState = divViewState;
        this.layoutManager = divGalleryItemHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int i10, int i11) {
        View view;
        super.onScrolled(recyclerView, i10, i11);
        int iFirstVisibleItemPosition = this.layoutManager.firstVisibleItemPosition();
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFirstVisibleItemPosition);
        this.divViewState.putBlockState(this.blockId, new GalleryState(iFirstVisibleItemPosition, (viewHolderFindViewHolderForLayoutPosition == null || (view = viewHolderFindViewHolderForLayoutPosition.itemView) == null) ? 0 : this.layoutManager.calcScrollOffset(view)));
    }
}
