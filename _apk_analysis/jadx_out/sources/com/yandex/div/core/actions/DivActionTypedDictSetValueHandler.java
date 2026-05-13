package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivTypedValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import sn.l;

/* JADX INFO: compiled from: DivActionTypedDictSetValueHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionTypedDictSetValueHandler implements DivActionTypedHandler {
    private final void handleSetValue(DivActionDictSetValue divActionDictSetValue, final Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionDictSetValue.f54286c.evaluate(expressionResolver);
        final String strEvaluate2 = divActionDictSetValue.f54284a.evaluate(expressionResolver);
        DivTypedValue divTypedValue = divActionDictSetValue.f54285b;
        final Object objEvaluate = divTypedValue != null ? DivActionTypedUtilsKt.evaluate(divTypedValue, expressionResolver) : null;
        VariableMutationHandler.Companion.setVariable(div2View, strEvaluate, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedDictSetValueHandler.handleSetValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Variable invoke(@NotNull Variable variable) throws JSONException {
                if (!(variable instanceof Variable.DictVariable)) {
                    DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("dict_set_value action requires dict variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject == null) {
                    DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                JSONObject jSONObjectClone = DivActionTypedDictSetValueHandlerKt.clone(jSONObject);
                Object obj = objEvaluate;
                if (obj == null) {
                    jSONObjectClone.remove(strEvaluate2);
                    ((Variable.DictVariable) variable).set(jSONObjectClone);
                } else {
                    ((Variable.DictVariable) variable).set(jSONObjectClone.put(strEvaluate2, obj));
                }
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.i)) {
            return false;
        }
        handleSetValue(((DivActionTyped.i) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
