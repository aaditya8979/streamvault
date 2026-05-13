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

/* JADX INFO: compiled from: DivMatchParentSize.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivMatchParentSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56202e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivMatchParentSize> f56203f = new sn.p<ParsingEnvironment, JSONObject, DivMatchParentSize>() { // from class: com.yandex.div2.DivMatchParentSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivMatchParentSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivMatchParentSize.f56202e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivSizeUnitValue f56204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivSizeUnitValue f56205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<Double> f56206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f56207d;

    /* JADX INFO: compiled from: DivMatchParentSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivMatchParentSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Y4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivMatchParentSize() {
        this(null, null, null, 7, null);
    }

    public DivMatchParentSize(@Nullable DivSizeUnitValue divSizeUnitValue, @Nullable DivSizeUnitValue divSizeUnitValue2, @Nullable Expression<Double> expression) {
        this.f56204a = divSizeUnitValue;
        this.f56205b = divSizeUnitValue2;
        this.f56206c = expression;
    }

    public /* synthetic */ DivMatchParentSize(DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, Expression expression, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divSizeUnitValue, (i10 & 2) != 0 ? null : divSizeUnitValue2, (i10 & 4) != 0 ? null : expression);
    }

    public final boolean a(@Nullable DivMatchParentSize divMatchParentSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divMatchParentSize == null) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.f56204a;
        if (!(divSizeUnitValue != null ? divSizeUnitValue.a(divMatchParentSize.f56204a, expressionResolver, expressionResolver2) : divMatchParentSize.f56204a == null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.f56205b;
        if (!(divSizeUnitValue2 != null ? divSizeUnitValue2.a(divMatchParentSize.f56205b, expressionResolver, expressionResolver2) : divMatchParentSize.f56205b == null)) {
            return false;
        }
        Expression<Double> expression = this.f56206c;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divMatchParentSize.f56206c;
        return tn.p.c(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56207d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivMatchParentSize.class).hashCode();
        DivSizeUnitValue divSizeUnitValue = this.f56204a;
        int iHash = iHashCode + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.f56205b;
        int iHash2 = iHash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        Expression<Double> expression = this.f56206c;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        this.f56207d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
