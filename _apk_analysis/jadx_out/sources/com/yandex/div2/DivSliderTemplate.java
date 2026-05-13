package com.yandex.div2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSliderTemplate implements JSONSerializable, JsonTemplate<DivSlider> {

    @NotNull
    public static final a V = new a(null);

    @NotNull
    public static final Expression<Double> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Boolean> Y;

    @NotNull
    public static final Expression<Long> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57085a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57086b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57087c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSliderTemplate> f57088d0;

    @NotNull
    public final Field<TextStyleTemplate> A;

    @NotNull
    public final Field<String> B;

    @NotNull
    public final Field<DivDrawableTemplate> C;

    @NotNull
    public final Field<TextStyleTemplate> D;

    @NotNull
    public final Field<String> E;

    @NotNull
    public final Field<DivDrawableTemplate> F;

    @NotNull
    public final Field<DivDrawableTemplate> G;

    @NotNull
    public final Field<List<DivTooltipTemplate>> H;

    @NotNull
    public final Field<DivDrawableTemplate> I;

    @NotNull
    public final Field<DivDrawableTemplate> J;

    @NotNull
    public final Field<DivTransformTemplate> K;

    @NotNull
    public final Field<DivChangeTransitionTemplate> L;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> M;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> N;

    @NotNull
    public final Field<List<DivTransitionTrigger>> O;

    @NotNull
    public final Field<List<DivTriggerTemplate>> P;

    @NotNull
    public final Field<List<DivVariableTemplate>> Q;

    @NotNull
    public final Field<Expression<DivVisibility>> R;

    @NotNull
    public final Field<DivVisibilityActionTemplate> S;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> T;

    @NotNull
    public final Field<DivSizeTemplate> U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f57089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f57090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f57091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f57093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f57094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f57095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f57097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f57098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f57099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f57100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f57101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<String> f57102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f57104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<List<RangeTemplate>> f57109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f57112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivDrawableTemplate> f57114z;

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate<DivSlider.Range> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f57115f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, RangeTemplate> f57116g = new sn.p<ParsingEnvironment, JSONObject, RangeTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$RangeTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSliderTemplate.RangeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSliderTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<DivEdgeInsetsTemplate> f57118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<DivDrawableTemplate> f57120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<DivDrawableTemplate> f57121e;

        /* JADX INFO: compiled from: DivSliderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public RangeTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<DivEdgeInsetsTemplate> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<DivDrawableTemplate> field4, @NotNull Field<DivDrawableTemplate> field5) {
            this.f57117a = field;
            this.f57118b = field2;
            this.f57119c = field3;
            this.f57120d = field4;
            this.f57121e = field5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RangeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable RangeTemplate rangeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : rangeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().l7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class TextStyleTemplate implements JSONSerializable, JsonTemplate<DivSlider.TextStyle> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final a f57122j = new a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57123k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final Expression<DivSizeUnit> f57124l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final Expression<Double> f57125m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57126n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TextStyleTemplate> f57127o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivSizeUnit>> f57130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<JSONObject>> f57131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivFontWeight>> f57132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f57134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Field<DivPointTemplate> f57135h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57136i;

        /* JADX INFO: compiled from: DivSliderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57123k = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f57124l = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f57125m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f57126n = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f57127o = new sn.p<ParsingEnvironment, JSONObject, TextStyleTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSliderTemplate.TextStyleTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivSliderTemplate.TextStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public TextStyleTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<DivSizeUnit>> field3, @NotNull Field<Expression<JSONObject>> field4, @NotNull Field<Expression<DivFontWeight>> field5, @NotNull Field<Expression<Long>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<DivPointTemplate> field8, @NotNull Field<Expression<Integer>> field9) {
            this.f57128a = field;
            this.f57129b = field2;
            this.f57130c = field3;
            this.f57131d = field4;
            this.f57132e = field5;
            this.f57133f = field6;
            this.f57134g = field7;
            this.f57135h = field8;
            this.f57136i = field9;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TextStyleTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable TextStyleTemplate textStyleTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : textStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().o7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f57085a0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57086b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57087c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f57088d0 = new sn.p<ParsingEnvironment, JSONObject, DivSliderTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSliderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSliderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivSliderTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<List<DivDisappearActionTemplate>> field9, @NotNull Field<List<DivExtensionTemplate>> field10, @NotNull Field<DivFocusTemplate> field11, @NotNull Field<List<DivFunctionTemplate>> field12, @NotNull Field<DivSizeTemplate> field13, @NotNull Field<String> field14, @NotNull Field<Expression<Boolean>> field15, @NotNull Field<DivLayoutProviderTemplate> field16, @NotNull Field<DivEdgeInsetsTemplate> field17, @NotNull Field<Expression<Long>> field18, @NotNull Field<Expression<Long>> field19, @NotNull Field<DivEdgeInsetsTemplate> field20, @NotNull Field<List<RangeTemplate>> field21, @NotNull Field<Expression<String>> field22, @NotNull Field<Expression<Long>> field23, @NotNull Field<DivAccessibilityTemplate> field24, @NotNull Field<List<DivActionTemplate>> field25, @NotNull Field<DivDrawableTemplate> field26, @NotNull Field<TextStyleTemplate> field27, @NotNull Field<String> field28, @NotNull Field<DivDrawableTemplate> field29, @NotNull Field<TextStyleTemplate> field30, @NotNull Field<String> field31, @NotNull Field<DivDrawableTemplate> field32, @NotNull Field<DivDrawableTemplate> field33, @NotNull Field<List<DivTooltipTemplate>> field34, @NotNull Field<DivDrawableTemplate> field35, @NotNull Field<DivDrawableTemplate> field36, @NotNull Field<DivTransformTemplate> field37, @NotNull Field<DivChangeTransitionTemplate> field38, @NotNull Field<DivAppearanceTransitionTemplate> field39, @NotNull Field<DivAppearanceTransitionTemplate> field40, @NotNull Field<List<DivTransitionTrigger>> field41, @NotNull Field<List<DivTriggerTemplate>> field42, @NotNull Field<List<DivVariableTemplate>> field43, @NotNull Field<Expression<DivVisibility>> field44, @NotNull Field<DivVisibilityActionTemplate> field45, @NotNull Field<List<DivVisibilityActionTemplate>> field46, @NotNull Field<DivSizeTemplate> field47) {
        this.f57089a = field;
        this.f57090b = field2;
        this.f57091c = field3;
        this.f57092d = field4;
        this.f57093e = field5;
        this.f57094f = field6;
        this.f57095g = field7;
        this.f57096h = field8;
        this.f57097i = field9;
        this.f57098j = field10;
        this.f57099k = field11;
        this.f57100l = field12;
        this.f57101m = field13;
        this.f57102n = field14;
        this.f57103o = field15;
        this.f57104p = field16;
        this.f57105q = field17;
        this.f57106r = field18;
        this.f57107s = field19;
        this.f57108t = field20;
        this.f57109u = field21;
        this.f57110v = field22;
        this.f57111w = field23;
        this.f57112x = field24;
        this.f57113y = field25;
        this.f57114z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSliderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSliderTemplate divSliderTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSliderTemplate(ParsingEnvironment parsingEnvironment, DivSliderTemplate divSliderTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSliderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
