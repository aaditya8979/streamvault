package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div2.DivAction;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PerformActionSpan.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PerformActionSpan extends ClickableSpan {

    @NotNull
    private final List<DivAction> actions;

    @NotNull
    private final BindingContext bindingContext;

    public PerformActionSpan(@NotNull BindingContext bindingContext, @NotNull List<DivAction> list) {
        this.bindingContext = bindingContext;
        this.actions = list;
    }

    private final DivActionBinder getActionBinder() {
        return this.bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
    }

    @NotNull
    public final List<DivAction> getActions() {
        return this.actions;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        getActionBinder().handleTapClick$div_release(this.bindingContext, view, this.actions);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
    }
}
