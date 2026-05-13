package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotFixed.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPivotFixed implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56533d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56534e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPivotFixed> f56535f = new sn.p<ParsingEnvironment, JSONObject, DivPivotFixed>() { // from class: com.yandex.div2.DivPivotFixed$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotFixed mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotFixed.f56533d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f56536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56538c;

    /* JADX INFO: compiled from: DivPivotFixed.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPivotFixed a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Q5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivPivotFixed() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivPivotFixed(@NotNull Expression<DivSizeUnit> expression, @Nullable Expression<Long> expression2) {
        this.f56536a = expression;
        this.f56537b = expression2;
    }

    public /* synthetic */ DivPivotFixed(Expression expression, Expression expression2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56534e : expression, (i10 & 2) != 0 ? null : expression2);
    }

    public final boolean a(@Nullable DivPivotFixed divPivotFixed, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPivotFixed == null || this.f56536a.evaluate(expressionResolver) != divPivotFixed.f56536a.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<Long> expression = this.f56537b;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divPivotFixed.f56537b;
        return tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56538c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPivotFixed.class).hashCode() + this.f56536a.hashCode();
        Expression<Long> expression = this.f56537b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f56538c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
