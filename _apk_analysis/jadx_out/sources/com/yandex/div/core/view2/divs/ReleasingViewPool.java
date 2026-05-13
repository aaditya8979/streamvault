package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReleasingViewPool.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ReleasingViewPool extends RecyclerView.RecycledViewPool {

    @NotNull
    private final ReleaseViewVisitor releaseViewVisitor;

    @NotNull
    private final Set<RecyclerView.ViewHolder> viewsSet = new LinkedHashSet();

    public ReleasingViewPool(@NotNull ReleaseViewVisitor releaseViewVisitor) {
        this.releaseViewVisitor = releaseViewVisitor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void clear() {
        super.clear();
        Iterator<T> it = this.viewsSet.iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(this.releaseViewVisitor, ((RecyclerView.ViewHolder) it.next()).itemView);
        }
        this.viewsSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    @Nullable
    public RecyclerView.ViewHolder getRecycledView(int i10) {
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i10);
        if (recycledView == null) {
            return null;
        }
        this.viewsSet.remove(recycledView);
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(@Nullable RecyclerView.ViewHolder viewHolder) {
        super.putRecycledView(viewHolder);
        if (viewHolder != null) {
            this.viewsSet.add(viewHolder);
        }
    }
}
