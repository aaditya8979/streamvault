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

/* JADX INFO: compiled from: StrValue.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class StrValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58663c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, StrValue> f58664d = new sn.p<ParsingEnvironment, JSONObject, StrValue>() { // from class: com.yandex.div2.StrValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return StrValue.f58663c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f58665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f58666b;

    /* JADX INFO: compiled from: StrValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final StrValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().da().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public StrValue(@NotNull Expression<String> expression) {
        this.f58665a = expression;
    }

    public final boolean a(@Nullable StrValue strValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (strValue == null) {
            return false;
        }
        return tn.p.f(this.f58665a.evaluate(expressionResolver), strValue.f58665a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58666b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(StrValue.class).hashCode() + this.f58665a.hashCode();
        this.f58666b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().da().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
