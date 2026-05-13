package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPivot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTransform.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTransform implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f58040e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final DivPivot.c f58041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final DivPivot.c f58042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTransform> f58043h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivPivot f58044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivPivot f58045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<Double> f58046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f58047d;

    /* JADX INFO: compiled from: DivTransform.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTransform a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f58041f = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58042g = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58043h = new sn.p<ParsingEnvironment, JSONObject, DivTransform>() { // from class: com.yandex.div2.DivTransform$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTransform mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTransform.f58040e.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivTransform() {
        this(null, null, null, 7, null);
    }

    public DivTransform(@NotNull DivPivot divPivot, @NotNull DivPivot divPivot2, @Nullable Expression<Double> expression) {
        this.f58044a = divPivot;
        this.f58045b = divPivot2;
        this.f58046c = expression;
    }

    public /* synthetic */ DivTransform(DivPivot divPivot, DivPivot divPivot2, Expression expression, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f58041f : divPivot, (i10 & 2) != 0 ? f58042g : divPivot2, (i10 & 4) != 0 ? null : expression);
    }

    public final boolean a(@Nullable DivTransform divTransform, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTransform == null || !this.f58044a.a(divTransform.f58044a, expressionResolver, expressionResolver2) || !this.f58045b.a(divTransform.f58045b, expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression<Double> expression = this.f58046c;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divTransform.f58046c;
        return tn.p.c(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58047d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTransform.class).hashCode() + this.f58044a.hash() + this.f58045b.hash();
        Expression<Double> expression = this.f58046c;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f58047d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
