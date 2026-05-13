package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivGalleryAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivGalleryAdapter extends DivCollectionAdapter<DivGalleryViewHolder> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final WeakHashMap<DivItemBuilderResult, Long> internalIds;
    private long lastItemId;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivGalleryAdapter(@NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator, @NotNull DivStatePath divStatePath) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
        this.internalIds = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i10);
        Long l10 = this.internalIds.get(divItemBuilderResult);
        if (l10 != null) {
            return l10.longValue();
        }
        long j10 = this.lastItemId;
        this.lastItemId = 1 + j10;
        this.internalIds.put(divItemBuilderResult, Long.valueOf(j10));
        return j10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DivGalleryViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        return new DivGalleryViewHolder(this.bindingContext, new DivGalleryItemLayout(this.bindingContext.getDivView().getContext$div_release()), this.divBinder, this.viewCreator);
    }
}
