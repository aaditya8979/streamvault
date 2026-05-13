package me.goldze.mvvmhabit.binding.viewadapter.recyclerview;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class DividerLine extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f74162e = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f74163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f74164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LineDrawMode f74166d;

    public enum LineDrawMode {
        HORIZONTAL,
        VERTICAL,
        BOTH
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74168a;

        static {
            int[] iArr = new int[LineDrawMode.values().length];
            f74168a = iArr;
            try {
                iArr[LineDrawMode.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74168a[LineDrawMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74168a[LineDrawMode.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            this.f74163a.setBounds(left, bottom, childAt.getRight() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (d() == 0 ? a(this.f74164b, 1.0f) : d()) + bottom);
            this.f74163a.draw(canvas);
        }
    }

    public final void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            this.f74163a.setBounds(right, top2, (d() == 0 ? a(this.f74164b, 1.0f) : d()) + right, bottom);
            this.f74163a.draw(canvas);
        }
    }

    public int d() {
        return this.f74165c;
    }

    public LineDrawMode e() {
        return this.f74166d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        if (e() == null) {
            throw new IllegalStateException("assign LineDrawMode,please!");
        }
        int i10 = a.f74168a[e().ordinal()];
        if (i10 == 1) {
            c(canvas, recyclerView, state);
            return;
        }
        if (i10 == 2) {
            b(canvas, recyclerView, state);
        } else {
            if (i10 != 3) {
                return;
            }
            b(canvas, recyclerView, state);
            c(canvas, recyclerView, state);
        }
    }
}
