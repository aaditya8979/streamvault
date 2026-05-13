package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
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
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTextJsonParser {

    @Deprecated
    @NotNull
    public static final TypeHelper<DivLineStyle> A;

    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> B;

    @Deprecated
    @NotNull
    public static final ValueValidator<Double> C;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> D;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> E;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> F;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> G;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> H;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> I;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> J;

    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57735a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f57736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f57740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f57741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivLineStyle> f57744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f57745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f57746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivText.Truncate> f57749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivLineStyle> f57750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f57751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f57752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f57755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivLineStyle> f57757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivText.Truncate> f57760z;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57761a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57761a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57761a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f57761a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f57761a.q1());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.f57736b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f57761a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f57753s;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f57754t;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTextJsonParser.C;
            Expression<Double> expression = DivTextJsonParser.f57737c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f57761a.t1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, lVar4);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f57761a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57761a.L1());
            Expression<Boolean> expression2 = DivTextJsonParser.f57738d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivTextJsonParser.D);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f57761a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f57761a.u0());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonPropertyParser.readOptional(parsingContext, jSONObject, "ellipsis", this.f57761a.d8());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f57761a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f57761a.z3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, lVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
            ValueValidator<Long> valueValidator2 = DivTextJsonParser.E;
            Expression<Long> expression3 = DivTextJsonParser.f57739e;
            Expression<Long> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression3);
            if (optionalExpression10 != null) {
                expression3 = optionalExpression10;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = DivTextJsonParser.f57755u;
            sn.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = DivTextJsonParser.f57740f;
            Expression<DivSizeUnit> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, lVar7, expression4);
            Expression<DivSizeUnit> expression5 = optionalExpression11 == null ? expression4 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f57756v, DivFontWeight.FROM_STRING);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, lVar5, DivTextJsonParser.F);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f57761a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57761a.Y6());
            if (divSize == null) {
                divSize = DivTextJsonParser.f57741g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f57761a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f57761a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f57761a.m8());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f57761a.P4());
            Expression<Double> expression6 = DivTextJsonParser.f57742h;
            Expression<Double> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression6);
            Expression<Double> expression7 = optionalExpression15 == null ? expression6 : optionalExpression15;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, lVar5, DivTextJsonParser.G);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f57761a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f57761a.Y2());
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, lVar5, DivTextJsonParser.H);
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, lVar5, DivTextJsonParser.I);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57761a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f57761a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f57761a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f57761a.y8());
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivTextJsonParser.J);
            Expression<Boolean> expression8 = DivTextJsonParser.f57743i;
            Expression<Boolean> optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, lVar4, expression8);
            Expression<Boolean> expression9 = optionalExpression21 == null ? expression8 : optionalExpression21;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f57761a.u0());
            TypeHelper<DivLineStyle> typeHelper9 = DivTextJsonParser.f57757w;
            sn.l<String, DivLineStyle> lVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression10 = DivTextJsonParser.f57744j;
            Expression<DivLineStyle> optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper9, lVar8, expression10);
            Expression<DivLineStyle> expression11 = optionalExpression22 == null ? expression10 : optionalExpression22;
            Expression expression12 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = DivTextJsonParser.f57758x;
            Expression<DivAlignmentHorizontal> expression13 = DivTextJsonParser.f57745k;
            Expression<DivAlignmentHorizontal> optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper10, lVar, expression13);
            Expression<DivAlignmentHorizontal> expression14 = optionalExpression23 == null ? expression13 : optionalExpression23;
            TypeHelper<DivAlignmentVertical> typeHelper11 = DivTextJsonParser.f57759y;
            Expression<DivAlignmentVertical> expression15 = DivTextJsonParser.f57746l;
            Expression<DivAlignmentVertical> optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper11, lVar2, expression15);
            Expression<DivAlignmentVertical> expression16 = optionalExpression24 == null ? expression15 : optionalExpression24;
            Expression<Integer> expression17 = DivTextJsonParser.f57747m;
            Expression<Integer> optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, lVar6, expression17);
            Expression<Integer> expression18 = optionalExpression25 == null ? expression17 : optionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_gradient", this.f57761a.g8());
            DivShadow divShadow = (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f57761a.P6());
            Expression<Boolean> expression19 = DivTextJsonParser.f57748n;
            Expression<Boolean> optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, lVar4, expression19);
            Expression<Boolean> expression20 = optionalExpression26 == null ? expression19 : optionalExpression26;
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f57761a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f57761a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f57761a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f57761a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f57761a.z1());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.K);
            TypeHelper<DivText.Truncate> typeHelper12 = DivTextJsonParser.f57760z;
            sn.l<String, DivText.Truncate> lVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression21 = DivTextJsonParser.f57749o;
            Expression<DivText.Truncate> optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", typeHelper12, lVar9, expression21);
            Expression<DivText.Truncate> expression22 = optionalExpression27 == null ? expression21 : optionalExpression27;
            TypeHelper<DivLineStyle> typeHelper13 = DivTextJsonParser.A;
            Expression<DivLineStyle> expression23 = DivTextJsonParser.f57750p;
            Expression<DivLineStyle> optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", typeHelper13, lVar8, expression23);
            Expression<DivLineStyle> expression24 = optionalExpression28 == null ? expression23 : optionalExpression28;
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f57761a.e9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f57761a.k9());
            TypeHelper<DivVisibility> typeHelper14 = DivTextJsonParser.B;
            sn.l<String, DivVisibility> lVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression25 = DivTextJsonParser.f57751q;
            Expression<DivVisibility> optionalExpression29 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, lVar10, expression25);
            Expression<DivVisibility> expression26 = optionalExpression29 == null ? expression25 : optionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f57761a.w9());
            List optionalList20 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f57761a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57761a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.f57752r;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalExpression4, optionalList3, divBorder, expression2, optionalExpression6, optionalList4, optionalList5, ellipsis, optionalList6, divFocus, optionalExpression7, optionalExpression8, optionalExpression9, expression3, expression5, optionalExpression12, optionalExpression13, optionalExpression14, optionalList7, divSize2, optionalList8, optionalList9, str, optionalList10, divLayoutProvider, expression7, optionalExpression16, optionalList11, divEdgeInsets, optionalExpression17, optionalExpression18, divEdgeInsets2, optionalList12, optionalList13, optionalList14, optionalExpression19, optionalExpression20, expression9, optionalList15, expression11, expression12, expression14, expression16, expression18, divTextGradient, divShadow, expression20, optionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList17, expression22, expression24, optionalList18, optionalList19, expression26, divVisibilityAction, optionalList20, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivText divText) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divText.o(), this.f57761a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divText.f57608b, this.f57761a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divText.f57610c, this.f57761a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divText.f57612d, this.f57761a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divText.g();
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionM = divText.m();
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divText.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divText.w(), this.f57761a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "auto_ellipsize", divText.f57622i);
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divText.getBackground(), this.f57761a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divText.x(), this.f57761a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divText.f57628l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divText.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divText.k(), this.f57761a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divText.f57634o, this.f57761a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "ellipsis", divText.f57636p, this.f57761a.d8());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divText.getExtensions(), this.f57761a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divText.n(), this.f57761a.z3());
            Expression<Integer> expression = divText.f57642s;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "focused_text_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divText.f57643t);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", divText.f57644u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divText.f57645v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divText.f57646w, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divText.f57647x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divText.f57648y, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divText.f57649z);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divText.u(), this.f57761a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divText.getHeight(), this.f57761a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divText.C, this.f57761a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divText.D, this.f57761a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divText.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "images", divText.F, this.f57761a.m8());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divText.r(), this.f57761a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divText.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divText.I);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divText.J, this.f57761a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divText.d(), this.f57761a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_lines", divText.L);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_hidden_lines", divText.M);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divText.p(), this.f57761a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divText.O, this.f57761a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divText.P, this.f57761a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divText.Q, this.f57761a.y8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divText.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divText.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selectable", divText.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divText.q(), this.f57761a.u0());
            Expression<DivLineStyle> expression2 = divText.V;
            sn.l<DivLineStyle, String> lVar4 = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression2, lVar4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", divText.W);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divText.X, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divText.Y, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divText.Z, lVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_gradient", divText.f57607a0, this.f57761a.g8());
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", divText.f57609b0, this.f57761a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tighten_width", divText.f57611c0);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divText.h(), this.f57761a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divText.getTransform(), this.f57761a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divText.j(), this.f57761a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divText.v(), this.f57761a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divText.i(), this.f57761a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divText.l(), DivTransitionTrigger.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "truncate", divText.f57625j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", divText.f57627k0, lVar4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divText.s(), this.f57761a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divText.c(), this.f57761a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divText.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divText.t(), this.f57761a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divText.a(), this.f57761a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divText.getWidth(), this.f57761a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57762a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57762a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextTemplate divTextTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57861a : null, this.f57762a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57863b : null, this.f57762a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57865c : null, this.f57762a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57867d : null, this.f57762a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f57753s;
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate != null ? divTextTemplate.f57869e : null;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f57754t;
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate != null ? divTextTemplate.f57871f : null;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = divTextTemplate != null ? divTextTemplate.f57873g : null;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, lVar3, DivTextJsonParser.C);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57875h : null, this.f57762a.u1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field4 = divTextTemplate != null ? divTextTemplate.f57877i : null;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field4, lVar4);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57879j : null, this.f57762a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57881k : null, this.f57762a.M1());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57883l : null, lVar4);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field5 = divTextTemplate != null ? divTextTemplate.f57885m : null;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field5, lVar5, DivTextJsonParser.D);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57887n : null, this.f57762a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57889o : null, this.f57762a.v0());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57891p : null, this.f57762a.e8());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57893q : null, this.f57762a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57895r : null, this.f57762a.A3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field6 = divTextTemplate != null ? divTextTemplate.f57896s : null;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field6, lVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57897t : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57898u : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57899v : null, lVar5, DivTextJsonParser.E);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTextJsonParser.f57755u, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57900w : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57901x : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f57756v, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57902y : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57903z : null, lVar5, DivTextJsonParser.F);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.A : null, this.f57762a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.B : null, this.f57762a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.C : null, this.f57762a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.D : null, this.f57762a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.E : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.F : null, this.f57762a.n8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.G : null, this.f57762a.Q4());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.H : null, lVar3);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.I : null, lVar5, DivTextJsonParser.G);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.J : null, this.f57762a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.K : null, this.f57762a.Z2());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.L : null, lVar5, DivTextJsonParser.H);
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.M : null, lVar5, DivTextJsonParser.I);
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.N : null, this.f57762a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.O : null, this.f57762a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.P : null, this.f57762a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Q : null, this.f57762a.z8());
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.R : null);
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.S : null, lVar5, DivTextJsonParser.J);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.T : null, lVar4);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.U : null, this.f57762a.v0());
            TypeHelper<DivLineStyle> typeHelper8 = DivTextJsonParser.f57757w;
            Field<Expression<DivLineStyle>> field7 = divTextTemplate != null ? divTextTemplate.V : null;
            sn.l<String, DivLineStyle> lVar7 = DivLineStyle.FROM_STRING;
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field7, lVar7);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.W : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivTextJsonParser.f57758x, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.X : null, lVar);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", DivTextJsonParser.f57759y, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Y : null, lVar2);
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Z : null, lVar6);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57862a0 : null, this.f57762a.h8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57864b0 : null, this.f57762a.Q6());
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57866c0 : null, lVar4);
            Field optionalListField16 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57868d0 : null, this.f57762a.Q8());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57870e0 : null, this.f57762a.c9());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57872f0 : null, this.f57762a.V1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57874g0 : null, this.f57762a.A1());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57876h0 : null, this.f57762a.A1());
            Field<List<DivTransitionTrigger>> field8 = divTextTemplate != null ? divTextTemplate.f57878i0 : null;
            sn.l<String, DivTransitionTrigger> lVar8 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivTextJsonParser.K;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTextTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalFieldWithExpression4, optionalListField3, optionalField4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField4, optionalListField5, optionalField5, optionalListField6, optionalField6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalListField10, optionalField9, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField11, optionalField10, optionalFieldWithExpression17, optionalFieldWithExpression18, optionalField11, optionalListField12, optionalListField13, optionalListField14, optionalFieldWithExpression19, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalListField15, optionalFieldWithExpression22, fieldWithExpression, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalFieldWithExpression25, optionalField12, optionalField13, optionalFieldWithExpression26, optionalListField16, optionalField14, optionalField15, optionalField16, optionalField17, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, lVar8, listValidator), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "truncate", DivTextJsonParser.f57760z, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57880j0 : null, DivText.Truncate.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", DivTextJsonParser.A, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57882k0 : null, lVar7), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57884l0 : null, this.f57762a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57886m0 : null, this.f57762a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivTextJsonParser.B, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57888n0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57890o0 : null, this.f57762a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57892p0 : null, this.f57762a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f57894q0 : null, this.f57762a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate divTextTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTextTemplate.f57861a, this.f57762a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divTextTemplate.f57863b, this.f57762a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divTextTemplate.f57865c, this.f57762a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTextTemplate.f57867d, this.f57762a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate.f57869e;
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate.f57871f;
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTextTemplate.f57873g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTextTemplate.f57875h, this.f57762a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "auto_ellipsize", divTextTemplate.f57877i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divTextTemplate.f57879j, this.f57762a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divTextTemplate.f57881k, this.f57762a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divTextTemplate.f57883l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTextTemplate.f57885m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTextTemplate.f57887n, this.f57762a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divTextTemplate.f57889o, this.f57762a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "ellipsis", divTextTemplate.f57891p, this.f57762a.e8());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTextTemplate.f57893q, this.f57762a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTextTemplate.f57895r, this.f57762a.A3());
            Field<Expression<Integer>> field3 = divTextTemplate.f57896s;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "focused_text_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divTextTemplate.f57897t);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", divTextTemplate.f57898u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divTextTemplate.f57899v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divTextTemplate.f57900w, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divTextTemplate.f57901x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divTextTemplate.f57902y, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divTextTemplate.f57903z);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTextTemplate.A, this.f57762a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTextTemplate.B, this.f57762a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divTextTemplate.C, this.f57762a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divTextTemplate.D, this.f57762a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTextTemplate.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "images", divTextTemplate.F, this.f57762a.n8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTextTemplate.G, this.f57762a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divTextTemplate.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divTextTemplate.I);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divTextTemplate.J, this.f57762a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTextTemplate.K, this.f57762a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_lines", divTextTemplate.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_hidden_lines", divTextTemplate.M);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTextTemplate.N, this.f57762a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divTextTemplate.O, this.f57762a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divTextTemplate.P, this.f57762a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divTextTemplate.Q, this.f57762a.z8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTextTemplate.R);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTextTemplate.S);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selectable", divTextTemplate.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTextTemplate.U, this.f57762a.v0());
            Field<Expression<DivLineStyle>> field4 = divTextTemplate.V;
            sn.l<DivLineStyle, String> lVar4 = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field4, lVar4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", divTextTemplate.W);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divTextTemplate.X, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divTextTemplate.Y, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divTextTemplate.Z, lVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_gradient", divTextTemplate.f57862a0, this.f57762a.h8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", divTextTemplate.f57864b0, this.f57762a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tighten_width", divTextTemplate.f57866c0);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTextTemplate.f57868d0, this.f57762a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTextTemplate.f57870e0, this.f57762a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTextTemplate.f57872f0, this.f57762a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTextTemplate.f57874g0, this.f57762a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTextTemplate.f57876h0, this.f57762a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTextTemplate.f57878i0, DivTransitionTrigger.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "truncate", divTextTemplate.f57880j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", divTextTemplate.f57882k0, lVar4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTextTemplate.f57884l0, this.f57762a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTextTemplate.f57886m0, this.f57762a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divTextTemplate.f57888n0, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTextTemplate.f57890o0, this.f57762a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTextTemplate.f57892p0, this.f57762a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTextTemplate.f57894q0, this.f57762a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate, DivText> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57763a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57763a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate divTextTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57861a, jSONObject, "accessibility", this.f57763a.J(), this.f57763a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57863b, jSONObject, "action", this.f57763a.w0(), this.f57763a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57865c, jSONObject, "action_animation", this.f57763a.s1(), this.f57763a.q1());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.f57736b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57867d, jSONObject, "actions", this.f57763a.w0(), this.f57763a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate.f57869e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f57753s;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate.f57871f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f57754t;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divTextTemplate.f57873g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTextJsonParser.C;
            Expression<Double> expression = DivTextJsonParser.f57737c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57875h, jSONObject, "animators", this.f57763a.v1(), this.f57763a.t1());
            Field<Expression<Boolean>> field4 = divTextTemplate.f57877i;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "auto_ellipsize", typeHelper4, lVar4);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57879j, jSONObject, A2.f64965g, this.f57763a.H1(), this.f57763a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57881k, jSONObject, OutlinedTextFieldKt.BorderId, this.f57763a.N1(), this.f57763a.L1());
            Field<Expression<Boolean>> field5 = divTextTemplate.f57883l;
            Expression<Boolean> expression2 = DivTextJsonParser.f57738d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Field<Expression<Long>> field6 = divTextTemplate.f57885m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, lVar5, DivTextJsonParser.D);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57887n, jSONObject, "disappear_actions", this.f57763a.R2(), this.f57763a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57889o, jSONObject, "doubletap_actions", this.f57763a.w0(), this.f57763a.u0());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57891p, jSONObject, "ellipsis", this.f57763a.f8(), this.f57763a.d8());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57893q, jSONObject, "extensions", this.f57763a.d3(), this.f57763a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57895r, jSONObject, "focus", this.f57763a.B3(), this.f57763a.z3());
            Field<Expression<Integer>> field7 = divTextTemplate.f57896s;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "focused_text_color", typeHelper6, lVar6);
            Field<Expression<String>> field8 = divTextTemplate.f57897t;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f57898u, jSONObject, "font_feature_settings", typeHelper7);
            Field<Expression<Long>> field9 = divTextTemplate.f57899v;
            ValueValidator<Long> valueValidator2 = DivTextJsonParser.E;
            Expression<Long> expression4 = DivTextJsonParser.f57739e;
            Expression<Long> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression4);
            if (expressionResolveOptionalExpression10 != null) {
                expression4 = expressionResolveOptionalExpression10;
            }
            Field<Expression<DivSizeUnit>> field10 = divTextTemplate.f57900w;
            TypeHelper<DivSizeUnit> typeHelper8 = DivTextJsonParser.f57755u;
            sn.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression5 = DivTextJsonParser.f57740f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size_unit", typeHelper8, lVar7, expression5);
            Expression<DivSizeUnit> expression6 = expressionResolveOptionalExpression11 == null ? expression5 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f57901x, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f57902y, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f57756v, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f57903z, jSONObject, "font_weight_value", typeHelper5, lVar5, DivTextJsonParser.F);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.A, jSONObject, "functions", this.f57763a.K3(), this.f57763a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.B, jSONObject, "height", this.f57763a.a7(), this.f57763a.Y6());
            if (divSize == null) {
                divSize = DivTextJsonParser.f57741g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.C, jSONObject, "hover_end_actions", this.f57763a.w0(), this.f57763a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.D, jSONObject, "hover_start_actions", this.f57763a.w0(), this.f57763a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.E, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.F, jSONObject, "images", this.f57763a.o8(), this.f57763a.m8());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.G, jSONObject, "layout_provider", this.f57763a.R4(), this.f57763a.P4());
            Field<Expression<Double>> field11 = divTextTemplate.H;
            Expression<Double> expression7 = DivTextJsonParser.f57742h;
            Expression<Double> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "letter_spacing", typeHelper3, lVar3, expression7);
            Expression<Double> expression8 = expressionResolveOptionalExpression15 == null ? expression7 : expressionResolveOptionalExpression15;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.I, jSONObject, "line_height", typeHelper5, lVar5, DivTextJsonParser.G);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.J, jSONObject, "longtap_actions", this.f57763a.w0(), this.f57763a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.K, jSONObject, "margins", this.f57763a.a3(), this.f57763a.Y2());
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.L, jSONObject, "max_lines", typeHelper5, lVar5, DivTextJsonParser.H);
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.M, jSONObject, "min_hidden_lines", typeHelper5, lVar5, DivTextJsonParser.I);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.N, jSONObject, "paddings", this.f57763a.a3(), this.f57763a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.O, jSONObject, "press_end_actions", this.f57763a.w0(), this.f57763a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.P, jSONObject, "press_start_actions", this.f57763a.w0(), this.f57763a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.Q, jSONObject, "ranges", this.f57763a.A8(), this.f57763a.y8());
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.R, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.S, jSONObject, "row_span", typeHelper5, lVar5, DivTextJsonParser.J);
            Field<Expression<Boolean>> field12 = divTextTemplate.T;
            Expression<Boolean> expression9 = DivTextJsonParser.f57743i;
            Expression<Boolean> expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "selectable", typeHelper4, lVar4, expression9);
            Expression<Boolean> expression10 = expressionResolveOptionalExpression21 == null ? expression9 : expressionResolveOptionalExpression21;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.U, jSONObject, "selected_actions", this.f57763a.w0(), this.f57763a.u0());
            Field<Expression<DivLineStyle>> field13 = divTextTemplate.V;
            TypeHelper<DivLineStyle> typeHelper9 = DivTextJsonParser.f57757w;
            sn.l<String, DivLineStyle> lVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression11 = DivTextJsonParser.f57744j;
            Expression<DivLineStyle> expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "strike", typeHelper9, lVar8, expression11);
            Expression<DivLineStyle> expression12 = expressionResolveOptionalExpression22 == null ? expression11 : expressionResolveOptionalExpression22;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextTemplate.W, jSONObject, "text", typeHelper7);
            Field<Expression<DivAlignmentHorizontal>> field14 = divTextTemplate.X;
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = DivTextJsonParser.f57758x;
            Expression<DivAlignmentHorizontal> expression13 = DivTextJsonParser.f57745k;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "text_alignment_horizontal", typeHelper10, lVar, expression13);
            Expression<DivAlignmentHorizontal> expression14 = expressionResolveOptionalExpression23 == null ? expression13 : expressionResolveOptionalExpression23;
            Field<Expression<DivAlignmentVertical>> field15 = divTextTemplate.Y;
            TypeHelper<DivAlignmentVertical> typeHelper11 = DivTextJsonParser.f57759y;
            Expression<DivAlignmentVertical> expression15 = DivTextJsonParser.f57746l;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "text_alignment_vertical", typeHelper11, lVar2, expression15);
            Expression<DivAlignmentVertical> expression16 = expressionResolveOptionalExpression24 == null ? expression15 : expressionResolveOptionalExpression24;
            Field<Expression<Integer>> field16 = divTextTemplate.Z;
            Expression<Integer> expression17 = DivTextJsonParser.f57747m;
            Expression<Integer> expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_color", typeHelper6, lVar6, expression17);
            Expression<Integer> expression18 = expressionResolveOptionalExpression25 == null ? expression17 : expressionResolveOptionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57862a0, jSONObject, "text_gradient", this.f57763a.i8(), this.f57763a.g8());
            DivShadow divShadow = (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57864b0, jSONObject, "text_shadow", this.f57763a.R6(), this.f57763a.P6());
            Field<Expression<Boolean>> field17 = divTextTemplate.f57866c0;
            Expression<Boolean> expression19 = DivTextJsonParser.f57748n;
            Expression<Boolean> expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "tighten_width", typeHelper4, lVar4, expression19);
            Expression<Boolean> expression20 = expressionResolveOptionalExpression26 == null ? expression19 : expressionResolveOptionalExpression26;
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57868d0, jSONObject, "tooltips", this.f57763a.R8(), this.f57763a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57870e0, jSONObject, "transform", this.f57763a.d9(), this.f57763a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57872f0, jSONObject, "transition_change", this.f57763a.W1(), this.f57763a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57874g0, jSONObject, "transition_in", this.f57763a.B1(), this.f57763a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57876h0, jSONObject, "transition_out", this.f57763a.B1(), this.f57763a.z1());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57878i0, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.K);
            Field<Expression<DivText.Truncate>> field18 = divTextTemplate.f57880j0;
            TypeHelper<DivText.Truncate> typeHelper12 = DivTextJsonParser.f57760z;
            sn.l<String, DivText.Truncate> lVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression21 = DivTextJsonParser.f57749o;
            Expression<DivText.Truncate> expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "truncate", typeHelper12, lVar9, expression21);
            Expression<DivText.Truncate> expression22 = expressionResolveOptionalExpression27 == null ? expression21 : expressionResolveOptionalExpression27;
            Field<Expression<DivLineStyle>> field19 = divTextTemplate.f57882k0;
            TypeHelper<DivLineStyle> typeHelper13 = DivTextJsonParser.A;
            Expression<DivLineStyle> expression23 = DivTextJsonParser.f57750p;
            Expression<DivLineStyle> expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "underline", typeHelper13, lVar8, expression23);
            Expression<DivLineStyle> expression24 = expressionResolveOptionalExpression28 == null ? expression23 : expressionResolveOptionalExpression28;
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57884l0, jSONObject, "variable_triggers", this.f57763a.g9(), this.f57763a.e9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57886m0, jSONObject, "variables", this.f57763a.m9(), this.f57763a.k9());
            Field<Expression<DivVisibility>> field20 = divTextTemplate.f57888n0;
            TypeHelper<DivVisibility> typeHelper14 = DivTextJsonParser.B;
            sn.l<String, DivVisibility> lVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression25 = DivTextJsonParser.f57751q;
            Expression<DivVisibility> expressionResolveOptionalExpression29 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, "visibility", typeHelper14, lVar10, expression25);
            Expression<DivVisibility> expression26 = expressionResolveOptionalExpression29 == null ? expression25 : expressionResolveOptionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57890o0, jSONObject, "visibility_action", this.f57763a.y9(), this.f57763a.w9());
            List listResolveOptionalList20 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f57892p0, jSONObject, "visibility_actions", this.f57763a.y9(), this.f57763a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f57894q0, jSONObject, "width", this.f57763a.a7(), this.f57763a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.f57752r;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, expressionResolveOptionalExpression4, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression6, listResolveOptionalList4, listResolveOptionalList5, ellipsis, listResolveOptionalList6, divFocus, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expression4, expression6, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, divLayoutProvider, expression8, expressionResolveOptionalExpression16, listResolveOptionalList11, divEdgeInsets, expressionResolveOptionalExpression17, expressionResolveOptionalExpression18, divEdgeInsets2, listResolveOptionalList12, listResolveOptionalList13, listResolveOptionalList14, expressionResolveOptionalExpression19, expressionResolveOptionalExpression20, expression10, listResolveOptionalList15, expression12, expressionResolveExpression, expression14, expression16, expression18, divTextGradient, divShadow, expression20, listResolveOptionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList17, expression22, expression24, listResolveOptionalList18, listResolveOptionalList19, expression26, divVisibilityAction, listResolveOptionalList20, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f57736b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f57737c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f57738d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57739e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f57740f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f57741g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f57742h = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f57743i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        f57744j = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f57745k = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        f57746l = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f57747m = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f57748n = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivText.Truncate truncate = DivText.Truncate.END;
        f57749o = Expression.Companion.constant$default(companion, truncate, null, 2, null);
        f57750p = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f57751q = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f57752r = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57753s = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57754t = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57755u = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f57756v = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57757w = companion2.from(divLineStyle, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_STRIKE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f57758x = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57759y = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57760z = companion2.from(truncate, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TRUNCATE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Truncate);
            }
        });
        A = companion2.from(divLineStyle, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        B = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        C = new ValueValidator() { // from class: ah.sa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.j(((Double) obj).doubleValue());
            }
        };
        D = new ValueValidator() { // from class: ah.ta
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.k(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: ah.ua
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.l(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: ah.va
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.m(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: ah.wa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.n(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: ah.xa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.o(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: ah.ya
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.p(((Long) obj).longValue());
            }
        };
        J = new ValueValidator() { // from class: ah.za
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.q(((Long) obj).longValue());
            }
        };
        K = new ListValidator() { // from class: ah.ab
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTextJsonParser.r(list);
            }
        };
    }

    public static final boolean j(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    public static final boolean m(long j10) {
        return j10 > 0;
    }

    public static final boolean n(long j10) {
        return j10 >= 0;
    }

    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    public static final boolean p(long j10) {
        return j10 >= 0;
    }

    public static final boolean q(long j10) {
        return j10 >= 0;
    }

    public static final boolean r(List list) {
        return list.size() >= 1;
    }
}
