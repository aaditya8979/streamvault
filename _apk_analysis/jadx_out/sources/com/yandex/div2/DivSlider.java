package com.yandex.div2;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSlider;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlider.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSlider implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final a W = new a(null);

    @NotNull
    public static final Expression<Double> X;

    @NotNull
    public static final DivSize.d Y;

    @NotNull
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57012a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57013b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57014c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57015d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSlider> f57016e0;

    @Nullable
    public final TextStyle A;

    @Nullable
    public final String B;

    @NotNull
    public final DivDrawable C;

    @Nullable
    public final TextStyle D;

    @Nullable
    public final String E;

    @Nullable
    public final DivDrawable F;

    @Nullable
    public final DivDrawable G;

    @Nullable
    public final List<DivTooltip> H;

    @NotNull
    public final DivDrawable I;

    @NotNull
    public final DivDrawable J;

    @Nullable
    public final DivTransform K;

    @Nullable
    public final DivChangeTransition L;

    @Nullable
    public final DivAppearanceTransition M;

    @Nullable
    public final DivAppearanceTransition N;

    @Nullable
    public final List<DivTransitionTrigger> O;

    @Nullable
    public final List<DivTrigger> P;

    @Nullable
    public final List<DivVariable> Q;

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
    public final DivAccessibility f57017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f57018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f57019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f57021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f57022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DivBorder f57023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f57025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f57026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivFocus f57027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f57028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final DivSize f57029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f57030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final DivLayoutProvider f57032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f57036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<Range> f57037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f57040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final DivDrawable f57042z;

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class Range implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f57043g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Range> f57044h = new sn.p<ParsingEnvironment, JSONObject, Range>() { // from class: com.yandex.div2.DivSlider$Range$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlider.Range mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlider.Range.f57043g.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final DivEdgeInsets f57046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final DivDrawable f57048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final DivDrawable f57049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Integer f57050f;

        /* JADX INFO: compiled from: DivSlider.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Range a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().k7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Range() {
            this(null, null, null, null, null, 31, null);
        }

        public Range(@Nullable Expression<Long> expression, @Nullable DivEdgeInsets divEdgeInsets, @Nullable Expression<Long> expression2, @Nullable DivDrawable divDrawable, @Nullable DivDrawable divDrawable2) {
            this.f57045a = expression;
            this.f57046b = divEdgeInsets;
            this.f57047c = expression2;
            this.f57048d = divDrawable;
            this.f57049e = divDrawable2;
        }

        public /* synthetic */ Range(Expression expression, DivEdgeInsets divEdgeInsets, Expression expression2, DivDrawable divDrawable, DivDrawable divDrawable2, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divEdgeInsets, (i10 & 4) != 0 ? null : expression2, (i10 & 8) != 0 ? null : divDrawable, (i10 & 16) != 0 ? null : divDrawable2);
        }

        public final boolean a(@Nullable Range range, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (range == null) {
                return false;
            }
            Expression<Long> expression = this.f57045a;
            Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Long> expression2 = range.f57045a;
            if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.f57046b;
            if (!(divEdgeInsets != null ? divEdgeInsets.a(range.f57046b, expressionResolver, expressionResolver2) : range.f57046b == null)) {
                return false;
            }
            Expression<Long> expression3 = this.f57047c;
            Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<Long> expression4 = range.f57047c;
            if (!tn.p.f(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivDrawable divDrawable = this.f57048d;
            if (!(divDrawable != null ? divDrawable.a(range.f57048d, expressionResolver, expressionResolver2) : range.f57048d == null)) {
                return false;
            }
            DivDrawable divDrawable2 = this.f57049e;
            DivDrawable divDrawable3 = range.f57049e;
            return divDrawable2 != null ? divDrawable2.a(divDrawable3, expressionResolver, expressionResolver2) : divDrawable3 == null;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57050f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Range.class).hashCode();
            Expression<Long> expression = this.f57045a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            DivEdgeInsets divEdgeInsets = this.f57046b;
            int iHash = iHashCode2 + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
            Expression<Long> expression2 = this.f57047c;
            int iHashCode3 = iHash + (expression2 != null ? expression2.hashCode() : 0);
            DivDrawable divDrawable = this.f57048d;
            int iHash2 = iHashCode3 + (divDrawable != null ? divDrawable.hash() : 0);
            DivDrawable divDrawable2 = this.f57049e;
            int iHash3 = iHash2 + (divDrawable2 != null ? divDrawable2.hash() : 0);
            this.f57050f = Integer.valueOf(iHash3);
            return iHash3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().k7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class TextStyle implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final a f57051k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final Expression<DivSizeUnit> f57053m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final Expression<Double> f57054n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57055o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TextStyle> f57056p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Expression<String> f57057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Expression<DivSizeUnit> f57059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Expression<JSONObject> f57060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Expression<DivFontWeight> f57061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Expression<Double> f57063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final DivPoint f57064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f57065i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Integer f57066j;

        /* JADX INFO: compiled from: DivSlider.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final TextStyle a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().n7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57052l = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f57053m = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f57054n = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f57055o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f57056p = new sn.p<ParsingEnvironment, JSONObject, TextStyle>() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSlider.TextStyle mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivSlider.TextStyle.f57051k.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public TextStyle() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public TextStyle(@Nullable Expression<String> expression, @NotNull Expression<Long> expression2, @NotNull Expression<DivSizeUnit> expression3, @Nullable Expression<JSONObject> expression4, @Nullable Expression<DivFontWeight> expression5, @Nullable Expression<Long> expression6, @NotNull Expression<Double> expression7, @Nullable DivPoint divPoint, @NotNull Expression<Integer> expression8) {
            this.f57057a = expression;
            this.f57058b = expression2;
            this.f57059c = expression3;
            this.f57060d = expression4;
            this.f57061e = expression5;
            this.f57062f = expression6;
            this.f57063g = expression7;
            this.f57064h = divPoint;
            this.f57065i = expression8;
        }

        public /* synthetic */ TextStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivPoint divPoint, Expression expression8, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f57052l : expression2, (i10 & 4) != 0 ? f57053m : expression3, (i10 & 8) != 0 ? null : expression4, (i10 & 16) != 0 ? null : expression5, (i10 & 32) != 0 ? null : expression6, (i10 & 64) != 0 ? f57054n : expression7, (i10 & 128) == 0 ? divPoint : null, (i10 & 256) != 0 ? f57055o : expression8);
        }

        public final boolean a(@Nullable TextStyle textStyle, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (textStyle == null) {
                return false;
            }
            Expression<String> expression = this.f57057a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = textStyle.f57057a;
            if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f57058b.evaluate(expressionResolver).longValue() != textStyle.f57058b.evaluate(expressionResolver2).longValue() || this.f57059c.evaluate(expressionResolver) != textStyle.f57059c.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<JSONObject> expression3 = this.f57060d;
            JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression4 = textStyle.f57060d;
            if (!tn.p.f(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression5 = this.f57061e;
            DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression6 = textStyle.f57061e;
            if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression7 = this.f57062f;
            Long lEvaluate = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<Long> expression8 = textStyle.f57062f;
            if (!tn.p.f(lEvaluate, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            if (!(this.f57063g.evaluate(expressionResolver).doubleValue() == textStyle.f57063g.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            DivPoint divPoint = this.f57064h;
            return (divPoint != null ? divPoint.a(textStyle.f57064h, expressionResolver, expressionResolver2) : textStyle.f57064h == null) && this.f57065i.evaluate(expressionResolver).intValue() == textStyle.f57065i.evaluate(expressionResolver2).intValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57066j;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(TextStyle.class).hashCode();
            Expression<String> expression = this.f57057a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f57058b.hashCode() + this.f57059c.hashCode();
            Expression<JSONObject> expression2 = this.f57060d;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<DivFontWeight> expression3 = this.f57061e;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<Long> expression4 = this.f57062f;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f57063g.hashCode();
            DivPoint divPoint = this.f57064h;
            int iHash = iHashCode5 + (divPoint != null ? divPoint.hash() : 0) + this.f57065i.hashCode();
            this.f57066j = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().n7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSlider a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().h7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57012a0 = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f57013b0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57014c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57015d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f57016e0 = new sn.p<ParsingEnvironment, JSONObject, DivSlider>() { // from class: com.yandex.div2.DivSlider$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlider mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlider.W.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSlider(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression5, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Long> expression6, @NotNull Expression<Long> expression7, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<Range> list6, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable DivAccessibility divAccessibility2, @Nullable List<DivAction> list7, @Nullable DivDrawable divDrawable, @Nullable TextStyle textStyle, @Nullable String str2, @NotNull DivDrawable divDrawable2, @Nullable TextStyle textStyle2, @Nullable String str3, @Nullable DivDrawable divDrawable3, @Nullable DivDrawable divDrawable4, @Nullable List<DivTooltip> list8, @NotNull DivDrawable divDrawable5, @NotNull DivDrawable divDrawable6, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression10, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        this.f57017a = divAccessibility;
        this.f57018b = expression;
        this.f57019c = expression2;
        this.f57020d = expression3;
        this.f57021e = list;
        this.f57022f = list2;
        this.f57023g = divBorder;
        this.f57024h = expression4;
        this.f57025i = list3;
        this.f57026j = list4;
        this.f57027k = divFocus;
        this.f57028l = list5;
        this.f57029m = divSize;
        this.f57030n = str;
        this.f57031o = expression5;
        this.f57032p = divLayoutProvider;
        this.f57033q = divEdgeInsets;
        this.f57034r = expression6;
        this.f57035s = expression7;
        this.f57036t = divEdgeInsets2;
        this.f57037u = list6;
        this.f57038v = expression8;
        this.f57039w = expression9;
        this.f57040x = divAccessibility2;
        this.f57041y = list7;
        this.f57042z = divDrawable;
        this.A = textStyle;
        this.B = str2;
        this.C = divDrawable2;
        this.D = textStyle2;
        this.E = str3;
        this.F = divDrawable3;
        this.G = divDrawable4;
        this.H = list8;
        this.I = divDrawable5;
        this.J = divDrawable6;
        this.K = divTransform;
        this.L = divChangeTransition;
        this.M = divAppearanceTransition;
        this.N = divAppearanceTransition2;
        this.O = list9;
        this.P = list10;
        this.Q = list11;
        this.R = expression10;
        this.S = divVisibilityAction;
        this.T = list12;
        this.U = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSlider z(DivSlider divSlider, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression10, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divSlider.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divSlider.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divSlider.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divSlider.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divSlider.w() : list;
        List background = (i10 & 32) != 0 ? divSlider.getBackground() : list2;
        DivBorder divBorderX = (i10 & 64) != 0 ? divSlider.x() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divSlider.b() : expression4;
        List listK = (i10 & 256) != 0 ? divSlider.k() : list3;
        List extensions = (i10 & 512) != 0 ? divSlider.getExtensions() : list4;
        DivFocus divFocusN = (i10 & 1024) != 0 ? divSlider.n() : divFocus;
        List listU = (i10 & 2048) != 0 ? divSlider.u() : list5;
        DivSize height = (i10 & 4096) != 0 ? divSlider.getHeight() : divSize;
        String id2 = (i10 & 8192) != 0 ? divSlider.getId() : str;
        Expression expression11 = (i10 & 16384) != 0 ? divSlider.f57031o : expression5;
        DivLayoutProvider divLayoutProviderR = (i10 & 32768) != 0 ? divSlider.r() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 65536) != 0 ? divSlider.d() : divEdgeInsets;
        Expression expression12 = expression11;
        Expression expression13 = (i10 & 131072) != 0 ? divSlider.f57034r : expression6;
        Expression expression14 = (i10 & 262144) != 0 ? divSlider.f57035s : expression7;
        DivEdgeInsets divEdgeInsetsP = (i10 & 524288) != 0 ? divSlider.p() : divEdgeInsets2;
        Expression expression15 = expression14;
        List list13 = (i10 & 1048576) != 0 ? divSlider.f57037u : list6;
        Expression expressionF = (i10 & 2097152) != 0 ? divSlider.f() : expression8;
        Expression expressionE = (i10 & 4194304) != 0 ? divSlider.e() : expression9;
        List list14 = list13;
        DivAccessibility divAccessibility3 = (i10 & 8388608) != 0 ? divSlider.f57040x : divAccessibility2;
        return divSlider.y(divAccessibilityO, expressionG, expressionM, alpha, listW, background, divBorderX, expressionB, listK, extensions, divFocusN, listU, height, id2, expression12, divLayoutProviderR, divEdgeInsetsD, expression13, expression15, divEdgeInsetsP, list14, expressionF, expressionE, divAccessibility3, (i10 & 16777216) != 0 ? divSlider.q() : list7, (i10 & 33554432) != 0 ? divSlider.f57042z : divDrawable, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSlider.A : textStyle, (i10 & 134217728) != 0 ? divSlider.B : str2, (i10 & 268435456) != 0 ? divSlider.C : divDrawable2, (i10 & 536870912) != 0 ? divSlider.D : textStyle2, (i10 & 1073741824) != 0 ? divSlider.E : str3, (i10 & Integer.MIN_VALUE) != 0 ? divSlider.F : divDrawable3, (i11 & 1) != 0 ? divSlider.G : divDrawable4, (i11 & 2) != 0 ? divSlider.h() : list8, (i11 & 4) != 0 ? divSlider.I : divDrawable5, (i11 & 8) != 0 ? divSlider.J : divDrawable6, (i11 & 16) != 0 ? divSlider.getTransform() : divTransform, (i11 & 32) != 0 ? divSlider.j() : divChangeTransition, (i11 & 64) != 0 ? divSlider.v() : divAppearanceTransition, (i11 & 128) != 0 ? divSlider.i() : divAppearanceTransition2, (i11 & 256) != 0 ? divSlider.l() : list9, (i11 & 512) != 0 ? divSlider.s() : list10, (i11 & 1024) != 0 ? divSlider.c() : list11, (i11 & 2048) != 0 ? divSlider.getVisibility() : expression10, (i11 & 4096) != 0 ? divSlider.t() : divVisibilityAction, (i11 & 8192) != 0 ? divSlider.a() : list12, (i11 & 16384) != 0 ? divSlider.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivSlider divSlider, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        if (divSlider == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divSlider.o(), expressionResolver, expressionResolver2) : divSlider.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSlider.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divSlider.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divSlider.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divSlider.w();
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
        if (divSlider.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSlider.getBackground();
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
        if (divSlider.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divSlider.x(), expressionResolver, expressionResolver2) : divSlider.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSlider.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSlider.k();
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
        if (divSlider.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSlider.getExtensions();
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
        if (divSlider.getExtensions() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divSlider.n(), expressionResolver, expressionResolver2) : divSlider.n() == null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divSlider.u();
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
        if (divSlider.u() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14 || !getHeight().a(divSlider.getHeight(), expressionResolver, expressionResolver2) || !tn.p.f(getId(), divSlider.getId()) || this.f57031o.evaluate(expressionResolver).booleanValue() != divSlider.f57031o.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divSlider.r(), expressionResolver, expressionResolver2) : divSlider.r() == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divSlider.d(), expressionResolver, expressionResolver2) : divSlider.d() == null) || this.f57034r.evaluate(expressionResolver).longValue() != divSlider.f57034r.evaluate(expressionResolver2).longValue() || this.f57035s.evaluate(expressionResolver).longValue() != divSlider.f57035s.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divSlider.p(), expressionResolver, expressionResolver2) : divSlider.p() == null)) {
            return false;
        }
        List<Range> list = this.f57037u;
        if (list != null) {
            List<Range> list2 = divSlider.f57037u;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i20 = 0;
                    for (Object obj6 : list) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((Range) obj6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
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
        if (divSlider.f57037u != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSlider.f();
        if (!tn.p.f(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSlider.e();
        if (!tn.p.f(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivAccessibility divAccessibility = this.f57040x;
        if (!(divAccessibility != null ? divAccessibility.a(divSlider.f57040x, expressionResolver, expressionResolver2) : divSlider.f57040x == null)) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divSlider.q();
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
        if (divSlider.q() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16) {
            return false;
        }
        DivDrawable divDrawable = this.f57042z;
        if (!(divDrawable != null ? divDrawable.a(divSlider.f57042z, expressionResolver, expressionResolver2) : divSlider.f57042z == null)) {
            return false;
        }
        TextStyle textStyle = this.A;
        if (!(textStyle != null ? textStyle.a(divSlider.A, expressionResolver, expressionResolver2) : divSlider.A == null) || !tn.p.f(this.B, divSlider.B) || !this.C.a(divSlider.C, expressionResolver, expressionResolver2)) {
            return false;
        }
        TextStyle textStyle2 = this.D;
        if (!(textStyle2 != null ? textStyle2.a(divSlider.D, expressionResolver, expressionResolver2) : divSlider.D == null) || !tn.p.f(this.E, divSlider.E)) {
            return false;
        }
        DivDrawable divDrawable2 = this.F;
        if (!(divDrawable2 != null ? divDrawable2.a(divSlider.F, expressionResolver, expressionResolver2) : divSlider.F == null)) {
            return false;
        }
        DivDrawable divDrawable3 = this.G;
        if (!(divDrawable3 != null ? divDrawable3.a(divSlider.G, expressionResolver, expressionResolver2) : divSlider.G == null)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSlider.h();
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
        if (divSlider.h() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17 || !this.I.a(divSlider.I, expressionResolver, expressionResolver2) || !this.J.a(divSlider.J, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divSlider.getTransform(), expressionResolver, expressionResolver2) : divSlider.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divSlider.j(), expressionResolver, expressionResolver2) : divSlider.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divSlider.v(), expressionResolver, expressionResolver2) : divSlider.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divSlider.i(), expressionResolver, expressionResolver2) : divSlider.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divSlider.l();
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
        if (divSlider.l() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divSlider.s();
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
        if (divSlider.s() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSlider.c();
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
        if (divSlider.c() != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20 || getVisibility().evaluate(expressionResolver) != divSlider.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divSlider.t(), expressionResolver, expressionResolver2) : divSlider.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSlider.a();
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
        if (divSlider.a() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        return z21 && getWidth().a(divSlider.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.T;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f57024h;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.Q;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.f57033q;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.f57039w;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.f57038v;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f57018b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f57020d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f57022f;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f57026j;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f57029m;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.f57030n;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.K;
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
        return this.H;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSlider.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash11 = 0;
        int iHash12 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
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
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f57031o.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash16 = iHashCode5 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f57034r.hashCode() + this.f57035s.hashCode();
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash18 = iHash17 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<Range> list = this.f57037u;
        if (list != null) {
            Iterator<T> it6 = list.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((Range) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHash18 + iHash6;
        Expression<String> expressionF = f();
        int iHashCode6 = i14 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
        DivAccessibility divAccessibility = this.f57040x;
        int iHash19 = iHashCode7 + (divAccessibility != null ? divAccessibility.hash() : 0);
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it7 = listQ.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHash19 + iHash7;
        DivDrawable divDrawable = this.f57042z;
        int iHash20 = i15 + (divDrawable != null ? divDrawable.hash() : 0);
        TextStyle textStyle = this.A;
        int iHash21 = iHash20 + (textStyle != null ? textStyle.hash() : 0);
        String str = this.B;
        int iHashCode8 = iHash21 + (str != null ? str.hashCode() : 0) + this.C.hash();
        TextStyle textStyle2 = this.D;
        int iHash22 = iHashCode8 + (textStyle2 != null ? textStyle2.hash() : 0);
        String str2 = this.E;
        int iHashCode9 = iHash22 + (str2 != null ? str2.hashCode() : 0);
        DivDrawable divDrawable2 = this.F;
        int iHash23 = iHashCode9 + (divDrawable2 != null ? divDrawable2.hash() : 0);
        DivDrawable divDrawable3 = this.G;
        int iHash24 = iHash23 + (divDrawable3 != null ? divDrawable3.hash() : 0);
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it8 = listH.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash25 = iHash24 + iHash8 + this.I.hash() + this.J.hash();
        DivTransform transform = getTransform();
        int iHash26 = iHash25 + (transform != null ? transform.hash() : 0);
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
            Iterator<T> it9 = listS.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i16 = iHashCode10 + iHash9;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it10 = listC.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivVariable) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int iHashCode11 = i16 + iHash10 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash30 = iHashCode11 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash11 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash11 + getWidth().hash();
        this.V = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f57025i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.O;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f57019c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f57027k;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f57017a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.f57036t;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.f57041y;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.f57032p;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f57028l;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f57021e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f57023g;
    }

    @NotNull
    public final DivSlider y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression4, @Nullable List<DivDisappearAction> list3, @Nullable List<DivExtension> list4, @Nullable DivFocus divFocus, @Nullable List<DivFunction> list5, @NotNull DivSize divSize, @Nullable String str, @NotNull Expression<Boolean> expression5, @Nullable DivLayoutProvider divLayoutProvider, @Nullable DivEdgeInsets divEdgeInsets, @NotNull Expression<Long> expression6, @NotNull Expression<Long> expression7, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<Range> list6, @Nullable Expression<String> expression8, @Nullable Expression<Long> expression9, @Nullable DivAccessibility divAccessibility2, @Nullable List<DivAction> list7, @Nullable DivDrawable divDrawable, @Nullable TextStyle textStyle, @Nullable String str2, @NotNull DivDrawable divDrawable2, @Nullable TextStyle textStyle2, @Nullable String str3, @Nullable DivDrawable divDrawable3, @Nullable DivDrawable divDrawable4, @Nullable List<DivTooltip> list8, @NotNull DivDrawable divDrawable5, @NotNull DivDrawable divDrawable6, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @Nullable List<DivTrigger> list10, @Nullable List<? extends DivVariable> list11, @NotNull Expression<DivVisibility> expression10, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list12, @NotNull DivSize divSize2) {
        return new DivSlider(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, divLayoutProvider, divEdgeInsets, expression6, expression7, divEdgeInsets2, list6, expression8, expression9, divAccessibility2, list7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, list8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression10, divVisibilityAction, list12, divSize2);
    }
}
