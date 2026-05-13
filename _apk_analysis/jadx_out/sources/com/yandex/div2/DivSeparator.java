package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSeparator implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a S = new a(null);

    @NotNull
    public static final DivAnimation T;

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<Boolean> V;

    @NotNull
    public static final DivSize.d W;

    @NotNull
    public static final Expression<DivVisibility> X;

    @NotNull
    public static final DivSize.c Y;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSeparator> Z;

    @Nullable
    public final List<DivAction> A;

    @Nullable
    public final List<DivAction> B;

    @Nullable
    public final Expression<String> C;

    @Nullable
    public final Expression<Long> D;

    @Nullable
    public final List<DivAction> E;

    @Nullable
    public final List<DivTooltip> F;

    @Nullable
    public final DivTransform G;

    @Nullable
    public final DivChangeTransition H;

    @Nullable
    public final DivAppearanceTransition I;

    @Nullable
    public final DivAppearanceTransition J;

    @Nullable
    public final List<DivTransitionTrigger> K;

    @Nullable
    public final List<DivTrigger> L;

    @Nullable
    public final List<DivVariable> M;

    @NotNull
    public final Expression<DivVisibility> N;

    @Nullable
    public final DivVisibilityAction O;

    @Nullable
    public final List<DivVisibilityAction> P;

    @NotNull
    public final DivSize Q;

    @Nullable
    public Integer R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f56817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f56818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f56819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f56821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f56822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f56824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f56825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final DivBorder f56826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final DelimiterStyle f56829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f56830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f56832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DivFocus f56833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f56834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DivSize f56835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f56838v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f56839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f56841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f56842z;

    /* JADX INFO: compiled from: DivSeparator.kt */
    public static final class DelimiterStyle implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f56843d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f56844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Expression<Orientation> f56845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, DelimiterStyle> f56846g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f56847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Orientation> f56848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f56849c;

        /* JADX INFO: compiled from: DivSeparator.kt */
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            @NotNull
            private final String value;

            @NotNull
            public static final a Converter = new a(null);

            @NotNull
            public static final sn.l<Orientation, String> TO_STRING = new sn.l<Orientation, String>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$TO_STRING$1
                @Override // sn.l
                @NotNull
                public final String invoke(@NotNull DivSeparator.DelimiterStyle.Orientation orientation) {
                    return DivSeparator.DelimiterStyle.Orientation.Converter.b(orientation);
                }
            };

            @NotNull
            public static final sn.l<String, Orientation> FROM_STRING = new sn.l<String, Orientation>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$FROM_STRING$1
                @Override // sn.l
                @Nullable
                public final DivSeparator.DelimiterStyle.Orientation invoke(@NotNull String str) {
                    return DivSeparator.DelimiterStyle.Orientation.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivSeparator.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @Nullable
                public final Orientation a(@NotNull String str) {
                    Orientation orientation = Orientation.VERTICAL;
                    if (tn.p.f(str, orientation.value)) {
                        return orientation;
                    }
                    Orientation orientation2 = Orientation.HORIZONTAL;
                    if (tn.p.f(str, orientation2.value)) {
                        return orientation2;
                    }
                    return null;
                }

                @NotNull
                public final String b(@NotNull Orientation orientation) {
                    return orientation.value;
                }
            }

            Orientation(String str) {
                this.value = str;
            }
        }

        /* JADX INFO: compiled from: DivSeparator.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final DelimiterStyle a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().J6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f56844e = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f56845f = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
            f56846g = new sn.p<ParsingEnvironment, JSONObject, DelimiterStyle>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSeparator.DelimiterStyle mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivSeparator.DelimiterStyle.f56843d.a(parsingEnvironment, jSONObject);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DelimiterStyle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public DelimiterStyle(@NotNull Expression<Integer> expression, @NotNull Expression<Orientation> expression2) {
            this.f56847a = expression;
            this.f56848b = expression2;
        }

        public /* synthetic */ DelimiterStyle(Expression expression, Expression expression2, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? f56844e : expression, (i10 & 2) != 0 ? f56845f : expression2);
        }

        public final boolean a(@Nullable DelimiterStyle delimiterStyle, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            return delimiterStyle != null && this.f56847a.evaluate(expressionResolver).intValue() == delimiterStyle.f56847a.evaluate(expressionResolver2).intValue() && this.f56848b.evaluate(expressionResolver) == delimiterStyle.f56848b.evaluate(expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56849c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(DelimiterStyle.class).hashCode() + this.f56847a.hashCode() + this.f56848b.hashCode();
            this.f56849c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().J6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSeparator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSeparator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        T = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        U = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        V = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        W = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        X = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        Y = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        Z = new sn.p<ParsingEnvironment, JSONObject, DivSeparator>() { // from class: com.yandex.div2.DivSeparator$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSeparator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSeparator.S.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivSeparator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSeparator(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @Nullable DelimiterStyle delimiterStyle, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression6, @Nullable Expression<Long> expression7, @Nullable List<DivAction> list13, @Nullable List<DivTooltip> list14, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list15, @Nullable List<DivTrigger> list16, @Nullable List<? extends DivVariable> list17, @NotNull Expression<DivVisibility> expression8, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list18, @NotNull DivSize divSize2) {
        this.f56817a = divAccessibility;
        this.f56818b = divAction;
        this.f56819c = divAnimation;
        this.f56820d = list;
        this.f56821e = expression;
        this.f56822f = expression2;
        this.f56823g = expression3;
        this.f56824h = list2;
        this.f56825i = list3;
        this.f56826j = divBorder;
        this.f56827k = expression4;
        this.f56828l = expression5;
        this.f56829m = delimiterStyle;
        this.f56830n = list4;
        this.f56831o = list5;
        this.f56832p = list6;
        this.f56833q = divFocus;
        this.f56834r = list7;
        this.f56835s = divSize;
        this.f56836t = list8;
        this.f56837u = list9;
        this.f56838v = str;
        this.f56839w = divLayoutProvider;
        this.f56840x = list10;
        this.f56841y = divEdgeInsets;
        this.f56842z = divEdgeInsets2;
        this.A = list11;
        this.B = list12;
        this.C = expression6;
        this.D = expression7;
        this.E = list13;
        this.F = list14;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list15;
        this.L = list16;
        this.M = list17;
        this.N = expression8;
        this.O = divVisibilityAction;
        this.P = list18;
        this.Q = divSize2;
    }

    public /* synthetic */ DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : divAction, (i10 & 4) != 0 ? T : divAnimation, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : expression, (i10 & 32) != 0 ? null : expression2, (i10 & 64) != 0 ? U : expression3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : divBorder, (i10 & 1024) != 0 ? V : expression4, (i10 & 2048) != 0 ? null : expression5, (i10 & 4096) != 0 ? null : delimiterStyle, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : list5, (i10 & 32768) != 0 ? null : list6, (i10 & 65536) != 0 ? null : divFocus, (i10 & 131072) != 0 ? null : list7, (i10 & 262144) != 0 ? W : divSize, (i10 & 524288) != 0 ? null : list8, (i10 & 1048576) != 0 ? null : list9, (i10 & 2097152) != 0 ? null : str, (i10 & 4194304) != 0 ? null : divLayoutProvider, (i10 & 8388608) != 0 ? null : list10, (i10 & 16777216) != 0 ? null : divEdgeInsets, (i10 & 33554432) != 0 ? null : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : list11, (i10 & 134217728) != 0 ? null : list12, (i10 & 268435456) != 0 ? null : expression6, (i10 & 536870912) != 0 ? null : expression7, (i10 & 1073741824) != 0 ? null : list13, (i10 & Integer.MIN_VALUE) != 0 ? null : list14, (i11 & 1) != 0 ? null : divTransform, (i11 & 2) != 0 ? null : divChangeTransition, (i11 & 4) != 0 ? null : divAppearanceTransition, (i11 & 8) != 0 ? null : divAppearanceTransition2, (i11 & 16) != 0 ? null : list15, (i11 & 32) != 0 ? null : list16, (i11 & 64) != 0 ? null : list17, (i11 & 128) != 0 ? X : expression8, (i11 & 256) != 0 ? null : divVisibilityAction, (i11 & 512) != 0 ? null : list18, (i11 & 1024) != 0 ? Y : divSize2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSeparator z(DivSeparator divSeparator, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divSeparator.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divSeparator.f56818b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divSeparator.f56819c : divAnimation;
        List list19 = (i10 & 8) != 0 ? divSeparator.f56820d : list;
        Expression expressionG = (i10 & 16) != 0 ? divSeparator.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divSeparator.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divSeparator.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divSeparator.w() : list2;
        List background = (i10 & 256) != 0 ? divSeparator.getBackground() : list3;
        DivBorder divBorderX = (i10 & 512) != 0 ? divSeparator.x() : divBorder;
        Expression expression9 = (i10 & 1024) != 0 ? divSeparator.f56827k : expression4;
        Expression expressionB = (i10 & 2048) != 0 ? divSeparator.b() : expression5;
        DelimiterStyle delimiterStyle2 = (i10 & 4096) != 0 ? divSeparator.f56829m : delimiterStyle;
        List listK = (i10 & 8192) != 0 ? divSeparator.k() : list4;
        List list20 = (i10 & 16384) != 0 ? divSeparator.f56831o : list5;
        List extensions = (i10 & 32768) != 0 ? divSeparator.getExtensions() : list6;
        DivFocus divFocusN = (i10 & 65536) != 0 ? divSeparator.n() : divFocus;
        List listU = (i10 & 131072) != 0 ? divSeparator.u() : list7;
        DivSize height = (i10 & 262144) != 0 ? divSeparator.getHeight() : divSize;
        List list21 = list20;
        List list22 = (i10 & 524288) != 0 ? divSeparator.f56836t : list8;
        List list23 = (i10 & 1048576) != 0 ? divSeparator.f56837u : list9;
        return divSeparator.y(divAccessibilityO, divAction2, divAnimation2, list19, expressionG, expressionM, alpha, listW, background, divBorderX, expression9, expressionB, delimiterStyle2, listK, list21, extensions, divFocusN, listU, height, list22, list23, (i10 & 2097152) != 0 ? divSeparator.getId() : str, (i10 & 4194304) != 0 ? divSeparator.r() : divLayoutProvider, (i10 & 8388608) != 0 ? divSeparator.f56840x : list10, (i10 & 16777216) != 0 ? divSeparator.d() : divEdgeInsets, (i10 & 33554432) != 0 ? divSeparator.p() : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSeparator.A : list11, (i10 & 134217728) != 0 ? divSeparator.B : list12, (i10 & 268435456) != 0 ? divSeparator.f() : expression6, (i10 & 536870912) != 0 ? divSeparator.e() : expression7, (i10 & 1073741824) != 0 ? divSeparator.q() : list13, (i10 & Integer.MIN_VALUE) != 0 ? divSeparator.h() : list14, (i11 & 1) != 0 ? divSeparator.getTransform() : divTransform, (i11 & 2) != 0 ? divSeparator.j() : divChangeTransition, (i11 & 4) != 0 ? divSeparator.v() : divAppearanceTransition, (i11 & 8) != 0 ? divSeparator.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divSeparator.l() : list15, (i11 & 32) != 0 ? divSeparator.s() : list16, (i11 & 64) != 0 ? divSeparator.c() : list17, (i11 & 128) != 0 ? divSeparator.getVisibility() : expression8, (i11 & 256) != 0 ? divSeparator.t() : divVisibilityAction, (i11 & 512) != 0 ? divSeparator.a() : list18, (i11 & 1024) != 0 ? divSeparator.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivSeparator divSeparator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divSeparator == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divSeparator.o(), expressionResolver, expressionResolver2) : divSeparator.o() == null)) {
            return false;
        }
        DivAction divAction = this.f56818b;
        if (!(divAction != null ? divAction.a(divSeparator.f56818b, expressionResolver, expressionResolver2) : divSeparator.f56818b == null) || !this.f56819c.a(divSeparator.f56819c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f56820d;
        if (list != null) {
            List<DivAction> list2 = divSeparator.f56820d;
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
        if (divSeparator.f56820d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSeparator.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divSeparator.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divSeparator.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divSeparator.w();
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
        if (divSeparator.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSeparator.getBackground();
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
        if (divSeparator.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divSeparator.x(), expressionResolver, expressionResolver2) : divSeparator.x() == null) || this.f56827k.evaluate(expressionResolver).booleanValue() != divSeparator.f56827k.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSeparator.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DelimiterStyle delimiterStyle = this.f56829m;
        if (!(delimiterStyle != null ? delimiterStyle.a(divSeparator.f56829m, expressionResolver, expressionResolver2) : divSeparator.f56829m == null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSeparator.k();
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
        if (divSeparator.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f56831o;
        if (list3 != null) {
            List<DivAction> list4 = divSeparator.f56831o;
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
        if (divSeparator.f56831o != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSeparator.getExtensions();
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
        if (divSeparator.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divSeparator.n(), expressionResolver, expressionResolver2) : divSeparator.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divSeparator.u();
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
        if (divSeparator.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !getHeight().a(divSeparator.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f56836t;
        if (list5 != null) {
            List<DivAction> list6 = divSeparator.f56836t;
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
        if (divSeparator.f56836t != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f56837u;
        if (list7 != null) {
            List<DivAction> list8 = divSeparator.f56837u;
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
        if (divSeparator.f56837u != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(getId(), divSeparator.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divSeparator.r(), expressionResolver, expressionResolver2) : divSeparator.r() == null)) {
            return false;
        }
        List<DivAction> list9 = this.f56840x;
        if (list9 != null) {
            List<DivAction> list10 = divSeparator.f56840x;
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
        if (divSeparator.f56840x != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divSeparator.d(), expressionResolver, expressionResolver2) : divSeparator.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divSeparator.p(), expressionResolver, expressionResolver2) : divSeparator.p() == null)) {
            return false;
        }
        List<DivAction> list11 = this.A;
        if (list11 != null) {
            List<DivAction> list12 = divSeparator.A;
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
        if (divSeparator.A != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        List<DivAction> list13 = this.B;
        if (list13 != null) {
            List<DivAction> list14 = divSeparator.B;
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
        if (divSeparator.B != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSeparator.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSeparator.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divSeparator.q();
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
        if (divSeparator.q() != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSeparator.h();
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
        if (divSeparator.h() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divSeparator.getTransform(), expressionResolver, expressionResolver2) : divSeparator.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divSeparator.j(), expressionResolver, expressionResolver2) : divSeparator.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divSeparator.v(), expressionResolver, expressionResolver2) : divSeparator.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divSeparator.i(), expressionResolver, expressionResolver2) : divSeparator.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divSeparator.l();
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
        if (divSeparator.l() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divSeparator.s();
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
        if (divSeparator.s() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSeparator.c();
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
        if (divSeparator.c() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26 || getVisibility().evaluate(expressionResolver) != divSeparator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divSeparator.t(), expressionResolver, expressionResolver2) : divSeparator.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSeparator.a();
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
        if (divSeparator.a() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        return z27 && getWidth().a(divSeparator.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f56828l;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f56841y;
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
        return this.f56821e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f56823g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f56825i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f56832p;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f56835s;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f56838v;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.G;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.N;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.F;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSeparator.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f56818b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f56819c.hash();
        List<DivAction> list = this.f56820d;
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
        int iHash20 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f56827k.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0);
        DelimiterStyle delimiterStyle = this.f56829m;
        int iHash21 = iHashCode4 + (delimiterStyle != null ? delimiterStyle.hash() : 0);
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
        int i13 = iHash21 + iHash4;
        List<DivAction> list2 = this.f56831o;
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
        int iHash23 = iHash22 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.f56836t;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash23 + iHash8;
        List<DivAction> list4 = this.f56837u;
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
        int iHashCode5 = i17 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash24 = iHashCode5 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        List<DivAction> list5 = this.f56840x;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash24 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash25 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash26 = iHash25 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<DivAction> list6 = this.A;
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
        List<DivAction> list7 = this.B;
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
        int iHashCode6 = i20 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int i21 = iHashCode7 + iHash13;
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
        int iHash27 = i22 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash28 = iHash27 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash29 = iHash28 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash30 = iHash29 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode8 = iHash30 + (listL != null ? listL.hashCode() : 0);
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
        int i23 = iHashCode8 + iHash15;
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
        int iHashCode9 = i23 + iHash16 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash31 = iHashCode9 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash32 = iHash31 + iHash17 + getWidth().hash();
        this.R = Integer.valueOf(iHash32);
        return iHash32;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.J;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.H;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f56830n;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f56822f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f56833q;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f56817a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f56842z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f56839w;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f56834r;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f56824h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f56826j;
    }

    @NotNull
    public final DivSeparator y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @Nullable Expression<Long> expression5, @Nullable DelimiterStyle delimiterStyle, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivLayoutProvider divLayoutProvider, @Nullable List<DivAction> list10, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list11, @Nullable List<DivAction> list12, @Nullable Expression<String> expression6, @Nullable Expression<Long> expression7, @Nullable List<DivAction> list13, @Nullable List<DivTooltip> list14, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list15, @Nullable List<DivTrigger> list16, @Nullable List<? extends DivVariable> list17, @NotNull Expression<DivVisibility> expression8, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list18, @NotNull DivSize divSize2) {
        return new DivSeparator(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, delimiterStyle, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, list11, list12, expression6, expression7, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression8, divVisibilityAction, list18, divSize2);
    }
}
