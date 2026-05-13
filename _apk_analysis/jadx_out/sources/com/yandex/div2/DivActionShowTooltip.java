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

/* JADX INFO: compiled from: DivActionShowTooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionShowTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54414d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionShowTooltip> f54415e = new sn.p<ParsingEnvironment, JSONObject, DivActionShowTooltip>() { // from class: com.yandex.div2.DivActionShowTooltip$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionShowTooltip mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionShowTooltip.f54414d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<Boolean> f54417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54418c;

    /* JADX INFO: compiled from: DivActionShowTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionShowTooltip a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionShowTooltip(@NotNull Expression<String> expression, @Nullable Expression<Boolean> expression2) {
        this.f54416a = expression;
        this.f54417b = expression2;
    }

    public final boolean a(@Nullable DivActionShowTooltip divActionShowTooltip, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionShowTooltip == null || !tn.p.f(this.f54416a.evaluate(expressionResolver), divActionShowTooltip.f54416a.evaluate(expressionResolver2))) {
            return false;
        }
        Expression<Boolean> expression = this.f54417b;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divActionShowTooltip.f54417b;
        return tn.p.f(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54418c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionShowTooltip.class).hashCode() + this.f54416a.hashCode();
        Expression<Boolean> expression = this.f54417b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f54418c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
