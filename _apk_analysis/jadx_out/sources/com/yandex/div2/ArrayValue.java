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

/* JADX INFO: compiled from: ArrayValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54017c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ArrayValue> f54018d = new sn.p<ParsingEnvironment, JSONObject, ArrayValue>() { // from class: com.yandex.div2.ArrayValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ArrayValue.f54017c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<JSONArray> f54019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54020b;

    /* JADX INFO: compiled from: ArrayValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ArrayValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().a().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public ArrayValue(@NotNull Expression<JSONArray> expression) {
        this.f54019a = expression;
    }

    public final boolean a(@Nullable ArrayValue arrayValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (arrayValue == null) {
            return false;
        }
        return tn.p.f(this.f54019a.evaluate(expressionResolver), arrayValue.f54019a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54020b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(ArrayValue.class).hashCode() + this.f54019a.hashCode();
        this.f54020b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
