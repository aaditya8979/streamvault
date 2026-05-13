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

/* JADX INFO: compiled from: DictVariable.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DictVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54086d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DictVariable> f54087e = new sn.p<ParsingEnvironment, JSONObject, DictVariable>() { // from class: com.yandex.div2.DictVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DictVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DictVariable.f54086d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<JSONObject> f54089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54090c;

    /* JADX INFO: compiled from: DictVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DictVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DictVariable(@NotNull String str, @NotNull Expression<JSONObject> expression) {
        this.f54088a = str;
        this.f54089b = expression;
    }

    public final boolean a(@Nullable DictVariable dictVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return dictVariable != null && tn.p.f(this.f54088a, dictVariable.f54088a) && tn.p.f(this.f54089b.evaluate(expressionResolver), dictVariable.f54089b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54090c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DictVariable.class).hashCode() + this.f54088a.hashCode() + this.f54089b.hashCode();
        this.f54090c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
