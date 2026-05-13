package com.yandex.div.core.actions;

import bo.d0;
import cn.f0;
import cn.w;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionUpdateStructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTypedUpdateStructureHandler implements DivActionTypedHandler {

    /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
    public interface Structure {

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Array implements Structure {

            @NotNull
            private final JSONArray array;

            public Array(@NotNull JSONArray jSONArray) {
                this.array = jSONArray;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String str) {
                Object objOpt = this.array.opt(Integer.parseInt(str));
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null ? true : p.f(objOpt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            public int getSize() {
                return this.array.length();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String str, @NotNull Object obj) {
                int i10 = Integer.parseInt(str);
                if (i10 < 0 || i10 > getSize()) {
                    throw new IndexOutOfBoundsException();
                }
                try {
                    Result.a aVar = Result.Companion;
                    Result.m7534constructorimpl(this.array.put(i10, obj));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    Result.m7534constructorimpl(c.a(th2));
                }
            }
        }

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Dictionary implements Structure {

            @NotNull
            private final JSONObject dictionary;

            public Dictionary(@NotNull JSONObject jSONObject) {
                this.dictionary = jSONObject;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String str) {
                Object objOpt = this.dictionary.opt(str);
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null ? true : p.f(objOpt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String str, @NotNull Object obj) {
                try {
                    Result.a aVar = Result.Companion;
                    Result.m7534constructorimpl(this.dictionary.put(str, obj));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    Result.m7534constructorimpl(c.a(th2));
                }
            }
        }

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class NonStructure implements Structure {

            @NotNull
            public static final NonStructure INSTANCE = new NonStructure();

            private NonStructure() {
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String str) {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String str, @NotNull Object obj) {
                throw new UnsupportedOperationException();
            }
        }

        @Nullable
        Structure get(@NotNull String str);

        void set(@NotNull String str, @NotNull Object obj);
    }

    private final Structure findStructureElement(Div2View div2View, Structure structure, List<String> list) {
        int i10 = 0;
        Structure structure2 = structure;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            String str = (String) obj;
            try {
                structure2 = structure2.get(str);
                if (p.f(structure2, Structure.NonStructure.INSTANCE)) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + f0.D0(f0.Y0(list, i11), "/", null, null, 0, null, null, 62, null) + "' is not a structure"));
                    return null;
                }
                if (structure2 == null) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + f0.D0(f0.Y0(list, i11), "/", null, null, 0, null, null, 62, null) + "' is not found"));
                    return null;
                }
                i10 = i11;
            } catch (NumberFormatException e10) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Unable to use '" + str + "' as array index", e10));
                return null;
            }
        }
        return structure2;
    }

    private final boolean handleAction(DivActionUpdateStructure divActionUpdateStructure, final Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionUpdateStructure.f54550c.evaluate(expressionResolver);
        String strEvaluate2 = divActionUpdateStructure.f54548a.evaluate(expressionResolver);
        List listU0 = d0.U0(strEvaluate2, new String[]{"/"}, false, 0, 6, null);
        final ArrayList arrayList = new ArrayList();
        Iterator it = listU0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(divActionUpdateStructure.f54549b, expressionResolver);
        if (!(strEvaluate2.length() > 0) || !arrayList.isEmpty()) {
            VariableMutationHandler.Companion.setVariable(div2View, strEvaluate, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.handleAction.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Variable invoke(@NotNull Variable variable) {
                    if (variable instanceof Variable.ArrayVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateArrayStructure(div2View, (Variable.ArrayVariable) variable, arrayList, objEvaluate);
                    } else if (variable instanceof Variable.DictVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateDictStructure(div2View, (Variable.DictVariable) variable, arrayList, objEvaluate);
                    } else {
                        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Action requires array or dictionary variable"));
                    }
                    return variable;
                }
            });
            return true;
        }
        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Malformed path '" + strEvaluate2 + "': all path segments are empty"));
        return true;
    }

    private final boolean setValue(Div2View div2View, Structure structure, String str, Object obj) {
        try {
            structure.set(str, obj);
            return true;
        } catch (IndexOutOfBoundsException e10) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Position '" + str + "' is out of array bounds", e10));
            return false;
        } catch (NumberFormatException e11) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Unable to use '" + str + "' as array index", e11));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateArrayStructure(Div2View div2View, Variable.ArrayVariable arrayVariable, List<String> list, Object obj) {
        Object value = arrayVariable.getValue();
        p.i(value, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) value;
        Structure structureFindStructureElement = findStructureElement(div2View, new Structure.Array(jSONArray), f0.m0(list, 1));
        if (structureFindStructureElement == null || !setValue(div2View, structureFindStructureElement, (String) f0.F0(list), obj)) {
            return;
        }
        arrayVariable.set(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDictStructure(Div2View div2View, Variable.DictVariable dictVariable, List<String> list, Object obj) {
        Object value = dictVariable.getValue();
        p.i(value, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) value;
        Structure structureFindStructureElement = findStructureElement(div2View, new Structure.Dictionary(jSONObject), f0.m0(list, 1));
        if (structureFindStructureElement == null || !setValue(div2View, structureFindStructureElement, (String) f0.F0(list), obj)) {
            return;
        }
        dictVariable.set(jSONObject);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (divActionTyped instanceof DivActionTyped.u) {
            return handleAction(((DivActionTyped.u) divActionTyped).c(), div2View, expressionResolver);
        }
        return false;
    }
}
