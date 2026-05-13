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

/* JADX INFO: compiled from: DivPercentageSize.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPercentageSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56514c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPercentageSize> f56515d = new sn.p<ParsingEnvironment, JSONObject, DivPercentageSize>() { // from class: com.yandex.div2.DivPercentageSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPercentageSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPercentageSize.f56514c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56517b;

    /* JADX INFO: compiled from: DivPercentageSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPercentageSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().K5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivPercentageSize(@NotNull Expression<Double> expression) {
        this.f56516a = expression;
    }

    public final boolean a(@Nullable DivPercentageSize divPercentageSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divPercentageSize != null && this.f56516a.evaluate(expressionResolver).doubleValue() == divPercentageSize.f56516a.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56517b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPercentageSize.class).hashCode() + this.f56516a.hashCode();
        this.f56517b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
