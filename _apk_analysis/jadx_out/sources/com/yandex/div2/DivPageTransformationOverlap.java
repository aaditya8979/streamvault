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

/* JADX INFO: compiled from: DivPageTransformationOverlap.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivPageTransformationOverlap implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f56293h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlap> f56300o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f56301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Integer f56307g;

    /* JADX INFO: compiled from: DivPageTransformationOverlap.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPageTransformationOverlap a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().t5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56294i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56295j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56296k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56297l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56298m = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56299n = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f56300o = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlap>() { // from class: com.yandex.div2.DivPageTransformationOverlap$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationOverlap mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPageTransformationOverlap.f56293h.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivPageTransformationOverlap() {
        this(null, null, null, null, null, null, 63, null);
    }

    public DivPageTransformationOverlap(@NotNull Expression<DivAnimationInterpolator> expression, @NotNull Expression<Double> expression2, @NotNull Expression<Double> expression3, @NotNull Expression<Double> expression4, @NotNull Expression<Double> expression5, @NotNull Expression<Boolean> expression6) {
        this.f56301a = expression;
        this.f56302b = expression2;
        this.f56303c = expression3;
        this.f56304d = expression4;
        this.f56305e = expression5;
        this.f56306f = expression6;
    }

    public /* synthetic */ DivPageTransformationOverlap(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56294i : expression, (i10 & 2) != 0 ? f56295j : expression2, (i10 & 4) != 0 ? f56296k : expression3, (i10 & 8) != 0 ? f56297l : expression4, (i10 & 16) != 0 ? f56298m : expression5, (i10 & 32) != 0 ? f56299n : expression6);
    }

    public final boolean a(@Nullable DivPageTransformationOverlap divPageTransformationOverlap, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPageTransformationOverlap == null || this.f56301a.evaluate(expressionResolver) != divPageTransformationOverlap.f56301a.evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f56302b.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f56302b.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (!(this.f56303c.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f56303c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f56304d.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f56304d.evaluate(expressionResolver2).doubleValue()) {
            return ((this.f56305e.evaluate(expressionResolver).doubleValue() > divPageTransformationOverlap.f56305e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56305e.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f56305e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f56306f.evaluate(expressionResolver).booleanValue() == divPageTransformationOverlap.f56306f.evaluate(expressionResolver2).booleanValue();
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56307g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPageTransformationOverlap.class).hashCode() + this.f56301a.hashCode() + this.f56302b.hashCode() + this.f56303c.hashCode() + this.f56304d.hashCode() + this.f56305e.hashCode() + this.f56306f.hashCode();
        this.f56307g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
