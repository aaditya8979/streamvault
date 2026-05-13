package com.yandex.div.core.view2.divs.widgets;

import ah.e2;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ReleaseViewVisitor.kt */
/* JADX INFO: loaded from: classes4.dex */
public class ReleaseViewVisitor extends DivViewVisitor {

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController divExtensionController;

    @NotNull
    private final Div2View divView;

    public ReleaseViewVisitor(@NotNull Div2View div2View, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController) {
        this.divView = div2View;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.divExtensionController = divExtensionController;
    }

    private void releaseInternal(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        if (e2Var != null && expressionResolver != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, view, e2Var);
        }
        release$div_release(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void defaultVisit(@NotNull DivHolderView<?> divHolderView) {
        p.i(divHolderView, "null cannot be cast to non-null type android.view.View");
        View view = (View) divHolderView;
        Div div = divHolderView.getDiv();
        e2 e2VarB = div != null ? div.b() : null;
        BindingContext bindingContext = divHolderView.getBindingContext();
        releaseInternal(view, e2VarB, bindingContext != null ? bindingContext.getExpressionResolver() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting(otherwise = 2)
    public void release$div_release(@NotNull View view) {
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Iterable<Releasable> releasableList = ReleasablesKt.getReleasableList(view);
        if (releasableList != null) {
            Iterator<Releasable> it = releasableList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull View view) {
        release$div_release(view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivCustomWrapper divCustomWrapper) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        Div.c div = divCustomWrapper.getDiv();
        if (div == null || (bindingContext = divCustomWrapper.getBindingContext()) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return;
        }
        release$div_release(divCustomWrapper);
        View customView = divCustomWrapper.getCustomView();
        if (customView != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, customView, div.c());
            this.divCustomContainerViewAdapter.release(customView, div.c());
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivPagerView divPagerView) {
        super.visit(divPagerView);
        divPagerView.getViewPager().setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivRecyclerView divRecyclerView) {
        super.visit(divRecyclerView);
        divRecyclerView.setAdapter(null);
    }
}
