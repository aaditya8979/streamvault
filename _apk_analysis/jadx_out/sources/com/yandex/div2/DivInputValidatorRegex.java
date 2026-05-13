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

/* JADX INFO: compiled from: DivInputValidatorRegex.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivInputValidatorRegex implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56151f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56152g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorRegex> f56153h = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorRegex>() { // from class: com.yandex.div2.DivInputValidatorRegex$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorRegex mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorRegex.f56151f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f56155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f56156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f56157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f56158e;

    /* JADX INFO: compiled from: DivInputValidatorRegex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputValidatorRegex a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivInputValidatorRegex(@NotNull Expression<Boolean> expression, @NotNull Expression<String> expression2, @NotNull Expression<String> expression3, @NotNull String str) {
        this.f56154a = expression;
        this.f56155b = expression2;
        this.f56156c = expression3;
        this.f56157d = str;
    }

    public final boolean a(@Nullable DivInputValidatorRegex divInputValidatorRegex, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divInputValidatorRegex != null && this.f56154a.evaluate(expressionResolver).booleanValue() == divInputValidatorRegex.f56154a.evaluate(expressionResolver2).booleanValue() && tn.p.f(this.f56155b.evaluate(expressionResolver), divInputValidatorRegex.f56155b.evaluate(expressionResolver2)) && tn.p.f(this.f56156c.evaluate(expressionResolver), divInputValidatorRegex.f56156c.evaluate(expressionResolver2)) && tn.p.f(this.f56157d, divInputValidatorRegex.f56157d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56158e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInputValidatorRegex.class).hashCode() + this.f56154a.hashCode() + this.f56155b.hashCode() + this.f56156c.hashCode() + this.f56157d.hashCode();
        this.f56158e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
