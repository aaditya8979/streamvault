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

/* JADX INFO: compiled from: DivCustomTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCustomTemplate implements JSONSerializable, JsonTemplate<DivCustom> {

    @NotNull
    public static final a J = new a(null);

    @NotNull
    public static final Expression<Double> K;

    @NotNull
    public static final DivSize.d L;

    @NotNull
    public static final Expression<DivVisibility> M;

    @NotNull
    public static final DivSize.c N;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCustomTemplate> O;

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
    public final Field<DivAccessibilityTemplate> f55051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f55059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<String> f55060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<String> f55066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTemplate>> f55067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f55068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f55071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTooltipTemplate>> f55074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivTransformTemplate> f55075y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<DivChangeTransitionTemplate> f55076z;

    /* JADX INFO: compiled from: DivCustomTemplate.kt */
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
        M = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        N = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        O = new sn.p<ParsingEnvironment, JSONObject, DivCustomTemplate>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCustomTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivCustomTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivCustomTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<JSONObject> field9, @NotNull Field<String> field10, @NotNull Field<List<DivDisappearActionTemplate>> field11, @NotNull Field<List<DivExtensionTemplate>> field12, @NotNull Field<DivFocusTemplate> field13, @NotNull Field<List<DivFunctionTemplate>> field14, @NotNull Field<DivSizeTemplate> field15, @NotNull Field<String> field16, @NotNull Field<List<DivTemplate>> field17, @NotNull Field<DivLayoutProviderTemplate> field18, @NotNull Field<DivEdgeInsetsTemplate> field19, @NotNull Field<DivEdgeInsetsTemplate> field20, @NotNull Field<Expression<String>> field21, @NotNull Field<Expression<Long>> field22, @NotNull Field<List<DivActionTemplate>> field23, @NotNull Field<List<DivTooltipTemplate>> field24, @NotNull Field<DivTransformTemplate> field25, @NotNull Field<DivChangeTransitionTemplate> field26, @NotNull Field<DivAppearanceTransitionTemplate> field27, @NotNull Field<DivAppearanceTransitionTemplate> field28, @NotNull Field<List<DivTransitionTrigger>> field29, @NotNull Field<List<DivTriggerTemplate>> field30, @NotNull Field<List<DivVariableTemplate>> field31, @NotNull Field<Expression<DivVisibility>> field32, @NotNull Field<DivVisibilityActionTemplate> field33, @NotNull Field<List<DivVisibilityActionTemplate>> field34, @NotNull Field<DivSizeTemplate> field35) {
        this.f55051a = field;
        this.f55052b = field2;
        this.f55053c = field3;
        this.f55054d = field4;
        this.f55055e = field5;
        this.f55056f = field6;
        this.f55057g = field7;
        this.f55058h = field8;
        this.f55059i = field9;
        this.f55060j = field10;
        this.f55061k = field11;
        this.f55062l = field12;
        this.f55063m = field13;
        this.f55064n = field14;
        this.f55065o = field15;
        this.f55066p = field16;
        this.f55067q = field17;
        this.f55068r = field18;
        this.f55069s = field19;
        this.f55070t = field20;
        this.f55071u = field21;
        this.f55072v = field22;
        this.f55073w = field23;
        this.f55074x = field24;
        this.f55075y = field25;
        this.f55076z = field26;
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
    public DivCustomTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCustomTemplate divCustomTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCustomTemplate(ParsingEnvironment parsingEnvironment, DivCustomTemplate divCustomTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCustomTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
