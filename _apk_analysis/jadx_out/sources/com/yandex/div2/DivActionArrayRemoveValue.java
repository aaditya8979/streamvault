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

/* JADX INFO: compiled from: DivActionArrayRemoveValue.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionArrayRemoveValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54241d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValue> f54242e = new sn.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValue>() { // from class: com.yandex.div2.DivActionArrayRemoveValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayRemoveValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArrayRemoveValue.f54241d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54245c;

    /* JADX INFO: compiled from: DivActionArrayRemoveValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionArrayRemoveValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().T().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionArrayRemoveValue(@NotNull Expression<Long> expression, @NotNull Expression<String> expression2) {
        this.f54243a = expression;
        this.f54244b = expression2;
    }

    public final boolean a(@Nullable DivActionArrayRemoveValue divActionArrayRemoveValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionArrayRemoveValue != null && this.f54243a.evaluate(expressionResolver).longValue() == divActionArrayRemoveValue.f54243a.evaluate(expressionResolver2).longValue() && tn.p.f(this.f54244b.evaluate(expressionResolver), divActionArrayRemoveValue.f54244b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54245c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionArrayRemoveValue.class).hashCode() + this.f54243a.hashCode() + this.f54244b.hashCode();
        this.f54245c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
