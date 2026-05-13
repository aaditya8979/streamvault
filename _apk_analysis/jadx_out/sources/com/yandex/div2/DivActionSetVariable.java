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

/* JADX INFO: compiled from: DivActionSetVariable.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionSetVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54405d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSetVariable> f54406e = new sn.p<ParsingEnvironment, JSONObject, DivActionSetVariable>() { // from class: com.yandex.div2.DivActionSetVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetVariable.f54405d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivTypedValue f54407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54409c;

    /* JADX INFO: compiled from: DivActionSetVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionSetVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionSetVariable(@NotNull DivTypedValue divTypedValue, @NotNull Expression<String> expression) {
        this.f54407a = divTypedValue;
        this.f54408b = expression;
    }

    public final boolean a(@Nullable DivActionSetVariable divActionSetVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionSetVariable != null && this.f54407a.a(divActionSetVariable.f54407a, expressionResolver, expressionResolver2) && tn.p.f(this.f54408b.evaluate(expressionResolver), divActionSetVariable.f54408b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54409c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionSetVariable.class).hashCode() + this.f54407a.hash() + this.f54408b.hashCode();
        this.f54409c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
