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

/* JADX INFO: compiled from: IntegerValue.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class IntegerValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58291c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, IntegerValue> f58292d = new sn.p<ParsingEnvironment, JSONObject, IntegerValue>() { // from class: com.yandex.div2.IntegerValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return IntegerValue.f58291c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f58294b;

    /* JADX INFO: compiled from: IntegerValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final IntegerValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public IntegerValue(@NotNull Expression<Long> expression) {
        this.f58293a = expression;
    }

    public final boolean a(@Nullable IntegerValue integerValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return integerValue != null && this.f58293a.evaluate(expressionResolver).longValue() == integerValue.f58293a.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58294b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(IntegerValue.class).hashCode() + this.f58293a.hashCode();
        this.f58294b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
