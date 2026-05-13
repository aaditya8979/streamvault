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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSwitchJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSwitchJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSwitchJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57344a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f57346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f57348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f57349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f57352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f57353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f57356m;

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57357a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57357a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitch deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57357a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f57350g, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSwitchJsonParser.f57351h, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSwitchJsonParser.f57353j;
            Expression<Double> expression = DivSwitchJsonParser.f57345b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f57357a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f57357a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57357a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSwitchJsonParser.f57354k);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f57357a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f57357a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f57357a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f57357a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57357a.Y6());
            if (divSize == null) {
                divSize = DivSwitchJsonParser.f57346c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSwitchJsonParser.f57347d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "is_on_variable");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f57357a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f57357a.Y2());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57357a.Y2());
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSwitchJsonParser.f57355l);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f57357a.u0());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f57357a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f57357a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f57357a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f57357a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f57357a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSwitchJsonParser.f57356m);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f57357a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f57357a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSwitchJsonParser.f57352i;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression3 = DivSwitchJsonParser.f57348e;
            Expression<DivVisibility> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression3);
            Expression<DivVisibility> expression4 = optionalExpression9 == null ? expression3 : optionalExpression9;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f57357a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f57357a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57357a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSwitchJsonParser.f57349f;
            }
            return new DivSwitch(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression2, str2, divLayoutProvider, divEdgeInsets, optionalExpression6, divEdgeInsets2, optionalExpression7, optionalExpression8, optionalList6, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression4, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSwitch divSwitch) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSwitch.o(), this.f57357a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSwitch.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSwitch.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSwitch.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSwitch.w(), this.f57357a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divSwitch.getBackground(), this.f57357a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSwitch.x(), this.f57357a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSwitch.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSwitch.k(), this.f57357a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSwitch.getExtensions(), this.f57357a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSwitch.n(), this.f57357a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSwitch.u(), this.f57357a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSwitch.getHeight(), this.f57357a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSwitch.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divSwitch.f57332o);
            JsonPropertyParser.write(parsingContext, jSONObject, "is_on_variable", divSwitch.f57333p);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSwitch.r(), this.f57357a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSwitch.d(), this.f57357a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "on_color", divSwitch.f57336s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSwitch.p(), this.f57357a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSwitch.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSwitch.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSwitch.q(), this.f57357a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSwitch.h(), this.f57357a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSwitch.getTransform(), this.f57357a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSwitch.j(), this.f57357a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSwitch.v(), this.f57357a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSwitch.i(), this.f57357a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSwitch.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSwitch.s(), this.f57357a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSwitch.c(), this.f57357a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSwitch.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSwitch.t(), this.f57357a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSwitch.a(), this.f57357a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSwitch.getWidth(), this.f57357a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57358a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57358a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitchTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSwitchTemplate divSwitchTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57360a : null, this.f57358a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f57350g, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57361b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSwitchJsonParser.f57351h, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57362c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57363d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSwitchJsonParser.f57353j);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57364e : null, this.f57358a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57365f : null, this.f57358a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57366g : null, this.f57358a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSwitchTemplate != null ? divSwitchTemplate.f57367h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSwitchJsonParser.f57354k);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57368i : null, this.f57358a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57369j : null, this.f57358a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57370k : null, this.f57358a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57371l : null, this.f57358a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57372m : null, this.f57358a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57373n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57374o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "is_on_variable", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57375p : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57376q : null, this.f57358a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57377r : null, this.f57358a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57378s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57379t : null, this.f57358a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57380u : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57381v : null, lVar, DivSwitchJsonParser.f57355l);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57382w : null, this.f57358a.v0());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57383x : null, this.f57358a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57384y : null, this.f57358a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f57385z : null, this.f57358a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.A : null, this.f57358a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.B : null, this.f57358a.A1());
            Field<List<DivTransitionTrigger>> field3 = divSwitchTemplate != null ? divSwitchTemplate.C : null;
            sn.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSwitchJsonParser.f57356m;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSwitchTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, field2, optionalField6, optionalField7, optionalFieldWithExpression6, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField6, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.D : null, this.f57358a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.E : null, this.f57358a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSwitchJsonParser.f57352i, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.G : null, this.f57358a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.H : null, this.f57358a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.I : null, this.f57358a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSwitchTemplate divSwitchTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSwitchTemplate.f57360a, this.f57358a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSwitchTemplate.f57361b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSwitchTemplate.f57362c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSwitchTemplate.f57363d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSwitchTemplate.f57364e, this.f57358a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divSwitchTemplate.f57365f, this.f57358a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSwitchTemplate.f57366g, this.f57358a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSwitchTemplate.f57367h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSwitchTemplate.f57368i, this.f57358a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSwitchTemplate.f57369j, this.f57358a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSwitchTemplate.f57370k, this.f57358a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSwitchTemplate.f57371l, this.f57358a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSwitchTemplate.f57372m, this.f57358a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSwitchTemplate.f57373n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divSwitchTemplate.f57374o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "is_on_variable", divSwitchTemplate.f57375p);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSwitchTemplate.f57376q, this.f57358a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSwitchTemplate.f57377r, this.f57358a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "on_color", divSwitchTemplate.f57378s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSwitchTemplate.f57379t, this.f57358a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSwitchTemplate.f57380u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSwitchTemplate.f57381v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSwitchTemplate.f57382w, this.f57358a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSwitchTemplate.f57383x, this.f57358a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSwitchTemplate.f57384y, this.f57358a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSwitchTemplate.f57385z, this.f57358a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSwitchTemplate.A, this.f57358a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSwitchTemplate.B, this.f57358a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSwitchTemplate.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSwitchTemplate.D, this.f57358a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSwitchTemplate.E, this.f57358a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSwitchTemplate.F, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSwitchTemplate.G, this.f57358a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSwitchTemplate.H, this.f57358a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSwitchTemplate.I, this.f57358a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSwitchTemplate, DivSwitch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57359a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57359a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitch resolve(@NotNull ParsingContext parsingContext, @NotNull DivSwitchTemplate divSwitchTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57360a, jSONObject, "accessibility", this.f57359a.J(), this.f57359a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f57361b, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f57350g, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f57362c, jSONObject, "alignment_vertical", DivSwitchJsonParser.f57351h, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSwitchTemplate.f57363d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSwitchJsonParser.f57353j;
            Expression<Double> expression = DivSwitchJsonParser.f57345b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57364e, jSONObject, "animators", this.f57359a.v1(), this.f57359a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57365f, jSONObject, A2.f64965g, this.f57359a.H1(), this.f57359a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57366g, jSONObject, OutlinedTextFieldKt.BorderId, this.f57359a.N1(), this.f57359a.L1());
            Field<Expression<Long>> field2 = divSwitchTemplate.f57367h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSwitchJsonParser.f57354k);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57368i, jSONObject, "disappear_actions", this.f57359a.R2(), this.f57359a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57369j, jSONObject, "extensions", this.f57359a.d3(), this.f57359a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57370k, jSONObject, "focus", this.f57359a.B3(), this.f57359a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57371l, jSONObject, "functions", this.f57359a.K3(), this.f57359a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57372m, jSONObject, "height", this.f57359a.a7(), this.f57359a.Y6());
            if (divSize == null) {
                divSize = DivSwitchJsonParser.f57346c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57373n, jSONObject, "id");
            Field<Expression<Boolean>> field3 = divSwitchTemplate.f57374o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSwitchJsonParser.f57347d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divSwitchTemplate.f57375p, jSONObject, "is_on_variable");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57376q, jSONObject, "layout_provider", this.f57359a.R4(), this.f57359a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57377r, jSONObject, "margins", this.f57359a.a3(), this.f57359a.Y2());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f57378s, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57379t, jSONObject, "paddings", this.f57359a.a3(), this.f57359a.Y2());
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f57380u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f57381v, jSONObject, "row_span", typeHelper2, lVar2, DivSwitchJsonParser.f57355l);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57382w, jSONObject, "selected_actions", this.f57359a.w0(), this.f57359a.u0());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f57383x, jSONObject, "tooltips", this.f57359a.R8(), this.f57359a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57384y, jSONObject, "transform", this.f57359a.d9(), this.f57359a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f57385z, jSONObject, "transition_change", this.f57359a.W1(), this.f57359a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.A, jSONObject, "transition_in", this.f57359a.B1(), this.f57359a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.B, jSONObject, "transition_out", this.f57359a.B1(), this.f57359a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSwitchJsonParser.f57356m);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.D, jSONObject, "variable_triggers", this.f57359a.g9(), this.f57359a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.E, jSONObject, "variables", this.f57359a.m9(), this.f57359a.k9());
            Field<Expression<DivVisibility>> field4 = divSwitchTemplate.F;
            TypeHelper<DivVisibility> typeHelper4 = DivSwitchJsonParser.f57352i;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression3 = DivSwitchJsonParser.f57348e;
            Expression<DivVisibility> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, lVar4, expression3);
            Expression<DivVisibility> expression4 = expressionResolveOptionalExpression9 == null ? expression3 : expressionResolveOptionalExpression9;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.G, jSONObject, "visibility_action", this.f57359a.y9(), this.f57359a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.H, jSONObject, "visibility_actions", this.f57359a.y9(), this.f57359a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.I, jSONObject, "width", this.f57359a.a7(), this.f57359a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSwitchJsonParser.f57349f;
            }
            return new DivSwitch(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression2, str2, divLayoutProvider, divEdgeInsets, expressionResolveOptionalExpression6, divEdgeInsets2, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, listResolveOptionalList6, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression4, divVisibilityAction, listResolveOptionalList11, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f57345b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f57346c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f57347d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f57348e = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f57349f = new DivSize.c(new DivMatchParentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57350g = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57351h = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57352i = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f57353j = new ValueValidator() { // from class: ah.ca
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f57354k = new ValueValidator() { // from class: ah.da
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.f(((Long) obj).longValue());
            }
        };
        f57355l = new ValueValidator() { // from class: ah.ea
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.g(((Long) obj).longValue());
            }
        };
        f57356m = new ListValidator() { // from class: ah.fa
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSwitchJsonParser.h(list);
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
