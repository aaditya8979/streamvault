package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGifImageTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivGifImageTemplate implements JSONSerializable, JsonTemplate<DivGifImage> {

    @NotNull
    public static final a Y = new a(null);

    @NotNull
    public static final DivAnimation Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55558a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55559b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55560c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55561d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55562e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55563f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55564g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55565h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55566i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55567j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivGifImageTemplate> f55568k0;

    @NotNull
    public final Field<List<DivActionTemplate>> A;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> B;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> C;

    @NotNull
    public final Field<Expression<Integer>> D;

    @NotNull
    public final Field<Expression<Boolean>> E;

    @NotNull
    public final Field<List<DivActionTemplate>> F;

    @NotNull
    public final Field<List<DivActionTemplate>> G;

    @NotNull
    public final Field<Expression<String>> H;

    @NotNull
    public final Field<Expression<String>> I;

    @NotNull
    public final Field<Expression<Long>> J;

    @NotNull
    public final Field<Expression<DivImageScale>> K;

    @NotNull
    public final Field<List<DivActionTemplate>> L;

    @NotNull
    public final Field<List<DivTooltipTemplate>> M;

    @NotNull
    public final Field<DivTransformTemplate> N;

    @NotNull
    public final Field<DivChangeTransitionTemplate> O;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> P;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> Q;

    @NotNull
    public final Field<List<DivTransitionTrigger>> R;

    @NotNull
    public final Field<List<DivTriggerTemplate>> S;

    @NotNull
    public final Field<List<DivVariableTemplate>> T;

    @NotNull
    public final Field<Expression<DivVisibility>> U;

    @NotNull
    public final Field<DivVisibilityActionTemplate> V;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> W;

    @NotNull
    public final Field<DivSizeTemplate> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f55569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f55570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f55571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivAspectTemplate> f55577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f55589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<String> f55593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f55594z;

    /* JADX INFO: compiled from: DivGifImageTemplate.kt */
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
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        Z = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55558a0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55559b0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55560c0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55561d0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55562e0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f55563f0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55564g0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55565h0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55566i0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55567j0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f55568k0 = new sn.p<ParsingEnvironment, JSONObject, DivGifImageTemplate>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGifImageTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivGifImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivGifImageTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<DivAspectTemplate> field9, @NotNull Field<List<DivBackgroundTemplate>> field10, @NotNull Field<DivBorderTemplate> field11, @NotNull Field<Expression<Boolean>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<Expression<DivAlignmentHorizontal>> field14, @NotNull Field<Expression<DivAlignmentVertical>> field15, @NotNull Field<List<DivDisappearActionTemplate>> field16, @NotNull Field<List<DivActionTemplate>> field17, @NotNull Field<List<DivExtensionTemplate>> field18, @NotNull Field<DivFocusTemplate> field19, @NotNull Field<List<DivFunctionTemplate>> field20, @NotNull Field<Expression<Uri>> field21, @NotNull Field<DivSizeTemplate> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<List<DivActionTemplate>> field24, @NotNull Field<String> field25, @NotNull Field<DivLayoutProviderTemplate> field26, @NotNull Field<List<DivActionTemplate>> field27, @NotNull Field<DivEdgeInsetsTemplate> field28, @NotNull Field<DivEdgeInsetsTemplate> field29, @NotNull Field<Expression<Integer>> field30, @NotNull Field<Expression<Boolean>> field31, @NotNull Field<List<DivActionTemplate>> field32, @NotNull Field<List<DivActionTemplate>> field33, @NotNull Field<Expression<String>> field34, @NotNull Field<Expression<String>> field35, @NotNull Field<Expression<Long>> field36, @NotNull Field<Expression<DivImageScale>> field37, @NotNull Field<List<DivActionTemplate>> field38, @NotNull Field<List<DivTooltipTemplate>> field39, @NotNull Field<DivTransformTemplate> field40, @NotNull Field<DivChangeTransitionTemplate> field41, @NotNull Field<DivAppearanceTransitionTemplate> field42, @NotNull Field<DivAppearanceTransitionTemplate> field43, @NotNull Field<List<DivTransitionTrigger>> field44, @NotNull Field<List<DivTriggerTemplate>> field45, @NotNull Field<List<DivVariableTemplate>> field46, @NotNull Field<Expression<DivVisibility>> field47, @NotNull Field<DivVisibilityActionTemplate> field48, @NotNull Field<List<DivVisibilityActionTemplate>> field49, @NotNull Field<DivSizeTemplate> field50) {
        this.f55569a = field;
        this.f55570b = field2;
        this.f55571c = field3;
        this.f55572d = field4;
        this.f55573e = field5;
        this.f55574f = field6;
        this.f55575g = field7;
        this.f55576h = field8;
        this.f55577i = field9;
        this.f55578j = field10;
        this.f55579k = field11;
        this.f55580l = field12;
        this.f55581m = field13;
        this.f55582n = field14;
        this.f55583o = field15;
        this.f55584p = field16;
        this.f55585q = field17;
        this.f55586r = field18;
        this.f55587s = field19;
        this.f55588t = field20;
        this.f55589u = field21;
        this.f55590v = field22;
        this.f55591w = field23;
        this.f55592x = field24;
        this.f55593y = field25;
        this.f55594z = field26;
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
        this.V = field48;
        this.W = field49;
        this.X = field50;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGifImageTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivGifImageTemplate divGifImageTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivGifImageTemplate(ParsingEnvironment parsingEnvironment, DivGifImageTemplate divGifImageTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGifImageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
