package com.yandex.div.evaluable.function;

import bn.r;
import cn.f0;
import com.ironsource.C3978d4;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DictFunctionsKt {
    @NotNull
    public static final Object evaluate(@NotNull String str, @NotNull List<? extends Object> list, boolean z10) {
        Object objM7534constructorimpl;
        Object objM7534constructorimpl2;
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        JSONObject jSONObject = (JSONObject) f0.t0(list);
        int size = list.size() - 1;
        for (int i10 = 1; i10 < size; i10++) {
            Object obj = list.get(i10);
            p.i(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            try {
                Result.a aVar = Result.Companion;
                p.h(jSONObject);
                Object objOpt = jSONObject.opt(str2);
                jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                objM7534constructorimpl2 = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl2 = Result.m7534constructorimpl(c.a(th2));
            }
            if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl2) != null) {
                throwMissingPropertyException(str, list, str2, z10);
                throw new KotlinNothingValueException();
            }
        }
        Object objF0 = f0.F0(list);
        p.i(objF0, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) objF0;
        try {
            Result.a aVar3 = Result.Companion;
            p.h(jSONObject);
            objM7534constructorimpl = Result.m7534constructorimpl(jSONObject.get(str3));
        } catch (Throwable th3) {
            Result.a aVar4 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th3));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) == null) {
            p.j(objM7534constructorimpl, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return objM7534constructorimpl;
        }
        throwMissingPropertyException(str, list, str3, z10);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull List<? extends Object> list, @NotNull Object obj, boolean z10) {
        p.k(list, "args");
        p.k(obj, "fallback");
        int i10 = !z10 ? 1 : 0;
        Object obj2 = list.get(i10);
        JSONObject jSONObjectOptJSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
        if (jSONObjectOptJSONObject == null) {
            return obj;
        }
        int size = list.size() - 1;
        for (int i11 = i10 + 1; i11 < size; i11++) {
            Object obj3 = list.get(i11);
            p.i(obj3, "null cannot be cast to non-null type kotlin.String");
            jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject((String) obj3);
            if (jSONObjectOptJSONObject == null) {
                return obj;
            }
        }
        Object objF0 = f0.F0(list);
        p.i(objF0, "null cannot be cast to non-null type kotlin.String");
        return jSONObjectOptJSONObject.opt((String) objF0);
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateSafe(list, obj, z10);
    }

    @NotNull
    public static final Void throwDictException(@NotNull String str, @NotNull List<? extends Object> list, @NotNull String str2) {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(str2, "message");
        ArrayFunctionsKt.throwException$default("dict", str, list, str2, false, 16, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void throwException(@NotNull String str, @NotNull List<? extends Object> list, @NotNull String str2, boolean z10) {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(str2, "message");
        String str3 = z10 ? "" : "<dict>, ";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(f0.D0(list.subList(1, list.size()), null, str + '(' + str3, ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.DictFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Object obj) {
                p.k(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null), str2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z10) {
        throwException(str, list, "Missing property \"" + str2 + "\" in the dict.", z10);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void throwWrongTypeException(@NotNull String str, @NotNull List<? extends Object> list, @NotNull EvaluableType evaluableType, @NotNull Object obj, boolean z10) {
        p.k(str, C3978d4.g.f31290b);
        p.k(list, "args");
        p.k(evaluableType, "expected");
        p.k(obj, "actual");
        throwException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + (!p.f(obj, JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z10);
        throw new KotlinNothingValueException();
    }
}
