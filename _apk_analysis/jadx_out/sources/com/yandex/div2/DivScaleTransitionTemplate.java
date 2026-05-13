package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivScaleTransitionTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivScaleTransitionTemplate implements JSONSerializable, JsonTemplate<DivScaleTransition> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56707g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivScaleTransitionTemplate> f56714n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f56716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56720f;

    /* JADX INFO: compiled from: DivScaleTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56708h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f56709i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f56710j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56711k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56712l = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56713m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f56714n = new sn.p<ParsingEnvironment, JSONObject, DivScaleTransitionTemplate>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivScaleTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivScaleTransitionTemplate(parsingEnvironment, (DivScaleTransitionTemplate) null, false, jSONObject, 6, (tn.i) null);
            }
        };
    }

    public DivScaleTransitionTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<DivAnimationInterpolator>> field2, @NotNull Field<Expression<Double>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<Expression<Double>> field5, @NotNull Field<Expression<Long>> field6) {
        this.f56715a = field;
        this.f56716b = field2;
        this.f56717c = field3;
        this.f56718d = field4;
        this.f56719e = field5;
        this.f56720f = field6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivScaleTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<DivAnimationInterpolator>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivScaleTransitionTemplate(ParsingEnvironment parsingEnvironment, DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divScaleTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
