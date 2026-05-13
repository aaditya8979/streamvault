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

/* JADX INFO: compiled from: DivPageTransformationSlide.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivPageTransformationSlide implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56337g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformationSlide> f56343m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f56344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f56349f;

    /* JADX INFO: compiled from: DivPageTransformationSlide.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPageTransformationSlide a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56338h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56339i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56340j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56341k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56342l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56343m = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformationSlide>() { // from class: com.yandex.div2.DivPageTransformationSlide$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationSlide mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPageTransformationSlide.f56337g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivPageTransformationSlide() {
        this(null, null, null, null, null, 31, null);
    }

    public DivPageTransformationSlide(@NotNull Expression<DivAnimationInterpolator> expression, @NotNull Expression<Double> expression2, @NotNull Expression<Double> expression3, @NotNull Expression<Double> expression4, @NotNull Expression<Double> expression5) {
        this.f56344a = expression;
        this.f56345b = expression2;
        this.f56346c = expression3;
        this.f56347d = expression4;
        this.f56348e = expression5;
    }

    public /* synthetic */ DivPageTransformationSlide(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56338h : expression, (i10 & 2) != 0 ? f56339i : expression2, (i10 & 4) != 0 ? f56340j : expression3, (i10 & 8) != 0 ? f56341k : expression4, (i10 & 16) != 0 ? f56342l : expression5);
    }

    public final boolean a(@Nullable DivPageTransformationSlide divPageTransformationSlide, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPageTransformationSlide == null || this.f56344a.evaluate(expressionResolver) != divPageTransformationSlide.f56344a.evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f56345b.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f56345b.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (!(this.f56346c.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f56346c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f56347d.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f56347d.evaluate(expressionResolver2).doubleValue()) {
            return (this.f56348e.evaluate(expressionResolver).doubleValue() > divPageTransformationSlide.f56348e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56348e.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f56348e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56349f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPageTransformationSlide.class).hashCode() + this.f56344a.hashCode() + this.f56345b.hashCode() + this.f56346c.hashCode() + this.f56347d.hashCode() + this.f56348e.hashCode();
        this.f56349f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
