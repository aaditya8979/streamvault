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

/* JADX INFO: compiled from: DivActionUpdateStructure.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionUpdateStructure implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54546e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionUpdateStructure> f54547f = new sn.p<ParsingEnvironment, JSONObject, DivActionUpdateStructure>() { // from class: com.yandex.div2.DivActionUpdateStructure$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionUpdateStructure mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionUpdateStructure.f54546e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivTypedValue f54549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54551d;

    /* JADX INFO: compiled from: DivActionUpdateStructure.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionUpdateStructure a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().k1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionUpdateStructure(@NotNull Expression<String> expression, @NotNull DivTypedValue divTypedValue, @NotNull Expression<String> expression2) {
        this.f54548a = expression;
        this.f54549b = divTypedValue;
        this.f54550c = expression2;
    }

    public final boolean a(@Nullable DivActionUpdateStructure divActionUpdateStructure, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionUpdateStructure != null && tn.p.f(this.f54548a.evaluate(expressionResolver), divActionUpdateStructure.f54548a.evaluate(expressionResolver2)) && this.f54549b.a(divActionUpdateStructure.f54549b, expressionResolver, expressionResolver2) && tn.p.f(this.f54550c.evaluate(expressionResolver), divActionUpdateStructure.f54550c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54551d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionUpdateStructure.class).hashCode() + this.f54548a.hashCode() + this.f54549b.hash() + this.f54550c.hashCode();
        this.f54551d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
