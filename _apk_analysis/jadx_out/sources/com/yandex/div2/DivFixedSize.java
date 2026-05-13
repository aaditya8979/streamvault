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

/* JADX INFO: compiled from: DivFixedSize.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFixedSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55329d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f55330e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFixedSize> f55331f = new sn.p<ParsingEnvironment, JSONObject, DivFixedSize>() { // from class: com.yandex.div2.DivFixedSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFixedSize.f55329d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f55332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55334c;

    /* JADX INFO: compiled from: DivFixedSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFixedSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFixedSize(@NotNull Expression<DivSizeUnit> expression, @NotNull Expression<Long> expression2) {
        this.f55332a = expression;
        this.f55333b = expression2;
    }

    public /* synthetic */ DivFixedSize(Expression expression, Expression expression2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f55330e : expression, expression2);
    }

    public final boolean a(@Nullable DivFixedSize divFixedSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divFixedSize != null && this.f55332a.evaluate(expressionResolver) == divFixedSize.f55332a.evaluate(expressionResolver2) && this.f55333b.evaluate(expressionResolver).longValue() == divFixedSize.f55333b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55334c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFixedSize.class).hashCode() + this.f55332a.hashCode() + this.f55333b.hashCode();
        this.f55334c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
