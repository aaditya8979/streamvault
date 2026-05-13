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

/* JADX INFO: compiled from: DivPageTransformationOverlapTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPageTransformationOverlapTemplate implements JSONSerializable, JsonTemplate<DivPageTransformationOverlap> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56323g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlapTemplate> f56330n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f56331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56336f;

    /* JADX INFO: compiled from: DivPageTransformationOverlapTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56324h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56325i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56326j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56327k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56328l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56329m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f56330n = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlapTemplate>() { // from class: com.yandex.div2.DivPageTransformationOverlapTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationOverlapTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPageTransformationOverlapTemplate(parsingEnvironment, (DivPageTransformationOverlapTemplate) null, false, jSONObject, 6, (tn.i) null);
            }
        };
    }

    public DivPageTransformationOverlapTemplate(@NotNull Field<Expression<DivAnimationInterpolator>> field, @NotNull Field<Expression<Double>> field2, @NotNull Field<Expression<Double>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<Expression<Double>> field5, @NotNull Field<Expression<Boolean>> field6) {
        this.f56331a = field;
        this.f56332b = field2;
        this.f56333c = field3;
        this.f56334d = field4;
        this.f56335e = field5;
        this.f56336f = field6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPageTransformationOverlapTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<DivAnimationInterpolator>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Boolean>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPageTransformationOverlapTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageTransformationOverlapTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
