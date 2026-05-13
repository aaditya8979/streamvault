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

/* JADX INFO: compiled from: DivRadialGradientFixedCenter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivRadialGradientFixedCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56595d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56596e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientFixedCenter> f56597f = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientFixedCenter>() { // from class: com.yandex.div2.DivRadialGradientFixedCenter$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientFixedCenter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientFixedCenter.f56595d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f56598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56600c;

    /* JADX INFO: compiled from: DivRadialGradientFixedCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradientFixedCenter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().i6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivRadialGradientFixedCenter(@NotNull Expression<DivSizeUnit> expression, @NotNull Expression<Long> expression2) {
        this.f56598a = expression;
        this.f56599b = expression2;
    }

    public final boolean a(@Nullable DivRadialGradientFixedCenter divRadialGradientFixedCenter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divRadialGradientFixedCenter != null && this.f56598a.evaluate(expressionResolver) == divRadialGradientFixedCenter.f56598a.evaluate(expressionResolver2) && this.f56599b.evaluate(expressionResolver).longValue() == divRadialGradientFixedCenter.f56599b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56600c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivRadialGradientFixedCenter.class).hashCode() + this.f56598a.hashCode() + this.f56599b.hashCode();
        this.f56600c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
