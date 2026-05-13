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

/* JADX INFO: compiled from: NumberVariable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NumberVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58619d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, NumberVariable> f58620e = new sn.p<ParsingEnvironment, JSONObject, NumberVariable>() { // from class: com.yandex.div2.NumberVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final NumberVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return NumberVariable.f58619d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f58621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f58622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f58623c;

    /* JADX INFO: compiled from: NumberVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final NumberVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().R9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public NumberVariable(@NotNull String str, @NotNull Expression<Double> expression) {
        this.f58621a = str;
        this.f58622b = expression;
    }

    public final boolean a(@Nullable NumberVariable numberVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (numberVariable != null && tn.p.f(this.f58621a, numberVariable.f58621a)) {
            return (this.f58622b.evaluate(expressionResolver).doubleValue() > numberVariable.f58622b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f58622b.evaluate(expressionResolver).doubleValue() == numberVariable.f58622b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58623c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(NumberVariable.class).hashCode() + this.f58621a.hashCode() + this.f58622b.hashCode();
        this.f58623c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
