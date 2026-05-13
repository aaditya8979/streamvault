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

/* JADX INFO: compiled from: IntegerVariable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class IntegerVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58298d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, IntegerVariable> f58299e = new sn.p<ParsingEnvironment, JSONObject, IntegerVariable>() { // from class: com.yandex.div2.IntegerVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return IntegerVariable.f58298d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f58300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f58302c;

    /* JADX INFO: compiled from: IntegerVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final IntegerVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public IntegerVariable(@NotNull String str, @NotNull Expression<Long> expression) {
        this.f58300a = str;
        this.f58301b = expression;
    }

    public final boolean a(@Nullable IntegerVariable integerVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return integerVariable != null && tn.p.f(this.f58300a, integerVariable.f58300a) && this.f58301b.evaluate(expressionResolver).longValue() == integerVariable.f58301b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58302c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(IntegerVariable.class).hashCode() + this.f58300a.hashCode() + this.f58301b.hashCode();
        this.f58302c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
