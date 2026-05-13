package com.yandex.div2;

import ah.f6;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMask.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivCurrencyInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55001d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCurrencyInputMask> f55002e = new sn.p<ParsingEnvironment, JSONObject, DivCurrencyInputMask>() { // from class: com.yandex.div2.DivCurrencyInputMask$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCurrencyInputMask mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCurrencyInputMask.f55001d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<String> f55003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f55004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55005c;

    /* JADX INFO: compiled from: DivCurrencyInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCurrencyInputMask a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().y2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivCurrencyInputMask(@Nullable Expression<String> expression, @NotNull String str) {
        this.f55003a = expression;
        this.f55004b = str;
    }

    @Override // ah.f6
    @NotNull
    public String a() {
        return this.f55004b;
    }

    public final boolean b(@Nullable DivCurrencyInputMask divCurrencyInputMask, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divCurrencyInputMask == null) {
            return false;
        }
        Expression<String> expression = this.f55003a;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divCurrencyInputMask.f55003a;
        return tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && tn.p.f(a(), divCurrencyInputMask.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55005c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCurrencyInputMask.class).hashCode();
        Expression<String> expression = this.f55003a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + a().hashCode();
        this.f55005c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().y2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
