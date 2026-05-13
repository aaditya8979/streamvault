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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateJsonParser;
import com.yandex.div2.DivStateTemplate;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57198a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f57199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f57203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivTransitionSelector> f57204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f57205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f57206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f57209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f57210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f57211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivState.State> f57214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f57215r;

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57216a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57216a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivState deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57216a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f57216a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f57216a.q1());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.f57199b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f57216a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivStateJsonParser.f57207j, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivStateJsonParser.f57208k, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStateJsonParser.f57211n;
            Expression<Double> expression = DivStateJsonParser.f57200c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f57216a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f57216a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57216a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivStateJsonParser.f57201d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            Expression<Boolean> expression3 = DivStateJsonParser.f57202e;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression3);
            if (optionalExpression5 != null) {
                expression3 = optionalExpression5;
            }
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivStateJsonParser.f57212o);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper4);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f57216a.P2());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div_id");
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f57216a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f57216a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f57216a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f57216a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57216a.Y6());
            if (divSize == null) {
                divSize = DivStateJsonParser.f57203f;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f57216a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f57216a.u0());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f57216a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f57216a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f57216a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57216a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f57216a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f57216a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivStateJsonParser.f57213p);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f57216a.u0());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "state_id_variable");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "states", this.f57216a.w7(), DivStateJsonParser.f57214q);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f57216a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f57216a.b9());
            TypeHelper<DivTransitionSelector> typeHelper5 = DivStateJsonParser.f57209l;
            sn.l<String, DivTransitionSelector> lVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression4 = DivStateJsonParser.f57204g;
            Expression<DivTransitionSelector> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", typeHelper5, lVar4, expression4);
            Expression<DivTransitionSelector> expression5 = optionalExpression10 == null ? expression4 : optionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f57216a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f57216a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f57216a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.f57215r);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f57216a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f57216a.k9());
            TypeHelper<DivVisibility> typeHelper6 = DivStateJsonParser.f57210m;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression6 = DivStateJsonParser.f57205h;
            Expression<DivVisibility> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, lVar5, expression6);
            Expression<DivVisibility> expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f57216a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f57216a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57216a.Y6());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.f57206i;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression2, expression3, optionalExpression6, optionalExpression7, optionalList4, str, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str2, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, optionalList11, optionalList12, optionalExpression8, optionalExpression9, optionalList13, str3, list, optionalList14, divTransform, expression5, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression7, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivState divState) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divState.o(), this.f57216a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divState.f57165b, this.f57216a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divState.f57166c, this.f57216a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divState.f57167d, this.f57216a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divState.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divState.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divState.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divState.w(), this.f57216a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divState.getBackground(), this.f57216a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divState.x(), this.f57216a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divState.f57174k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divState.f57175l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divState.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_state_id", divState.f57177n);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divState.k(), this.f57216a.P2());
            JsonPropertyParser.write(parsingContext, jSONObject, "div_id", divState.f57179p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divState.f57180q, this.f57216a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divState.getExtensions(), this.f57216a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divState.n(), this.f57216a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divState.u(), this.f57216a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divState.getHeight(), this.f57216a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divState.f57185v, this.f57216a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divState.f57186w, this.f57216a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divState.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divState.r(), this.f57216a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divState.f57189z, this.f57216a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divState.d(), this.f57216a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divState.p(), this.f57216a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divState.C, this.f57216a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divState.D, this.f57216a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divState.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divState.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divState.q(), this.f57216a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "state_id_variable", divState.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divState.I, this.f57216a.w7());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divState.h(), this.f57216a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divState.getTransform(), this.f57216a.b9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divState.L, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divState.j(), this.f57216a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divState.v(), this.f57216a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divState.i(), this.f57216a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divState.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divState.s(), this.f57216a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divState.c(), this.f57216a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divState.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divState.t(), this.f57216a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divState.a(), this.f57216a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divState.getWidth(), this.f57216a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57217a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57217a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStateTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivStateTemplate divStateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57225a : null, this.f57217a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57226b : null, this.f57217a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57227c : null, this.f57217a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57228d : null, this.f57217a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivStateJsonParser.f57207j, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57229e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivStateJsonParser.f57208k, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57230f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57231g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStateJsonParser.f57211n);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57232h : null, this.f57217a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57233i : null, this.f57217a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57234j : null, this.f57217a.M1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divStateTemplate != null ? divStateTemplate.f57235k : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57236l : null, lVar);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divStateTemplate != null ? divStateTemplate.f57237m : null;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivStateJsonParser.f57212o);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_state_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57238n : null);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57239o : null, this.f57217a.Q2());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div_id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57240p : null);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57241q : null, this.f57217a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57242r : null, this.f57217a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57243s : null, this.f57217a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57244t : null, this.f57217a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57245u : null, this.f57217a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57246v : null, this.f57217a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57247w : null, this.f57217a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57248x : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57249y : null, this.f57217a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f57250z : null, this.f57217a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.A : null, this.f57217a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.B : null, this.f57217a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.C : null, this.f57217a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.D : null, this.f57217a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.E : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.F : null, lVar2, DivStateJsonParser.f57213p);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.G : null, this.f57217a.v0());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "state_id_variable", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.H : null);
            Field<List<DivStateTemplate.StateTemplate>> field3 = divStateTemplate != null ? divStateTemplate.I : null;
            bn.g<x3> gVarX7 = this.f57217a.x7();
            ListValidator<DivState.State> listValidator = DivStateJsonParser.f57214q;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field3, gVarX7, listValidator);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.J : null, this.f57217a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.K : null, this.f57217a.c9());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", DivStateJsonParser.f57209l, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.L : null, DivTransitionSelector.FROM_STRING);
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.M : null, this.f57217a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.N : null, this.f57217a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.O : null, this.f57217a.A1());
            Field<List<DivTransitionTrigger>> field4 = divStateTemplate != null ? divStateTemplate.P : null;
            sn.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivStateJsonParser.f57215r;
            tn.p.i(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivStateTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalField5, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField13, optionalField12, listField, optionalListField14, optionalField13, optionalFieldWithExpression10, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar3, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.Q : null, this.f57217a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.R : null, this.f57217a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivStateJsonParser.f57210m, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.S : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.T : null, this.f57217a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.U : null, this.f57217a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.V : null, this.f57217a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStateTemplate divStateTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divStateTemplate.f57225a, this.f57217a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divStateTemplate.f57226b, this.f57217a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divStateTemplate.f57227c, this.f57217a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divStateTemplate.f57228d, this.f57217a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divStateTemplate.f57229e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divStateTemplate.f57230f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divStateTemplate.f57231g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divStateTemplate.f57232h, this.f57217a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divStateTemplate.f57233i, this.f57217a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divStateTemplate.f57234j, this.f57217a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divStateTemplate.f57235k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", divStateTemplate.f57236l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divStateTemplate.f57237m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_state_id", divStateTemplate.f57238n);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divStateTemplate.f57239o, this.f57217a.Q2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "div_id", divStateTemplate.f57240p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divStateTemplate.f57241q, this.f57217a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divStateTemplate.f57242r, this.f57217a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divStateTemplate.f57243s, this.f57217a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divStateTemplate.f57244t, this.f57217a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divStateTemplate.f57245u, this.f57217a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divStateTemplate.f57246v, this.f57217a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divStateTemplate.f57247w, this.f57217a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divStateTemplate.f57248x);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divStateTemplate.f57249y, this.f57217a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divStateTemplate.f57250z, this.f57217a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divStateTemplate.A, this.f57217a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divStateTemplate.B, this.f57217a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divStateTemplate.C, this.f57217a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divStateTemplate.D, this.f57217a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divStateTemplate.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divStateTemplate.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divStateTemplate.G, this.f57217a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "state_id_variable", divStateTemplate.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divStateTemplate.I, this.f57217a.x7());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divStateTemplate.J, this.f57217a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divStateTemplate.K, this.f57217a.c9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divStateTemplate.L, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divStateTemplate.M, this.f57217a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divStateTemplate.N, this.f57217a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divStateTemplate.O, this.f57217a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divStateTemplate.P, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divStateTemplate.Q, this.f57217a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divStateTemplate.R, this.f57217a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divStateTemplate.S, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divStateTemplate.T, this.f57217a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divStateTemplate.U, this.f57217a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divStateTemplate.V, this.f57217a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStateTemplate, DivState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57218a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57218a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivState resolve(@NotNull ParsingContext parsingContext, @NotNull DivStateTemplate divStateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57225a, jSONObject, "accessibility", this.f57218a.J(), this.f57218a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57226b, jSONObject, "action", this.f57218a.w0(), this.f57218a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57227c, jSONObject, "action_animation", this.f57218a.s1(), this.f57218a.q1());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.f57199b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57228d, jSONObject, "actions", this.f57218a.w0(), this.f57218a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.f57229e, jSONObject, "alignment_horizontal", DivStateJsonParser.f57207j, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.f57230f, jSONObject, "alignment_vertical", DivStateJsonParser.f57208k, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divStateTemplate.f57231g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStateJsonParser.f57211n;
            Expression<Double> expression = DivStateJsonParser.f57200c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57232h, jSONObject, "animators", this.f57218a.v1(), this.f57218a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57233i, jSONObject, A2.f64965g, this.f57218a.H1(), this.f57218a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57234j, jSONObject, OutlinedTextFieldKt.BorderId, this.f57218a.N1(), this.f57218a.L1());
            Field<Expression<Boolean>> field2 = divStateTemplate.f57235k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivStateJsonParser.f57201d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Boolean>> field3 = divStateTemplate.f57236l;
            Expression<Boolean> expression4 = DivStateJsonParser.f57202e;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Long>> field4 = divStateTemplate.f57237m;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, lVar3, DivStateJsonParser.f57212o);
            Field<Expression<String>> field5 = divStateTemplate.f57238n;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_state_id", typeHelper4);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57239o, jSONObject, "disappear_actions", this.f57218a.R2(), this.f57218a.P2());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57240p, jSONObject, "div_id");
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57241q, jSONObject, "doubletap_actions", this.f57218a.w0(), this.f57218a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57242r, jSONObject, "extensions", this.f57218a.d3(), this.f57218a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57243s, jSONObject, "focus", this.f57218a.B3(), this.f57218a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57244t, jSONObject, "functions", this.f57218a.K3(), this.f57218a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57245u, jSONObject, "height", this.f57218a.a7(), this.f57218a.Y6());
            if (divSize == null) {
                divSize = DivStateJsonParser.f57203f;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57246v, jSONObject, "hover_end_actions", this.f57218a.w0(), this.f57218a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57247w, jSONObject, "hover_start_actions", this.f57218a.w0(), this.f57218a.u0());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57248x, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f57249y, jSONObject, "layout_provider", this.f57218a.R4(), this.f57218a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f57250z, jSONObject, "longtap_actions", this.f57218a.w0(), this.f57218a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.A, jSONObject, "margins", this.f57218a.a3(), this.f57218a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.B, jSONObject, "paddings", this.f57218a.a3(), this.f57218a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.C, jSONObject, "press_end_actions", this.f57218a.w0(), this.f57218a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.D, jSONObject, "press_start_actions", this.f57218a.w0(), this.f57218a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.E, jSONObject, "reuse_id", typeHelper4);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.F, jSONObject, "row_span", typeHelper3, lVar3, DivStateJsonParser.f57213p);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.G, jSONObject, "selected_actions", this.f57218a.w0(), this.f57218a.u0());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.H, jSONObject, "state_id_variable");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divStateTemplate.I, jSONObject, "states", this.f57218a.y7(), this.f57218a.w7(), DivStateJsonParser.f57214q);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.J, jSONObject, "tooltips", this.f57218a.R8(), this.f57218a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.K, jSONObject, "transform", this.f57218a.d9(), this.f57218a.b9());
            Field<Expression<DivTransitionSelector>> field6 = divStateTemplate.L;
            TypeHelper<DivTransitionSelector> typeHelper5 = DivStateJsonParser.f57209l;
            sn.l<String, DivTransitionSelector> lVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression5 = DivStateJsonParser.f57204g;
            Expression<DivTransitionSelector> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "transition_animation_selector", typeHelper5, lVar4, expression5);
            Expression<DivTransitionSelector> expression6 = expressionResolveOptionalExpression10 == null ? expression5 : expressionResolveOptionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.M, jSONObject, "transition_change", this.f57218a.W1(), this.f57218a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.N, jSONObject, "transition_in", this.f57218a.B1(), this.f57218a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.O, jSONObject, "transition_out", this.f57218a.B1(), this.f57218a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.P, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.f57215r);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.Q, jSONObject, "variable_triggers", this.f57218a.g9(), this.f57218a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.R, jSONObject, "variables", this.f57218a.m9(), this.f57218a.k9());
            Field<Expression<DivVisibility>> field7 = divStateTemplate.S;
            TypeHelper<DivVisibility> typeHelper6 = DivStateJsonParser.f57210m;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression7 = DivStateJsonParser.f57205h;
            Expression<DivVisibility> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "visibility", typeHelper6, lVar5, expression7);
            Expression<DivVisibility> expression8 = expressionResolveOptionalExpression11 == null ? expression7 : expressionResolveOptionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.T, jSONObject, "visibility_action", this.f57218a.y9(), this.f57218a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.U, jSONObject, "visibility_actions", this.f57218a.y9(), this.f57218a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.V, jSONObject, "width", this.f57218a.a7(), this.f57218a.Y6());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.f57206i;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expression4, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList4, str, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str2, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList13, str3, listResolveList, listResolveOptionalList14, divTransform, expression6, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression8, divVisibilityAction, listResolveOptionalList18, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f57199b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f57200c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f57201d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57202e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        f57203f = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null == true ? 1 : 0, 7, null));
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.STATE_CHANGE;
        f57204g = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f57205h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f57206i = new DivSize.c(new DivMatchParentSize(divSizeUnitValue, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57207j = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57208k = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57209l = companion2.from(divTransitionSelector, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        f57210m = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f57211n = new ValueValidator() { // from class: ah.p9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f57212o = new ValueValidator() { // from class: ah.q9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.g(((Long) obj).longValue());
            }
        };
        f57213p = new ValueValidator() { // from class: ah.r9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.h(((Long) obj).longValue());
            }
        };
        f57214q = new ListValidator() { // from class: ah.s9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivStateJsonParser.i(list);
            }
        };
        f57215r = new ListValidator() { // from class: ah.t9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivStateJsonParser.j(list);
            }
        };
    }

    public static final boolean f(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(List list) {
        return list.size() >= 1;
    }

    public static final boolean j(List list) {
        return list.size() >= 1;
    }
}
