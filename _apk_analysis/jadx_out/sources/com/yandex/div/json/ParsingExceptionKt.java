package com.yandex.div.json;

import bo.f0;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: ParsingException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsingExceptionKt {

    @NotNull
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray jSONArray, @NotNull String str, int i10, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i10 + " position of '" + str + "' is failed to create", exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingException parsingException) {
        p.i(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + str + "' is failed to create", exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at path '" + str + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, @NotNull String str2, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' at path '" + str2 + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException invalidValue(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Field '" + str + "' with expression '" + str2 + "' received wrong value: '" + obj + '\'', th2, null, null, 24, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i10, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i10, T t10, @NotNull Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", th2, new JsonArray(jSONArray), null, 16, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10, @NotNull Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", th2, new JsonObject(jSONObject), null, 16, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull String str, @NotNull String str2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' at path '" + str2 + "' is missing", null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' is missing", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "Undefined variable '" + str3 + "' at \"" + str + "\": \"" + str2 + '\"', th2, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "No variable could be resolved for '" + str, th2, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return missingVariable(str, th2);
    }

    @NotNull
    public static final <T> ParsingException resolveFailed(@NotNull String str, T t10, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' could not be resolved", th2, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return resolveFailed(str, obj, th2);
    }

    @NotNull
    public static final ParsingException templateNotFound(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, "Template '" + str + "' is missing!", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    private static final String trimLength(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() <= 100) {
            return strValueOf;
        }
        return f0.F1(strValueOf, 97) + "...";
    }

    @NotNull
    public static final ParsingException typeMismatch(int i10, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Item builder data at " + i10 + " position has wrong type: " + obj.getClass().getName(), null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Expression '" + str + "': '" + str2 + "' received value of wrong type: '" + obj + '\'', th2, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONArray jSONArray, @NotNull String str, int i10, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i10 + " position of '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value for key '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        return typeMismatch(str, str2, obj, th2);
    }
}
