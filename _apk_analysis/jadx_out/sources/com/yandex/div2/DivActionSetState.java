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

/* JADX INFO: compiled from: DivActionSetState.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionSetState implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54383d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54384e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSetState> f54385f = new sn.p<ParsingEnvironment, JSONObject, DivActionSetState>() { // from class: com.yandex.div2.DivActionSetState$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetState mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetState.f54383d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54388c;

    /* JADX INFO: compiled from: DivActionSetState.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionSetState a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionSetState(@NotNull Expression<String> expression, @NotNull Expression<Boolean> expression2) {
        this.f54386a = expression;
        this.f54387b = expression2;
    }

    public final boolean a(@Nullable DivActionSetState divActionSetState, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionSetState != null && tn.p.f(this.f54386a.evaluate(expressionResolver), divActionSetState.f54386a.evaluate(expressionResolver2)) && this.f54387b.evaluate(expressionResolver).booleanValue() == divActionSetState.f54387b.evaluate(expressionResolver2).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54388c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionSetState.class).hashCode() + this.f54386a.hashCode() + this.f54387b.hashCode();
        this.f54388c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
