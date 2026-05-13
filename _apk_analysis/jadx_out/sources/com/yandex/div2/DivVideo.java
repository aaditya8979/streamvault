package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
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

/* JADX INFO: compiled from: DivVideo.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivVideo implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a W = new a(null);

    @NotNull
    public static final Expression<Double> X;

    @NotNull
    public static final Expression<Boolean> Y;

    @NotNull
    public static final DivSize.d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58123b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58124c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVideoScale> f58125d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f58126e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f58127f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVideo> f58128g0;

    @NotNull
    public final Expression<Boolean> A;

    @Nullable
    public final Expression<String> B;

    @NotNull
    public final Expression<Boolean> C;

    @Nullable
    public final List<DivAction> D;

    @Nullable
    public final Expression<String> E;

    @Nullable
    public final Expression<Long> F;

    @NotNull
    public final Expression<DivVideoScale> G;

    @Nullable
    public final List<DivAction> H;

    @Nullable
    public final List<DivTooltip> I;

    @Nullable
    public final DivTransform J;

    @Nullable
    public final DivChangeTransition K;

    @Nullable
    public final DivAppearanceTransition L;

    @Nullable
    public final DivAppearanceTransition M;

    @Nullable
    public final List<DivTransitionTrigger> N;

    @Nullable
    public final List<DivTrigger> O;

    @Nullable
    public final List<DivVariable> P;

    @NotNull
    public final List<DivVideoSource> Q;

    @NotNull
    public final Expression<DivVisibility> R;

    @Nullable
    public final DivVisibilityAction S;

    @Nullable
    public final List<DivVisibilityAction> T;

    @NotNull
    public final DivSize U;

    @Nullable
    public Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f58129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f58130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f58131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f58132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f58133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final DivAspect f58134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f58135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f58136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivBorder f58137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f58138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f58139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f58140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final String f58141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f58142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f58143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f58144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DivFocus f58145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f58146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DivSize f58147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final String f58148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f58149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f58150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f58151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f58152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f58153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final JSONObject f58154z;

    /* JADX INFO: compiled from: DivVideo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivVideo a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f58122a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58123b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58124c0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58125d0 = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        f58126e0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f58127f0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        f58128g0 = new sn.p<ParsingEnvironment, JSONObject, DivVideo>() { // from class: com.yandex.div2.DivVideo$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideo mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivVideo.W.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivVideo(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable DivAspect divAspect, @NotNull Expression<Boolean> expression4, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable List<DivAction> list3, @Nullable Expression<Long> expression5, @Nullable List<DivDisappearAction> list4, @Nullable String str, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable List<DivAction> list7, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list8, @NotNull DivSize divSize, @Nullable String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Boolean> expression6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list9, @Nullable JSONObject jSONObject, @NotNull Expression<Boolean> expression7, @Nullable Expression<String> expression8, @NotNull Expression<Boolean> expression9, @Nullable List<DivAction> list10, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @NotNull Expression<DivVideoScale> expression12, @Nullable List<DivAction> list11, @Nullable List<DivTooltip> list12, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list13, @Nullable List<DivTrigger> list14, @Nullable List<? extends DivVariable> list15, @NotNull List<DivVideoSource> list16, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list17, @NotNull DivSize divSize2) {
        this.f58129a = divAccessibility;
        this.f58130b = expression;
        this.f58131c = expression2;
        this.f58132d = expression3;
        this.f58133e = list;
        this.f58134f = divAspect;
        this.f58135g = expression4;
        this.f58136h = list2;
        this.f58137i = divBorder;
        this.f58138j = list3;
        this.f58139k = expression5;
        this.f58140l = list4;
        this.f58141m = str;
        this.f58142n = list5;
        this.f58143o = list6;
        this.f58144p = list7;
        this.f58145q = divFocus;
        this.f58146r = list8;
        this.f58147s = divSize;
        this.f58148t = str2;
        this.f58149u = divLayoutProvider;
        this.f58150v = divEdgeInsets;
        this.f58151w = expression6;
        this.f58152x = divEdgeInsets2;
        this.f58153y = list9;
        this.f58154z = jSONObject;
        this.A = expression7;
        this.B = expression8;
        this.C = expression9;
        this.D = list10;
        this.E = expression10;
        this.F = expression11;
        this.G = expression12;
        this.H = list11;
        this.I = list12;
        this.J = divTransform;
        this.K = divChangeTransition;
        this.L = divAppearanceTransition;
        this.M = divAppearanceTransition2;
        this.N = list13;
        this.O = list14;
        this.P = list15;
        this.Q = list16;
        this.R = expression13;
        this.S = divVisibilityAction;
        this.T = list17;
        this.U = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivVideo z(DivVideo divVideo, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, DivAspect divAspect, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list13, List list14, List list15, List list16, Expression expression13, DivVisibilityAction divVisibilityAction, List list17, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divVideo.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divVideo.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divVideo.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divVideo.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divVideo.w() : list;
        DivAspect divAspect2 = (i10 & 32) != 0 ? divVideo.f58134f : divAspect;
        Expression expression14 = (i10 & 64) != 0 ? divVideo.f58135g : expression4;
        List background = (i10 & 128) != 0 ? divVideo.getBackground() : list2;
        DivBorder divBorderX = (i10 & 256) != 0 ? divVideo.x() : divBorder;
        List list18 = (i10 & 512) != 0 ? divVideo.f58138j : list3;
        Expression expressionB = (i10 & 1024) != 0 ? divVideo.b() : expression5;
        List listK = (i10 & 2048) != 0 ? divVideo.k() : list4;
        String str3 = (i10 & 4096) != 0 ? divVideo.f58141m : str;
        List list19 = (i10 & 8192) != 0 ? divVideo.f58142n : list5;
        List extensions = (i10 & 16384) != 0 ? divVideo.getExtensions() : list6;
        List list20 = (i10 & 32768) != 0 ? divVideo.f58144p : list7;
        DivFocus divFocusN = (i10 & 65536) != 0 ? divVideo.n() : divFocus;
        List listU = (i10 & 131072) != 0 ? divVideo.u() : list8;
        DivSize height = (i10 & 262144) != 0 ? divVideo.getHeight() : divSize;
        String id2 = (i10 & 524288) != 0 ? divVideo.getId() : str2;
        DivLayoutProvider divLayoutProviderR = (i10 & 1048576) != 0 ? divVideo.r() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 2097152) != 0 ? divVideo.d() : divEdgeInsets;
        List list21 = list20;
        Expression expression15 = (i10 & 4194304) != 0 ? divVideo.f58151w : expression6;
        return divVideo.y(divAccessibilityO, expressionG, expressionM, alpha, listW, divAspect2, expression14, background, divBorderX, list18, expressionB, listK, str3, list19, extensions, list21, divFocusN, listU, height, id2, divLayoutProviderR, divEdgeInsetsD, expression15, (i10 & 8388608) != 0 ? divVideo.p() : divEdgeInsets2, (i10 & 16777216) != 0 ? divVideo.f58153y : list9, (i10 & 33554432) != 0 ? divVideo.f58154z : jSONObject, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divVideo.A : expression7, (i10 & 134217728) != 0 ? divVideo.B : expression8, (i10 & 268435456) != 0 ? divVideo.C : expression9, (i10 & 536870912) != 0 ? divVideo.D : list10, (i10 & 1073741824) != 0 ? divVideo.f() : expression10, (i10 & Integer.MIN_VALUE) != 0 ? divVideo.e() : expression11, (i11 & 1) != 0 ? divVideo.G : expression12, (i11 & 2) != 0 ? divVideo.q() : list11, (i11 & 4) != 0 ? divVideo.h() : list12, (i11 & 8) != 0 ? divVideo.getTransform() : divTransform, (i11 & 16) != 0 ? divVideo.j() : divChangeTransition, (i11 & 32) != 0 ? divVideo.v() : divAppearanceTransition, (i11 & 64) != 0 ? divVideo.i() : divAppearanceTransition2, (i11 & 128) != 0 ? divVideo.l() : list13, (i11 & 256) != 0 ? divVideo.s() : list14, (i11 & 512) != 0 ? divVideo.c() : list15, (i11 & 1024) != 0 ? divVideo.Q : list16, (i11 & 2048) != 0 ? divVideo.getVisibility() : expression13, (i11 & 4096) != 0 ? divVideo.t() : divVisibilityAction, (i11 & 8192) != 0 ? divVideo.a() : list17, (i11 & 16384) != 0 ? divVideo.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivVideo divVideo, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        if (divVideo == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divVideo.o(), expressionResolver, expressionResolver2) : divVideo.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divVideo.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divVideo.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divVideo.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divVideo.w();
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
        if (divVideo.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        DivAspect divAspect = this.f58134f;
        if (!(divAspect != null ? divAspect.a(divVideo.f58134f, expressionResolver, expressionResolver2) : divVideo.f58134f == null) || this.f58135g.evaluate(expressionResolver).booleanValue() != divVideo.f58135g.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divVideo.getBackground();
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
        if (divVideo.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divVideo.x(), expressionResolver, expressionResolver2) : divVideo.x() == null)) {
            return false;
        }
        List<DivAction> list = this.f58138j;
        if (list != null) {
            List<DivAction> list2 = divVideo.f58138j;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i14 = 0;
                    for (Object obj3 : list) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj3).a(list2.get(i14), expressionResolver, expressionResolver2)) {
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
        if (divVideo.f58138j != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divVideo.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divVideo.k();
            if (listK2 != null) {
                if (listK.size() == listK2.size()) {
                    int i16 = 0;
                    for (Object obj4 : listK) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            cn.w.w();
                        }
                        if (((DivDisappearAction) obj4).g(listK2.get(i16), expressionResolver, expressionResolver2)) {
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
        if (divVideo.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13 || !tn.p.f(this.f58141m, divVideo.f58141m)) {
            return false;
        }
        List<DivAction> list3 = this.f58142n;
        if (list3 != null) {
            List<DivAction> list4 = divVideo.f58142n;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i18 = 0;
                    for (Object obj5 : list3) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj5).a(list4.get(i18), expressionResolver, expressionResolver2)) {
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
        if (divVideo.f58142n != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divVideo.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i20 = 0;
                    for (Object obj6 : extensions) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((DivExtension) obj6).a(extensions2.get(i20), expressionResolver, expressionResolver2)) {
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
        if (divVideo.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        List<DivAction> list5 = this.f58144p;
        if (list5 != null) {
            List<DivAction> list6 = divVideo.f58144p;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i22 = 0;
                    for (Object obj7 : list5) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj7).a(list6.get(i22), expressionResolver, expressionResolver2)) {
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
        if (divVideo.f58144p != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divVideo.n(), expressionResolver, expressionResolver2) : divVideo.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divVideo.u();
            if (listU2 != null) {
                if (listU.size() == listU2.size()) {
                    int i24 = 0;
                    for (Object obj8 : listU) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivFunction) obj8).a(listU2.get(i24), expressionResolver, expressionResolver2)) {
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
        if (divVideo.u() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17 || !getHeight().a(divVideo.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divVideo.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divVideo.r(), expressionResolver, expressionResolver2) : divVideo.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divVideo.d(), expressionResolver, expressionResolver2) : divVideo.d() == null) || this.f58151w.evaluate(expressionResolver).booleanValue() != divVideo.f58151w.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divVideo.p(), expressionResolver, expressionResolver2) : divVideo.p() == null)) {
            return false;
        }
        List<DivAction> list7 = this.f58153y;
        if (list7 != null) {
            List<DivAction> list8 = divVideo.f58153y;
            if (list8 != null) {
                if (list7.size() == list8.size()) {
                    int i26 = 0;
                    for (Object obj9 : list7) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj9).a(list8.get(i26), expressionResolver, expressionResolver2)) {
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
        if (divVideo.f58153y != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(this.f58154z, divVideo.f58154z) || this.A.evaluate(expressionResolver).booleanValue() != divVideo.A.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression = this.B;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divVideo.B;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver).booleanValue() != divVideo.C.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list9 = this.D;
        if (list9 != null) {
            List<DivAction> list10 = divVideo.D;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i28 = 0;
                    for (Object obj10 : list9) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
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
        if (divVideo.D != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divVideo.f();
        if (!tn.p.f(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divVideo.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.G.evaluate(expressionResolver) != divVideo.G.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divVideo.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i30 = 0;
                    for (Object obj11 : listQ) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj11).a(listQ2.get(i30), expressionResolver, expressionResolver2)) {
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
        if (divVideo.q() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divVideo.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i32 = 0;
                    for (Object obj12 : listH) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj12).a(listH2.get(i32), expressionResolver, expressionResolver2)) {
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
        if (divVideo.h() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divVideo.getTransform(), expressionResolver, expressionResolver2) : divVideo.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divVideo.j(), expressionResolver, expressionResolver2) : divVideo.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divVideo.v(), expressionResolver, expressionResolver2) : divVideo.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divVideo.i(), expressionResolver, expressionResolver2) : divVideo.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divVideo.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i34 = 0;
                    for (Object obj13 : listL) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj13) == listL2.get(i34)) {
                            i34 = i35;
                        }
                    }
                    z22 = true;
                }
                z22 = false;
                break;
            }
            return false;
        }
        if (divVideo.l() != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divVideo.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i36 = 0;
                    for (Object obj14 : listS) {
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj14).a(listS2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                    z23 = true;
                }
                z23 = false;
                break;
            }
            return false;
        }
        if (divVideo.s() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divVideo.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i38 = 0;
                    for (Object obj15 : listC) {
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj15).a(listC2.get(i38), expressionResolver, expressionResolver2)) {
                            i38 = i39;
                        }
                    }
                    z24 = true;
                }
                z24 = false;
                break;
            }
            return false;
        }
        if (divVideo.c() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        List<DivVideoSource> list11 = this.Q;
        List<DivVideoSource> list12 = divVideo.Q;
        if (list11.size() != list12.size()) {
            z25 = false;
            break;
        }
        int i40 = 0;
        for (Object obj16 : list11) {
            int i41 = i40 + 1;
            if (i40 < 0) {
                cn.w.w();
            }
            if (!((DivVideoSource) obj16).a(list12.get(i40), expressionResolver, expressionResolver2)) {
                z25 = false;
                break;
            }
            i40 = i41;
        }
        z25 = true;
        if (!z25 || getVisibility().evaluate(expressionResolver) != divVideo.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divVideo.t(), expressionResolver, expressionResolver2) : divVideo.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divVideo.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i42 = 0;
                    for (Object obj17 : listA) {
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj17).g(listA2.get(i42), expressionResolver, expressionResolver2)) {
                            i42 = i43;
                        }
                    }
                    z26 = true;
                }
                z26 = false;
                break;
            }
            return false;
        }
        if (divVideo.a() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        return z26 && getWidth().a(divVideo.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f58139k;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f58150v;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.F;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f58130b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f58132d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f58136h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f58143o;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f58147s;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f58148t;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.J;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.R;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.U;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.I;
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
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivVideo.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash15 = 0;
        int iHash16 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash16 + (expressionG != null ? expressionG.hashCode() : 0);
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
        DivAspect divAspect = this.f58134f;
        int iHash17 = i10 + (divAspect != null ? divAspect.hash() : 0) + this.f58135g.hashCode();
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
        int i11 = iHash17 + iHash2;
        DivBorder divBorderX = x();
        int iHash18 = i11 + (divBorderX != null ? divBorderX.hash() : 0);
        List<DivAction> list = this.f58138j;
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash18 + iHash3;
        Expression<Long> expressionB = b();
        int iHashCode4 = i12 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivDisappearAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode4 + iHash4;
        String str = this.f58141m;
        int iHashCode5 = i13 + (str != null ? str.hashCode() : 0);
        List<DivAction> list2 = this.f58142n;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = iHashCode5 + iHash5;
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivExtension) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = i14 + iHash6;
        List<DivAction> list3 = this.f58144p;
        if (list3 != null) {
            Iterator<T> it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        DivFocus divFocusN = n();
        int iHash19 = i16 + (divFocusN != null ? divFocusN.hash() : 0);
        List<DivFunction> listU = u();
        if (listU != null) {
            Iterator<T> it8 = listU.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivFunction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash20 = iHash19 + iHash8 + getHeight().hash();
        String id2 = getId();
        int iHashCode6 = iHash20 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash21 = iHashCode6 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash22 = iHash21 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f58151w.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash23 = iHash22 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<DivAction> list4 = this.f58153y;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash23 + iHash9;
        JSONObject jSONObject = this.f58154z;
        int iHashCode7 = i17 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.A.hashCode();
        Expression<String> expression = this.B;
        int iHashCode8 = iHashCode7 + (expression != null ? expression.hashCode() : 0) + this.C.hashCode();
        List<DivAction> list5 = this.D;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode8 + iHash10;
        Expression<String> expressionF = f();
        int iHashCode9 = i18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode10 = iHashCode9 + (expressionE != null ? expressionE.hashCode() : 0) + this.G.hashCode();
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it11 = listQ.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode10 + iHash11;
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it12 = listH.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivTooltip) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        DivTransform transform = getTransform();
        int iHash24 = i20 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash25 = iHash24 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash26 = iHash25 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash27 = iHash26 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode11 = iHash27 + (listL != null ? listL.hashCode() : 0);
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it13 = listS.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivTrigger) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode11 + iHash13;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it14 = listC.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivVariable) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Iterator<T> it15 = this.Q.iterator();
        int iHash28 = 0;
        while (it15.hasNext()) {
            iHash28 += ((DivVideoSource) it15.next()).hash();
        }
        int iHashCode12 = i22 + iHash28 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash29 = iHashCode12 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it16 = listA.iterator();
            while (it16.hasNext()) {
                iHash15 += ((DivVisibilityAction) it16.next()).hash();
            }
        }
        int iHash30 = iHash29 + iHash15 + getWidth().hash();
        this.V = Integer.valueOf(iHash30);
        return iHash30;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f58140l;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f58131c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f58145q;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f58129a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f58152x;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.H;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f58149u;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f58146r;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f58133e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f58137i;
    }

    @NotNull
    public final DivVideo y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable DivAspect divAspect, @NotNull Expression<Boolean> expression4, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable List<DivAction> list3, @Nullable Expression<Long> expression5, @Nullable List<DivDisappearAction> list4, @Nullable String str, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable List<DivAction> list7, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list8, @NotNull DivSize divSize, @Nullable String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Boolean> expression6, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list9, @Nullable JSONObject jSONObject, @NotNull Expression<Boolean> expression7, @Nullable Expression<String> expression8, @NotNull Expression<Boolean> expression9, @Nullable List<DivAction> list10, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @NotNull Expression<DivVideoScale> expression12, @Nullable List<DivAction> list11, @Nullable List<DivTooltip> list12, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list13, @Nullable List<DivTrigger> list14, @Nullable List<? extends DivVariable> list15, @NotNull List<DivVideoSource> list16, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list17, @NotNull DivSize divSize2) {
        return new DivVideo(divAccessibility, expression, expression2, expression3, list, divAspect, expression4, list2, divBorder, list3, expression5, list4, str, list5, list6, list7, divFocus, list8, divSize, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, list9, jSONObject, expression7, expression8, expression9, list10, expression10, expression11, expression12, list11, list12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list13, list14, list15, list16, expression13, divVisibilityAction, list17, divSize2);
    }
}
