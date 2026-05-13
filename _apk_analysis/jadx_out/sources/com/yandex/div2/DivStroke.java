package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivStrokeStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStroke.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivStroke implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f57271f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final DivStrokeStyle.c f57272g = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f57273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStroke> f57275j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f57276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivStrokeStyle f57277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f57278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f57280e;

    /* JADX INFO: compiled from: DivStroke.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivStroke a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57273h = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f57274i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f57275j = new sn.p<ParsingEnvironment, JSONObject, DivStroke>() { // from class: com.yandex.div2.DivStroke$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStroke mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivStroke.f57271f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivStroke(@NotNull Expression<Integer> expression, @NotNull DivStrokeStyle divStrokeStyle, @NotNull Expression<DivSizeUnit> expression2, @NotNull Expression<Double> expression3) {
        this.f57276a = expression;
        this.f57277b = divStrokeStyle;
        this.f57278c = expression2;
        this.f57279d = expression3;
    }

    public final boolean a(@Nullable DivStroke divStroke, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divStroke != null && this.f57276a.evaluate(expressionResolver).intValue() == divStroke.f57276a.evaluate(expressionResolver2).intValue() && this.f57277b.a(divStroke.f57277b, expressionResolver, expressionResolver2) && this.f57278c.evaluate(expressionResolver) == divStroke.f57278c.evaluate(expressionResolver2)) {
            return (this.f57279d.evaluate(expressionResolver).doubleValue() > divStroke.f57279d.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f57279d.evaluate(expressionResolver).doubleValue() == divStroke.f57279d.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57280e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivStroke.class).hashCode() + this.f57276a.hashCode() + this.f57277b.hash() + this.f57278c.hashCode() + this.f57279d.hashCode();
        this.f57280e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
