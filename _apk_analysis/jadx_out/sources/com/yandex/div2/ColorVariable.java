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

/* JADX INFO: compiled from: ColorVariable.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ColorVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54056d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ColorVariable> f54057e = new sn.p<ParsingEnvironment, JSONObject, ColorVariable>() { // from class: com.yandex.div2.ColorVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ColorVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ColorVariable.f54056d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f54059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54060c;

    /* JADX INFO: compiled from: ColorVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ColorVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public ColorVariable(@NotNull String str, @NotNull Expression<Integer> expression) {
        this.f54058a = str;
        this.f54059b = expression;
    }

    public final boolean a(@Nullable ColorVariable colorVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return colorVariable != null && tn.p.f(this.f54058a, colorVariable.f54058a) && this.f54059b.evaluate(expressionResolver).intValue() == colorVariable.f54059b.evaluate(expressionResolver2).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54060c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(ColorVariable.class).hashCode() + this.f54058a.hashCode() + this.f54059b.hashCode();
        this.f54060c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
