package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorTemplate;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparatorTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivSeparatorTemplate implements JSONSerializable, JsonTemplate<DivSeparator> {

    @NotNull
    public static final a R = new a(null);

    @NotNull
    public static final DivAnimation S;

    @NotNull
    public static final Expression<Double> T;

    @NotNull
    public static final Expression<Boolean> U;

    @NotNull
    public static final DivSize.d V;

    @NotNull
    public static final Expression<DivVisibility> W;

    @NotNull
    public static final DivSize.c X;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSeparatorTemplate> Y;

    @NotNull
    public final Field<List<DivActionTemplate>> A;

    @NotNull
    public final Field<List<DivActionTemplate>> B;

    @NotNull
    public final Field<Expression<String>> C;

    @NotNull
    public final Field<Expression<Long>> D;

    @NotNull
    public final Field<List<DivActionTemplate>> E;

    @NotNull
    public final Field<List<DivTooltipTemplate>> F;

    @NotNull
    public final Field<DivTransformTemplate> G;

    @NotNull
    public final Field<DivChangeTransitionTemplate> H;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> I;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> J;

    @NotNull
    public final Field<List<DivTransitionTrigger>> K;

    @NotNull
    public final Field<List<DivTriggerTemplate>> L;

    @NotNull
    public final Field<List<DivVariableTemplate>> M;

    @NotNull
    public final Field<Expression<DivVisibility>> N;

    @NotNull
    public final Field<DivVisibilityActionTemplate> O;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> P;

    @NotNull
    public final Field<DivSizeTemplate> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f56875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f56876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f56877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f56879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f56880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f56882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f56883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f56884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<DelimiterStyleTemplate> f56887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f56888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f56890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f56891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f56892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f56893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<String> f56896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f56897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f56899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f56900z;

    /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
    public static final class DelimiterStyleTemplate implements JSONSerializable, JsonTemplate<DivSeparator.DelimiterStyle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f56901c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f56902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Expression<DivSeparator.DelimiterStyle.Orientation> f56903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, DelimiterStyleTemplate> f56904f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f56905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivSeparator.DelimiterStyle.Orientation>> f56906b;

        /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f56902d = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f56903e = Expression.Companion.constant$default(companion, DivSeparator.DelimiterStyle.Orientation.HORIZONTAL, null, 2, null);
            f56904f = new sn.p<ParsingEnvironment, JSONObject, DelimiterStyleTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSeparatorTemplate.DelimiterStyleTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivSeparatorTemplate.DelimiterStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public DelimiterStyleTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2) {
            this.f56905a = field;
            this.f56906b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DelimiterStyleTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DelimiterStyleTemplate delimiterStyleTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : delimiterStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().K6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        S = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        T = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        U = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        W = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        X = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        Y = new sn.p<ParsingEnvironment, JSONObject, DivSeparatorTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSeparatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivSeparatorTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<List<DivBackgroundTemplate>> field9, @NotNull Field<DivBorderTemplate> field10, @NotNull Field<Expression<Boolean>> field11, @NotNull Field<Expression<Long>> field12, @NotNull Field<DelimiterStyleTemplate> field13, @NotNull Field<List<DivDisappearActionTemplate>> field14, @NotNull Field<List<DivActionTemplate>> field15, @NotNull Field<List<DivExtensionTemplate>> field16, @NotNull Field<DivFocusTemplate> field17, @NotNull Field<List<DivFunctionTemplate>> field18, @NotNull Field<DivSizeTemplate> field19, @NotNull Field<List<DivActionTemplate>> field20, @NotNull Field<List<DivActionTemplate>> field21, @NotNull Field<String> field22, @NotNull Field<DivLayoutProviderTemplate> field23, @NotNull Field<List<DivActionTemplate>> field24, @NotNull Field<DivEdgeInsetsTemplate> field25, @NotNull Field<DivEdgeInsetsTemplate> field26, @NotNull Field<List<DivActionTemplate>> field27, @NotNull Field<List<DivActionTemplate>> field28, @NotNull Field<Expression<String>> field29, @NotNull Field<Expression<Long>> field30, @NotNull Field<List<DivActionTemplate>> field31, @NotNull Field<List<DivTooltipTemplate>> field32, @NotNull Field<DivTransformTemplate> field33, @NotNull Field<DivChangeTransitionTemplate> field34, @NotNull Field<DivAppearanceTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<List<DivTransitionTrigger>> field37, @NotNull Field<List<DivTriggerTemplate>> field38, @NotNull Field<List<DivVariableTemplate>> field39, @NotNull Field<Expression<DivVisibility>> field40, @NotNull Field<DivVisibilityActionTemplate> field41, @NotNull Field<List<DivVisibilityActionTemplate>> field42, @NotNull Field<DivSizeTemplate> field43) {
        this.f56875a = field;
        this.f56876b = field2;
        this.f56877c = field3;
        this.f56878d = field4;
        this.f56879e = field5;
        this.f56880f = field6;
        this.f56881g = field7;
        this.f56882h = field8;
        this.f56883i = field9;
        this.f56884j = field10;
        this.f56885k = field11;
        this.f56886l = field12;
        this.f56887m = field13;
        this.f56888n = field14;
        this.f56889o = field15;
        this.f56890p = field16;
        this.f56891q = field17;
        this.f56892r = field18;
        this.f56893s = field19;
        this.f56894t = field20;
        this.f56895u = field21;
        this.f56896v = field22;
        this.f56897w = field23;
        this.f56898x = field24;
        this.f56899y = field25;
        this.f56900z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSeparatorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSeparatorTemplate divSeparatorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSeparatorTemplate(ParsingEnvironment parsingEnvironment, DivSeparatorTemplate divSeparatorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSeparatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
