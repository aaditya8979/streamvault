package com.yandex.div.evaluable;

import cn.f0;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class EvaluableExceptionKt {
    @NotNull
    public static final String functionToMessageFormat(@NotNull String str, @NotNull List<? extends Object> list) {
        p.k(str, "name");
        p.k(list, "args");
        return f0.D0(list, null, str + '(', ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt.functionToMessageFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Object obj) {
                p.k(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null);
    }

    @NotNull
    public static final String methodToMessageFormat(@NotNull String str, @NotNull List<? extends Object> list) {
        p.k(str, "name");
        p.k(list, "args");
        if (list.size() <= 1) {
            return str + "()";
        }
        return f0.D0(list.subList(1, list.size()), StringUtils.COMMA, str + '(', ")", 0, null, null, 56, null);
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull Token.Operator.Binary binary, @NotNull Object obj, @NotNull Object obj2) {
        EvaluableType evaluableType;
        String string;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        p.k(binary, "operator");
        p.k(obj, "left");
        p.k(obj2, "right");
        String str = toMessageFormat(obj) + ' ' + binary + ' ' + toMessageFormat(obj2);
        if (p.f(obj.getClass(), obj2.getClass())) {
            StringBuilder sb2 = new StringBuilder();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + obj.getClass().getName(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType.getTypeName$div_evaluable());
            sb2.append(" type");
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("different types: ");
            EvaluableType.Companion companion2 = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType2 = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + obj.getClass().getName(), null, 2, null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType2.getTypeName$div_evaluable());
            sb3.append(" and ");
            if (obj2 instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (obj2 instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (obj2 instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (obj2 instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (obj2 instanceof DateTime) {
                evaluableType3 = EvaluableType.DATETIME;
            } else if (obj2 instanceof Color) {
                evaluableType3 = EvaluableType.COLOR;
            } else if (obj2 instanceof Url) {
                evaluableType3 = EvaluableType.URL;
            } else if (obj2 instanceof JSONObject) {
                evaluableType3 = EvaluableType.DICT;
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + obj2.getClass().getName(), null, 2, null);
                }
                evaluableType3 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType3.getTypeName$div_evaluable());
            string = sb3.toString();
        }
        throwExceptionOnEvaluationFailed$default(str, "Operator '" + binary + "' cannot be applied to " + string + '.', null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull String str, @NotNull String str2, @Nullable Exception exc) {
        p.k(str, "expression");
        p.k(str2, "reason");
        throw new EvaluableException("Failed to evaluate [" + str + "]. " + str2, exc);
    }

    public static /* synthetic */ Void throwExceptionOnEvaluationFailed$default(String str, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return throwExceptionOnEvaluationFailed(str, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnFunctionEvaluationFailed(@NotNull String str, @NotNull List<? extends Object> list, @NotNull String str2, @Nullable Exception exc) {
        p.k(str, "name");
        p.k(list, "args");
        p.k(str2, "reason");
        throwExceptionOnEvaluationFailed(functionToMessageFormat(str, list), str2, exc);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwExceptionOnFunctionEvaluationFailed$default(String str, List list, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnFunctionEvaluationFailed(str, list, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnMethodEvaluationFailed(@NotNull String str, @NotNull List<? extends Object> list, @NotNull String str2, @Nullable Exception exc) {
        p.k(str, "name");
        p.k(list, "args");
        p.k(str2, "reason");
        throwExceptionOnEvaluationFailed(methodToMessageFormat(str, list), str2, exc);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull Object obj) {
        p.k(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\'');
        sb2.append(obj);
        sb2.append('\'');
        return sb2.toString();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull List<? extends Object> list) {
        p.k(list, "<this>");
        return f0.D0(list, ", ", null, null, 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt.toMessageFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Object obj) {
                p.k(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 30, null);
    }
}
