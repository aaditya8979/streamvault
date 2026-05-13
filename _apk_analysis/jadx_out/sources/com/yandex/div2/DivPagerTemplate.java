package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerTemplate implements JSONSerializable, JsonTemplate<DivPager> {

    @NotNull
    public static final a R = new a(null);

    @NotNull
    public static final Expression<Double> S;

    @NotNull
    public static final Expression<DivPager.ItemAlignment> T;

    @NotNull
    public static final Expression<Long> U;

    @NotNull
    public static final DivSize.d V;

    @NotNull
    public static final Expression<Boolean> W;

    @NotNull
    public static final DivFixedSize X;

    @NotNull
    public static final Expression<DivPager.Orientation> Y;

    @NotNull
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivPager.ItemAlignment> f56451a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f56452b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f56453c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPagerTemplate> f56454d0;

    @NotNull
    public final Field<Expression<Boolean>> A;

    @NotNull
    public final Field<Expression<String>> B;

    @NotNull
    public final Field<Expression<Long>> C;

    @NotNull
    public final Field<Expression<DivPager.ItemAlignment>> D;

    @NotNull
    public final Field<List<DivActionTemplate>> E;

    @NotNull
    public final Field<List<DivTooltipTemplate>> F;

    @NotNull
    public final Field<DivTransformTemplate> G;

    @NotNull
    public final Field<DivChangeTransitionTemplate> H;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> I;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> J;

    @NotNull
    public final Field<List<DivTransitionTrigger>> K;

    @NotNull
    public final Field<List<DivTriggerTemplate>> L;

    @NotNull
    public final Field<List<DivVariableTemplate>> M;

    @NotNull
    public final Field<Expression<DivVisibility>> N;

    @NotNull
    public final Field<DivVisibilityActionTemplate> O;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> P;

    @NotNull
    public final Field<DivSizeTemplate> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f56455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f56456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f56457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f56459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f56460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f56461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivPager.ItemAlignment>> f56463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f56465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f56466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f56467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f56468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f56469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<String> f56470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<DivCollectionItemBuilderTemplate> f56472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f56473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTemplate>> f56474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivPagerLayoutModeTemplate> f56475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f56476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f56477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivPager.Orientation>> f56478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f56479y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivPageTransformationTemplate> f56480z;

    /* JADX INFO: compiled from: DivPagerTemplate.kt */
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
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        T = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        Y = Expression.Companion.constant$default(companion, DivPager.Orientation.HORIZONTAL, null, 2, null);
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f56451a0 = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.CENTER, null, 2, null);
        f56452b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f56453c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f56454d0 = new sn.p<ParsingEnvironment, JSONObject, DivPagerTemplate>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPagerTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPagerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivPagerTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<Expression<DivPager.ItemAlignment>> field9, @NotNull Field<Expression<Long>> field10, @NotNull Field<List<DivDisappearActionTemplate>> field11, @NotNull Field<List<DivExtensionTemplate>> field12, @NotNull Field<DivFocusTemplate> field13, @NotNull Field<List<DivFunctionTemplate>> field14, @NotNull Field<DivSizeTemplate> field15, @NotNull Field<String> field16, @NotNull Field<Expression<Boolean>> field17, @NotNull Field<DivCollectionItemBuilderTemplate> field18, @NotNull Field<DivFixedSizeTemplate> field19, @NotNull Field<List<DivTemplate>> field20, @NotNull Field<DivPagerLayoutModeTemplate> field21, @NotNull Field<DivLayoutProviderTemplate> field22, @NotNull Field<DivEdgeInsetsTemplate> field23, @NotNull Field<Expression<DivPager.Orientation>> field24, @NotNull Field<DivEdgeInsetsTemplate> field25, @NotNull Field<DivPageTransformationTemplate> field26, @NotNull Field<Expression<Boolean>> field27, @NotNull Field<Expression<String>> field28, @NotNull Field<Expression<Long>> field29, @NotNull Field<Expression<DivPager.ItemAlignment>> field30, @NotNull Field<List<DivActionTemplate>> field31, @NotNull Field<List<DivTooltipTemplate>> field32, @NotNull Field<DivTransformTemplate> field33, @NotNull Field<DivChangeTransitionTemplate> field34, @NotNull Field<DivAppearanceTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<List<DivTransitionTrigger>> field37, @NotNull Field<List<DivTriggerTemplate>> field38, @NotNull Field<List<DivVariableTemplate>> field39, @NotNull Field<Expression<DivVisibility>> field40, @NotNull Field<DivVisibilityActionTemplate> field41, @NotNull Field<List<DivVisibilityActionTemplate>> field42, @NotNull Field<DivSizeTemplate> field43) {
        this.f56455a = field;
        this.f56456b = field2;
        this.f56457c = field3;
        this.f56458d = field4;
        this.f56459e = field5;
        this.f56460f = field6;
        this.f56461g = field7;
        this.f56462h = field8;
        this.f56463i = field9;
        this.f56464j = field10;
        this.f56465k = field11;
        this.f56466l = field12;
        this.f56467m = field13;
        this.f56468n = field14;
        this.f56469o = field15;
        this.f56470p = field16;
        this.f56471q = field17;
        this.f56472r = field18;
        this.f56473s = field19;
        this.f56474t = field20;
        this.f56475u = field21;
        this.f56476v = field22;
        this.f56477w = field23;
        this.f56478x = field24;
        this.f56479y = field25;
        this.f56480z = field26;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPagerTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPagerTemplate divPagerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPagerTemplate(ParsingEnvironment parsingEnvironment, DivPagerTemplate divPagerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPagerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
