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

/* JADX INFO: compiled from: DivRoundedRectangleShape.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivRoundedRectangleShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56655g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShape> f56659k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f56660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f56661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f56662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f56663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final DivStroke f56664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f56665f;

    /* JADX INFO: compiled from: DivRoundedRectangleShape.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRoundedRectangleShape a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().x6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56656h = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f56657i = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f56658j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f56659k = new sn.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivRoundedRectangleShape$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRoundedRectangleShape mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRoundedRectangleShape.f56655g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivRoundedRectangleShape() {
        this(null, null, null, null, null, 31, null);
    }

    public DivRoundedRectangleShape(@Nullable Expression<Integer> expression, @NotNull DivFixedSize divFixedSize, @NotNull DivFixedSize divFixedSize2, @NotNull DivFixedSize divFixedSize3, @Nullable DivStroke divStroke) {
        this.f56660a = expression;
        this.f56661b = divFixedSize;
        this.f56662c = divFixedSize2;
        this.f56663d = divFixedSize3;
        this.f56664e = divStroke;
    }

    public /* synthetic */ DivRoundedRectangleShape(Expression expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f56656h : divFixedSize, (i10 & 4) != 0 ? f56657i : divFixedSize2, (i10 & 8) != 0 ? f56658j : divFixedSize3, (i10 & 16) != 0 ? null : divStroke);
    }

    public final boolean a(@Nullable DivRoundedRectangleShape divRoundedRectangleShape, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divRoundedRectangleShape == null) {
            return false;
        }
        Expression<Integer> expression = this.f56660a;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divRoundedRectangleShape.f56660a;
        if (!tn.p.f(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !this.f56661b.a(divRoundedRectangleShape.f56661b, expressionResolver, expressionResolver2) || !this.f56662c.a(divRoundedRectangleShape.f56662c, expressionResolver, expressionResolver2) || !this.f56663d.a(divRoundedRectangleShape.f56663d, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f56664e;
        DivStroke divStroke2 = divRoundedRectangleShape.f56664e;
        return divStroke != null ? divStroke.a(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56665f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivRoundedRectangleShape.class).hashCode();
        Expression<Integer> expression = this.f56660a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f56661b.hash() + this.f56662c.hash() + this.f56663d.hash();
        DivStroke divStroke = this.f56664e;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f56665f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
