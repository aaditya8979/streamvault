package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivContainer implements JSONSerializable, Hashable, ah.e2 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final a f54837e0 = new a(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f54838f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f54839g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54840h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54841i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContentAlignmentHorizontal> f54842j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContentAlignmentVertical> f54843k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f54844l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54845m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final Expression<LayoutMode> f54846n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54847o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Expression<Orientation> f54848p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f54849q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f54850r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivContainer> f54851s0;

    @NotNull
    public final Expression<Long> A;

    @Nullable
    public final List<Div> B;

    @NotNull
    public final Expression<LayoutMode> C;

    @Nullable
    public final DivLayoutProvider D;

    @Nullable
    public final Separator E;

    @NotNull
    public final Expression<Long> F;

    @Nullable
    public final List<DivAction> G;

    @Nullable
    public final DivEdgeInsets H;

    @NotNull
    public final Expression<Orientation> I;

    @Nullable
    public final DivEdgeInsets J;

    @Nullable
    public final List<DivAction> K;

    @Nullable
    public final List<DivAction> L;

    @Nullable
    public final Expression<String> M;

    @Nullable
    public final Expression<Long> N;

    @Nullable
    public final List<DivAction> O;

    @Nullable
    public final Separator P;

    @Nullable
    public final List<DivTooltip> Q;

    @Nullable
    public final DivTransform R;

    @Nullable
    public final DivChangeTransition S;

    @Nullable
    public final DivAppearanceTransition T;

    @Nullable
    public final DivAppearanceTransition U;

    @Nullable
    public final List<DivTransitionTrigger> V;

    @Nullable
    public final List<DivTrigger> W;

    @Nullable
    public final List<DivVariable> X;

    @NotNull
    public final Expression<DivVisibility> Y;

    @Nullable
    public final DivVisibilityAction Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f54852a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public final List<DivVisibilityAction> f54853a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f54854b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final DivSize f54855b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f54856c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public Integer f54857c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54858d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public Integer f54859d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f54860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f54861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f54862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f54863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivAspect f54864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f54865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivBorder f54866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f54869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Expression<DivContentAlignmentHorizontal> f54870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Expression<DivContentAlignmentVertical> f54871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f54872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f54874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivFocus f54875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f54876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final DivSize f54877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final String f54880y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivCollectionItemBuilder f54881z;

    /* JADX INFO: compiled from: DivContainer.kt */
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<LayoutMode, String> TO_STRING = new sn.l<LayoutMode, String>() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivContainer.LayoutMode layoutMode) {
                return DivContainer.LayoutMode.Converter.b(layoutMode);
            }
        };

        @NotNull
        public static final sn.l<String, LayoutMode> FROM_STRING = new sn.l<String, LayoutMode>() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivContainer.LayoutMode invoke(@NotNull String str) {
                return DivContainer.LayoutMode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivContainer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final LayoutMode a(@NotNull String str) {
                LayoutMode layoutMode = LayoutMode.NO_WRAP;
                if (tn.p.f(str, layoutMode.value)) {
                    return layoutMode;
                }
                LayoutMode layoutMode2 = LayoutMode.WRAP;
                if (tn.p.f(str, layoutMode2.value)) {
                    return layoutMode2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull LayoutMode layoutMode) {
                return layoutMode.value;
            }
        }

        LayoutMode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivContainer.kt */
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Orientation, String> TO_STRING = new sn.l<Orientation, String>() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivContainer.Orientation orientation) {
                return DivContainer.Orientation.Converter.b(orientation);
            }
        };

        @NotNull
        public static final sn.l<String, Orientation> FROM_STRING = new sn.l<String, Orientation>() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivContainer.Orientation invoke(@NotNull String str) {
                return DivContainer.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivContainer.kt */
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
                Orientation orientation3 = Orientation.OVERLAP;
                if (tn.p.f(str, orientation3.value)) {
                    return orientation3;
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

    /* JADX INFO: compiled from: DivContainer.kt */
    public static final class Separator implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f54884g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54886i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Separator> f54888k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final DivEdgeInsets f54889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Boolean> f54890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Expression<Boolean> f54891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Expression<Boolean> f54892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivDrawable f54893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Integer f54894f;

        /* JADX INFO: compiled from: DivContainer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Separator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().p2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            f54885h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f54886i = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f54887j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f54888k = new sn.p<ParsingEnvironment, JSONObject, Separator>() { // from class: com.yandex.div2.DivContainer$Separator$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivContainer.Separator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivContainer.Separator.f54884g.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public Separator(@Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Boolean> expression, @NotNull Expression<Boolean> expression2, @NotNull Expression<Boolean> expression3, @NotNull DivDrawable divDrawable) {
            this.f54889a = divEdgeInsets;
            this.f54890b = expression;
            this.f54891c = expression2;
            this.f54892d = expression3;
            this.f54893e = divDrawable;
        }

        public final boolean a(@Nullable Separator separator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (separator == null) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.f54889a;
            return (divEdgeInsets != null ? divEdgeInsets.a(separator.f54889a, expressionResolver, expressionResolver2) : separator.f54889a == null) && this.f54890b.evaluate(expressionResolver).booleanValue() == separator.f54890b.evaluate(expressionResolver2).booleanValue() && this.f54891c.evaluate(expressionResolver).booleanValue() == separator.f54891c.evaluate(expressionResolver2).booleanValue() && this.f54892d.evaluate(expressionResolver).booleanValue() == separator.f54892d.evaluate(expressionResolver2).booleanValue() && this.f54893e.a(separator.f54893e, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f54894f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Separator.class).hashCode();
            DivEdgeInsets divEdgeInsets = this.f54889a;
            int iHash = iHashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0) + this.f54890b.hashCode() + this.f54891c.hashCode() + this.f54892d.hashCode() + this.f54893e.hash();
            this.f54894f = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().p2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivContainer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivContainer a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().m2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f54838f0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f54839g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f54840h0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f54841i0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f54842j0 = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        f54843k0 = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        f54844l0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f54845m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54846n0 = Expression.Companion.constant$default(companion, LayoutMode.NO_WRAP, null, 2, null);
        f54847o0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54848p0 = Expression.Companion.constant$default(companion, Orientation.VERTICAL, null, 2, null);
        f54849q0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f54850r0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        f54851s0 = new sn.p<ParsingEnvironment, JSONObject, DivContainer>() { // from class: com.yandex.div2.DivContainer$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivContainer mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivContainer.f54837e0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivContainer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivContainer(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @NotNull Expression<DivContentAlignmentHorizontal> expression7, @NotNull Expression<DivContentAlignmentVertical> expression8, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull Expression<Long> expression9, @Nullable List<? extends Div> list10, @NotNull Expression<LayoutMode> expression10, @Nullable DivLayoutProvider divLayoutProvider, @Nullable Separator separator, @NotNull Expression<Long> expression11, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression12, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable Expression<String> expression13, @Nullable Expression<Long> expression14, @Nullable List<DivAction> list14, @Nullable Separator separator2, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression15, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        this.f54852a = divAccessibility;
        this.f54854b = divAction;
        this.f54856c = divAnimation;
        this.f54858d = list;
        this.f54860e = expression;
        this.f54861f = expression2;
        this.f54862g = expression3;
        this.f54863h = list2;
        this.f54864i = divAspect;
        this.f54865j = list3;
        this.f54866k = divBorder;
        this.f54867l = expression4;
        this.f54868m = expression5;
        this.f54869n = expression6;
        this.f54870o = expression7;
        this.f54871p = expression8;
        this.f54872q = list4;
        this.f54873r = list5;
        this.f54874s = list6;
        this.f54875t = divFocus;
        this.f54876u = list7;
        this.f54877v = divSize;
        this.f54878w = list8;
        this.f54879x = list9;
        this.f54880y = str;
        this.f54881z = divCollectionItemBuilder;
        this.A = expression9;
        this.B = list10;
        this.C = expression10;
        this.D = divLayoutProvider;
        this.E = separator;
        this.F = expression11;
        this.G = list11;
        this.H = divEdgeInsets;
        this.I = expression12;
        this.J = divEdgeInsets2;
        this.K = list12;
        this.L = list13;
        this.M = expression13;
        this.N = expression14;
        this.O = list14;
        this.P = separator2;
        this.Q = list15;
        this.R = divTransform;
        this.S = divChangeTransition;
        this.T = divAppearanceTransition;
        this.U = divAppearanceTransition2;
        this.V = list16;
        this.W = list17;
        this.X = list18;
        this.Y = expression15;
        this.Z = divVisibilityAction;
        this.f54853a0 = list19;
        this.f54855b0 = divSize2;
    }

    public /* synthetic */ DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : divAction, (i10 & 4) != 0 ? f54838f0 : divAnimation, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : expression, (i10 & 32) != 0 ? null : expression2, (i10 & 64) != 0 ? f54839g0 : expression3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : divAspect, (i10 & 512) != 0 ? null : list3, (i10 & 1024) != 0 ? null : divBorder, (i10 & 2048) != 0 ? f54840h0 : expression4, (i10 & 4096) != 0 ? f54841i0 : expression5, (i10 & 8192) != 0 ? null : expression6, (i10 & 16384) != 0 ? f54842j0 : expression7, (i10 & 32768) != 0 ? f54843k0 : expression8, (i10 & 65536) != 0 ? null : list4, (i10 & 131072) != 0 ? null : list5, (i10 & 262144) != 0 ? null : list6, (i10 & 524288) != 0 ? null : divFocus, (i10 & 1048576) != 0 ? null : list7, (i10 & 2097152) != 0 ? f54844l0 : divSize, (i10 & 4194304) != 0 ? null : list8, (i10 & 8388608) != 0 ? null : list9, (i10 & 16777216) != 0 ? null : str, (i10 & 33554432) != 0 ? null : divCollectionItemBuilder, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? f54845m0 : expression9, (i10 & 134217728) != 0 ? null : list10, (i10 & 268435456) != 0 ? f54846n0 : expression10, (i10 & 536870912) != 0 ? null : divLayoutProvider, (i10 & 1073741824) != 0 ? null : separator, (i10 & Integer.MIN_VALUE) != 0 ? f54847o0 : expression11, (i11 & 1) != 0 ? null : list11, (i11 & 2) != 0 ? null : divEdgeInsets, (i11 & 4) != 0 ? f54848p0 : expression12, (i11 & 8) != 0 ? null : divEdgeInsets2, (i11 & 16) != 0 ? null : list12, (i11 & 32) != 0 ? null : list13, (i11 & 64) != 0 ? null : expression13, (i11 & 128) != 0 ? null : expression14, (i11 & 256) != 0 ? null : list14, (i11 & 512) != 0 ? null : separator2, (i11 & 1024) != 0 ? null : list15, (i11 & 2048) != 0 ? null : divTransform, (i11 & 4096) != 0 ? null : divChangeTransition, (i11 & 8192) != 0 ? null : divAppearanceTransition, (i11 & 16384) != 0 ? null : divAppearanceTransition2, (i11 & 32768) != 0 ? null : list16, (i11 & 65536) != 0 ? null : list17, (i11 & 131072) != 0 ? null : list18, (i11 & 262144) != 0 ? f54849q0 : expression15, (i11 & 524288) != 0 ? null : divVisibilityAction, (i11 & 1048576) != 0 ? null : list19, (i11 & 2097152) != 0 ? f54850r0 : divSize2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivContainer z(DivContainer divContainer, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divContainer.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divContainer.f54854b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divContainer.f54856c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divContainer.f54858d : list;
        Expression expressionG = (i10 & 16) != 0 ? divContainer.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divContainer.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divContainer.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divContainer.w() : list2;
        DivAspect divAspect2 = (i10 & 256) != 0 ? divContainer.f54864i : divAspect;
        List background = (i10 & 512) != 0 ? divContainer.getBackground() : list3;
        DivBorder divBorderX = (i10 & 1024) != 0 ? divContainer.x() : divBorder;
        Expression expression16 = (i10 & 2048) != 0 ? divContainer.f54867l : expression4;
        Expression expression17 = (i10 & 4096) != 0 ? divContainer.f54868m : expression5;
        Expression expressionB = (i10 & 8192) != 0 ? divContainer.b() : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? divContainer.f54870o : expression7;
        Expression expression19 = (i10 & 32768) != 0 ? divContainer.f54871p : expression8;
        List listK = (i10 & 65536) != 0 ? divContainer.k() : list4;
        Expression expression20 = expression19;
        List list21 = (i10 & 131072) != 0 ? divContainer.f54873r : list5;
        List extensions = (i10 & 262144) != 0 ? divContainer.getExtensions() : list6;
        DivFocus divFocusN = (i10 & 524288) != 0 ? divContainer.n() : divFocus;
        List listU = (i10 & 1048576) != 0 ? divContainer.u() : list7;
        DivSize height = (i10 & 2097152) != 0 ? divContainer.getHeight() : divSize;
        List list22 = list21;
        List list23 = (i10 & 4194304) != 0 ? divContainer.f54878w : list8;
        List list24 = (i10 & 8388608) != 0 ? divContainer.f54879x : list9;
        String id2 = (i10 & 16777216) != 0 ? divContainer.getId() : str;
        List list25 = list24;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 33554432) != 0 ? divContainer.f54881z : divCollectionItemBuilder;
        Expression expression21 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divContainer.A : expression9;
        List list26 = (i10 & 134217728) != 0 ? divContainer.B : list10;
        Expression expression22 = (i10 & 268435456) != 0 ? divContainer.C : expression10;
        DivLayoutProvider divLayoutProviderR = (i10 & 536870912) != 0 ? divContainer.r() : divLayoutProvider;
        Expression expression23 = expression22;
        Separator separator3 = (i10 & 1073741824) != 0 ? divContainer.E : separator;
        Expression expression24 = (i10 & Integer.MIN_VALUE) != 0 ? divContainer.F : expression11;
        List list27 = (i11 & 1) != 0 ? divContainer.G : list11;
        DivEdgeInsets divEdgeInsetsD = (i11 & 2) != 0 ? divContainer.d() : divEdgeInsets;
        List list28 = list27;
        Expression expression25 = (i11 & 4) != 0 ? divContainer.I : expression12;
        return divContainer.y(divAccessibilityO, divAction2, divAnimation2, list20, expressionG, expressionM, alpha, listW, divAspect2, background, divBorderX, expression16, expression17, expressionB, expression18, expression20, listK, list22, extensions, divFocusN, listU, height, list23, list25, id2, divCollectionItemBuilder2, expression21, list26, expression23, divLayoutProviderR, separator3, expression24, list28, divEdgeInsetsD, expression25, (i11 & 8) != 0 ? divContainer.p() : divEdgeInsets2, (i11 & 16) != 0 ? divContainer.K : list12, (i11 & 32) != 0 ? divContainer.L : list13, (i11 & 64) != 0 ? divContainer.f() : expression13, (i11 & 128) != 0 ? divContainer.e() : expression14, (i11 & 256) != 0 ? divContainer.q() : list14, (i11 & 512) != 0 ? divContainer.P : separator2, (i11 & 1024) != 0 ? divContainer.h() : list15, (i11 & 2048) != 0 ? divContainer.getTransform() : divTransform, (i11 & 4096) != 0 ? divContainer.j() : divChangeTransition, (i11 & 8192) != 0 ? divContainer.v() : divAppearanceTransition, (i11 & 16384) != 0 ? divContainer.i() : divAppearanceTransition2, (i11 & 32768) != 0 ? divContainer.l() : list16, (i11 & 65536) != 0 ? divContainer.s() : list17, (i11 & 131072) != 0 ? divContainer.c() : list18, (i11 & 262144) != 0 ? divContainer.getVisibility() : expression15, (i11 & 524288) != 0 ? divContainer.t() : divVisibilityAction, (i11 & 1048576) != 0 ? divContainer.a() : list19, (i11 & 2097152) != 0 ? divContainer.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivContainer divContainer, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divContainer == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divContainer.o(), expressionResolver, expressionResolver2) : divContainer.o() == null)) {
            return false;
        }
        DivAction divAction = this.f54854b;
        if (!(divAction != null ? divAction.a(divContainer.f54854b, expressionResolver, expressionResolver2) : divContainer.f54854b == null) || !this.f54856c.a(divContainer.f54856c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f54858d;
        if (list != null) {
            List<DivAction> list2 = divContainer.f54858d;
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
        if (divContainer.f54858d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divContainer.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divContainer.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divContainer.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divContainer.w();
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
        if (divContainer.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivAspect divAspect = this.f54864i;
        if (!(divAspect != null ? divAspect.a(divContainer.f54864i, expressionResolver, expressionResolver2) : divContainer.f54864i == null)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divContainer.getBackground();
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
        if (divContainer.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divContainer.x(), expressionResolver, expressionResolver2) : divContainer.x() == null) || this.f54867l.evaluate(expressionResolver).booleanValue() != divContainer.f54867l.evaluate(expressionResolver2).booleanValue() || this.f54868m.evaluate(expressionResolver).booleanValue() != divContainer.f54868m.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divContainer.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f54870o.evaluate(expressionResolver) != divContainer.f54870o.evaluate(expressionResolver2) || this.f54871p.evaluate(expressionResolver) != divContainer.f54871p.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divContainer.k();
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
        if (divContainer.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f54873r;
        if (list3 != null) {
            List<DivAction> list4 = divContainer.f54873r;
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
        if (divContainer.f54873r != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divContainer.getExtensions();
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
        if (divContainer.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divContainer.n(), expressionResolver, expressionResolver2) : divContainer.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divContainer.u();
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
        if (divContainer.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !getHeight().a(divContainer.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f54878w;
        if (list5 != null) {
            List<DivAction> list6 = divContainer.f54878w;
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
        if (divContainer.f54878w != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f54879x;
        if (list7 != null) {
            List<DivAction> list8 = divContainer.f54879x;
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
        if (divContainer.f54879x != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(getId(), divContainer.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f54881z;
        if (!(divCollectionItemBuilder != null ? divCollectionItemBuilder.a(divContainer.f54881z, expressionResolver, expressionResolver2) : divContainer.f54881z == null) || this.A.evaluate(expressionResolver).longValue() != divContainer.A.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<Div> list9 = this.B;
        if (list9 != null) {
            List<Div> list10 = divContainer.B;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i28 = 0;
                    for (Object obj10 : list9) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((Div) obj10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
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
        if (divContainer.B != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19 || this.C.evaluate(expressionResolver) != divContainer.C.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divContainer.r(), expressionResolver, expressionResolver2) : divContainer.r() == null)) {
            return false;
        }
        Separator separator = this.E;
        if (!(separator != null ? separator.a(divContainer.E, expressionResolver, expressionResolver2) : divContainer.E == null) || this.F.evaluate(expressionResolver).longValue() != divContainer.F.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> list11 = this.G;
        if (list11 != null) {
            List<DivAction> list12 = divContainer.G;
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
        if (divContainer.G != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divContainer.d(), expressionResolver, expressionResolver2) : divContainer.d() == null) || this.I.evaluate(expressionResolver) != divContainer.I.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divContainer.p(), expressionResolver, expressionResolver2) : divContainer.p() == null)) {
            return false;
        }
        List<DivAction> list13 = this.K;
        if (list13 != null) {
            List<DivAction> list14 = divContainer.K;
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
        if (divContainer.K != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.L;
        if (list15 != null) {
            List<DivAction> list16 = divContainer.L;
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
        if (divContainer.L != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divContainer.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divContainer.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divContainer.q();
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
        if (divContainer.q() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        Separator separator2 = this.P;
        if (!(separator2 != null ? separator2.a(divContainer.P, expressionResolver, expressionResolver2) : divContainer.P == null)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divContainer.h();
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
        if (divContainer.h() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divContainer.getTransform(), expressionResolver, expressionResolver2) : divContainer.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divContainer.j(), expressionResolver, expressionResolver2) : divContainer.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divContainer.v(), expressionResolver, expressionResolver2) : divContainer.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divContainer.i(), expressionResolver, expressionResolver2) : divContainer.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divContainer.l();
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
        if (divContainer.l() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divContainer.s();
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
        if (divContainer.s() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divContainer.c();
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
        if (divContainer.c() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        if (!z27 || getVisibility().evaluate(expressionResolver) != divContainer.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divContainer.t(), expressionResolver, expressionResolver2) : divContainer.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divContainer.a();
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
        if (divContainer.a() != null) {
            z28 = false;
            break;
        }
        z28 = true;
        return z28 && getWidth().a(divContainer.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.f54853a0;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f54869n;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.X;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.H;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f54860e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f54862g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f54865j;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f54874s;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f54877v;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f54880y;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.R;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.Y;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.f54855b0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.Q;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54859d0;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.B;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.f54859d0 = Integer.valueOf(i10);
        return i10;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.U;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f54872q;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.V;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f54861f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f54875t;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f54852a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.J;
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
        Integer num = this.f54857c0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivContainer.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f54854b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f54856c.hash();
        List<DivAction> list = this.f54858d;
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
        DivAspect divAspect = this.f54864i;
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
        int iHash21 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f54867l.hashCode() + this.f54868m.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f54870o.hashCode() + this.f54871p.hashCode();
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
        List<DivAction> list2 = this.f54873r;
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
        List<DivAction> list3 = this.f54878w;
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
        List<DivAction> list4 = this.f54879x;
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
        DivCollectionItemBuilder divCollectionItemBuilder = this.f54881z;
        int iHash24 = iHashCode5 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.A.hashCode() + this.C.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash25 = iHash24 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        Separator separator = this.E;
        int iHash26 = iHash25 + (separator != null ? separator.hash() : 0) + this.F.hashCode();
        List<DivAction> list5 = this.G;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash26 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.I.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash28 = iHash27 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<DivAction> list6 = this.K;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash28 + iHash11;
        List<DivAction> list7 = this.L;
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
        Separator separator2 = this.P;
        int iHash29 = i21 + (separator2 != null ? separator2.hash() : 0);
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
        int i22 = iHash29 + iHash14;
        DivTransform transform = getTransform();
        int iHash30 = i22 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash31 = iHash30 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash32 = iHash31 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash33 = iHash32 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode8 = iHash33 + (listL != null ? listL.hashCode() : 0);
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
        int iHash34 = iHashCode9 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash35 = iHash34 + iHash17 + getWidth().hash();
        this.f54857c0 = Integer.valueOf(iHash35);
        return iHash35;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.D;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.W;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.Z;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f54876u;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f54863h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f54866k;
    }

    @NotNull
    public final DivContainer y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression4, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @NotNull Expression<DivContentAlignmentHorizontal> expression7, @NotNull Expression<DivContentAlignmentVertical> expression8, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull Expression<Long> expression9, @Nullable List<? extends Div> list10, @NotNull Expression<LayoutMode> expression10, @Nullable DivLayoutProvider divLayoutProvider, @Nullable Separator separator, @NotNull Expression<Long> expression11, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Orientation> expression12, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable Expression<String> expression13, @Nullable Expression<Long> expression14, @Nullable List<DivAction> list14, @Nullable Separator separator2, @Nullable List<DivTooltip> list15, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list16, @Nullable List<DivTrigger> list17, @Nullable List<? extends DivVariable> list18, @NotNull Expression<DivVisibility> expression15, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list19, @NotNull DivSize divSize2) {
        return new DivContainer(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divCollectionItemBuilder, expression9, list10, expression10, divLayoutProvider, separator, expression11, list11, divEdgeInsets, expression12, divEdgeInsets2, list12, list13, expression13, expression14, list14, separator2, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression15, divVisibilityAction, list19, divSize2);
    }
}
