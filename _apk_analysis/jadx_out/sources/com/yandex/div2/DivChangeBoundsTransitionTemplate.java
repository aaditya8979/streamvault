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

/* JADX INFO: compiled from: DivChangeBoundsTransitionTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivChangeBoundsTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeBoundsTransition> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54715d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransitionTemplate> f54719h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f54721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54722c;

    /* JADX INFO: compiled from: DivChangeBoundsTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54716e = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f54717f = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f54718g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54719h = new sn.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransitionTemplate>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivChangeBoundsTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivChangeBoundsTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivChangeBoundsTransitionTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<DivAnimationInterpolator>> field2, @NotNull Field<Expression<Long>> field3) {
        this.f54720a = field;
        this.f54721b = field2;
        this.f54722c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivChangeBoundsTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivChangeBoundsTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divChangeBoundsTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
