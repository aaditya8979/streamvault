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

/* JADX INFO: compiled from: DivBorder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivBorder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f54679g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54680h = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivBorder> f54681i = new sn.p<ParsingEnvironment, JSONObject, DivBorder>() { // from class: com.yandex.div2.DivBorder$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBorder mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBorder.f54679g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivCornersRadius f54683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final DivShadow f54685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final DivStroke f54686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f54687f;

    /* JADX INFO: compiled from: DivBorder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivBorder a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivBorder() {
        this(null, null, null, null, null, 31, null);
    }

    public DivBorder(@Nullable Expression<Long> expression, @Nullable DivCornersRadius divCornersRadius, @NotNull Expression<Boolean> expression2, @Nullable DivShadow divShadow, @Nullable DivStroke divStroke) {
        this.f54682a = expression;
        this.f54683b = divCornersRadius;
        this.f54684c = expression2;
        this.f54685d = divShadow;
        this.f54686e = divStroke;
    }

    public /* synthetic */ DivBorder(Expression expression, DivCornersRadius divCornersRadius, Expression expression2, DivShadow divShadow, DivStroke divStroke, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divCornersRadius, (i10 & 4) != 0 ? f54680h : expression2, (i10 & 8) != 0 ? null : divShadow, (i10 & 16) != 0 ? null : divStroke);
    }

    public final boolean a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divBorder == null) {
            return false;
        }
        Expression<Long> expression = this.f54682a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divBorder.f54682a;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCornersRadius divCornersRadius = this.f54683b;
        if (!(divCornersRadius != null ? divCornersRadius.a(divBorder.f54683b, expressionResolver, expressionResolver2) : divBorder.f54683b == null) || this.f54684c.evaluate(expressionResolver).booleanValue() != divBorder.f54684c.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivShadow divShadow = this.f54685d;
        if (!(divShadow != null ? divShadow.a(divBorder.f54685d, expressionResolver, expressionResolver2) : divBorder.f54685d == null)) {
            return false;
        }
        DivStroke divStroke = this.f54686e;
        DivStroke divStroke2 = divBorder.f54686e;
        return divStroke != null ? divStroke.a(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54687f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivBorder.class).hashCode();
        Expression<Long> expression = this.f54682a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivCornersRadius divCornersRadius = this.f54683b;
        int iHash = iHashCode2 + (divCornersRadius != null ? divCornersRadius.hash() : 0) + this.f54684c.hashCode();
        DivShadow divShadow = this.f54685d;
        int iHash2 = iHash + (divShadow != null ? divShadow.hash() : 0);
        DivStroke divStroke = this.f54686e;
        int iHash3 = iHash2 + (divStroke != null ? divStroke.hash() : 0);
        this.f54687f = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
