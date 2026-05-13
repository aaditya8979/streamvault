package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivCollectionViewHolder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivCollectionViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final DivBinder divBinder;

    @Nullable
    private Div oldDiv;

    @NotNull
    private final BindingContext parentContext;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final DivViewWrapper viewWrapper;

    public DivCollectionViewHolder(@NotNull DivViewWrapper divViewWrapper, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper);
        this.viewWrapper = divViewWrapper;
        this.parentContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
    }

    private final View createChildView(BindingContext bindingContext, Div div) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        return this.viewCreator.create(div, bindingContext.getExpressionResolver());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(@org.jetbrains.annotations.NotNull com.yandex.div.core.view2.BindingContext r17, @org.jetbrains.annotations.NotNull com.yandex.div2.Div r18, int r19, @org.jetbrains.annotations.NotNull com.yandex.div.core.state.DivStatePath r20) {
        /*
            r16 = this;
            r0 = r16
            r9 = r18
            com.yandex.div.core.view2.Div2View r10 = r17.getDivView()
            com.yandex.div.json.expressions.ExpressionResolver r11 = r17.getExpressionResolver()
            com.yandex.div.core.widget.DivViewWrapper r1 = r0.viewWrapper
            boolean r1 = com.yandex.div.core.view2.reuse.util.RebindUtilsKt.tryRebindRecycleContainerChildren(r1, r10, r9)
            if (r1 == 0) goto L17
            r0.oldDiv = r9
            return
        L17:
            com.yandex.div.core.widget.DivViewWrapper r1 = r0.viewWrapper
            android.view.View r1 = r1.getChild()
            if (r1 == 0) goto L60
            com.yandex.div2.Div r2 = r0.oldDiv
            r12 = 1
            r13 = 0
            if (r2 == 0) goto L27
            r2 = r12
            goto L28
        L27:
            r2 = r13
        L28:
            r14 = 0
            if (r2 == 0) goto L2d
            r15 = r1
            goto L2e
        L2d:
            r15 = r14
        L2e:
            if (r15 == 0) goto L60
            boolean r1 = r15 instanceof com.yandex.div.core.view2.divs.widgets.DivHolderView
            if (r1 == 0) goto L38
            r1 = r15
            com.yandex.div.core.view2.divs.widgets.DivHolderView r1 = (com.yandex.div.core.view2.divs.widgets.DivHolderView) r1
            goto L39
        L38:
            r1 = r14
        L39:
            if (r1 == 0) goto L59
            com.yandex.div.core.view2.BindingContext r1 = r1.getBindingContext()
            if (r1 == 0) goto L59
            com.yandex.div.json.expressions.ExpressionResolver r4 = r1.getExpressionResolver()
            if (r4 == 0) goto L59
            com.yandex.div.core.view2.animations.DivComparator r1 = com.yandex.div.core.view2.animations.DivComparator.INSTANCE
            com.yandex.div2.Div r2 = r0.oldDiv
            r6 = 0
            r7 = 16
            r8 = 0
            r3 = r18
            r5 = r11
            boolean r1 = com.yandex.div.core.view2.animations.DivComparator.areDivsReplaceable$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r12) goto L59
            goto L5a
        L59:
            r12 = r13
        L5a:
            if (r12 == 0) goto L5d
            r14 = r15
        L5d:
            if (r14 == 0) goto L60
            goto L69
        L60:
            android.view.View r14 = r16.createChildView(r17, r18)
            com.yandex.div.core.widget.DivViewWrapper r1 = r0.viewWrapper
            r1.addView(r14)
        L69:
            r0.oldDiv = r9
            com.yandex.div.core.expression.local.RuntimeStore r1 = r10.getRuntimeStore$div_release()
            com.yandex.div.core.view2.BindingContext r2 = r0.parentContext
            com.yandex.div.json.expressions.ExpressionResolver r6 = r2.getExpressionResolver()
            r2 = r10
            r3 = r20
            r4 = r18
            r5 = r11
            r1.resolveRuntimeWith(r2, r3, r4, r5, r6)
            com.yandex.div.core.view2.DivBinder r1 = r0.divBinder
            r2 = r17
            r1.bind(r2, r14, r9, r3)
            r0.updateWrapperLayoutParams(r14)
            com.yandex.div.core.expression.local.RuntimeStore r1 = r10.getRuntimeStore$div_release()
            ah.e2 r2 = r18.b()
            r1.showWarningIfNeeded(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivCollectionViewHolder.bind(com.yandex.div.core.view2.BindingContext, com.yandex.div2.Div, int, com.yandex.div.core.state.DivStatePath):void");
    }

    @Nullable
    public final Div getOldDiv() {
        return this.oldDiv;
    }

    public abstract void logReuseError();

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }

    public void updateWrapperLayoutParams(@NotNull View view) {
    }
}
