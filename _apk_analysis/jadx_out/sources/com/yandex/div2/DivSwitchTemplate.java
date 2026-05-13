package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSwitchTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSwitchTemplate implements JSONSerializable, JsonTemplate<DivSwitch> {

    @NotNull
    public static final a J = new a(null);

    @NotNull
    public static final Expression<Double> K;

    @NotNull
    public static final DivSize.d L;

    @NotNull
    public static final Expression<Boolean> M;

    @NotNull
    public static final Expression<DivVisibility> N;

    @NotNull
    public static final DivSize.c O;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSwitchTemplate> P;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> A;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> B;

    @NotNull
    public final Field<List<DivTransitionTrigger>> C;

    @NotNull
    public final Field<List<DivTriggerTemplate>> D;

    @NotNull
    public final Field<List<DivVariableTemplate>> E;

    @NotNull
    public final Field<Expression<DivVisibility>> F;

    @NotNull
    public final Field<DivVisibilityActionTemplate> G;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> H;

    @NotNull
    public final Field<DivSizeTemplate> I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f57360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f57361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f57362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f57364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f57365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f57366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f57368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f57369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f57370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f57371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f57372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<String> f57373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<String> f57375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f57376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTooltipTemplate>> f57383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivTransformTemplate> f57384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivChangeTransitionTemplate> f57385z;

    /* JADX INFO: compiled from: DivSwitchTemplate.kt */
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
        K = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        L = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        M = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        N = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        O = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        P = new sn.p<ParsingEnvironment, JSONObject, DivSwitchTemplate>() { // from class: com.yandex.div2.DivSwitchTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSwitchTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSwitchTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivSwitchTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<List<DivDisappearActionTemplate>> field9, @NotNull Field<List<DivExtensionTemplate>> field10, @NotNull Field<DivFocusTemplate> field11, @NotNull Field<List<DivFunctionTemplate>> field12, @NotNull Field<DivSizeTemplate> field13, @NotNull Field<String> field14, @NotNull Field<Expression<Boolean>> field15, @NotNull Field<String> field16, @NotNull Field<DivLayoutProviderTemplate> field17, @NotNull Field<DivEdgeInsetsTemplate> field18, @NotNull Field<Expression<Integer>> field19, @NotNull Field<DivEdgeInsetsTemplate> field20, @NotNull Field<Expression<String>> field21, @NotNull Field<Expression<Long>> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<List<DivTooltipTemplate>> field24, @NotNull Field<DivTransformTemplate> field25, @NotNull Field<DivChangeTransitionTemplate> field26, @NotNull Field<DivAppearanceTransitionTemplate> field27, @NotNull Field<DivAppearanceTransitionTemplate> field28, @NotNull Field<List<DivTransitionTrigger>> field29, @NotNull Field<List<DivTriggerTemplate>> field30, @NotNull Field<List<DivVariableTemplate>> field31, @NotNull Field<Expression<DivVisibility>> field32, @NotNull Field<DivVisibilityActionTemplate> field33, @NotNull Field<List<DivVisibilityActionTemplate>> field34, @NotNull Field<DivSizeTemplate> field35) {
        this.f57360a = field;
        this.f57361b = field2;
        this.f57362c = field3;
        this.f57363d = field4;
        this.f57364e = field5;
        this.f57365f = field6;
        this.f57366g = field7;
        this.f57367h = field8;
        this.f57368i = field9;
        this.f57369j = field10;
        this.f57370k = field11;
        this.f57371l = field12;
        this.f57372m = field13;
        this.f57373n = field14;
        this.f57374o = field15;
        this.f57375p = field16;
        this.f57376q = field17;
        this.f57377r = field18;
        this.f57378s = field19;
        this.f57379t = field20;
        this.f57380u = field21;
        this.f57381v = field22;
        this.f57382w = field23;
        this.f57383x = field24;
        this.f57384y = field25;
        this.f57385z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSwitchTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSwitchTemplate divSwitchTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSwitchTemplate(ParsingEnvironment parsingEnvironment, DivSwitchTemplate divSwitchTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSwitchTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
