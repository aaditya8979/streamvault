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

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivDefaultIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55115c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f55116d = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacement> f55117e = new sn.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacement>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacement$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDefaultIndicatorItemPlacement mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDefaultIndicatorItemPlacement.f55115c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f55118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f55119b;

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivDefaultIndicatorItemPlacement a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivDefaultIndicatorItemPlacement() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivDefaultIndicatorItemPlacement(@NotNull DivFixedSize divFixedSize) {
        this.f55118a = divFixedSize;
    }

    public /* synthetic */ DivDefaultIndicatorItemPlacement(DivFixedSize divFixedSize, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f55116d : divFixedSize);
    }

    public final boolean a(@Nullable DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divDefaultIndicatorItemPlacement == null) {
            return false;
        }
        return this.f55118a.a(divDefaultIndicatorItemPlacement.f55118a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55119b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivDefaultIndicatorItemPlacement.class).hashCode() + this.f55118a.hash();
        this.f55119b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
