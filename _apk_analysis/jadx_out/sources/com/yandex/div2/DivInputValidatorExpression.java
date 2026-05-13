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

/* JADX INFO: compiled from: DivInputValidatorExpression.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputValidatorExpression implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56136f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56137g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorExpression> f56138h = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorExpression>() { // from class: com.yandex.div2.DivInputValidatorExpression$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorExpression mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorExpression.f56136f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f56141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f56142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f56143e;

    /* JADX INFO: compiled from: DivInputValidatorExpression.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputValidatorExpression a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().D4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivInputValidatorExpression(@NotNull Expression<Boolean> expression, @NotNull Expression<Boolean> expression2, @NotNull Expression<String> expression3, @NotNull String str) {
        this.f56139a = expression;
        this.f56140b = expression2;
        this.f56141c = expression3;
        this.f56142d = str;
    }

    public final boolean a(@Nullable DivInputValidatorExpression divInputValidatorExpression, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divInputValidatorExpression != null && this.f56139a.evaluate(expressionResolver).booleanValue() == divInputValidatorExpression.f56139a.evaluate(expressionResolver2).booleanValue() && this.f56140b.evaluate(expressionResolver).booleanValue() == divInputValidatorExpression.f56140b.evaluate(expressionResolver2).booleanValue() && tn.p.f(this.f56141c.evaluate(expressionResolver), divInputValidatorExpression.f56141c.evaluate(expressionResolver2)) && tn.p.f(this.f56142d, divInputValidatorExpression.f56142d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56143e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInputValidatorExpression.class).hashCode() + this.f56139a.hashCode() + this.f56140b.hashCode() + this.f56141c.hashCode() + this.f56142d.hashCode();
        this.f56143e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
