package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivCount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimationTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivAnimationTemplate implements JSONSerializable, JsonTemplate<DivAnimation> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f54605i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final DivCount.c f54608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAnimationTemplate> f54610n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f54612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f54613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimationTemplate>> f54614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimation.Name>> f54615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<DivCountTemplate> f54616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f54618h;

    /* JADX INFO: compiled from: DivAnimationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54606j = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f54607k = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        f54608l = new DivCount.c(new DivInfinityCount());
        f54609m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54610n = new sn.p<ParsingEnvironment, JSONObject, DivAnimationTemplate>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAnimationTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAnimationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivAnimationTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<Double>> field2, @NotNull Field<Expression<DivAnimationInterpolator>> field3, @NotNull Field<List<DivAnimationTemplate>> field4, @NotNull Field<Expression<DivAnimation.Name>> field5, @NotNull Field<DivCountTemplate> field6, @NotNull Field<Expression<Long>> field7, @NotNull Field<Expression<Double>> field8) {
        this.f54611a = field;
        this.f54612b = field2;
        this.f54613c = field3;
        this.f54614d = field4;
        this.f54615e = field5;
        this.f54616f = field6;
        this.f54617g = field7;
        this.f54618h = field8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAnimationTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivAnimationTemplate divAnimationTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAnimationTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
