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
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectJsonParser;
import com.yandex.div2.DivSelectTemplate;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSelectJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivSelectJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56757a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f56760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f56761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f56762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f56764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f56765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f56766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f56767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f56768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f56769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f56770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f56771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivSelect.Option> f56777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f56779w;

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56780a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56780a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelect deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f56780a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSelectJsonParser.f56767k, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSelectJsonParser.f56768l, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSelectJsonParser.f56772p;
            Expression<Double> expression = DivSelectJsonParser.f56758b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f56780a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f56780a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f56780a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSelectJsonParser.f56773q);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f56780a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f56780a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f56780a.z3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            ValueValidator<Long> valueValidator2 = DivSelectJsonParser.f56774r;
            Expression<Long> expression2 = DivSelectJsonParser.f56759c;
            Expression<Double> expression3 = expression;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression6 != null) {
                expression2 = optionalExpression6;
            }
            TypeHelper<DivSizeUnit> typeHelper4 = DivSelectJsonParser.f56769m;
            sn.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = DivSelectJsonParser.f56760d;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, lVar3, expression4);
            Expression<DivSizeUnit> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f56770n, DivFontWeight.FROM_STRING);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, lVar2, DivSelectJsonParser.f56775s);
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f56780a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f56780a.Y6());
            if (divSize == null) {
                divSize = DivSelectJsonParser.f56761e;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivSelectJsonParser.f56762f;
            Expression<Integer> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper5, lVar4, expression6);
            if (optionalExpression11 != null) {
                expression6 = optionalExpression11;
            }
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f56780a.P4());
            Expression<Double> expression7 = DivSelectJsonParser.f56763g;
            Expression<Double> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, lVar, expression7);
            if (optionalExpression13 != null) {
                expression7 = optionalExpression13;
            }
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, lVar2, DivSelectJsonParser.f56776t);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f56780a.Y2());
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "options", this.f56780a.G6(), DivSelectJsonParser.f56777u);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f56780a.Y2());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSelectJsonParser.f56778v);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f56780a.u0());
            Expression<Integer> expression8 = DivSelectJsonParser.f56764h;
            Expression<Integer> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper5, lVar4, expression8);
            Expression<Integer> expression9 = optionalExpression17 == null ? expression8 : optionalExpression17;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f56780a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f56780a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f56780a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f56780a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f56780a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.f56779w);
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "value_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f56780a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f56780a.k9());
            TypeHelper<DivVisibility> typeHelper6 = DivSelectJsonParser.f56771o;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivSelectJsonParser.f56765i;
            Expression<DivVisibility> optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, lVar5, expression10);
            Expression<DivVisibility> expression11 = optionalExpression18 == null ? expression10 : optionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f56780a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f56780a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f56780a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.f56766j;
            }
            return new DivSelect(divAccessibility, optionalExpression, optionalExpression2, expression3, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalExpression5, expression2, expression5, optionalExpression8, optionalExpression9, optionalExpression10, optionalList5, divSize2, expression6, optionalExpression12, str, divLayoutProvider, expression7, optionalExpression14, divEdgeInsets, list, divEdgeInsets2, optionalExpression15, optionalExpression16, optionalList6, expression9, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, str2, optionalList9, optionalList10, expression11, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSelect divSelect) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSelect.o(), this.f56780a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSelect.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSelect.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSelect.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSelect.w(), this.f56780a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divSelect.getBackground(), this.f56780a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSelect.x(), this.f56780a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSelect.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSelect.k(), this.f56780a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSelect.getExtensions(), this.f56780a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSelect.n(), this.f56780a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divSelect.f56737l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divSelect.f56738m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divSelect.f56739n, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divSelect.f56740o);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divSelect.f56741p, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divSelect.f56742q);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSelect.u(), this.f56780a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSelect.getHeight(), this.f56780a.Y6());
            Expression<Integer> expression = divSelect.f56745t;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divSelect.f56746u);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSelect.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSelect.r(), this.f56780a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divSelect.f56749x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divSelect.f56750y);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSelect.d(), this.f56780a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "options", divSelect.A, this.f56780a.G6());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSelect.p(), this.f56780a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSelect.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSelect.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSelect.q(), this.f56780a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divSelect.F, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSelect.h(), this.f56780a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSelect.getTransform(), this.f56780a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSelect.j(), this.f56780a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSelect.v(), this.f56780a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSelect.i(), this.f56780a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSelect.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divSelect.M);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSelect.s(), this.f56780a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSelect.c(), this.f56780a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSelect.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSelect.t(), this.f56780a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSelect.a(), this.f56780a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSelect.getWidth(), this.f56780a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56781a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56781a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelectTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSelectTemplate divSelectTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56787a : null, this.f56781a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSelectJsonParser.f56767k, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56788b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSelectJsonParser.f56768l, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56789c : null, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divSelectTemplate != null ? divSelectTemplate.f56790d : null;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field, lVar, DivSelectJsonParser.f56772p);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56791e : null, this.f56781a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56792f : null, this.f56781a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56793g : null, this.f56781a.M1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divSelectTemplate != null ? divSelectTemplate.f56794h : null;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivSelectJsonParser.f56773q);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56795i : null, this.f56781a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56796j : null, this.f56781a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56797k : null, this.f56781a.A3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56798l : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56799m : null, lVar2, DivSelectJsonParser.f56774r);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivSelectJsonParser.f56769m, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56800n : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56801o : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f56770n, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56802p : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56803q : null, lVar2, DivSelectJsonParser.f56775s);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56804r : null, this.f56781a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56805s : null, this.f56781a.Z6());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field3 = divSelectTemplate != null ? divSelectTemplate.f56806t : null;
            sn.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field3, lVar3);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56807u : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56808v : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56809w : null, this.f56781a.Q4());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56810x : null, lVar);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56811y : null, lVar2, DivSelectJsonParser.f56776t);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f56812z : null, this.f56781a.Z2());
            Field<List<DivSelectTemplate.OptionTemplate>> field4 = divSelectTemplate != null ? divSelectTemplate.A : null;
            bn.g<k3> gVarH6 = this.f56781a.H6();
            ListValidator<DivSelect.Option> listValidator = DivSelectJsonParser.f56777u;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "options", allowPropertyOverride, field4, gVarH6, listValidator);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.B : null, this.f56781a.Z2());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.C : null);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.D : null, lVar2, DivSelectJsonParser.f56778v);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.E : null, this.f56781a.v0());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.F : null, lVar3);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.G : null, this.f56781a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.H : null, this.f56781a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.I : null, this.f56781a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.J : null, this.f56781a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.K : null, this.f56781a.A1());
            Field<List<DivTransitionTrigger>> field5 = divSelectTemplate != null ? divSelectTemplate.L : null;
            sn.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivSelectJsonParser.f56779w;
            tn.p.i(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSelectTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField5, optionalField4, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField5, optionalField6, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalField7, listField, optionalField8, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField6, optionalFieldWithExpression17, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar4, listValidator2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.M : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.N : null, this.f56781a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.O : null, this.f56781a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSelectJsonParser.f56771o, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.P : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.Q : null, this.f56781a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.R : null, this.f56781a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.S : null, this.f56781a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSelectTemplate divSelectTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSelectTemplate.f56787a, this.f56781a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSelectTemplate.f56788b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSelectTemplate.f56789c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSelectTemplate.f56790d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSelectTemplate.f56791e, this.f56781a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divSelectTemplate.f56792f, this.f56781a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divSelectTemplate.f56793g, this.f56781a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSelectTemplate.f56794h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSelectTemplate.f56795i, this.f56781a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSelectTemplate.f56796j, this.f56781a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSelectTemplate.f56797k, this.f56781a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divSelectTemplate.f56798l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divSelectTemplate.f56799m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divSelectTemplate.f56800n, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divSelectTemplate.f56801o);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divSelectTemplate.f56802p, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divSelectTemplate.f56803q);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSelectTemplate.f56804r, this.f56781a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSelectTemplate.f56805s, this.f56781a.Z6());
            Field<Expression<Integer>> field = divSelectTemplate.f56806t;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divSelectTemplate.f56807u);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSelectTemplate.f56808v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSelectTemplate.f56809w, this.f56781a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divSelectTemplate.f56810x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divSelectTemplate.f56811y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSelectTemplate.f56812z, this.f56781a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "options", divSelectTemplate.A, this.f56781a.H6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSelectTemplate.B, this.f56781a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSelectTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSelectTemplate.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSelectTemplate.E, this.f56781a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divSelectTemplate.F, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSelectTemplate.G, this.f56781a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSelectTemplate.H, this.f56781a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSelectTemplate.I, this.f56781a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSelectTemplate.J, this.f56781a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSelectTemplate.K, this.f56781a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSelectTemplate.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divSelectTemplate.M);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSelectTemplate.N, this.f56781a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSelectTemplate.O, this.f56781a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSelectTemplate.P, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSelectTemplate.Q, this.f56781a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSelectTemplate.R, this.f56781a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSelectTemplate.S, this.f56781a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSelectTemplate, DivSelect> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56782a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56782a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelect resolve(@NotNull ParsingContext parsingContext, @NotNull DivSelectTemplate divSelectTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56787a, jSONObject, "accessibility", this.f56782a.J(), this.f56782a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56788b, jSONObject, "alignment_horizontal", DivSelectJsonParser.f56767k, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56789c, jSONObject, "alignment_vertical", DivSelectJsonParser.f56768l, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSelectTemplate.f56790d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSelectJsonParser.f56772p;
            Expression<Double> expression = DivSelectJsonParser.f56758b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f56791e, jSONObject, "animators", this.f56782a.v1(), this.f56782a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f56792f, jSONObject, A2.f64965g, this.f56782a.H1(), this.f56782a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56793g, jSONObject, OutlinedTextFieldKt.BorderId, this.f56782a.N1(), this.f56782a.L1());
            Field<Expression<Long>> field2 = divSelectTemplate.f56794h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSelectJsonParser.f56773q);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f56795i, jSONObject, "disappear_actions", this.f56782a.R2(), this.f56782a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f56796j, jSONObject, "extensions", this.f56782a.d3(), this.f56782a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56797k, jSONObject, "focus", this.f56782a.B3(), this.f56782a.z3());
            Field<Expression<String>> field3 = divSelectTemplate.f56798l;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Field<Expression<Long>> field4 = divSelectTemplate.f56799m;
            ValueValidator<Long> valueValidator2 = DivSelectJsonParser.f56774r;
            Expression<Long> expression2 = DivSelectJsonParser.f56759c;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression6 != null) {
                expression2 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivSizeUnit>> field5 = divSelectTemplate.f56800n;
            TypeHelper<DivSizeUnit> typeHelper4 = DivSelectJsonParser.f56769m;
            sn.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression3 = DivSelectJsonParser.f56760d;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "font_size_unit", typeHelper4, lVar3, expression3);
            Expression<DivSizeUnit> expression4 = expressionResolveOptionalExpression7 == null ? expression3 : expressionResolveOptionalExpression7;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56801o, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56802p, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f56770n, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56803q, jSONObject, "font_weight_value", typeHelper2, lVar2, DivSelectJsonParser.f56775s);
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f56804r, jSONObject, "functions", this.f56782a.K3(), this.f56782a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56805s, jSONObject, "height", this.f56782a.a7(), this.f56782a.Y6());
            if (divSize == null) {
                divSize = DivSelectJsonParser.f56761e;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Integer>> field6 = divSelectTemplate.f56806t;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression5 = DivSelectJsonParser.f56762f;
            Expression<Integer> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "hint_color", typeHelper5, lVar4, expression5);
            if (expressionResolveOptionalExpression11 != null) {
                expression5 = expressionResolveOptionalExpression11;
            }
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56807u, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56808v, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56809w, jSONObject, "layout_provider", this.f56782a.R4(), this.f56782a.P4());
            Field<Expression<Double>> field7 = divSelectTemplate.f56810x;
            Expression<Double> expression6 = DivSelectJsonParser.f56763g;
            Expression<Double> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "letter_spacing", typeHelper, lVar, expression6);
            if (expressionResolveOptionalExpression13 != null) {
                expression6 = expressionResolveOptionalExpression13;
            }
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f56811y, jSONObject, "line_height", typeHelper2, lVar2, DivSelectJsonParser.f56776t);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f56812z, jSONObject, "margins", this.f56782a.a3(), this.f56782a.Y2());
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divSelectTemplate.A, jSONObject, "options", this.f56782a.I6(), this.f56782a.G6(), DivSelectJsonParser.f56777u);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.B, jSONObject, "paddings", this.f56782a.a3(), this.f56782a.Y2());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.C, jSONObject, "reuse_id", typeHelper3);
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.D, jSONObject, "row_span", typeHelper2, lVar2, DivSelectJsonParser.f56778v);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.E, jSONObject, "selected_actions", this.f56782a.w0(), this.f56782a.u0());
            Field<Expression<Integer>> field8 = divSelectTemplate.F;
            Expression<Integer> expression7 = DivSelectJsonParser.f56764h;
            Expression<Integer> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "text_color", typeHelper5, lVar4, expression7);
            Expression<Integer> expression8 = expressionResolveOptionalExpression17 == null ? expression7 : expressionResolveOptionalExpression17;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.G, jSONObject, "tooltips", this.f56782a.R8(), this.f56782a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.H, jSONObject, "transform", this.f56782a.d9(), this.f56782a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.I, jSONObject, "transition_change", this.f56782a.W1(), this.f56782a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.J, jSONObject, "transition_in", this.f56782a.B1(), this.f56782a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.K, jSONObject, "transition_out", this.f56782a.B1(), this.f56782a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.f56779w);
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divSelectTemplate.M, jSONObject, "value_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.N, jSONObject, "variable_triggers", this.f56782a.g9(), this.f56782a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.O, jSONObject, "variables", this.f56782a.m9(), this.f56782a.k9());
            Field<Expression<DivVisibility>> field9 = divSelectTemplate.P;
            TypeHelper<DivVisibility> typeHelper6 = DivSelectJsonParser.f56771o;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression9 = DivSelectJsonParser.f56765i;
            Expression<DivVisibility> expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper6, lVar5, expression9);
            Expression<DivVisibility> expression10 = expressionResolveOptionalExpression18 == null ? expression9 : expressionResolveOptionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.Q, jSONObject, "visibility_action", this.f56782a.y9(), this.f56782a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.R, jSONObject, "visibility_actions", this.f56782a.y9(), this.f56782a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.S, jSONObject, "width", this.f56782a.a7(), this.f56782a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.f56766j;
            }
            return new DivSelect(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, expressionResolveOptionalExpression5, expression2, expression4, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, listResolveOptionalList5, divSize2, expression5, expressionResolveOptionalExpression12, str, divLayoutProvider, expression6, expressionResolveOptionalExpression14, divEdgeInsets, listResolveList, divEdgeInsets2, expressionResolveOptionalExpression15, expressionResolveOptionalExpression16, listResolveOptionalList6, expression8, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, str2, listResolveOptionalList9, listResolveOptionalList10, expression10, divVisibilityAction, listResolveOptionalList11, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56758b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f56759c = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f56760d = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f56761e = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f56762f = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f56763g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f56764h = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f56765i = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f56766j = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56767k = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f56768l = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f56769m = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f56770n = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f56771o = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f56772p = new ValueValidator() { // from class: ah.l8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.i(((Double) obj).doubleValue());
            }
        };
        f56773q = new ValueValidator() { // from class: ah.m8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.j(((Long) obj).longValue());
            }
        };
        f56774r = new ValueValidator() { // from class: ah.n8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.k(((Long) obj).longValue());
            }
        };
        f56775s = new ValueValidator() { // from class: ah.o8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.l(((Long) obj).longValue());
            }
        };
        f56776t = new ValueValidator() { // from class: ah.p8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.m(((Long) obj).longValue());
            }
        };
        f56777u = new ListValidator() { // from class: ah.q8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSelectJsonParser.n(list);
            }
        };
        f56778v = new ValueValidator() { // from class: ah.r8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.o(((Long) obj).longValue());
            }
        };
        f56779w = new ListValidator() { // from class: ah.s8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSelectJsonParser.p(list);
            }
        };
    }

    public static final boolean i(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 > 0;
    }

    public static final boolean m(long j10) {
        return j10 >= 0;
    }

    public static final boolean n(List list) {
        return list.size() >= 1;
    }

    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    public static final boolean p(List list) {
        return list.size() >= 1;
    }
}
