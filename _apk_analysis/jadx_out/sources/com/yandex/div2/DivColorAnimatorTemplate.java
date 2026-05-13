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

/* JADX INFO: compiled from: DivColorAnimatorTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivColorAnimatorTemplate implements JSONSerializable, JsonTemplate<DivColorAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f54820l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationDirection> f54821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final DivCount.b f54823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivColorAnimatorTemplate> f54825q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationDirection>> f54827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f54830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<String> f54831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f54832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivCountTemplate> f54833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f54835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<String> f54836k;

    /* JADX INFO: compiled from: DivColorAnimatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54821m = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f54822n = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f54823o = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f54824p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54825q = new sn.p<ParsingEnvironment, JSONObject, DivColorAnimatorTemplate>() { // from class: com.yandex.div2.DivColorAnimatorTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivColorAnimatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivColorAnimatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivColorAnimatorTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<Expression<DivAnimationDirection>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<Integer>> field5, @NotNull Field<String> field6, @NotNull Field<Expression<DivAnimationInterpolator>> field7, @NotNull Field<DivCountTemplate> field8, @NotNull Field<Expression<Long>> field9, @NotNull Field<Expression<Integer>> field10, @NotNull Field<String> field11) {
        this.f54826a = field;
        this.f54827b = field2;
        this.f54828c = field3;
        this.f54829d = field4;
        this.f54830e = field5;
        this.f54831f = field6;
        this.f54832g = field7;
        this.f54833h = field8;
        this.f54834i = field9;
        this.f54835j = field10;
        this.f54836k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivColorAnimatorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivColorAnimatorTemplate divColorAnimatorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivColorAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivColorAnimatorTemplate divColorAnimatorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divColorAnimatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
