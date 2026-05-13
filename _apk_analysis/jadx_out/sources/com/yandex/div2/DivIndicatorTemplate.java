package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivIndicatorTemplate implements JSONSerializable, JsonTemplate<DivIndicator> {

    @NotNull
    public static final a S = new a(null);

    @NotNull
    public static final Expression<Integer> T;

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<Double> V;

    @NotNull
    public static final Expression<DivIndicator.Animation> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Integer> Y;

    @NotNull
    public static final Expression<Double> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final DivShape.c f55906a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f55907b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55908c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55909d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivIndicatorTemplate> f55910e0;

    @NotNull
    public final Field<String> A;

    @NotNull
    public final Field<Expression<String>> B;

    @NotNull
    public final Field<Expression<Long>> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<DivShapeTemplate> E;

    @NotNull
    public final Field<DivFixedSizeTemplate> F;

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
    public final Field<List<DivTriggerTemplate>> M;

    @NotNull
    public final Field<List<DivVariableTemplate>> N;

    @NotNull
    public final Field<Expression<DivVisibility>> O;

    @NotNull
    public final Field<DivVisibilityActionTemplate> P;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> Q;

    @NotNull
    public final Field<DivSizeTemplate> R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f55911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f55912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f55914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivIndicator.Animation>> f55918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<String> f55928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f55929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f55930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f55931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivIndicatorItemPlacementTemplate> f55932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f55933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55936z;

    /* JADX INFO: compiled from: DivIndicatorTemplate.kt */
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
        T = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, DivIndicator.Animation.SCALE, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f55906a0 = new DivShape.c(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null));
        f55907b0 = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        f55908c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55909d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f55910e0 = new sn.p<ParsingEnvironment, JSONObject, DivIndicatorTemplate>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivIndicatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivIndicatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivIndicatorTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<Integer>> field2, @NotNull Field<Expression<Double>> field3, @NotNull Field<DivRoundedRectangleShapeTemplate> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<Expression<DivIndicator.Animation>> field8, @NotNull Field<List<DivAnimatorTemplate>> field9, @NotNull Field<List<DivBackgroundTemplate>> field10, @NotNull Field<DivBorderTemplate> field11, @NotNull Field<Expression<Long>> field12, @NotNull Field<List<DivDisappearActionTemplate>> field13, @NotNull Field<List<DivExtensionTemplate>> field14, @NotNull Field<DivFocusTemplate> field15, @NotNull Field<List<DivFunctionTemplate>> field16, @NotNull Field<DivSizeTemplate> field17, @NotNull Field<String> field18, @NotNull Field<Expression<Integer>> field19, @NotNull Field<DivRoundedRectangleShapeTemplate> field20, @NotNull Field<DivRoundedRectangleShapeTemplate> field21, @NotNull Field<DivIndicatorItemPlacementTemplate> field22, @NotNull Field<DivLayoutProviderTemplate> field23, @NotNull Field<DivEdgeInsetsTemplate> field24, @NotNull Field<Expression<Double>> field25, @NotNull Field<DivEdgeInsetsTemplate> field26, @NotNull Field<String> field27, @NotNull Field<Expression<String>> field28, @NotNull Field<Expression<Long>> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<DivShapeTemplate> field31, @NotNull Field<DivFixedSizeTemplate> field32, @NotNull Field<List<DivTooltipTemplate>> field33, @NotNull Field<DivTransformTemplate> field34, @NotNull Field<DivChangeTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<DivAppearanceTransitionTemplate> field37, @NotNull Field<List<DivTransitionTrigger>> field38, @NotNull Field<List<DivTriggerTemplate>> field39, @NotNull Field<List<DivVariableTemplate>> field40, @NotNull Field<Expression<DivVisibility>> field41, @NotNull Field<DivVisibilityActionTemplate> field42, @NotNull Field<List<DivVisibilityActionTemplate>> field43, @NotNull Field<DivSizeTemplate> field44) {
        this.f55911a = field;
        this.f55912b = field2;
        this.f55913c = field3;
        this.f55914d = field4;
        this.f55915e = field5;
        this.f55916f = field6;
        this.f55917g = field7;
        this.f55918h = field8;
        this.f55919i = field9;
        this.f55920j = field10;
        this.f55921k = field11;
        this.f55922l = field12;
        this.f55923m = field13;
        this.f55924n = field14;
        this.f55925o = field15;
        this.f55926p = field16;
        this.f55927q = field17;
        this.f55928r = field18;
        this.f55929s = field19;
        this.f55930t = field20;
        this.f55931u = field21;
        this.f55932v = field22;
        this.f55933w = field23;
        this.f55934x = field24;
        this.f55935y = field25;
        this.f55936z = field26;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivIndicatorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivIndicatorTemplate divIndicatorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivIndicatorTemplate(ParsingEnvironment parsingEnvironment, DivIndicatorTemplate divIndicatorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divIndicatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
