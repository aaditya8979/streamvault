package com.yandex.div.core.actions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTypedValue;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionTypedUtilsKt {
    public static final void closeKeyboard(@NotNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    @Nullable
    public static final Integer colorIntValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.c) {
            return ((DivTypedValue.c) divTypedValue).c().f54051a.evaluate(expressionResolver);
        }
        return null;
    }

    @Nullable
    public static final Double doubleValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return Double.valueOf(((DivTypedValue.f) divTypedValue).c().f58293a.evaluate(expressionResolver).longValue());
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return ((DivTypedValue.g) divTypedValue).c().f58614a.evaluate(expressionResolver);
        }
        return null;
    }

    @NotNull
    public static final Object evaluate(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return ((DivTypedValue.f) divTypedValue).c().f58293a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.h) {
            return ((DivTypedValue.h) divTypedValue).c().f58665a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.b) {
            return ((DivTypedValue.b) divTypedValue).c().f54035a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.c) {
            return ((DivTypedValue.c) divTypedValue).c().f54051a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return ((DivTypedValue.g) divTypedValue).c().f58614a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.i) {
            return ((DivTypedValue.i) divTypedValue).c().f58681a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.a) {
            return ((DivTypedValue.a) divTypedValue).c().f54019a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.e) {
            return ((DivTypedValue.e) divTypedValue).c().f54081a.evaluate(expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void logError(@NotNull Div2View div2View, @NotNull Throwable th2) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(th2);
    }

    public static final void logWarning(@NotNull Div2View div2View, @NotNull Throwable th2) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(th2);
    }

    @Nullable
    public static final Long longValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return ((DivTypedValue.f) divTypedValue).c().f58293a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void openKeyboard(@NotNull DivInputView divInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(divInputView.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }
}
