package com.yandex.div2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectTemplate;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSelectTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSelectTemplate implements JSONSerializable, JsonTemplate<DivSelect> {

    @NotNull
    public static final a T = new a(null);

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<Long> V;

    @NotNull
    public static final Expression<DivSizeUnit> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Integer> Y;

    @NotNull
    public static final Expression<Double> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56783a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f56784b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f56785c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSelectTemplate> f56786d0;

    @NotNull
    public final Field<List<OptionTemplate>> A;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> B;

    @NotNull
    public final Field<Expression<String>> C;

    @NotNull
    public final Field<Expression<Long>> D;

    @NotNull
    public final Field<List<DivActionTemplate>> E;

    @NotNull
    public final Field<Expression<Integer>> F;

    @NotNull
    public final Field<List<DivTooltipTemplate>> G;

    @NotNull
    public final Field<DivTransformTemplate> H;

    @NotNull
    public final Field<DivChangeTransitionTemplate> I;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> J;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> K;

    @NotNull
    public final Field<List<DivTransitionTrigger>> L;

    @NotNull
    public final Field<String> M;

    @NotNull
    public final Field<List<DivTriggerTemplate>> N;

    @NotNull
    public final Field<List<DivVariableTemplate>> O;

    @NotNull
    public final Field<Expression<DivVisibility>> P;

    @NotNull
    public final Field<DivVisibilityActionTemplate> Q;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> R;

    @NotNull
    public final Field<DivSizeTemplate> S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f56787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f56788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f56789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f56791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f56792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f56793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f56795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f56796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f56797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f56800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONObject>> f56801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivFontWeight>> f56802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f56804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f56805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<String> f56808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f56809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56811y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f56812z;

    /* JADX INFO: compiled from: DivSelectTemplate.kt */
    public static final class OptionTemplate implements JSONSerializable, JsonTemplate<DivSelect.Option> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f56813c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, OptionTemplate> f56814d = new sn.p<ParsingEnvironment, JSONObject, OptionTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelectTemplate.OptionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSelectTemplate.OptionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f56815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f56816b;

        /* JADX INFO: compiled from: DivSelectTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public OptionTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<String>> field2) {
            this.f56815a = field;
            this.f56816b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OptionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable OptionTemplate optionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : optionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().H6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSelectTemplate.kt */
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
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        W = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56783a0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f56784b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f56785c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f56786d0 = new sn.p<ParsingEnvironment, JSONObject, DivSelectTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelectTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSelectTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivSelectTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<List<DivDisappearActionTemplate>> field9, @NotNull Field<List<DivExtensionTemplate>> field10, @NotNull Field<DivFocusTemplate> field11, @NotNull Field<Expression<String>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<Expression<DivSizeUnit>> field14, @NotNull Field<Expression<JSONObject>> field15, @NotNull Field<Expression<DivFontWeight>> field16, @NotNull Field<Expression<Long>> field17, @NotNull Field<List<DivFunctionTemplate>> field18, @NotNull Field<DivSizeTemplate> field19, @NotNull Field<Expression<Integer>> field20, @NotNull Field<Expression<String>> field21, @NotNull Field<String> field22, @NotNull Field<DivLayoutProviderTemplate> field23, @NotNull Field<Expression<Double>> field24, @NotNull Field<Expression<Long>> field25, @NotNull Field<DivEdgeInsetsTemplate> field26, @NotNull Field<List<OptionTemplate>> field27, @NotNull Field<DivEdgeInsetsTemplate> field28, @NotNull Field<Expression<String>> field29, @NotNull Field<Expression<Long>> field30, @NotNull Field<List<DivActionTemplate>> field31, @NotNull Field<Expression<Integer>> field32, @NotNull Field<List<DivTooltipTemplate>> field33, @NotNull Field<DivTransformTemplate> field34, @NotNull Field<DivChangeTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<DivAppearanceTransitionTemplate> field37, @NotNull Field<List<DivTransitionTrigger>> field38, @NotNull Field<String> field39, @NotNull Field<List<DivTriggerTemplate>> field40, @NotNull Field<List<DivVariableTemplate>> field41, @NotNull Field<Expression<DivVisibility>> field42, @NotNull Field<DivVisibilityActionTemplate> field43, @NotNull Field<List<DivVisibilityActionTemplate>> field44, @NotNull Field<DivSizeTemplate> field45) {
        this.f56787a = field;
        this.f56788b = field2;
        this.f56789c = field3;
        this.f56790d = field4;
        this.f56791e = field5;
        this.f56792f = field6;
        this.f56793g = field7;
        this.f56794h = field8;
        this.f56795i = field9;
        this.f56796j = field10;
        this.f56797k = field11;
        this.f56798l = field12;
        this.f56799m = field13;
        this.f56800n = field14;
        this.f56801o = field15;
        this.f56802p = field16;
        this.f56803q = field17;
        this.f56804r = field18;
        this.f56805s = field19;
        this.f56806t = field20;
        this.f56807u = field21;
        this.f56808v = field22;
        this.f56809w = field23;
        this.f56810x = field24;
        this.f56811y = field25;
        this.f56812z = field26;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSelectTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSelectTemplate divSelectTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSelectTemplate(ParsingEnvironment parsingEnvironment, DivSelectTemplate divSelectTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSelectTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
