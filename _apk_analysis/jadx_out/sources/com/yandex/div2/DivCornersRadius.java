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

/* JADX INFO: compiled from: DivCornersRadius.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCornersRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f54979f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCornersRadius> f54980g = new sn.p<ParsingEnvironment, JSONObject, DivCornersRadius>() { // from class: com.yandex.div2.DivCornersRadius$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCornersRadius mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCornersRadius.f54979f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f54985e;

    /* JADX INFO: compiled from: DivCornersRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCornersRadius a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().s2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivCornersRadius() {
        this(null, null, null, null, 15, null);
    }

    public DivCornersRadius(@Nullable Expression<Long> expression, @Nullable Expression<Long> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<Long> expression4) {
        this.f54981a = expression;
        this.f54982b = expression2;
        this.f54983c = expression3;
        this.f54984d = expression4;
    }

    public /* synthetic */ DivCornersRadius(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? null : expression4);
    }

    public final boolean a(@Nullable DivCornersRadius divCornersRadius, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divCornersRadius == null) {
            return false;
        }
        Expression<Long> expression = this.f54981a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divCornersRadius.f54981a;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression3 = this.f54982b;
        Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divCornersRadius.f54982b;
        if (!tn.p.f(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression5 = this.f54983c;
        Long lEvaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = divCornersRadius.f54983c;
        if (!tn.p.f(lEvaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f54984d;
        Long lEvaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divCornersRadius.f54984d;
        return tn.p.f(lEvaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54985e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCornersRadius.class).hashCode();
        Expression<Long> expression = this.f54981a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.f54982b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Long> expression3 = this.f54983c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f54984d;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.f54985e = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
