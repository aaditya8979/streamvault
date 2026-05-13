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

/* JADX INFO: compiled from: DivSolidBackground.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSolidBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f57149c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSolidBackground> f57150d = new sn.p<ParsingEnvironment, JSONObject, DivSolidBackground>() { // from class: com.yandex.div2.DivSolidBackground$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSolidBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSolidBackground.f57149c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f57151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f57152b;

    /* JADX INFO: compiled from: DivSolidBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSolidBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivSolidBackground(@NotNull Expression<Integer> expression) {
        this.f57151a = expression;
    }

    public final boolean a(@Nullable DivSolidBackground divSolidBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divSolidBackground != null && this.f57151a.evaluate(expressionResolver).intValue() == divSolidBackground.f57151a.evaluate(expressionResolver2).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57152b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSolidBackground.class).hashCode() + this.f57151a.hashCode();
        this.f57152b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
