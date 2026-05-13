package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGalleryTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivGalleryTemplate implements JSONSerializable, JsonTemplate<DivGallery> {

    @NotNull
    public static final a R = new a(null);

    @NotNull
    public static final Expression<Double> S;

    @NotNull
    public static final Expression<DivGallery.CrossContentAlignment> T;

    @NotNull
    public static final Expression<Long> U;

    @NotNull
    public static final DivSize.d V;

    @NotNull
    public static final Expression<Long> W;

    @NotNull
    public static final Expression<DivGallery.Orientation> X;

    @NotNull
    public static final Expression<Boolean> Y;

    @NotNull
    public static final Expression<DivGallery.ScrollMode> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivGallery.Scrollbar> f55465a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55466b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55467c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivGalleryTemplate> f55468d0;

    @NotNull
    public final Field<Expression<String>> A;

    @NotNull
    public final Field<Expression<Long>> B;

    @NotNull
    public final Field<Expression<DivGallery.ScrollMode>> C;

    @NotNull
    public final Field<Expression<DivGallery.Scrollbar>> D;

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
    public final Field<DivAccessibilityTemplate> f55469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f55473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivGallery.CrossContentAlignment>> f55478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f55481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f55482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f55483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f55485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<String> f55486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivCollectionItemBuilderTemplate> f55487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTemplate>> f55489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f55490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivGallery.Orientation>> f55492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f55493y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55494z;

    /* JADX INFO: compiled from: DivGalleryTemplate.kt */
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
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        T = Expression.Companion.constant$default(companion, DivGallery.CrossContentAlignment.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        X = Expression.Companion.constant$default(companion, DivGallery.Orientation.HORIZONTAL, null, 2, null);
        Y = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, DivGallery.ScrollMode.DEFAULT, null, 2, null);
        f55465a0 = Expression.Companion.constant$default(companion, DivGallery.Scrollbar.NONE, null, 2, null);
        f55466b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55467c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f55468d0 = new sn.p<ParsingEnvironment, JSONObject, DivGalleryTemplate>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGalleryTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivGalleryTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivGalleryTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<Expression<Long>> field9, @NotNull Field<Expression<DivGallery.CrossContentAlignment>> field10, @NotNull Field<Expression<Long>> field11, @NotNull Field<Expression<Long>> field12, @NotNull Field<List<DivDisappearActionTemplate>> field13, @NotNull Field<List<DivExtensionTemplate>> field14, @NotNull Field<DivFocusTemplate> field15, @NotNull Field<List<DivFunctionTemplate>> field16, @NotNull Field<DivSizeTemplate> field17, @NotNull Field<String> field18, @NotNull Field<DivCollectionItemBuilderTemplate> field19, @NotNull Field<Expression<Long>> field20, @NotNull Field<List<DivTemplate>> field21, @NotNull Field<DivLayoutProviderTemplate> field22, @NotNull Field<DivEdgeInsetsTemplate> field23, @NotNull Field<Expression<DivGallery.Orientation>> field24, @NotNull Field<DivEdgeInsetsTemplate> field25, @NotNull Field<Expression<Boolean>> field26, @NotNull Field<Expression<String>> field27, @NotNull Field<Expression<Long>> field28, @NotNull Field<Expression<DivGallery.ScrollMode>> field29, @NotNull Field<Expression<DivGallery.Scrollbar>> field30, @NotNull Field<List<DivActionTemplate>> field31, @NotNull Field<List<DivTooltipTemplate>> field32, @NotNull Field<DivTransformTemplate> field33, @NotNull Field<DivChangeTransitionTemplate> field34, @NotNull Field<DivAppearanceTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<List<DivTransitionTrigger>> field37, @NotNull Field<List<DivTriggerTemplate>> field38, @NotNull Field<List<DivVariableTemplate>> field39, @NotNull Field<Expression<DivVisibility>> field40, @NotNull Field<DivVisibilityActionTemplate> field41, @NotNull Field<List<DivVisibilityActionTemplate>> field42, @NotNull Field<DivSizeTemplate> field43) {
        this.f55469a = field;
        this.f55470b = field2;
        this.f55471c = field3;
        this.f55472d = field4;
        this.f55473e = field5;
        this.f55474f = field6;
        this.f55475g = field7;
        this.f55476h = field8;
        this.f55477i = field9;
        this.f55478j = field10;
        this.f55479k = field11;
        this.f55480l = field12;
        this.f55481m = field13;
        this.f55482n = field14;
        this.f55483o = field15;
        this.f55484p = field16;
        this.f55485q = field17;
        this.f55486r = field18;
        this.f55487s = field19;
        this.f55488t = field20;
        this.f55489u = field21;
        this.f55490v = field22;
        this.f55491w = field23;
        this.f55492x = field24;
        this.f55493y = field25;
        this.f55494z = field26;
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
    public DivGalleryTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivGalleryTemplate divGalleryTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivGalleryTemplate(ParsingEnvironment parsingEnvironment, DivGalleryTemplate divGalleryTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGalleryTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
