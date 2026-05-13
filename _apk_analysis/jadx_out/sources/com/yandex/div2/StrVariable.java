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

/* JADX INFO: compiled from: StrVariable.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class StrVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58670d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, StrVariable> f58671e = new sn.p<ParsingEnvironment, JSONObject, StrVariable>() { // from class: com.yandex.div2.StrVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return StrVariable.f58670d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f58672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f58673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f58674c;

    /* JADX INFO: compiled from: StrVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final StrVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ga().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public StrVariable(@NotNull String str, @NotNull Expression<String> expression) {
        this.f58672a = str;
        this.f58673b = expression;
    }

    public final boolean a(@Nullable StrVariable strVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return strVariable != null && tn.p.f(this.f58672a, strVariable.f58672a) && tn.p.f(this.f58673b.evaluate(expressionResolver), strVariable.f58673b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58674c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(StrVariable.class).hashCode() + this.f58672a.hashCode() + this.f58673b.hashCode();
        this.f58674c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ga().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
