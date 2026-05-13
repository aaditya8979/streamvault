package com.yandex.div2;

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

/* JADX INFO: compiled from: DivGridTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivGridTemplate implements JSONSerializable, JsonTemplate<DivGrid> {

    @NotNull
    public static final a U = new a(null);

    @NotNull
    public static final DivAnimation V;

    @NotNull
    public static final Expression<Double> W;

    @NotNull
    public static final Expression<Boolean> X;

    @NotNull
    public static final Expression<DivAlignmentHorizontal> Y;

    @NotNull
    public static final Expression<DivAlignmentVertical> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55649a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55650b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55651c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivGridTemplate> f55652d0;

    @NotNull
    public final Field<List<DivActionTemplate>> A;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> B;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<List<DivActionTemplate>> E;

    @NotNull
    public final Field<Expression<String>> F;

    @NotNull
    public final Field<Expression<Long>> G;

    @NotNull
    public final Field<List<DivActionTemplate>> H;

    @NotNull
    public final Field<List<DivTooltipTemplate>> I;

    @NotNull
    public final Field<DivTransformTemplate> J;

    @NotNull
    public final Field<DivChangeTransitionTemplate> K;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> L;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> M;

    @NotNull
    public final Field<List<DivTransitionTrigger>> N;

    @NotNull
    public final Field<List<DivTriggerTemplate>> O;

    @NotNull
    public final Field<List<DivVariableTemplate>> P;

    @NotNull
    public final Field<Expression<DivVisibility>> Q;

    @NotNull
    public final Field<DivVisibilityActionTemplate> R;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> S;

    @NotNull
    public final Field<DivSizeTemplate> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f55653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f55654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f55655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<String> f55676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTemplate>> f55677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f55678z;

    /* JADX INFO: compiled from: DivGridTemplate.kt */
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
        V = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        W = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        X = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Y = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Z = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        f55649a0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f55650b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55651c0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f55652d0 = new sn.p<ParsingEnvironment, JSONObject, DivGridTemplate>() { // from class: com.yandex.div2.DivGridTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGridTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivGridTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivGridTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<List<DivBackgroundTemplate>> field9, @NotNull Field<DivBorderTemplate> field10, @NotNull Field<Expression<Boolean>> field11, @NotNull Field<Expression<Long>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<Expression<DivAlignmentHorizontal>> field14, @NotNull Field<Expression<DivAlignmentVertical>> field15, @NotNull Field<List<DivDisappearActionTemplate>> field16, @NotNull Field<List<DivActionTemplate>> field17, @NotNull Field<List<DivExtensionTemplate>> field18, @NotNull Field<DivFocusTemplate> field19, @NotNull Field<List<DivFunctionTemplate>> field20, @NotNull Field<DivSizeTemplate> field21, @NotNull Field<List<DivActionTemplate>> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<String> field24, @NotNull Field<List<DivTemplate>> field25, @NotNull Field<DivLayoutProviderTemplate> field26, @NotNull Field<List<DivActionTemplate>> field27, @NotNull Field<DivEdgeInsetsTemplate> field28, @NotNull Field<DivEdgeInsetsTemplate> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<List<DivActionTemplate>> field31, @NotNull Field<Expression<String>> field32, @NotNull Field<Expression<Long>> field33, @NotNull Field<List<DivActionTemplate>> field34, @NotNull Field<List<DivTooltipTemplate>> field35, @NotNull Field<DivTransformTemplate> field36, @NotNull Field<DivChangeTransitionTemplate> field37, @NotNull Field<DivAppearanceTransitionTemplate> field38, @NotNull Field<DivAppearanceTransitionTemplate> field39, @NotNull Field<List<DivTransitionTrigger>> field40, @NotNull Field<List<DivTriggerTemplate>> field41, @NotNull Field<List<DivVariableTemplate>> field42, @NotNull Field<Expression<DivVisibility>> field43, @NotNull Field<DivVisibilityActionTemplate> field44, @NotNull Field<List<DivVisibilityActionTemplate>> field45, @NotNull Field<DivSizeTemplate> field46) {
        this.f55653a = field;
        this.f55654b = field2;
        this.f55655c = field3;
        this.f55656d = field4;
        this.f55657e = field5;
        this.f55658f = field6;
        this.f55659g = field7;
        this.f55660h = field8;
        this.f55661i = field9;
        this.f55662j = field10;
        this.f55663k = field11;
        this.f55664l = field12;
        this.f55665m = field13;
        this.f55666n = field14;
        this.f55667o = field15;
        this.f55668p = field16;
        this.f55669q = field17;
        this.f55670r = field18;
        this.f55671s = field19;
        this.f55672t = field20;
        this.f55673u = field21;
        this.f55674v = field22;
        this.f55675w = field23;
        this.f55676x = field24;
        this.f55677y = field25;
        this.f55678z = field26;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivGridTemplate divGridTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivGridTemplate(ParsingEnvironment parsingEnvironment, DivGridTemplate divGridTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGridTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
