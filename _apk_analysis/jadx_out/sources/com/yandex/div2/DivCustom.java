package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCustom.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCustom implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a L = new a(null);

    @NotNull
    public static final Expression<Double> M;

    @NotNull
    public static final DivSize.d N;

    @NotNull
    public static final Expression<DivVisibility> O;

    @NotNull
    public static final DivSize.c P;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCustom> Q;

    @Nullable
    public final DivAppearanceTransition A;

    @Nullable
    public final DivAppearanceTransition B;

    @Nullable
    public final List<DivTransitionTrigger> C;

    @Nullable
    public final List<DivTrigger> D;

    @Nullable
    public final List<DivVariable> E;

    @NotNull
    public final Expression<DivVisibility> F;

    @Nullable
    public final DivVisibilityAction G;

    @Nullable
    public final List<DivVisibilityAction> H;

    @NotNull
    public final DivSize I;

    @Nullable
    public Integer J;

    @Nullable
    public Integer K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f55010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f55016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final JSONObject f55018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f55019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final DivFocus f55022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final DivSize f55024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f55025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<Div> f55026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f55027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Expression<String> f55030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivTooltip> f55033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivTransform f55034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivChangeTransition f55035z;

    /* JADX INFO: compiled from: DivCustom.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCustom a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        M = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        N = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        O = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        P = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        Q = new sn.p<ParsingEnvironment, JSONObject, DivCustom>() { // from class: com.yandex.div2.DivCustom$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCustom mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivCustom.L.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivCustom(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable JSONObject jSONObject, @NotNull String str, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str2, @Nullable List<? extends Div> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression5, @Nullable Expression<Long> expression6, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression7, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f55010a = divAccessibility;
        this.f55011b = expression;
        this.f55012c = expression2;
        this.f55013d = expression3;
        this.f55014e = list;
        this.f55015f = list2;
        this.f55016g = divBorder;
        this.f55017h = expression4;
        this.f55018i = jSONObject;
        this.f55019j = str;
        this.f55020k = list3;
        this.f55021l = list4;
        this.f55022m = divFocus;
        this.f55023n = list5;
        this.f55024o = divSize;
        this.f55025p = str2;
        this.f55026q = list6;
        this.f55027r = divLayoutProvider;
        this.f55028s = divEdgeInsets;
        this.f55029t = divEdgeInsets2;
        this.f55030u = expression5;
        this.f55031v = expression6;
        this.f55032w = list7;
        this.f55033x = list8;
        this.f55034y = divTransform;
        this.f55035z = divChangeTransition;
        this.A = divAppearanceTransition;
        this.B = divAppearanceTransition2;
        this.C = list9;
        this.D = list10;
        this.E = list11;
        this.F = expression7;
        this.G = divVisibilityAction;
        this.H = list12;
        this.I = divSize2;
    }

    public final boolean A(@Nullable DivCustom divCustom, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divCustom == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divCustom.o(), expressionResolver, expressionResolver2) : divCustom.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divCustom.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divCustom.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divCustom.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divCustom.w();
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
        if (divCustom.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divCustom.getBackground();
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
        if (divCustom.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divCustom.x(), expressionResolver, expressionResolver2) : divCustom.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divCustom.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || !tn.p.f(this.f55018i, divCustom.f55018i) || !tn.p.f(this.f55019j, divCustom.f55019j)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divCustom.k();
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
        if (divCustom.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divCustom.getExtensions();
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
        if (divCustom.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divCustom.n(), expressionResolver, expressionResolver2) : divCustom.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divCustom.u();
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
        if (divCustom.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divCustom.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divCustom.getId())) {
            return false;
        }
        List<Div> list = this.f55026q;
        if (list != null) {
            List<Div> list2 = divCustom.f55026q;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i20 = 0;
                    for (Object obj6 : list) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((Div) obj6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                    z15 = true;
                }
                z15 = false;
                break;
            }
            return false;
        }
        if (divCustom.f55026q != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divCustom.r(), expressionResolver, expressionResolver2) : divCustom.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divCustom.d(), expressionResolver, expressionResolver2) : divCustom.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divCustom.p(), expressionResolver, expressionResolver2) : divCustom.p() == null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divCustom.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divCustom.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divCustom.q();
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
        if (divCustom.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divCustom.h();
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
        if (divCustom.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divCustom.getTransform(), expressionResolver, expressionResolver2) : divCustom.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divCustom.j(), expressionResolver, expressionResolver2) : divCustom.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divCustom.v(), expressionResolver, expressionResolver2) : divCustom.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divCustom.i(), expressionResolver, expressionResolver2) : divCustom.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divCustom.l();
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
        if (divCustom.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divCustom.s();
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
        if (divCustom.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divCustom.c();
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
        if (divCustom.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divCustom.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divCustom.t(), expressionResolver, expressionResolver2) : divCustom.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divCustom.a();
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
        if (divCustom.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divCustom.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.H;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55017h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f55028s;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.f55031v;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.f55030u;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55011b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55013d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55015f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55021l;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55024o;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f55025p;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.f55034y;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.F;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.f55033x;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.K;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.f55026q;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.K = Integer.valueOf(i10);
        return i10;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.f55035z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f55020k;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55012c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55022m;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55010a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f55029t;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCustom.class).hashCode();
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
        JSONObject jSONObject = this.f55018i;
        int iHashCode5 = iHashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.f55019j.hashCode();
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
        int i12 = iHashCode5 + iHash3;
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
        int iHash14 = iHash13 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode6 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash15 = iHashCode6 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHash15 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash17 = iHash16 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHash17 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0);
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it6 = listQ.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivAction) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHashCode8 + iHash6;
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it7 = listH.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivTooltip) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = i14 + iHash7;
        DivTransform transform = getTransform();
        int iHash18 = i15 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash19 = iHash18 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash20 = iHash19 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash21 = iHash20 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode9 = iHash21 + (listL != null ? listL.hashCode() : 0);
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it8 = listS.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode9 + iHash8;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it9 = listC.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivVariable) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode10 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash22 = iHashCode10 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash23 = iHash22 + iHash10 + getWidth().hash();
        this.J = Integer.valueOf(iHash23);
        return iHash23;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.f55032w;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f55027r;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.D;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.G;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f55023n;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55014e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55016g;
    }

    @NotNull
    public final DivCustom y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable JSONObject jSONObject, @NotNull String str, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str2, @Nullable List<? extends Div> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression5, @Nullable Expression<Long> expression6, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression7, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivCustom(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, jSONObject, str, list3, list4, divFocus, list5, divSize, str2, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression5, expression6, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression7, divVisibilityAction, list12, divSize2);
    }
}
