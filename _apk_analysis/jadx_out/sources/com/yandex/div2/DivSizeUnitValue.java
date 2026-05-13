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

/* JADX INFO: compiled from: DivSizeUnitValue.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSizeUnitValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56958d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56959e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSizeUnitValue> f56960f = new sn.p<ParsingEnvironment, JSONObject, DivSizeUnitValue>() { // from class: com.yandex.div2.DivSizeUnitValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeUnitValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSizeUnitValue.f56958d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f56961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56963c;

    /* JADX INFO: compiled from: DivSizeUnitValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSizeUnitValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivSizeUnitValue(@NotNull Expression<DivSizeUnit> expression, @NotNull Expression<Long> expression2) {
        this.f56961a = expression;
        this.f56962b = expression2;
    }

    public final boolean a(@Nullable DivSizeUnitValue divSizeUnitValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divSizeUnitValue != null && this.f56961a.evaluate(expressionResolver) == divSizeUnitValue.f56961a.evaluate(expressionResolver2) && this.f56962b.evaluate(expressionResolver).longValue() == divSizeUnitValue.f56962b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56963c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSizeUnitValue.class).hashCode() + this.f56961a.hashCode() + this.f56962b.hashCode();
        this.f56963c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
