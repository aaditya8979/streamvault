package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.R$dimen;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBorder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivFocusBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
public class DivFocusBinder {

    @NotNull
    private final DivActionBinder actionBinder;

    /* JADX INFO: compiled from: DivFocusBinder.kt */
    public final class FocusChangeListener implements View.OnFocusChangeListener {

        @Nullable
        private List<DivAction> blurActions;

        @Nullable
        private DivBorder blurredBorder;

        @NotNull
        private final BindingContext context;

        @Nullable
        private List<DivAction> focusActions;

        @Nullable
        private DivBorder focusedBorder;

        public FocusChangeListener(@NotNull BindingContext bindingContext) {
            this.context = bindingContext;
        }

        private final void applyBorder(View view, DivBorder divBorder) {
            DivFocusBinder.this.applyBorder(view, this.context, divBorder);
        }

        private final void handle(List<DivAction> list, View view, String str) {
            DivFocusBinder.this.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }

        @Nullable
        public final List<DivAction> getBlurActions() {
            return this.blurActions;
        }

        @Nullable
        public final DivBorder getBlurredBorder() {
            return this.blurredBorder;
        }

        @Nullable
        public final List<DivAction> getFocusActions() {
            return this.focusActions;
        }

        @Nullable
        public final DivBorder getFocusedBorder() {
            return this.focusedBorder;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(@NotNull View view, boolean z10) {
            if (z10) {
                applyBorder(view, this.focusedBorder);
                List<DivAction> list = this.focusActions;
                if (list != null) {
                    handle(list, view, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(view, this.blurredBorder);
            }
            List<DivAction> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, view, "blur");
            }
        }

        public final void setActions(@Nullable List<DivAction> list, @Nullable List<DivAction> list2) {
            this.focusActions = list;
            this.blurActions = list2;
        }

        public final void setBorders(@Nullable DivBorder divBorder, @Nullable DivBorder divBorder2) {
            this.focusedBorder = divBorder;
            this.blurredBorder = divBorder2;
        }
    }

    public DivFocusBinder(@NotNull DivActionBinder divActionBinder) {
        this.actionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, DivBorder divBorder) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, divBorder, view);
            return;
        }
        float dimension = 0.0f;
        if (divBorder != null && !isConstantlyEmpty(divBorder) && divBorder.f54684c.evaluate(bindingContext.getExpressionResolver()).booleanValue() && divBorder.f54685d == null) {
            dimension = view.getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
    }

    private boolean isConstantlyEmpty(DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return divBorder.f54682a == null && divBorder.f54683b == null && p.f(divBorder.f54684c, Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null)) && divBorder.f54685d == null && divBorder.f54686e == null;
    }

    public void bindDivBorder(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @Nullable DivBorder divBorder2) {
        applyBorder(view, bindingContext, (divBorder == null || isConstantlyEmpty(divBorder) || !view.isFocused()) ? divBorder2 : divBorder);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && isConstantlyEmpty(divBorder)) {
            return;
        }
        boolean z10 = true;
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && isConstantlyEmpty(divBorder)) {
            z10 = false;
        }
        if (!z10) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        focusChangeListener2.setBorders(divBorder, divBorder2);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    public void bindDivFocusActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable List<DivAction> list, @Nullable List<DivAction> list2) {
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        boolean z10 = true;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            return;
        }
        if (focusChangeListener != null) {
            z10 = (focusChangeListener.getFocusedBorder() == null && CollectionsKt.allIsNullOrEmpty(list, list2)) ? false : true;
        }
        if (!z10) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(list, list2);
        view.setOnFocusChangeListener(focusChangeListener2);
    }
}
