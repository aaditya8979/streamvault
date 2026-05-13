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

/* JADX INFO: compiled from: DivShadow.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivShadow implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56907f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShadow> f56911j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f56914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DivPoint f56915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f56916e;

    /* JADX INFO: compiled from: DivShadow.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivShadow a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56908g = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f56909h = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f56910i = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f56911j = new sn.p<ParsingEnvironment, JSONObject, DivShadow>() { // from class: com.yandex.div2.DivShadow$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivShadow mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivShadow.f56907f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivShadow(@NotNull Expression<Double> expression, @NotNull Expression<Long> expression2, @NotNull Expression<Integer> expression3, @NotNull DivPoint divPoint) {
        this.f56912a = expression;
        this.f56913b = expression2;
        this.f56914c = expression3;
        this.f56915d = divPoint;
    }

    public final boolean a(@Nullable DivShadow divShadow, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divShadow == null) {
            return false;
        }
        return ((this.f56912a.evaluate(expressionResolver).doubleValue() > divShadow.f56912a.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56912a.evaluate(expressionResolver).doubleValue() == divShadow.f56912a.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f56913b.evaluate(expressionResolver).longValue() == divShadow.f56913b.evaluate(expressionResolver2).longValue() && this.f56914c.evaluate(expressionResolver).intValue() == divShadow.f56914c.evaluate(expressionResolver2).intValue() && this.f56915d.a(divShadow.f56915d, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56916e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivShadow.class).hashCode() + this.f56912a.hashCode() + this.f56913b.hashCode() + this.f56914c.hashCode() + this.f56915d.hash();
        this.f56916e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
