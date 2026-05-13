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

/* JADX INFO: compiled from: DivPivotPercentage.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivPivotPercentage implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56550c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPivotPercentage> f56551d = new sn.p<ParsingEnvironment, JSONObject, DivPivotPercentage>() { // from class: com.yandex.div2.DivPivotPercentage$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotPercentage mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotPercentage.f56550c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56553b;

    /* JADX INFO: compiled from: DivPivotPercentage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPivotPercentage a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().W5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivPivotPercentage(@NotNull Expression<Double> expression) {
        this.f56552a = expression;
    }

    public final boolean a(@Nullable DivPivotPercentage divPivotPercentage, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divPivotPercentage != null && this.f56552a.evaluate(expressionResolver).doubleValue() == divPivotPercentage.f56552a.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56553b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPivotPercentage.class).hashCode() + this.f56552a.hashCode();
        this.f56553b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
