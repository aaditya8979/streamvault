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
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorJsonParser;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivIndicatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55881a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f55882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivIndicator.Animation> f55885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f55887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivShape.c f55889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f55890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivIndicator.Animation> f55895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f55902v;

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55903a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55903a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55903a.H());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivIndicatorJsonParser.f55882b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivIndicatorJsonParser.f55897q;
            Expression<Double> expression3 = DivIndicatorJsonParser.f55883c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "active_shape", this.f55903a.x6());
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f55893m, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f55894n, DivAlignmentVertical.FROM_STRING);
            ValueValidator<Double> valueValidator2 = DivIndicatorJsonParser.f55898r;
            Expression<Double> expression4 = DivIndicatorJsonParser.f55884d;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression5 != null) {
                expression4 = optionalExpression5;
            }
            TypeHelper<DivIndicator.Animation> typeHelper3 = DivIndicatorJsonParser.f55895o;
            sn.l<String, DivIndicator.Animation> lVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression5 = DivIndicatorJsonParser.f55885e;
            Expression<DivIndicator.Animation> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", typeHelper3, lVar3, expression5);
            Expression<DivIndicator.Animation> expression6 = optionalExpression6 == null ? expression5 : optionalExpression6;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55903a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55903a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55903a.L1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, lVar4, DivIndicatorJsonParser.f55899s);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55903a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55903a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55903a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55903a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55903a.Y6());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.f55886f;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression<Integer> expression7 = DivIndicatorJsonParser.f55887g;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, lVar, expression7);
            Expression<Integer> expression8 = optionalExpression8 == null ? expression7 : optionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_minimum_shape", this.f55903a.x6());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_shape", this.f55903a.x6());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonPropertyParser.readOptional(parsingContext, jSONObject, "items_placement", this.f55903a.a4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55903a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55903a.Y2());
            ValueValidator<Double> valueValidator3 = DivIndicatorJsonParser.f55900t;
            Expression<Double> expression9 = DivIndicatorJsonParser.f55888h;
            Expression<Double> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, lVar2, valueValidator3, expression9);
            Expression<Double> expression10 = optionalExpression9 == null ? expression9 : optionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55903a.Y2());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pager_id");
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, lVar4, DivIndicatorJsonParser.f55901u);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55903a.u0());
            DivShape divShape = (DivShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shape", this.f55903a.V6());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.f55889i;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f55903a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.f55890j;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55903a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55903a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55903a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55903a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55903a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.f55902v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55903a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55903a.k9());
            TypeHelper<DivVisibility> typeHelper5 = DivIndicatorJsonParser.f55896p;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression11 = DivIndicatorJsonParser.f55891k;
            Expression<DivVisibility> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, lVar5, expression11);
            Expression<DivVisibility> expression12 = optionalExpression12 == null ? expression11 : optionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55903a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55903a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55903a.Y6());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.f55892l;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, optionalExpression3, optionalExpression4, expression4, expression6, optionalList, optionalList2, divBorder, optionalExpression7, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, optionalExpression10, optionalExpression11, optionalList6, divShape2, divFixedSize2, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression12, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivIndicator divIndicator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divIndicator.o(), this.f55903a.H());
            Expression<Integer> expression = divIndicator.f55846b;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_size", divIndicator.f55847c);
            JsonPropertyParser.write(parsingContext, jSONObject, "active_shape", divIndicator.f55848d, this.f55903a.x6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divIndicator.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divIndicator.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divIndicator.getAlpha());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation", divIndicator.f55852h, DivIndicator.Animation.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divIndicator.w(), this.f55903a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divIndicator.getBackground(), this.f55903a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divIndicator.x(), this.f55903a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divIndicator.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divIndicator.k(), this.f55903a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divIndicator.getExtensions(), this.f55903a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divIndicator.n(), this.f55903a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divIndicator.u(), this.f55903a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divIndicator.getHeight(), this.f55903a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divIndicator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_item_color", divIndicator.f55863s, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_minimum_shape", divIndicator.f55864t, this.f55903a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_shape", divIndicator.f55865u, this.f55903a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "items_placement", divIndicator.f55866v, this.f55903a.a4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divIndicator.r(), this.f55903a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divIndicator.d(), this.f55903a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "minimum_item_size", divIndicator.f55869y);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divIndicator.p(), this.f55903a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "pager_id", divIndicator.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divIndicator.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divIndicator.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divIndicator.q(), this.f55903a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "shape", divIndicator.E, this.f55903a.V6());
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divIndicator.F, this.f55903a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divIndicator.h(), this.f55903a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divIndicator.getTransform(), this.f55903a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divIndicator.j(), this.f55903a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divIndicator.v(), this.f55903a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divIndicator.i(), this.f55903a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divIndicator.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divIndicator.s(), this.f55903a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divIndicator.c(), this.f55903a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divIndicator.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divIndicator.t(), this.f55903a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divIndicator.a(), this.f55903a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divIndicator.getWidth(), this.f55903a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55904a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55904a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicatorTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivIndicatorTemplate divIndicatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55911a : null, this.f55904a.I());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field = divIndicatorTemplate != null ? divIndicatorTemplate.f55912b : null;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divIndicatorTemplate != null ? divIndicatorTemplate.f55913c : null;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field2, lVar2, DivIndicatorJsonParser.f55897q);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55914d : null, this.f55904a.y6());
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f55893m, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55915e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f55894n, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55916f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55917g : null, lVar2, DivIndicatorJsonParser.f55898r);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation", DivIndicatorJsonParser.f55895o, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55918h : null, DivIndicator.Animation.FROM_STRING);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55919i : null, this.f55904a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55920j : null, this.f55904a.G1());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55921k : null, this.f55904a.M1());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = divIndicatorTemplate != null ? divIndicatorTemplate.f55922l : null;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field3, lVar3, DivIndicatorJsonParser.f55899s);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55923m : null, this.f55904a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55924n : null, this.f55904a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55925o : null, this.f55904a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55926p : null, this.f55904a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55927q : null, this.f55904a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55928r : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55929s : null, lVar);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55930t : null, this.f55904a.y6());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55931u : null, this.f55904a.y6());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55932v : null, this.f55904a.b4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55933w : null, this.f55904a.Q4());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55934x : null, this.f55904a.Z2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55935y : null, lVar2, DivIndicatorJsonParser.f55900t);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f55936z : null, this.f55904a.Z2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.A : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.C : null, lVar3, DivIndicatorJsonParser.f55901u);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.D : null, this.f55904a.v0());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.E : null, this.f55904a.W6());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.F : null, this.f55904a.x3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.G : null, this.f55904a.Q8());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.H : null, this.f55904a.c9());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.I : null, this.f55904a.V1());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.J : null, this.f55904a.A1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.K : null, this.f55904a.A1());
            Field<List<DivTransitionTrigger>> field4 = divIndicatorTemplate != null ? divIndicatorTemplate.L : null;
            sn.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivIndicatorJsonParser.f55902v;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivIndicatorTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField, optionalListField2, optionalField3, optionalFieldWithExpression7, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalFieldWithExpression8, optionalField7, optionalField8, optionalField9, optionalField10, optionalField11, optionalFieldWithExpression9, optionalField12, optionalField13, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalListField6, optionalField14, optionalField15, optionalListField7, optionalField16, optionalField17, optionalField18, optionalField19, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.M : null, this.f55904a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.N : null, this.f55904a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivIndicatorJsonParser.f55896p, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.O : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.P : null, this.f55904a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.Q : null, this.f55904a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.R : null, this.f55904a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivIndicatorTemplate divIndicatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divIndicatorTemplate.f55911a, this.f55904a.I());
            Field<Expression<Integer>> field = divIndicatorTemplate.f55912b;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_size", divIndicatorTemplate.f55913c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "active_shape", divIndicatorTemplate.f55914d, this.f55904a.y6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divIndicatorTemplate.f55915e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divIndicatorTemplate.f55916f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divIndicatorTemplate.f55917g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation", divIndicatorTemplate.f55918h, DivIndicator.Animation.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divIndicatorTemplate.f55919i, this.f55904a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divIndicatorTemplate.f55920j, this.f55904a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divIndicatorTemplate.f55921k, this.f55904a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divIndicatorTemplate.f55922l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divIndicatorTemplate.f55923m, this.f55904a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divIndicatorTemplate.f55924n, this.f55904a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divIndicatorTemplate.f55925o, this.f55904a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divIndicatorTemplate.f55926p, this.f55904a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divIndicatorTemplate.f55927q, this.f55904a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divIndicatorTemplate.f55928r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_item_color", divIndicatorTemplate.f55929s, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_minimum_shape", divIndicatorTemplate.f55930t, this.f55904a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_shape", divIndicatorTemplate.f55931u, this.f55904a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "items_placement", divIndicatorTemplate.f55932v, this.f55904a.b4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divIndicatorTemplate.f55933w, this.f55904a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divIndicatorTemplate.f55934x, this.f55904a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "minimum_item_size", divIndicatorTemplate.f55935y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divIndicatorTemplate.f55936z, this.f55904a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pager_id", divIndicatorTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divIndicatorTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divIndicatorTemplate.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divIndicatorTemplate.D, this.f55904a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divIndicatorTemplate.E, this.f55904a.W6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divIndicatorTemplate.F, this.f55904a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divIndicatorTemplate.G, this.f55904a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divIndicatorTemplate.H, this.f55904a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divIndicatorTemplate.I, this.f55904a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divIndicatorTemplate.J, this.f55904a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divIndicatorTemplate.K, this.f55904a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divIndicatorTemplate.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divIndicatorTemplate.M, this.f55904a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divIndicatorTemplate.N, this.f55904a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divIndicatorTemplate.O, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divIndicatorTemplate.P, this.f55904a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divIndicatorTemplate.Q, this.f55904a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divIndicatorTemplate.R, this.f55904a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivIndicatorTemplate, DivIndicator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55905a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55905a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicator resolve(@NotNull ParsingContext parsingContext, @NotNull DivIndicatorTemplate divIndicatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55911a, jSONObject, "accessibility", this.f55905a.J(), this.f55905a.H());
            Field<Expression<Integer>> field = divIndicatorTemplate.f55912b;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivIndicatorJsonParser.f55882b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_item_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Double>> field2 = divIndicatorTemplate.f55913c;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivIndicatorJsonParser.f55897q;
            Expression<Double> expression3 = DivIndicatorJsonParser.f55883c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_size", typeHelper2, lVar2, valueValidator, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55914d, jSONObject, "active_shape", this.f55905a.z6(), this.f55905a.x6());
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.f55915e, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f55893m, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.f55916f, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f55894n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field3 = divIndicatorTemplate.f55917g;
            ValueValidator<Double> valueValidator2 = DivIndicatorJsonParser.f55898r;
            Expression<Double> expression4 = DivIndicatorJsonParser.f55884d;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Field<Expression<DivIndicator.Animation>> field4 = divIndicatorTemplate.f55918h;
            TypeHelper<DivIndicator.Animation> typeHelper3 = DivIndicatorJsonParser.f55895o;
            sn.l<String, DivIndicator.Animation> lVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression5 = DivIndicatorJsonParser.f55885e;
            Expression<DivIndicator.Animation> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "animation", typeHelper3, lVar3, expression5);
            Expression<DivIndicator.Animation> expression6 = expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f55919i, jSONObject, "animators", this.f55905a.v1(), this.f55905a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f55920j, jSONObject, A2.f64965g, this.f55905a.H1(), this.f55905a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55921k, jSONObject, OutlinedTextFieldKt.BorderId, this.f55905a.N1(), this.f55905a.L1());
            Field<Expression<Long>> field5 = divIndicatorTemplate.f55922l;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, lVar4, DivIndicatorJsonParser.f55899s);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f55923m, jSONObject, "disappear_actions", this.f55905a.R2(), this.f55905a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f55924n, jSONObject, "extensions", this.f55905a.d3(), this.f55905a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55925o, jSONObject, "focus", this.f55905a.B3(), this.f55905a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f55926p, jSONObject, "functions", this.f55905a.K3(), this.f55905a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55927q, jSONObject, "height", this.f55905a.a7(), this.f55905a.Y6());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.f55886f;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55928r, jSONObject, "id");
            Field<Expression<Integer>> field6 = divIndicatorTemplate.f55929s;
            Expression<Integer> expression7 = DivIndicatorJsonParser.f55887g;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "inactive_item_color", typeHelper, lVar, expression7);
            Expression<Integer> expression8 = expressionResolveOptionalExpression8 == null ? expression7 : expressionResolveOptionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55930t, jSONObject, "inactive_minimum_shape", this.f55905a.z6(), this.f55905a.x6());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55931u, jSONObject, "inactive_shape", this.f55905a.z6(), this.f55905a.x6());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55932v, jSONObject, "items_placement", this.f55905a.c4(), this.f55905a.a4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55933w, jSONObject, "layout_provider", this.f55905a.R4(), this.f55905a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55934x, jSONObject, "margins", this.f55905a.a3(), this.f55905a.Y2());
            Field<Expression<Double>> field7 = divIndicatorTemplate.f55935y;
            ValueValidator<Double> valueValidator3 = DivIndicatorJsonParser.f55900t;
            Expression<Double> expression9 = DivIndicatorJsonParser.f55888h;
            Expression<Double> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "minimum_item_size", typeHelper2, lVar2, valueValidator3, expression9);
            Expression<Double> expression10 = expressionResolveOptionalExpression9 == null ? expression9 : expressionResolveOptionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f55936z, jSONObject, "paddings", this.f55905a.a3(), this.f55905a.Y2());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.A, jSONObject, "pager_id");
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.C, jSONObject, "row_span", typeHelper4, lVar4, DivIndicatorJsonParser.f55901u);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.D, jSONObject, "selected_actions", this.f55905a.w0(), this.f55905a.u0());
            DivShape divShape = (DivShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.E, jSONObject, "shape", this.f55905a.X6(), this.f55905a.V6());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.f55889i;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.F, jSONObject, "space_between_centers", this.f55905a.y3(), this.f55905a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.f55890j;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.G, jSONObject, "tooltips", this.f55905a.R8(), this.f55905a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.H, jSONObject, "transform", this.f55905a.d9(), this.f55905a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.I, jSONObject, "transition_change", this.f55905a.W1(), this.f55905a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.J, jSONObject, "transition_in", this.f55905a.B1(), this.f55905a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.K, jSONObject, "transition_out", this.f55905a.B1(), this.f55905a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.f55902v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.M, jSONObject, "variable_triggers", this.f55905a.g9(), this.f55905a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.N, jSONObject, "variables", this.f55905a.m9(), this.f55905a.k9());
            Field<Expression<DivVisibility>> field8 = divIndicatorTemplate.O;
            TypeHelper<DivVisibility> typeHelper5 = DivIndicatorJsonParser.f55896p;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression11 = DivIndicatorJsonParser.f55891k;
            Expression<DivVisibility> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper5, lVar5, expression11);
            Expression<DivVisibility> expression12 = expressionResolveOptionalExpression12 == null ? expression11 : expressionResolveOptionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.P, jSONObject, "visibility_action", this.f55905a.y9(), this.f55905a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.Q, jSONObject, "visibility_actions", this.f55905a.y9(), this.f55905a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.R, jSONObject, "width", this.f55905a.a7(), this.f55905a.Y6());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.f55892l;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expression4, expression6, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression7, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, listResolveOptionalList6, divShape2, divFixedSize2, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression12, divVisibilityAction, listResolveOptionalList11, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55882b = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        f55883c = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        f55884d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
        f55885e = Expression.Companion.constant$default(companion, animation, null, 2, null);
        f55886f = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f55887g = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f55888h = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f55889i = new DivShape.c(new DivRoundedRectangleShape(null, null, null, null, null, 31, null));
        f55890j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55891k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55892l = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55893m = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55894n = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55895o = companion2.from(animation, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ANIMATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivIndicator.Animation);
            }
        });
        f55896p = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55897q = new ValueValidator() { // from class: ah.h5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f55898r = new ValueValidator() { // from class: ah.i5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.h(((Double) obj).doubleValue());
            }
        };
        f55899s = new ValueValidator() { // from class: ah.j5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.i(((Long) obj).longValue());
            }
        };
        f55900t = new ValueValidator() { // from class: ah.k5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.j(((Double) obj).doubleValue());
            }
        };
        f55901u = new ValueValidator() { // from class: ah.l5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.k(((Long) obj).longValue());
            }
        };
        f55902v = new ListValidator() { // from class: ah.m5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivIndicatorJsonParser.l(list);
            }
        };
    }

    public static final boolean g(double d10) {
        return d10 > 0.0d;
    }

    public static final boolean h(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(double d10) {
        return d10 > 0.0d;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(List list) {
        return list.size() >= 1;
    }
}
