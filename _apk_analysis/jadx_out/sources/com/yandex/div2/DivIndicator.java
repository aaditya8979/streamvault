package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicator.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivIndicator implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a T = new a(null);

    @NotNull
    public static final Expression<Integer> U;

    @NotNull
    public static final Expression<Double> V;

    @NotNull
    public static final Expression<Double> W;

    @NotNull
    public static final Expression<Animation> X;

    @NotNull
    public static final DivSize.d Y;

    @NotNull
    public static final Expression<Integer> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55839a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final DivShape.c f55840b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f55841c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55842d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55843e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivIndicator> f55844f0;

    @Nullable
    public final String A;

    @Nullable
    public final Expression<String> B;

    @Nullable
    public final Expression<Long> C;

    @Nullable
    public final List<DivAction> D;

    @NotNull
    public final DivShape E;

    @NotNull
    public final DivFixedSize F;

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

    @Nullable
    public final List<DivTrigger> M;

    @Nullable
    public final List<DivVariable> N;

    @NotNull
    public final Expression<DivVisibility> O;

    @Nullable
    public final DivVisibilityAction P;

    @Nullable
    public final List<DivVisibilityAction> Q;

    @NotNull
    public final DivSize R;

    @Nullable
    public Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f55845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f55846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final DivRoundedRectangleShape f55848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Expression<Animation> f55852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivBorder f55855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final DivFocus f55859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final DivSize f55861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final String f55862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f55863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivRoundedRectangleShape f55864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final DivRoundedRectangleShape f55865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DivIndicatorItemPlacement f55866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f55867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55869y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55870z;

    /* JADX INFO: compiled from: DivIndicator.kt */
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Animation, String> TO_STRING = new sn.l<Animation, String>() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivIndicator.Animation animation) {
                return DivIndicator.Animation.Converter.b(animation);
            }
        };

        @NotNull
        public static final sn.l<String, Animation> FROM_STRING = new sn.l<String, Animation>() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivIndicator.Animation invoke(@NotNull String str) {
                return DivIndicator.Animation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivIndicator.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Animation a(@NotNull String str) {
                Animation animation = Animation.SCALE;
                if (tn.p.f(str, animation.value)) {
                    return animation;
                }
                Animation animation2 = Animation.WORM;
                if (tn.p.f(str, animation2.value)) {
                    return animation2;
                }
                Animation animation3 = Animation.SLIDER;
                if (tn.p.f(str, animation3.value)) {
                    return animation3;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Animation animation) {
                return animation.value;
            }
        }

        Animation(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivIndicator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivIndicator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = Expression.Companion.constant$default(companion, Animation.SCALE, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f55839a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f55840b0 = new DivShape.c(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null));
        f55841c0 = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        f55842d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55843e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f55844f0 = new sn.p<ParsingEnvironment, JSONObject, DivIndicator>() { // from class: com.yandex.div2.DivIndicator$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivIndicator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivIndicator.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivIndicator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivIndicator(@Nullable DivAccessibility divAccessibility, @NotNull Expression<Integer> expression, @NotNull Expression<Double> expression2, @Nullable DivRoundedRectangleShape divRoundedRectangleShape, @Nullable Expression<DivAlignmentHorizontal> expression3, @Nullable Expression<DivAlignmentVertical> expression4, @NotNull Expression<Double> expression5, @NotNull Expression<Animation> expression6, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression7, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Integer> expression8, @Nullable DivRoundedRectangleShape divRoundedRectangleShape2, @Nullable DivRoundedRectangleShape divRoundedRectangleShape3, @Nullable DivIndicatorItemPlacement divIndicatorItemPlacement, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Double> expression9, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable String str2, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @Nullable List<DivAction> list6, @NotNull DivShape divShape, @NotNull DivFixedSize divFixedSize, @Nullable List<DivTooltip> list7, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list8, @Nullable List<DivTrigger> list9, @Nullable List<? extends DivVariable> list10, @NotNull Expression<DivVisibility> expression12, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list11, @NotNull DivSize divSize2) {
        this.f55845a = divAccessibility;
        this.f55846b = expression;
        this.f55847c = expression2;
        this.f55848d = divRoundedRectangleShape;
        this.f55849e = expression3;
        this.f55850f = expression4;
        this.f55851g = expression5;
        this.f55852h = expression6;
        this.f55853i = list;
        this.f55854j = list2;
        this.f55855k = divBorder;
        this.f55856l = expression7;
        this.f55857m = list3;
        this.f55858n = list4;
        this.f55859o = divFocus;
        this.f55860p = list5;
        this.f55861q = divSize;
        this.f55862r = str;
        this.f55863s = expression8;
        this.f55864t = divRoundedRectangleShape2;
        this.f55865u = divRoundedRectangleShape3;
        this.f55866v = divIndicatorItemPlacement;
        this.f55867w = divLayoutProvider;
        this.f55868x = divEdgeInsets;
        this.f55869y = expression9;
        this.f55870z = divEdgeInsets2;
        this.A = str2;
        this.B = expression10;
        this.C = expression11;
        this.D = list6;
        this.E = divShape;
        this.F = divFixedSize;
        this.G = list7;
        this.H = divTransform;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list8;
        this.M = list9;
        this.N = list10;
        this.O = expression12;
        this.P = divVisibilityAction;
        this.Q = list11;
        this.R = divSize2;
    }

    public /* synthetic */ DivIndicator(DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2, int i10, int i11, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? U : expression, (i10 & 4) != 0 ? V : expression2, (i10 & 8) != 0 ? null : divRoundedRectangleShape, (i10 & 16) != 0 ? null : expression3, (i10 & 32) != 0 ? null : expression4, (i10 & 64) != 0 ? W : expression5, (i10 & 128) != 0 ? X : expression6, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? null : divBorder, (i10 & 2048) != 0 ? null : expression7, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : divFocus, (i10 & 32768) != 0 ? null : list5, (i10 & 65536) != 0 ? Y : divSize, (i10 & 131072) != 0 ? null : str, (i10 & 262144) != 0 ? Z : expression8, (i10 & 524288) != 0 ? null : divRoundedRectangleShape2, (i10 & 1048576) != 0 ? null : divRoundedRectangleShape3, (i10 & 2097152) != 0 ? null : divIndicatorItemPlacement, (i10 & 4194304) != 0 ? null : divLayoutProvider, (i10 & 8388608) != 0 ? null : divEdgeInsets, (i10 & 16777216) != 0 ? f55839a0 : expression9, (i10 & 33554432) != 0 ? null : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str2, (i10 & 134217728) != 0 ? null : expression10, (i10 & 268435456) != 0 ? null : expression11, (i10 & 536870912) != 0 ? null : list6, (i10 & 1073741824) != 0 ? f55840b0 : divShape, (i10 & Integer.MIN_VALUE) != 0 ? f55841c0 : divFixedSize, (i11 & 1) != 0 ? null : list7, (i11 & 2) != 0 ? null : divTransform, (i11 & 4) != 0 ? null : divChangeTransition, (i11 & 8) != 0 ? null : divAppearanceTransition, (i11 & 16) != 0 ? null : divAppearanceTransition2, (i11 & 32) != 0 ? null : list8, (i11 & 64) != 0 ? null : list9, (i11 & 128) != 0 ? null : list10, (i11 & 256) != 0 ? f55842d0 : expression12, (i11 & 512) != 0 ? null : divVisibilityAction, (i11 & 1024) != 0 ? null : list11, (i11 & 2048) != 0 ? f55843e0 : divSize2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivIndicator z(DivIndicator divIndicator, DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divIndicator.o() : divAccessibility;
        Expression expression13 = (i10 & 2) != 0 ? divIndicator.f55846b : expression;
        Expression expression14 = (i10 & 4) != 0 ? divIndicator.f55847c : expression2;
        DivRoundedRectangleShape divRoundedRectangleShape4 = (i10 & 8) != 0 ? divIndicator.f55848d : divRoundedRectangleShape;
        Expression expressionG = (i10 & 16) != 0 ? divIndicator.g() : expression3;
        Expression expressionM = (i10 & 32) != 0 ? divIndicator.m() : expression4;
        Expression alpha = (i10 & 64) != 0 ? divIndicator.getAlpha() : expression5;
        Expression expression15 = (i10 & 128) != 0 ? divIndicator.f55852h : expression6;
        List listW = (i10 & 256) != 0 ? divIndicator.w() : list;
        List background = (i10 & 512) != 0 ? divIndicator.getBackground() : list2;
        DivBorder divBorderX = (i10 & 1024) != 0 ? divIndicator.x() : divBorder;
        Expression expressionB = (i10 & 2048) != 0 ? divIndicator.b() : expression7;
        List listK = (i10 & 4096) != 0 ? divIndicator.k() : list3;
        List extensions = (i10 & 8192) != 0 ? divIndicator.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 16384) != 0 ? divIndicator.n() : divFocus;
        List listU = (i10 & 32768) != 0 ? divIndicator.u() : list5;
        DivSize height = (i10 & 65536) != 0 ? divIndicator.getHeight() : divSize;
        String id2 = (i10 & 131072) != 0 ? divIndicator.getId() : str;
        DivFocus divFocus2 = divFocusN;
        Expression expression16 = (i10 & 262144) != 0 ? divIndicator.f55863s : expression8;
        DivRoundedRectangleShape divRoundedRectangleShape5 = (i10 & 524288) != 0 ? divIndicator.f55864t : divRoundedRectangleShape2;
        DivRoundedRectangleShape divRoundedRectangleShape6 = (i10 & 1048576) != 0 ? divIndicator.f55865u : divRoundedRectangleShape3;
        DivIndicatorItemPlacement divIndicatorItemPlacement2 = (i10 & 2097152) != 0 ? divIndicator.f55866v : divIndicatorItemPlacement;
        DivLayoutProvider divLayoutProviderR = (i10 & 4194304) != 0 ? divIndicator.r() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 8388608) != 0 ? divIndicator.d() : divEdgeInsets;
        DivIndicatorItemPlacement divIndicatorItemPlacement3 = divIndicatorItemPlacement2;
        Expression expression17 = (i10 & 16777216) != 0 ? divIndicator.f55869y : expression9;
        return divIndicator.y(divAccessibilityO, expression13, expression14, divRoundedRectangleShape4, expressionG, expressionM, alpha, expression15, listW, background, divBorderX, expressionB, listK, extensions, divFocus2, listU, height, id2, expression16, divRoundedRectangleShape5, divRoundedRectangleShape6, divIndicatorItemPlacement3, divLayoutProviderR, divEdgeInsetsD, expression17, (i10 & 33554432) != 0 ? divIndicator.p() : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divIndicator.A : str2, (i10 & 134217728) != 0 ? divIndicator.f() : expression10, (i10 & 268435456) != 0 ? divIndicator.e() : expression11, (i10 & 536870912) != 0 ? divIndicator.q() : list6, (i10 & 1073741824) != 0 ? divIndicator.E : divShape, (i10 & Integer.MIN_VALUE) != 0 ? divIndicator.F : divFixedSize, (i11 & 1) != 0 ? divIndicator.h() : list7, (i11 & 2) != 0 ? divIndicator.getTransform() : divTransform, (i11 & 4) != 0 ? divIndicator.j() : divChangeTransition, (i11 & 8) != 0 ? divIndicator.v() : divAppearanceTransition, (i11 & 16) != 0 ? divIndicator.i() : divAppearanceTransition2, (i11 & 32) != 0 ? divIndicator.l() : list8, (i11 & 64) != 0 ? divIndicator.s() : list9, (i11 & 128) != 0 ? divIndicator.c() : list10, (i11 & 256) != 0 ? divIndicator.getVisibility() : expression12, (i11 & 512) != 0 ? divIndicator.t() : divVisibilityAction, (i11 & 1024) != 0 ? divIndicator.a() : list11, (i11 & 2048) != 0 ? divIndicator.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivIndicator divIndicator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divIndicator == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divIndicator.o(), expressionResolver, expressionResolver2) : divIndicator.o() == null) || this.f55846b.evaluate(expressionResolver).intValue() != divIndicator.f55846b.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        if (!(this.f55847c.evaluate(expressionResolver).doubleValue() == divIndicator.f55847c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape = this.f55848d;
        if (!(divRoundedRectangleShape != null ? divRoundedRectangleShape.a(divIndicator.f55848d, expressionResolver, expressionResolver2) : divIndicator.f55848d == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divIndicator.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divIndicator.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divIndicator.getAlpha().evaluate(expressionResolver2).doubleValue()) || this.f55852h.evaluate(expressionResolver) != divIndicator.f55852h.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divIndicator.w();
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
        if (divIndicator.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divIndicator.getBackground();
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
        if (divIndicator.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divIndicator.x(), expressionResolver, expressionResolver2) : divIndicator.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divIndicator.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divIndicator.k();
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
        if (divIndicator.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divIndicator.getExtensions();
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
        if (divIndicator.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divIndicator.n(), expressionResolver, expressionResolver2) : divIndicator.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divIndicator.u();
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
        if (divIndicator.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divIndicator.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divIndicator.getId()) || this.f55863s.evaluate(expressionResolver).intValue() != divIndicator.f55863s.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.f55864t;
        if (!(divRoundedRectangleShape2 != null ? divRoundedRectangleShape2.a(divIndicator.f55864t, expressionResolver, expressionResolver2) : divIndicator.f55864t == null)) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.f55865u;
        if (!(divRoundedRectangleShape3 != null ? divRoundedRectangleShape3.a(divIndicator.f55865u, expressionResolver, expressionResolver2) : divIndicator.f55865u == null)) {
            return false;
        }
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.f55866v;
        if (!(divIndicatorItemPlacement != null ? divIndicatorItemPlacement.a(divIndicator.f55866v, expressionResolver, expressionResolver2) : divIndicator.f55866v == null)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divIndicator.r(), expressionResolver, expressionResolver2) : divIndicator.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divIndicator.d(), expressionResolver, expressionResolver2) : divIndicator.d() == null)) {
            return false;
        }
        if (!(this.f55869y.evaluate(expressionResolver).doubleValue() == divIndicator.f55869y.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divIndicator.p(), expressionResolver, expressionResolver2) : divIndicator.p() == null) || !tn.p.f(this.A, divIndicator.A)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divIndicator.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divIndicator.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divIndicator.q();
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
        if (divIndicator.q() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15 || !this.E.a(divIndicator.E, expressionResolver, expressionResolver2) || !this.F.a(divIndicator.F, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divIndicator.h();
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
        if (divIndicator.h() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divIndicator.getTransform(), expressionResolver, expressionResolver2) : divIndicator.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divIndicator.j(), expressionResolver, expressionResolver2) : divIndicator.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divIndicator.v(), expressionResolver, expressionResolver2) : divIndicator.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divIndicator.i(), expressionResolver, expressionResolver2) : divIndicator.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divIndicator.l();
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
        if (divIndicator.l() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divIndicator.s();
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
        if (divIndicator.s() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divIndicator.c();
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
        if (divIndicator.c() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19 || getVisibility().evaluate(expressionResolver) != divIndicator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divIndicator.t(), expressionResolver, expressionResolver2) : divIndicator.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divIndicator.a();
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
        if (divIndicator.a() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        return z20 && getWidth().a(divIndicator.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55856l;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f55868x;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.C;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55849e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55851g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55854j;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55858n;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55861q;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f55862r;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.H;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.O;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.R;
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
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivIndicator.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash10 = 0;
        int iHash11 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0) + this.f55846b.hashCode() + this.f55847c.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape = this.f55848d;
        int iHash12 = iHash11 + (divRoundedRectangleShape != null ? divRoundedRectangleShape.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode() + this.f55852h.hashCode();
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
        int iHash13 = i11 + (divBorderX != null ? divBorderX.hash() : 0);
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash13 + (expressionB != null ? expressionB.hashCode() : 0);
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
        int iHash14 = i13 + (divFocusN != null ? divFocusN.hash() : 0);
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
        int iHash15 = iHash14 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f55863s.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.f55864t;
        int iHash16 = iHashCode5 + (divRoundedRectangleShape2 != null ? divRoundedRectangleShape2.hash() : 0);
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.f55865u;
        int iHash17 = iHash16 + (divRoundedRectangleShape3 != null ? divRoundedRectangleShape3.hash() : 0);
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.f55866v;
        int iHash18 = iHash17 + (divIndicatorItemPlacement != null ? divIndicatorItemPlacement.hash() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash19 = iHash18 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash20 = iHash19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f55869y.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash21 = iHash20 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        String str = this.A;
        int iHashCode6 = iHash21 + (str != null ? str.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
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
        int iHash22 = iHashCode8 + iHash6 + this.E.hash() + this.F.hash();
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
        int i14 = iHash22 + iHash7;
        DivTransform transform = getTransform();
        int iHash23 = i14 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash24 = iHash23 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash25 = iHash24 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash26 = iHash25 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode9 = iHash26 + (listL != null ? listL.hashCode() : 0);
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
        int i15 = iHashCode9 + iHash8;
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
        int iHashCode10 = i15 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash27 = iHashCode10 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash10 + getWidth().hash();
        this.S = Integer.valueOf(iHash28);
        return iHash28;
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
        return this.f55857m;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55850f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55859o;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55845a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f55870z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.D;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f55867w;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f55860p;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.J;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55853i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55855k;
    }

    @NotNull
    public final DivIndicator y(@Nullable DivAccessibility divAccessibility, @NotNull Expression<Integer> expression, @NotNull Expression<Double> expression2, @Nullable DivRoundedRectangleShape divRoundedRectangleShape, @Nullable Expression<DivAlignmentHorizontal> expression3, @Nullable Expression<DivAlignmentVertical> expression4, @NotNull Expression<Double> expression5, @NotNull Expression<Animation> expression6, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression7, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Integer> expression8, @Nullable DivRoundedRectangleShape divRoundedRectangleShape2, @Nullable DivRoundedRectangleShape divRoundedRectangleShape3, @Nullable DivIndicatorItemPlacement divIndicatorItemPlacement, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Double> expression9, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable String str2, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @Nullable List<DivAction> list6, @NotNull DivShape divShape, @NotNull DivFixedSize divFixedSize, @Nullable List<DivTooltip> list7, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list8, @Nullable List<DivTrigger> list9, @Nullable List<? extends DivVariable> list10, @NotNull Expression<DivVisibility> expression12, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list11, @NotNull DivSize divSize2) {
        return new DivIndicator(divAccessibility, expression, expression2, divRoundedRectangleShape, expression3, expression4, expression5, expression6, list, list2, divBorder, expression7, list3, list4, divFocus, list5, divSize, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression9, divEdgeInsets2, str2, expression10, expression11, list6, divShape, divFixedSize, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression12, divVisibilityAction, list11, divSize2);
    }
}
