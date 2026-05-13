package com.yandex.div.core.view2.divs;

import ah.e2;
import android.view.View;
import android.view.ViewGroup;
import bn.r;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: DivLayoutParamsBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivLayoutParamsBinder {

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivLayoutParamsBinder(@NotNull ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    private final boolean applyHeight(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(e2Var.getHeight(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().height == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().height = layoutParamsSize;
        return true;
    }

    private final boolean applyHeightConstraints(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        DivSizeUnitValue minSize = getMinSize(e2Var.getHeight());
        boolean z10 = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        DivSizeUnitValue maxSize = getMaxSize(e2Var.getHeight());
        int i10 = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumHeight() != px) {
            view.setMinimumHeight(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && divLayoutParams.getMaxHeight() != i10) {
            divLayoutParams.setMaxHeight(i10);
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeightProperties(View view, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(e2Var.getHeight(), "height", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        if (applyHeightConstraints(view, e2Var, expressionResolver) || (applyVerticalWeightValue(view, e2Var, expressionResolver) || applyHeight(view, e2Var, expressionResolver))) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        }
    }

    private final boolean applyHorizontalWeightValue(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(e2Var.getWidth(), expressionResolver);
        if (divLayoutParams.getHorizontalWeight() == weight) {
            return false;
        }
        divLayoutParams.setHorizontalWeight(weight);
        return true;
    }

    private final boolean applyVerticalWeightValue(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(e2Var.getHeight(), expressionResolver);
        if (divLayoutParams.getVerticalWeight() == weight) {
            return false;
        }
        divLayoutParams.setVerticalWeight(weight);
        return true;
    }

    private final boolean applyWidth(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(e2Var.getWidth(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().width == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().width = layoutParamsSize;
        return true;
    }

    private final boolean applyWidthConstraints(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        DivSizeUnitValue minSize = getMinSize(e2Var.getWidth());
        boolean z10 = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        DivSizeUnitValue maxSize = getMaxSize(e2Var.getWidth());
        int i10 = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumWidth() != px) {
            view.setMinimumWidth(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && divLayoutParams.getMaxWidth() != i10) {
            divLayoutParams.setMaxWidth(i10);
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyWidthProperties(View view, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(e2Var.getWidth(), "width", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        if (applyWidthConstraints(view, e2Var, expressionResolver) || (applyHorizontalWeightValue(view, e2Var, expressionResolver) || applyWidth(view, e2Var, expressionResolver))) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        }
    }

    private final void bindHeight(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(e2Var.getHeight(), e2Var2 != null ? e2Var2.getHeight() : null)) {
            checkConstraints(e2Var.getHeight(), "height", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyHeightProperties(view, e2Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(e2Var.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, e2Var.getHeight(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivLayoutParamsBinder.this.applyHeightProperties(view, e2Var, expressionResolver, errorCollector);
            }
        });
    }

    private final void bindLayoutParams(View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, ErrorCollector errorCollector) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        bindWidth(view, e2Var, e2Var2, expressionResolver, expressionSubscriber, errorCollector);
        bindHeight(view, e2Var, e2Var2, expressionResolver, expressionSubscriber, errorCollector);
    }

    private final void bindWidth(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(e2Var.getWidth(), e2Var2 != null ? e2Var2.getWidth() : null)) {
            checkConstraints(e2Var.getWidth(), "width", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyWidthProperties(view, e2Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(e2Var.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, e2Var.getWidth(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivLayoutParamsBinder.this.applyWidthProperties(view, e2Var, expressionResolver, errorCollector);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkConstraints(com.yandex.div2.DivSize r5, java.lang.String r6, java.lang.String r7, android.util.DisplayMetrics r8, com.yandex.div.json.expressions.ExpressionResolver r9, com.yandex.div.core.view2.errors.ErrorCollector r10) {
        /*
            r4 = this;
            com.yandex.div2.DivSizeUnitValue r0 = r4.getMinSize(r5)
            if (r0 != 0) goto L7
            return
        L7:
            com.yandex.div2.DivSizeUnitValue r5 = r4.getMaxSize(r5)
            if (r5 != 0) goto Le
            return
        Le:
            int r1 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.toPx(r0, r8, r9)
            int r8 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.toPx(r5, r8, r9)
            if (r1 > r8) goto L19
            return
        L19:
            java.lang.String r8 = "format(...)"
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L32
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r7
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r3 = "Id: '%s', "
            java.lang.String r7 = java.lang.String.format(r3, r7)
            tn.p.j(r7, r8)
            if (r7 != 0) goto L34
        L32:
            java.lang.String r7 = ""
        L34:
            java.lang.String r0 = r4.toString(r0, r9)
            java.lang.String r5 = r4.toString(r5, r9)
            r9 = 4
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r1] = r6
            r3[r2] = r7
            r6 = 2
            r3[r6] = r0
            r6 = 3
            r3[r6] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r3, r9)
            java.lang.String r6 = "Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s."
            java.lang.String r5 = java.lang.String.format(r6, r5)
            tn.p.j(r5, r8)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>(r5)
            r10.logError(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.checkConstraints(com.yandex.div2.DivSize, java.lang.String, java.lang.String, android.util.DisplayMetrics, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    private final DivSizeUnitValue getMaxSize(DivSize divSize) {
        if (divSize instanceof DivSize.d) {
            return ((DivSize.d) divSize).c().f58271b;
        }
        if (divSize instanceof DivSize.c) {
            return ((DivSize.c) divSize).c().f56204a;
        }
        return null;
    }

    private final DivSizeUnitValue getMinSize(DivSize divSize) {
        if (divSize instanceof DivSize.d) {
            return ((DivSize.d) divSize).c().f58272c;
        }
        if (divSize instanceof DivSize.c) {
            return ((DivSize.c) divSize).c().f56205b;
        }
        return null;
    }

    private final float getWeight(DivSize divSize, ExpressionResolver expressionResolver) {
        DivMatchParentSize divMatchParentSizeC;
        Expression<Double> expression;
        DivSize.c cVar = divSize instanceof DivSize.c ? (DivSize.c) divSize : null;
        if (cVar == null || (divMatchParentSizeC = cVar.c()) == null || (expression = divMatchParentSizeC.f56206c) == null) {
            return 0.0f;
        }
        return (float) expression.evaluate(expressionResolver).doubleValue();
    }

    private final String toString(DivSizeUnitValue divSizeUnitValue, ExpressionResolver expressionResolver) {
        return divSizeUnitValue.f56962b.evaluate(expressionResolver).longValue() + DivSizeUnit.Converter.b(divSizeUnitValue.f56961a.evaluate(expressionResolver));
    }

    public final void bindLayoutParams(@NotNull BindingContext bindingContext, @NotNull View view, @NotNull e2 e2Var, @Nullable e2 e2Var2, @NotNull ExpressionSubscriber expressionSubscriber) {
        bindLayoutParams(view, e2Var, e2Var2, bindingContext.getExpressionResolver(), expressionSubscriber, this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()));
    }
}
