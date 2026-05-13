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

/* JADX INFO: compiled from: DivActionDictSetValue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionDictSetValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54282e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionDictSetValue> f54283f = new sn.p<ParsingEnvironment, JSONObject, DivActionDictSetValue>() { // from class: com.yandex.div2.DivActionDictSetValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDictSetValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionDictSetValue.f54282e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivTypedValue f54285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54287d;

    /* JADX INFO: compiled from: DivActionDictSetValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionDictSetValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().i0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionDictSetValue(@NotNull Expression<String> expression, @Nullable DivTypedValue divTypedValue, @NotNull Expression<String> expression2) {
        this.f54284a = expression;
        this.f54285b = divTypedValue;
        this.f54286c = expression2;
    }

    public final boolean a(@Nullable DivActionDictSetValue divActionDictSetValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionDictSetValue == null || !tn.p.f(this.f54284a.evaluate(expressionResolver), divActionDictSetValue.f54284a.evaluate(expressionResolver2))) {
            return false;
        }
        DivTypedValue divTypedValue = this.f54285b;
        return (divTypedValue != null ? divTypedValue.a(divActionDictSetValue.f54285b, expressionResolver, expressionResolver2) : divActionDictSetValue.f54285b == null) && tn.p.f(this.f54286c.evaluate(expressionResolver), divActionDictSetValue.f54286c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54287d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionDictSetValue.class).hashCode() + this.f54284a.hashCode();
        DivTypedValue divTypedValue = this.f54285b;
        int iHash = iHashCode + (divTypedValue != null ? divTypedValue.hash() : 0) + this.f54286c.hashCode();
        this.f54287d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
