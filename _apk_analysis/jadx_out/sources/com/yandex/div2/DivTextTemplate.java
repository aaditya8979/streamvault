package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTextTemplate implements JSONSerializable, JsonTemplate<DivText> {

    @NotNull
    public static final Expression<DivLineStyle> A0;

    @NotNull
    public static final Expression<DivAlignmentHorizontal> B0;

    @NotNull
    public static final Expression<DivAlignmentVertical> C0;

    @NotNull
    public static final Expression<Integer> D0;

    @NotNull
    public static final Expression<Boolean> E0;

    @NotNull
    public static final Expression<DivText.Truncate> F0;

    @NotNull
    public static final Expression<DivLineStyle> G0;

    @NotNull
    public static final Expression<DivVisibility> H0;

    @NotNull
    public static final DivSize.c I0;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextTemplate> J0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final a f57852r0 = new a(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f57853s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57854t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57855u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57856v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f57857w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f57858x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57859y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57860z0;

    @NotNull
    public final Field<List<DivFunctionTemplate>> A;

    @NotNull
    public final Field<DivSizeTemplate> B;

    @NotNull
    public final Field<List<DivActionTemplate>> C;

    @NotNull
    public final Field<List<DivActionTemplate>> D;

    @NotNull
    public final Field<String> E;

    @NotNull
    public final Field<List<ImageTemplate>> F;

    @NotNull
    public final Field<DivLayoutProviderTemplate> G;

    @NotNull
    public final Field<Expression<Double>> H;

    @NotNull
    public final Field<Expression<Long>> I;

    @NotNull
    public final Field<List<DivActionTemplate>> J;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> K;

    @NotNull
    public final Field<Expression<Long>> L;

    @NotNull
    public final Field<Expression<Long>> M;

    @NotNull
    public final Field<DivEdgeInsetsTemplate> N;

    @NotNull
    public final Field<List<DivActionTemplate>> O;

    @NotNull
    public final Field<List<DivActionTemplate>> P;

    @NotNull
    public final Field<List<RangeTemplate>> Q;

    @NotNull
    public final Field<Expression<String>> R;

    @NotNull
    public final Field<Expression<Long>> S;

    @NotNull
    public final Field<Expression<Boolean>> T;

    @NotNull
    public final Field<List<DivActionTemplate>> U;

    @NotNull
    public final Field<Expression<DivLineStyle>> V;

    @NotNull
    public final Field<Expression<String>> W;

    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> X;

    @NotNull
    public final Field<Expression<DivAlignmentVertical>> Y;

    @NotNull
    public final Field<Expression<Integer>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibilityTemplate> f57861a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Field<DivTextGradientTemplate> f57862a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTemplate> f57863b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final Field<DivShadowTemplate> f57864b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f57865c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57866c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57867d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTooltipTemplate>> f57868d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f57869e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public final Field<DivTransformTemplate> f57870e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f57871f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public final Field<DivChangeTransitionTemplate> f57872f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57873g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f57874g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAnimatorTemplate>> f57875h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f57876h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57877i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTransitionTrigger>> f57878i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f57879j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivText.Truncate>> f57880j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f57881k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivLineStyle>> f57882k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57883l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTriggerTemplate>> f57884l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57885m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVariableTemplate>> f57886m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f57887n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivVisibility>> f57888n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57889o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public final Field<DivVisibilityActionTemplate> f57890o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Field<EllipsisTemplate> f57891p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f57892p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Field<List<DivExtensionTemplate>> f57893q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeTemplate> f57894q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Field<DivFocusTemplate> f57895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f57898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f57900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONObject>> f57901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivFontWeight>> f57902y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57903z;

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class EllipsisTemplate implements JSONSerializable, JsonTemplate<DivText.Ellipsis> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f57904e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, EllipsisTemplate> f57905f = new sn.p<ParsingEnvironment, JSONObject, EllipsisTemplate>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextTemplate.EllipsisTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextTemplate.EllipsisTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<List<DivActionTemplate>> f57906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<List<ImageTemplate>> f57907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<List<RangeTemplate>> f57908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57909d;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public EllipsisTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<List<ImageTemplate>> field2, @NotNull Field<List<RangeTemplate>> field3, @NotNull Field<Expression<String>> field4) {
            this.f57906a = field;
            this.f57907b = field2;
            this.f57908c = field3;
            this.f57909d = field4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EllipsisTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable EllipsisTemplate ellipsisTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this((Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<ImageTemplate>>) companion.nullField(false), (Field<List<RangeTemplate>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : ellipsisTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().e8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class ImageTemplate implements JSONSerializable, JsonTemplate<DivText.Image> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final a f57910k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final Expression<DivTextAlignmentVertical> f57911l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57912m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final Expression<DivText.Image.IndexingDirection> f57913n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f57914o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final Expression<DivBlendMode> f57915p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57916q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ImageTemplate> f57917r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<AccessibilityTemplate> f57918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivTextAlignmentVertical>> f57919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<DivFixedSizeTemplate> f57920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivText.Image.IndexingDirection>> f57921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Boolean>> f57922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivBlendMode>> f57925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Uri>> f57926i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Field<DivFixedSizeTemplate> f57927j;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class AccessibilityTemplate implements JSONSerializable, JsonTemplate<DivText.Image.Accessibility> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public static final a f57928c = new a(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public static final DivText.Image.Accessibility.Type f57929d = DivText.Image.Accessibility.Type.AUTO;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public static final sn.p<ParsingEnvironment, JSONObject, AccessibilityTemplate> f57930e = new sn.p<ParsingEnvironment, JSONObject, AccessibilityTemplate>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$AccessibilityTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.ImageTemplate.AccessibilityTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Field<Expression<String>> f57931a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Field<DivText.Image.Accessibility.Type> f57932b;

            /* JADX INFO: compiled from: DivTextTemplate.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }
            }

            public AccessibilityTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<DivText.Image.Accessibility.Type> field2) {
                this.f57931a = field;
                this.f57932b = field2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AccessibilityTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable AccessibilityTemplate accessibilityTemplate, boolean z10, @NotNull JSONObject jSONObject) {
                Field.Companion companion = Field.Companion;
                this(companion.nullField(false), companion.nullField(false));
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }

            public /* synthetic */ AccessibilityTemplate(ParsingEnvironment parsingEnvironment, AccessibilityTemplate accessibilityTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
                this(parsingEnvironment, (i10 & 2) != 0 ? null : accessibilityTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
            }

            @Override // com.yandex.div.json.JSONSerializable
            @NotNull
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().k8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* JADX INFO: compiled from: DivTextTemplate.kt */
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
            f57911l = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i10 = 1;
            f57912m = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f57913n = Expression.Companion.constant$default(companion, DivText.Image.IndexingDirection.NORMAL, null, 2, null);
            f57914o = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            f57915p = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            f57916q = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f57917r = new sn.p<ParsingEnvironment, JSONObject, ImageTemplate>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.ImageTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public ImageTemplate(@NotNull Field<AccessibilityTemplate> field, @NotNull Field<Expression<DivTextAlignmentVertical>> field2, @NotNull Field<DivFixedSizeTemplate> field3, @NotNull Field<Expression<DivText.Image.IndexingDirection>> field4, @NotNull Field<Expression<Boolean>> field5, @NotNull Field<Expression<Long>> field6, @NotNull Field<Expression<Integer>> field7, @NotNull Field<Expression<DivBlendMode>> field8, @NotNull Field<Expression<Uri>> field9, @NotNull Field<DivFixedSizeTemplate> field10) {
            this.f57918a = field;
            this.f57919b = field2;
            this.f57920c = field3;
            this.f57921d = field4;
            this.f57922e = field5;
            this.f57923f = field6;
            this.f57924g = field7;
            this.f57925h = field8;
            this.f57926i = field9;
            this.f57927j = field10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ImageTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ImageTemplate imageTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : imageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().n8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate<DivText.Range> {

        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, RangeTemplate> A;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public static final a f57933w = new a(null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public static final Expression<Double> f57934x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        public static final Expression<DivSizeUnit> f57935y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NotNull
        public static final Expression<Long> f57936z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<List<DivActionTemplate>> f57937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivTextAlignmentVertical>> f57938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<DivTextRangeBackgroundTemplate> f57939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f57940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<DivTextRangeBorderTemplate> f57941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f57944h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57945i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivSizeUnit>> f57946j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Field<Expression<JSONObject>> f57947k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivFontWeight>> f57948l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57949m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Double>> f57950n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57951o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final Field<DivTextRangeMaskTemplate> f57952p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57953q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivLineStyle>> f57954r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Integer>> f57955s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final Field<DivShadowTemplate> f57956t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f57957u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivLineStyle>> f57958v;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57934x = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f57935y = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f57936z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            A = new sn.p<ParsingEnvironment, JSONObject, RangeTemplate>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.RangeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        public RangeTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<Expression<DivTextAlignmentVertical>> field2, @NotNull Field<DivTextRangeBackgroundTemplate> field3, @NotNull Field<Expression<Double>> field4, @NotNull Field<DivTextRangeBorderTemplate> field5, @NotNull Field<Expression<Long>> field6, @NotNull Field<Expression<String>> field7, @NotNull Field<Expression<String>> field8, @NotNull Field<Expression<Long>> field9, @NotNull Field<Expression<DivSizeUnit>> field10, @NotNull Field<Expression<JSONObject>> field11, @NotNull Field<Expression<DivFontWeight>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<Expression<Double>> field14, @NotNull Field<Expression<Long>> field15, @NotNull Field<DivTextRangeMaskTemplate> field16, @NotNull Field<Expression<Long>> field17, @NotNull Field<Expression<DivLineStyle>> field18, @NotNull Field<Expression<Integer>> field19, @NotNull Field<DivShadowTemplate> field20, @NotNull Field<Expression<Long>> field21, @NotNull Field<Expression<DivLineStyle>> field22) {
            this.f57937a = field;
            this.f57938b = field2;
            this.f57939c = field3;
            this.f57940d = field4;
            this.f57941e = field5;
            this.f57942f = field6;
            this.f57943g = field7;
            this.f57944h = field8;
            this.f57945i = field9;
            this.f57946j = field10;
            this.f57947k = field11;
            this.f57948l = field12;
            this.f57949m = field13;
            this.f57950n = field14;
            this.f57951o = field15;
            this.f57952p = field16;
            this.f57953q = field17;
            this.f57954r = field18;
            this.f57955s = field19;
            this.f57956t = field20;
            this.f57957u = field21;
            this.f57958v = field22;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RangeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable RangeTemplate rangeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : rangeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().z8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
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
        f57853s0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f57854t0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f57855u0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57856v0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f57857w0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f57858x0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f57859y0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f57860z0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        A0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        B0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        C0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        D0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        E0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        F0 = Expression.Companion.constant$default(companion, DivText.Truncate.END, null, 2, null);
        G0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        H0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        I0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        J0 = new sn.p<ParsingEnvironment, JSONObject, DivTextTemplate>() { // from class: com.yandex.div2.DivTextTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivTextTemplate(@NotNull Field<DivAccessibilityTemplate> field, @NotNull Field<DivActionTemplate> field2, @NotNull Field<DivAnimationTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivAlignmentHorizontal>> field5, @NotNull Field<Expression<DivAlignmentVertical>> field6, @NotNull Field<Expression<Double>> field7, @NotNull Field<List<DivAnimatorTemplate>> field8, @NotNull Field<Expression<Boolean>> field9, @NotNull Field<List<DivBackgroundTemplate>> field10, @NotNull Field<DivBorderTemplate> field11, @NotNull Field<Expression<Boolean>> field12, @NotNull Field<Expression<Long>> field13, @NotNull Field<List<DivDisappearActionTemplate>> field14, @NotNull Field<List<DivActionTemplate>> field15, @NotNull Field<EllipsisTemplate> field16, @NotNull Field<List<DivExtensionTemplate>> field17, @NotNull Field<DivFocusTemplate> field18, @NotNull Field<Expression<Integer>> field19, @NotNull Field<Expression<String>> field20, @NotNull Field<Expression<String>> field21, @NotNull Field<Expression<Long>> field22, @NotNull Field<Expression<DivSizeUnit>> field23, @NotNull Field<Expression<JSONObject>> field24, @NotNull Field<Expression<DivFontWeight>> field25, @NotNull Field<Expression<Long>> field26, @NotNull Field<List<DivFunctionTemplate>> field27, @NotNull Field<DivSizeTemplate> field28, @NotNull Field<List<DivActionTemplate>> field29, @NotNull Field<List<DivActionTemplate>> field30, @NotNull Field<String> field31, @NotNull Field<List<ImageTemplate>> field32, @NotNull Field<DivLayoutProviderTemplate> field33, @NotNull Field<Expression<Double>> field34, @NotNull Field<Expression<Long>> field35, @NotNull Field<List<DivActionTemplate>> field36, @NotNull Field<DivEdgeInsetsTemplate> field37, @NotNull Field<Expression<Long>> field38, @NotNull Field<Expression<Long>> field39, @NotNull Field<DivEdgeInsetsTemplate> field40, @NotNull Field<List<DivActionTemplate>> field41, @NotNull Field<List<DivActionTemplate>> field42, @NotNull Field<List<RangeTemplate>> field43, @NotNull Field<Expression<String>> field44, @NotNull Field<Expression<Long>> field45, @NotNull Field<Expression<Boolean>> field46, @NotNull Field<List<DivActionTemplate>> field47, @NotNull Field<Expression<DivLineStyle>> field48, @NotNull Field<Expression<String>> field49, @NotNull Field<Expression<DivAlignmentHorizontal>> field50, @NotNull Field<Expression<DivAlignmentVertical>> field51, @NotNull Field<Expression<Integer>> field52, @NotNull Field<DivTextGradientTemplate> field53, @NotNull Field<DivShadowTemplate> field54, @NotNull Field<Expression<Boolean>> field55, @NotNull Field<List<DivTooltipTemplate>> field56, @NotNull Field<DivTransformTemplate> field57, @NotNull Field<DivChangeTransitionTemplate> field58, @NotNull Field<DivAppearanceTransitionTemplate> field59, @NotNull Field<DivAppearanceTransitionTemplate> field60, @NotNull Field<List<DivTransitionTrigger>> field61, @NotNull Field<Expression<DivText.Truncate>> field62, @NotNull Field<Expression<DivLineStyle>> field63, @NotNull Field<List<DivTriggerTemplate>> field64, @NotNull Field<List<DivVariableTemplate>> field65, @NotNull Field<Expression<DivVisibility>> field66, @NotNull Field<DivVisibilityActionTemplate> field67, @NotNull Field<List<DivVisibilityActionTemplate>> field68, @NotNull Field<DivSizeTemplate> field69) {
        this.f57861a = field;
        this.f57863b = field2;
        this.f57865c = field3;
        this.f57867d = field4;
        this.f57869e = field5;
        this.f57871f = field6;
        this.f57873g = field7;
        this.f57875h = field8;
        this.f57877i = field9;
        this.f57879j = field10;
        this.f57881k = field11;
        this.f57883l = field12;
        this.f57885m = field13;
        this.f57887n = field14;
        this.f57889o = field15;
        this.f57891p = field16;
        this.f57893q = field17;
        this.f57895r = field18;
        this.f57896s = field19;
        this.f57897t = field20;
        this.f57898u = field21;
        this.f57899v = field22;
        this.f57900w = field23;
        this.f57901x = field24;
        this.f57902y = field25;
        this.f57903z = field26;
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
        this.f57862a0 = field53;
        this.f57864b0 = field54;
        this.f57866c0 = field55;
        this.f57868d0 = field56;
        this.f57870e0 = field57;
        this.f57872f0 = field58;
        this.f57874g0 = field59;
        this.f57876h0 = field60;
        this.f57878i0 = field61;
        this.f57880j0 = field62;
        this.f57882k0 = field63;
        this.f57884l0 = field64;
        this.f57886m0 = field65;
        this.f57888n0 = field66;
        this.f57890o0 = field67;
        this.f57892p0 = field68;
        this.f57894q0 = field69;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTextTemplate divTextTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTextTemplate(ParsingEnvironment parsingEnvironment, DivTextTemplate divTextTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
