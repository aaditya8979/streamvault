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
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSliderJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57067a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f57069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f57073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f57074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f57077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f57078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f57081o;

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57082a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57082a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57082a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSliderJsonParser.f57075i, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSliderJsonParser.f57076j, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSliderJsonParser.f57078l;
            Expression<Double> expression = DivSliderJsonParser.f57068b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f57082a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f57082a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57082a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSliderJsonParser.f57079m);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f57082a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f57082a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f57082a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f57082a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57082a.Y6());
            if (divSize == null) {
                divSize = DivSliderJsonParser.f57069c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSliderJsonParser.f57070d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f57082a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f57082a.Y2());
            Expression<Long> expression3 = DivSliderJsonParser.f57071e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_value", typeHelper2, lVar2, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            Expression<Long> expression4 = DivSliderJsonParser.f57072f;
            Expression<Long> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_value", typeHelper2, lVar2, expression4);
            if (optionalExpression7 != null) {
                expression4 = optionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57082a.Y2());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f57082a.k7());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSliderJsonParser.f57080n);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "secondary_value_accessibility", this.f57082a.H());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f57082a.u0());
            DivDrawable divDrawable = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_style", this.f57082a.V2());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_text_style", this.f57082a.n7());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "thumb_style", this.f57082a.V2());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_text_style", this.f57082a.n7());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_active_style", this.f57082a.V2());
            DivDrawable divDrawable4 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_inactive_style", this.f57082a.V2());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f57082a.P8());
            DivDrawable divDrawable5 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_active_style", this.f57082a.V2());
            DivDrawable divDrawable6 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_inactive_style", this.f57082a.V2());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f57082a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f57082a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f57082a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f57082a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.f57081o);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f57082a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f57082a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSliderJsonParser.f57077k;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression5 = DivSliderJsonParser.f57073g;
            Expression<DivVisibility> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression5);
            Expression<DivVisibility> expression6 = optionalExpression10 == null ? expression5 : optionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f57082a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f57082a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57082a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.f57074h;
            }
            return new DivSlider(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, optionalList6, optionalExpression8, optionalExpression9, divAccessibility2, optionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, optionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression6, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSlider divSlider) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSlider.o(), this.f57082a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSlider.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSlider.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSlider.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSlider.w(), this.f57082a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divSlider.getBackground(), this.f57082a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSlider.x(), this.f57082a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSlider.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSlider.k(), this.f57082a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSlider.getExtensions(), this.f57082a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSlider.n(), this.f57082a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSlider.u(), this.f57082a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSlider.getHeight(), this.f57082a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSlider.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divSlider.f57031o);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSlider.r(), this.f57082a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSlider.d(), this.f57082a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_value", divSlider.f57034r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_value", divSlider.f57035s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSlider.p(), this.f57082a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divSlider.f57037u, this.f57082a.k7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSlider.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSlider.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "secondary_value_accessibility", divSlider.f57040x, this.f57082a.H());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSlider.q(), this.f57082a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_style", divSlider.f57042z, this.f57082a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_text_style", divSlider.A, this.f57082a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_value_variable", divSlider.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_style", divSlider.C, this.f57082a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_text_style", divSlider.D, this.f57082a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_value_variable", divSlider.E);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_active_style", divSlider.F, this.f57082a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_inactive_style", divSlider.G, this.f57082a.V2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSlider.h(), this.f57082a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", divSlider.I, this.f57082a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", divSlider.J, this.f57082a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSlider.getTransform(), this.f57082a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSlider.j(), this.f57082a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSlider.v(), this.f57082a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSlider.i(), this.f57082a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSlider.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSlider.s(), this.f57082a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSlider.c(), this.f57082a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSlider.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSlider.t(), this.f57082a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSlider.a(), this.f57082a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSlider.getWidth(), this.f57082a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57083a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57083a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSliderTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSliderTemplate divSliderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57089a : null, this.f57083a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSliderJsonParser.f57075i, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57090b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSliderJsonParser.f57076j, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57091c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57092d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSliderJsonParser.f57078l);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57093e : null, this.f57083a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57094f : null, this.f57083a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57095g : null, this.f57083a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSliderTemplate != null ? divSliderTemplate.f57096h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSliderJsonParser.f57079m);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57097i : null, this.f57083a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57098j : null, this.f57083a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57099k : null, this.f57083a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57100l : null, this.f57083a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57101m : null, this.f57083a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57102n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57103o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57104p : null, this.f57083a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57105q : null, this.f57083a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57106r : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57107s : null, lVar);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57108t : null, this.f57083a.Z2());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57109u : null, this.f57083a.l7());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57110v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57111w : null, lVar, DivSliderJsonParser.f57080n);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57112x : null, this.f57083a.I());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57113y : null, this.f57083a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f57114z : null, this.f57083a.W2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.A : null, this.f57083a.o7());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.B : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.C : null, this.f57083a.W2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.D : null, this.f57083a.o7());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.E : null);
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.F : null, this.f57083a.W2());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.G : null, this.f57083a.W2());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.H : null, this.f57083a.Q8());
            Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.I : null, this.f57083a.W2());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.J : null, this.f57083a.W2());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.K : null, this.f57083a.c9());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.L : null, this.f57083a.V1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.M : null, this.f57083a.A1());
            Field optionalField20 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.N : null, this.f57083a.A1());
            Field<List<DivTransitionTrigger>> field5 = divSliderTemplate != null ? divSliderTemplate.O : null;
            sn.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSliderJsonParser.f57081o;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSliderTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, optionalField6, optionalField7, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalField8, optionalListField6, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalField9, optionalListField7, optionalField10, optionalField11, optionalField12, field2, optionalField13, optionalField14, optionalField15, optionalField16, optionalListField8, field3, field4, optionalField17, optionalField18, optionalField19, optionalField20, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.P : null, this.f57083a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.Q : null, this.f57083a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSliderJsonParser.f57077k, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.R : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.S : null, this.f57083a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.T : null, this.f57083a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.U : null, this.f57083a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate divSliderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSliderTemplate.f57089a, this.f57083a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSliderTemplate.f57090b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSliderTemplate.f57091c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSliderTemplate.f57092d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSliderTemplate.f57093e, this.f57083a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divSliderTemplate.f57094f, this.f57083a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSliderTemplate.f57095g, this.f57083a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSliderTemplate.f57096h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSliderTemplate.f57097i, this.f57083a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSliderTemplate.f57098j, this.f57083a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSliderTemplate.f57099k, this.f57083a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSliderTemplate.f57100l, this.f57083a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSliderTemplate.f57101m, this.f57083a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSliderTemplate.f57102n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divSliderTemplate.f57103o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSliderTemplate.f57104p, this.f57083a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSliderTemplate.f57105q, this.f57083a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_value", divSliderTemplate.f57106r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_value", divSliderTemplate.f57107s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSliderTemplate.f57108t, this.f57083a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divSliderTemplate.f57109u, this.f57083a.l7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSliderTemplate.f57110v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSliderTemplate.f57111w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "secondary_value_accessibility", divSliderTemplate.f57112x, this.f57083a.I());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSliderTemplate.f57113y, this.f57083a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_style", divSliderTemplate.f57114z, this.f57083a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_text_style", divSliderTemplate.A, this.f57083a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_value_variable", divSliderTemplate.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_style", divSliderTemplate.C, this.f57083a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_text_style", divSliderTemplate.D, this.f57083a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_value_variable", divSliderTemplate.E);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_active_style", divSliderTemplate.F, this.f57083a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_inactive_style", divSliderTemplate.G, this.f57083a.W2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSliderTemplate.H, this.f57083a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", divSliderTemplate.I, this.f57083a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", divSliderTemplate.J, this.f57083a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSliderTemplate.K, this.f57083a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSliderTemplate.L, this.f57083a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSliderTemplate.M, this.f57083a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSliderTemplate.N, this.f57083a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSliderTemplate.O, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSliderTemplate.P, this.f57083a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSliderTemplate.Q, this.f57083a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSliderTemplate.R, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSliderTemplate.S, this.f57083a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSliderTemplate.T, this.f57083a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSliderTemplate.U, this.f57083a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSliderTemplate, DivSlider> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57084a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57084a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider resolve(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate divSliderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57089a, jSONObject, "accessibility", this.f57084a.J(), this.f57084a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f57090b, jSONObject, "alignment_horizontal", DivSliderJsonParser.f57075i, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f57091c, jSONObject, "alignment_vertical", DivSliderJsonParser.f57076j, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSliderTemplate.f57092d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSliderJsonParser.f57078l;
            Expression<Double> expression = DivSliderJsonParser.f57068b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57093e, jSONObject, "animators", this.f57084a.v1(), this.f57084a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57094f, jSONObject, A2.f64965g, this.f57084a.H1(), this.f57084a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57095g, jSONObject, OutlinedTextFieldKt.BorderId, this.f57084a.N1(), this.f57084a.L1());
            Field<Expression<Long>> field2 = divSliderTemplate.f57096h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSliderJsonParser.f57079m);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57097i, jSONObject, "disappear_actions", this.f57084a.R2(), this.f57084a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57098j, jSONObject, "extensions", this.f57084a.d3(), this.f57084a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57099k, jSONObject, "focus", this.f57084a.B3(), this.f57084a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57100l, jSONObject, "functions", this.f57084a.K3(), this.f57084a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57101m, jSONObject, "height", this.f57084a.a7(), this.f57084a.Y6());
            if (divSize == null) {
                divSize = DivSliderJsonParser.f57069c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57102n, jSONObject, "id");
            Field<Expression<Boolean>> field3 = divSliderTemplate.f57103o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSliderJsonParser.f57070d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57104p, jSONObject, "layout_provider", this.f57084a.R4(), this.f57084a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57105q, jSONObject, "margins", this.f57084a.a3(), this.f57084a.Y2());
            Field<Expression<Long>> field4 = divSliderTemplate.f57106r;
            Expression<Long> expression3 = DivSliderJsonParser.f57071e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "max_value", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            Field<Expression<Long>> field5 = divSliderTemplate.f57107s;
            Expression<Long> expression4 = DivSliderJsonParser.f57072f;
            Expression<Long> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "min_value", typeHelper2, lVar2, expression4);
            if (expressionResolveOptionalExpression7 != null) {
                expression4 = expressionResolveOptionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57108t, jSONObject, "paddings", this.f57084a.a3(), this.f57084a.Y2());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57109u, jSONObject, "ranges", this.f57084a.m7(), this.f57084a.k7());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f57110v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f57111w, jSONObject, "row_span", typeHelper2, lVar2, DivSliderJsonParser.f57080n);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57112x, jSONObject, "secondary_value_accessibility", this.f57084a.J(), this.f57084a.H());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f57113y, jSONObject, "selected_actions", this.f57084a.w0(), this.f57084a.u0());
            DivDrawable divDrawable = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f57114z, jSONObject, "thumb_secondary_style", this.f57084a.X2(), this.f57084a.V2());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.A, jSONObject, "thumb_secondary_text_style", this.f57084a.p7(), this.f57084a.n7());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.B, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.C, jSONObject, "thumb_style", this.f57084a.X2(), this.f57084a.V2());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.D, jSONObject, "thumb_text_style", this.f57084a.p7(), this.f57084a.n7());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.E, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.F, jSONObject, "tick_mark_active_style", this.f57084a.X2(), this.f57084a.V2());
            DivDrawable divDrawable4 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.G, jSONObject, "tick_mark_inactive_style", this.f57084a.X2(), this.f57084a.V2());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.H, jSONObject, "tooltips", this.f57084a.R8(), this.f57084a.P8());
            DivDrawable divDrawable5 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.I, jSONObject, "track_active_style", this.f57084a.X2(), this.f57084a.V2());
            DivDrawable divDrawable6 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.J, jSONObject, "track_inactive_style", this.f57084a.X2(), this.f57084a.V2());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.K, jSONObject, "transform", this.f57084a.d9(), this.f57084a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.L, jSONObject, "transition_change", this.f57084a.W1(), this.f57084a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.M, jSONObject, "transition_in", this.f57084a.B1(), this.f57084a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.N, jSONObject, "transition_out", this.f57084a.B1(), this.f57084a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.O, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.f57081o);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.P, jSONObject, "variable_triggers", this.f57084a.g9(), this.f57084a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.Q, jSONObject, "variables", this.f57084a.m9(), this.f57084a.k9());
            Field<Expression<DivVisibility>> field6 = divSliderTemplate.R;
            TypeHelper<DivVisibility> typeHelper4 = DivSliderJsonParser.f57077k;
            sn.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression5 = DivSliderJsonParser.f57073g;
            Expression<DivVisibility> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "visibility", typeHelper4, lVar4, expression5);
            Expression<DivVisibility> expression6 = expressionResolveOptionalExpression10 == null ? expression5 : expressionResolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.S, jSONObject, "visibility_action", this.f57084a.y9(), this.f57084a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.T, jSONObject, "visibility_actions", this.f57084a.y9(), this.f57084a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.U, jSONObject, "width", this.f57084a.a7(), this.f57084a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.f57074h;
            }
            return new DivSlider(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, listResolveOptionalList6, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, divAccessibility2, listResolveOptionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, listResolveOptionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression6, divVisibilityAction, listResolveOptionalList12, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57068b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f57069c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f57070d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57071e = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f57072f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f57073g = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f57074h = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57075i = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57076j = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57077k = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f57078l = new ValueValidator() { // from class: ah.g9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f57079m = new ValueValidator() { // from class: ah.h9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.f(((Long) obj).longValue());
            }
        };
        f57080n = new ValueValidator() { // from class: ah.i9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.g(((Long) obj).longValue());
            }
        };
        f57081o = new ListValidator() { // from class: ah.j9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSliderJsonParser.h(list);
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
