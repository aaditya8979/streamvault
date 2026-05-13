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

/* JADX INFO: compiled from: DivChangeBoundsTransition.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivChangeBoundsTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54696e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransition> f54700i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f54702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54704d;

    /* JADX INFO: compiled from: DivChangeBoundsTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivChangeBoundsTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54697f = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f54698g = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f54699h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54700i = new sn.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransition>() { // from class: com.yandex.div2.DivChangeBoundsTransition$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivChangeBoundsTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivChangeBoundsTransition.f54696e.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivChangeBoundsTransition() {
        this(null, null, null, 7, null);
    }

    public DivChangeBoundsTransition(@NotNull Expression<Long> expression, @NotNull Expression<DivAnimationInterpolator> expression2, @NotNull Expression<Long> expression3) {
        this.f54701a = expression;
        this.f54702b = expression2;
        this.f54703c = expression3;
    }

    public /* synthetic */ DivChangeBoundsTransition(Expression expression, Expression expression2, Expression expression3, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f54697f : expression, (i10 & 2) != 0 ? f54698g : expression2, (i10 & 4) != 0 ? f54699h : expression3);
    }

    public final boolean a(@Nullable DivChangeBoundsTransition divChangeBoundsTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divChangeBoundsTransition != null && b().evaluate(expressionResolver).longValue() == divChangeBoundsTransition.b().evaluate(expressionResolver2).longValue() && c().evaluate(expressionResolver) == divChangeBoundsTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divChangeBoundsTransition.d().evaluate(expressionResolver2).longValue();
    }

    @NotNull
    public Expression<Long> b() {
        return this.f54701a;
    }

    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f54702b;
    }

    @NotNull
    public Expression<Long> d() {
        return this.f54703c;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54704d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivChangeBoundsTransition.class).hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f54704d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
