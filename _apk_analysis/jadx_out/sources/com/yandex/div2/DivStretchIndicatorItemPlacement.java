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

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivStretchIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f57258d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f57259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacement> f57261g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f57262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f57264c;

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivStretchIndicatorItemPlacement a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57259e = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f57260f = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f57261g = new sn.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacement>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacement$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStretchIndicatorItemPlacement mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivStretchIndicatorItemPlacement.f57258d.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivStretchIndicatorItemPlacement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivStretchIndicatorItemPlacement(@NotNull DivFixedSize divFixedSize, @NotNull Expression<Long> expression) {
        this.f57262a = divFixedSize;
        this.f57263b = expression;
    }

    public /* synthetic */ DivStretchIndicatorItemPlacement(DivFixedSize divFixedSize, Expression expression, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f57259e : divFixedSize, (i10 & 2) != 0 ? f57260f : expression);
    }

    public final boolean a(@Nullable DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divStretchIndicatorItemPlacement != null && this.f57262a.a(divStretchIndicatorItemPlacement.f57262a, expressionResolver, expressionResolver2) && this.f57263b.evaluate(expressionResolver).longValue() == divStretchIndicatorItemPlacement.f57263b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57264c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivStretchIndicatorItemPlacement.class).hashCode() + this.f57262a.hash() + this.f57263b.hashCode();
        this.f57264c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
