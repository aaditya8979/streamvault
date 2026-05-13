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

/* JADX INFO: compiled from: DivTextRangeMaskParticlesTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTextRangeMaskParticlesTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskParticles> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f57826f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f57830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticlesTemplate> f57831k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f57836e;

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57827g = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f57828h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f57829i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57830j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f57831k = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticlesTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskParticlesTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextRangeMaskParticlesTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextRangeMaskParticlesTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivTextRangeMaskParticlesTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<Double>> field2, @NotNull Field<Expression<Boolean>> field3, @NotNull Field<Expression<Boolean>> field4, @NotNull Field<DivFixedSizeTemplate> field5) {
        this.f57832a = field;
        this.f57833b = field2;
        this.f57834c = field3;
        this.f57835d = field4;
        this.f57836e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeMaskParticlesTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTextRangeMaskParticlesTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskParticlesTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
