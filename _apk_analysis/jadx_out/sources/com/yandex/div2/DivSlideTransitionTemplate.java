package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSlideTransition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransitionTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSlideTransitionTemplate implements JSONSerializable, JsonTemplate<DivSlideTransition> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f57001f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSlideTransition.Edge> f57003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f57004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSlideTransitionTemplate> f57006k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivDimensionTemplate> f57007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSlideTransition.Edge>> f57009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f57010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57011e;

    /* JADX INFO: compiled from: DivSlideTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57002g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f57003h = Expression.Companion.constant$default(companion, DivSlideTransition.Edge.BOTTOM, null, 2, null);
        f57004i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f57005j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57006k = new sn.p<ParsingEnvironment, JSONObject, DivSlideTransitionTemplate>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlideTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSlideTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivSlideTransitionTemplate(@NotNull Field<DivDimensionTemplate> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<DivSlideTransition.Edge>> field3, @NotNull Field<Expression<DivAnimationInterpolator>> field4, @NotNull Field<Expression<Long>> field5) {
        this.f57007a = field;
        this.f57008b = field2;
        this.f57009c = field3;
        this.f57010d = field4;
        this.f57011e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSlideTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSlideTransitionTemplate(ParsingEnvironment parsingEnvironment, DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSlideTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
