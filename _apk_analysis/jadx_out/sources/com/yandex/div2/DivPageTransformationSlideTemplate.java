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

/* JADX INFO: compiled from: DivPageTransformationSlideTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivPageTransformationSlideTemplate implements JSONSerializable, JsonTemplate<DivPageTransformationSlide> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56364f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformationSlideTemplate> f56370l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f56371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56375e;

    /* JADX INFO: compiled from: DivPageTransformationSlideTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56365g = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56366h = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56367i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56368j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56369k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56370l = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformationSlideTemplate>() { // from class: com.yandex.div2.DivPageTransformationSlideTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationSlideTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPageTransformationSlideTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivPageTransformationSlideTemplate(@NotNull Field<Expression<DivAnimationInterpolator>> field, @NotNull Field<Expression<Double>> field2, @NotNull Field<Expression<Double>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<Expression<Double>> field5) {
        this.f56371a = field;
        this.f56372b = field2;
        this.f56373c = field3;
        this.f56374d = field4;
        this.f56375e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPageTransformationSlideTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPageTransformationSlideTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageTransformationSlideTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
