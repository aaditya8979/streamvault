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

/* JADX INFO: compiled from: DivActionAnimatorStart.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionAnimatorStart implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f54194j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStart> f54195k = new sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStart>() { // from class: com.yandex.div2.DivActionAnimatorStart$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStart mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionAnimatorStart.f54194j.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAnimationDirection> f54197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final DivTypedValue f54199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAnimationInterpolator> f54200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final DivCount f54201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final DivTypedValue f54203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f54204i;

    /* JADX INFO: compiled from: DivActionAnimatorStart.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionAnimatorStart a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().K().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionAnimatorStart(@NotNull String str, @Nullable Expression<DivAnimationDirection> expression, @Nullable Expression<Long> expression2, @Nullable DivTypedValue divTypedValue, @Nullable Expression<DivAnimationInterpolator> expression3, @Nullable DivCount divCount, @Nullable Expression<Long> expression4, @Nullable DivTypedValue divTypedValue2) {
        this.f54196a = str;
        this.f54197b = expression;
        this.f54198c = expression2;
        this.f54199d = divTypedValue;
        this.f54200e = expression3;
        this.f54201f = divCount;
        this.f54202g = expression4;
        this.f54203h = divTypedValue2;
    }

    public final boolean a(@Nullable DivActionAnimatorStart divActionAnimatorStart, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionAnimatorStart == null || !tn.p.f(this.f54196a, divActionAnimatorStart.f54196a)) {
            return false;
        }
        Expression<DivAnimationDirection> expression = this.f54197b;
        DivAnimationDirection divAnimationDirectionEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAnimationDirection> expression2 = divActionAnimatorStart.f54197b;
        if (divAnimationDirectionEvaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression3 = this.f54198c;
        Long lEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divActionAnimatorStart.f54198c;
        if (!tn.p.f(lEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue = this.f54199d;
        if (!(divTypedValue != null ? divTypedValue.a(divActionAnimatorStart.f54199d, expressionResolver, expressionResolver2) : divActionAnimatorStart.f54199d == null)) {
            return false;
        }
        Expression<DivAnimationInterpolator> expression5 = this.f54200e;
        DivAnimationInterpolator divAnimationInterpolatorEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivAnimationInterpolator> expression6 = divActionAnimatorStart.f54200e;
        if (divAnimationInterpolatorEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCount divCount = this.f54201f;
        if (!(divCount != null ? divCount.a(divActionAnimatorStart.f54201f, expressionResolver, expressionResolver2) : divActionAnimatorStart.f54201f == null)) {
            return false;
        }
        Expression<Long> expression7 = this.f54202g;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divActionAnimatorStart.f54202g;
        if (!tn.p.f(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue2 = this.f54203h;
        DivTypedValue divTypedValue3 = divActionAnimatorStart.f54203h;
        return divTypedValue2 != null ? divTypedValue2.a(divTypedValue3, expressionResolver, expressionResolver2) : divTypedValue3 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54204i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionAnimatorStart.class).hashCode() + this.f54196a.hashCode();
        Expression<DivAnimationDirection> expression = this.f54197b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.f54198c;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        DivTypedValue divTypedValue = this.f54199d;
        int iHash = iHashCode3 + (divTypedValue != null ? divTypedValue.hash() : 0);
        Expression<DivAnimationInterpolator> expression3 = this.f54200e;
        int iHashCode4 = iHash + (expression3 != null ? expression3.hashCode() : 0);
        DivCount divCount = this.f54201f;
        int iHash2 = iHashCode4 + (divCount != null ? divCount.hash() : 0);
        Expression<Long> expression4 = this.f54202g;
        int iHashCode5 = iHash2 + (expression4 != null ? expression4.hashCode() : 0);
        DivTypedValue divTypedValue2 = this.f54203h;
        int iHash3 = iHashCode5 + (divTypedValue2 != null ? divTypedValue2.hash() : 0);
        this.f54204i = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
