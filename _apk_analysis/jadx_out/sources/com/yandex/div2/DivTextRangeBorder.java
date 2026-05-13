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

/* JADX INFO: compiled from: DivTextRangeBorder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTextRangeBorder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f57773d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeBorder> f57774e = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeBorder>() { // from class: com.yandex.div2.DivTextRangeBorder$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBorder mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBorder.f57773d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivStroke f57776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f57777c;

    /* JADX INFO: compiled from: DivTextRangeBorder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeBorder a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().v8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTextRangeBorder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivTextRangeBorder(@Nullable Expression<Long> expression, @Nullable DivStroke divStroke) {
        this.f57775a = expression;
        this.f57776b = divStroke;
    }

    public /* synthetic */ DivTextRangeBorder(Expression expression, DivStroke divStroke, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divStroke);
    }

    public final boolean a(@Nullable DivTextRangeBorder divTextRangeBorder, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTextRangeBorder == null) {
            return false;
        }
        Expression<Long> expression = this.f57775a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divTextRangeBorder.f57775a;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivStroke divStroke = this.f57776b;
        DivStroke divStroke2 = divTextRangeBorder.f57776b;
        return divStroke != null ? divStroke.a(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57777c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTextRangeBorder.class).hashCode();
        Expression<Long> expression = this.f57775a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivStroke divStroke = this.f57776b;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f57777c = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
