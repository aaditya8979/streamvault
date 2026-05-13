package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGalleryJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGalleryJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivGalleryJsonParser {

    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55436a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivGallery.CrossContentAlignment> f55438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivGallery.Orientation> f55442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivGallery.ScrollMode> f55444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivGallery.Scrollbar> f55445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivGallery.CrossContentAlignment> f55450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivGallery.Orientation> f55451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivGallery.ScrollMode> f55452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivGallery.Scrollbar> f55453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55460y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55461z;

    /* JADX INFO: compiled from: DivGalleryJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGalleryJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55462a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55462a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGallery deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55462a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivGalleryJsonParser.f55448m, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivGalleryJsonParser.f55449n, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGalleryJsonParser.f55455t;
            Expression<Double> expression = DivGalleryJsonParser.f55437b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55462a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55462a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55462a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_count", typeHelper2, lVar2, DivGalleryJsonParser.f55456u);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivGalleryJsonParser.f55457v);
            TypeHelper<DivGallery.CrossContentAlignment> typeHelper3 = DivGalleryJsonParser.f55450o;
            sn.l<String, DivGallery.CrossContentAlignment> lVar3 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression<DivGallery.CrossContentAlignment> expression2 = DivGalleryJsonParser.f55438c;
            Expression<DivGallery.CrossContentAlignment> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_content_alignment", typeHelper3, lVar3, expression2);
            Expression<DivGallery.CrossContentAlignment> expression3 = optionalExpression6 == null ? expression2 : optionalExpression6;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_spacing", typeHelper2, lVar2, DivGalleryJsonParser.f55458w);
            ValueValidator<Long> valueValidator2 = DivGalleryJsonParser.f55459x;
            Expression<Long> expression4 = DivGalleryJsonParser.f55439d;
            Expression<Long> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression8 != null) {
                expression4 = optionalExpression8;
            }
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55462a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55462a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55462a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55462a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55462a.Y6());
            if (divSize == null) {
                divSize = DivGalleryJsonParser.f55440e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f55462a.d2());
            ValueValidator<Long> valueValidator3 = DivGalleryJsonParser.f55460y;
            Expression<Long> expression5 = DivGalleryJsonParser.f55441f;
            Expression<Long> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression9 != null) {
                expression5 = optionalExpression9;
            }
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f55462a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55462a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55462a.Y2());
            TypeHelper<DivGallery.Orientation> typeHelper4 = DivGalleryJsonParser.f55451p;
            sn.l<String, DivGallery.Orientation> lVar4 = DivGallery.Orientation.FROM_STRING;
            Expression<DivGallery.Orientation> expression6 = DivGalleryJsonParser.f55442g;
            Expression<DivGallery.Orientation> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper4, lVar4, expression6);
            Expression<DivGallery.Orientation> expression7 = optionalExpression10 == null ? expression6 : optionalExpression10;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55462a.Y2());
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar5 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression8 = DivGalleryJsonParser.f55443h;
            Expression<Boolean> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper5, lVar5, expression8);
            Expression<Boolean> expression9 = optionalExpression11 == null ? expression8 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivGalleryJsonParser.f55461z);
            TypeHelper<DivGallery.ScrollMode> typeHelper6 = DivGalleryJsonParser.f55452q;
            sn.l<String, DivGallery.ScrollMode> lVar6 = DivGallery.ScrollMode.FROM_STRING;
            Expression<DivGallery.ScrollMode> expression10 = DivGalleryJsonParser.f55444i;
            Expression<DivGallery.ScrollMode> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_mode", typeHelper6, lVar6, expression10);
            Expression<DivGallery.ScrollMode> expression11 = optionalExpression14 == null ? expression10 : optionalExpression14;
            TypeHelper<DivGallery.Scrollbar> typeHelper7 = DivGalleryJsonParser.f55453r;
            sn.l<String, DivGallery.Scrollbar> lVar7 = DivGallery.Scrollbar.FROM_STRING;
            Expression<DivGallery.Scrollbar> expression12 = DivGalleryJsonParser.f55445j;
            Expression<DivGallery.Scrollbar> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scrollbar", typeHelper7, lVar7, expression12);
            Expression<DivGallery.Scrollbar> expression13 = optionalExpression15 == null ? expression12 : optionalExpression15;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55462a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55462a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55462a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55462a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55462a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55462a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGalleryJsonParser.A);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55462a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55462a.k9());
            TypeHelper<DivVisibility> typeHelper8 = DivGalleryJsonParser.f55454s;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivGalleryJsonParser.f55446k;
            Expression<DivVisibility> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, lVar8, expression14);
            Expression<DivVisibility> expression15 = optionalExpression16 == null ? expression14 : optionalExpression16;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55462a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55462a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55462a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGalleryJsonParser.f55447l;
            }
            return new DivGallery(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalExpression5, expression3, optionalExpression7, expression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, divCollectionItemBuilder, expression5, optionalList6, divLayoutProvider, divEdgeInsets, expression7, divEdgeInsets2, expression9, optionalExpression12, optionalExpression13, expression11, expression13, optionalList7, optionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression15, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGallery divGallery) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGallery.o(), this.f55462a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divGallery.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divGallery.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGallery.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGallery.w(), this.f55462a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divGallery.getBackground(), this.f55462a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGallery.x(), this.f55462a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGallery.f55413h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGallery.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_content_alignment", divGallery.f55415j, DivGallery.CrossContentAlignment.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_spacing", divGallery.f55416k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divGallery.f55417l);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGallery.k(), this.f55462a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGallery.getExtensions(), this.f55462a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGallery.n(), this.f55462a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGallery.u(), this.f55462a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGallery.getHeight(), this.f55462a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGallery.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divGallery.f55424s, this.f55462a.d2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divGallery.f55425t);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGallery.f55426u, this.f55462a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGallery.r(), this.f55462a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGallery.d(), this.f55462a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", divGallery.f55429x, DivGallery.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGallery.p(), this.f55462a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divGallery.f55431z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGallery.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGallery.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_mode", divGallery.C, DivGallery.ScrollMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scrollbar", divGallery.D, DivGallery.Scrollbar.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGallery.q(), this.f55462a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGallery.h(), this.f55462a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGallery.getTransform(), this.f55462a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGallery.j(), this.f55462a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGallery.v(), this.f55462a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGallery.i(), this.f55462a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGallery.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGallery.s(), this.f55462a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGallery.c(), this.f55462a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGallery.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGallery.t(), this.f55462a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGallery.a(), this.f55462a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGallery.getWidth(), this.f55462a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGalleryJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55463a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55463a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGalleryTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivGalleryTemplate divGalleryTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55469a : null, this.f55463a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivGalleryJsonParser.f55448m, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55470b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivGalleryJsonParser.f55449n, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55471c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55472d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGalleryJsonParser.f55455t);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55473e : null, this.f55463a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55474f : null, this.f55463a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55475g : null, this.f55463a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divGalleryTemplate != null ? divGalleryTemplate.f55476h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_count", typeHelper, allowPropertyOverride, field, lVar, DivGalleryJsonParser.f55456u);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55477i : null, lVar, DivGalleryJsonParser.f55457v);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_content_alignment", DivGalleryJsonParser.f55450o, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55478j : null, DivGallery.CrossContentAlignment.FROM_STRING);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_spacing", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55479k : null, lVar, DivGalleryJsonParser.f55458w);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55480l : null, lVar, DivGalleryJsonParser.f55459x);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55481m : null, this.f55463a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55482n : null, this.f55463a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55483o : null, this.f55463a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55484p : null, this.f55463a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55485q : null, this.f55463a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55486r : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55487s : null, this.f55463a.e2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55488t : null, lVar, DivGalleryJsonParser.f55460y);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55489u : null, this.f55463a.N4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55490v : null, this.f55463a.Q4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55491w : null, this.f55463a.Z2());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", DivGalleryJsonParser.f55451p, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55492x : null, DivGallery.Orientation.FROM_STRING);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55493y : null, this.f55463a.Z2());
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.f55494z : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.A : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.B : null, lVar, DivGalleryJsonParser.f55461z);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_mode", DivGalleryJsonParser.f55452q, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.C : null, DivGallery.ScrollMode.FROM_STRING);
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scrollbar", DivGalleryJsonParser.f55453r, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.D : null, DivGallery.Scrollbar.FROM_STRING);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.E : null, this.f55463a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.F : null, this.f55463a.Q8());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.G : null, this.f55463a.c9());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.H : null, this.f55463a.V1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.I : null, this.f55463a.A1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.J : null, this.f55463a.A1());
            Field<List<DivTransitionTrigger>> field2 = divGalleryTemplate != null ? divGalleryTemplate.K : null;
            sn.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivGalleryJsonParser.A;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGalleryTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalField6, optionalFieldWithExpression9, optionalListField6, optionalField7, optionalField8, optionalFieldWithExpression10, optionalField9, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalListField7, optionalListField8, optionalField10, optionalField11, optionalField12, optionalField13, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.L : null, this.f55463a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.M : null, this.f55463a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivGalleryJsonParser.f55454s, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.O : null, this.f55463a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.P : null, this.f55463a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.Q : null, this.f55463a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGalleryTemplate divGalleryTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGalleryTemplate.f55469a, this.f55463a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divGalleryTemplate.f55470b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divGalleryTemplate.f55471c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGalleryTemplate.f55472d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGalleryTemplate.f55473e, this.f55463a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divGalleryTemplate.f55474f, this.f55463a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGalleryTemplate.f55475g, this.f55463a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", divGalleryTemplate.f55476h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGalleryTemplate.f55477i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_content_alignment", divGalleryTemplate.f55478j, DivGallery.CrossContentAlignment.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_spacing", divGalleryTemplate.f55479k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", divGalleryTemplate.f55480l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGalleryTemplate.f55481m, this.f55463a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGalleryTemplate.f55482n, this.f55463a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGalleryTemplate.f55483o, this.f55463a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGalleryTemplate.f55484p, this.f55463a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGalleryTemplate.f55485q, this.f55463a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGalleryTemplate.f55486r);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divGalleryTemplate.f55487s, this.f55463a.e2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", divGalleryTemplate.f55488t);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divGalleryTemplate.f55489u, this.f55463a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGalleryTemplate.f55490v, this.f55463a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGalleryTemplate.f55491w, this.f55463a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", divGalleryTemplate.f55492x, DivGallery.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGalleryTemplate.f55493y, this.f55463a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divGalleryTemplate.f55494z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGalleryTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGalleryTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_mode", divGalleryTemplate.C, DivGallery.ScrollMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scrollbar", divGalleryTemplate.D, DivGallery.Scrollbar.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGalleryTemplate.E, this.f55463a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGalleryTemplate.F, this.f55463a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGalleryTemplate.G, this.f55463a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGalleryTemplate.H, this.f55463a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGalleryTemplate.I, this.f55463a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGalleryTemplate.J, this.f55463a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGalleryTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGalleryTemplate.L, this.f55463a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGalleryTemplate.M, this.f55463a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divGalleryTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGalleryTemplate.O, this.f55463a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGalleryTemplate.P, this.f55463a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGalleryTemplate.Q, this.f55463a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGalleryJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivGalleryTemplate, DivGallery> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55464a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55464a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGallery resolve(@NotNull ParsingContext parsingContext, @NotNull DivGalleryTemplate divGalleryTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55469a, jSONObject, "accessibility", this.f55464a.J(), this.f55464a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.f55470b, jSONObject, "alignment_horizontal", DivGalleryJsonParser.f55448m, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.f55471c, jSONObject, "alignment_vertical", DivGalleryJsonParser.f55449n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divGalleryTemplate.f55472d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGalleryJsonParser.f55455t;
            Expression<Double> expression = DivGalleryJsonParser.f55437b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55473e, jSONObject, "animators", this.f55464a.v1(), this.f55464a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55474f, jSONObject, A2.f64965g, this.f55464a.H1(), this.f55464a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55475g, jSONObject, OutlinedTextFieldKt.BorderId, this.f55464a.N1(), this.f55464a.L1());
            Field<Expression<Long>> field2 = divGalleryTemplate.f55476h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_count", typeHelper2, lVar2, DivGalleryJsonParser.f55456u);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.f55477i, jSONObject, "column_span", typeHelper2, lVar2, DivGalleryJsonParser.f55457v);
            Field<Expression<DivGallery.CrossContentAlignment>> field3 = divGalleryTemplate.f55478j;
            TypeHelper<DivGallery.CrossContentAlignment> typeHelper3 = DivGalleryJsonParser.f55450o;
            sn.l<String, DivGallery.CrossContentAlignment> lVar3 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression<DivGallery.CrossContentAlignment> expression2 = DivGalleryJsonParser.f55438c;
            Expression<DivGallery.CrossContentAlignment> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_content_alignment", typeHelper3, lVar3, expression2);
            Expression<DivGallery.CrossContentAlignment> expression3 = expressionResolveOptionalExpression6 == null ? expression2 : expressionResolveOptionalExpression6;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.f55479k, jSONObject, "cross_spacing", typeHelper2, lVar2, DivGalleryJsonParser.f55458w);
            Field<Expression<Long>> field4 = divGalleryTemplate.f55480l;
            ValueValidator<Long> valueValidator2 = DivGalleryJsonParser.f55459x;
            Expression<Long> expression4 = DivGalleryJsonParser.f55439d;
            Expression<Long> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression8 != null) {
                expression4 = expressionResolveOptionalExpression8;
            }
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55481m, jSONObject, "disappear_actions", this.f55464a.R2(), this.f55464a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55482n, jSONObject, "extensions", this.f55464a.d3(), this.f55464a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55483o, jSONObject, "focus", this.f55464a.B3(), this.f55464a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55484p, jSONObject, "functions", this.f55464a.K3(), this.f55464a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55485q, jSONObject, "height", this.f55464a.a7(), this.f55464a.Y6());
            if (divSize == null) {
                divSize = DivGalleryJsonParser.f55440e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55486r, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55487s, jSONObject, "item_builder", this.f55464a.f2(), this.f55464a.d2());
            Field<Expression<Long>> field5 = divGalleryTemplate.f55488t;
            ValueValidator<Long> valueValidator3 = DivGalleryJsonParser.f55460y;
            Expression<Long> expression5 = DivGalleryJsonParser.f55441f;
            Expression<Long> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "item_spacing", typeHelper2, lVar2, valueValidator3, expression5);
            if (expressionResolveOptionalExpression9 != null) {
                expression5 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.f55489u, jSONObject, "items", this.f55464a.O4(), this.f55464a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55490v, jSONObject, "layout_provider", this.f55464a.R4(), this.f55464a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55491w, jSONObject, "margins", this.f55464a.a3(), this.f55464a.Y2());
            Field<Expression<DivGallery.Orientation>> field6 = divGalleryTemplate.f55492x;
            TypeHelper<DivGallery.Orientation> typeHelper4 = DivGalleryJsonParser.f55451p;
            sn.l<String, DivGallery.Orientation> lVar4 = DivGallery.Orientation.FROM_STRING;
            Expression<DivGallery.Orientation> expression6 = DivGalleryJsonParser.f55442g;
            Expression<DivGallery.Orientation> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "orientation", typeHelper4, lVar4, expression6);
            Expression<DivGallery.Orientation> expression7 = expressionResolveOptionalExpression10 == null ? expression6 : expressionResolveOptionalExpression10;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.f55493y, jSONObject, "paddings", this.f55464a.a3(), this.f55464a.Y2());
            Field<Expression<Boolean>> field7 = divGalleryTemplate.f55494z;
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar5 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression8 = DivGalleryJsonParser.f55443h;
            Expression<Boolean> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper5, lVar5, expression8);
            Expression<Boolean> expression9 = expressionResolveOptionalExpression11 == null ? expression8 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.A, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.B, jSONObject, "row_span", typeHelper2, lVar2, DivGalleryJsonParser.f55461z);
            Field<Expression<DivGallery.ScrollMode>> field8 = divGalleryTemplate.C;
            TypeHelper<DivGallery.ScrollMode> typeHelper6 = DivGalleryJsonParser.f55452q;
            sn.l<String, DivGallery.ScrollMode> lVar6 = DivGallery.ScrollMode.FROM_STRING;
            Expression<DivGallery.ScrollMode> expression10 = DivGalleryJsonParser.f55444i;
            Expression<DivGallery.ScrollMode> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_mode", typeHelper6, lVar6, expression10);
            Expression<DivGallery.ScrollMode> expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            Field<Expression<DivGallery.Scrollbar>> field9 = divGalleryTemplate.D;
            TypeHelper<DivGallery.Scrollbar> typeHelper7 = DivGalleryJsonParser.f55453r;
            sn.l<String, DivGallery.Scrollbar> lVar7 = DivGallery.Scrollbar.FROM_STRING;
            Expression<DivGallery.Scrollbar> expression12 = DivGalleryJsonParser.f55445j;
            Expression<DivGallery.Scrollbar> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scrollbar", typeHelper7, lVar7, expression12);
            Expression<DivGallery.Scrollbar> expression13 = expressionResolveOptionalExpression15 == null ? expression12 : expressionResolveOptionalExpression15;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.E, jSONObject, "selected_actions", this.f55464a.w0(), this.f55464a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.F, jSONObject, "tooltips", this.f55464a.R8(), this.f55464a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.G, jSONObject, "transform", this.f55464a.d9(), this.f55464a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.H, jSONObject, "transition_change", this.f55464a.W1(), this.f55464a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.I, jSONObject, "transition_in", this.f55464a.B1(), this.f55464a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.J, jSONObject, "transition_out", this.f55464a.B1(), this.f55464a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGalleryJsonParser.A);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.L, jSONObject, "variable_triggers", this.f55464a.g9(), this.f55464a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.M, jSONObject, "variables", this.f55464a.m9(), this.f55464a.k9());
            Field<Expression<DivVisibility>> field10 = divGalleryTemplate.N;
            TypeHelper<DivVisibility> typeHelper8 = DivGalleryJsonParser.f55454s;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivGalleryJsonParser.f55446k;
            Expression<DivVisibility> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper8, lVar8, expression14);
            Expression<DivVisibility> expression15 = expressionResolveOptionalExpression16 == null ? expression14 : expressionResolveOptionalExpression16;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.O, jSONObject, "visibility_action", this.f55464a.y9(), this.f55464a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.P, jSONObject, "visibility_actions", this.f55464a.y9(), this.f55464a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.Q, jSONObject, "width", this.f55464a.a7(), this.f55464a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGalleryJsonParser.f55447l;
            }
            return new DivGallery(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expression3, expressionResolveOptionalExpression7, expression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, divCollectionItemBuilder, expression5, listResolveOptionalList6, divLayoutProvider, divEdgeInsets, expression7, divEdgeInsets2, expression9, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expression11, expression13, listResolveOptionalList7, listResolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression15, divVisibilityAction, listResolveOptionalList12, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f55437b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivGallery.CrossContentAlignment crossContentAlignment = DivGallery.CrossContentAlignment.START;
        f55438c = Expression.Companion.constant$default(companion, crossContentAlignment, null, 2, null);
        f55439d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55440e = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f55441f = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
        f55442g = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        f55443h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
        f55444i = Expression.Companion.constant$default(companion, scrollMode, null, 2, null);
        DivGallery.Scrollbar scrollbar = DivGallery.Scrollbar.NONE;
        f55445j = Expression.Companion.constant$default(companion, scrollbar, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55446k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55447l = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55448m = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55449n = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55450o = companion2.from(crossContentAlignment, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_CROSS_CONTENT_ALIGNMENT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.CrossContentAlignment);
            }
        });
        f55451p = companion2.from(orientation, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.Orientation);
            }
        });
        f55452q = companion2.from(scrollMode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLL_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.ScrollMode);
            }
        });
        f55453r = companion2.from(scrollbar, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLLBAR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.Scrollbar);
            }
        });
        f55454s = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55455t = new ValueValidator() { // from class: ah.l4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.i(((Double) obj).doubleValue());
            }
        };
        f55456u = new ValueValidator() { // from class: ah.m4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.j(((Long) obj).longValue());
            }
        };
        f55457v = new ValueValidator() { // from class: ah.n4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.k(((Long) obj).longValue());
            }
        };
        f55458w = new ValueValidator() { // from class: ah.o4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.l(((Long) obj).longValue());
            }
        };
        f55459x = new ValueValidator() { // from class: ah.p4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.m(((Long) obj).longValue());
            }
        };
        f55460y = new ValueValidator() { // from class: ah.q4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.n(((Long) obj).longValue());
            }
        };
        f55461z = new ValueValidator() { // from class: ah.r4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGalleryJsonParser.o(((Long) obj).longValue());
            }
        };
        A = new ListValidator() { // from class: ah.s4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivGalleryJsonParser.p(list);
            }
        };
    }

    public static final boolean i(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean j(long j10) {
        return j10 > 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    public static final boolean m(long j10) {
        return j10 >= 0;
    }

    public static final boolean n(long j10) {
        return j10 >= 0;
    }

    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    public static final boolean p(List list) {
        return list.size() >= 1;
    }
}
