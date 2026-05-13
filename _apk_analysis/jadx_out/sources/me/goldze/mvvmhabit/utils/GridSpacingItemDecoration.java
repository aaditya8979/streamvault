package me.goldze.mvvmhabit.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74198e;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f74196c;
        int i11 = (childAdapterPosition - i10) % this.f74194a;
        if (this.f74198e) {
            if (childAdapterPosition <= i10 - 1 || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - this.f74197d) {
                return;
            }
            int i12 = this.f74195b;
            int i13 = this.f74194a;
            rect.left = i12 - ((i11 * i12) / i13);
            rect.right = ((i11 + 1) * i12) / i13;
            if (childAdapterPosition < i13) {
                rect.top = i12;
            }
            rect.bottom = i12;
            return;
        }
        if (childAdapterPosition > i10 - 1 && childAdapterPosition < recyclerView.getAdapter().getItemCount() - this.f74197d) {
            int i14 = this.f74195b;
            int i15 = this.f74194a;
            rect.left = (i11 * i14) / i15;
            rect.right = i14 - (((i11 + 1) * i14) / i15);
            if (childAdapterPosition - this.f74196c >= i15) {
                rect.top = i14;
            }
        }
        if (this.f74197d <= 0 || childAdapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            return;
        }
        rect.bottom = this.f74195b;
    }
}
