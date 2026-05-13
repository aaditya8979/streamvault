package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgument.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivFunctionArgument implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55385d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFunctionArgument> f55386e = new sn.p<ParsingEnvironment, JSONObject, DivFunctionArgument>() { // from class: com.yandex.div2.DivFunctionArgument$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionArgument mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFunctionArgument.f55385d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f55387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivEvaluableType f55388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55389c;

    /* JADX INFO: compiled from: DivFunctionArgument.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFunctionArgument a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().F3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFunctionArgument(@NotNull String str, @NotNull DivEvaluableType divEvaluableType) {
        this.f55387a = str;
        this.f55388b = divEvaluableType;
    }

    public final boolean a(@Nullable DivFunctionArgument divFunctionArgument, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divFunctionArgument != null && tn.p.f(this.f55387a, divFunctionArgument.f55387a) && this.f55388b == divFunctionArgument.f55388b;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55389c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFunctionArgument.class).hashCode() + this.f55387a.hashCode() + this.f55388b.hashCode();
        this.f55389c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
