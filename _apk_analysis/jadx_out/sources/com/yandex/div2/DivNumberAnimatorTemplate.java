package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivCount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimatorTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivNumberAnimatorTemplate implements JSONSerializable, JsonTemplate<DivNumberAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f56259l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationDirection> f56260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final DivCount.b f56262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNumberAnimatorTemplate> f56264q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationDirection>> f56266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<String> f56270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f56271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivCountTemplate> f56272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<String> f56275k;

    /* JADX INFO: compiled from: DivNumberAnimatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56260m = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f56261n = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f56262o = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f56263p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f56264q = new sn.p<ParsingEnvironment, JSONObject, DivNumberAnimatorTemplate>() { // from class: com.yandex.div2.DivNumberAnimatorTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivNumberAnimatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivNumberAnimatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivNumberAnimatorTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<Expression<DivAnimationDirection>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<Double>> field5, @NotNull Field<String> field6, @NotNull Field<Expression<DivAnimationInterpolator>> field7, @NotNull Field<DivCountTemplate> field8, @NotNull Field<Expression<Long>> field9, @NotNull Field<Expression<Double>> field10, @NotNull Field<String> field11) {
        this.f56265a = field;
        this.f56266b = field2;
        this.f56267c = field3;
        this.f56268d = field4;
        this.f56269e = field5;
        this.f56270f = field6;
        this.f56271g = field7;
        this.f56272h = field8;
        this.f56273i = field9;
        this.f56274j = field10;
        this.f56275k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivNumberAnimatorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivNumberAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divNumberAnimatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
