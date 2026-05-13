package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariable.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ArrayVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54024d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ArrayVariable> f54025e = new sn.p<ParsingEnvironment, JSONObject, ArrayVariable>() { // from class: com.yandex.div2.ArrayVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ArrayVariable.f54024d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<JSONArray> f54027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54028c;

    /* JADX INFO: compiled from: ArrayVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ArrayVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public ArrayVariable(@NotNull String str, @NotNull Expression<JSONArray> expression) {
        this.f54026a = str;
        this.f54027b = expression;
    }

    public final boolean a(@Nullable ArrayVariable arrayVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return arrayVariable != null && tn.p.f(this.f54026a, arrayVariable.f54026a) && tn.p.f(this.f54027b.evaluate(expressionResolver), arrayVariable.f54027b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54028c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(ArrayVariable.class).hashCode() + this.f54026a.hashCode() + this.f54027b.hashCode();
        this.f54028c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
