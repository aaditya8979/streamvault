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

/* JADX INFO: compiled from: DivRadialGradientRelativeCenter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivRadialGradientRelativeCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56621c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenter> f56622d = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenter>() { // from class: com.yandex.div2.DivRadialGradientRelativeCenter$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeCenter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRelativeCenter.f56621c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56624b;

    /* JADX INFO: compiled from: DivRadialGradientRelativeCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradientRelativeCenter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().r6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivRadialGradientRelativeCenter(@NotNull Expression<Double> expression) {
        this.f56623a = expression;
    }

    public final boolean a(@Nullable DivRadialGradientRelativeCenter divRadialGradientRelativeCenter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeCenter != null && this.f56623a.evaluate(expressionResolver).doubleValue() == divRadialGradientRelativeCenter.f56623a.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56624b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivRadialGradientRelativeCenter.class).hashCode() + this.f56623a.hashCode();
        this.f56624b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
