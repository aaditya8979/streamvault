package com.mgs.carparking.widgets.rv;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes8.dex */
public class StaggeredDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45653b;

    public StaggeredDividerItemDecoration(Context context, int i10) {
        this.f45652a = context;
        this.f45653b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        int spanIndex = layoutParams.getSpanIndex();
        if (layoutParams.isFullSpan()) {
            return;
        }
        if (spanIndex % 2 == 0) {
            rect.left = this.f45653b;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.right = this.f45653b;
        }
        rect.bottom = 0;
    }
}
