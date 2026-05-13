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

/* JADX INFO: compiled from: DivAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivAspect implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54649c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAspect> f54650d = new sn.p<ParsingEnvironment, JSONObject, DivAspect>() { // from class: com.yandex.div2.DivAspect$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAspect mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAspect.f54649c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f54651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54652b;

    /* JADX INFO: compiled from: DivAspect.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAspect a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivAspect(@NotNull Expression<Double> expression) {
        this.f54651a = expression;
    }

    public final boolean a(@Nullable DivAspect divAspect, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divAspect != null && this.f54651a.evaluate(expressionResolver).doubleValue() == divAspect.f54651a.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54652b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAspect.class).hashCode() + this.f54651a.hashCode();
        this.f54652b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
