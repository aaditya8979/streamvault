package com.yandex.div2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputTemplate;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputTemplate implements JSONSerializable, JsonTemplate<DivInput> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final a f56064h0 = new a(null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56065i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivInput.Autocapitalization> f56066j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivInput.EnterKeyType> f56067k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56068l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56069m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f56070n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56071o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56072p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivInput.KeyboardType> f56073q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56074r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56075s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f56076t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f56077u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56078v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f56079w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f56080x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputTemplate> f56081y0;

    @NotNull
    public final Field<String> A;

    @NotNull
    public final Field<Expression<Boolean>> B;

    @NotNull
    public final Field<Expression<DivInput.KeyboardType>> C;

    @NotNull
    public final Field<DivLayoutProviderTemplate> D;

    @NotNull
    public final Field<Expression<Double>> E;

    @NotNull
    public final Field<Expression<Long>> F;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> G;

    @NotNull
    public final Field<DivInputMaskTemplate> H;

    @NotNull
    public final Field<Expression<Long>> I;

    @NotNull
    public final Field<Expression<Long>> J;

    @NotNull
    public final Field<NativeInterfaceTemplate> K;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> L;

    @NotNull
    public final Field<Expression<String>> M;

    @NotNull
    public final Field<Expression<Long>> N;

    @NotNull
    public final Field<Expression<Boolean>> O;

    @NotNull
    public final Field<List<DivActionTemplate>> P;

    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> Q;

    @NotNull
    public final Field<Expression<DivAlignmentVertical>> R;

    @NotNull
    public final Field<Expression<Integer>> S;

    @NotNull
    public final Field<String> T;

    @NotNull
    public final Field<List<DivTooltipTemplate>> U;

    @NotNull
    public final Field<DivTransformTemplate> V;

    @NotNull
    public final Field<DivChangeTransitionTemplate> W;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> X;

    @NotNull
    public final Field<DivAppearanceTransitionTemplate> Y;

    @NotNull
    public final Field<List<DivTransitionTrigger>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f56082a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivInputValidatorTemplate>> f56083a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f56084b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTriggerTemplate>> f56085b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f56086c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVariableTemplate>> f56087c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56088d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivVisibility>> f56089d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f56090e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public final Field<DivVisibilityActionTemplate> f56091e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivInput.Autocapitalization>> f56092f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f56093f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f56094g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f56095g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f56096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f56098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivInput.EnterKeyType>> f56100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f56101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivInputFilterTemplate>> f56102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f56103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f56106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONObject>> f56107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivFontWeight>> f56108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f56110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f56111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56114z;

    /* JADX INFO: compiled from: DivInputTemplate.kt */
    public static final class NativeInterfaceTemplate implements JSONSerializable, JsonTemplate<DivInput.NativeInterface> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f56115b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, NativeInterfaceTemplate> f56116c = new sn.p<ParsingEnvironment, JSONObject, NativeInterfaceTemplate>() { // from class: com.yandex.div2.DivInputTemplate$NativeInterfaceTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInputTemplate.NativeInterfaceTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivInputTemplate.NativeInterfaceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f56117a;

        /* JADX INFO: compiled from: DivInputTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public NativeInterfaceTemplate(@NotNull Field<Expression<Integer>> field) {
            this.f56117a = field;
        }

        public NativeInterfaceTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable NativeInterfaceTemplate nativeInterfaceTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            this(Field.Companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : nativeInterfaceTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().z4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivInputTemplate.kt */
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
        f56065i0 = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f56066j0 = Expression.Companion.constant$default(companion, DivInput.Autocapitalization.AUTO, null, 2, null);
        f56067k0 = Expression.Companion.constant$default(companion, DivInput.EnterKeyType.DEFAULT, null, 2, null);
        f56068l0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f56069m0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f56070n0 = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f56071o0 = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f56072p0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f56073q0 = Expression.Companion.constant$default(companion, DivInput.KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        f56074r0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56075s0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f56076t0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        f56077u0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f56078v0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f56079w0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f56080x0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f56081y0 = new sn.p<ParsingEnvironment, JSONObject, DivInputTemplate>() { // from class: com.yandex.div2.DivInputTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInputTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivInputTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivInputTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<Expression<DivInput.Autocapitalization>> field6, @NotNull Field<List<DivBackgroundTemplate>> field7, @NotNull Field<DivBorderTemplate> field8, @NotNull Field<Expression<Long>> field9, @NotNull Field<List<DivDisappearActionTemplate>> field10, @NotNull Field<List<DivActionTemplate>> field11, @NotNull Field<Expression<DivInput.EnterKeyType>> field12, @NotNull Field<List<DivExtensionTemplate>> field13, @NotNull Field<List<DivInputFilterTemplate>> field14, @NotNull Field<DivFocusTemplate> field15, @NotNull Field<Expression<String>> field16, @NotNull Field<Expression<Long>> field17, @NotNull Field<Expression<DivSizeUnit>> field18, @NotNull Field<Expression<JSONObject>> field19, @NotNull Field<Expression<DivFontWeight>> field20, @NotNull Field<Expression<Long>> field21, @NotNull Field<List<DivFunctionTemplate>> field22, @NotNull Field<DivSizeTemplate> field23, @NotNull Field<Expression<Integer>> field24, @NotNull Field<Expression<Integer>> field25, @NotNull Field<Expression<String>> field26, @NotNull Field<String> field27, @NotNull Field<Expression<Boolean>> field28, @NotNull Field<Expression<DivInput.KeyboardType>> field29, @NotNull Field<DivLayoutProviderTemplate> field30, @NotNull Field<Expression<Double>> field31, @NotNull Field<Expression<Long>> field32, @NotNull Field<DivEdgeInsetsTemplate> field33, @NotNull Field<DivInputMaskTemplate> field34, @NotNull Field<Expression<Long>> field35, @NotNull Field<Expression<Long>> field36, @NotNull Field<NativeInterfaceTemplate> field37, @NotNull Field<DivEdgeInsetsTemplate> field38, @NotNull Field<Expression<String>> field39, @NotNull Field<Expression<Long>> field40, @NotNull Field<Expression<Boolean>> field41, @NotNull Field<List<DivActionTemplate>> field42, @NotNull Field<Expression<DivAlignmentHorizontal>> field43, @NotNull Field<Expression<DivAlignmentVertical>> field44, @NotNull Field<Expression<Integer>> field45, @NotNull Field<String> field46, @NotNull Field<List<DivTooltipTemplate>> field47, @NotNull Field<DivTransformTemplate> field48, @NotNull Field<DivChangeTransitionTemplate> field49, @NotNull Field<DivAppearanceTransitionTemplate> field50, @NotNull Field<DivAppearanceTransitionTemplate> field51, @NotNull Field<List<DivTransitionTrigger>> field52, @NotNull Field<List<DivInputValidatorTemplate>> field53, @NotNull Field<List<DivTriggerTemplate>> field54, @NotNull Field<List<DivVariableTemplate>> field55, @NotNull Field<Expression<DivVisibility>> field56, @NotNull Field<DivVisibilityActionTemplate> field57, @NotNull Field<List<DivVisibilityActionTemplate>> field58, @NotNull Field<DivSizeTemplate> field59) {
        this.f56082a = field;
        this.f56084b = field2;
        this.f56086c = field3;
        this.f56088d = field4;
        this.f56090e = field5;
        this.f56092f = field6;
        this.f56094g = field7;
        this.f56096h = field8;
        this.f56097i = field9;
        this.f56098j = field10;
        this.f56099k = field11;
        this.f56100l = field12;
        this.f56101m = field13;
        this.f56102n = field14;
        this.f56103o = field15;
        this.f56104p = field16;
        this.f56105q = field17;
        this.f56106r = field18;
        this.f56107s = field19;
        this.f56108t = field20;
        this.f56109u = field21;
        this.f56110v = field22;
        this.f56111w = field23;
        this.f56112x = field24;
        this.f56113y = field25;
        this.f56114z = field26;
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
        this.f56083a0 = field53;
        this.f56085b0 = field54;
        this.f56087c0 = field55;
        this.f56089d0 = field56;
        this.f56091e0 = field57;
        this.f56093f0 = field58;
        this.f56095g0 = field59;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivInputTemplate divInputTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivInputTemplate(ParsingEnvironment parsingEnvironment, DivInputTemplate divInputTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
