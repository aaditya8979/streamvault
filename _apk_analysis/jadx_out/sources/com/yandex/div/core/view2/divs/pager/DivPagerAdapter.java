package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import cn.d;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivPager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.i;

/* JADX INFO: compiled from: DivPagerAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private DivPager.ItemAlignment crossAxisAlignment;

    @NotNull
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;

    @NotNull
    private final d<DivItemBuilderResult> itemsToShow;
    private int orientation;

    @NotNull
    private final SparseArray<Float> pageTranslations;

    @NotNull
    private final DivPagerView pagerView;
    private int removedItems;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: DivPagerAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivPagerAdapter(@NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull SparseArray<Float> sparseArray, @NotNull DivViewCreator divViewCreator, @NotNull DivStatePath divStatePath, @NotNull DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new d<DivItemBuilderResult>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // cn.b, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // cn.d, java.util.List
            @NotNull
            public DivItemBuilderResult get(int i10) {
                return !this.this$0.getInfiniteScrollEnabled() ? this.this$0.getVisibleItems().get(i10) : this.this$0.getVisibleItems().get(this.this$0.realItemPosition(i10));
            }

            @Override // cn.d, cn.b
            public int getSize() {
                return this.this$0.getVisibleItems().size() + (this.this$0.getInfiniteScrollEnabled() ? 4 : 0);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            @Override // cn.d, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // cn.d, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = DivPager.ItemAlignment.START;
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    private final void notifyVirtualItemsChanged(int i10) {
        if (i10 >= 0 && i10 < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + i10, 2 - i10);
            return;
        }
        if (i10 < getVisibleItems().size() && getVisibleItems().size() - 2 <= i10) {
            notifyItemRangeChanged((i10 - getVisibleItems().size()) + 2, 2);
        }
    }

    @NotNull
    public final DivPager.ItemAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    @NotNull
    public final d<DivItemBuilderResult> getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition(int i10) {
        return i10 + getOffsetToRealItem();
    }

    public final int getRealPosition(int i10) {
        return i10 - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemChanged(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemChanged(i10);
        } else {
            notifyItemChanged(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemInserted(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(i10);
        } else {
            notifyItemInserted(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemRemoved(int i10) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(i10);
        } else {
            notifyItemRemoved(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(@NotNull DivPagerViewHolder divPagerViewHolder, int i10) {
        super.onBindViewHolder(divPagerViewHolder, realItemPosition(i10));
        Float f10 = this.pageTranslations.get(i10);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (isHorizontal()) {
                divPagerViewHolder.itemView.setTranslationX(fFloatValue);
            } else {
                divPagerViewHolder.itemView.setTranslationY(fFloatValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DivPagerViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext$div_release(), new a<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isHorizontal());
            }
        }), this.divBinder, this.viewCreator, new a<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(DivPagerAdapter.this.isHorizontal());
            }
        }, new a<DivPager.ItemAlignment>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final DivPager.ItemAlignment invoke() {
                return DivPagerAdapter.this.getCrossAxisAlignment();
            }
        });
    }

    public final int realItemPosition(int i10) {
        Integer numValueOf = Integer.valueOf(getVisibleItems().size());
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0;
        }
        int iIntValue = numValueOf.intValue();
        return (getRealPosition(i10) + iIntValue) % iIntValue;
    }

    public final void setCrossAxisAlignment(@NotNull DivPager.ItemAlignment itemAlignment) {
        this.crossAxisAlignment = itemAlignment;
    }

    public final void setInfiniteScrollEnabled(boolean z10) {
        if (this.infiniteScrollEnabled == z10) {
            return;
        }
        this.infiniteScrollEnabled = z10;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z10 ? 2 : -2));
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(@NotNull List<DivItemBuilderResult> list) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(list);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }

    public final void setOrientation(int i10) {
        this.orientation = i10;
    }
}
