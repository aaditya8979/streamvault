package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import bn.r;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCustom;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: DivCustomBinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivCustomBinder extends DivViewBinder<Div.c, DivCustom, DivCustomWrapper> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final ym.a<DivBinder> divBinder;

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    public DivCustomBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull ym.a<DivBinder> aVar) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.divBinder = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bind(com.yandex.div.core.view2.divs.widgets.DivCustomWrapper r3, android.view.View r4, com.yandex.div2.DivCustom r5, com.yandex.div2.DivCustom r6, com.yandex.div.core.view2.BindingContext r7, sn.a<? extends android.view.View> r8, sn.l<? super android.view.View, bn.r> r9) {
        /*
            r2 = this;
            if (r4 == 0) goto L36
            com.yandex.div2.Div$c r0 = r3.getDiv()
            if (r0 == 0) goto L11
            com.yandex.div2.DivCustom r0 = r0.c()
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f55019j
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = r6.f55019j
            boolean r0 = tn.p.f(r0, r1)
            if (r0 == 0) goto L36
            r0 = 0
            if (r5 == 0) goto L32
            java.util.List r5 = com.yandex.div.internal.core.DivCollectionExtensionsKt.getNonNullItems(r5)
            if (r5 == 0) goto L32
            int r5 = r5.size()
            java.util.List r1 = com.yandex.div.internal.core.DivCollectionExtensionsKt.getNonNullItems(r6)
            int r1 = r1.size()
            if (r5 != r1) goto L32
            r0 = 1
        L32:
            if (r0 == 0) goto L36
            r5 = r4
            goto L41
        L36:
            java.lang.Object r5 = r8.invoke()
            android.view.View r5 = (android.view.View) r5
            int r8 = com.yandex.div.R$id.div_custom_tag
            r5.setTag(r8, r6)
        L41:
            com.yandex.div.core.view2.Div2View r8 = r7.getDivView()
            boolean r4 = tn.p.f(r4, r5)
            if (r4 != 0) goto L4e
            r2.replaceInParent(r3, r5, r8)
        L4e:
            r9.invoke(r5)
            com.yandex.div.core.view2.divs.DivBaseBinder r3 = r2.baseBinder
            java.lang.String r4 = r6.getId()
            r3.bindId$div_release(r8, r5, r4)
            com.yandex.div.core.extension.DivExtensionController r3 = r2.extensionController
            com.yandex.div.json.expressions.ExpressionResolver r4 = r7.getExpressionResolver()
            r3.bindView(r8, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivCustomBinder.bind(com.yandex.div.core.view2.divs.widgets.DivCustomWrapper, android.view.View, com.yandex.div2.DivCustom, com.yandex.div2.DivCustom, com.yandex.div.core.view2.BindingContext, sn.a, sn.l):void");
    }

    private final void replaceInParent(ViewGroup viewGroup, View view, Div2View div2View) {
        if (viewGroup.getChildCount() != 0) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), ViewGroupKt.get(viewGroup, 0));
            viewGroup.removeViewAt(0);
        }
        viewGroup.addView(view);
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull DivCustomWrapper divCustomWrapper, @NotNull Div.c cVar, @NotNull final DivStatePath divStatePath) {
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        View customView = divCustomWrapper.getCustomView();
        Div.c div = divCustomWrapper.getDiv();
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (div == cVar) {
            BaseDivViewExtensionsKt.bindStates(divCustomWrapper, bindingContext, this.divBinder.get());
            return;
        }
        if (customView != null && div != null && (bindingContext2 = divCustomWrapper.getBindingContext()) != null && (expressionResolver = bindingContext2.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div.b());
        }
        this.baseBinder.bindView(bindingContext, divCustomWrapper, cVar, div);
        this.baseBinder.bindId$div_release(divView, divCustomWrapper, null);
        final DivCustom divCustomC = cVar.c();
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(divCustomC.f55019j)) {
            bind(divCustomWrapper, customView, div != null ? div.c() : null, divCustomC, bindingContext, new sn.a<View>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final View invoke() {
                    return DivCustomBinder.this.divCustomContainerViewAdapter.createView(divCustomC, divView, expressionResolver2, divStatePath);
                }
            }, new l<View, r>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(View view) {
                    invoke2(view);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View view) {
                    DivCustomBinder.this.divCustomContainerViewAdapter.bindView(view, divCustomC, divView, expressionResolver2, divStatePath);
                }
            });
        }
    }
}
