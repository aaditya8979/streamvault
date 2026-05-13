package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivActionTypedSetVariableHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionTypedSetVariableHandler implements DivActionTypedHandler {
    private final void handleSetVariable(DivActionTyped.q qVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String strEvaluate = qVar.c().f54408b.evaluate(expressionResolver);
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(qVar.c().f54407a, expressionResolver);
        VariableMutationHandler.Companion.setVariable(div2View, strEvaluate, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedSetVariableHandler.handleSetVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                Object obj = objEvaluate;
                Div2View div2View2 = div2View;
                String str = strEvaluate;
                String lowerCase = "array";
                if (variable instanceof Variable.ArrayVariable) {
                    boolean z10 = obj instanceof JSONArray;
                    JSONArray jSONArray = (JSONArray) (z10 ? obj : null);
                    if (jSONArray == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!z10) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (jSONArray != null) {
                        ((Variable.ArrayVariable) variable).set(jSONArray);
                    }
                } else if (variable instanceof Variable.BooleanVariable) {
                    Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
                    if (bool == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (bool != null) {
                        ((Variable.BooleanVariable) variable).set(bool.booleanValue());
                    }
                } else if (variable instanceof Variable.ColorVariable) {
                    boolean z11 = obj instanceof Integer;
                    Integer num = (Integer) (z11 ? obj : null);
                    if (num == null) {
                        if (z11 ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (num != null) {
                        ((Variable.ColorVariable) variable).m7399setcIhhviA(Color.m7445constructorimpl(num.intValue()));
                    }
                } else if (variable instanceof Variable.DictVariable) {
                    boolean z12 = obj instanceof JSONObject;
                    JSONObject jSONObject = (JSONObject) (z12 ? obj : null);
                    if (jSONObject == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (z12) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (jSONObject != null) {
                        ((Variable.DictVariable) variable).set(jSONObject);
                    }
                } else if (variable instanceof Variable.DoubleVariable) {
                    boolean z13 = obj instanceof Double;
                    Double d10 = (Double) (z13 ? obj : null);
                    if (d10 == null) {
                        if (obj instanceof Integer ? true : z13) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (d10 != null) {
                        ((Variable.DoubleVariable) variable).set(d10.doubleValue());
                    }
                } else if (variable instanceof Variable.IntegerVariable) {
                    Long l10 = (Long) (obj instanceof Long ? obj : null);
                    if (l10 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (l10 != null) {
                        ((Variable.IntegerVariable) variable).set(l10.longValue());
                    }
                } else if (variable instanceof Variable.StringVariable) {
                    String str2 = (String) (obj instanceof String ? obj : null);
                    if (str2 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (str2 != null) {
                        variable.set(str2);
                    }
                } else if (variable instanceof Variable.UrlVariable) {
                    Uri uri = (Uri) (obj instanceof Uri ? obj : null);
                    if (uri == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            p.j(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str));
                    }
                    if (uri != null) {
                        ((Variable.UrlVariable) variable).set(uri);
                    }
                }
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.q)) {
            return false;
        }
        handleSetVariable((DivActionTyped.q) divActionTyped, div2View, expressionResolver);
        return true;
    }
}
