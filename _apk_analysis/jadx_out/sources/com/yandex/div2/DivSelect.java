package com.yandex.div2;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSelect.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSelect implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a U = new a(null);

    @NotNull
    public static final Expression<Double> V;

    @NotNull
    public static final Expression<Long> W;

    @NotNull
    public static final Expression<DivSizeUnit> X;

    @NotNull
    public static final DivSize.d Y;

    @NotNull
    public static final Expression<Integer> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56721a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56722b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f56723c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f56724d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSelect> f56725e0;

    @NotNull
    public final List<Option> A;

    @Nullable
    public final DivEdgeInsets B;

    @Nullable
    public final Expression<String> C;

    @Nullable
    public final Expression<Long> D;

    @Nullable
    public final List<DivAction> E;

    @NotNull
    public final Expression<Integer> F;

    @Nullable
    public final List<DivTooltip> G;

    @Nullable
    public final DivTransform H;

    @Nullable
    public final DivChangeTransition I;

    @Nullable
    public final DivAppearanceTransition J;

    @Nullable
    public final DivAppearanceTransition K;

    @Nullable
    public final List<DivTransitionTrigger> L;

    @NotNull
    public final String M;

    @Nullable
    public final List<DivTrigger> N;

    @Nullable
    public final List<DivVariable> O;

    @NotNull
    public final Expression<DivVisibility> P;

    @Nullable
    public final DivVisibilityAction Q;

    @Nullable
    public final List<DivVisibilityAction> R;

    @NotNull
    public final DivSize S;

    @Nullable
    public Integer T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f56726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f56727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f56728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f56730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f56731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f56732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f56734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f56735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivFocus f56736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Expression<String> f56737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f56739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Expression<JSONObject> f56740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Expression<DivFontWeight> f56741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f56743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DivSize f56744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f56745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Expression<String> f56746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f56747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f56748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f56751z;

    /* JADX INFO: compiled from: DivSelect.kt */
    public static final class Option implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f56752d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Option> f56753e = new sn.p<ParsingEnvironment, JSONObject, Option>() { // from class: com.yandex.div2.DivSelect$Option$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelect.Option mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSelect.Option.f56752d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Expression<String> f56754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<String> f56755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f56756c;

        /* JADX INFO: compiled from: DivSelect.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Option a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().G6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Option(@Nullable Expression<String> expression, @NotNull Expression<String> expression2) {
            this.f56754a = expression;
            this.f56755b = expression2;
        }

        public final boolean a(@Nullable Option option, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (option == null) {
                return false;
            }
            Expression<String> expression = this.f56754a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = option.f56754a;
            return tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && tn.p.f(this.f56755b.evaluate(expressionResolver), option.f56755b.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56756c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Option.class).hashCode();
            Expression<String> expression = this.f56754a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f56755b.hashCode();
            this.f56756c = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSelect.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSelect a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().D6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        X = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f56721a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56722b0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f56723c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f56724d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f56725e0 = new sn.p<ParsingEnvironment, JSONObject, DivSelect>() { // from class: com.yandex.div2.DivSelect$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelect mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSelect.U.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSelect(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable Expression<String> expression5, @NotNull Expression<Long> expression6, @NotNull Expression<DivSizeUnit> expression7, @Nullable Expression<JSONObject> expression8, @Nullable Expression<DivFontWeight> expression9, @Nullable Expression<Long> expression10, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @NotNull Expression<Integer> expression11, @Nullable Expression<String> expression12, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression13, @Nullable Expression<Long> expression14, @Nullable DivEdgeInsets divEdgeInsets, @NotNull List<Option> list6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression15, @Nullable Expression<Long> expression16, @Nullable List<DivAction> list7, @NotNull Expression<Integer> expression17, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull String str2, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression18, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f56726a = divAccessibility;
        this.f56727b = expression;
        this.f56728c = expression2;
        this.f56729d = expression3;
        this.f56730e = list;
        this.f56731f = list2;
        this.f56732g = divBorder;
        this.f56733h = expression4;
        this.f56734i = list3;
        this.f56735j = list4;
        this.f56736k = divFocus;
        this.f56737l = expression5;
        this.f56738m = expression6;
        this.f56739n = expression7;
        this.f56740o = expression8;
        this.f56741p = expression9;
        this.f56742q = expression10;
        this.f56743r = list5;
        this.f56744s = divSize;
        this.f56745t = expression11;
        this.f56746u = expression12;
        this.f56747v = str;
        this.f56748w = divLayoutProvider;
        this.f56749x = expression13;
        this.f56750y = expression14;
        this.f56751z = divEdgeInsets;
        this.A = list6;
        this.B = divEdgeInsets2;
        this.C = expression15;
        this.D = expression16;
        this.E = list7;
        this.F = expression17;
        this.G = list8;
        this.H = divTransform;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list9;
        this.M = str2;
        this.N = list10;
        this.O = list11;
        this.P = expression18;
        this.Q = divVisibilityAction;
        this.R = list12;
        this.S = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSelect z(DivSelect divSelect, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, String str2, List list10, List list11, Expression expression18, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divSelect.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divSelect.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divSelect.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divSelect.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divSelect.w() : list;
        List background = (i10 & 32) != 0 ? divSelect.getBackground() : list2;
        DivBorder divBorderX = (i10 & 64) != 0 ? divSelect.x() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divSelect.b() : expression4;
        List listK = (i10 & 256) != 0 ? divSelect.k() : list3;
        List extensions = (i10 & 512) != 0 ? divSelect.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 1024) != 0 ? divSelect.n() : divFocus;
        Expression expression19 = (i10 & 2048) != 0 ? divSelect.f56737l : expression5;
        Expression expression20 = (i10 & 4096) != 0 ? divSelect.f56738m : expression6;
        Expression expression21 = (i10 & 8192) != 0 ? divSelect.f56739n : expression7;
        Expression expression22 = (i10 & 16384) != 0 ? divSelect.f56740o : expression8;
        Expression expression23 = (i10 & 32768) != 0 ? divSelect.f56741p : expression9;
        Expression expression24 = (i10 & 65536) != 0 ? divSelect.f56742q : expression10;
        List listU = (i10 & 131072) != 0 ? divSelect.u() : list5;
        DivSize height = (i10 & 262144) != 0 ? divSelect.getHeight() : divSize;
        Expression expression25 = expression24;
        Expression expression26 = (i10 & 524288) != 0 ? divSelect.f56745t : expression11;
        Expression expression27 = (i10 & 1048576) != 0 ? divSelect.f56746u : expression12;
        String id2 = (i10 & 2097152) != 0 ? divSelect.getId() : str;
        DivLayoutProvider divLayoutProviderR = (i10 & 4194304) != 0 ? divSelect.r() : divLayoutProvider;
        Expression expression28 = expression27;
        Expression expression29 = (i10 & 8388608) != 0 ? divSelect.f56749x : expression13;
        Expression expression30 = (i10 & 16777216) != 0 ? divSelect.f56750y : expression14;
        return divSelect.y(divAccessibilityO, expressionG, expressionM, alpha, listW, background, divBorderX, expressionB, listK, extensions, divFocusN, expression19, expression20, expression21, expression22, expression23, expression25, listU, height, expression26, expression28, id2, divLayoutProviderR, expression29, expression30, (i10 & 33554432) != 0 ? divSelect.d() : divEdgeInsets, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSelect.A : list6, (i10 & 134217728) != 0 ? divSelect.p() : divEdgeInsets2, (i10 & 268435456) != 0 ? divSelect.f() : expression15, (i10 & 536870912) != 0 ? divSelect.e() : expression16, (i10 & 1073741824) != 0 ? divSelect.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divSelect.F : expression17, (i11 & 1) != 0 ? divSelect.h() : list8, (i11 & 2) != 0 ? divSelect.getTransform() : divTransform, (i11 & 4) != 0 ? divSelect.j() : divChangeTransition, (i11 & 8) != 0 ? divSelect.v() : divAppearanceTransition, (i11 & 16) != 0 ? divSelect.i() : divAppearanceTransition2, (i11 & 32) != 0 ? divSelect.l() : list9, (i11 & 64) != 0 ? divSelect.M : str2, (i11 & 128) != 0 ? divSelect.s() : list10, (i11 & 256) != 0 ? divSelect.c() : list11, (i11 & 512) != 0 ? divSelect.getVisibility() : expression18, (i11 & 1024) != 0 ? divSelect.t() : divVisibilityAction, (i11 & 2048) != 0 ? divSelect.a() : list12, (i11 & 4096) != 0 ? divSelect.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivSelect divSelect, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        if (divSelect == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divSelect.o(), expressionResolver, expressionResolver2) : divSelect.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSelect.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divSelect.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divSelect.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divSelect.w();
            if (listW2 != null) {
                if (listW.size() == listW2.size()) {
                    int i10 = 0;
                    for (Object obj : listW) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAnimator) obj).a(listW2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (divSelect.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSelect.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i12 = 0;
                    for (Object obj2 : background) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivBackground) obj2).a(background2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (divSelect.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divSelect.x(), expressionResolver, expressionResolver2) : divSelect.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSelect.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSelect.k();
            if (listK2 != null) {
                if (listK.size() == listK2.size()) {
                    int i14 = 0;
                    for (Object obj3 : listK) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivDisappearAction) obj3).g(listK2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        if (divSelect.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSelect.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i16 = 0;
                    for (Object obj4 : extensions) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            cn.w.w();
                        }
                        if (((DivExtension) obj4).a(extensions2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (divSelect.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divSelect.n(), expressionResolver, expressionResolver2) : divSelect.n() == null)) {
            return false;
        }
        Expression<String> expression = this.f56737l;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divSelect.f56737l;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f56738m.evaluate(expressionResolver).longValue() != divSelect.f56738m.evaluate(expressionResolver2).longValue() || this.f56739n.evaluate(expressionResolver) != divSelect.f56739n.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression3 = this.f56740o;
        JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression4 = divSelect.f56740o;
        if (!tn.p.f(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression5 = this.f56741p;
        DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression6 = divSelect.f56741p;
        if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f56742q;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divSelect.f56742q;
        if (!tn.p.f(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divSelect.u();
            if (listU2 != null) {
                if (listU.size() == listU2.size()) {
                    int i18 = 0;
                    for (Object obj5 : listU) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            cn.w.w();
                        }
                        if (((DivFunction) obj5).a(listU2.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                    z14 = true;
                }
                z14 = false;
                break;
            }
            return false;
        }
        if (divSelect.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divSelect.getHeight(), expressionResolver, expressionResolver2) || this.f56745t.evaluate(expressionResolver).intValue() != divSelect.f56745t.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression9 = this.f56746u;
        String strEvaluate2 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<String> expression10 = divSelect.f56746u;
        if (!tn.p.f(strEvaluate2, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || !tn.p.f(getId(), divSelect.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divSelect.r(), expressionResolver, expressionResolver2) : divSelect.r() == null)) {
            return false;
        }
        if (!(this.f56749x.evaluate(expressionResolver).doubleValue() == divSelect.f56749x.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression11 = this.f56750y;
        Long lEvaluate3 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<Long> expression12 = divSelect.f56750y;
        if (!tn.p.f(lEvaluate3, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divSelect.d(), expressionResolver, expressionResolver2) : divSelect.d() == null)) {
            return false;
        }
        List<Option> list = this.A;
        List<Option> list2 = divSelect.A;
        if (list.size() != list2.size()) {
            z15 = false;
            break;
        }
        int i20 = 0;
        for (Object obj6 : list) {
            int i21 = i20 + 1;
            if (i20 < 0) {
                cn.w.w();
            }
            if (!((Option) obj6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
                z15 = false;
                break;
            }
            i20 = i21;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divSelect.p(), expressionResolver, expressionResolver2) : divSelect.p() == null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSelect.f();
        if (!tn.p.f(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate4 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSelect.e();
        if (!tn.p.f(lEvaluate4, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divSelect.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i22 = 0;
                    for (Object obj7 : listQ) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj7).a(listQ2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                    z16 = true;
                }
                z16 = false;
                break;
            }
            return false;
        }
        if (divSelect.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || this.F.evaluate(expressionResolver).intValue() != divSelect.F.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSelect.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i24 = 0;
                    for (Object obj8 : listH) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj8).a(listH2.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                    z17 = true;
                }
                z17 = false;
                break;
            }
            return false;
        }
        if (divSelect.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divSelect.getTransform(), expressionResolver, expressionResolver2) : divSelect.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divSelect.j(), expressionResolver, expressionResolver2) : divSelect.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divSelect.v(), expressionResolver, expressionResolver2) : divSelect.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divSelect.i(), expressionResolver, expressionResolver2) : divSelect.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divSelect.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i26 = 0;
                    for (Object obj9 : listL) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj9) == listL2.get(i26)) {
                            i26 = i27;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        if (divSelect.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(this.M, divSelect.M)) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divSelect.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i28 = 0;
                    for (Object obj10 : listS) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj10).a(listS2.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        if (divSelect.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSelect.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i30 = 0;
                    for (Object obj11 : listC) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj11).a(listC2.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                    z20 = true;
                }
                z20 = false;
                break;
            }
            return false;
        }
        if (divSelect.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divSelect.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divSelect.t(), expressionResolver, expressionResolver2) : divSelect.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSelect.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i32 = 0;
                    for (Object obj12 : listA) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj12).g(listA2.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                    z21 = true;
                }
                z21 = false;
                break;
            }
            return false;
        }
        if (divSelect.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divSelect.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.R;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f56733h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f56751z;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.D;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f56727b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f56729d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f56731f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f56735j;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f56744s;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f56747v;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.H;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.P;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.G;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSelect.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash10 = 0;
        int iHash11 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash11 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List<DivAnimator> listW = w();
        if (listW != null) {
            Iterator<T> it = listW.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAnimator) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode3 + iHash;
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it2 = background.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivBackground) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = i10 + iHash2;
        DivBorder divBorderX = x();
        int iHash12 = i11 + (divBorderX != null ? divBorderX.hash() : 0);
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it3 = listK.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivDisappearAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode4 + iHash3;
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it4 = extensions.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivExtension) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = i12 + iHash4;
        DivFocus divFocusN = n();
        int iHash13 = i13 + (divFocusN != null ? divFocusN.hash() : 0);
        Expression<String> expression = this.f56737l;
        int iHashCode5 = iHash13 + (expression != null ? expression.hashCode() : 0) + this.f56738m.hashCode() + this.f56739n.hashCode();
        Expression<JSONObject> expression2 = this.f56740o;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<DivFontWeight> expression3 = this.f56741p;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f56742q;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0);
        List<DivFunction> listU = u();
        if (listU != null) {
            Iterator<T> it5 = listU.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivFunction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int iHash14 = iHashCode8 + iHash5 + getHeight().hash() + this.f56745t.hashCode();
        Expression<String> expression5 = this.f56746u;
        int iHashCode9 = iHash14 + (expression5 != null ? expression5.hashCode() : 0);
        String id2 = getId();
        int iHashCode10 = iHashCode9 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash15 = iHashCode10 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0) + this.f56749x.hashCode();
        Expression<Long> expression6 = this.f56750y;
        int iHashCode11 = iHash15 + (expression6 != null ? expression6.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHashCode11 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Iterator<T> it6 = this.A.iterator();
        int iHash17 = 0;
        while (it6.hasNext()) {
            iHash17 += ((Option) it6.next()).hash();
        }
        int i14 = iHash16 + iHash17;
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash18 = i14 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode12 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode13 = iHashCode12 + (expressionE != null ? expressionE.hashCode() : 0);
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it7 = listQ.iterator();
            iHash6 = 0;
            while (it7.hasNext()) {
                iHash6 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int iHashCode14 = iHashCode13 + iHash6 + this.F.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it8 = listH.iterator();
            iHash7 = 0;
            while (it8.hasNext()) {
                iHash7 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHashCode14 + iHash7;
        DivTransform transform = getTransform();
        int iHash19 = i15 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash21 = iHash20 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode15 = iHash22 + (listL != null ? listL.hashCode() : 0) + this.M.hashCode();
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it9 = listS.iterator();
            iHash8 = 0;
            while (it9.hasNext()) {
                iHash8 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode15 + iHash8;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it10 = listC.iterator();
            iHash9 = 0;
            while (it10.hasNext()) {
                iHash9 += ((DivVariable) it10.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode16 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash23 = iHashCode16 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash10 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.T = Integer.valueOf(iHash24);
        return iHash24;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f56734i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f56728c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f56736k;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f56726a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f56748w;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f56743r;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.J;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f56730e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f56732g;
    }

    @NotNull
    public final DivSelect y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable Expression<String> expression5, @NotNull Expression<Long> expression6, @NotNull Expression<DivSizeUnit> expression7, @Nullable Expression<JSONObject> expression8, @Nullable Expression<DivFontWeight> expression9, @Nullable Expression<Long> expression10, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @NotNull Expression<Integer> expression11, @Nullable Expression<String> expression12, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression13, @Nullable Expression<Long> expression14, @Nullable DivEdgeInsets divEdgeInsets, @NotNull List<Option> list6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression15, @Nullable Expression<Long> expression16, @Nullable List<DivAction> list7, @NotNull Expression<Integer> expression17, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull String str2, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression18, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivSelect(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, expression5, expression6, expression7, expression8, expression9, expression10, list5, divSize, expression11, expression12, str, divLayoutProvider, expression13, expression14, divEdgeInsets, list6, divEdgeInsets2, expression15, expression16, list7, expression17, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, str2, list10, list11, expression18, divVisibilityAction, list12, divSize2);
    }
}
