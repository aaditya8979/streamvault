package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTabsTemplate implements JSONSerializable, JsonTemplate<DivTabs> {

    @NotNull
    public static final a R = new a(null);

    @NotNull
    public static final Expression<Double> S;

    @NotNull
    public static final Expression<Boolean> T;

    @NotNull
    public static final Expression<Boolean> U;

    @NotNull
    public static final DivSize.d V;

    @NotNull
    public static final Expression<Boolean> W;

    @NotNull
    public static final Expression<Long> X;

    @NotNull
    public static final Expression<Integer> Y;

    @NotNull
    public static final DivEdgeInsets Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57510a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final DivEdgeInsets f57511b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f57512c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f57513d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTabsTemplate> f57514e0;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> A;

    @NotNull
    public final Field<Expression<Boolean>> B;

    @NotNull
    public final Field<TabTitleDelimiterTemplate> C;

    @NotNull
    public final Field<TabTitleStyleTemplate> D;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> E;

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
    public final Field<DivAccessibilityTemplate> f57515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f57516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f57517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f57519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f57520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f57521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f57523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f57525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f57526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f57527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f57529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<String> f57530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<ItemTemplate>> f57531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<DivLayoutProviderTemplate> f57532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f57534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57540z;

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class ItemTemplate implements JSONSerializable, JsonTemplate<DivTabs.Item> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f57541d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ItemTemplate> f57542e = new sn.p<ParsingEnvironment, JSONObject, ItemTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabsTemplate.ItemTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTabsTemplate.ItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivTemplate> f57543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<DivActionTemplate> f57545c;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public ItemTemplate(@NotNull Field<DivTemplate> field, @NotNull Field<Expression<String>> field2, @NotNull Field<DivActionTemplate> field3) {
            this.f57543a = field;
            this.f57544b = field2;
            this.f57545c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ItemTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ItemTemplate itemTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : itemTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().S7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class TabTitleDelimiterTemplate implements JSONSerializable, JsonTemplate<DivTabs.TabTitleDelimiter> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f57546d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TabTitleDelimiterTemplate> f57549g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivFixedSizeTemplate> f57550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Uri>> f57551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<DivFixedSizeTemplate> f57552c;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
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
            int i10 = 1;
            f57547e = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f57548f = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f57549g = new sn.p<ParsingEnvironment, JSONObject, TabTitleDelimiterTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleDelimiterTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabsTemplate.TabTitleDelimiterTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleDelimiterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public TabTitleDelimiterTemplate(@NotNull Field<DivFixedSizeTemplate> field, @NotNull Field<Expression<Uri>> field2, @NotNull Field<DivFixedSizeTemplate> field3) {
            this.f57550a = field;
            this.f57551b = field2;
            this.f57552c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TabTitleDelimiterTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ TabTitleDelimiterTemplate(ParsingEnvironment parsingEnvironment, TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : tabTitleDelimiterTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().Y7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class TabTitleStyleTemplate implements JSONSerializable, JsonTemplate<DivTabs.TabTitleStyle> {

        @NotNull
        public static final Expression<DivSizeUnit> A;

        @NotNull
        public static final Expression<DivFontWeight> B;

        @NotNull
        public static final Expression<Integer> C;

        @NotNull
        public static final Expression<Long> D;

        @NotNull
        public static final Expression<Double> E;

        @NotNull
        public static final DivEdgeInsets F;

        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, TabTitleStyleTemplate> G;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public static final a f57553u = new a(null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57554v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public static final Expression<Integer> f57555w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57556x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        public static final Expression<DivTabs.TabTitleStyle.AnimationType> f57557y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57558z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<JSONObject>> f57560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivFontWeight>> f57561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivTabs.TabTitleStyle.AnimationType>> f57564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Field<DivCornersRadiusTemplate> f57566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57567i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57568j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivSizeUnit>> f57569k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivFontWeight>> f57570l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57571m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final Field<Expression<JSONObject>> f57572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivFontWeight>> f57573o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57575q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f57576r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57577s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final Field<DivEdgeInsetsTemplate> f57578t;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57554v = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f57555w = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f57556x = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f57557y = Expression.Companion.constant$default(companion, DivTabs.TabTitleStyle.AnimationType.SLIDE, null, 2, null);
            f57558z = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            A = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            B = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            C = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            D = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            E = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            F = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            G = new sn.p<ParsingEnvironment, JSONObject, TabTitleStyleTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabsTemplate.TabTitleStyleTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public TabTitleStyleTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<JSONObject>> field2, @NotNull Field<Expression<DivFontWeight>> field3, @NotNull Field<Expression<Integer>> field4, @NotNull Field<Expression<Long>> field5, @NotNull Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6, @NotNull Field<Expression<Long>> field7, @NotNull Field<DivCornersRadiusTemplate> field8, @NotNull Field<Expression<String>> field9, @NotNull Field<Expression<Long>> field10, @NotNull Field<Expression<DivSizeUnit>> field11, @NotNull Field<Expression<DivFontWeight>> field12, @NotNull Field<Expression<Integer>> field13, @NotNull Field<Expression<JSONObject>> field14, @NotNull Field<Expression<DivFontWeight>> field15, @NotNull Field<Expression<Integer>> field16, @NotNull Field<Expression<Long>> field17, @NotNull Field<Expression<Double>> field18, @NotNull Field<Expression<Long>> field19, @NotNull Field<DivEdgeInsetsTemplate> field20) {
            this.f57559a = field;
            this.f57560b = field2;
            this.f57561c = field3;
            this.f57562d = field4;
            this.f57563e = field5;
            this.f57564f = field6;
            this.f57565g = field7;
            this.f57566h = field8;
            this.f57567i = field9;
            this.f57568j = field10;
            this.f57569k = field11;
            this.f57570l = field12;
            this.f57571m = field13;
            this.f57572n = field14;
            this.f57573o = field15;
            this.f57574p = field16;
            this.f57575q = field17;
            this.f57576r = field18;
            this.f57577s = field19;
            this.f57578t = field20;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TabTitleStyleTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable TabTitleStyleTemplate tabTitleStyleTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : tabTitleStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().b8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
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
        Boolean bool = Boolean.FALSE;
        T = Expression.Companion.constant$default(companion, bool, null, 2, null);
        U = Expression.Companion.constant$default(companion, bool, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Y = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression expression = null;
        Expression expression2 = null;
        int i10 = 82;
        tn.i iVar = null;
        Z = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f57510a0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57511b0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f57512c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f57513d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f57514e0 = new sn.p<ParsingEnvironment, JSONObject, DivTabsTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabsTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTabsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivTabsTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<List<DivAnimatorTemplate>> field5, @NotNull Field<List<DivBackgroundTemplate>> field6, @NotNull Field<DivBorderTemplate> field7, @NotNull Field<Expression<Long>> field8, @NotNull Field<List<DivDisappearActionTemplate>> field9, @NotNull Field<Expression<Boolean>> field10, @NotNull Field<List<DivExtensionTemplate>> field11, @NotNull Field<DivFocusTemplate> field12, @NotNull Field<List<DivFunctionTemplate>> field13, @NotNull Field<Expression<Boolean>> field14, @NotNull Field<DivSizeTemplate> field15, @NotNull Field<String> field16, @NotNull Field<List<ItemTemplate>> field17, @NotNull Field<DivLayoutProviderTemplate> field18, @NotNull Field<DivEdgeInsetsTemplate> field19, @NotNull Field<DivEdgeInsetsTemplate> field20, @NotNull Field<Expression<Boolean>> field21, @NotNull Field<Expression<String>> field22, @NotNull Field<Expression<Long>> field23, @NotNull Field<List<DivActionTemplate>> field24, @NotNull Field<Expression<Long>> field25, @NotNull Field<Expression<Integer>> field26, @NotNull Field<DivEdgeInsetsTemplate> field27, @NotNull Field<Expression<Boolean>> field28, @NotNull Field<TabTitleDelimiterTemplate> field29, @NotNull Field<TabTitleStyleTemplate> field30, @NotNull Field<DivEdgeInsetsTemplate> field31, @NotNull Field<List<DivTooltipTemplate>> field32, @NotNull Field<DivTransformTemplate> field33, @NotNull Field<DivChangeTransitionTemplate> field34, @NotNull Field<DivAppearanceTransitionTemplate> field35, @NotNull Field<DivAppearanceTransitionTemplate> field36, @NotNull Field<List<DivTransitionTrigger>> field37, @NotNull Field<List<DivTriggerTemplate>> field38, @NotNull Field<List<DivVariableTemplate>> field39, @NotNull Field<Expression<DivVisibility>> field40, @NotNull Field<DivVisibilityActionTemplate> field41, @NotNull Field<List<DivVisibilityActionTemplate>> field42, @NotNull Field<DivSizeTemplate> field43) {
        this.f57515a = field;
        this.f57516b = field2;
        this.f57517c = field3;
        this.f57518d = field4;
        this.f57519e = field5;
        this.f57520f = field6;
        this.f57521g = field7;
        this.f57522h = field8;
        this.f57523i = field9;
        this.f57524j = field10;
        this.f57525k = field11;
        this.f57526l = field12;
        this.f57527m = field13;
        this.f57528n = field14;
        this.f57529o = field15;
        this.f57530p = field16;
        this.f57531q = field17;
        this.f57532r = field18;
        this.f57533s = field19;
        this.f57534t = field20;
        this.f57535u = field21;
        this.f57536v = field22;
        this.f57537w = field23;
        this.f57538x = field24;
        this.f57539y = field25;
        this.f57540z = field26;
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
    public DivTabsTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTabsTemplate divTabsTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTabsTemplate(ParsingEnvironment parsingEnvironment, DivTabsTemplate divTabsTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTabsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
