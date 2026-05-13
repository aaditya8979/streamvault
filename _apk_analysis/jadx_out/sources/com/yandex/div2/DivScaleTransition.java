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

/* JADX INFO: compiled from: DivScaleTransition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivScaleTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f56676h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivScaleTransition> f56683o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f56685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Integer f56690g;

    /* JADX INFO: compiled from: DivScaleTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivScaleTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().A6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56677i = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f56678j = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f56679k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56680l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56681m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56682n = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f56683o = new sn.p<ParsingEnvironment, JSONObject, DivScaleTransition>() { // from class: com.yandex.div2.DivScaleTransition$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivScaleTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivScaleTransition.f56676h.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivScaleTransition() {
        this(null, null, null, null, null, null, 63, null);
    }

    public DivScaleTransition(@NotNull Expression<Long> expression, @NotNull Expression<DivAnimationInterpolator> expression2, @NotNull Expression<Double> expression3, @NotNull Expression<Double> expression4, @NotNull Expression<Double> expression5, @NotNull Expression<Long> expression6) {
        this.f56684a = expression;
        this.f56685b = expression2;
        this.f56686c = expression3;
        this.f56687d = expression4;
        this.f56688e = expression5;
        this.f56689f = expression6;
    }

    public /* synthetic */ DivScaleTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56677i : expression, (i10 & 2) != 0 ? f56678j : expression2, (i10 & 4) != 0 ? f56679k : expression3, (i10 & 8) != 0 ? f56680l : expression4, (i10 & 16) != 0 ? f56681m : expression5, (i10 & 32) != 0 ? f56682n : expression6);
    }

    public final boolean a(@Nullable DivScaleTransition divScaleTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divScaleTransition == null || b().evaluate(expressionResolver).longValue() != divScaleTransition.b().evaluate(expressionResolver2).longValue() || c().evaluate(expressionResolver) != divScaleTransition.c().evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f56686c.evaluate(expressionResolver).doubleValue() == divScaleTransition.f56686c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f56687d.evaluate(expressionResolver).doubleValue() == divScaleTransition.f56687d.evaluate(expressionResolver2).doubleValue()) {
            return ((this.f56688e.evaluate(expressionResolver).doubleValue() > divScaleTransition.f56688e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56688e.evaluate(expressionResolver).doubleValue() == divScaleTransition.f56688e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && d().evaluate(expressionResolver).longValue() == divScaleTransition.d().evaluate(expressionResolver2).longValue();
        }
        return false;
    }

    @NotNull
    public Expression<Long> b() {
        return this.f56684a;
    }

    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f56685b;
    }

    @NotNull
    public Expression<Long> d() {
        return this.f56689f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56690g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivScaleTransition.class).hashCode() + b().hashCode() + c().hashCode() + this.f56686c.hashCode() + this.f56687d.hashCode() + this.f56688e.hashCode() + d().hashCode();
        this.f56690g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
