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

/* JADX INFO: compiled from: DivWrapContentSize.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivWrapContentSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f58268e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivWrapContentSize> f58269f = new sn.p<ParsingEnvironment, JSONObject, DivWrapContentSize>() { // from class: com.yandex.div2.DivWrapContentSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivWrapContentSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivWrapContentSize.f58268e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Boolean> f58270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivSizeUnitValue f58271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DivSizeUnitValue f58272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f58273d;

    /* JADX INFO: compiled from: DivWrapContentSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivWrapContentSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivWrapContentSize() {
        this(null, null, null, 7, null);
    }

    public DivWrapContentSize(@Nullable Expression<Boolean> expression, @Nullable DivSizeUnitValue divSizeUnitValue, @Nullable DivSizeUnitValue divSizeUnitValue2) {
        this.f58270a = expression;
        this.f58271b = divSizeUnitValue;
        this.f58272c = divSizeUnitValue2;
    }

    public /* synthetic */ DivWrapContentSize(Expression expression, DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divSizeUnitValue, (i10 & 4) != 0 ? null : divSizeUnitValue2);
    }

    public final boolean a(@Nullable DivWrapContentSize divWrapContentSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divWrapContentSize == null) {
            return false;
        }
        Expression<Boolean> expression = this.f58270a;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divWrapContentSize.f58270a;
        if (!tn.p.f(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.f58271b;
        if (!(divSizeUnitValue != null ? divSizeUnitValue.a(divWrapContentSize.f58271b, expressionResolver, expressionResolver2) : divWrapContentSize.f58271b == null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.f58272c;
        DivSizeUnitValue divSizeUnitValue3 = divWrapContentSize.f58272c;
        return divSizeUnitValue2 != null ? divSizeUnitValue2.a(divSizeUnitValue3, expressionResolver, expressionResolver2) : divSizeUnitValue3 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58273d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivWrapContentSize.class).hashCode();
        Expression<Boolean> expression = this.f58270a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivSizeUnitValue divSizeUnitValue = this.f58271b;
        int iHash = iHashCode2 + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.f58272c;
        int iHash2 = iHash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        this.f58273d = Integer.valueOf(iHash2);
        return iHash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
