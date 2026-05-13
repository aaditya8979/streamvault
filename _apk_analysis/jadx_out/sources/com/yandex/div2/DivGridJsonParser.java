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
import com.yandex.div2.DivGridJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGridJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGridJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55627a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f55628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f55632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f55645s;

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55646a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55646a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGrid deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55646a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f55646a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f55646a.q1());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.f55628b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f55646a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f55636j;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f55637k;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGridJsonParser.f55641o;
            Expression<Double> expression = DivGridJsonParser.f55629c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55646a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55646a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55646a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivGridJsonParser.f55630d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            Expression<Boolean> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper5, lVar5, DivGridJsonParser.f55642p);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivGridJsonParser.f55643q);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGridJsonParser.f55638l;
            Expression<DivAlignmentHorizontal> expression5 = DivGridJsonParser.f55631e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression5);
            if (optionalExpression6 != null) {
                expression5 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGridJsonParser.f55639m;
            Expression<DivAlignmentVertical> expression6 = DivGridJsonParser.f55632f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55646a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f55646a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55646a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55646a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55646a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55646a.Y6());
            if (divSize == null) {
                divSize = DivGridJsonParser.f55633g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f55646a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f55646a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f55646a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55646a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f55646a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55646a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55646a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f55646a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f55646a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivGridJsonParser.f55644r);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55646a.u0());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55646a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55646a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55646a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55646a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55646a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.f55645s);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55646a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55646a.k9());
            TypeHelper<DivVisibility> typeHelper8 = DivGridJsonParser.f55640n;
            sn.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = DivGridJsonParser.f55634h;
            Expression<DivVisibility> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, lVar6, expression8);
            Expression<DivVisibility> expression9 = optionalExpression10 == null ? expression8 : optionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55646a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55646a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55646a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.f55635i;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression3, expression4, optionalExpression5, expression5, expression7, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str, optionalList10, divLayoutProvider, optionalList11, divEdgeInsets, divEdgeInsets2, optionalList12, optionalList13, optionalExpression8, optionalExpression9, optionalList14, optionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList16, optionalList17, optionalList18, expression9, divVisibilityAction, optionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGrid divGrid) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGrid.o(), this.f55646a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGrid.f55602b, this.f55646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGrid.f55603c, this.f55646a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGrid.f55604d, this.f55646a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divGrid.g();
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionM = divGrid.m();
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGrid.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGrid.w(), this.f55646a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divGrid.getBackground(), this.f55646a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGrid.x(), this.f55646a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGrid.f55611k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGrid.f55612l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGrid.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGrid.f55614n, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGrid.f55615o, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGrid.k(), this.f55646a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGrid.f55617q, this.f55646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGrid.getExtensions(), this.f55646a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGrid.n(), this.f55646a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGrid.u(), this.f55646a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGrid.getHeight(), this.f55646a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGrid.f55622v, this.f55646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGrid.f55623w, this.f55646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGrid.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGrid.f55625y, this.f55646a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGrid.r(), this.f55646a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGrid.A, this.f55646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGrid.d(), this.f55646a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGrid.p(), this.f55646a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGrid.D, this.f55646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGrid.E, this.f55646a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGrid.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGrid.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGrid.q(), this.f55646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGrid.h(), this.f55646a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGrid.getTransform(), this.f55646a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGrid.j(), this.f55646a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGrid.v(), this.f55646a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGrid.i(), this.f55646a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGrid.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGrid.s(), this.f55646a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGrid.c(), this.f55646a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGrid.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGrid.t(), this.f55646a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGrid.a(), this.f55646a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGrid.getWidth(), this.f55646a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55647a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55647a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGridTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivGridTemplate divGridTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55653a : null, this.f55647a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55654b : null, this.f55647a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55655c : null, this.f55647a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55656d : null, this.f55647a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f55636j;
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate != null ? divGridTemplate.f55657e : null;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f55637k;
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate != null ? divGridTemplate.f55658f : null;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55659g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGridJsonParser.f55641o);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55660h : null, this.f55647a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55661i : null, this.f55647a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55662j : null, this.f55647a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55663k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = divGridTemplate != null ? divGridTemplate.f55664l : null;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_count", typeHelper3, allowPropertyOverride, field3, lVar3, DivGridJsonParser.f55642p);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55665m : null, lVar3, DivGridJsonParser.f55643q);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGridJsonParser.f55638l, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55666n : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGridJsonParser.f55639m, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55667o : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55668p : null, this.f55647a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55669q : null, this.f55647a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55670r : null, this.f55647a.c3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55671s : null, this.f55647a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55672t : null, this.f55647a.J3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55673u : null, this.f55647a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55674v : null, this.f55647a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55675w : null, this.f55647a.v0());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55676x : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55677y : null, this.f55647a.N4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f55678z : null, this.f55647a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.A : null, this.f55647a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.B : null, this.f55647a.Z2());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.C : null, this.f55647a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.D : null, this.f55647a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.E : null, this.f55647a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.F : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.G : null, lVar3, DivGridJsonParser.f55644r);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.H : null, this.f55647a.v0());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.I : null, this.f55647a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.J : null, this.f55647a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.K : null, this.f55647a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.L : null, this.f55647a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.M : null, this.f55647a.A1());
            Field<List<DivTransitionTrigger>> field4 = divGridTemplate != null ? divGridTemplate.N : null;
            sn.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivGridJsonParser.f55645s;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGridTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, fieldWithExpression, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField5, optionalListField7, optionalField6, optionalListField8, optionalListField9, optionalField7, optionalListField10, optionalField8, optionalListField11, optionalField9, optionalField10, optionalListField12, optionalListField13, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField14, optionalListField15, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.O : null, this.f55647a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.P : null, this.f55647a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivGridJsonParser.f55640n, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.Q : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.R : null, this.f55647a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.S : null, this.f55647a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.T : null, this.f55647a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGridTemplate divGridTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGridTemplate.f55653a, this.f55647a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGridTemplate.f55654b, this.f55647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGridTemplate.f55655c, this.f55647a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGridTemplate.f55656d, this.f55647a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate.f55657e;
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate.f55658f;
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGridTemplate.f55659g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGridTemplate.f55660h, this.f55647a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divGridTemplate.f55661i, this.f55647a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGridTemplate.f55662j, this.f55647a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGridTemplate.f55663k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", divGridTemplate.f55664l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGridTemplate.f55665m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGridTemplate.f55666n, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGridTemplate.f55667o, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGridTemplate.f55668p, this.f55647a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGridTemplate.f55669q, this.f55647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGridTemplate.f55670r, this.f55647a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGridTemplate.f55671s, this.f55647a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGridTemplate.f55672t, this.f55647a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGridTemplate.f55673u, this.f55647a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGridTemplate.f55674v, this.f55647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGridTemplate.f55675w, this.f55647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGridTemplate.f55676x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divGridTemplate.f55677y, this.f55647a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGridTemplate.f55678z, this.f55647a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGridTemplate.A, this.f55647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGridTemplate.B, this.f55647a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGridTemplate.C, this.f55647a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGridTemplate.D, this.f55647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGridTemplate.E, this.f55647a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGridTemplate.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGridTemplate.G);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGridTemplate.H, this.f55647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGridTemplate.I, this.f55647a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGridTemplate.J, this.f55647a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGridTemplate.K, this.f55647a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGridTemplate.L, this.f55647a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGridTemplate.M, this.f55647a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGridTemplate.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGridTemplate.O, this.f55647a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGridTemplate.P, this.f55647a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divGridTemplate.Q, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGridTemplate.R, this.f55647a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGridTemplate.S, this.f55647a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGridTemplate.T, this.f55647a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivGridTemplate, DivGrid> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55648a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55648a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGrid resolve(@NotNull ParsingContext parsingContext, @NotNull DivGridTemplate divGridTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55653a, jSONObject, "accessibility", this.f55648a.J(), this.f55648a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55654b, jSONObject, "action", this.f55648a.w0(), this.f55648a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55655c, jSONObject, "action_animation", this.f55648a.s1(), this.f55648a.q1());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.f55628b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55656d, jSONObject, "actions", this.f55648a.w0(), this.f55648a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate.f55657e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f55636j;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate.f55658f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f55637k;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divGridTemplate.f55659g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGridJsonParser.f55641o;
            Expression<Double> expression = DivGridJsonParser.f55629c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55660h, jSONObject, "animators", this.f55648a.v1(), this.f55648a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55661i, jSONObject, A2.f64965g, this.f55648a.H1(), this.f55648a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55662j, jSONObject, OutlinedTextFieldKt.BorderId, this.f55648a.N1(), this.f55648a.L1());
            Field<Expression<Boolean>> field4 = divGridTemplate.f55663k;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivGridJsonParser.f55630d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divGridTemplate.f55664l;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field5, jSONObject, "column_count", typeHelper5, lVar5, DivGridJsonParser.f55642p);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.f55665m, jSONObject, "column_span", typeHelper5, lVar5, DivGridJsonParser.f55643q);
            Field<Expression<DivAlignmentHorizontal>> field6 = divGridTemplate.f55666n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGridJsonParser.f55638l;
            Expression<DivAlignmentHorizontal> expression4 = DivGridJsonParser.f55631e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivAlignmentVertical>> field7 = divGridTemplate.f55667o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGridJsonParser.f55639m;
            Expression<DivAlignmentVertical> expression5 = DivGridJsonParser.f55632f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55668p, jSONObject, "disappear_actions", this.f55648a.R2(), this.f55648a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55669q, jSONObject, "doubletap_actions", this.f55648a.w0(), this.f55648a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55670r, jSONObject, "extensions", this.f55648a.d3(), this.f55648a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55671s, jSONObject, "focus", this.f55648a.B3(), this.f55648a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55672t, jSONObject, "functions", this.f55648a.K3(), this.f55648a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55673u, jSONObject, "height", this.f55648a.a7(), this.f55648a.Y6());
            if (divSize == null) {
                divSize = DivGridJsonParser.f55633g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55674v, jSONObject, "hover_end_actions", this.f55648a.w0(), this.f55648a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55675w, jSONObject, "hover_start_actions", this.f55648a.w0(), this.f55648a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55676x, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f55677y, jSONObject, "items", this.f55648a.O4(), this.f55648a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f55678z, jSONObject, "layout_provider", this.f55648a.R4(), this.f55648a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.A, jSONObject, "longtap_actions", this.f55648a.w0(), this.f55648a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.B, jSONObject, "margins", this.f55648a.a3(), this.f55648a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.C, jSONObject, "paddings", this.f55648a.a3(), this.f55648a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.D, jSONObject, "press_end_actions", this.f55648a.w0(), this.f55648a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.E, jSONObject, "press_start_actions", this.f55648a.w0(), this.f55648a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.F, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.G, jSONObject, "row_span", typeHelper5, lVar5, DivGridJsonParser.f55644r);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.H, jSONObject, "selected_actions", this.f55648a.w0(), this.f55648a.u0());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.I, jSONObject, "tooltips", this.f55648a.R8(), this.f55648a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.J, jSONObject, "transform", this.f55648a.d9(), this.f55648a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.K, jSONObject, "transition_change", this.f55648a.W1(), this.f55648a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.L, jSONObject, "transition_in", this.f55648a.B1(), this.f55648a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.M, jSONObject, "transition_out", this.f55648a.B1(), this.f55648a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.N, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.f55645s);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.O, jSONObject, "variable_triggers", this.f55648a.g9(), this.f55648a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.P, jSONObject, "variables", this.f55648a.m9(), this.f55648a.k9());
            Field<Expression<DivVisibility>> field8 = divGridTemplate.Q;
            TypeHelper<DivVisibility> typeHelper8 = DivGridJsonParser.f55640n;
            sn.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression6 = DivGridJsonParser.f55634h;
            Expression<DivVisibility> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper8, lVar6, expression6);
            Expression<DivVisibility> expression7 = expressionResolveOptionalExpression10 == null ? expression6 : expressionResolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.R, jSONObject, "visibility_action", this.f55648a.y9(), this.f55648a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.S, jSONObject, "visibility_actions", this.f55648a.y9(), this.f55648a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.T, jSONObject, "width", this.f55648a.a7(), this.f55648a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.f55635i;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expressionResolveExpression, expressionResolveOptionalExpression5, expression4, expression5, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, divLayoutProvider, listResolveOptionalList11, divEdgeInsets, divEdgeInsets2, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList14, listResolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression7, divVisibilityAction, listResolveOptionalList19, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        DivSizeUnitValue divSizeUnitValue = null;
        tn.i iVar = null;
        f55628b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55629c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55630d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f55631e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        f55632f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        int i10 = 7;
        f55633g = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null, i10, iVar));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55634h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55635i = new DivSize.c(new DivMatchParentSize(null == true ? 1 : 0, divSizeUnitValue, null == true ? 1 : 0, i10, iVar));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55636j = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55637k = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55638l = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55639m = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55640n = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55641o = new ValueValidator() { // from class: ah.x4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f55642p = new ValueValidator() { // from class: ah.y4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.g(((Long) obj).longValue());
            }
        };
        f55643q = new ValueValidator() { // from class: ah.z4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.h(((Long) obj).longValue());
            }
        };
        f55644r = new ValueValidator() { // from class: ah.a5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.i(((Long) obj).longValue());
            }
        };
        f55645s = new ListValidator() { // from class: ah.b5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivGridJsonParser.j(list);
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

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(List list) {
        return list.size() >= 1;
    }
}
