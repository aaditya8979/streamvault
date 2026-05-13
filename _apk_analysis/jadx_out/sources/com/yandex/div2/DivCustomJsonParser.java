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
import com.yandex.div2.DivCustomJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCustomJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivCustomJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55036a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f55047l;

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55048a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55048a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustom deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55048a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivCustomJsonParser.f55041f, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivCustomJsonParser.f55042g, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivCustomJsonParser.f55044i;
            Expression<Double> expression = DivCustomJsonParser.f55037b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55048a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55048a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55048a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivCustomJsonParser.f55045j);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "custom_props");
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "custom_type");
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55048a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55048a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55048a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55048a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55048a.Y6());
            if (divSize == null) {
                divSize = DivCustomJsonParser.f55038c;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f55048a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55048a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55048a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55048a.Y2());
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivCustomJsonParser.f55046k);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55048a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55048a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55048a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55048a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55048a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55048a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.f55047l);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55048a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55048a.k9());
            TypeHelper<DivVisibility> typeHelper3 = DivCustomJsonParser.f55043h;
            sn.l<String, DivVisibility> lVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = DivCustomJsonParser.f55039d;
            Expression<DivVisibility> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper3, lVar3, expression2);
            Expression<DivVisibility> expression3 = optionalExpression7 == null ? expression2 : optionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55048a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55048a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55048a.Y6());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.f55040e;
            }
            return new DivCustom(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, jSONObject2, str, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str2, optionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, optionalExpression5, optionalExpression6, optionalList7, optionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression3, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCustom divCustom) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divCustom.o(), this.f55048a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divCustom.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divCustom.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divCustom.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divCustom.w(), this.f55048a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divCustom.getBackground(), this.f55048a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divCustom.x(), this.f55048a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divCustom.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_props", divCustom.f55018i);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_type", divCustom.f55019j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divCustom.k(), this.f55048a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divCustom.getExtensions(), this.f55048a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divCustom.n(), this.f55048a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divCustom.u(), this.f55048a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divCustom.getHeight(), this.f55048a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divCustom.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divCustom.f55026q, this.f55048a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divCustom.r(), this.f55048a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divCustom.d(), this.f55048a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCustom.p(), this.f55048a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divCustom.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divCustom.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divCustom.q(), this.f55048a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divCustom.h(), this.f55048a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divCustom.getTransform(), this.f55048a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divCustom.j(), this.f55048a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divCustom.v(), this.f55048a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divCustom.i(), this.f55048a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divCustom.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divCustom.s(), this.f55048a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divCustom.c(), this.f55048a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divCustom.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divCustom.t(), this.f55048a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divCustom.a(), this.f55048a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divCustom.getWidth(), this.f55048a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55049a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55049a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustomTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCustomTemplate divCustomTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55051a : null, this.f55049a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivCustomJsonParser.f55041f, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55052b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivCustomJsonParser.f55042g, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55053c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55054d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivCustomJsonParser.f55044i);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55055e : null, this.f55049a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55056f : null, this.f55049a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55057g : null, this.f55049a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divCustomTemplate != null ? divCustomTemplate.f55058h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivCustomJsonParser.f55045j);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "custom_props", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55059i : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "custom_type", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55060j : null);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55061k : null, this.f55049a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55062l : null, this.f55049a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55063m : null, this.f55049a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55064n : null, this.f55049a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55065o : null, this.f55049a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55066p : null);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55067q : null, this.f55049a.N4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55068r : null, this.f55049a.Q4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55069s : null, this.f55049a.Z2());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55070t : null, this.f55049a.Z2());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55071u : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55072v : null, lVar, DivCustomJsonParser.f55046k);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55073w : null, this.f55049a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55074x : null, this.f55049a.Q8());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55075y : null, this.f55049a.c9());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f55076z : null, this.f55049a.V1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.A : null, this.f55049a.A1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.B : null, this.f55049a.A1());
            Field<List<DivTransitionTrigger>> field3 = divCustomTemplate != null ? divCustomTemplate.C : null;
            sn.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivCustomJsonParser.f55047l;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCustomTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalField3, field2, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalListField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField7, optionalListField8, optionalField10, optionalField11, optionalField12, optionalField13, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.D : null, this.f55049a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.E : null, this.f55049a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivCustomJsonParser.f55043h, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.G : null, this.f55049a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.H : null, this.f55049a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.I : null, this.f55049a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCustomTemplate divCustomTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divCustomTemplate.f55051a, this.f55049a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divCustomTemplate.f55052b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divCustomTemplate.f55053c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divCustomTemplate.f55054d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divCustomTemplate.f55055e, this.f55049a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divCustomTemplate.f55056f, this.f55049a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divCustomTemplate.f55057g, this.f55049a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divCustomTemplate.f55058h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_props", divCustomTemplate.f55059i);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_type", divCustomTemplate.f55060j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divCustomTemplate.f55061k, this.f55049a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divCustomTemplate.f55062l, this.f55049a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divCustomTemplate.f55063m, this.f55049a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divCustomTemplate.f55064n, this.f55049a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divCustomTemplate.f55065o, this.f55049a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divCustomTemplate.f55066p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divCustomTemplate.f55067q, this.f55049a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divCustomTemplate.f55068r, this.f55049a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divCustomTemplate.f55069s, this.f55049a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCustomTemplate.f55070t, this.f55049a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divCustomTemplate.f55071u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divCustomTemplate.f55072v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divCustomTemplate.f55073w, this.f55049a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divCustomTemplate.f55074x, this.f55049a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divCustomTemplate.f55075y, this.f55049a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divCustomTemplate.f55076z, this.f55049a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divCustomTemplate.A, this.f55049a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divCustomTemplate.B, this.f55049a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divCustomTemplate.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divCustomTemplate.D, this.f55049a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divCustomTemplate.E, this.f55049a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divCustomTemplate.F, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divCustomTemplate.G, this.f55049a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divCustomTemplate.H, this.f55049a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divCustomTemplate.I, this.f55049a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCustomTemplate, DivCustom> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55050a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55050a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustom resolve(@NotNull ParsingContext parsingContext, @NotNull DivCustomTemplate divCustomTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55051a, jSONObject, "accessibility", this.f55050a.J(), this.f55050a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f55052b, jSONObject, "alignment_horizontal", DivCustomJsonParser.f55041f, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f55053c, jSONObject, "alignment_vertical", DivCustomJsonParser.f55042g, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divCustomTemplate.f55054d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivCustomJsonParser.f55044i;
            Expression<Double> expression = DivCustomJsonParser.f55037b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55055e, jSONObject, "animators", this.f55050a.v1(), this.f55050a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55056f, jSONObject, A2.f64965g, this.f55050a.H1(), this.f55050a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55057g, jSONObject, OutlinedTextFieldKt.BorderId, this.f55050a.N1(), this.f55050a.L1());
            Field<Expression<Long>> field2 = divCustomTemplate.f55058h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivCustomJsonParser.f55045j);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55059i, jSONObject, "custom_props");
            String str = (String) JsonFieldResolver.resolve(parsingContext, divCustomTemplate.f55060j, jSONObject, "custom_type");
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55061k, jSONObject, "disappear_actions", this.f55050a.R2(), this.f55050a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55062l, jSONObject, "extensions", this.f55050a.d3(), this.f55050a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55063m, jSONObject, "focus", this.f55050a.B3(), this.f55050a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55064n, jSONObject, "functions", this.f55050a.K3(), this.f55050a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55065o, jSONObject, "height", this.f55050a.a7(), this.f55050a.Y6());
            if (divSize == null) {
                divSize = DivCustomJsonParser.f55038c;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55066p, jSONObject, "id");
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55067q, jSONObject, "items", this.f55050a.O4(), this.f55050a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55068r, jSONObject, "layout_provider", this.f55050a.R4(), this.f55050a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55069s, jSONObject, "margins", this.f55050a.a3(), this.f55050a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55070t, jSONObject, "paddings", this.f55050a.a3(), this.f55050a.Y2());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f55071u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f55072v, jSONObject, "row_span", typeHelper2, lVar2, DivCustomJsonParser.f55046k);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55073w, jSONObject, "selected_actions", this.f55050a.w0(), this.f55050a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f55074x, jSONObject, "tooltips", this.f55050a.R8(), this.f55050a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55075y, jSONObject, "transform", this.f55050a.d9(), this.f55050a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f55076z, jSONObject, "transition_change", this.f55050a.W1(), this.f55050a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.A, jSONObject, "transition_in", this.f55050a.B1(), this.f55050a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.B, jSONObject, "transition_out", this.f55050a.B1(), this.f55050a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.f55047l);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.D, jSONObject, "variable_triggers", this.f55050a.g9(), this.f55050a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.E, jSONObject, "variables", this.f55050a.m9(), this.f55050a.k9());
            Field<Expression<DivVisibility>> field3 = divCustomTemplate.F;
            TypeHelper<DivVisibility> typeHelper3 = DivCustomJsonParser.f55043h;
            sn.l<String, DivVisibility> lVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = DivCustomJsonParser.f55039d;
            Expression<DivVisibility> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "visibility", typeHelper3, lVar3, expression2);
            Expression<DivVisibility> expression3 = expressionResolveOptionalExpression7 == null ? expression2 : expressionResolveOptionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.G, jSONObject, "visibility_action", this.f55050a.y9(), this.f55050a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.H, jSONObject, "visibility_actions", this.f55050a.y9(), this.f55050a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.I, jSONObject, "width", this.f55050a.a7(), this.f55050a.Y6());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.f55040e;
            }
            return new DivCustom(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, jSONObject2, str, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str2, listResolveOptionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, listResolveOptionalList7, listResolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression3, divVisibilityAction, listResolveOptionalList12, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f55037b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f55038c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55039d = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55040e = new DivSize.c(new DivMatchParentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55041f = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55042g = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55043h = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55044i = new ValueValidator() { // from class: ah.b3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f55045j = new ValueValidator() { // from class: ah.c3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.f(((Long) obj).longValue());
            }
        };
        f55046k = new ValueValidator() { // from class: ah.d3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.g(((Long) obj).longValue());
            }
        };
        f55047l = new ListValidator() { // from class: ah.e3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivCustomJsonParser.h(list);
            }
        };
    }

    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(List list) {
        return list.size() >= 1;
    }
}
