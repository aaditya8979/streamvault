package com.yandex.div.evaluable.function;

import cn.a0;
import cn.f0;
import cn.p0;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: ToString.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DictToString extends Function {
    private static final boolean isPure = false;

    @NotNull
    public static final DictToString INSTANCE = new DictToString();

    @NotNull
    private static final String name = "toString";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = v.e(new FunctionArgument(EvaluableType.DICT, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.STRING;

    private DictToString() {
    }

    private final Map<String, Object> sort(JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        p.j(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            p.j(next, "key");
            arrayList.add(next);
        }
        a0.C(arrayList);
        SortedMap sortedMapH = p0.h(new Pair[0]);
        for (String str : arrayList) {
            Object objSort = jSONObject.get(str);
            if (objSort instanceof JSONObject) {
                objSort = INSTANCE.sort((JSONObject) objSort);
            }
            sortedMapH.put(str, objSort);
        }
        return sortedMapH;
    }

    private final String toStringLikeJson(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return sb2.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(entry.getKey());
            sb3.append("\":");
            Object value = entry.getValue();
            sb3.append(value != null ? INSTANCE.toStringLikeJson(value) : null);
            arrayList.add(sb3.toString());
        }
        return '{' + f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null) + '}';
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objT0 = f0.t0(list);
        p.i(objT0, "null cannot be cast to non-null type org.json.JSONObject");
        return toStringLikeJson(sort((JSONObject) objT0));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
