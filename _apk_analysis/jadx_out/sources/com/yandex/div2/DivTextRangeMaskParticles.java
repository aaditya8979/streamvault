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

/* JADX INFO: compiled from: DivTextRangeMaskParticles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTextRangeMaskParticles implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f57814g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f57818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticles> f57819l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f57820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f57824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f57825f;

    /* JADX INFO: compiled from: DivTextRangeMaskParticles.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeMaskParticles a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().G8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57815h = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f57816i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f57817j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57818k = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f57819l = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticles>() { // from class: com.yandex.div2.DivTextRangeMaskParticles$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextRangeMaskParticles mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTextRangeMaskParticles.f57814g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivTextRangeMaskParticles(@NotNull Expression<Integer> expression, @NotNull Expression<Double> expression2, @NotNull Expression<Boolean> expression3, @NotNull Expression<Boolean> expression4, @NotNull DivFixedSize divFixedSize) {
        this.f57820a = expression;
        this.f57821b = expression2;
        this.f57822c = expression3;
        this.f57823d = expression4;
        this.f57824e = divFixedSize;
    }

    public final boolean a(@Nullable DivTextRangeMaskParticles divTextRangeMaskParticles, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTextRangeMaskParticles != null && this.f57820a.evaluate(expressionResolver).intValue() == divTextRangeMaskParticles.f57820a.evaluate(expressionResolver2).intValue()) {
            return ((this.f57821b.evaluate(expressionResolver).doubleValue() > divTextRangeMaskParticles.f57821b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f57821b.evaluate(expressionResolver).doubleValue() == divTextRangeMaskParticles.f57821b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f57822c.evaluate(expressionResolver).booleanValue() == divTextRangeMaskParticles.f57822c.evaluate(expressionResolver2).booleanValue() && this.f57823d.evaluate(expressionResolver).booleanValue() == divTextRangeMaskParticles.f57823d.evaluate(expressionResolver2).booleanValue() && this.f57824e.a(divTextRangeMaskParticles.f57824e, expressionResolver, expressionResolver2);
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57825f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTextRangeMaskParticles.class).hashCode() + this.f57820a.hashCode() + this.f57821b.hashCode() + this.f57822c.hashCode() + this.f57823d.hashCode() + this.f57824e.hash();
        this.f57825f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
