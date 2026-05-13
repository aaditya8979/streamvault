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

/* JADX INFO: compiled from: DivActionScrollTo.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionScrollTo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54370e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54371f = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionScrollTo> f54372g = new sn.p<ParsingEnvironment, JSONObject, DivActionScrollTo>() { // from class: com.yandex.div2.DivActionScrollTo$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollTo mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollTo.f54370e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivActionScrollDestination f54374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54376d;

    /* JADX INFO: compiled from: DivActionScrollTo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionScrollTo a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().G0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionScrollTo(@NotNull Expression<Boolean> expression, @NotNull DivActionScrollDestination divActionScrollDestination, @NotNull Expression<String> expression2) {
        this.f54373a = expression;
        this.f54374b = divActionScrollDestination;
        this.f54375c = expression2;
    }

    public final boolean a(@Nullable DivActionScrollTo divActionScrollTo, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionScrollTo != null && this.f54373a.evaluate(expressionResolver).booleanValue() == divActionScrollTo.f54373a.evaluate(expressionResolver2).booleanValue() && this.f54374b.a(divActionScrollTo.f54374b, expressionResolver, expressionResolver2) && tn.p.f(this.f54375c.evaluate(expressionResolver), divActionScrollTo.f54375c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54376d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionScrollTo.class).hashCode() + this.f54373a.hashCode() + this.f54374b.hash() + this.f54375c.hashCode();
        this.f54376d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
