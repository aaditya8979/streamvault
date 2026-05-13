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

/* JADX INFO: compiled from: DivActionSetStoredValue.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionSetStoredValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54394e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSetStoredValue> f54395f = new sn.p<ParsingEnvironment, JSONObject, DivActionSetStoredValue>() { // from class: com.yandex.div2.DivActionSetStoredValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetStoredValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetStoredValue.f54394e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivTypedValue f54398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54399d;

    /* JADX INFO: compiled from: DivActionSetStoredValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionSetStoredValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionSetStoredValue(@NotNull Expression<Long> expression, @NotNull Expression<String> expression2, @NotNull DivTypedValue divTypedValue) {
        this.f54396a = expression;
        this.f54397b = expression2;
        this.f54398c = divTypedValue;
    }

    public final boolean a(@Nullable DivActionSetStoredValue divActionSetStoredValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionSetStoredValue != null && this.f54396a.evaluate(expressionResolver).longValue() == divActionSetStoredValue.f54396a.evaluate(expressionResolver2).longValue() && tn.p.f(this.f54397b.evaluate(expressionResolver), divActionSetStoredValue.f54397b.evaluate(expressionResolver2)) && this.f54398c.a(divActionSetStoredValue.f54398c, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54399d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionSetStoredValue.class).hashCode() + this.f54396a.hashCode() + this.f54397b.hashCode() + this.f54398c.hash();
        this.f54399d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
