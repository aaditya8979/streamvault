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

/* JADX INFO: compiled from: DivTextRangeMaskSolid.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTextRangeMaskSolid implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f57837d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57838e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolid> f57839f = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolid>() { // from class: com.yandex.div2.DivTextRangeMaskSolid$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskSolid mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskSolid.f57837d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f57840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f57842c;

    /* JADX INFO: compiled from: DivTextRangeMaskSolid.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeMaskSolid a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivTextRangeMaskSolid(@NotNull Expression<Integer> expression, @NotNull Expression<Boolean> expression2) {
        this.f57840a = expression;
        this.f57841b = expression2;
    }

    public final boolean a(@Nullable DivTextRangeMaskSolid divTextRangeMaskSolid, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divTextRangeMaskSolid != null && this.f57840a.evaluate(expressionResolver).intValue() == divTextRangeMaskSolid.f57840a.evaluate(expressionResolver2).intValue() && this.f57841b.evaluate(expressionResolver).booleanValue() == divTextRangeMaskSolid.f57841b.evaluate(expressionResolver2).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57842c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTextRangeMaskSolid.class).hashCode() + this.f57840a.hashCode() + this.f57841b.hashCode();
        this.f57842c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
