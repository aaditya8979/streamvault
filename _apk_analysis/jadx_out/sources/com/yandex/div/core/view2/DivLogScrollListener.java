package com.yandex.div.core.view2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivLogScrollListener.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivLogScrollListener extends RecyclerView.OnScrollListener {
    private final boolean isVertical;

    @NotNull
    private final LinearLayoutManager layoutManager;

    @NotNull
    private final OnViewHolderVisibleListener listener;
    private final int scrollGap;
    private int totalScroll;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int i10, int i11) {
        super.onScrolled(recyclerView, i10, i11);
        int i12 = this.totalScroll;
        if (this.isVertical) {
            i10 = i11;
        }
        this.totalScroll = i12 + Math.abs(i10);
        if (this.totalScroll > (this.isVertical ? this.layoutManager.getHeight() : this.layoutManager.getWidth()) / this.scrollGap) {
            this.totalScroll = 0;
            int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                this.listener.onViewHolderVisible(iFindFirstVisibleItemPosition);
            }
        }
    }
}
