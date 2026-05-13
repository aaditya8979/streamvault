package com.yalantis.ucrop.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53808c;

    public GridSpacingItemDecoration(int i10, int i11, boolean z10) {
        this.f53806a = i10;
        this.f53807b = i11;
        this.f53808c = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f53806a;
        int i11 = childAdapterPosition % i10;
        if (this.f53808c) {
            int i12 = this.f53807b;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f53807b;
            rect.left = (i11 * i13) / i10;
            rect.right = i13 - (((i11 + 1) * i13) / i10);
        }
        if (childAdapterPosition < i10) {
            rect.top = this.f53807b;
        }
        rect.bottom = this.f53807b;
    }
}
