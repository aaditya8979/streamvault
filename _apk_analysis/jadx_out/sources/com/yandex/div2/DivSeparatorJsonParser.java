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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSeparatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56858a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f56859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f56862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f56863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f56864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f56865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f56866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f56867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f56871n;

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56872a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56872a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f56872a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f56872a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f56872a.q1());
            if (divAnimation == null) {
                divAnimation = DivSeparatorJsonParser.f56859b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f56872a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f56865h, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f56866i, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSeparatorJsonParser.f56868k;
            Expression<Double> expression = DivSeparatorJsonParser.f56860c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f56872a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f56872a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f56872a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSeparatorJsonParser.f56861d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivSeparatorJsonParser.f56869l);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "delimiter_style", this.f56872a.J6());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f56872a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f56872a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f56872a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f56872a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f56872a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f56872a.Y6());
            if (divSize == null) {
                divSize = DivSeparatorJsonParser.f56862e;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f56872a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f56872a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f56872a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f56872a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f56872a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f56872a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f56872a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f56872a.u0());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivSeparatorJsonParser.f56870m);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f56872a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f56872a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f56872a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f56872a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f56872a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f56872a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSeparatorJsonParser.f56871n);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f56872a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f56872a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSeparatorJsonParser.f56867j;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = DivSeparatorJsonParser.f56863f;
            Expression<DivVisibility> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression4);
            Expression<DivVisibility> expression5 = optionalExpression8 == null ? expression4 : optionalExpression8;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f56872a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f56872a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f56872a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSeparatorJsonParser.f56864g;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression3, optionalExpression5, delimiterStyle, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, optionalList11, optionalList12, optionalExpression6, optionalExpression7, optionalList13, optionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression5, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSeparator divSeparator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSeparator.o(), this.f56872a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divSeparator.f56818b, this.f56872a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divSeparator.f56819c, this.f56872a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divSeparator.f56820d, this.f56872a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSeparator.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSeparator.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSeparator.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSeparator.w(), this.f56872a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divSeparator.getBackground(), this.f56872a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSeparator.x(), this.f56872a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divSeparator.f56827k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSeparator.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "delimiter_style", divSeparator.f56829m, this.f56872a.J6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSeparator.k(), this.f56872a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divSeparator.f56831o, this.f56872a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSeparator.getExtensions(), this.f56872a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSeparator.n(), this.f56872a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSeparator.u(), this.f56872a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSeparator.getHeight(), this.f56872a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divSeparator.f56836t, this.f56872a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divSeparator.f56837u, this.f56872a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSeparator.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSeparator.r(), this.f56872a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divSeparator.f56840x, this.f56872a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSeparator.d(), this.f56872a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSeparator.p(), this.f56872a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divSeparator.A, this.f56872a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divSeparator.B, this.f56872a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSeparator.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSeparator.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSeparator.q(), this.f56872a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSeparator.h(), this.f56872a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSeparator.getTransform(), this.f56872a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSeparator.j(), this.f56872a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSeparator.v(), this.f56872a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSeparator.i(), this.f56872a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSeparator.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSeparator.s(), this.f56872a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSeparator.c(), this.f56872a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSeparator.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSeparator.t(), this.f56872a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSeparator.a(), this.f56872a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSeparator.getWidth(), this.f56872a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56873a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56873a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparatorTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSeparatorTemplate divSeparatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56875a : null, this.f56873a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56876b : null, this.f56873a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56877c : null, this.f56873a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56878d : null, this.f56873a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f56865h, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56879e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f56866i, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56880f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56881g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSeparatorJsonParser.f56868k);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56882h : null, this.f56873a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56883i : null, this.f56873a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56884j : null, this.f56873a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56885k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSeparatorTemplate != null ? divSeparatorTemplate.f56886l : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSeparatorJsonParser.f56869l);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "delimiter_style", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56887m : null, this.f56873a.K6());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56888n : null, this.f56873a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56889o : null, this.f56873a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56890p : null, this.f56873a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56891q : null, this.f56873a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56892r : null, this.f56873a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56893s : null, this.f56873a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56894t : null, this.f56873a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56895u : null, this.f56873a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56896v : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56897w : null, this.f56873a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56898x : null, this.f56873a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56899y : null, this.f56873a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f56900z : null, this.f56873a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.A : null, this.f56873a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.B : null, this.f56873a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.C : null);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.D : null, lVar, DivSeparatorJsonParser.f56870m);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.E : null, this.f56873a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.F : null, this.f56873a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.G : null, this.f56873a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.H : null, this.f56873a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.I : null, this.f56873a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.J : null, this.f56873a.A1());
            Field<List<DivTransitionTrigger>> field2 = divSeparatorTemplate != null ? divSeparatorTemplate.K : null;
            sn.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSeparatorJsonParser.f56871n;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSeparatorTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalField5, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.L : null, this.f56873a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.M : null, this.f56873a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSeparatorJsonParser.f56867j, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.O : null, this.f56873a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.P : null, this.f56873a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.Q : null, this.f56873a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSeparatorTemplate divSeparatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSeparatorTemplate.f56875a, this.f56873a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divSeparatorTemplate.f56876b, this.f56873a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divSeparatorTemplate.f56877c, this.f56873a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divSeparatorTemplate.f56878d, this.f56873a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSeparatorTemplate.f56879e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSeparatorTemplate.f56880f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSeparatorTemplate.f56881g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSeparatorTemplate.f56882h, this.f56873a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divSeparatorTemplate.f56883i, this.f56873a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSeparatorTemplate.f56884j, this.f56873a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divSeparatorTemplate.f56885k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSeparatorTemplate.f56886l);
            JsonFieldParser.writeField(parsingContext, jSONObject, "delimiter_style", divSeparatorTemplate.f56887m, this.f56873a.K6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSeparatorTemplate.f56888n, this.f56873a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divSeparatorTemplate.f56889o, this.f56873a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSeparatorTemplate.f56890p, this.f56873a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSeparatorTemplate.f56891q, this.f56873a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSeparatorTemplate.f56892r, this.f56873a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSeparatorTemplate.f56893s, this.f56873a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divSeparatorTemplate.f56894t, this.f56873a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divSeparatorTemplate.f56895u, this.f56873a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSeparatorTemplate.f56896v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSeparatorTemplate.f56897w, this.f56873a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divSeparatorTemplate.f56898x, this.f56873a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSeparatorTemplate.f56899y, this.f56873a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSeparatorTemplate.f56900z, this.f56873a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divSeparatorTemplate.A, this.f56873a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divSeparatorTemplate.B, this.f56873a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSeparatorTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSeparatorTemplate.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSeparatorTemplate.E, this.f56873a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSeparatorTemplate.F, this.f56873a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSeparatorTemplate.G, this.f56873a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSeparatorTemplate.H, this.f56873a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSeparatorTemplate.I, this.f56873a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSeparatorTemplate.J, this.f56873a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSeparatorTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSeparatorTemplate.L, this.f56873a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSeparatorTemplate.M, this.f56873a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSeparatorTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSeparatorTemplate.O, this.f56873a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSeparatorTemplate.P, this.f56873a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSeparatorTemplate.Q, this.f56873a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSeparatorTemplate, DivSeparator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56874a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56874a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator resolve(@NotNull ParsingContext parsingContext, @NotNull DivSeparatorTemplate divSeparatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56875a, jSONObject, "accessibility", this.f56874a.J(), this.f56874a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56876b, jSONObject, "action", this.f56874a.w0(), this.f56874a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56877c, jSONObject, "action_animation", this.f56874a.s1(), this.f56874a.q1());
            if (divAnimation == null) {
                divAnimation = DivSeparatorJsonParser.f56859b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56878d, jSONObject, "actions", this.f56874a.w0(), this.f56874a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.f56879e, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f56865h, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.f56880f, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f56866i, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSeparatorTemplate.f56881g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSeparatorJsonParser.f56868k;
            Expression<Double> expression = DivSeparatorJsonParser.f56860c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56882h, jSONObject, "animators", this.f56874a.v1(), this.f56874a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56883i, jSONObject, A2.f64965g, this.f56874a.H1(), this.f56874a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56884j, jSONObject, OutlinedTextFieldKt.BorderId, this.f56874a.N1(), this.f56874a.L1());
            Field<Expression<Boolean>> field2 = divSeparatorTemplate.f56885k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivSeparatorJsonParser.f56861d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field3 = divSeparatorTemplate.f56886l;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, lVar3, DivSeparatorJsonParser.f56869l);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56887m, jSONObject, "delimiter_style", this.f56874a.L6(), this.f56874a.J6());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56888n, jSONObject, "disappear_actions", this.f56874a.R2(), this.f56874a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56889o, jSONObject, "doubletap_actions", this.f56874a.w0(), this.f56874a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56890p, jSONObject, "extensions", this.f56874a.d3(), this.f56874a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56891q, jSONObject, "focus", this.f56874a.B3(), this.f56874a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56892r, jSONObject, "functions", this.f56874a.K3(), this.f56874a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56893s, jSONObject, "height", this.f56874a.a7(), this.f56874a.Y6());
            if (divSize == null) {
                divSize = DivSeparatorJsonParser.f56862e;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56894t, jSONObject, "hover_end_actions", this.f56874a.w0(), this.f56874a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56895u, jSONObject, "hover_start_actions", this.f56874a.w0(), this.f56874a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56896v, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56897w, jSONObject, "layout_provider", this.f56874a.R4(), this.f56874a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f56898x, jSONObject, "longtap_actions", this.f56874a.w0(), this.f56874a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56899y, jSONObject, "margins", this.f56874a.a3(), this.f56874a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f56900z, jSONObject, "paddings", this.f56874a.a3(), this.f56874a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.A, jSONObject, "press_end_actions", this.f56874a.w0(), this.f56874a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.B, jSONObject, "press_start_actions", this.f56874a.w0(), this.f56874a.u0());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.C, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.D, jSONObject, "row_span", typeHelper3, lVar3, DivSeparatorJsonParser.f56870m);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.E, jSONObject, "selected_actions", this.f56874a.w0(), this.f56874a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.F, jSONObject, "tooltips", this.f56874a.R8(), this.f56874a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.G, jSONObject, "transform", this.f56874a.d9(), this.f56874a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.H, jSONObject, "transition_change", this.f56874a.W1(), this.f56874a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.I, jSONObject, "transition_in", this.f56874a.B1(), this.f56874a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.J, jSONObject, "transition_out", this.f56874a.B1(), this.f56874a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSeparatorJsonParser.f56871n);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.L, jSONObject, "variable_triggers", this.f56874a.g9(), this.f56874a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.M, jSONObject, "variables", this.f56874a.m9(), this.f56874a.k9());
            Field<Expression<DivVisibility>> field4 = divSeparatorTemplate.N;
            TypeHelper<DivVisibility> typeHelper4 = DivSeparatorJsonParser.f56867j;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = DivSeparatorJsonParser.f56863f;
            Expression<DivVisibility> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, lVar4, expression4);
            Expression<DivVisibility> expression5 = expressionResolveOptionalExpression8 == null ? expression4 : expressionResolveOptionalExpression8;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.O, jSONObject, "visibility_action", this.f56874a.y9(), this.f56874a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.P, jSONObject, "visibility_actions", this.f56874a.y9(), this.f56874a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.Q, jSONObject, "width", this.f56874a.a7(), this.f56874a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSeparatorJsonParser.f56864g;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, delimiterStyle, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList13, listResolveOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression5, divVisibilityAction, listResolveOptionalList18, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56859b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f56860c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56861d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        int i10 = 7;
        tn.i iVar = null;
        f56862e = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null, i10, iVar));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f56863f = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f56864g = new DivSize.c(new DivMatchParentSize(null == true ? 1 : 0, divSizeUnitValue, null == true ? 1 : 0, i10, iVar));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56865h = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f56866i = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f56867j = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f56868k = new ValueValidator() { // from class: ah.t8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f56869l = new ValueValidator() { // from class: ah.u8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.f(((Long) obj).longValue());
            }
        };
        f56870m = new ValueValidator() { // from class: ah.v8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.g(((Long) obj).longValue());
            }
        };
        f56871n = new ListValidator() { // from class: ah.w8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSeparatorJsonParser.h(list);
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
