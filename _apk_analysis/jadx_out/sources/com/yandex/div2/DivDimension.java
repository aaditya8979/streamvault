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

/* JADX INFO: compiled from: DivDimension.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivDimension implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55124d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f55125e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDimension> f55126f = new sn.p<ParsingEnvironment, JSONObject, DivDimension>() { // from class: com.yandex.div2.DivDimension$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDimension mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDimension.f55124d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f55127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55129c;

    /* JADX INFO: compiled from: DivDimension.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivDimension a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivDimension(@NotNull Expression<DivSizeUnit> expression, @NotNull Expression<Double> expression2) {
        this.f55127a = expression;
        this.f55128b = expression2;
    }

    public final boolean a(@Nullable DivDimension divDimension, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divDimension != null && this.f55127a.evaluate(expressionResolver) == divDimension.f55127a.evaluate(expressionResolver2)) {
            return (this.f55128b.evaluate(expressionResolver).doubleValue() > divDimension.f55128b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f55128b.evaluate(expressionResolver).doubleValue() == divDimension.f55128b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55129c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivDimension.class).hashCode() + this.f55127a.hashCode() + this.f55128b.hashCode();
        this.f55129c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
