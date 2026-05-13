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

/* JADX INFO: compiled from: BoolVariable.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class BoolVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54040d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, BoolVariable> f54041e = new sn.p<ParsingEnvironment, JSONObject, BoolVariable>() { // from class: com.yandex.div2.BoolVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BoolVariable.f54040d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54044c;

    /* JADX INFO: compiled from: BoolVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final BoolVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public BoolVariable(@NotNull String str, @NotNull Expression<Boolean> expression) {
        this.f54042a = str;
        this.f54043b = expression;
    }

    public final boolean a(@Nullable BoolVariable boolVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return boolVariable != null && tn.p.f(this.f54042a, boolVariable.f54042a) && this.f54043b.evaluate(expressionResolver).booleanValue() == boolVariable.f54043b.evaluate(expressionResolver2).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54044c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(BoolVariable.class).hashCode() + this.f54042a.hashCode() + this.f54043b.hashCode();
        this.f54044c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
