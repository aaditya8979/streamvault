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

/* JADX INFO: compiled from: DivEdgeInsets.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivEdgeInsets implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f55192i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f55197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivEdgeInsets> f55198o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f55205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Integer f55206h;

    /* JADX INFO: compiled from: DivEdgeInsets.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivEdgeInsets a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Y2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55193j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55194k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55195l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55196m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55197n = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f55198o = new sn.p<ParsingEnvironment, JSONObject, DivEdgeInsets>() { // from class: com.yandex.div2.DivEdgeInsets$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivEdgeInsets mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivEdgeInsets.f55192i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivEdgeInsets() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public DivEdgeInsets(@NotNull Expression<Long> expression, @Nullable Expression<Long> expression2, @NotNull Expression<Long> expression3, @NotNull Expression<Long> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<Long> expression6, @NotNull Expression<DivSizeUnit> expression7) {
        this.f55199a = expression;
        this.f55200b = expression2;
        this.f55201c = expression3;
        this.f55202d = expression4;
        this.f55203e = expression5;
        this.f55204f = expression6;
        this.f55205g = expression7;
    }

    public /* synthetic */ DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f55193j : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? f55194k : expression3, (i10 & 8) != 0 ? f55195l : expression4, (i10 & 16) == 0 ? expression5 : null, (i10 & 32) != 0 ? f55196m : expression6, (i10 & 64) != 0 ? f55197n : expression7);
    }

    public final boolean a(@Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divEdgeInsets == null || this.f55199a.evaluate(expressionResolver).longValue() != divEdgeInsets.f55199a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expression = this.f55200b;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divEdgeInsets.f55200b;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f55201c.evaluate(expressionResolver).longValue() != divEdgeInsets.f55201c.evaluate(expressionResolver2).longValue() || this.f55202d.evaluate(expressionResolver).longValue() != divEdgeInsets.f55202d.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expression3 = this.f55203e;
        Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divEdgeInsets.f55203e;
        return tn.p.f(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) && this.f55204f.evaluate(expressionResolver).longValue() == divEdgeInsets.f55204f.evaluate(expressionResolver2).longValue() && this.f55205g.evaluate(expressionResolver) == divEdgeInsets.f55205g.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55206h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivEdgeInsets.class).hashCode() + this.f55199a.hashCode();
        Expression<Long> expression = this.f55200b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f55201c.hashCode() + this.f55202d.hashCode();
        Expression<Long> expression2 = this.f55203e;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f55204f.hashCode() + this.f55205g.hashCode();
        this.f55206h = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
