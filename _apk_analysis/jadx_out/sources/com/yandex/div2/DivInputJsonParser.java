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
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivInputJsonParser {

    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> A;

    @Deprecated
    @NotNull
    public static final ValueValidator<Double> B;

    @Deprecated
    @NotNull
    public static final ValueValidator<Long> C;

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
    public static final ListValidator<DivTransitionTrigger> J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56024a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivInput.Autocapitalization> f56026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivInput.EnterKeyType> f56027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f56029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f56030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f56031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivInput.KeyboardType> f56033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f56036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f56037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f56038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f56039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f56040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f56041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f56042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivInput.Autocapitalization> f56043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivInput.EnterKeyType> f56044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f56045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f56046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivInput.KeyboardType> f56047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f56048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f56049z;

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56050a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56050a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInput deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f56050a.H());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f56041r;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f56042s;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivInputJsonParser.B;
            Expression<Double> expression = DivInputJsonParser.f56025b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f56050a.t1());
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = DivInputJsonParser.f56043t;
            sn.l<String, DivInput.Autocapitalization> lVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression2 = DivInputJsonParser.f56026c;
            Expression<DivInput.Autocapitalization> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", typeHelper4, lVar4, expression2);
            Expression<DivInput.Autocapitalization> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f56050a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f56050a.L1());
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivInputJsonParser.C);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f56050a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", this.f56050a.u0());
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = DivInputJsonParser.f56044u;
            sn.l<String, DivInput.EnterKeyType> lVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression4 = DivInputJsonParser.f56027d;
            Expression<DivInput.EnterKeyType> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", typeHelper6, lVar6, expression4);
            Expression<DivInput.EnterKeyType> expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f56050a.b3());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f56050a.m4());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f56050a.z3());
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            ValueValidator<Long> valueValidator2 = DivInputJsonParser.D;
            Expression<Long> expression6 = DivInputJsonParser.f56028e;
            Expression<Long> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression6);
            if (optionalExpression8 != null) {
                expression6 = optionalExpression8;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = DivInputJsonParser.f56045v;
            sn.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression7 = DivInputJsonParser.f56029f;
            Expression<DivSizeUnit> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, lVar7, expression7);
            Expression<DivSizeUnit> expression8 = optionalExpression9 == null ? expression7 : optionalExpression9;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f56046w, DivFontWeight.FROM_STRING);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, lVar5, DivInputJsonParser.E);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f56050a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f56050a.Y6());
            if (divSize == null) {
                divSize = DivInputJsonParser.f56030g;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper9, lVar8);
            Expression<Integer> expression9 = DivInputJsonParser.f56031h;
            Expression<Integer> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper9, lVar8, expression9);
            if (optionalExpression14 != null) {
                expression9 = optionalExpression14;
            }
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = DivInputJsonParser.f56032i;
            Expression<Boolean> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper10, lVar9, expression10);
            if (optionalExpression16 != null) {
                expression10 = optionalExpression16;
            }
            TypeHelper<DivInput.KeyboardType> typeHelper11 = DivInputJsonParser.f56047x;
            sn.l<String, DivInput.KeyboardType> lVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression11 = DivInputJsonParser.f56033j;
            Expression<DivInput.KeyboardType> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", typeHelper11, lVar10, expression11);
            if (optionalExpression17 != null) {
                expression11 = optionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f56050a.P4());
            Expression<Double> expression12 = DivInputJsonParser.f56034k;
            Expression<Double> optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression12);
            if (optionalExpression18 != null) {
                expression12 = optionalExpression18;
            }
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, lVar5, DivInputJsonParser.F);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f56050a.Y2());
            DivInputMask divInputMask = (DivInputMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f56050a.v4());
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper5, lVar5, DivInputJsonParser.G);
            Expression optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper5, lVar5, DivInputJsonParser.H);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonPropertyParser.readOptional(parsingContext, jSONObject, "native_interface", this.f56050a.y4());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f56050a.Y2());
            Expression optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivInputJsonParser.I);
            Expression<Boolean> expression13 = DivInputJsonParser.f56035l;
            Expression<Boolean> optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper10, lVar9, expression13);
            Expression<Boolean> expression14 = optionalExpression24 == null ? expression13 : optionalExpression24;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f56050a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = DivInputJsonParser.f56048y;
            Expression<DivAlignmentHorizontal> expression15 = DivInputJsonParser.f56036m;
            Expression<DivAlignmentHorizontal> optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper12, lVar, expression15);
            Expression<DivAlignmentHorizontal> expression16 = optionalExpression25 == null ? expression15 : optionalExpression25;
            TypeHelper<DivAlignmentVertical> typeHelper13 = DivInputJsonParser.f56049z;
            Expression<DivAlignmentVertical> expression17 = DivInputJsonParser.f56037n;
            Expression<DivAlignmentVertical> optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper13, lVar2, expression17);
            Expression<DivAlignmentVertical> expression18 = optionalExpression26 == null ? expression17 : optionalExpression26;
            Expression<Integer> expression19 = DivInputJsonParser.f56038o;
            Expression<Integer> optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper9, lVar8, expression19);
            Expression<Integer> expression20 = optionalExpression27 == null ? expression19 : optionalExpression27;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "text_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f56050a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f56050a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f56050a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f56050a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f56050a.z1());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.J);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", this.f56050a.G4());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f56050a.e9());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f56050a.k9());
            TypeHelper<DivVisibility> typeHelper14 = DivInputJsonParser.A;
            sn.l<String, DivVisibility> lVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression21 = DivInputJsonParser.f56039p;
            Expression<DivVisibility> optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, lVar11, expression21);
            Expression<DivVisibility> expression22 = optionalExpression28 == null ? expression21 : optionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f56050a.w9());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f56050a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f56050a.Y6());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.f56040q;
            }
            return new DivInput(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, expression3, optionalList2, divBorder, optionalExpression5, optionalList3, optionalList4, expression5, optionalList5, optionalList6, divFocus, optionalExpression7, expression6, expression8, optionalExpression10, optionalExpression11, optionalExpression12, optionalList7, divSize2, optionalExpression13, expression9, optionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, optionalExpression19, divEdgeInsets, divInputMask, optionalExpression20, optionalExpression21, nativeInterface, divEdgeInsets2, optionalExpression22, optionalExpression23, expression14, optionalList8, expression16, expression18, expression20, str2, optionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList10, optionalList11, optionalList12, optionalList13, expression22, divVisibilityAction, optionalList14, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInput divInput) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divInput.o(), this.f56050a.H());
            Expression<DivAlignmentHorizontal> expressionG = divInput.g();
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionM = divInput.m();
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divInput.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divInput.w(), this.f56050a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autocapitalization", divInput.f55970f, DivInput.Autocapitalization.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divInput.getBackground(), this.f56050a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divInput.x(), this.f56050a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divInput.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divInput.k(), this.f56050a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "enter_key_actions", divInput.f55978k, this.f56050a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "enter_key_type", divInput.f55979l, DivInput.EnterKeyType.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divInput.getExtensions(), this.f56050a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divInput.f55981n, this.f56050a.m4());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divInput.n(), this.f56050a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divInput.f55983p);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divInput.f55984q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divInput.f55985r, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divInput.f55986s);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divInput.f55987t, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divInput.f55988u);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divInput.u(), this.f56050a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divInput.getHeight(), this.f56050a.Y6());
            Expression<Integer> expression = divInput.f55991x;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "highlight_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", divInput.f55992y, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divInput.f55993z);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divInput.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divInput.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "keyboard_type", divInput.C, DivInput.KeyboardType.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divInput.r(), this.f56050a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divInput.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divInput.F);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divInput.d(), this.f56050a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", divInput.H, this.f56050a.v4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_length", divInput.I);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_lines", divInput.J);
            JsonPropertyParser.write(parsingContext, jSONObject, "native_interface", divInput.K, this.f56050a.y4());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divInput.p(), this.f56050a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divInput.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divInput.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "select_all_on_focus", divInput.O);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divInput.q(), this.f56050a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divInput.Q, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divInput.R, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divInput.S, lVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_variable", divInput.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divInput.h(), this.f56050a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divInput.getTransform(), this.f56050a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divInput.j(), this.f56050a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divInput.v(), this.f56050a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divInput.i(), this.f56050a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divInput.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "validators", divInput.f55961a0, this.f56050a.G4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divInput.s(), this.f56050a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divInput.c(), this.f56050a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divInput.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divInput.t(), this.f56050a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divInput.a(), this.f56050a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divInput.getWidth(), this.f56050a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56051a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56051a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivInputTemplate divInputTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56082a : null, this.f56051a.I());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f56041r;
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate != null ? divInputTemplate.f56084b : null;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f56042s;
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate != null ? divInputTemplate.f56086c : null;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = divInputTemplate != null ? divInputTemplate.f56088d : null;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, lVar3, DivInputJsonParser.B);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56090e : null, this.f56051a.u1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autocapitalization", DivInputJsonParser.f56043t, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56092f : null, DivInput.Autocapitalization.FROM_STRING);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56094g : null, this.f56051a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56096h : null, this.f56051a.M1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divInputTemplate != null ? divInputTemplate.f56097i : null;
            sn.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivInputJsonParser.C);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56098j : null, this.f56051a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56099k : null, this.f56051a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_type", DivInputJsonParser.f56044u, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56100l : null, DivInput.EnterKeyType.FROM_STRING);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56101m : null, this.f56051a.c3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56102n : null, this.f56051a.n4());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56103o : null, this.f56051a.A3());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56104p : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56105q : null, lVar4, DivInputJsonParser.D);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivInputJsonParser.f56045v, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56106r : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56107s : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f56046w, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56108t : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56109u : null, lVar4, DivInputJsonParser.E);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56110v : null, this.f56051a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56111w : null, this.f56051a.Z6());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field5 = divInputTemplate != null ? divInputTemplate.f56112x : null;
            sn.l<Object, Integer> lVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field5, lVar5);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56113y : null, lVar5);
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56114z : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.A : null);
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field6 = divInputTemplate != null ? divInputTemplate.B : null;
            sn.l<Object, Boolean> lVar6 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field6, lVar6);
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "keyboard_type", DivInputJsonParser.f56047x, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.C : null, DivInput.KeyboardType.FROM_STRING);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.D : null, this.f56051a.Q4());
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.E : null, lVar3);
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.F : null, lVar4, DivInputJsonParser.F);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.G : null, this.f56051a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.H : null, this.f56051a.w4());
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.I : null, lVar4, DivInputJsonParser.G);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.J : null, lVar4, DivInputJsonParser.H);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.K : null, this.f56051a.z4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.L : null, this.f56051a.Z2());
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.M : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.N : null, lVar4, DivInputJsonParser.I);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.O : null, lVar6);
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.P : null, this.f56051a.v0());
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivInputJsonParser.f56048y, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.Q : null, lVar);
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", DivInputJsonParser.f56049z, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.R : null, lVar2);
            Field optionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.S : null, lVar5);
            Field field7 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.T : null);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.U : null, this.f56051a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.V : null, this.f56051a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.W : null, this.f56051a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.X : null, this.f56051a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.Y : null, this.f56051a.A1());
            Field<List<DivTransitionTrigger>> field8 = divInputTemplate != null ? divInputTemplate.Z : null;
            sn.l<String, DivTransitionTrigger> lVar7 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivInputJsonParser.J;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivInputTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalFieldWithExpression4, optionalListField2, optionalField2, optionalFieldWithExpression5, optionalListField3, optionalListField4, optionalFieldWithExpression6, optionalListField5, optionalListField6, optionalField3, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalField4, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalField5, optionalFieldWithExpression16, optionalFieldWithExpression17, optionalField6, optionalFieldWithExpression18, optionalFieldWithExpression19, optionalField7, optionalField8, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalField9, optionalField10, optionalFieldWithExpression22, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalListField8, optionalFieldWithExpression25, optionalFieldWithExpression26, optionalFieldWithExpression27, field7, optionalListField9, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, lVar7, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56083a0 : null, this.f56051a.H4()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56085b0 : null, this.f56051a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56087c0 : null, this.f56051a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivInputJsonParser.A, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56089d0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56091e0 : null, this.f56051a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56093f0 : null, this.f56051a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f56095g0 : null, this.f56051a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputTemplate divInputTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divInputTemplate.f56082a, this.f56051a.I());
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate.f56084b;
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate.f56086c;
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divInputTemplate.f56088d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divInputTemplate.f56090e, this.f56051a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autocapitalization", divInputTemplate.f56092f, DivInput.Autocapitalization.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divInputTemplate.f56094g, this.f56051a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divInputTemplate.f56096h, this.f56051a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divInputTemplate.f56097i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divInputTemplate.f56098j, this.f56051a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "enter_key_actions", divInputTemplate.f56099k, this.f56051a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "enter_key_type", divInputTemplate.f56100l, DivInput.EnterKeyType.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divInputTemplate.f56101m, this.f56051a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divInputTemplate.f56102n, this.f56051a.n4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divInputTemplate.f56103o, this.f56051a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divInputTemplate.f56104p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divInputTemplate.f56105q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divInputTemplate.f56106r, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divInputTemplate.f56107s);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divInputTemplate.f56108t, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divInputTemplate.f56109u);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divInputTemplate.f56110v, this.f56051a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divInputTemplate.f56111w, this.f56051a.Z6());
            Field<Expression<Integer>> field3 = divInputTemplate.f56112x;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "highlight_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", divInputTemplate.f56113y, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divInputTemplate.f56114z);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divInputTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divInputTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "keyboard_type", divInputTemplate.C, DivInput.KeyboardType.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divInputTemplate.D, this.f56051a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divInputTemplate.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divInputTemplate.F);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divInputTemplate.G, this.f56051a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", divInputTemplate.H, this.f56051a.w4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_length", divInputTemplate.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_lines", divInputTemplate.J);
            JsonFieldParser.writeField(parsingContext, jSONObject, "native_interface", divInputTemplate.K, this.f56051a.z4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divInputTemplate.L, this.f56051a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divInputTemplate.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divInputTemplate.N);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "select_all_on_focus", divInputTemplate.O);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divInputTemplate.P, this.f56051a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divInputTemplate.Q, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divInputTemplate.R, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divInputTemplate.S, lVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_variable", divInputTemplate.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divInputTemplate.U, this.f56051a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divInputTemplate.V, this.f56051a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divInputTemplate.W, this.f56051a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divInputTemplate.X, this.f56051a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divInputTemplate.Y, this.f56051a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divInputTemplate.Z, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "validators", divInputTemplate.f56083a0, this.f56051a.H4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divInputTemplate.f56085b0, this.f56051a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divInputTemplate.f56087c0, this.f56051a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divInputTemplate.f56089d0, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divInputTemplate.f56091e0, this.f56051a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divInputTemplate.f56093f0, this.f56051a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divInputTemplate.f56095g0, this.f56051a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputTemplate, DivInput> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56052a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56052a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInput resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputTemplate divInputTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56082a, jSONObject, "accessibility", this.f56052a.J(), this.f56052a.H());
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate.f56084b;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f56041r;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate.f56086c;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f56042s;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divInputTemplate.f56088d;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivInputJsonParser.B;
            Expression<Double> expression = DivInputJsonParser.f56025b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56090e, jSONObject, "animators", this.f56052a.v1(), this.f56052a.t1());
            Field<Expression<DivInput.Autocapitalization>> field4 = divInputTemplate.f56092f;
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = DivInputJsonParser.f56043t;
            sn.l<String, DivInput.Autocapitalization> lVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression2 = DivInputJsonParser.f56026c;
            Expression<DivInput.Autocapitalization> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "autocapitalization", typeHelper4, lVar4, expression2);
            Expression<DivInput.Autocapitalization> expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56094g, jSONObject, A2.f64965g, this.f56052a.H1(), this.f56052a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56096h, jSONObject, OutlinedTextFieldKt.BorderId, this.f56052a.N1(), this.f56052a.L1());
            Field<Expression<Long>> field5 = divInputTemplate.f56097i;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivInputJsonParser.C);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56098j, jSONObject, "disappear_actions", this.f56052a.R2(), this.f56052a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56099k, jSONObject, "enter_key_actions", this.f56052a.w0(), this.f56052a.u0());
            Field<Expression<DivInput.EnterKeyType>> field6 = divInputTemplate.f56100l;
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = DivInputJsonParser.f56044u;
            sn.l<String, DivInput.EnterKeyType> lVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression4 = DivInputJsonParser.f56027d;
            Expression<DivInput.EnterKeyType> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "enter_key_type", typeHelper6, lVar6, expression4);
            Expression<DivInput.EnterKeyType> expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56101m, jSONObject, "extensions", this.f56052a.d3(), this.f56052a.b3());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56102n, jSONObject, "filters", this.f56052a.o4(), this.f56052a.m4());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56103o, jSONObject, "focus", this.f56052a.B3(), this.f56052a.z3());
            Field<Expression<String>> field7 = divInputTemplate.f56104p;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_family", typeHelper7);
            Field<Expression<Long>> field8 = divInputTemplate.f56105q;
            ValueValidator<Long> valueValidator2 = DivInputJsonParser.D;
            Expression<Long> expression6 = DivInputJsonParser.f56028e;
            Expression<Long> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            Field<Expression<DivSizeUnit>> field9 = divInputTemplate.f56106r;
            TypeHelper<DivSizeUnit> typeHelper8 = DivInputJsonParser.f56045v;
            sn.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression7 = DivInputJsonParser.f56029f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size_unit", typeHelper8, lVar7, expression7);
            Expression<DivSizeUnit> expression8 = expressionResolveOptionalExpression9 == null ? expression7 : expressionResolveOptionalExpression9;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f56107s, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f56108t, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f56046w, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f56109u, jSONObject, "font_weight_value", typeHelper5, lVar5, DivInputJsonParser.E);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56110v, jSONObject, "functions", this.f56052a.K3(), this.f56052a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56111w, jSONObject, "height", this.f56052a.a7(), this.f56052a.Y6());
            if (divSize == null) {
                divSize = DivInputJsonParser.f56030g;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Integer>> field10 = divInputTemplate.f56112x;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "highlight_color", typeHelper9, lVar8);
            Field<Expression<Integer>> field11 = divInputTemplate.f56113y;
            Expression<Integer> expression9 = DivInputJsonParser.f56031h;
            Expression<Integer> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "hint_color", typeHelper9, lVar8, expression9);
            if (expressionResolveOptionalExpression14 != null) {
                expression9 = expressionResolveOptionalExpression14;
            }
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f56114z, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.A, jSONObject, "id");
            Field<Expression<Boolean>> field12 = divInputTemplate.B;
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = DivInputJsonParser.f56032i;
            Expression<Boolean> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "is_enabled", typeHelper10, lVar9, expression10);
            if (expressionResolveOptionalExpression16 != null) {
                expression10 = expressionResolveOptionalExpression16;
            }
            Field<Expression<DivInput.KeyboardType>> field13 = divInputTemplate.C;
            TypeHelper<DivInput.KeyboardType> typeHelper11 = DivInputJsonParser.f56047x;
            sn.l<String, DivInput.KeyboardType> lVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression11 = DivInputJsonParser.f56033j;
            Expression<DivInput.KeyboardType> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "keyboard_type", typeHelper11, lVar10, expression11);
            if (expressionResolveOptionalExpression17 != null) {
                expression11 = expressionResolveOptionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.D, jSONObject, "layout_provider", this.f56052a.R4(), this.f56052a.P4());
            Field<Expression<Double>> field14 = divInputTemplate.E;
            Expression<Double> expression12 = DivInputJsonParser.f56034k;
            Expression<Double> expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "letter_spacing", typeHelper3, lVar3, expression12);
            if (expressionResolveOptionalExpression18 != null) {
                expression12 = expressionResolveOptionalExpression18;
            }
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.F, jSONObject, "line_height", typeHelper5, lVar5, DivInputJsonParser.F);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.G, jSONObject, "margins", this.f56052a.a3(), this.f56052a.Y2());
            DivInputMask divInputMask = (DivInputMask) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.H, jSONObject, "mask", this.f56052a.x4(), this.f56052a.v4());
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.I, jSONObject, "max_length", typeHelper5, lVar5, DivInputJsonParser.G);
            Expression expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.J, jSONObject, "max_visible_lines", typeHelper5, lVar5, DivInputJsonParser.H);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.K, jSONObject, "native_interface", this.f56052a.A4(), this.f56052a.y4());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.L, jSONObject, "paddings", this.f56052a.a3(), this.f56052a.Y2());
            Expression expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.M, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.N, jSONObject, "row_span", typeHelper5, lVar5, DivInputJsonParser.I);
            Field<Expression<Boolean>> field15 = divInputTemplate.O;
            Expression<Boolean> expression13 = DivInputJsonParser.f56035l;
            Expression<Boolean> expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "select_all_on_focus", typeHelper10, lVar9, expression13);
            Expression<Boolean> expression14 = expressionResolveOptionalExpression24 == null ? expression13 : expressionResolveOptionalExpression24;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.P, jSONObject, "selected_actions", this.f56052a.w0(), this.f56052a.u0());
            Field<Expression<DivAlignmentHorizontal>> field16 = divInputTemplate.Q;
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = DivInputJsonParser.f56048y;
            Expression<DivAlignmentHorizontal> expression15 = DivInputJsonParser.f56036m;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_alignment_horizontal", typeHelper12, lVar, expression15);
            Expression<DivAlignmentHorizontal> expression16 = expressionResolveOptionalExpression25 == null ? expression15 : expressionResolveOptionalExpression25;
            Field<Expression<DivAlignmentVertical>> field17 = divInputTemplate.R;
            TypeHelper<DivAlignmentVertical> typeHelper13 = DivInputJsonParser.f56049z;
            Expression<DivAlignmentVertical> expression17 = DivInputJsonParser.f56037n;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_alignment_vertical", typeHelper13, lVar2, expression17);
            Expression<DivAlignmentVertical> expression18 = expressionResolveOptionalExpression26 == null ? expression17 : expressionResolveOptionalExpression26;
            Field<Expression<Integer>> field18 = divInputTemplate.S;
            Expression<Integer> expression19 = DivInputJsonParser.f56038o;
            Expression<Integer> expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "text_color", typeHelper9, lVar8, expression19);
            Expression<Integer> expression20 = expressionResolveOptionalExpression27 == null ? expression19 : expressionResolveOptionalExpression27;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divInputTemplate.T, jSONObject, "text_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.U, jSONObject, "tooltips", this.f56052a.R8(), this.f56052a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.V, jSONObject, "transform", this.f56052a.d9(), this.f56052a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.W, jSONObject, "transition_change", this.f56052a.W1(), this.f56052a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.X, jSONObject, "transition_in", this.f56052a.B1(), this.f56052a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.Y, jSONObject, "transition_out", this.f56052a.B1(), this.f56052a.z1());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.Z, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.J);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56083a0, jSONObject, "validators", this.f56052a.I4(), this.f56052a.G4());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56085b0, jSONObject, "variable_triggers", this.f56052a.g9(), this.f56052a.e9());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56087c0, jSONObject, "variables", this.f56052a.m9(), this.f56052a.k9());
            Field<Expression<DivVisibility>> field19 = divInputTemplate.f56089d0;
            TypeHelper<DivVisibility> typeHelper14 = DivInputJsonParser.A;
            sn.l<String, DivVisibility> lVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression21 = DivInputJsonParser.f56039p;
            Expression<DivVisibility> expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "visibility", typeHelper14, lVar11, expression21);
            Expression<DivVisibility> expression22 = expressionResolveOptionalExpression28 == null ? expression21 : expressionResolveOptionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56091e0, jSONObject, "visibility_action", this.f56052a.y9(), this.f56052a.w9());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f56093f0, jSONObject, "visibility_actions", this.f56052a.y9(), this.f56052a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f56095g0, jSONObject, "width", this.f56052a.a7(), this.f56052a.Y6());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.f56040q;
            }
            return new DivInput(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, expression3, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression5, listResolveOptionalList3, listResolveOptionalList4, expression5, listResolveOptionalList5, listResolveOptionalList6, divFocus, expressionResolveOptionalExpression7, expression6, expression8, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, listResolveOptionalList7, divSize2, expressionResolveOptionalExpression13, expression9, expressionResolveOptionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, expressionResolveOptionalExpression19, divEdgeInsets, divInputMask, expressionResolveOptionalExpression20, expressionResolveOptionalExpression21, nativeInterface, divEdgeInsets2, expressionResolveOptionalExpression22, expressionResolveOptionalExpression23, expression14, listResolveOptionalList8, expression16, expression18, expression20, str2, listResolveOptionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList10, listResolveOptionalList11, listResolveOptionalList12, listResolveOptionalList13, expression22, divVisibilityAction, listResolveOptionalList14, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f56025b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivInput.Autocapitalization autocapitalization = DivInput.Autocapitalization.AUTO;
        f56026c = Expression.Companion.constant$default(companion, autocapitalization, null, 2, null);
        DivInput.EnterKeyType enterKeyType = DivInput.EnterKeyType.DEFAULT;
        f56027d = Expression.Companion.constant$default(companion, enterKeyType, null, 2, null);
        f56028e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f56029f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f56030g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f56031h = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f56032i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivInput.KeyboardType keyboardType = DivInput.KeyboardType.MULTI_LINE_TEXT;
        f56033j = Expression.Companion.constant$default(companion, keyboardType, null, 2, null);
        f56034k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56035l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f56036m = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f56037n = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f56038o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f56039p = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f56040q = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56041r = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f56042s = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f56043t = companion2.from(autocapitalization, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_AUTOCAPITALIZATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.Autocapitalization);
            }
        });
        f56044u = companion2.from(enterKeyType, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ENTER_KEY_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.EnterKeyType);
            }
        });
        f56045v = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f56046w = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f56047x = companion2.from(keyboardType, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_KEYBOARD_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.KeyboardType);
            }
        });
        f56048y = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f56049z = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        A = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        B = new ValueValidator() { // from class: ah.w5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.j(((Double) obj).doubleValue());
            }
        };
        C = new ValueValidator() { // from class: ah.x5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.k(((Long) obj).longValue());
            }
        };
        D = new ValueValidator() { // from class: ah.y5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.l(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: ah.z5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.m(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: ah.a6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.n(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: ah.b6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.o(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: ah.c6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.p(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: ah.d6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.q(((Long) obj).longValue());
            }
        };
        J = new ListValidator() { // from class: ah.e6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivInputJsonParser.r(list);
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
        return j10 > 0;
    }

    public static final boolean p(long j10) {
        return j10 > 0;
    }

    public static final boolean q(long j10) {
        return j10 >= 0;
    }

    public static final boolean r(List list) {
        return list.size() >= 1;
    }
}
