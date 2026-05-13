package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ra.x;
import ra.y;
import ra.z;

/* JADX INFO: loaded from: classes6.dex */
public class RecyclerPreloadView extends RecyclerView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f35249j = RecyclerPreloadView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f35255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f35256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f35257i;

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35250b = false;
        this.f35251c = false;
        this.f35254f = 1;
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35250b = false;
        this.f35251c = false;
        this.f35254f = 1;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f35252d = gridLayoutManager.findFirstVisibleItemPosition();
            this.f35253e = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f35252d = linearLayoutManager.findFirstVisibleItemPosition();
            this.f35253e = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public boolean a() {
        return this.f35251c;
    }

    public int getFirstVisiblePosition() {
        return this.f35252d;
    }

    public int getLastVisiblePosition() {
        return this.f35253e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        z zVar;
        super.onScrollStateChanged(i10);
        if (i10 == 0 || i10 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        y yVar = this.f35257i;
        if (yVar != null) {
            yVar.a(i10);
        }
        if (i10 != 0 || (zVar = this.f35256h) == null) {
            return;
        }
        zVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(int r6, int r7) {
        /*
            r5 = this;
            super.onScrolled(r6, r7)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.getLayoutManager()
            if (r0 == 0) goto L7b
            r5.setLayoutManagerPosition(r0)
            ra.x r1 = r5.f35255g
            if (r1 == 0) goto L5c
            boolean r1 = r5.f35251c
            if (r1 == 0) goto L5c
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r5.getAdapter()
            if (r1 == 0) goto L54
            boolean r2 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r1 = r1.getItemCount()
            int r2 = r0.getSpanCount()
            int r1 = r1 / r2
            int r2 = r0.findLastVisibleItemPosition()
            int r0 = r0.getSpanCount()
            int r2 = r2 / r0
            int r0 = r5.f35254f
            int r1 = r1 - r0
            if (r2 < r1) goto L3b
            r0 = r3
            goto L3c
        L3b:
            r0 = r4
        L3c:
            if (r0 != 0) goto L41
            r5.f35250b = r4
            goto L5c
        L41:
            boolean r0 = r5.f35250b
            if (r0 != 0) goto L4f
            ra.x r0 = r5.f35255g
            r0.a()
            if (r7 <= 0) goto L5c
            r5.f35250b = r3
            goto L5c
        L4f:
            if (r7 != 0) goto L5c
            r5.f35250b = r4
            goto L5c
        L54:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Adapter is null,Please check it!"
            r6.<init>(r7)
            throw r6
        L5c:
            ra.y r0 = r5.f35257i
            if (r0 == 0) goto L63
            r0.b(r6, r7)
        L63:
            ra.z r6 = r5.f35256h
            if (r6 == 0) goto L7a
            int r6 = java.lang.Math.abs(r7)
            r7 = 150(0x96, float:2.1E-43)
            if (r6 >= r7) goto L75
            ra.z r6 = r5.f35256h
            r6.a()
            goto L7a
        L75:
            ra.z r6 = r5.f35256h
            r6.b()
        L7a:
            return
        L7b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "LayoutManager is null,Please check it!"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.RecyclerPreloadView.onScrolled(int, int):void");
    }

    public void setEnabledLoadMore(boolean z10) {
        this.f35251c = z10;
    }

    public void setLastVisiblePosition(int i10) {
        this.f35253e = i10;
    }

    public void setOnRecyclerViewPreloadListener(x xVar) {
        this.f35255g = xVar;
    }

    public void setOnRecyclerViewScrollListener(y yVar) {
        this.f35257i = yVar;
    }

    public void setOnRecyclerViewScrollStateListener(z zVar) {
        this.f35256h = zVar;
    }

    public void setReachBottomRow(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f35254f = i10;
    }
}
