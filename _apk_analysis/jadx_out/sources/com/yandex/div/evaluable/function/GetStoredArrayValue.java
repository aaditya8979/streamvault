package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetStoredArrayValue extends GetStoredComplexValue<JSONArray> {

    @NotNull
    public static final GetStoredArrayValue INSTANCE = new GetStoredArrayValue();

    @NotNull
    private static final String name = "getStoredArrayValue";

    @NotNull
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    private GetStoredArrayValue() {
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
}
