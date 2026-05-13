package com.yandex.div.core.view2.divs;

import bn.r;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivSeparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: DivSeparatorBinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivSeparatorBinder extends DivViewBinder<Div.l, DivSeparator, DivSeparatorView> {
    public DivSeparatorBinder(@NotNull DivBaseBinder divBaseBinder) {
        super(divBaseBinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, DivSeparator.DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver) {
        if (delimiterStyle == null) {
            divSeparatorView.setDividerColor(335544320);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(delimiterStyle.f56847a.evaluate(expressionResolver).intValue());
            divSeparatorView.setHorizontal(delimiterStyle.f56848b.evaluate(expressionResolver) == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        }
    }

    private final void bindStyle(final DivSeparatorView divSeparatorView, final DivSeparator.DelimiterStyle delimiterStyle, DivSeparator.DelimiterStyle delimiterStyle2, final ExpressionResolver expressionResolver) {
        Expression<DivSeparator.DelimiterStyle.Orientation> expression;
        Expression<Integer> expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.f56847a : null, delimiterStyle2 != null ? delimiterStyle2.f56847a : null)) {
            if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.f56848b : null, delimiterStyle2 != null ? delimiterStyle2.f56848b : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.f56847a : null)) {
            if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.f56848b : null)) {
                return;
            }
        }
        l<? super DivSeparator.DelimiterStyle.Orientation, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
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
                this.this$0.applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
            }
        };
        divSeparatorView.addSubscription((delimiterStyle == null || (expression2 = delimiterStyle.f56847a) == null) ? null : expression2.observe(expressionResolver, lVar));
        if (delimiterStyle != null && (expression = delimiterStyle.f56848b) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        divSeparatorView.addSubscription(disposableObserve);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSeparatorView divSeparatorView, @NotNull BindingContext bindingContext, @NotNull DivSeparator divSeparator, @Nullable DivSeparator divSeparator2) {
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, divSeparator.f56818b, divSeparator.f56820d, divSeparator.f56840x, divSeparator.f56831o, divSeparator.f56837u, divSeparator.f56836t, divSeparator.B, divSeparator.A, divSeparator.f56819c, divSeparator.f56827k);
        bindStyle(divSeparatorView, divSeparator.f56829m, divSeparator2 != null ? divSeparator2.f56829m : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R$dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }
}
