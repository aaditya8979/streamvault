package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivRadialGradientTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRadialGradientTemplate implements JSONSerializable, JsonTemplate<DivRadialGradient> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56641f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientCenter.c f56642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientCenter.c f56643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientRadius.c f56644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientTemplate> f56645j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivRadialGradientCenterTemplate> f56646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivRadialGradientCenterTemplate> f56647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<ColorPointTemplate>> f56648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<ExpressionList<Integer>> f56649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<DivRadialGradientRadiusTemplate> f56650e;

    /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate<DivRadialGradient.ColorPoint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f56651c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ColorPointTemplate> f56652d = new sn.p<ParsingEnvironment, JSONObject, ColorPointTemplate>() { // from class: com.yandex.div2.DivRadialGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradientTemplate.ColorPointTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRadialGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f56653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f56654b;

        /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public ColorPointTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<Double>> field2) {
            this.f56653a = field;
            this.f56654b = field2;
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
            return BuiltInParserKt.getBuiltInParserComponent().g6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f56642g = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f56643h = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f56644i = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f56645j = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientTemplate>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradientTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRadialGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivRadialGradientTemplate(@NotNull Field<DivRadialGradientCenterTemplate> field, @NotNull Field<DivRadialGradientCenterTemplate> field2, @NotNull Field<List<ColorPointTemplate>> field3, @NotNull Field<ExpressionList<Integer>> field4, @NotNull Field<DivRadialGradientRadiusTemplate> field5) {
        this.f56646a = field;
        this.f56647b = field2;
        this.f56648c = field3;
        this.f56649d = field4;
        this.f56650e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivRadialGradientTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivRadialGradientTemplate divRadialGradientTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivRadialGradientTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientTemplate divRadialGradientTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRadialGradientTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
