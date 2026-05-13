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

/* JADX INFO: compiled from: DivImageTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivImageTemplate implements JSONSerializable, JsonTemplate<DivImage> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final a f55795d0 = new a(null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f55796e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55797f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55798g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55799h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55800i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55801j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55802k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55803l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55804m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55805n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivBlendMode> f55806o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55807p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55808q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivImageTemplate> f55809r0;

    @NotNull
    public final Field<String> A;

    @NotNull
    public final Field<Expression<Uri>> B;

    @NotNull
    public final Field<DivLayoutProviderTemplate> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> E;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> F;

    @NotNull
    public final Field<Expression<Integer>> G;

    @NotNull
    public final Field<Expression<Boolean>> H;

    @NotNull
    public final Field<List<DivActionTemplate>> I;

    @NotNull
    public final Field<List<DivActionTemplate>> J;

    @NotNull
    public final Field<Expression<String>> K;

    @NotNull
    public final Field<Expression<String>> L;

    @NotNull
    public final Field<Expression<Long>> M;

    @NotNull
    public final Field<Expression<DivImageScale>> N;

    @NotNull
    public final Field<List<DivActionTemplate>> O;

    @NotNull
    public final Field<Expression<Integer>> P;

    @NotNull
    public final Field<Expression<DivBlendMode>> Q;

    @NotNull
    public final Field<List<DivTooltipTemplate>> R;

    @NotNull
    public final Field<DivTransformTemplate> S;

    @NotNull
    public final Field<DivChangeTransitionTemplate> T;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> U;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> V;

    @NotNull
    public final Field<List<DivTransitionTrigger>> W;

    @NotNull
    public final Field<List<DivTriggerTemplate>> X;

    @NotNull
    public final Field<List<DivVariableTemplate>> Y;

    @NotNull
    public final Field<Expression<DivVisibility>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f55810a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Field<DivVisibilityActionTemplate> f55811a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f55812b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f55813b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f55814c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55815c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivFadeTransitionTemplate> f55821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<DivAspectTemplate> f55822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFilterTemplate>> f55832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55838z;

    /* JADX INFO: compiled from: DivImageTemplate.kt */
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
        f55796e0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55797f0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55798g0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55799h0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55800i0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55801j0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        Boolean bool = Boolean.FALSE;
        f55802k0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f55803l0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55804m0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f55805n0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55806o0 = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        f55807p0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55808q0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f55809r0 = new sn.p<ParsingEnvironment, JSONObject, DivImageTemplate>() { // from class: com.yandex.div2.DivImageTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivImageTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<DivFadeTransitionTemplate> field9, @NotNull Field<DivAspectTemplate> field10, @NotNull Field<List<DivBackgroundTemplate>> field11, @NotNull Field<DivBorderTemplate> field12, @NotNull Field<Expression<Boolean>> field13, @NotNull Field<Expression<Long>> field14, @NotNull Field<Expression<DivAlignmentHorizontal>> field15, @NotNull Field<Expression<DivAlignmentVertical>> field16, @NotNull Field<List<DivDisappearActionTemplate>> field17, @NotNull Field<List<DivActionTemplate>> field18, @NotNull Field<List<DivExtensionTemplate>> field19, @NotNull Field<List<DivFilterTemplate>> field20, @NotNull Field<DivFocusTemplate> field21, @NotNull Field<List<DivFunctionTemplate>> field22, @NotNull Field<DivSizeTemplate> field23, @NotNull Field<Expression<Boolean>> field24, @NotNull Field<List<DivActionTemplate>> field25, @NotNull Field<List<DivActionTemplate>> field26, @NotNull Field<String> field27, @NotNull Field<Expression<Uri>> field28, @NotNull Field<DivLayoutProviderTemplate> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<DivEdgeInsetsTemplate> field31, @NotNull Field<DivEdgeInsetsTemplate> field32, @NotNull Field<Expression<Integer>> field33, @NotNull Field<Expression<Boolean>> field34, @NotNull Field<List<DivActionTemplate>> field35, @NotNull Field<List<DivActionTemplate>> field36, @NotNull Field<Expression<String>> field37, @NotNull Field<Expression<String>> field38, @NotNull Field<Expression<Long>> field39, @NotNull Field<Expression<DivImageScale>> field40, @NotNull Field<List<DivActionTemplate>> field41, @NotNull Field<Expression<Integer>> field42, @NotNull Field<Expression<DivBlendMode>> field43, @NotNull Field<List<DivTooltipTemplate>> field44, @NotNull Field<DivTransformTemplate> field45, @NotNull Field<DivChangeTransitionTemplate> field46, @NotNull Field<DivAppearanceTransitionTemplate> field47, @NotNull Field<DivAppearanceTransitionTemplate> field48, @NotNull Field<List<DivTransitionTrigger>> field49, @NotNull Field<List<DivTriggerTemplate>> field50, @NotNull Field<List<DivVariableTemplate>> field51, @NotNull Field<Expression<DivVisibility>> field52, @NotNull Field<DivVisibilityActionTemplate> field53, @NotNull Field<List<DivVisibilityActionTemplate>> field54, @NotNull Field<DivSizeTemplate> field55) {
        this.f55810a = field;
        this.f55812b = field2;
        this.f55814c = field3;
        this.f55816d = field4;
        this.f55817e = field5;
        this.f55818f = field6;
        this.f55819g = field7;
        this.f55820h = field8;
        this.f55821i = field9;
        this.f55822j = field10;
        this.f55823k = field11;
        this.f55824l = field12;
        this.f55825m = field13;
        this.f55826n = field14;
        this.f55827o = field15;
        this.f55828p = field16;
        this.f55829q = field17;
        this.f55830r = field18;
        this.f55831s = field19;
        this.f55832t = field20;
        this.f55833u = field21;
        this.f55834v = field22;
        this.f55835w = field23;
        this.f55836x = field24;
        this.f55837y = field25;
        this.f55838z = field26;
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
        this.Y = field51;
        this.Z = field52;
        this.f55811a0 = field53;
        this.f55813b0 = field54;
        this.f55815c0 = field55;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivImageTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivImageTemplate divImageTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivImageTemplate(ParsingEnvironment parsingEnvironment, DivImageTemplate divImageTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divImageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
