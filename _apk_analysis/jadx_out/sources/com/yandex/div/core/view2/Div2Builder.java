package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Div2Builder.kt */
/* JADX INFO: loaded from: classes3.dex */
public class Div2Builder {

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final DivBinder viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    public Div2Builder(@NotNull DivViewCreator divViewCreator, @NotNull DivBinder divBinder, @NotNull DivRuntimeVisitor divRuntimeVisitor) {
        this.viewCreator = divViewCreator;
        this.viewBinder = divBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    @NotNull
    public View buildView(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        View viewCreateView = createView(div, bindingContext, divStatePath);
        this.viewBinder.bind(bindingContext, viewCreateView, div, divStatePath);
        return viewCreateView;
    }

    @NotNull
    public View createView(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.runtimeVisitor.createAndAttachRuntimes(div, divStatePath, bindingContext.getDivView());
        View viewCreate = this.viewCreator.create(div, expressionResolver);
        viewCreate.setLayoutParams(new DivLayoutParams(-1, -2));
        return viewCreate;
    }
}
