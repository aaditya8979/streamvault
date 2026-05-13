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

/* JADX INFO: compiled from: DivActionArraySetValue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionArraySetValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54250e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionArraySetValue> f54251f = new sn.p<ParsingEnvironment, JSONObject, DivActionArraySetValue>() { // from class: com.yandex.div2.DivActionArraySetValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArraySetValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArraySetValue.f54250e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivTypedValue f54253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54255d;

    /* JADX INFO: compiled from: DivActionArraySetValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionArraySetValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().W().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionArraySetValue(@NotNull Expression<Long> expression, @NotNull DivTypedValue divTypedValue, @NotNull Expression<String> expression2) {
        this.f54252a = expression;
        this.f54253b = divTypedValue;
        this.f54254c = expression2;
    }

    public final boolean a(@Nullable DivActionArraySetValue divActionArraySetValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionArraySetValue != null && this.f54252a.evaluate(expressionResolver).longValue() == divActionArraySetValue.f54252a.evaluate(expressionResolver2).longValue() && this.f54253b.a(divActionArraySetValue.f54253b, expressionResolver, expressionResolver2) && tn.p.f(this.f54254c.evaluate(expressionResolver), divActionArraySetValue.f54254c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54255d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionArraySetValue.class).hashCode() + this.f54252a.hashCode() + this.f54253b.hash() + this.f54254c.hashCode();
        this.f54255d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
