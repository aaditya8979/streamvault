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

/* JADX INFO: compiled from: DivFadeTransitionTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivFadeTransitionTemplate implements JSONSerializable, JsonTemplate<DivFadeTransition> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f55270e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f55273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate> f55275j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f55278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55279d;

    /* JADX INFO: compiled from: DivFadeTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55271f = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f55272g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f55273h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f55274i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55275j = new sn.p<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFadeTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFadeTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivFadeTransitionTemplate(@NotNull Field<Expression<Double>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<DivAnimationInterpolator>> field3, @NotNull Field<Expression<Long>> field4) {
        this.f55276a = field;
        this.f55277b = field2;
        this.f55278c = field3;
        this.f55279d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFadeTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<DivAnimationInterpolator>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFadeTransitionTemplate(ParsingEnvironment parsingEnvironment, DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFadeTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
