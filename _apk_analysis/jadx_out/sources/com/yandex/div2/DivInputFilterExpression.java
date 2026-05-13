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

/* JADX INFO: compiled from: DivInputFilterExpression.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivInputFilterExpression implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56006c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputFilterExpression> f56007d = new sn.p<ParsingEnvironment, JSONObject, DivInputFilterExpression>() { // from class: com.yandex.div2.DivInputFilterExpression$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterExpression mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterExpression.f56006c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56009b;

    /* JADX INFO: compiled from: DivInputFilterExpression.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputFilterExpression a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivInputFilterExpression(@NotNull Expression<Boolean> expression) {
        this.f56008a = expression;
    }

    public final boolean a(@Nullable DivInputFilterExpression divInputFilterExpression, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divInputFilterExpression != null && this.f56008a.evaluate(expressionResolver).booleanValue() == divInputFilterExpression.f56008a.evaluate(expressionResolver2).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56009b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInputFilterExpression.class).hashCode() + this.f56008a.hashCode();
        this.f56009b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
