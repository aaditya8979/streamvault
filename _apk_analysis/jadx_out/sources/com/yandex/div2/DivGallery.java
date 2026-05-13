package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGallery.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivGallery implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a T = new a(null);

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<CrossContentAlignment> V;

    @NotNull
    public static final Expression<Long> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Long> Y;

    @NotNull
    public static final Expression<Orientation> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55400a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<ScrollMode> f55401b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<Scrollbar> f55402c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55403d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55404e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivGallery> f55405f0;

    @Nullable
    public final Expression<String> A;

    @Nullable
    public final Expression<Long> B;

    @NotNull
    public final Expression<ScrollMode> C;

    @NotNull
    public final Expression<Scrollbar> D;

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
    public final DivAccessibility f55406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f55412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Expression<CrossContentAlignment> f55415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final DivFocus f55420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final DivSize f55422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final String f55423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final DivCollectionItemBuilder f55424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<Div> f55426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f55427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Expression<Orientation> f55429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f55430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55431z;

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum CrossContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<CrossContentAlignment, String> TO_STRING = new sn.l<CrossContentAlignment, String>() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivGallery.CrossContentAlignment crossContentAlignment) {
                return DivGallery.CrossContentAlignment.Converter.b(crossContentAlignment);
            }
        };

        @NotNull
        public static final sn.l<String, CrossContentAlignment> FROM_STRING = new sn.l<String, CrossContentAlignment>() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivGallery.CrossContentAlignment invoke(@NotNull String str) {
                return DivGallery.CrossContentAlignment.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final CrossContentAlignment a(@NotNull String str) {
                CrossContentAlignment crossContentAlignment = CrossContentAlignment.START;
                if (tn.p.f(str, crossContentAlignment.value)) {
                    return crossContentAlignment;
                }
                CrossContentAlignment crossContentAlignment2 = CrossContentAlignment.CENTER;
                if (tn.p.f(str, crossContentAlignment2.value)) {
                    return crossContentAlignment2;
                }
                CrossContentAlignment crossContentAlignment3 = CrossContentAlignment.END;
                if (tn.p.f(str, crossContentAlignment3.value)) {
                    return crossContentAlignment3;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull CrossContentAlignment crossContentAlignment) {
                return crossContentAlignment.value;
            }
        }

        CrossContentAlignment(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Orientation, String> TO_STRING = new sn.l<Orientation, String>() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivGallery.Orientation orientation) {
                return DivGallery.Orientation.Converter.b(orientation);
            }
        };

        @NotNull
        public static final sn.l<String, Orientation> FROM_STRING = new sn.l<String, Orientation>() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivGallery.Orientation invoke(@NotNull String str) {
                return DivGallery.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
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

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<ScrollMode, String> TO_STRING = new sn.l<ScrollMode, String>() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivGallery.ScrollMode scrollMode) {
                return DivGallery.ScrollMode.Converter.b(scrollMode);
            }
        };

        @NotNull
        public static final sn.l<String, ScrollMode> FROM_STRING = new sn.l<String, ScrollMode>() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivGallery.ScrollMode invoke(@NotNull String str) {
                return DivGallery.ScrollMode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final ScrollMode a(@NotNull String str) {
                ScrollMode scrollMode = ScrollMode.PAGING;
                if (tn.p.f(str, scrollMode.value)) {
                    return scrollMode;
                }
                ScrollMode scrollMode2 = ScrollMode.DEFAULT;
                if (tn.p.f(str, scrollMode2.value)) {
                    return scrollMode2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull ScrollMode scrollMode) {
                return scrollMode.value;
            }
        }

        ScrollMode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum Scrollbar {
        NONE("none"),
        AUTO("auto");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Scrollbar, String> TO_STRING = new sn.l<Scrollbar, String>() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivGallery.Scrollbar scrollbar) {
                return DivGallery.Scrollbar.Converter.b(scrollbar);
            }
        };

        @NotNull
        public static final sn.l<String, Scrollbar> FROM_STRING = new sn.l<String, Scrollbar>() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivGallery.Scrollbar invoke(@NotNull String str) {
                return DivGallery.Scrollbar.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Scrollbar a(@NotNull String str) {
                Scrollbar scrollbar = Scrollbar.NONE;
                if (tn.p.f(str, scrollbar.value)) {
                    return scrollbar;
                }
                Scrollbar scrollbar2 = Scrollbar.AUTO;
                if (tn.p.f(str, scrollbar2.value)) {
                    return scrollbar2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Scrollbar scrollbar) {
                return scrollbar.value;
            }
        }

        Scrollbar(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivGallery a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, CrossContentAlignment.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        f55400a0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55401b0 = Expression.Companion.constant$default(companion, ScrollMode.DEFAULT, null, 2, null);
        f55402c0 = Expression.Companion.constant$default(companion, Scrollbar.NONE, null, 2, null);
        f55403d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55404e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f55405f0 = new sn.p<ParsingEnvironment, JSONObject, DivGallery>() { // from class: com.yandex.div2.DivGallery$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGallery mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivGallery.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivGallery() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivGallery(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<CrossContentAlignment> expression6, @Nullable Expression<Long> expression7, @NotNull Expression<Long> expression8, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull Expression<Long> expression9, @Nullable List<? extends Div> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression10, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Boolean> expression11, @Nullable Expression<String> expression12, @Nullable Expression<Long> expression13, @NotNull Expression<ScrollMode> expression14, @NotNull Expression<Scrollbar> expression15, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression16, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f55406a = divAccessibility;
        this.f55407b = expression;
        this.f55408c = expression2;
        this.f55409d = expression3;
        this.f55410e = list;
        this.f55411f = list2;
        this.f55412g = divBorder;
        this.f55413h = expression4;
        this.f55414i = expression5;
        this.f55415j = expression6;
        this.f55416k = expression7;
        this.f55417l = expression8;
        this.f55418m = list3;
        this.f55419n = list4;
        this.f55420o = divFocus;
        this.f55421p = list5;
        this.f55422q = divSize;
        this.f55423r = str;
        this.f55424s = divCollectionItemBuilder;
        this.f55425t = expression9;
        this.f55426u = list6;
        this.f55427v = divLayoutProvider;
        this.f55428w = divEdgeInsets;
        this.f55429x = expression10;
        this.f55430y = divEdgeInsets2;
        this.f55431z = expression11;
        this.A = expression12;
        this.B = expression13;
        this.C = expression14;
        this.D = expression15;
        this.E = list7;
        this.F = list8;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression16;
        this.O = divVisibilityAction;
        this.P = list12;
        this.Q = divSize2;
    }

    public /* synthetic */ DivGallery(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : expression, (i10 & 4) != 0 ? null : expression2, (i10 & 8) != 0 ? U : expression3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : divBorder, (i10 & 128) != 0 ? null : expression4, (i10 & 256) != 0 ? null : expression5, (i10 & 512) != 0 ? V : expression6, (i10 & 1024) != 0 ? null : expression7, (i10 & 2048) != 0 ? W : expression8, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : divFocus, (i10 & 32768) != 0 ? null : list5, (i10 & 65536) != 0 ? X : divSize, (i10 & 131072) != 0 ? null : str, (i10 & 262144) != 0 ? null : divCollectionItemBuilder, (i10 & 524288) != 0 ? Y : expression9, (i10 & 1048576) != 0 ? null : list6, (i10 & 2097152) != 0 ? null : divLayoutProvider, (i10 & 4194304) != 0 ? null : divEdgeInsets, (i10 & 8388608) != 0 ? Z : expression10, (i10 & 16777216) != 0 ? null : divEdgeInsets2, (i10 & 33554432) != 0 ? f55400a0 : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : expression12, (i10 & 134217728) != 0 ? null : expression13, (i10 & 268435456) != 0 ? f55401b0 : expression14, (i10 & 536870912) != 0 ? f55402c0 : expression15, (i10 & 1073741824) != 0 ? null : list7, (i10 & Integer.MIN_VALUE) != 0 ? null : list8, (i11 & 1) != 0 ? null : divTransform, (i11 & 2) != 0 ? null : divChangeTransition, (i11 & 4) != 0 ? null : divAppearanceTransition, (i11 & 8) != 0 ? null : divAppearanceTransition2, (i11 & 16) != 0 ? null : list9, (i11 & 32) != 0 ? null : list10, (i11 & 64) != 0 ? null : list11, (i11 & 128) != 0 ? f55403d0 : expression16, (i11 & 256) != 0 ? null : divVisibilityAction, (i11 & 512) != 0 ? null : list12, (i11 & 1024) != 0 ? f55404e0 : divSize2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivGallery z(DivGallery divGallery, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divGallery.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divGallery.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divGallery.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divGallery.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divGallery.w() : list;
        List background = (i10 & 32) != 0 ? divGallery.getBackground() : list2;
        DivBorder divBorderX = (i10 & 64) != 0 ? divGallery.x() : divBorder;
        Expression expression17 = (i10 & 128) != 0 ? divGallery.f55413h : expression4;
        Expression expressionB = (i10 & 256) != 0 ? divGallery.b() : expression5;
        Expression expression18 = (i10 & 512) != 0 ? divGallery.f55415j : expression6;
        Expression expression19 = (i10 & 1024) != 0 ? divGallery.f55416k : expression7;
        Expression expression20 = (i10 & 2048) != 0 ? divGallery.f55417l : expression8;
        List listK = (i10 & 4096) != 0 ? divGallery.k() : list3;
        List extensions = (i10 & 8192) != 0 ? divGallery.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 16384) != 0 ? divGallery.n() : divFocus;
        List listU = (i10 & 32768) != 0 ? divGallery.u() : list5;
        DivSize height = (i10 & 65536) != 0 ? divGallery.getHeight() : divSize;
        String id2 = (i10 & 131072) != 0 ? divGallery.getId() : str;
        DivFocus divFocus2 = divFocusN;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 262144) != 0 ? divGallery.f55424s : divCollectionItemBuilder;
        Expression expression21 = (i10 & 524288) != 0 ? divGallery.f55425t : expression9;
        List list13 = (i10 & 1048576) != 0 ? divGallery.f55426u : list6;
        DivLayoutProvider divLayoutProviderR = (i10 & 2097152) != 0 ? divGallery.r() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 4194304) != 0 ? divGallery.d() : divEdgeInsets;
        List list14 = list13;
        Expression expression22 = (i10 & 8388608) != 0 ? divGallery.f55429x : expression10;
        return divGallery.y(divAccessibilityO, expressionG, expressionM, alpha, listW, background, divBorderX, expression17, expressionB, expression18, expression19, expression20, listK, extensions, divFocus2, listU, height, id2, divCollectionItemBuilder2, expression21, list14, divLayoutProviderR, divEdgeInsetsD, expression22, (i10 & 16777216) != 0 ? divGallery.p() : divEdgeInsets2, (i10 & 33554432) != 0 ? divGallery.f55431z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divGallery.f() : expression12, (i10 & 134217728) != 0 ? divGallery.e() : expression13, (i10 & 268435456) != 0 ? divGallery.C : expression14, (i10 & 536870912) != 0 ? divGallery.D : expression15, (i10 & 1073741824) != 0 ? divGallery.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divGallery.h() : list8, (i11 & 1) != 0 ? divGallery.getTransform() : divTransform, (i11 & 2) != 0 ? divGallery.j() : divChangeTransition, (i11 & 4) != 0 ? divGallery.v() : divAppearanceTransition, (i11 & 8) != 0 ? divGallery.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divGallery.l() : list9, (i11 & 32) != 0 ? divGallery.s() : list10, (i11 & 64) != 0 ? divGallery.c() : list11, (i11 & 128) != 0 ? divGallery.getVisibility() : expression16, (i11 & 256) != 0 ? divGallery.t() : divVisibilityAction, (i11 & 512) != 0 ? divGallery.a() : list12, (i11 & 1024) != 0 ? divGallery.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivGallery divGallery, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divGallery == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divGallery.o(), expressionResolver, expressionResolver2) : divGallery.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divGallery.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divGallery.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divGallery.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divGallery.w();
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
        if (divGallery.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divGallery.getBackground();
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
        if (divGallery.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divGallery.x(), expressionResolver, expressionResolver2) : divGallery.x() == null)) {
            return false;
        }
        Expression<Long> expression = this.f55413h;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divGallery.f55413h;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate2 = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divGallery.b();
        if (!tn.p.f(lEvaluate2, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f55415j.evaluate(expressionResolver) != divGallery.f55415j.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<Long> expression3 = this.f55416k;
        Long lEvaluate3 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divGallery.f55416k;
        if (!tn.p.f(lEvaluate3, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.f55417l.evaluate(expressionResolver).longValue() != divGallery.f55417l.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divGallery.k();
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
        if (divGallery.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divGallery.getExtensions();
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
        if (divGallery.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divGallery.n(), expressionResolver, expressionResolver2) : divGallery.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divGallery.u();
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
        if (divGallery.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divGallery.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divGallery.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f55424s;
        if (!(divCollectionItemBuilder != null ? divCollectionItemBuilder.a(divGallery.f55424s, expressionResolver, expressionResolver2) : divGallery.f55424s == null) || this.f55425t.evaluate(expressionResolver).longValue() != divGallery.f55425t.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<Div> list = this.f55426u;
        if (list != null) {
            List<Div> list2 = divGallery.f55426u;
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
        if (divGallery.f55426u != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divGallery.r(), expressionResolver, expressionResolver2) : divGallery.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divGallery.d(), expressionResolver, expressionResolver2) : divGallery.d() == null) || this.f55429x.evaluate(expressionResolver) != divGallery.f55429x.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divGallery.p(), expressionResolver, expressionResolver2) : divGallery.p() == null) || this.f55431z.evaluate(expressionResolver).booleanValue() != divGallery.f55431z.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divGallery.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate4 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divGallery.e();
        if (!tn.p.f(lEvaluate4, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver) != divGallery.C.evaluate(expressionResolver2) || this.D.evaluate(expressionResolver) != divGallery.D.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divGallery.q();
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
        if (divGallery.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divGallery.h();
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
        if (divGallery.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divGallery.getTransform(), expressionResolver, expressionResolver2) : divGallery.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divGallery.j(), expressionResolver, expressionResolver2) : divGallery.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divGallery.v(), expressionResolver, expressionResolver2) : divGallery.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divGallery.i(), expressionResolver, expressionResolver2) : divGallery.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divGallery.l();
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
        if (divGallery.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divGallery.s();
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
        if (divGallery.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divGallery.c();
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
        if (divGallery.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divGallery.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divGallery.t(), expressionResolver, expressionResolver2) : divGallery.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divGallery.a();
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
        if (divGallery.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divGallery.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55414i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f55428w;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55407b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55409d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55411f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55419n;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55422q;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f55423r;
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
        List<Div> list = this.f55426u;
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
        return this.f55418m;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55408c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55420o;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55406a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f55430y;
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
        int iHashCode = tn.t.b(DivGallery.class).hashCode();
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
        Expression<Long> expression = this.f55413h;
        int iHashCode4 = iHash12 + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expressionB = b();
        int iHashCode5 = iHashCode4 + (expressionB != null ? expressionB.hashCode() : 0) + this.f55415j.hashCode();
        Expression<Long> expression2 = this.f55416k;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0) + this.f55417l.hashCode();
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
        int i12 = iHashCode6 + iHash3;
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
        int iHashCode7 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.f55424s;
        int iHash15 = iHashCode7 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.f55425t.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash16 = iHash15 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f55429x.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash18 = iHash17 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0) + this.f55431z.hashCode();
        Expression<String> expressionF = f();
        int iHashCode8 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.C.hashCode() + this.D.hashCode();
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
        int i14 = iHashCode9 + iHash6;
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
        int iHash19 = i15 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash21 = iHash20 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode10 = iHash22 + (listL != null ? listL.hashCode() : 0);
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
        int i16 = iHashCode10 + iHash8;
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
        int iHashCode11 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash23 = iHashCode11 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash24);
        return iHash24;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f55427v;
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
        return this.f55421p;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55410e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55412g;
    }

    @NotNull
    public final DivGallery y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<CrossContentAlignment> expression6, @Nullable Expression<Long> expression7, @NotNull Expression<Long> expression8, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull Expression<Long> expression9, @Nullable List<? extends Div> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression10, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Boolean> expression11, @Nullable Expression<String> expression12, @Nullable Expression<Long> expression13, @NotNull Expression<ScrollMode> expression14, @NotNull Expression<Scrollbar> expression15, @Nullable List<DivAction> list7, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression16, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivGallery(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, expression5, expression6, expression7, expression8, list3, list4, divFocus, list5, divSize, str, divCollectionItemBuilder, expression9, list6, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, expression11, expression12, expression13, expression14, expression15, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression16, divVisibilityAction, list12, divSize2);
    }
}
