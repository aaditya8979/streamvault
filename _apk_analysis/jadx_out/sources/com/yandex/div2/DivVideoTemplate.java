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

/* JADX INFO: compiled from: DivVideoTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivVideoTemplate implements JSONSerializable, JsonTemplate<DivVideo> {

    @NotNull
    public static final a V = new a(null);

    @NotNull
    public static final Expression<Double> W;

    @NotNull
    public static final Expression<Boolean> X;

    @NotNull
    public static final DivSize.d Y;

    @NotNull
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58200a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58201b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVideoScale> f58202c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f58203d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f58204e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVideoTemplate> f58205f0;

    @NotNull
    public final Field<Expression<Boolean>> A;

    @NotNull
    public final Field<Expression<String>> B;

    @NotNull
    public final Field<Expression<Boolean>> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<Expression<String>> E;

    @NotNull
    public final Field<Expression<Long>> F;

    @NotNull
    public final Field<Expression<DivVideoScale>> G;

    @NotNull
    public final Field<List<DivActionTemplate>> H;

    @NotNull
    public final Field<List<DivTooltipTemplate>> I;

    @NotNull
    public final Field<DivTransformTemplate> J;

    @NotNull
    public final Field<DivChangeTransitionTemplate> K;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> L;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> M;

    @NotNull
    public final Field<List<DivTransitionTrigger>> N;

    @NotNull
    public final Field<List<DivTriggerTemplate>> O;

    @NotNull
    public final Field<List<DivVariableTemplate>> P;

    @NotNull
    public final Field<List<DivVideoSourceTemplate>> Q;

    @NotNull
    public final Field<Expression<DivVisibility>> R;

    @NotNull
    public final Field<DivVisibilityActionTemplate> S;

    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> T;

    @NotNull
    public final Field<DivSizeTemplate> U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f58206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f58207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f58208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f58209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f58210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<DivAspectTemplate> f58211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f58213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f58214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f58217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<String> f58218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f58220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f58222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f58223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f58224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<String> f58225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f58226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f58227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f58229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f58231z;

    /* JADX INFO: compiled from: DivVideoTemplate.kt */
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
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        X = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58200a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58201b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58202c0 = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        f58203d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f58204e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        f58205f0 = new sn.p<ParsingEnvironment, JSONObject, DivVideoTemplate>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivVideoTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivVideoTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<DivAspectTemplate> field6, @NotNull Field<Expression<Boolean>> field7, @NotNull Field<List<DivBackgroundTemplate>> field8, @NotNull Field<DivBorderTemplate> field9, @NotNull Field<List<DivActionTemplate>> field10, @NotNull Field<Expression<Long>> field11, @NotNull Field<List<DivDisappearActionTemplate>> field12, @NotNull Field<String> field13, @NotNull Field<List<DivActionTemplate>> field14, @NotNull Field<List<DivExtensionTemplate>> field15, @NotNull Field<List<DivActionTemplate>> field16, @NotNull Field<DivFocusTemplate> field17, @NotNull Field<List<DivFunctionTemplate>> field18, @NotNull Field<DivSizeTemplate> field19, @NotNull Field<String> field20, @NotNull Field<DivLayoutProviderTemplate> field21, @NotNull Field<DivEdgeInsetsTemplate> field22, @NotNull Field<Expression<Boolean>> field23, @NotNull Field<DivEdgeInsetsTemplate> field24, @NotNull Field<List<DivActionTemplate>> field25, @NotNull Field<JSONObject> field26, @NotNull Field<Expression<Boolean>> field27, @NotNull Field<Expression<String>> field28, @NotNull Field<Expression<Boolean>> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<Expression<String>> field31, @NotNull Field<Expression<Long>> field32, @NotNull Field<Expression<DivVideoScale>> field33, @NotNull Field<List<DivActionTemplate>> field34, @NotNull Field<List<DivTooltipTemplate>> field35, @NotNull Field<DivTransformTemplate> field36, @NotNull Field<DivChangeTransitionTemplate> field37, @NotNull Field<DivAppearanceTransitionTemplate> field38, @NotNull Field<DivAppearanceTransitionTemplate> field39, @NotNull Field<List<DivTransitionTrigger>> field40, @NotNull Field<List<DivTriggerTemplate>> field41, @NotNull Field<List<DivVariableTemplate>> field42, @NotNull Field<List<DivVideoSourceTemplate>> field43, @NotNull Field<Expression<DivVisibility>> field44, @NotNull Field<DivVisibilityActionTemplate> field45, @NotNull Field<List<DivVisibilityActionTemplate>> field46, @NotNull Field<DivSizeTemplate> field47) {
        this.f58206a = field;
        this.f58207b = field2;
        this.f58208c = field3;
        this.f58209d = field4;
        this.f58210e = field5;
        this.f58211f = field6;
        this.f58212g = field7;
        this.f58213h = field8;
        this.f58214i = field9;
        this.f58215j = field10;
        this.f58216k = field11;
        this.f58217l = field12;
        this.f58218m = field13;
        this.f58219n = field14;
        this.f58220o = field15;
        this.f58221p = field16;
        this.f58222q = field17;
        this.f58223r = field18;
        this.f58224s = field19;
        this.f58225t = field20;
        this.f58226u = field21;
        this.f58227v = field22;
        this.f58228w = field23;
        this.f58229x = field24;
        this.f58230y = field25;
        this.f58231z = field26;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVideoTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivVideoTemplate divVideoTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivVideoTemplate(ParsingEnvironment parsingEnvironment, DivVideoTemplate divVideoTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVideoTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
