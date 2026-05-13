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

/* JADX INFO: compiled from: DivFixedCount.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFixedCount implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55294c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFixedCount> f55295d = new sn.p<ParsingEnvironment, JSONObject, DivFixedCount>() { // from class: com.yandex.div2.DivFixedCount$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedCount mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFixedCount.f55294c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f55297b;

    /* JADX INFO: compiled from: DivFixedCount.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFixedCount a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFixedCount(@NotNull Expression<Long> expression) {
        this.f55296a = expression;
    }

    public final boolean a(@Nullable DivFixedCount divFixedCount, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divFixedCount != null && this.f55296a.evaluate(expressionResolver).longValue() == divFixedCount.f55296a.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55297b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFixedCount.class).hashCode() + this.f55296a.hashCode();
        this.f55297b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
