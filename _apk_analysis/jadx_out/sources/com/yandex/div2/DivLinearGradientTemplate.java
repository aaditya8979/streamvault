package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivLinearGradientTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivLinearGradientTemplate implements JSONSerializable, JsonTemplate<DivLinearGradient> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56192d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56193e = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivLinearGradientTemplate> f56194f = new sn.p<ParsingEnvironment, JSONObject, DivLinearGradientTemplate>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLinearGradientTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivLinearGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<List<ColorPointTemplate>> f56196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<ExpressionList<Integer>> f56197c;

    /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate<DivLinearGradient.ColorPoint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f56198c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ColorPointTemplate> f56199d = new sn.p<ParsingEnvironment, JSONObject, ColorPointTemplate>() { // from class: com.yandex.div2.DivLinearGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivLinearGradientTemplate.ColorPointTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivLinearGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f56200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f56201b;

        /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public ColorPointTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<Double>> field2) {
            this.f56200a = field;
            this.f56201b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ColorPointTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ColorPointTemplate colorPointTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ ColorPointTemplate(ParsingEnvironment parsingEnvironment, ColorPointTemplate colorPointTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : colorPointTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().T4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivLinearGradientTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<List<ColorPointTemplate>> field2, @NotNull Field<ExpressionList<Integer>> field3) {
        this.f56195a = field;
        this.f56196b = field2;
        this.f56197c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivLinearGradientTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivLinearGradientTemplate divLinearGradientTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivLinearGradientTemplate(ParsingEnvironment parsingEnvironment, DivLinearGradientTemplate divLinearGradientTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divLinearGradientTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
