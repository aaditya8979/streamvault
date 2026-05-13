package com.yandex.div.core.actions;

import bn.r;
import cn.f0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import sn.l;

/* JADX INFO: compiled from: DivActionTypedArrayMutationHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionTypedArrayMutationHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray mutate(JSONArray jSONArray, l<? super List<Object>, r> lVar) {
        List listJ1 = f0.j1(JsonUtilsKt.asList(jSONArray));
        lVar.invoke(listJ1);
        return new JSONArray((Collection) listJ1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVariable(final Div2View div2View, String str, ExpressionResolver expressionResolver, final l<? super JSONArray, ? extends JSONArray> lVar) {
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt.updateVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                if (!(variable instanceof Variable.ArrayVariable)) {
                    DivActionTypedUtilsKt.logError(div2View.getView(), new IllegalArgumentException("Action requires array variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONArray jSONArray = value instanceof JSONArray ? (JSONArray) value : null;
                if (jSONArray == null) {
                    DivActionTypedUtilsKt.logError(div2View.getView(), new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                ((Variable.ArrayVariable) variable).set(lVar.invoke(jSONArray));
                return variable;
            }
        });
    }
}
