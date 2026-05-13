package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTabs implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a T = new a(null);

    @NotNull
    public static final Expression<Double> U;

    @NotNull
    public static final Expression<Boolean> V;

    @NotNull
    public static final Expression<Boolean> W;

    @NotNull
    public static final DivSize.d X;

    @NotNull
    public static final Expression<Boolean> Y;

    @NotNull
    public static final Expression<Long> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f57386a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final DivEdgeInsets f57387b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57388c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivEdgeInsets f57389d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57390e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57391f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTabs> f57392g0;

    @NotNull
    public final DivEdgeInsets A;

    @NotNull
    public final Expression<Boolean> B;

    @Nullable
    public final TabTitleDelimiter C;

    @Nullable
    public final TabTitleStyle D;

    @NotNull
    public final DivEdgeInsets E;

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
    public final DivAccessibility f57393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f57394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f57395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f57397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f57398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f57399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f57401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f57403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final DivFocus f57404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f57405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final DivSize f57407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f57408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final List<Item> f57409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f57410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f57418z;

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class Item implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f57419e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Item> f57420f = new sn.p<ParsingEnvironment, JSONObject, Item>() { // from class: com.yandex.div2.DivTabs$Item$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabs.Item mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTabs.Item.f57419e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Div f57421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<String> f57422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final DivAction f57423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f57424d;

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Item a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().R7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Item(@NotNull Div div, @NotNull Expression<String> expression, @Nullable DivAction divAction) {
            this.f57421a = div;
            this.f57422b = expression;
            this.f57423c = divAction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item b(Item item, Div div, Expression expression, DivAction divAction, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                div = item.f57421a;
            }
            if ((i10 & 2) != 0) {
                expression = item.f57422b;
            }
            if ((i10 & 4) != 0) {
                divAction = item.f57423c;
            }
            return item.a(div, expression, divAction);
        }

        @NotNull
        public final Item a(@NotNull Div div, @NotNull Expression<String> expression, @Nullable DivAction divAction) {
            return new Item(div, expression, divAction);
        }

        public final boolean c(@Nullable Item item, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (item == null || !this.f57421a.a(item.f57421a, expressionResolver, expressionResolver2) || !tn.p.f(this.f57422b.evaluate(expressionResolver), item.f57422b.evaluate(expressionResolver2))) {
                return false;
            }
            DivAction divAction = this.f57423c;
            DivAction divAction2 = item.f57423c;
            return divAction != null ? divAction.a(divAction2, expressionResolver, expressionResolver2) : divAction2 == null;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57424d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Item.class).hashCode() + this.f57421a.hash() + this.f57422b.hashCode();
            DivAction divAction = this.f57423c;
            int iHash = iHashCode + (divAction != null ? divAction.hash() : 0);
            this.f57424d = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().R7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class TabTitleDelimiter implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f57425e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TabTitleDelimiter> f57428h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f57429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Uri> f57430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f57431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f57432d;

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final TabTitleDelimiter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().X7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            int i10 = 1;
            f57426f = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f57427g = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f57428h = new sn.p<ParsingEnvironment, JSONObject, TabTitleDelimiter>() { // from class: com.yandex.div2.DivTabs$TabTitleDelimiter$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabs.TabTitleDelimiter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivTabs.TabTitleDelimiter.f57425e.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public TabTitleDelimiter(@NotNull DivFixedSize divFixedSize, @NotNull Expression<Uri> expression, @NotNull DivFixedSize divFixedSize2) {
            this.f57429a = divFixedSize;
            this.f57430b = expression;
            this.f57431c = divFixedSize2;
        }

        public final boolean a(@Nullable TabTitleDelimiter tabTitleDelimiter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            return tabTitleDelimiter != null && this.f57429a.a(tabTitleDelimiter.f57429a, expressionResolver, expressionResolver2) && tn.p.f(this.f57430b.evaluate(expressionResolver), tabTitleDelimiter.f57430b.evaluate(expressionResolver2)) && this.f57431c.a(tabTitleDelimiter.f57431c, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57432d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(TabTitleDelimiter.class).hashCode() + this.f57429a.hash() + this.f57430b.hashCode() + this.f57431c.hash();
            this.f57432d = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().X7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class TabTitleStyle implements JSONSerializable, Hashable {

        @NotNull
        public static final Expression<Long> A;

        @NotNull
        public static final Expression<DivSizeUnit> B;

        @NotNull
        public static final Expression<DivFontWeight> C;

        @NotNull
        public static final Expression<Integer> D;

        @NotNull
        public static final Expression<Long> E;

        @NotNull
        public static final Expression<Double> F;

        @NotNull
        public static final DivEdgeInsets G;

        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TabTitleStyle> H;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public static final a f57433v = new a(null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57434w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57435x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57436y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NotNull
        public static final Expression<AnimationType> f57437z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f57438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Expression<JSONObject> f57439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Expression<DivFontWeight> f57440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f57441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Expression<AnimationType> f57443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final DivCornersRadius f57445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Expression<String> f57446i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57447j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Expression<DivSizeUnit> f57448k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final Expression<DivFontWeight> f57449l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final Expression<Integer> f57450m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final Expression<JSONObject> f57451n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final Expression<DivFontWeight> f57452o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f57453p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57454q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final Expression<Double> f57455r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57456s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final DivEdgeInsets f57457t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public Integer f57458u;

        /* JADX INFO: compiled from: DivTabs.kt */
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            @NotNull
            private final String value;

            @NotNull
            public static final a Converter = new a(null);

            @NotNull
            public static final sn.l<AnimationType, String> TO_STRING = new sn.l<AnimationType, String>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$TO_STRING$1
                @Override // sn.l
                @NotNull
                public final String invoke(@NotNull DivTabs.TabTitleStyle.AnimationType animationType) {
                    return DivTabs.TabTitleStyle.AnimationType.Converter.b(animationType);
                }
            };

            @NotNull
            public static final sn.l<String, AnimationType> FROM_STRING = new sn.l<String, AnimationType>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$FROM_STRING$1
                @Override // sn.l
                @Nullable
                public final DivTabs.TabTitleStyle.AnimationType invoke(@NotNull String str) {
                    return DivTabs.TabTitleStyle.AnimationType.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivTabs.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @Nullable
                public final AnimationType a(@NotNull String str) {
                    AnimationType animationType = AnimationType.SLIDE;
                    if (tn.p.f(str, animationType.value)) {
                        return animationType;
                    }
                    AnimationType animationType2 = AnimationType.FADE;
                    if (tn.p.f(str, animationType2.value)) {
                        return animationType2;
                    }
                    AnimationType animationType3 = AnimationType.NONE;
                    if (tn.p.f(str, animationType3.value)) {
                        return animationType3;
                    }
                    return null;
                }

                @NotNull
                public final String b(@NotNull AnimationType animationType) {
                    return animationType.value;
                }
            }

            AnimationType(String str) {
                this.value = str;
            }
        }

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final TabTitleStyle a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().a8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57434w = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f57435x = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f57436y = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f57437z = Expression.Companion.constant$default(companion, AnimationType.SLIDE, null, 2, null);
            A = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            B = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            C = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            D = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            E = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            F = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            G = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            H = new sn.p<ParsingEnvironment, JSONObject, TabTitleStyle>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabs.TabTitleStyle mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivTabs.TabTitleStyle.f57433v.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public TabTitleStyle() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }

        public TabTitleStyle(@NotNull Expression<Integer> expression, @Nullable Expression<JSONObject> expression2, @Nullable Expression<DivFontWeight> expression3, @NotNull Expression<Integer> expression4, @NotNull Expression<Long> expression5, @NotNull Expression<AnimationType> expression6, @Nullable Expression<Long> expression7, @Nullable DivCornersRadius divCornersRadius, @Nullable Expression<String> expression8, @NotNull Expression<Long> expression9, @NotNull Expression<DivSizeUnit> expression10, @NotNull Expression<DivFontWeight> expression11, @Nullable Expression<Integer> expression12, @Nullable Expression<JSONObject> expression13, @Nullable Expression<DivFontWeight> expression14, @NotNull Expression<Integer> expression15, @NotNull Expression<Long> expression16, @NotNull Expression<Double> expression17, @Nullable Expression<Long> expression18, @NotNull DivEdgeInsets divEdgeInsets) {
            this.f57438a = expression;
            this.f57439b = expression2;
            this.f57440c = expression3;
            this.f57441d = expression4;
            this.f57442e = expression5;
            this.f57443f = expression6;
            this.f57444g = expression7;
            this.f57445h = divCornersRadius;
            this.f57446i = expression8;
            this.f57447j = expression9;
            this.f57448k = expression10;
            this.f57449l = expression11;
            this.f57450m = expression12;
            this.f57451n = expression13;
            this.f57452o = expression14;
            this.f57453p = expression15;
            this.f57454q = expression16;
            this.f57455r = expression17;
            this.f57456s = expression18;
            this.f57457t = divEdgeInsets;
        }

        public /* synthetic */ TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivCornersRadius divCornersRadius, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? f57434w : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? f57435x : expression4, (i10 & 16) != 0 ? f57436y : expression5, (i10 & 32) != 0 ? f57437z : expression6, (i10 & 64) != 0 ? null : expression7, (i10 & 128) != 0 ? null : divCornersRadius, (i10 & 256) != 0 ? null : expression8, (i10 & 512) != 0 ? A : expression9, (i10 & 1024) != 0 ? B : expression10, (i10 & 2048) != 0 ? C : expression11, (i10 & 4096) != 0 ? null : expression12, (i10 & 8192) != 0 ? null : expression13, (i10 & 16384) != 0 ? null : expression14, (i10 & 32768) != 0 ? D : expression15, (i10 & 65536) != 0 ? E : expression16, (i10 & 131072) != 0 ? F : expression17, (i10 & 262144) != 0 ? null : expression18, (i10 & 524288) != 0 ? G : divEdgeInsets);
        }

        public final boolean a(@Nullable TabTitleStyle tabTitleStyle, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (tabTitleStyle == null || this.f57438a.evaluate(expressionResolver).intValue() != tabTitleStyle.f57438a.evaluate(expressionResolver2).intValue()) {
                return false;
            }
            Expression<JSONObject> expression = this.f57439b;
            JSONObject jSONObjectEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression2 = tabTitleStyle.f57439b;
            if (!tn.p.f(jSONObjectEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression3 = this.f57440c;
            DivFontWeight divFontWeightEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression4 = tabTitleStyle.f57440c;
            if (divFontWeightEvaluate != (expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.f57441d.evaluate(expressionResolver).intValue() != tabTitleStyle.f57441d.evaluate(expressionResolver2).intValue() || this.f57442e.evaluate(expressionResolver).longValue() != tabTitleStyle.f57442e.evaluate(expressionResolver2).longValue() || this.f57443f.evaluate(expressionResolver) != tabTitleStyle.f57443f.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<Long> expression5 = this.f57444g;
            Long lEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<Long> expression6 = tabTitleStyle.f57444g;
            if (!tn.p.f(lEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivCornersRadius divCornersRadius = this.f57445h;
            if (!(divCornersRadius != null ? divCornersRadius.a(tabTitleStyle.f57445h, expressionResolver, expressionResolver2) : tabTitleStyle.f57445h == null)) {
                return false;
            }
            Expression<String> expression7 = this.f57446i;
            String strEvaluate = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = tabTitleStyle.f57446i;
            if (!tn.p.f(strEvaluate, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.f57447j.evaluate(expressionResolver).longValue() != tabTitleStyle.f57447j.evaluate(expressionResolver2).longValue() || this.f57448k.evaluate(expressionResolver) != tabTitleStyle.f57448k.evaluate(expressionResolver2) || this.f57449l.evaluate(expressionResolver) != tabTitleStyle.f57449l.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<Integer> expression9 = this.f57450m;
            Integer numEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Integer> expression10 = tabTitleStyle.f57450m;
            if (!tn.p.f(numEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<JSONObject> expression11 = this.f57451n;
            JSONObject jSONObjectEvaluate2 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression12 = tabTitleStyle.f57451n;
            if (!tn.p.f(jSONObjectEvaluate2, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression13 = this.f57452o;
            DivFontWeight divFontWeightEvaluate2 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression14 = tabTitleStyle.f57452o;
            if (divFontWeightEvaluate2 != (expression14 != null ? expression14.evaluate(expressionResolver2) : null) || this.f57453p.evaluate(expressionResolver).intValue() != tabTitleStyle.f57453p.evaluate(expressionResolver2).intValue() || this.f57454q.evaluate(expressionResolver).longValue() != tabTitleStyle.f57454q.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            if (!(this.f57455r.evaluate(expressionResolver).doubleValue() == tabTitleStyle.f57455r.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            Expression<Long> expression15 = this.f57456s;
            Long lEvaluate2 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
            Expression<Long> expression16 = tabTitleStyle.f57456s;
            return tn.p.f(lEvaluate2, expression16 != null ? expression16.evaluate(expressionResolver2) : null) && this.f57457t.a(tabTitleStyle.f57457t, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57458u;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(TabTitleStyle.class).hashCode() + this.f57438a.hashCode();
            Expression<JSONObject> expression = this.f57439b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression<DivFontWeight> expression2 = this.f57440c;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f57441d.hashCode() + this.f57442e.hashCode() + this.f57443f.hashCode();
            Expression<Long> expression3 = this.f57444g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            DivCornersRadius divCornersRadius = this.f57445h;
            int iHash = iHashCode4 + (divCornersRadius != null ? divCornersRadius.hash() : 0);
            Expression<String> expression4 = this.f57446i;
            int iHashCode5 = iHash + (expression4 != null ? expression4.hashCode() : 0) + this.f57447j.hashCode() + this.f57448k.hashCode() + this.f57449l.hashCode();
            Expression<Integer> expression5 = this.f57450m;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression<JSONObject> expression6 = this.f57451n;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.f57452o;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0) + this.f57453p.hashCode() + this.f57454q.hashCode() + this.f57455r.hashCode();
            Expression<Long> expression8 = this.f57456s;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0) + this.f57457t.hash();
            this.f57458u = Integer.valueOf(iHashCode9);
            return iHashCode9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().a8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTabs a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        V = Expression.Companion.constant$default(companion, bool, null, 2, null);
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57386a0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression expression = null;
        Expression expression2 = null;
        int i10 = 82;
        tn.i iVar = null;
        f57387b0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f57388c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57389d0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f57390e0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57391f0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f57392g0 = new sn.p<ParsingEnvironment, JSONObject, DivTabs>() { // from class: com.yandex.div2.DivTabs$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabs mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTabs.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTabs(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @NotNull Expression<Boolean> expression5, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull Expression<Boolean> expression6, @NotNull DivSize divSize, @Nullable String str, @NotNull List<Item> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Boolean> expression7, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable List<DivAction> list7, @NotNull Expression<Long> expression10, @NotNull Expression<Integer> expression11, @NotNull DivEdgeInsets divEdgeInsets3, @NotNull Expression<Boolean> expression12, @Nullable TabTitleDelimiter tabTitleDelimiter, @Nullable TabTitleStyle tabTitleStyle, @NotNull DivEdgeInsets divEdgeInsets4, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f57393a = divAccessibility;
        this.f57394b = expression;
        this.f57395c = expression2;
        this.f57396d = expression3;
        this.f57397e = list;
        this.f57398f = list2;
        this.f57399g = divBorder;
        this.f57400h = expression4;
        this.f57401i = list3;
        this.f57402j = expression5;
        this.f57403k = list4;
        this.f57404l = divFocus;
        this.f57405m = list5;
        this.f57406n = expression6;
        this.f57407o = divSize;
        this.f57408p = str;
        this.f57409q = list6;
        this.f57410r = divLayoutProvider;
        this.f57411s = divEdgeInsets;
        this.f57412t = divEdgeInsets2;
        this.f57413u = expression7;
        this.f57414v = expression8;
        this.f57415w = expression9;
        this.f57416x = list7;
        this.f57417y = expression10;
        this.f57418z = expression11;
        this.A = divEdgeInsets3;
        this.B = expression12;
        this.C = tabTitleDelimiter;
        this.D = tabTitleStyle;
        this.E = divEdgeInsets4;
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
    public static /* synthetic */ DivTabs z(DivTabs divTabs, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divTabs.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divTabs.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divTabs.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divTabs.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divTabs.w() : list;
        List background = (i10 & 32) != 0 ? divTabs.getBackground() : list2;
        DivBorder divBorderX = (i10 & 64) != 0 ? divTabs.x() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divTabs.b() : expression4;
        List listK = (i10 & 256) != 0 ? divTabs.k() : list3;
        Expression expression14 = (i10 & 512) != 0 ? divTabs.f57402j : expression5;
        List extensions = (i10 & 1024) != 0 ? divTabs.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 2048) != 0 ? divTabs.n() : divFocus;
        List listU = (i10 & 4096) != 0 ? divTabs.u() : list5;
        Expression expression15 = (i10 & 8192) != 0 ? divTabs.f57406n : expression6;
        DivSize height = (i10 & 16384) != 0 ? divTabs.getHeight() : divSize;
        String id2 = (i10 & 32768) != 0 ? divTabs.getId() : str;
        DivSize divSize3 = height;
        List list13 = (i10 & 65536) != 0 ? divTabs.f57409q : list6;
        return divTabs.y(divAccessibilityO, expressionG, expressionM, alpha, listW, background, divBorderX, expressionB, listK, expression14, extensions, divFocusN, listU, expression15, divSize3, id2, list13, (i10 & 131072) != 0 ? divTabs.r() : divLayoutProvider, (i10 & 262144) != 0 ? divTabs.d() : divEdgeInsets, (i10 & 524288) != 0 ? divTabs.p() : divEdgeInsets2, (i10 & 1048576) != 0 ? divTabs.f57413u : expression7, (i10 & 2097152) != 0 ? divTabs.f() : expression8, (i10 & 4194304) != 0 ? divTabs.e() : expression9, (i10 & 8388608) != 0 ? divTabs.q() : list7, (i10 & 16777216) != 0 ? divTabs.f57417y : expression10, (i10 & 33554432) != 0 ? divTabs.f57418z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divTabs.A : divEdgeInsets3, (i10 & 134217728) != 0 ? divTabs.B : expression12, (i10 & 268435456) != 0 ? divTabs.C : tabTitleDelimiter, (i10 & 536870912) != 0 ? divTabs.D : tabTitleStyle, (i10 & 1073741824) != 0 ? divTabs.E : divEdgeInsets4, (i10 & Integer.MIN_VALUE) != 0 ? divTabs.h() : list8, (i11 & 1) != 0 ? divTabs.getTransform() : divTransform, (i11 & 2) != 0 ? divTabs.j() : divChangeTransition, (i11 & 4) != 0 ? divTabs.v() : divAppearanceTransition, (i11 & 8) != 0 ? divTabs.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divTabs.l() : list9, (i11 & 32) != 0 ? divTabs.s() : list10, (i11 & 64) != 0 ? divTabs.c() : list11, (i11 & 128) != 0 ? divTabs.getVisibility() : expression13, (i11 & 256) != 0 ? divTabs.t() : divVisibilityAction, (i11 & 512) != 0 ? divTabs.a() : list12, (i11 & 1024) != 0 ? divTabs.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivTabs divTabs, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divTabs == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divTabs.o(), expressionResolver, expressionResolver2) : divTabs.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divTabs.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divTabs.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divTabs.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divTabs.w();
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
        if (divTabs.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divTabs.getBackground();
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
        if (divTabs.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divTabs.x(), expressionResolver, expressionResolver2) : divTabs.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divTabs.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divTabs.k();
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
        if (divTabs.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12 || this.f57402j.evaluate(expressionResolver).booleanValue() != divTabs.f57402j.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divTabs.getExtensions();
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
        if (divTabs.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divTabs.n(), expressionResolver, expressionResolver2) : divTabs.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divTabs.u();
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
        if (divTabs.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || this.f57406n.evaluate(expressionResolver).booleanValue() != divTabs.f57406n.evaluate(expressionResolver2).booleanValue() || !getHeight().a(divTabs.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divTabs.getId())) {
            return false;
        }
        List<Item> list = this.f57409q;
        List<Item> list2 = divTabs.f57409q;
        if (list.size() != list2.size()) {
            z15 = false;
            break;
        }
        int i20 = 0;
        for (Object obj6 : list) {
            int i21 = i20 + 1;
            if (i20 < 0) {
                cn.w.w();
            }
            if (!((Item) obj6).c(list2.get(i20), expressionResolver, expressionResolver2)) {
                z15 = false;
                break;
            }
            i20 = i21;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divTabs.r(), expressionResolver, expressionResolver2) : divTabs.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divTabs.d(), expressionResolver, expressionResolver2) : divTabs.d() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divTabs.p(), expressionResolver, expressionResolver2) : divTabs.p() == null) || this.f57413u.evaluate(expressionResolver).booleanValue() != divTabs.f57413u.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divTabs.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divTabs.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divTabs.q();
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
        if (divTabs.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || this.f57417y.evaluate(expressionResolver).longValue() != divTabs.f57417y.evaluate(expressionResolver2).longValue() || this.f57418z.evaluate(expressionResolver).intValue() != divTabs.f57418z.evaluate(expressionResolver2).intValue() || !this.A.a(divTabs.A, expressionResolver, expressionResolver2) || this.B.evaluate(expressionResolver).booleanValue() != divTabs.B.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        TabTitleDelimiter tabTitleDelimiter = this.C;
        if (!(tabTitleDelimiter != null ? tabTitleDelimiter.a(divTabs.C, expressionResolver, expressionResolver2) : divTabs.C == null)) {
            return false;
        }
        TabTitleStyle tabTitleStyle = this.D;
        if (!(tabTitleStyle != null ? tabTitleStyle.a(divTabs.D, expressionResolver, expressionResolver2) : divTabs.D == null) || !this.E.a(divTabs.E, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divTabs.h();
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
        if (divTabs.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divTabs.getTransform(), expressionResolver, expressionResolver2) : divTabs.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divTabs.j(), expressionResolver, expressionResolver2) : divTabs.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divTabs.v(), expressionResolver, expressionResolver2) : divTabs.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divTabs.i(), expressionResolver, expressionResolver2) : divTabs.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divTabs.l();
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
        if (divTabs.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divTabs.s();
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
        if (divTabs.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divTabs.c();
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
        if (divTabs.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divTabs.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divTabs.t(), expressionResolver, expressionResolver2) : divTabs.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divTabs.a();
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
        if (divTabs.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divTabs.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f57400h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f57411s;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.f57415w;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.f57414v;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f57394b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f57396d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f57398f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f57403k;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f57407o;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f57408p;
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
        int iHash = 0;
        Iterator<T> it = this.f57409q.iterator();
        while (it.hasNext()) {
            iHash += ((Item) it.next()).hash();
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
        return this.f57401i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f57395c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f57404l;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f57393a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f57412t;
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
        int iHashCode = tn.t.b(DivTabs.class).hashCode();
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
        int iHashCode5 = iHashCode4 + iHash3 + this.f57402j.hashCode();
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
        int i12 = iHashCode5 + iHash4;
        DivFocus divFocusN = n();
        int iHash13 = i12 + (divFocusN != null ? divFocusN.hash() : 0);
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
        int iHashCode6 = iHash13 + iHash5 + this.f57406n.hashCode() + getHeight().hash();
        String id2 = getId();
        int iHashCode7 = iHashCode6 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderR = r();
        int iHash14 = iHashCode7 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash15 = iHash14 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash16 = iHash15 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0) + this.f57413u.hashCode();
        Expression<String> expressionF = f();
        int iHashCode8 = iHash16 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int iHashCode10 = iHashCode9 + iHash6 + this.f57417y.hashCode() + this.f57418z.hashCode() + this.A.hash() + this.B.hashCode();
        TabTitleDelimiter tabTitleDelimiter = this.C;
        int iHash17 = iHashCode10 + (tabTitleDelimiter != null ? tabTitleDelimiter.hash() : 0);
        TabTitleStyle tabTitleStyle = this.D;
        int iHash18 = iHash17 + (tabTitleStyle != null ? tabTitleStyle.hash() : 0) + this.E.hash();
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
        int i13 = iHash18 + iHash7;
        DivTransform transform = getTransform();
        int iHash19 = i13 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash21 = iHash20 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode11 = iHash22 + (listL != null ? listL.hashCode() : 0);
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
        int i14 = iHashCode11 + iHash8;
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
        int iHashCode12 = i14 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash23 = iHashCode12 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
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
        return this.f57416x;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f57410r;
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
        return this.f57405m;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.I;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f57397e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f57399g;
    }

    @NotNull
    public final DivTabs y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @NotNull Expression<Boolean> expression5, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull Expression<Boolean> expression6, @NotNull DivSize divSize, @Nullable String str, @NotNull List<Item> list6, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2, @NotNull Expression<Boolean> expression7, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable List<DivAction> list7, @NotNull Expression<Long> expression10, @NotNull Expression<Integer> expression11, @NotNull DivEdgeInsets divEdgeInsets3, @NotNull Expression<Boolean> expression12, @Nullable TabTitleDelimiter tabTitleDelimiter, @Nullable TabTitleStyle tabTitleStyle, @NotNull DivEdgeInsets divEdgeInsets4, @Nullable List<DivTooltip> list8, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression13, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivTabs(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, expression5, list4, divFocus, list5, expression6, divSize, str, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression7, expression8, expression9, list7, expression10, expression11, divEdgeInsets3, expression12, tabTitleDelimiter, tabTitleStyle, divEdgeInsets4, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }
}
