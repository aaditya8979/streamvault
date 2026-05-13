package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivLinearGradient;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLinearGradient.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivLinearGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56180e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56181f = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivLinearGradient> f56182g = new sn.p<ParsingEnvironment, JSONObject, DivLinearGradient>() { // from class: com.yandex.div2.DivLinearGradient$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLinearGradient mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivLinearGradient.f56180e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<ColorPoint> f56184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ExpressionList<Integer> f56185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f56186d;

    /* JADX INFO: compiled from: DivLinearGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f56187d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ColorPoint> f56188e = new sn.p<ParsingEnvironment, JSONObject, ColorPoint>() { // from class: com.yandex.div2.DivLinearGradient$ColorPoint$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivLinearGradient.ColorPoint mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivLinearGradient.ColorPoint.f56187d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f56189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Double> f56190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f56191c;

        /* JADX INFO: compiled from: DivLinearGradient.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final ColorPoint a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().S4().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public ColorPoint(@NotNull Expression<Integer> expression, @NotNull Expression<Double> expression2) {
            this.f56189a = expression;
            this.f56190b = expression2;
        }

        public final boolean a(@Nullable ColorPoint colorPoint, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (colorPoint != null && this.f56189a.evaluate(expressionResolver).intValue() == colorPoint.f56189a.evaluate(expressionResolver2).intValue()) {
                return (this.f56190b.evaluate(expressionResolver).doubleValue() > colorPoint.f56190b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56190b.evaluate(expressionResolver).doubleValue() == colorPoint.f56190b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56191c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(ColorPoint.class).hashCode() + this.f56189a.hashCode() + this.f56190b.hashCode();
            this.f56191c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().S4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivLinearGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivLinearGradient a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().V4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivLinearGradient() {
        this(null, null, null, 7, null);
    }

    public DivLinearGradient(@NotNull Expression<Long> expression, @Nullable List<ColorPoint> list, @Nullable ExpressionList<Integer> expressionList) {
        this.f56183a = expression;
        this.f56184b = list;
        this.f56185c = expressionList;
    }

    public /* synthetic */ DivLinearGradient(Expression expression, List list, ExpressionList expressionList, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56181f : expression, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : expressionList);
    }

    public final boolean a(@Nullable DivLinearGradient divLinearGradient, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        List<Integer> listEvaluate;
        List<Integer> listEvaluate2;
        if (divLinearGradient == null || this.f56183a.evaluate(expressionResolver).longValue() != divLinearGradient.f56183a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<ColorPoint> list = this.f56184b;
        if (list != null) {
            List<ColorPoint> list2 = divLinearGradient.f56184b;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((ColorPoint) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (divLinearGradient.f56184b != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        ExpressionList<Integer> expressionList = this.f56185c;
        if (expressionList != null && (listEvaluate = expressionList.evaluate(expressionResolver)) != null) {
            ExpressionList<Integer> expressionList2 = divLinearGradient.f56185c;
            if (expressionList2 != null && (listEvaluate2 = expressionList2.evaluate(expressionResolver2)) != null) {
                if (listEvaluate.size() == listEvaluate2.size()) {
                    int i12 = 0;
                    for (Object obj2 : listEvaluate) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((Number) obj2).intValue() == listEvaluate2.get(i12).intValue()) {
                            i12 = i13;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (divLinearGradient.f56185c != null) {
            z11 = false;
            break;
        }
        z11 = true;
        return z11;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56186d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivLinearGradient.class).hashCode() + this.f56183a.hashCode();
        List<ColorPoint> list = this.f56184b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((ColorPoint) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        ExpressionList<Integer> expressionList = this.f56185c;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0);
        this.f56186d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
