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

/* JADX INFO: compiled from: DivCircleShape.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCircleShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54740e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f54741f = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCircleShape> f54742g = new sn.p<ParsingEnvironment, JSONObject, DivCircleShape>() { // from class: com.yandex.div2.DivCircleShape$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCircleShape mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCircleShape.f54740e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f54743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f54744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DivStroke f54745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54746d;

    /* JADX INFO: compiled from: DivCircleShape.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCircleShape a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivCircleShape() {
        this(null, null, null, 7, null);
    }

    public DivCircleShape(@Nullable Expression<Integer> expression, @NotNull DivFixedSize divFixedSize, @Nullable DivStroke divStroke) {
        this.f54743a = expression;
        this.f54744b = divFixedSize;
        this.f54745c = divStroke;
    }

    public /* synthetic */ DivCircleShape(Expression expression, DivFixedSize divFixedSize, DivStroke divStroke, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f54741f : divFixedSize, (i10 & 4) != 0 ? null : divStroke);
    }

    public final boolean a(@Nullable DivCircleShape divCircleShape, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divCircleShape == null) {
            return false;
        }
        Expression<Integer> expression = this.f54743a;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divCircleShape.f54743a;
        if (!tn.p.f(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !this.f54744b.a(divCircleShape.f54744b, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f54745c;
        DivStroke divStroke2 = divCircleShape.f54745c;
        return divStroke != null ? divStroke.a(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54746d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCircleShape.class).hashCode();
        Expression<Integer> expression = this.f54743a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f54744b.hash();
        DivStroke divStroke = this.f54745c;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f54746d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
