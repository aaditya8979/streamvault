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

/* JADX INFO: compiled from: DivImage.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivImage implements JSONSerializable, Hashable, ah.e2 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final a f55679e0 = new a(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f55680f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55681g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55682h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55683i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55684j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55685k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55686l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55687m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55688n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55689o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivBlendMode> f55690p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55691q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55692r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivImage> f55693s0;

    @Nullable
    public final String A;

    @NotNull
    public final Expression<Uri> B;

    @Nullable
    public final DivLayoutProvider C;

    @Nullable
    public final List<DivAction> D;

    @Nullable
    public final DivEdgeInsets E;

    @Nullable
    public final DivEdgeInsets F;

    @NotNull
    public final Expression<Integer> G;

    @NotNull
    public final Expression<Boolean> H;

    @Nullable
    public final List<DivAction> I;

    @Nullable
    public final List<DivAction> J;

    @Nullable
    public final Expression<String> K;

    @Nullable
    public final Expression<String> L;

    @Nullable
    public final Expression<Long> M;

    @NotNull
    public final Expression<DivImageScale> N;

    @Nullable
    public final List<DivAction> O;

    @Nullable
    public final Expression<Integer> P;

    @NotNull
    public final Expression<DivBlendMode> Q;

    @Nullable
    public final List<DivTooltip> R;

    @Nullable
    public final DivTransform S;

    @Nullable
    public final DivChangeTransition T;

    @Nullable
    public final DivAppearanceTransition U;

    @Nullable
    public final DivAppearanceTransition V;

    @Nullable
    public final List<DivTransitionTrigger> W;

    @Nullable
    public final List<DivTrigger> X;

    @Nullable
    public final List<DivVariable> Y;

    @NotNull
    public final Expression<DivVisibility> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f55694a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public final DivVisibilityAction f55695a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f55696b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Nullable
    public final List<DivVisibilityAction> f55697b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f55698c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final DivSize f55699c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55700d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public Integer f55701d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivFadeTransition f55706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final DivAspect f55707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final DivBorder f55709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentHorizontal> f55712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentVertical> f55713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final List<DivFilter> f55717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final DivFocus f55718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final DivSize f55720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55723z;

    /* JADX INFO: compiled from: DivImage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivImage a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f55680f0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55681g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55682h0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55683i0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55684j0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55685k0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        Boolean bool = Boolean.FALSE;
        f55686l0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f55687m0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55688n0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f55689o0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55690p0 = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        f55691q0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55692r0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f55693s0 = new sn.p<ParsingEnvironment, JSONObject, DivImage>() { // from class: com.yandex.div2.DivImage$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImage mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivImage.f55679e0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivImage(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivFadeTransition divFadeTransition, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivAlignmentHorizontal> expression6, @NotNull Expression<DivAlignmentVertical> expression7, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable List<? extends DivFilter> list7, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list8, @NotNull DivSize divSize, @NotNull Expression<Boolean> expression8, @Nullable List<DivAction> list9, @Nullable List<DivAction> list10, @Nullable String str, @NotNull Expression<Uri> expression9, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Integer> expression10, @NotNull Expression<Boolean> expression11, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable Expression<String> expression12, @Nullable Expression<String> expression13, @Nullable Expression<Long> expression14, @NotNull Expression<DivImageScale> expression15, @Nullable List<DivAction> list14, @Nullable Expression<Integer> expression16, @NotNull Expression<DivBlendMode> expression17, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression18, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        this.f55694a = divAccessibility;
        this.f55696b = divAction;
        this.f55698c = divAnimation;
        this.f55700d = list;
        this.f55702e = expression;
        this.f55703f = expression2;
        this.f55704g = expression3;
        this.f55705h = list2;
        this.f55706i = divFadeTransition;
        this.f55707j = divAspect;
        this.f55708k = list3;
        this.f55709l = divBorder;
        this.f55710m = expression4;
        this.f55711n = expression5;
        this.f55712o = expression6;
        this.f55713p = expression7;
        this.f55714q = list4;
        this.f55715r = list5;
        this.f55716s = list6;
        this.f55717t = list7;
        this.f55718u = divFocus;
        this.f55719v = list8;
        this.f55720w = divSize;
        this.f55721x = expression8;
        this.f55722y = list9;
        this.f55723z = list10;
        this.A = str;
        this.B = expression9;
        this.C = divLayoutProvider;
        this.D = list11;
        this.E = divEdgeInsets;
        this.F = divEdgeInsets2;
        this.G = expression10;
        this.H = expression11;
        this.I = list12;
        this.J = list13;
        this.K = expression12;
        this.L = expression13;
        this.M = expression14;
        this.N = expression15;
        this.O = list14;
        this.P = expression16;
        this.Q = expression17;
        this.R = list15;
        this.S = divTransform;
        this.T = divChangeTransition;
        this.U = divAppearanceTransition;
        this.V = divAppearanceTransition2;
        this.W = list16;
        this.X = list17;
        this.Y = list18;
        this.Z = expression18;
        this.f55695a0 = divVisibilityAction;
        this.f55697b0 = list19;
        this.f55699c0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivImage z(DivImage divImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression18, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divImage.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divImage.f55696b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divImage.f55698c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divImage.f55700d : list;
        Expression expressionG = (i10 & 16) != 0 ? divImage.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divImage.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divImage.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divImage.w() : list2;
        DivFadeTransition divFadeTransition2 = (i10 & 256) != 0 ? divImage.f55706i : divFadeTransition;
        DivAspect divAspect2 = (i10 & 512) != 0 ? divImage.f55707j : divAspect;
        List background = (i10 & 1024) != 0 ? divImage.getBackground() : list3;
        DivBorder divBorderX = (i10 & 2048) != 0 ? divImage.x() : divBorder;
        Expression expression19 = (i10 & 4096) != 0 ? divImage.f55710m : expression4;
        Expression expressionB = (i10 & 8192) != 0 ? divImage.b() : expression5;
        Expression expression20 = (i10 & 16384) != 0 ? divImage.f55712o : expression6;
        Expression expression21 = (i10 & 32768) != 0 ? divImage.f55713p : expression7;
        List listK = (i10 & 65536) != 0 ? divImage.k() : list4;
        Expression expression22 = expression21;
        List list21 = (i10 & 131072) != 0 ? divImage.f55715r : list5;
        List extensions = (i10 & 262144) != 0 ? divImage.getExtensions() : list6;
        List list22 = list21;
        List list23 = (i10 & 524288) != 0 ? divImage.f55717t : list7;
        DivFocus divFocusN = (i10 & 1048576) != 0 ? divImage.n() : divFocus;
        List listU = (i10 & 2097152) != 0 ? divImage.u() : list8;
        DivSize height = (i10 & 4194304) != 0 ? divImage.getHeight() : divSize;
        List list24 = list23;
        Expression expression23 = (i10 & 8388608) != 0 ? divImage.f55721x : expression8;
        List list25 = (i10 & 16777216) != 0 ? divImage.f55722y : list9;
        List list26 = (i10 & 33554432) != 0 ? divImage.f55723z : list10;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divImage.getId() : str;
        List list27 = list26;
        Expression expression24 = (i10 & 134217728) != 0 ? divImage.B : expression9;
        return divImage.y(divAccessibilityO, divAction2, divAnimation2, list20, expressionG, expressionM, alpha, listW, divFadeTransition2, divAspect2, background, divBorderX, expression19, expressionB, expression20, expression22, listK, list22, extensions, list24, divFocusN, listU, height, expression23, list25, list27, id2, expression24, (i10 & 268435456) != 0 ? divImage.r() : divLayoutProvider, (i10 & 536870912) != 0 ? divImage.D : list11, (i10 & 1073741824) != 0 ? divImage.d() : divEdgeInsets, (i10 & Integer.MIN_VALUE) != 0 ? divImage.p() : divEdgeInsets2, (i11 & 1) != 0 ? divImage.G : expression10, (i11 & 2) != 0 ? divImage.H : expression11, (i11 & 4) != 0 ? divImage.I : list12, (i11 & 8) != 0 ? divImage.J : list13, (i11 & 16) != 0 ? divImage.K : expression12, (i11 & 32) != 0 ? divImage.f() : expression13, (i11 & 64) != 0 ? divImage.e() : expression14, (i11 & 128) != 0 ? divImage.N : expression15, (i11 & 256) != 0 ? divImage.q() : list14, (i11 & 512) != 0 ? divImage.P : expression16, (i11 & 1024) != 0 ? divImage.Q : expression17, (i11 & 2048) != 0 ? divImage.h() : list15, (i11 & 4096) != 0 ? divImage.getTransform() : divTransform, (i11 & 8192) != 0 ? divImage.j() : divChangeTransition, (i11 & 16384) != 0 ? divImage.v() : divAppearanceTransition, (i11 & 32768) != 0 ? divImage.i() : divAppearanceTransition2, (i11 & 65536) != 0 ? divImage.l() : list16, (i11 & 131072) != 0 ? divImage.s() : list17, (i11 & 262144) != 0 ? divImage.c() : list18, (i11 & 524288) != 0 ? divImage.getVisibility() : expression18, (i11 & 1048576) != 0 ? divImage.t() : divVisibilityAction, (i11 & 2097152) != 0 ? divImage.a() : list19, (i11 & 4194304) != 0 ? divImage.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivImage divImage, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        boolean z28;
        if (divImage == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divImage.o(), expressionResolver, expressionResolver2) : divImage.o() == null)) {
            return false;
        }
        DivAction divAction = this.f55696b;
        if (!(divAction != null ? divAction.a(divImage.f55696b, expressionResolver, expressionResolver2) : divImage.f55696b == null) || !this.f55698c.a(divImage.f55698c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f55700d;
        if (list != null) {
            List<DivAction> list2 = divImage.f55700d;
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
        if (divImage.f55700d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divImage.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divImage.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divImage.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divImage.w();
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
        if (divImage.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivFadeTransition divFadeTransition = this.f55706i;
        if (!(divFadeTransition != null ? divFadeTransition.a(divImage.f55706i, expressionResolver, expressionResolver2) : divImage.f55706i == null)) {
            return false;
        }
        DivAspect divAspect = this.f55707j;
        if (!(divAspect != null ? divAspect.a(divImage.f55707j, expressionResolver, expressionResolver2) : divImage.f55707j == null)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divImage.getBackground();
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
        if (divImage.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divImage.x(), expressionResolver, expressionResolver2) : divImage.x() == null) || this.f55710m.evaluate(expressionResolver).booleanValue() != divImage.f55710m.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divImage.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f55712o.evaluate(expressionResolver) != divImage.f55712o.evaluate(expressionResolver2) || this.f55713p.evaluate(expressionResolver) != divImage.f55713p.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divImage.k();
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
        if (divImage.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f55715r;
        if (list3 != null) {
            List<DivAction> list4 = divImage.f55715r;
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
        if (divImage.f55715r != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divImage.getExtensions();
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
        if (divImage.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        List<DivFilter> list5 = this.f55717t;
        if (list5 != null) {
            List<DivFilter> list6 = divImage.f55717t;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i22 = 0;
                    for (Object obj7 : list5) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivFilter) obj7).a(list6.get(i22), expressionResolver, expressionResolver2)) {
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
        if (divImage.f55717t != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divImage.n(), expressionResolver, expressionResolver2) : divImage.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divImage.u();
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
        if (divImage.u() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17 || !getHeight().a(divImage.getHeight(), expressionResolver, expressionResolver2) || this.f55721x.evaluate(expressionResolver).booleanValue() != divImage.f55721x.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list7 = this.f55722y;
        if (list7 != null) {
            List<DivAction> list8 = divImage.f55722y;
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
        if (divImage.f55722y != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivAction> list9 = this.f55723z;
        if (list9 != null) {
            List<DivAction> list10 = divImage.f55723z;
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
        if (divImage.f55723z != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19 || !tn.p.f(getId(), divImage.getId()) || !tn.p.f(this.B.evaluate(expressionResolver), divImage.B.evaluate(expressionResolver2))) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divImage.r(), expressionResolver, expressionResolver2) : divImage.r() == null)) {
            return false;
        }
        List<DivAction> list11 = this.D;
        if (list11 != null) {
            List<DivAction> list12 = divImage.D;
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
        if (divImage.D != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divImage.d(), expressionResolver, expressionResolver2) : divImage.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divImage.p(), expressionResolver, expressionResolver2) : divImage.p() == null) || this.G.evaluate(expressionResolver).intValue() != divImage.G.evaluate(expressionResolver2).intValue() || this.H.evaluate(expressionResolver).booleanValue() != divImage.H.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list13 = this.I;
        if (list13 != null) {
            List<DivAction> list14 = divImage.I;
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
        if (divImage.I != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.J;
        if (list15 != null) {
            List<DivAction> list16 = divImage.J;
            if (list16 != null) {
                if (list15.size() == list16.size()) {
                    int i34 = 0;
                    for (Object obj13 : list15) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj13).a(list16.get(i34), expressionResolver, expressionResolver2)) {
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
        if (divImage.J != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        Expression<String> expression = this.K;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divImage.K;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divImage.f();
        if (!tn.p.f(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divImage.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.N.evaluate(expressionResolver) != divImage.N.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divImage.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i36 = 0;
                    for (Object obj14 : listQ) {
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj14).a(listQ2.get(i36), expressionResolver, expressionResolver2)) {
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
        if (divImage.q() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        Expression<Integer> expression3 = this.P;
        Integer numEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Integer> expression4 = divImage.P;
        if (!tn.p.f(numEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.Q.evaluate(expressionResolver) != divImage.Q.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divImage.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i38 = 0;
                    for (Object obj15 : listH) {
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj15).a(listH2.get(i38), expressionResolver, expressionResolver2)) {
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
        if (divImage.h() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divImage.getTransform(), expressionResolver, expressionResolver2) : divImage.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divImage.j(), expressionResolver, expressionResolver2) : divImage.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divImage.v(), expressionResolver, expressionResolver2) : divImage.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divImage.i(), expressionResolver, expressionResolver2) : divImage.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divImage.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i40 = 0;
                    for (Object obj16 : listL) {
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj16) == listL2.get(i40)) {
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
        if (divImage.l() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divImage.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i42 = 0;
                    for (Object obj17 : listS) {
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj17).a(listS2.get(i42), expressionResolver, expressionResolver2)) {
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
        if (divImage.s() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divImage.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i44 = 0;
                    for (Object obj18 : listC) {
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj18).a(listC2.get(i44), expressionResolver, expressionResolver2)) {
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
        if (divImage.c() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        if (!z27 || getVisibility().evaluate(expressionResolver) != divImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divImage.t(), expressionResolver, expressionResolver2) : divImage.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divImage.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i46 = 0;
                    for (Object obj19 : listA) {
                        int i47 = i46 + 1;
                        if (i46 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj19).g(listA2.get(i46), expressionResolver, expressionResolver2)) {
                            i46 = i47;
                        }
                    }
                    z28 = true;
                }
                z28 = false;
                break;
            }
            return false;
        }
        if (divImage.a() != null) {
            z28 = false;
            break;
        }
        z28 = true;
        return z28 && getWidth().a(divImage.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.f55697b0;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55711n;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.Y;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55702e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55704g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55708k;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55716s;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55720w;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.S;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.Z;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.f55699c0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.R;
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
        int iHash17;
        Integer num = this.f55701d0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivImage.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash18 = 0;
        int iHash19 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f55696b;
        int iHash20 = iHash19 + (divAction != null ? divAction.hash() : 0) + this.f55698c.hash();
        List<DivAction> list = this.f55700d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash20 + iHash;
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
        DivFadeTransition divFadeTransition = this.f55706i;
        int iHash21 = i11 + (divFadeTransition != null ? divFadeTransition.hash() : 0);
        DivAspect divAspect = this.f55707j;
        int iHash22 = iHash21 + (divAspect != null ? divAspect.hash() : 0);
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
        int i12 = iHash22 + iHash3;
        DivBorder divBorderX = x();
        int iHash23 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f55710m.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash23 + (expressionB != null ? expressionB.hashCode() : 0) + this.f55712o.hashCode() + this.f55713p.hashCode();
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
        List<DivAction> list2 = this.f55715r;
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
        List<DivFilter> list3 = this.f55717t;
        if (list3 != null) {
            Iterator<T> it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFilter) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        DivFocus divFocusN = n();
        int iHash24 = i16 + (divFocusN != null ? divFocusN.hash() : 0);
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
        int iHash25 = iHash24 + iHash8 + getHeight().hash() + this.f55721x.hashCode();
        List<DivAction> list4 = this.f55722y;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash25 + iHash9;
        List<DivAction> list5 = this.f55723z;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = i17 + iHash10;
        String id2 = getId();
        int iHashCode5 = i18 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash26 = iHashCode5 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        List<DivAction> list6 = this.D;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash26 + iHash11;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash28 = iHash27 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0) + this.G.hashCode() + this.H.hashCode();
        List<DivAction> list7 = this.I;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List<DivAction> list8 = this.J;
        if (list8 != null) {
            Iterator<T> it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        Expression<String> expression = this.K;
        int iHashCode6 = i21 + (expression != null ? expression.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0) + this.N.hashCode();
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it14 = listQ.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivAction) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = iHashCode8 + iHash14;
        Expression<Integer> expression2 = this.P;
        int iHashCode9 = i22 + (expression2 != null ? expression2.hashCode() : 0) + this.Q.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it15 = listH.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivTooltip) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode9 + iHash15;
        DivTransform transform = getTransform();
        int iHash29 = i23 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash30 = iHash29 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash31 = iHash30 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash32 = iHash31 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode10 = iHash32 + (listL != null ? listL.hashCode() : 0);
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it16 = listS.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivTrigger) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i24 = iHashCode10 + iHash16;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it17 = listC.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((DivVariable) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int iHashCode11 = i24 + iHash17 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash33 = iHashCode11 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it18 = listA.iterator();
            while (it18.hasNext()) {
                iHash18 += ((DivVisibilityAction) it18.next()).hash();
            }
        }
        int iHash34 = iHash33 + iHash18 + getWidth().hash();
        this.f55701d0 = Integer.valueOf(iHash34);
        return iHash34;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.V;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f55714q;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.W;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55703f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55718u;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55694a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.F;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.X;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.f55695a0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f55719v;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.U;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55705h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55709l;
    }

    @NotNull
    public final DivImage y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivFadeTransition divFadeTransition, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivAlignmentHorizontal> expression6, @NotNull Expression<DivAlignmentVertical> expression7, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable List<? extends DivFilter> list7, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list8, @NotNull DivSize divSize, @NotNull Expression<Boolean> expression8, @Nullable List<DivAction> list9, @Nullable List<DivAction> list10, @Nullable String str, @NotNull Expression<Uri> expression9, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Integer> expression10, @NotNull Expression<Boolean> expression11, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable Expression<String> expression12, @Nullable Expression<String> expression13, @Nullable Expression<Long> expression14, @NotNull Expression<DivImageScale> expression15, @Nullable List<DivAction> list14, @Nullable Expression<Integer> expression16, @NotNull Expression<DivBlendMode> expression17, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression18, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        return new DivImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divFadeTransition, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, list7, divFocus, list8, divSize, expression8, list9, list10, str, expression9, divLayoutProvider, list11, divEdgeInsets, divEdgeInsets2, expression10, expression11, list12, list13, expression12, expression13, expression14, expression15, list14, expression16, expression17, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression18, divVisibilityAction, list19, divSize2);
    }
}
