package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGifImage.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivGifImage implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a Z = new a(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f55495a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55496b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55497c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55498d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55499e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55500f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55501g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55502h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55503i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55504j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55505k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivGifImage> f55506l0;

    @Nullable
    public final List<DivAction> A;

    @Nullable
    public final DivEdgeInsets B;

    @Nullable
    public final DivEdgeInsets C;

    @NotNull
    public final Expression<Integer> D;

    @NotNull
    public final Expression<Boolean> E;

    @Nullable
    public final List<DivAction> F;

    @Nullable
    public final List<DivAction> G;

    @Nullable
    public final Expression<String> H;

    @Nullable
    public final Expression<String> I;

    @Nullable
    public final Expression<Long> J;

    @NotNull
    public final Expression<DivImageScale> K;

    @Nullable
    public final List<DivAction> L;

    @Nullable
    public final List<DivTooltip> M;

    @Nullable
    public final DivTransform N;

    @Nullable
    public final DivChangeTransition O;

    @Nullable
    public final DivAppearanceTransition P;

    @Nullable
    public final DivAppearanceTransition Q;

    @Nullable
    public final List<DivTransitionTrigger> R;

    @Nullable
    public final List<DivTrigger> S;

    @Nullable
    public final List<DivVariable> T;

    @NotNull
    public final Expression<DivVisibility> U;

    @Nullable
    public final DivVisibilityAction V;

    @Nullable
    public final List<DivVisibilityAction> W;

    @NotNull
    public final DivSize X;

    @Nullable
    public Integer Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f55507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f55508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f55509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivAspect f55515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivBorder f55517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentHorizontal> f55520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentVertical> f55521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final DivFocus f55525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f55527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final DivSize f55528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final String f55531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f55532z;

    /* JADX INFO: compiled from: DivGifImage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivGifImage a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f55495a0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55496b0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55497c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55498d0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55499e0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55500f0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f55501g0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55502h0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55503i0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55504j0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55505k0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f55506l0 = new sn.p<ParsingEnvironment, JSONObject, DivGifImage>() { // from class: com.yandex.div2.DivGifImage$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGifImage mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivGifImage.Z.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivGifImage(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivAlignmentHorizontal> expression6, @NotNull Expression<DivAlignmentVertical> expression7, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull Expression<Uri> expression8, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Integer> expression9, @NotNull Expression<Boolean> expression10, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression11, @Nullable Expression<String> expression12, @Nullable Expression<Long> expression13, @NotNull Expression<DivImageScale> expression14, @Nullable List<DivAction> list13, @Nullable List<DivTooltip> list14, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list15, @Nullable List<DivTrigger> list16, @Nullable List<? extends DivVariable> list17, @NotNull Expression<DivVisibility> expression15, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list18, @NotNull DivSize divSize2) {
        this.f55507a = divAccessibility;
        this.f55508b = divAction;
        this.f55509c = divAnimation;
        this.f55510d = list;
        this.f55511e = expression;
        this.f55512f = expression2;
        this.f55513g = expression3;
        this.f55514h = list2;
        this.f55515i = divAspect;
        this.f55516j = list3;
        this.f55517k = divBorder;
        this.f55518l = expression4;
        this.f55519m = expression5;
        this.f55520n = expression6;
        this.f55521o = expression7;
        this.f55522p = list4;
        this.f55523q = list5;
        this.f55524r = list6;
        this.f55525s = divFocus;
        this.f55526t = list7;
        this.f55527u = expression8;
        this.f55528v = divSize;
        this.f55529w = list8;
        this.f55530x = list9;
        this.f55531y = str;
        this.f55532z = divLayoutProvider;
        this.A = list10;
        this.B = divEdgeInsets;
        this.C = divEdgeInsets2;
        this.D = expression9;
        this.E = expression10;
        this.F = list11;
        this.G = list12;
        this.H = expression11;
        this.I = expression12;
        this.J = expression13;
        this.K = expression14;
        this.L = list13;
        this.M = list14;
        this.N = divTransform;
        this.O = divChangeTransition;
        this.P = divAppearanceTransition;
        this.Q = divAppearanceTransition2;
        this.R = list15;
        this.S = list16;
        this.T = list17;
        this.U = expression15;
        this.V = divVisibilityAction;
        this.W = list18;
        this.X = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivGifImage z(DivGifImage divGifImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divGifImage.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divGifImage.f55508b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divGifImage.f55509c : divAnimation;
        List list19 = (i10 & 8) != 0 ? divGifImage.f55510d : list;
        Expression expressionG = (i10 & 16) != 0 ? divGifImage.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divGifImage.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divGifImage.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divGifImage.w() : list2;
        DivAspect divAspect2 = (i10 & 256) != 0 ? divGifImage.f55515i : divAspect;
        List background = (i10 & 512) != 0 ? divGifImage.getBackground() : list3;
        DivBorder divBorderX = (i10 & 1024) != 0 ? divGifImage.x() : divBorder;
        Expression expression16 = (i10 & 2048) != 0 ? divGifImage.f55518l : expression4;
        Expression expressionB = (i10 & 4096) != 0 ? divGifImage.b() : expression5;
        Expression expression17 = (i10 & 8192) != 0 ? divGifImage.f55520n : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? divGifImage.f55521o : expression7;
        List listK = (i10 & 32768) != 0 ? divGifImage.k() : list4;
        Expression expression19 = expression18;
        List list20 = (i10 & 65536) != 0 ? divGifImage.f55523q : list5;
        List extensions = (i10 & 131072) != 0 ? divGifImage.getExtensions() : list6;
        DivFocus divFocusN = (i10 & 262144) != 0 ? divGifImage.n() : divFocus;
        List listU = (i10 & 524288) != 0 ? divGifImage.u() : list7;
        List list21 = list20;
        Expression expression20 = (i10 & 1048576) != 0 ? divGifImage.f55527u : expression8;
        DivSize height = (i10 & 2097152) != 0 ? divGifImage.getHeight() : divSize;
        Expression expression21 = expression20;
        List list22 = (i10 & 4194304) != 0 ? divGifImage.f55529w : list8;
        List list23 = (i10 & 8388608) != 0 ? divGifImage.f55530x : list9;
        String id2 = (i10 & 16777216) != 0 ? divGifImage.getId() : str;
        DivLayoutProvider divLayoutProviderR = (i10 & 33554432) != 0 ? divGifImage.r() : divLayoutProvider;
        List list24 = list23;
        List list25 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divGifImage.A : list10;
        return divGifImage.y(divAccessibilityO, divAction2, divAnimation2, list19, expressionG, expressionM, alpha, listW, divAspect2, background, divBorderX, expression16, expressionB, expression17, expression19, listK, list21, extensions, divFocusN, listU, expression21, height, list22, list24, id2, divLayoutProviderR, list25, (i10 & 134217728) != 0 ? divGifImage.d() : divEdgeInsets, (i10 & 268435456) != 0 ? divGifImage.p() : divEdgeInsets2, (i10 & 536870912) != 0 ? divGifImage.D : expression9, (i10 & 1073741824) != 0 ? divGifImage.E : expression10, (i10 & Integer.MIN_VALUE) != 0 ? divGifImage.F : list11, (i11 & 1) != 0 ? divGifImage.G : list12, (i11 & 2) != 0 ? divGifImage.H : expression11, (i11 & 4) != 0 ? divGifImage.f() : expression12, (i11 & 8) != 0 ? divGifImage.e() : expression13, (i11 & 16) != 0 ? divGifImage.K : expression14, (i11 & 32) != 0 ? divGifImage.q() : list13, (i11 & 64) != 0 ? divGifImage.h() : list14, (i11 & 128) != 0 ? divGifImage.getTransform() : divTransform, (i11 & 256) != 0 ? divGifImage.j() : divChangeTransition, (i11 & 512) != 0 ? divGifImage.v() : divAppearanceTransition, (i11 & 1024) != 0 ? divGifImage.i() : divAppearanceTransition2, (i11 & 2048) != 0 ? divGifImage.l() : list15, (i11 & 4096) != 0 ? divGifImage.s() : list16, (i11 & 8192) != 0 ? divGifImage.c() : list17, (i11 & 16384) != 0 ? divGifImage.getVisibility() : expression15, (i11 & 32768) != 0 ? divGifImage.t() : divVisibilityAction, (i11 & 65536) != 0 ? divGifImage.a() : list18, (i11 & 131072) != 0 ? divGifImage.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivGifImage divGifImage, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        boolean z27;
        if (divGifImage == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divGifImage.o(), expressionResolver, expressionResolver2) : divGifImage.o() == null)) {
            return false;
        }
        DivAction divAction = this.f55508b;
        if (!(divAction != null ? divAction.a(divGifImage.f55508b, expressionResolver, expressionResolver2) : divGifImage.f55508b == null) || !this.f55509c.a(divGifImage.f55509c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f55510d;
        if (list != null) {
            List<DivAction> list2 = divGifImage.f55510d;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.f55510d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divGifImage.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divGifImage.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divGifImage.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divGifImage.w();
            if (listW2 != null) {
                if (listW.size() == listW2.size()) {
                    int i12 = 0;
                    for (Object obj2 : listW) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivAnimator) obj2).a(listW2.get(i12), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivAspect divAspect = this.f55515i;
        if (!(divAspect != null ? divAspect.a(divGifImage.f55515i, expressionResolver, expressionResolver2) : divGifImage.f55515i == null)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divGifImage.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i14 = 0;
                    for (Object obj3 : background) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivBackground) obj3).a(background2.get(i14), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divGifImage.x(), expressionResolver, expressionResolver2) : divGifImage.x() == null) || this.f55518l.evaluate(expressionResolver).booleanValue() != divGifImage.f55518l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divGifImage.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f55520n.evaluate(expressionResolver) != divGifImage.f55520n.evaluate(expressionResolver2) || this.f55521o.evaluate(expressionResolver) != divGifImage.f55521o.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divGifImage.k();
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
        if (divGifImage.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f55523q;
        if (list3 != null) {
            List<DivAction> list4 = divGifImage.f55523q;
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
        if (divGifImage.f55523q != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divGifImage.getExtensions();
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
        if (divGifImage.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divGifImage.n(), expressionResolver, expressionResolver2) : divGifImage.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divGifImage.u();
            if (listU2 != null) {
                if (listU.size() == listU2.size()) {
                    int i22 = 0;
                    for (Object obj7 : listU) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivFunction) obj7).a(listU2.get(i22), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !tn.p.f(this.f55527u.evaluate(expressionResolver), divGifImage.f55527u.evaluate(expressionResolver2)) || !getHeight().a(divGifImage.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f55529w;
        if (list5 != null) {
            List<DivAction> list6 = divGifImage.f55529w;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i24 = 0;
                    for (Object obj8 : list5) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj8).a(list6.get(i24), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.f55529w != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f55530x;
        if (list7 != null) {
            List<DivAction> list8 = divGifImage.f55530x;
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
        if (divGifImage.f55530x != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(getId(), divGifImage.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divGifImage.r(), expressionResolver, expressionResolver2) : divGifImage.r() == null)) {
            return false;
        }
        List<DivAction> list9 = this.A;
        if (list9 != null) {
            List<DivAction> list10 = divGifImage.A;
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
        if (divGifImage.A != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divGifImage.d(), expressionResolver, expressionResolver2) : divGifImage.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divGifImage.p(), expressionResolver, expressionResolver2) : divGifImage.p() == null) || this.D.evaluate(expressionResolver).intValue() != divGifImage.D.evaluate(expressionResolver2).intValue() || this.E.evaluate(expressionResolver).booleanValue() != divGifImage.E.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list11 = this.F;
        if (list11 != null) {
            List<DivAction> list12 = divGifImage.F;
            if (list12 != null) {
                if (list11.size() == list12.size()) {
                    int i30 = 0;
                    for (Object obj11 : list11) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj11).a(list12.get(i30), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.F != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        List<DivAction> list13 = this.G;
        if (list13 != null) {
            List<DivAction> list14 = divGifImage.G;
            if (list14 != null) {
                if (list13.size() == list14.size()) {
                    int i32 = 0;
                    for (Object obj12 : list13) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj12).a(list14.get(i32), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.G != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        Expression<String> expression = this.H;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divGifImage.H;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divGifImage.f();
        if (!tn.p.f(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divGifImage.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.K.evaluate(expressionResolver) != divGifImage.K.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divGifImage.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i34 = 0;
                    for (Object obj13 : listQ) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj13).a(listQ2.get(i34), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.q() != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divGifImage.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i36 = 0;
                    for (Object obj14 : listH) {
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj14).a(listH2.get(i36), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.h() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divGifImage.getTransform(), expressionResolver, expressionResolver2) : divGifImage.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divGifImage.j(), expressionResolver, expressionResolver2) : divGifImage.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divGifImage.v(), expressionResolver, expressionResolver2) : divGifImage.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divGifImage.i(), expressionResolver, expressionResolver2) : divGifImage.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divGifImage.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i38 = 0;
                    for (Object obj15 : listL) {
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj15) == listL2.get(i38)) {
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
        if (divGifImage.l() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divGifImage.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i40 = 0;
                    for (Object obj16 : listS) {
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj16).a(listS2.get(i40), expressionResolver, expressionResolver2)) {
                            i40 = i41;
                        }
                    }
                    z25 = true;
                }
                z25 = false;
                break;
            }
            return false;
        }
        if (divGifImage.s() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divGifImage.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i42 = 0;
                    for (Object obj17 : listC) {
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj17).a(listC2.get(i42), expressionResolver, expressionResolver2)) {
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
        if (divGifImage.c() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26 || getVisibility().evaluate(expressionResolver) != divGifImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divGifImage.t(), expressionResolver, expressionResolver2) : divGifImage.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divGifImage.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i44 = 0;
                    for (Object obj18 : listA) {
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj18).g(listA2.get(i44), expressionResolver, expressionResolver2)) {
                            i44 = i45;
                        }
                    }
                    z27 = true;
                }
                z27 = false;
                break;
            }
            return false;
        }
        if (divGifImage.a() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        return z27 && getWidth().a(divGifImage.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.W;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55519m;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.J;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55511e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55513g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55516j;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55524r;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55528v;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f55531y;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.N;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.U;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.X;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.M;
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
        int iHash15;
        int iHash16;
        Integer num = this.Y;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivGifImage.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f55508b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f55509c.hash();
        List<DivAction> list = this.f55510d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash19 + iHash;
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List<DivAnimator> listW = w();
        if (listW != null) {
            Iterator<T> it2 = listW.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAnimator) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        DivAspect divAspect = this.f55515i;
        int iHash20 = i11 + (divAspect != null ? divAspect.hash() : 0);
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivBackground) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash20 + iHash3;
        DivBorder divBorderX = x();
        int iHash21 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f55518l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f55520n.hashCode() + this.f55521o.hashCode();
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
        List<DivAction> list2 = this.f55523q;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
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
        DivFocus divFocusN = n();
        int iHash22 = i15 + (divFocusN != null ? divFocusN.hash() : 0);
        List<DivFunction> listU = u();
        if (listU != null) {
            Iterator<T> it7 = listU.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHashCode5 = iHash22 + iHash7 + this.f55527u.hashCode() + getHeight().hash();
        List<DivAction> list3 = this.f55529w;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode5 + iHash8;
        List<DivAction> list4 = this.f55530x;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode6 = i17 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash23 = iHashCode6 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        List<DivAction> list5 = this.A;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash23 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash24 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash25 = iHash24 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0) + this.D.hashCode() + this.E.hashCode();
        List<DivAction> list6 = this.F;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash25 + iHash11;
        List<DivAction> list7 = this.G;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        Expression<String> expression = this.H;
        int iHashCode7 = i20 + (expression != null ? expression.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode8 = iHashCode7 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.K.hashCode();
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it13 = listQ.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode9 + iHash13;
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it14 = listH.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        DivTransform transform = getTransform();
        int iHash26 = i22 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash27 = iHash26 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash28 = iHash27 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash29 = iHash28 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode10 = iHash29 + (listL != null ? listL.hashCode() : 0);
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it15 = listS.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode10 + iHash15;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it16 = listC.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivVariable) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int iHashCode11 = i23 + iHash16 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash30 = iHashCode11 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.Y = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f55522p;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.R;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55512f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55525s;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55507a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f55532z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.V;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f55526t;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55514h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55517k;
    }

    @NotNull
    public final DivGifImage y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivAlignmentHorizontal> expression6, @NotNull Expression<DivAlignmentVertical> expression7, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull Expression<Uri> expression8, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Integer> expression9, @NotNull Expression<Boolean> expression10, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression11, @Nullable Expression<String> expression12, @Nullable Expression<Long> expression13, @NotNull Expression<DivImageScale> expression14, @Nullable List<DivAction> list13, @Nullable List<DivTooltip> list14, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list15, @Nullable List<DivTrigger> list16, @Nullable List<? extends DivVariable> list17, @NotNull Expression<DivVisibility> expression15, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list18, @NotNull DivSize divSize2) {
        return new DivGifImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, divFocus, list7, expression8, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, expression9, expression10, list11, list12, expression11, expression12, expression13, expression14, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression15, divVisibilityAction, list18, divSize2);
    }
}
