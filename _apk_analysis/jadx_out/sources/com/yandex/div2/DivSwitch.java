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

/* JADX INFO: compiled from: DivSwitch.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSwitch implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a K = new a(null);

    @NotNull
    public static final Expression<Double> L;

    @NotNull
    public static final DivSize.d M;

    @NotNull
    public static final Expression<Boolean> N;

    @NotNull
    public static final Expression<DivVisibility> O;

    @NotNull
    public static final DivSize.c P;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSwitch> Q;

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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f57318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f57319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f57320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f57322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f57323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f57324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f57326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f57327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivFocus f57328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f57329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final DivSize f57330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f57331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f57333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f57334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f57336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivTooltip> f57341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivTransform f57342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivChangeTransition f57343z;

    /* JADX INFO: compiled from: DivSwitch.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSwitch a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        L = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        M = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        N = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        O = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        P = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        Q = new sn.p<ParsingEnvironment, JSONObject, DivSwitch>() { // from class: com.yandex.div2.DivSwitch$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSwitch mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSwitch.K.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSwitch(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression5, @NotNull String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable Expression<Integer> expression6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression7, @Nullable Expression<Long> expression8, @Nullable List<DivAction> list6, @Nullable List<DivTooltip> list7, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list8, @Nullable List<DivTrigger> list9, @Nullable List<? extends DivVariable> list10, @NotNull Expression<DivVisibility> expression9, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list11, @NotNull DivSize divSize2) {
        this.f57318a = divAccessibility;
        this.f57319b = expression;
        this.f57320c = expression2;
        this.f57321d = expression3;
        this.f57322e = list;
        this.f57323f = list2;
        this.f57324g = divBorder;
        this.f57325h = expression4;
        this.f57326i = list3;
        this.f57327j = list4;
        this.f57328k = divFocus;
        this.f57329l = list5;
        this.f57330m = divSize;
        this.f57331n = str;
        this.f57332o = expression5;
        this.f57333p = str2;
        this.f57334q = divLayoutProvider;
        this.f57335r = divEdgeInsets;
        this.f57336s = expression6;
        this.f57337t = divEdgeInsets2;
        this.f57338u = expression7;
        this.f57339v = expression8;
        this.f57340w = list6;
        this.f57341x = list7;
        this.f57342y = divTransform;
        this.f57343z = divChangeTransition;
        this.A = divAppearanceTransition;
        this.B = divAppearanceTransition2;
        this.C = list8;
        this.D = list9;
        this.E = list10;
        this.F = expression9;
        this.G = divVisibilityAction;
        this.H = list11;
        this.I = divSize2;
    }

    public final boolean A(@Nullable DivSwitch divSwitch, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divSwitch == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divSwitch.o(), expressionResolver, expressionResolver2) : divSwitch.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSwitch.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divSwitch.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divSwitch.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divSwitch.w();
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
        if (divSwitch.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSwitch.getBackground();
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
        if (divSwitch.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divSwitch.x(), expressionResolver, expressionResolver2) : divSwitch.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSwitch.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSwitch.k();
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
        if (divSwitch.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSwitch.getExtensions();
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
        if (divSwitch.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divSwitch.n(), expressionResolver, expressionResolver2) : divSwitch.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divSwitch.u();
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
        if (divSwitch.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divSwitch.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divSwitch.getId()) || this.f57332o.evaluate(expressionResolver).booleanValue() != divSwitch.f57332o.evaluate(expressionResolver2).booleanValue() || !tn.p.f(this.f57333p, divSwitch.f57333p)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divSwitch.r(), expressionResolver, expressionResolver2) : divSwitch.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divSwitch.d(), expressionResolver, expressionResolver2) : divSwitch.d() == null)) {
            return false;
        }
        Expression<Integer> expression = this.f57336s;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divSwitch.f57336s;
        if (!tn.p.f(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divSwitch.p(), expressionResolver, expressionResolver2) : divSwitch.p() == null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSwitch.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSwitch.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divSwitch.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i20 = 0;
                    for (Object obj6 : listQ) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj6).a(listQ2.get(i20), expressionResolver, expressionResolver2)) {
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
        if (divSwitch.q() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSwitch.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i22 = 0;
                    for (Object obj7 : listH) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj7).a(listH2.get(i22), expressionResolver, expressionResolver2)) {
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
        if (divSwitch.h() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divSwitch.getTransform(), expressionResolver, expressionResolver2) : divSwitch.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divSwitch.j(), expressionResolver, expressionResolver2) : divSwitch.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divSwitch.v(), expressionResolver, expressionResolver2) : divSwitch.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divSwitch.i(), expressionResolver, expressionResolver2) : divSwitch.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divSwitch.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i24 = 0;
                    for (Object obj8 : listL) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj8) == listL2.get(i24)) {
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
        if (divSwitch.l() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divSwitch.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i26 = 0;
                    for (Object obj9 : listS) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj9).a(listS2.get(i26), expressionResolver, expressionResolver2)) {
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
        if (divSwitch.s() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSwitch.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i28 = 0;
                    for (Object obj10 : listC) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj10).a(listC2.get(i28), expressionResolver, expressionResolver2)) {
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
        if (divSwitch.c() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19 || getVisibility().evaluate(expressionResolver) != divSwitch.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divSwitch.t(), expressionResolver, expressionResolver2) : divSwitch.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSwitch.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i30 = 0;
                    for (Object obj11 : listA) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj11).g(listA2.get(i30), expressionResolver, expressionResolver2)) {
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
        if (divSwitch.a() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        return z20 && getWidth().a(divSwitch.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.H;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f57325h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f57335r;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.f57339v;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.f57338u;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f57319b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f57321d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f57323f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f57327j;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f57330m;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f57331n;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.f57342y;
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
        return this.f57341x;
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSwitch.class).hashCode();
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f57332o.hashCode() + this.f57333p.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash15 = iHashCode5 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHash15 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Expression<Integer> expression = this.f57336s;
        int iHashCode6 = iHash16 + (expression != null ? expression.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash17 = iHashCode6 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
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
    public DivAppearanceTransition i() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.f57343z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f57326i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f57320c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f57328k;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f57318a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f57337t;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.f57340w;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f57334q;
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
        return this.f57329l;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f57322e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f57324g;
    }

    @NotNull
    public final DivSwitch y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression5, @NotNull String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable Expression<Integer> expression6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression7, @Nullable Expression<Long> expression8, @Nullable List<DivAction> list6, @Nullable List<DivTooltip> list7, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list8, @Nullable List<DivTrigger> list9, @Nullable List<? extends DivVariable> list10, @NotNull Expression<DivVisibility> expression9, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list11, @NotNull DivSize divSize2) {
        return new DivSwitch(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, expression7, expression8, list6, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression9, divVisibilityAction, list11, divSize2);
    }
}
