package com.yandex.div.core.view2.divs;

import ah.e2;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import cn.f0;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivCollectionAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivCollectionAdapter<VH extends DivCollectionViewHolder> extends VisibilityAwareAdapter<VH> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private List<String> ids;

    @NotNull
    private final DivStatePath path;

    /* JADX INFO: compiled from: DivCollectionAdapter.kt */
    public static final class DiffUtilCallback extends DiffUtil.Callback {

        @NotNull
        private final List<DivItemBuilderResult> newItems;

        @NotNull
        private final List<DivItemBuilderResult> oldItems;

        public DiffUtilCallback(@NotNull List<DivItemBuilderResult> list, @NotNull List<DivItemBuilderResult> list2) {
            this.oldItems = list;
            this.newItems = list2;
        }

        private final boolean areContentsTheSame(DivItemBuilderResult divItemBuilderResult, DivItemBuilderResult divItemBuilderResult2) {
            if (divItemBuilderResult == null || divItemBuilderResult2 == null) {
                return p.f(divItemBuilderResult, divItemBuilderResult2);
            }
            suppressMissingVariableException(divItemBuilderResult, true);
            suppressMissingVariableException(divItemBuilderResult2, true);
            boolean zA = divItemBuilderResult.getDiv().a(divItemBuilderResult2.getDiv(), divItemBuilderResult.getExpressionResolver(), divItemBuilderResult2.getExpressionResolver());
            suppressMissingVariableException(divItemBuilderResult, false);
            suppressMissingVariableException(divItemBuilderResult2, false);
            return zA;
        }

        private final void suppressMissingVariableException(DivItemBuilderResult divItemBuilderResult, boolean z10) {
            ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            if (asImpl == null) {
                return;
            }
            asImpl.setSuppressMissingVariableException(z10);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            return areContentsTheSame((DivItemBuilderResult) f0.w0(this.oldItems, i10), (DivItemBuilderResult) f0.w0(this.newItems, i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Div div;
            e2 e2VarB;
            Expression<String> expressionF;
            Div div2;
            e2 e2VarB2;
            Expression<String> expressionF2;
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) f0.w0(this.oldItems, i10);
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) f0.w0(this.newItems, i11);
            String strEvaluate = null;
            String strEvaluate2 = (divItemBuilderResult == null || (div2 = divItemBuilderResult.getDiv()) == null || (e2VarB2 = div2.b()) == null || (expressionF2 = e2VarB2.f()) == null) ? null : expressionF2.evaluate(divItemBuilderResult.getExpressionResolver());
            if (divItemBuilderResult2 != null && (div = divItemBuilderResult2.getDiv()) != null && (e2VarB = div.b()) != null && (expressionF = e2VarB.f()) != null) {
                strEvaluate = expressionF.evaluate(divItemBuilderResult2.getExpressionResolver());
            }
            return (strEvaluate2 == null && strEvaluate == null) ? areContentsTheSame(divItemBuilderResult, divItemBuilderResult2) : p.f(strEvaluate2, strEvaluate);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldItems.size();
        }
    }

    /* JADX INFO: compiled from: DivCollectionAdapter.kt */
    public final class UpdateCallBack implements ListUpdateCallback {

        @NotNull
        private final List<DivItemBuilderResult> newItems;

        public UpdateCallBack(@NotNull List<DivItemBuilderResult> list) {
            this.newItems = list;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i10, int i11, @Nullable Object obj) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i10, int i11) {
            int size = i10 + i11 > this.newItems.size() ? this.newItems.size() - i11 : i10;
            DivCollectionAdapter.this.addItems(i10, this.newItems.subList(size, i11 + size));
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i10, int i11) {
            onRemoved(i10, 1);
            onInserted(i11, 1);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                DivCollectionAdapter.this.removeItem(i10);
            }
        }
    }

    public DivCollectionAdapter(@NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @NotNull List<DivItemBuilderResult> list) {
        super(list);
        this.bindingContext = bindingContext;
        this.path = divStatePath;
        this.ids = DivPathUtils.INSTANCE.getItemIds(list);
    }

    private final void updateIds() {
        this.ids = DivPathUtils.INSTANCE.getItemIds(getItems());
    }

    public final boolean applyPatch(@Nullable RecyclerView recyclerView, @NotNull DivPatchCache divPatchCache, @NotNull BindingContext bindingContext) {
        DivPatchMap patch = divPatchCache.getPatch(bindingContext.getDivView().getDataTag());
        if (patch == null) {
            return false;
        }
        DivPatchApply divPatchApply = new DivPatchApply(patch);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = 0;
        while (size < getItems().size()) {
            String id2 = getItems().get(size).getDiv().b().getId();
            List<Div> patchDivListById = id2 != null ? divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), id2) : null;
            if (patchDivListById != null) {
                removeItem(size);
                addItems(size, DivCollectionExtensionsKt.toDivItemBuilderResult(patchDivListById, bindingContext.getExpressionResolver()));
                size += patchDivListById.size() - 1;
                linkedHashSet.add(id2);
            }
            size++;
        }
        Set<String> setKeySet = patch.getPatches().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashSet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            int size2 = getItems().size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Div divPatchDivChild = divPatchApply.patchDivChild(recyclerView != null ? recyclerView : bindingContext.getDivView(), getItems().get(i10).getDiv(), str, bindingContext.getExpressionResolver());
                    if (divPatchDivChild != null) {
                        VisibilityAwareAdapter.setItem$default(this, i10, new DivItemBuilderResult(divPatchDivChild, bindingContext.getExpressionResolver()), null, 4, null);
                        break;
                    }
                    i10++;
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return false;
        }
        updateIds();
        subscribeOnElements();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) f0.w0(getVisibleItems(), i10);
        if (divItemBuilderResult == null) {
            return 0;
        }
        Expression<String> expressionF = divItemBuilderResult.getDiv().b().f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(divItemBuilderResult.getExpressionResolver()) : null;
        if (strEvaluate != null) {
            return strEvaluate.hashCode();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VH vh2, int i10) {
        ExpressionResolver expressionResolver;
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i10);
        DivStatePath divStatePathAppendDiv = this.path.appendDiv(this.ids.get(getItems().indexOf(divItemBuilderResult)));
        ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = this.bindingContext.getDivView().getRuntimeStore$div_release().resolveRuntimeWith(this.bindingContext.getDivView(), divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), this.bindingContext.getExpressionResolver());
        if (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) {
            expressionResolver = divItemBuilderResult.getExpressionResolver();
        }
        vh2.bind(this.bindingContext.getFor(expressionResolver), divItemBuilderResult.getDiv(), i10, divStatePathAppendDiv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull VH vh2) {
        super.onViewAttachedToWindow(vh2);
        vh2.updateState();
    }

    public void setItems(@NotNull List<DivItemBuilderResult> list) {
        DiffUtilCallback diffUtilCallback = new DiffUtilCallback(getItems(), list);
        DiffUtil.calculateDiff(diffUtilCallback).dispatchUpdatesTo(new UpdateCallBack(list));
        updateIds();
        subscribeOnElements();
    }
}
