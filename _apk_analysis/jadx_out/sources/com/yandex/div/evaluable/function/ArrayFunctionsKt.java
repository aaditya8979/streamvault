package com.yandex.div.evaluable.function;

import cn.f0;
import com.ironsource.C3978d4;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayFunctionsKt {
    private static final void checkIndexOfBoundException(String str, List<? extends Object> list, boolean z10) {
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        p.i(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue < length) {
            return;
        }
        throwArrayException(str, list, "Requested index (" + jLongValue + ") out of bounds array size (" + length + ").", z10);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void checkIndexOfBoundException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        checkIndexOfBoundException(str, list, z10);
    }

    @NotNull
    public static final Object evaluateArray(@NotNull String str, @NotNull List<? extends Object> list, boolean z10) throws JSONException {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        checkIndexOfBoundException(str, list, z10);
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = list.get(1);
        p.i(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        p.j(obj3, "array.get(index.toInt())");
        return obj3;
    }

    public static /* synthetic */ Object evaluateArray$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateArray(str, list, z10);
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull String str, @NotNull List<? extends Object> list) {
        Object objM7534constructorimpl;
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        try {
            Result.a aVar = Result.Companion;
            checkIndexOfBoundException$default(str, list, false, 4, null);
            Object obj = list.get(0);
            p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = list.get(1);
            p.i(obj2, "null cannot be cast to non-null type kotlin.Long");
            objM7534constructorimpl = Result.m7534constructorimpl(((JSONArray) obj).get((int) ((Long) obj2).longValue()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            return null;
        }
        return objM7534constructorimpl;
    }

    @Nullable
    public static final Color safeConvertToColor(@Nullable String str) {
        Object objM7534constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Color.m7444boximpl(Color.Companion.m7454parseC4zCDoM(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        return (Color) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }

    @Nullable
    public static final String safeConvertToUrl(@Nullable String str) {
        Object objM7534constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Url.m7455boximpl(Url.Companion.m7462fromVcSV9u8(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        Url url = (Url) objM7534constructorimpl;
        if (url != null) {
            return url.m7461unboximpl();
        }
        return null;
    }

    @NotNull
    public static final Void throwArrayException(@NotNull String str, @NotNull List<? extends Object> list, @NotNull String str2, boolean z10) {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(str2, "message");
        throwException("array", str, list, str2, z10);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwArrayException$default(String str, List list, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return throwArrayException(str, list, str2, z10);
    }

    public static final void throwArrayWrongTypeException(@NotNull String str, @NotNull List<? extends Object> list, @NotNull EvaluableType evaluableType, @NotNull Object obj, boolean z10) {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(evaluableType, "expected");
        p.k(obj, "actual");
        throwArrayException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + (!p.f(obj, JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z10);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void throwException(@NotNull String str, @NotNull String str2, @NotNull List<? extends Object> list, @NotNull String str3, boolean z10) {
        String str4;
        p.k(str, "type");
        p.k(str2, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(str3, "message");
        if (z10) {
            str4 = "";
        } else {
            str4 = '<' + str + ">, ";
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(f0.D0(list.subList(1, list.size()), null, str2 + '(' + str4, ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.ArrayFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Object obj) {
                p.k(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null), str3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwException$default(String str, String str2, List list, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return throwException(str, str2, list, str3, z10);
    }
}
