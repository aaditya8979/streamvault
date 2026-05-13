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

/* JADX INFO: compiled from: DivFadeTransition.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivFadeTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f55247f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f55250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFadeTransition> f55252k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f55255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f55257e;

    /* JADX INFO: compiled from: DivFadeTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFadeTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55248g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f55249h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f55250i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f55251j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55252k = new sn.p<ParsingEnvironment, JSONObject, DivFadeTransition>() { // from class: com.yandex.div2.DivFadeTransition$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFadeTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFadeTransition.f55247f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivFadeTransition() {
        this(null, null, null, null, 15, null);
    }

    public DivFadeTransition(@NotNull Expression<Double> expression, @NotNull Expression<Long> expression2, @NotNull Expression<DivAnimationInterpolator> expression3, @NotNull Expression<Long> expression4) {
        this.f55253a = expression;
        this.f55254b = expression2;
        this.f55255c = expression3;
        this.f55256d = expression4;
    }

    public /* synthetic */ DivFadeTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f55248g : expression, (i10 & 2) != 0 ? f55249h : expression2, (i10 & 4) != 0 ? f55250i : expression3, (i10 & 8) != 0 ? f55251j : expression4);
    }

    public final boolean a(@Nullable DivFadeTransition divFadeTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divFadeTransition == null) {
            return false;
        }
        return ((this.f55253a.evaluate(expressionResolver).doubleValue() > divFadeTransition.f55253a.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f55253a.evaluate(expressionResolver).doubleValue() == divFadeTransition.f55253a.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && b().evaluate(expressionResolver).longValue() == divFadeTransition.b().evaluate(expressionResolver2).longValue() && c().evaluate(expressionResolver) == divFadeTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divFadeTransition.d().evaluate(expressionResolver2).longValue();
    }

    @NotNull
    public Expression<Long> b() {
        return this.f55254b;
    }

    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f55255c;
    }

    @NotNull
    public Expression<Long> d() {
        return this.f55256d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55257e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFadeTransition.class).hashCode() + this.f55253a.hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f55257e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
