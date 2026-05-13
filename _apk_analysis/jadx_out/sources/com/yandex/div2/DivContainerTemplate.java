package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerTemplate;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainerTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivContainerTemplate implements JSONSerializable, JsonTemplate<DivContainer> {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final a f54924c0 = new a(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f54925d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f54926e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54927f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54928g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContentAlignmentHorizontal> f54929h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContentAlignmentVertical> f54930i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f54931j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54932k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContainer.LayoutMode> f54933l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54934m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivContainer.Orientation> f54935n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f54936o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f54937p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivContainerTemplate> f54938q0;

    @NotNull
    public final Field<Expression<Long>> A;

    @NotNull
    public final Field<List<DivTemplate>> B;

    @NotNull
    public final Field<Expression<DivContainer.LayoutMode>> C;

    @NotNull
    public final Field<DivLayoutProviderTemplate> D;

    @NotNull
    public final Field<SeparatorTemplate> E;

    @NotNull
    public final Field<Expression<Long>> F;

    @NotNull
    public final Field<List<DivActionTemplate>> G;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> H;

    @NotNull
    public final Field<Expression<DivContainer.Orientation>> I;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> J;

    @NotNull
    public final Field<List<DivActionTemplate>> K;

    @NotNull
    public final Field<List<DivActionTemplate>> L;

    @NotNull
    public final Field<Expression<String>> M;

    @NotNull
    public final Field<Expression<Long>> N;

    @NotNull
    public final Field<List<DivActionTemplate>> O;

    @NotNull
    public final Field<SeparatorTemplate> P;

    @NotNull
    public final Field<List<DivTooltipTemplate>> Q;

    @NotNull
    public final Field<DivTransformTemplate> R;

    @NotNull
    public final Field<DivChangeTransitionTemplate> S;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> T;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> U;

    @NotNull
    public final Field<List<DivTransitionTrigger>> V;

    @NotNull
    public final Field<List<DivTriggerTemplate>> W;

    @NotNull
    public final Field<List<DivVariableTemplate>> X;

    @NotNull
    public final Field<Expression<DivVisibility>> Y;

    @NotNull
    public final Field<DivVisibilityActionTemplate> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f54939a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f54940a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f54941b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f54942b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f54943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f54945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f54946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f54947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f54948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivAspectTemplate> f54949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f54950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f54951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivContentAlignmentHorizontal>> f54955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivContentAlignmentVertical>> f54956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f54957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f54959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f54960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f54961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f54962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<String> f54965y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivCollectionItemBuilderTemplate> f54966z;

    /* JADX INFO: compiled from: DivContainerTemplate.kt */
    public static final class SeparatorTemplate implements JSONSerializable, JsonTemplate<DivContainer.Separator> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f54967f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, SeparatorTemplate> f54971j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivEdgeInsetsTemplate> f54972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Boolean>> f54973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Boolean>> f54974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Boolean>> f54975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<DivDrawableTemplate> f54976e;

        /* JADX INFO: compiled from: DivContainerTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            f54968g = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f54969h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f54970i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f54971j = new sn.p<ParsingEnvironment, JSONObject, SeparatorTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivContainerTemplate.SeparatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivContainerTemplate.SeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public SeparatorTemplate(@NotNull Field<DivEdgeInsetsTemplate> field, @NotNull Field<Expression<Boolean>> field2, @NotNull Field<Expression<Boolean>> field3, @NotNull Field<Expression<Boolean>> field4, @NotNull Field<DivDrawableTemplate> field5) {
            this.f54972a = field;
            this.f54973b = field2;
            this.f54974c = field3;
            this.f54975d = field4;
            this.f54976e = field5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SeparatorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable SeparatorTemplate separatorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : separatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().q2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivContainerTemplate.kt */
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
        f54925d0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f54926e0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f54927f0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f54928g0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f54929h0 = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        f54930i0 = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        f54931j0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f54932k0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54933l0 = Expression.Companion.constant$default(companion, DivContainer.LayoutMode.NO_WRAP, null, 2, null);
        f54934m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54935n0 = Expression.Companion.constant$default(companion, DivContainer.Orientation.VERTICAL, null, 2, null);
        f54936o0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f54937p0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        f54938q0 = new sn.p<ParsingEnvironment, JSONObject, DivContainerTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivContainerTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivContainerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivContainerTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<DivAspectTemplate> field9, @NotNull Field<List<DivBackgroundTemplate>> field10, @NotNull Field<DivBorderTemplate> field11, @NotNull Field<Expression<Boolean>> field12, @NotNull Field<Expression<Boolean>> field13, @NotNull Field<Expression<Long>> field14, @NotNull Field<Expression<DivContentAlignmentHorizontal>> field15, @NotNull Field<Expression<DivContentAlignmentVertical>> field16, @NotNull Field<List<DivDisappearActionTemplate>> field17, @NotNull Field<List<DivActionTemplate>> field18, @NotNull Field<List<DivExtensionTemplate>> field19, @NotNull Field<DivFocusTemplate> field20, @NotNull Field<List<DivFunctionTemplate>> field21, @NotNull Field<DivSizeTemplate> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<List<DivActionTemplate>> field24, @NotNull Field<String> field25, @NotNull Field<DivCollectionItemBuilderTemplate> field26, @NotNull Field<Expression<Long>> field27, @NotNull Field<List<DivTemplate>> field28, @NotNull Field<Expression<DivContainer.LayoutMode>> field29, @NotNull Field<DivLayoutProviderTemplate> field30, @NotNull Field<SeparatorTemplate> field31, @NotNull Field<Expression<Long>> field32, @NotNull Field<List<DivActionTemplate>> field33, @NotNull Field<DivEdgeInsetsTemplate> field34, @NotNull Field<Expression<DivContainer.Orientation>> field35, @NotNull Field<DivEdgeInsetsTemplate> field36, @NotNull Field<List<DivActionTemplate>> field37, @NotNull Field<List<DivActionTemplate>> field38, @NotNull Field<Expression<String>> field39, @NotNull Field<Expression<Long>> field40, @NotNull Field<List<DivActionTemplate>> field41, @NotNull Field<SeparatorTemplate> field42, @NotNull Field<List<DivTooltipTemplate>> field43, @NotNull Field<DivTransformTemplate> field44, @NotNull Field<DivChangeTransitionTemplate> field45, @NotNull Field<DivAppearanceTransitionTemplate> field46, @NotNull Field<DivAppearanceTransitionTemplate> field47, @NotNull Field<List<DivTransitionTrigger>> field48, @NotNull Field<List<DivTriggerTemplate>> field49, @NotNull Field<List<DivVariableTemplate>> field50, @NotNull Field<Expression<DivVisibility>> field51, @NotNull Field<DivVisibilityActionTemplate> field52, @NotNull Field<List<DivVisibilityActionTemplate>> field53, @NotNull Field<DivSizeTemplate> field54) {
        this.f54939a = field;
        this.f54941b = field2;
        this.f54943c = field3;
        this.f54944d = field4;
        this.f54945e = field5;
        this.f54946f = field6;
        this.f54947g = field7;
        this.f54948h = field8;
        this.f54949i = field9;
        this.f54950j = field10;
        this.f54951k = field11;
        this.f54952l = field12;
        this.f54953m = field13;
        this.f54954n = field14;
        this.f54955o = field15;
        this.f54956p = field16;
        this.f54957q = field17;
        this.f54958r = field18;
        this.f54959s = field19;
        this.f54960t = field20;
        this.f54961u = field21;
        this.f54962v = field22;
        this.f54963w = field23;
        this.f54964x = field24;
        this.f54965y = field25;
        this.f54966z = field26;
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
        this.W = field49;
        this.X = field50;
        this.Y = field51;
        this.Z = field52;
        this.f54940a0 = field53;
        this.f54942b0 = field54;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivContainerTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivContainerTemplate divContainerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivContainerTemplate(ParsingEnvironment parsingEnvironment, DivContainerTemplate divContainerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divContainerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
