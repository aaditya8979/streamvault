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

/* JADX INFO: compiled from: DivActionArrayInsertValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionArrayInsertValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54230e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValue> f54231f = new sn.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValue>() { // from class: com.yandex.div2.DivActionArrayInsertValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayInsertValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArrayInsertValue.f54230e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivTypedValue f54233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54235d;

    /* JADX INFO: compiled from: DivActionArrayInsertValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionArrayInsertValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Q().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionArrayInsertValue(@Nullable Expression<Long> expression, @NotNull DivTypedValue divTypedValue, @NotNull Expression<String> expression2) {
        this.f54232a = expression;
        this.f54233b = divTypedValue;
        this.f54234c = expression2;
    }

    public final boolean a(@Nullable DivActionArrayInsertValue divActionArrayInsertValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionArrayInsertValue == null) {
            return false;
        }
        Expression<Long> expression = this.f54232a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divActionArrayInsertValue.f54232a;
        return tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f54233b.a(divActionArrayInsertValue.f54233b, expressionResolver, expressionResolver2) && tn.p.f(this.f54234c.evaluate(expressionResolver), divActionArrayInsertValue.f54234c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54235d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionArrayInsertValue.class).hashCode();
        Expression<Long> expression = this.f54232a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f54233b.hash() + this.f54234c.hashCode();
        this.f54235d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
