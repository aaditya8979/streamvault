package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPager.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPager implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a T = new a(null);

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<ItemAlignment> V;

    @NotNull
    public static final Expression<Long> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Boolean> Y;

    @NotNull
    public static final DivFixedSize Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Orientation> f56380a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56381b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<ItemAlignment> f56382c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f56383d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f56384e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPager> f56385f0;

    @NotNull
    public final Expression<Boolean> A;

    @Nullable
    public final Expression<String> B;

    @Nullable
    public final Expression<Long> C;

    @NotNull
    public final Expression<ItemAlignment> D;

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

    @Nullable
    public Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f56386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f56387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f56388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f56390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f56391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f56392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f56393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Expression<ItemAlignment> f56394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f56396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f56397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final DivFocus f56398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f56399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final DivSize f56400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f56401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final DivCollectionItemBuilder f56403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f56404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final List<Div> f56405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final DivPagerLayoutMode f56406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f56407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f56408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Expression<Orientation> f56409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f56410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivPageTransformation f56411z;

    /* JADX INFO: compiled from: DivPager.kt */
    public enum ItemAlignment {
        START("start"),
        CENTER("center"),
        END("end");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<ItemAlignment, String> TO_STRING = new sn.l<ItemAlignment, String>() { // from class: com.yandex.div2.DivPager$ItemAlignment$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivPager.ItemAlignment itemAlignment) {
                return DivPager.ItemAlignment.Converter.b(itemAlignment);
            }
        };

        @NotNull
        public static final sn.l<String, ItemAlignment> FROM_STRING = new sn.l<String, ItemAlignment>() { // from class: com.yandex.div2.DivPager$ItemAlignment$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivPager.ItemAlignment invoke(@NotNull String str) {
                return DivPager.ItemAlignment.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPager.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final ItemAlignment a(@NotNull String str) {
                ItemAlignment itemAlignment = ItemAlignment.START;
                if (tn.p.f(str, itemAlignment.value)) {
                    return itemAlignment;
                }
                ItemAlignment itemAlignment2 = ItemAlignment.CENTER;
                if (tn.p.f(str, itemAlignment2.value)) {
                    return itemAlignment2;
                }
                ItemAlignment itemAlignment3 = ItemAlignment.END;
                if (tn.p.f(str, itemAlignment3.value)) {
                    return itemAlignment3;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull ItemAlignment itemAlignment) {
                return itemAlignment.value;
            }
        }

        ItemAlignment(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivPager.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Orientation, String> TO_STRING = new sn.l<Orientation, String>() { // from class: com.yandex.div2.DivPager$Orientation$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivPager.Orientation orientation) {
                return DivPager.Orientation.Converter.b(orientation);
            }
        };

        @NotNull
        public static final sn.l<String, Orientation> FROM_STRING = new sn.l<String, Orientation>() { // from class: com.yandex.div2.DivPager$Orientation$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivPager.Orientation invoke(@NotNull String str) {
                return DivPager.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPager.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Orientation a(@NotNull String str) {
                Orientation orientation = Orientation.HORIZONTAL;
                if (tn.p.f(str, orientation.value)) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.VERTICAL;
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

    /* JADX INFO: compiled from: DivPager.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPager a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, ItemAlignment.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        f56380a0 = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        f56381b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f56382c0 = Expression.Companion.constant$default(companion, ItemAlignment.CENTER, null, 2, null);
        f56383d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f56384e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f56385f0 = new sn.p<ParsingEnvironment, JSONObject, DivPager>() { // from class: com.yandex.div2.DivPager$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPager mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPager.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivPager(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @NotNull Expression<ItemAlignment> expression5, @NotNull Expression<Long> expression6, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression7, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull DivFixedSize divFixedSize, @Nullable List<? extends Div> list6, @NotNull DivPagerLayoutMode divPagerLayoutMode, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression8, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable DivPageTransformation divPageTransformation, @NotNull Expression<Boolean> expression9, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @NotNull Expression<ItemAlignment> expression12, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f56386a = divAccessibility;
        this.f56387b = expression;
        this.f56388c = expression2;
        this.f56389d = expression3;
        this.f56390e = list;
        this.f56391f = list2;
        this.f56392g = divBorder;
        this.f56393h = expression4;
        this.f56394i = expression5;
        this.f56395j = expression6;
        this.f56396k = list3;
        this.f56397l = list4;
        this.f56398m = divFocus;
        this.f56399n = list5;
        this.f56400o = divSize;
        this.f56401p = str;
        this.f56402q = expression7;
        this.f56403r = divCollectionItemBuilder;
        this.f56404s = divFixedSize;
        this.f56405t = list6;
        this.f56406u = divPagerLayoutMode;
        this.f56407v = divLayoutProvider;
        this.f56408w = divEdgeInsets;
        this.f56409x = expression8;
        this.f56410y = divEdgeInsets2;
        this.f56411z = divPageTransformation;
        this.A = expression9;
        this.B = expression10;
        this.C = expression11;
        this.D = expression12;
        this.E = list7;
        this.F = list8;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression13;
        this.O = divVisibilityAction;
        this.P = list12;
        this.Q = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivPager z(DivPager divPager, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression7, DivCollectionItemBuilder divCollectionItemBuilder, DivFixedSize divFixedSize, List list6, DivPagerLayoutMode divPagerLayoutMode, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression8, DivEdgeInsets divEdgeInsets2, DivPageTransformation divPageTransformation, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divPager.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divPager.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divPager.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divPager.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divPager.w() : list;
        List background = (i10 & 32) != 0 ? divPager.getBackground() : list2;
        DivBorder divBorderX = (i10 & 64) != 0 ? divPager.x() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divPager.b() : expression4;
        Expression expression14 = (i10 & 256) != 0 ? divPager.f56394i : expression5;
        Expression expression15 = (i10 & 512) != 0 ? divPager.f56395j : expression6;
        List listK = (i10 & 1024) != 0 ? divPager.k() : list3;
        List extensions = (i10 & 2048) != 0 ? divPager.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 4096) != 0 ? divPager.n() : divFocus;
        List listU = (i10 & 8192) != 0 ? divPager.u() : list5;
        DivSize height = (i10 & 16384) != 0 ? divPager.getHeight() : divSize;
        String id2 = (i10 & 32768) != 0 ? divPager.getId() : str;
        DivSize divSize3 = height;
        Expression expression16 = (i10 & 65536) != 0 ? divPager.f56402q : expression7;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 131072) != 0 ? divPager.f56403r : divCollectionItemBuilder;
        DivFixedSize divFixedSize2 = (i10 & 262144) != 0 ? divPager.f56404s : divFixedSize;
        List list13 = (i10 & 524288) != 0 ? divPager.f56405t : list6;
        DivPagerLayoutMode divPagerLayoutMode2 = (i10 & 1048576) != 0 ? divPager.f56406u : divPagerLayoutMode;
        DivLayoutProvider divLayoutProviderR = (i10 & 2097152) != 0 ? divPager.r() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 4194304) != 0 ? divPager.d() : divEdgeInsets;
        DivPagerLayoutMode divPagerLayoutMode3 = divPagerLayoutMode2;
        Expression expression17 = (i10 & 8388608) != 0 ? divPager.f56409x : expression8;
        return divPager.y(divAccessibilityO, expressionG, expressionM, alpha, listW, background, divBorderX, expressionB, expression14, expression15, listK, extensions, divFocusN, listU, divSize3, id2, expression16, divCollectionItemBuilder2, divFixedSize2, list13, divPagerLayoutMode3, divLayoutProviderR, divEdgeInsetsD, expression17, (i10 & 16777216) != 0 ? divPager.p() : divEdgeInsets2, (i10 & 33554432) != 0 ? divPager.f56411z : divPageTransformation, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divPager.A : expression9, (i10 & 134217728) != 0 ? divPager.f() : expression10, (i10 & 268435456) != 0 ? divPager.e() : expression11, (i10 & 536870912) != 0 ? divPager.D : expression12, (i10 & 1073741824) != 0 ? divPager.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divPager.h() : list8, (i11 & 1) != 0 ? divPager.getTransform() : divTransform, (i11 & 2) != 0 ? divPager.j() : divChangeTransition, (i11 & 4) != 0 ? divPager.v() : divAppearanceTransition, (i11 & 8) != 0 ? divPager.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divPager.l() : list9, (i11 & 32) != 0 ? divPager.s() : list10, (i11 & 64) != 0 ? divPager.c() : list11, (i11 & 128) != 0 ? divPager.getVisibility() : expression13, (i11 & 256) != 0 ? divPager.t() : divVisibilityAction, (i11 & 512) != 0 ? divPager.a() : list12, (i11 & 1024) != 0 ? divPager.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivPager divPager, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divPager == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divPager.o(), expressionResolver, expressionResolver2) : divPager.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divPager.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divPager.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divPager.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divPager.w();
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
        if (divPager.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divPager.getBackground();
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
        if (divPager.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divPager.x(), expressionResolver, expressionResolver2) : divPager.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divPager.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f56394i.evaluate(expressionResolver) != divPager.f56394i.evaluate(expressionResolver2) || this.f56395j.evaluate(expressionResolver).longValue() != divPager.f56395j.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divPager.k();
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
        if (divPager.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divPager.getExtensions();
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
        if (divPager.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divPager.n(), expressionResolver, expressionResolver2) : divPager.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divPager.u();
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
        if (divPager.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divPager.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divPager.getId()) || this.f56402q.evaluate(expressionResolver).booleanValue() != divPager.f56402q.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f56403r;
        if (!(divCollectionItemBuilder != null ? divCollectionItemBuilder.a(divPager.f56403r, expressionResolver, expressionResolver2) : divPager.f56403r == null) || !this.f56404s.a(divPager.f56404s, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<Div> list = this.f56405t;
        if (list != null) {
            List<Div> list2 = divPager.f56405t;
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
        if (divPager.f56405t != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15 || !this.f56406u.a(divPager.f56406u, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divPager.r(), expressionResolver, expressionResolver2) : divPager.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divPager.d(), expressionResolver, expressionResolver2) : divPager.d() == null) || this.f56409x.evaluate(expressionResolver) != divPager.f56409x.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divPager.p(), expressionResolver, expressionResolver2) : divPager.p() == null)) {
            return false;
        }
        DivPageTransformation divPageTransformation = this.f56411z;
        if (!(divPageTransformation != null ? divPageTransformation.a(divPager.f56411z, expressionResolver, expressionResolver2) : divPager.f56411z == null) || this.A.evaluate(expressionResolver).booleanValue() != divPager.A.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divPager.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divPager.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.D.evaluate(expressionResolver) != divPager.D.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divPager.q();
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
        if (divPager.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divPager.h();
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
        if (divPager.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divPager.getTransform(), expressionResolver, expressionResolver2) : divPager.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divPager.j(), expressionResolver, expressionResolver2) : divPager.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divPager.v(), expressionResolver, expressionResolver2) : divPager.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divPager.i(), expressionResolver, expressionResolver2) : divPager.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divPager.l();
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
        if (divPager.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divPager.s();
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
        if (divPager.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divPager.c();
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
        if (divPager.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divPager.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divPager.t(), expressionResolver, expressionResolver2) : divPager.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divPager.a();
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
        if (divPager.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divPager.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f56393h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f56408w;
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
        return this.f56387b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f56389d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f56391f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f56397l;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f56400o;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f56401p;
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
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.f56405t;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.S = Integer.valueOf(i10);
        return i10;
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
        return this.f56396k;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f56388c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f56398m;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f56386a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f56410y;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPager.class).hashCode();
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
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0) + this.f56394i.hashCode() + this.f56395j.hashCode();
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f56402q.hashCode();
        DivCollectionItemBuilder divCollectionItemBuilder = this.f56403r;
        int iHash15 = iHashCode5 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.f56404s.hash() + this.f56406u.hash();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash16 = iHash15 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f56409x.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash18 = iHash17 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        DivPageTransformation divPageTransformation = this.f56411z;
        int iHash19 = iHash18 + (divPageTransformation != null ? divPageTransformation.hash() : 0) + this.A.hashCode();
        Expression<String> expressionF = f();
        int iHashCode6 = iHash19 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0) + this.D.hashCode();
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
        int i14 = iHashCode7 + iHash6;
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
        int iHash20 = i15 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash21 = iHash20 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash22 = iHash21 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash23 = iHash22 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode8 = iHash23 + (listL != null ? listL.hashCode() : 0);
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
        int i16 = iHashCode8 + iHash8;
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
        int iHashCode9 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash24 = iHashCode9 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash25 = iHash24 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash25);
        return iHash25;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f56407v;
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
        return this.f56399n;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f56390e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f56392g;
    }

    @NotNull
    public final DivPager y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @NotNull Expression<ItemAlignment> expression5, @NotNull Expression<Long> expression6, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression7, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull DivFixedSize divFixedSize, @Nullable List<? extends Div> list6, @NotNull DivPagerLayoutMode divPagerLayoutMode, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression8, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable DivPageTransformation divPageTransformation, @NotNull Expression<Boolean> expression9, @Nullable Expression<String> expression10, @Nullable Expression<Long> expression11, @NotNull Expression<ItemAlignment> expression12, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivPager(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, expression5, expression6, list3, list4, divFocus, list5, divSize, str, expression7, divCollectionItemBuilder, divFixedSize, list6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression8, divEdgeInsets2, divPageTransformation, expression9, expression10, expression11, expression12, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }
}
