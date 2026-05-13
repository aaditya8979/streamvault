package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivStateTemplate implements JSONSerializable, JsonTemplate<DivState> {

    @NotNull
    public static final a W = new a(null);

    @NotNull
    public static final DivAnimation X;

    @NotNull
    public static final Expression<Double> Y;

    @NotNull
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57219a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f57220b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivTransitionSelector> f57221c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57222d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57223e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStateTemplate> f57224f0;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> A;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> B;

    @NotNull
    public final Field<List<DivActionTemplate>> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<Expression<String>> E;

    @NotNull
    public final Field<Expression<Long>> F;

    @NotNull
    public final Field<List<DivActionTemplate>> G;

    @NotNull
    public final Field<String> H;

    @NotNull
    public final Field<List<StateTemplate>> I;

    @NotNull
    public final Field<List<DivTooltipTemplate>> J;

    @NotNull
    public final Field<DivTransformTemplate> K;

    @NotNull
    public final Field<Expression<DivTransitionSelector>> L;

    @NotNull
    public final Field<DivChangeTransitionTemplate> M;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> N;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> O;

    @NotNull
    public final Field<List<DivTransitionTrigger>> P;

    @NotNull
    public final Field<List<DivTriggerTemplate>> Q;

    @NotNull
    public final Field<List<DivVariableTemplate>> R;

    @NotNull
    public final Field<Expression<DivVisibility>> S;

    @NotNull
    public final Field<DivVisibilityActionTemplate> T;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> U;

    @NotNull
    public final Field<DivSizeTemplate> V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f57225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f57226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f57227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f57229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f57230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f57232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f57233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f57234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f57239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<String> f57240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f57242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f57243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f57244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f57245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<String> f57248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f57249y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57250z;

    /* JADX INFO: compiled from: DivStateTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate<DivState.State> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f57251f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, StateTemplate> f57252g = new sn.p<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStateTemplate.StateTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStateTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivAnimationTemplate> f57253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<DivAnimationTemplate> f57254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<DivTemplate> f57255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<String> f57256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<List<DivActionTemplate>> f57257e;

        /* JADX INFO: compiled from: DivStateTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public StateTemplate(@NotNull Field<DivAnimationTemplate> field, @NotNull Field<DivAnimationTemplate> field2, @NotNull Field<DivTemplate> field3, @NotNull Field<String> field4, @NotNull Field<List<DivActionTemplate>> field5) {
            this.f57253a = field;
            this.f57254b = field2;
            this.f57255c = field3;
            this.f57256d = field4;
            this.f57257e = field5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable StateTemplate stateTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : stateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().x7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivStateTemplate.kt */
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
        X = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        Y = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57219a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57220b0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f57221c0 = Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        f57222d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57223e0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f57224f0 = new sn.p<ParsingEnvironment, JSONObject, DivStateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStateTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivStateTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<List<DivBackgroundTemplate>> field9, @NotNull Field<DivBorderTemplate> field10, @NotNull Field<Expression<Boolean>> field11, @NotNull Field<Expression<Boolean>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<Expression<String>> field14, @NotNull Field<List<DivDisappearActionTemplate>> field15, @NotNull Field<String> field16, @NotNull Field<List<DivActionTemplate>> field17, @NotNull Field<List<DivExtensionTemplate>> field18, @NotNull Field<DivFocusTemplate> field19, @NotNull Field<List<DivFunctionTemplate>> field20, @NotNull Field<DivSizeTemplate> field21, @NotNull Field<List<DivActionTemplate>> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<String> field24, @NotNull Field<DivLayoutProviderTemplate> field25, @NotNull Field<List<DivActionTemplate>> field26, @NotNull Field<DivEdgeInsetsTemplate> field27, @NotNull Field<DivEdgeInsetsTemplate> field28, @NotNull Field<List<DivActionTemplate>> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<Expression<String>> field31, @NotNull Field<Expression<Long>> field32, @NotNull Field<List<DivActionTemplate>> field33, @NotNull Field<String> field34, @NotNull Field<List<StateTemplate>> field35, @NotNull Field<List<DivTooltipTemplate>> field36, @NotNull Field<DivTransformTemplate> field37, @NotNull Field<Expression<DivTransitionSelector>> field38, @NotNull Field<DivChangeTransitionTemplate> field39, @NotNull Field<DivAppearanceTransitionTemplate> field40, @NotNull Field<DivAppearanceTransitionTemplate> field41, @NotNull Field<List<DivTransitionTrigger>> field42, @NotNull Field<List<DivTriggerTemplate>> field43, @NotNull Field<List<DivVariableTemplate>> field44, @NotNull Field<Expression<DivVisibility>> field45, @NotNull Field<DivVisibilityActionTemplate> field46, @NotNull Field<List<DivVisibilityActionTemplate>> field47, @NotNull Field<DivSizeTemplate> field48) {
        this.f57225a = field;
        this.f57226b = field2;
        this.f57227c = field3;
        this.f57228d = field4;
        this.f57229e = field5;
        this.f57230f = field6;
        this.f57231g = field7;
        this.f57232h = field8;
        this.f57233i = field9;
        this.f57234j = field10;
        this.f57235k = field11;
        this.f57236l = field12;
        this.f57237m = field13;
        this.f57238n = field14;
        this.f57239o = field15;
        this.f57240p = field16;
        this.f57241q = field17;
        this.f57242r = field18;
        this.f57243s = field19;
        this.f57244t = field20;
        this.f57245u = field21;
        this.f57246v = field22;
        this.f57247w = field23;
        this.f57248x = field24;
        this.f57249y = field25;
        this.f57250z = field26;
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
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
        this.V = field48;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStateTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivStateTemplate divStateTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivStateTemplate(ParsingEnvironment parsingEnvironment, DivStateTemplate divStateTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
