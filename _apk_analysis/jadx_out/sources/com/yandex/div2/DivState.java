package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivState;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivState.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivState implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a Y = new a(null);

    @NotNull
    public static final DivAnimation Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57156a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57157b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57158c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f57159d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivTransitionSelector> f57160e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57161f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57162g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivState> f57163h0;

    @Nullable
    public final DivEdgeInsets A;

    @Nullable
    public final DivEdgeInsets B;

    @Nullable
    public final List<DivAction> C;

    @Nullable
    public final List<DivAction> D;

    @Nullable
    public final Expression<String> E;

    @Nullable
    public final Expression<Long> F;

    @Nullable
    public final List<DivAction> G;

    @Nullable
    public final String H;

    @NotNull
    public final List<State> I;

    @Nullable
    public final List<DivTooltip> J;

    @Nullable
    public final DivTransform K;

    @NotNull
    public final Expression<DivTransitionSelector> L;

    @Nullable
    public final DivChangeTransition M;

    @Nullable
    public final DivAppearanceTransition N;

    @Nullable
    public final DivAppearanceTransition O;

    @Nullable
    public final List<DivTransitionTrigger> P;

    @Nullable
    public final List<DivTrigger> Q;

    @Nullable
    public final List<DivVariable> R;

    @NotNull
    public final Expression<DivVisibility> S;

    @Nullable
    public final DivVisibilityAction T;

    @Nullable
    public final List<DivVisibilityAction> U;

    @NotNull
    public final DivSize V;

    @Nullable
    public Integer W;

    @Nullable
    public Integer X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f57164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f57165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f57166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f57168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f57169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f57171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f57172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final DivBorder f57173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f57178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f57179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f57181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final DivFocus f57182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f57183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final DivSize f57184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final String f57187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f57188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57189z;

    /* JADX INFO: compiled from: DivState.kt */
    public static final class State implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f57190g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, State> f57191h = new sn.p<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivState$State$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivState.State mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivState.State.f57190g.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final DivAnimation f57192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final DivAnimation f57193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Div f57194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f57195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final List<DivAction> f57196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Integer f57197f;

        /* JADX INFO: compiled from: DivState.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final State a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().w7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public State(@Nullable DivAnimation divAnimation, @Nullable DivAnimation divAnimation2, @Nullable Div div, @NotNull String str, @Nullable List<DivAction> list) {
            this.f57192a = divAnimation;
            this.f57193b = divAnimation2;
            this.f57194c = div;
            this.f57195d = str;
            this.f57196e = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State b(State state, DivAnimation divAnimation, DivAnimation divAnimation2, Div div, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                divAnimation = state.f57192a;
            }
            if ((i10 & 2) != 0) {
                divAnimation2 = state.f57193b;
            }
            DivAnimation divAnimation3 = divAnimation2;
            if ((i10 & 4) != 0) {
                div = state.f57194c;
            }
            Div div2 = div;
            if ((i10 & 8) != 0) {
                str = state.f57195d;
            }
            String str2 = str;
            if ((i10 & 16) != 0) {
                list = state.f57196e;
            }
            return state.a(divAnimation, divAnimation3, div2, str2, list);
        }

        @NotNull
        public final State a(@Nullable DivAnimation divAnimation, @Nullable DivAnimation divAnimation2, @Nullable Div div, @NotNull String str, @Nullable List<DivAction> list) {
            return new State(divAnimation, divAnimation2, div, str, list);
        }

        public final boolean c(@Nullable State state, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            boolean z10;
            if (state == null) {
                return false;
            }
            DivAnimation divAnimation = this.f57192a;
            if (!(divAnimation != null ? divAnimation.a(state.f57192a, expressionResolver, expressionResolver2) : state.f57192a == null)) {
                return false;
            }
            DivAnimation divAnimation2 = this.f57193b;
            if (!(divAnimation2 != null ? divAnimation2.a(state.f57193b, expressionResolver, expressionResolver2) : state.f57193b == null)) {
                return false;
            }
            Div div = this.f57194c;
            if (!(div != null ? div.a(state.f57194c, expressionResolver, expressionResolver2) : state.f57194c == null) || !tn.p.f(this.f57195d, state.f57195d)) {
                return false;
            }
            List<DivAction> list = this.f57196e;
            List<DivAction> list2 = state.f57196e;
            if (list != null) {
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
            if (list2 != null) {
                z10 = false;
                break;
            }
            z10 = true;
            return z10;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57197f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(State.class).hashCode();
            DivAnimation divAnimation = this.f57192a;
            int iHash = 0;
            int iHash2 = iHashCode + (divAnimation != null ? divAnimation.hash() : 0);
            DivAnimation divAnimation2 = this.f57193b;
            int iHash3 = iHash2 + (divAnimation2 != null ? divAnimation2.hash() : 0);
            Div div = this.f57194c;
            int iHash4 = iHash3 + (div != null ? div.hash() : 0) + this.f57195d.hashCode();
            List<DivAction> list = this.f57196e;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            }
            int i10 = iHash4 + iHash;
            this.f57197f = Integer.valueOf(i10);
            return i10;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().w7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivState.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivState a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().t7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        Z = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f57156a0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f57157b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57158c0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57159d0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f57160e0 = Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        f57161f0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57162g0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f57163h0 = new sn.p<ParsingEnvironment, JSONObject, DivState>() { // from class: com.yandex.div2.DivState$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivState mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivState.Y.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivState(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @Nullable Expression<String> expression7, @Nullable List<DivDisappearAction> list4, @Nullable String str, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable List<DivAction> list13, @Nullable String str3, @NotNull List<State> list14, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @NotNull Expression<DivTransitionSelector> expression10, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression11, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        this.f57164a = divAccessibility;
        this.f57165b = divAction;
        this.f57166c = divAnimation;
        this.f57167d = list;
        this.f57168e = expression;
        this.f57169f = expression2;
        this.f57170g = expression3;
        this.f57171h = list2;
        this.f57172i = list3;
        this.f57173j = divBorder;
        this.f57174k = expression4;
        this.f57175l = expression5;
        this.f57176m = expression6;
        this.f57177n = expression7;
        this.f57178o = list4;
        this.f57179p = str;
        this.f57180q = list5;
        this.f57181r = list6;
        this.f57182s = divFocus;
        this.f57183t = list7;
        this.f57184u = divSize;
        this.f57185v = list8;
        this.f57186w = list9;
        this.f57187x = str2;
        this.f57188y = divLayoutProvider;
        this.f57189z = list10;
        this.A = divEdgeInsets;
        this.B = divEdgeInsets2;
        this.C = list11;
        this.D = list12;
        this.E = expression8;
        this.F = expression9;
        this.G = list13;
        this.H = str3;
        this.I = list14;
        this.J = list15;
        this.K = divTransform;
        this.L = expression10;
        this.M = divChangeTransition;
        this.N = divAppearanceTransition;
        this.O = divAppearanceTransition2;
        this.P = list16;
        this.Q = list17;
        this.R = list18;
        this.S = expression11;
        this.T = divVisibilityAction;
        this.U = list19;
        this.V = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivState z(DivState divState, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, String str, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str2, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression8, Expression expression9, List list13, String str3, List list14, List list15, DivTransform divTransform, Expression expression10, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression11, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divState.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divState.f57165b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divState.f57166c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divState.f57167d : list;
        Expression expressionG = (i10 & 16) != 0 ? divState.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divState.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divState.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divState.w() : list2;
        List background = (i10 & 256) != 0 ? divState.getBackground() : list3;
        DivBorder divBorderX = (i10 & 512) != 0 ? divState.x() : divBorder;
        Expression expression12 = (i10 & 1024) != 0 ? divState.f57174k : expression4;
        Expression expression13 = (i10 & 2048) != 0 ? divState.f57175l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? divState.b() : expression6;
        Expression expression14 = (i10 & 8192) != 0 ? divState.f57177n : expression7;
        List listK = (i10 & 16384) != 0 ? divState.k() : list4;
        String str4 = (i10 & 32768) != 0 ? divState.f57179p : str;
        List list21 = (i10 & 65536) != 0 ? divState.f57180q : list5;
        List extensions = (i10 & 131072) != 0 ? divState.getExtensions() : list6;
        DivFocus divFocusN = (i10 & 262144) != 0 ? divState.n() : divFocus;
        List listU = (i10 & 524288) != 0 ? divState.u() : list7;
        DivSize height = (i10 & 1048576) != 0 ? divState.getHeight() : divSize;
        List list22 = list21;
        List list23 = (i10 & 2097152) != 0 ? divState.f57185v : list8;
        List list24 = (i10 & 4194304) != 0 ? divState.f57186w : list9;
        String id2 = (i10 & 8388608) != 0 ? divState.getId() : str2;
        DivLayoutProvider divLayoutProviderR = (i10 & 16777216) != 0 ? divState.r() : divLayoutProvider;
        List list25 = list24;
        List list26 = (i10 & 33554432) != 0 ? divState.f57189z : list10;
        DivEdgeInsets divEdgeInsetsD = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divState.d() : divEdgeInsets;
        DivEdgeInsets divEdgeInsetsP = (i10 & 134217728) != 0 ? divState.p() : divEdgeInsets2;
        List list27 = list26;
        List list28 = (i10 & 268435456) != 0 ? divState.C : list11;
        List list29 = (i10 & 536870912) != 0 ? divState.D : list12;
        Expression expressionF = (i10 & 1073741824) != 0 ? divState.f() : expression8;
        Expression expressionE = (i10 & Integer.MIN_VALUE) != 0 ? divState.e() : expression9;
        return divState.y(divAccessibilityO, divAction2, divAnimation2, list20, expressionG, expressionM, alpha, listW, background, divBorderX, expression12, expression13, expressionB, expression14, listK, str4, list22, extensions, divFocusN, listU, height, list23, list25, id2, divLayoutProviderR, list27, divEdgeInsetsD, divEdgeInsetsP, list28, list29, expressionF, expressionE, (i11 & 1) != 0 ? divState.q() : list13, (i11 & 2) != 0 ? divState.H : str3, (i11 & 4) != 0 ? divState.I : list14, (i11 & 8) != 0 ? divState.h() : list15, (i11 & 16) != 0 ? divState.getTransform() : divTransform, (i11 & 32) != 0 ? divState.L : expression10, (i11 & 64) != 0 ? divState.j() : divChangeTransition, (i11 & 128) != 0 ? divState.v() : divAppearanceTransition, (i11 & 256) != 0 ? divState.i() : divAppearanceTransition2, (i11 & 512) != 0 ? divState.l() : list16, (i11 & 1024) != 0 ? divState.s() : list17, (i11 & 2048) != 0 ? divState.c() : list18, (i11 & 4096) != 0 ? divState.getVisibility() : expression11, (i11 & 8192) != 0 ? divState.t() : divVisibilityAction, (i11 & 16384) != 0 ? divState.a() : list19, (i11 & 32768) != 0 ? divState.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivState divState, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divState == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divState.o(), expressionResolver, expressionResolver2) : divState.o() == null)) {
            return false;
        }
        DivAction divAction = this.f57165b;
        if (!(divAction != null ? divAction.a(divState.f57165b, expressionResolver, expressionResolver2) : divState.f57165b == null) || !this.f57166c.a(divState.f57166c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f57167d;
        if (list != null) {
            List<DivAction> list2 = divState.f57167d;
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
        if (divState.f57167d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divState.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divState.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divState.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divState.w();
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
        if (divState.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divState.getBackground();
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
        if (divState.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divState.x(), expressionResolver, expressionResolver2) : divState.x() == null) || this.f57174k.evaluate(expressionResolver).booleanValue() != divState.f57174k.evaluate(expressionResolver2).booleanValue() || this.f57175l.evaluate(expressionResolver).booleanValue() != divState.f57175l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divState.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression = this.f57177n;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divState.f57177n;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divState.k();
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
        if (divState.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13 || !tn.p.f(this.f57179p, divState.f57179p)) {
            return false;
        }
        List<DivAction> list3 = this.f57180q;
        if (list3 != null) {
            List<DivAction> list4 = divState.f57180q;
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
        if (divState.f57180q != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divState.getExtensions();
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
        if (divState.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divState.n(), expressionResolver, expressionResolver2) : divState.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divState.u();
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
        if (divState.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !getHeight().a(divState.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f57185v;
        if (list5 != null) {
            List<DivAction> list6 = divState.f57185v;
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
        if (divState.f57185v != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f57186w;
        if (list7 != null) {
            List<DivAction> list8 = divState.f57186w;
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
        if (divState.f57186w != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(getId(), divState.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divState.r(), expressionResolver, expressionResolver2) : divState.r() == null)) {
            return false;
        }
        List<DivAction> list9 = this.f57189z;
        if (list9 != null) {
            List<DivAction> list10 = divState.f57189z;
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
        if (divState.f57189z != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divState.d(), expressionResolver, expressionResolver2) : divState.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divState.p(), expressionResolver, expressionResolver2) : divState.p() == null)) {
            return false;
        }
        List<DivAction> list11 = this.C;
        if (list11 != null) {
            List<DivAction> list12 = divState.C;
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
        if (divState.C != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        List<DivAction> list13 = this.D;
        if (list13 != null) {
            List<DivAction> list14 = divState.D;
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
        if (divState.D != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divState.f();
        if (!tn.p.f(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divState.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divState.q();
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
        if (divState.q() != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22 || !tn.p.f(this.H, divState.H)) {
            return false;
        }
        List<State> list15 = this.I;
        List<State> list16 = divState.I;
        if (list15.size() != list16.size()) {
            z23 = false;
            break;
        }
        int i36 = 0;
        for (Object obj14 : list15) {
            int i37 = i36 + 1;
            if (i36 < 0) {
                cn.w.w();
            }
            if (!((State) obj14).c(list16.get(i36), expressionResolver, expressionResolver2)) {
                z23 = false;
                break;
            }
            i36 = i37;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divState.h();
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
        if (divState.h() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divState.getTransform(), expressionResolver, expressionResolver2) : divState.getTransform() == null) || this.L.evaluate(expressionResolver) != divState.L.evaluate(expressionResolver2)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divState.j(), expressionResolver, expressionResolver2) : divState.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divState.v(), expressionResolver, expressionResolver2) : divState.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divState.i(), expressionResolver, expressionResolver2) : divState.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divState.l();
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
        if (divState.l() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divState.s();
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
        if (divState.s() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divState.c();
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
        if (divState.c() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        if (!z27 || getVisibility().evaluate(expressionResolver) != divState.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divState.t(), expressionResolver, expressionResolver2) : divState.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divState.a();
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
        if (divState.a() != null) {
            z28 = false;
            break;
        }
        z28 = true;
        return z28 && getWidth().a(divState.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.U;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f57176m;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.R;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.A;
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
        return this.f57168e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f57170g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f57172i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f57181r;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f57184u;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f57187x;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.K;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.S;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.V;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.J;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.X;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        int iHash = 0;
        Iterator<T> it = this.I.iterator();
        while (it.hasNext()) {
            iHash += ((State) it.next()).hash();
        }
        int i10 = iPropertiesHash + iHash;
        this.X = Integer.valueOf(i10);
        return i10;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f57178o;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f57169f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f57182s;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f57164a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.B;
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
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        Integer num = this.W;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivState.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f57165b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f57166c.hash();
        List<DivAction> list = this.f57167d;
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
        int i12 = i11 + iHash3;
        DivBorder divBorderX = x();
        int iHash20 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f57174k.hashCode() + this.f57175l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0);
        Expression<String> expression = this.f57177n;
        int iHashCode5 = iHashCode4 + (expression != null ? expression.hashCode() : 0);
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
        int i13 = iHashCode5 + iHash4;
        String str = this.f57179p;
        int iHashCode6 = i13 + (str != null ? str.hashCode() : 0);
        List<DivAction> list2 = this.f57180q;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = iHashCode6 + iHash5;
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
        int iHash21 = i15 + (divFocusN != null ? divFocusN.hash() : 0);
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
        int iHash22 = iHash21 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.f57185v;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash22 + iHash8;
        List<DivAction> list4 = this.f57186w;
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
        int iHashCode7 = i17 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash23 = iHashCode7 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        List<DivAction> list5 = this.f57189z;
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
        int iHash25 = iHash24 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<DivAction> list6 = this.C;
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
        List<DivAction> list7 = this.D;
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
        Expression<String> expressionF = f();
        int iHashCode8 = i20 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0);
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
        String str2 = this.H;
        int iHashCode10 = i21 + (str2 != null ? str2.hashCode() : 0);
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
        int i22 = iHashCode10 + iHash14;
        DivTransform transform = getTransform();
        int iHash26 = i22 + (transform != null ? transform.hash() : 0) + this.L.hashCode();
        DivChangeTransition divChangeTransitionJ = j();
        int iHash27 = iHash26 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash28 = iHash27 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash29 = iHash28 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode11 = iHash29 + (listL != null ? listL.hashCode() : 0);
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
        int i23 = iHashCode11 + iHash15;
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
        int iHashCode12 = i23 + iHash16 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash30 = iHashCode12 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.W = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.G;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f57188y;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f57183t;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f57171h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f57173j;
    }

    @NotNull
    public final DivState y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @Nullable Expression<String> expression7, @Nullable List<DivDisappearAction> list4, @Nullable String str, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str2, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable List<DivAction> list13, @Nullable String str3, @NotNull List<State> list14, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @NotNull Expression<DivTransitionSelector> expression10, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression11, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        return new DivState(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, expression6, expression7, list4, str, list5, list6, divFocus, list7, divSize, list8, list9, str2, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, list11, list12, expression8, expression9, list13, str3, list14, list15, divTransform, expression10, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression11, divVisibilityAction, list19, divSize2);
    }
}
