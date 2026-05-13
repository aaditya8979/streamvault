package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
import com.yandex.div2.DivSliderTextStyleJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivSliderTextStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57137a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f57139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f57142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57145i;

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
        public final JsonParserComponent f57146a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57146a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider.TextStyle deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSliderTextStyleJsonParser.f57144h;
            Expression<Long> expression = DivSliderTextStyleJsonParser.f57138b;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            TypeHelper<DivSizeUnit> typeHelper2 = DivSliderTextStyleJsonParser.f57142f;
            sn.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivSliderTextStyleJsonParser.f57139c;
            Expression<DivSizeUnit> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper2, lVar2, expression2);
            if (optionalExpression3 != null) {
                expression2 = optionalExpression3;
            }
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f57143g, DivFontWeight.FROM_STRING);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper, lVar, DivSliderTextStyleJsonParser.f57145i);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression3 = DivSliderTextStyleJsonParser.f57140d;
            Expression<Double> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression3);
            if (optionalExpression7 != null) {
                expression3 = optionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f57146a.Z5());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression4 = DivSliderTextStyleJsonParser.f57141e;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper4, lVar4, expression4);
            if (optionalExpression8 != null) {
                expression4 = optionalExpression8;
            }
            return new DivSlider.TextStyle(optionalExpression, expression, expression2, optionalExpression4, optionalExpression5, optionalExpression6, expression3, divPoint, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSlider.TextStyle textStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", textStyle.f57057a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", textStyle.f57058b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", textStyle.f57059c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, textStyle.f57060d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, textStyle.f57061e, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", textStyle.f57062f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", textStyle.f57063g);
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, textStyle.f57064h, this.f57146a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", textStyle.f57065i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57147a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57147a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSliderTemplate.TextStyleTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSliderTemplate.TextStyleTemplate textStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<DivPointTemplate> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57128a : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = textStyleTemplate != null ? textStyleTemplate.f57129b : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper, allowPropertyOverride, field2, lVar, DivSliderTextStyleJsonParser.f57144h);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivSliderTextStyleJsonParser.f57142f, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57130c : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57131d : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f57143g, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57132e : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57133f : null, lVar, DivSliderTextStyleJsonParser.f57145i);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57134g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            if (textStyleTemplate != null) {
                cVar = this;
                field = textStyleTemplate.f57135h;
            } else {
                cVar = this;
                field = null;
            }
            return new DivSliderTemplate.TextStyleTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, field, cVar.f57147a.a6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f57136i : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate.TextStyleTemplate textStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", textStyleTemplate.f57128a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", textStyleTemplate.f57129b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", textStyleTemplate.f57130c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, textStyleTemplate.f57131d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, textStyleTemplate.f57132e, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", textStyleTemplate.f57133f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", textStyleTemplate.f57134g);
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, textStyleTemplate.f57135h, this.f57147a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", textStyleTemplate.f57136i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSliderTemplate.TextStyleTemplate, DivSlider.TextStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57148a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57148a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider.TextStyle resolve(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate.TextStyleTemplate textStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f57128a, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field = textStyleTemplate.f57129b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSliderTextStyleJsonParser.f57144h;
            Expression<Long> expression = DivSliderTextStyleJsonParser.f57138b;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "font_size", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivSizeUnit>> field2 = textStyleTemplate.f57130c;
            TypeHelper<DivSizeUnit> typeHelper2 = DivSliderTextStyleJsonParser.f57142f;
            sn.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivSliderTextStyleJsonParser.f57139c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "font_size_unit", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression3 != null) {
                expression2 = expressionResolveOptionalExpression3;
            }
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f57131d, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f57132e, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f57143g, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f57133f, jSONObject, "font_weight_value", typeHelper, lVar, DivSliderTextStyleJsonParser.f57145i);
            Field<Expression<Double>> field3 = textStyleTemplate.f57134g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression3 = DivSliderTextStyleJsonParser.f57140d;
            Expression<Double> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "letter_spacing", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression7 != null) {
                expression3 = expressionResolveOptionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, textStyleTemplate.f57135h, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f57148a.b6(), this.f57148a.Z5());
            Field<Expression<Integer>> field4 = textStyleTemplate.f57136i;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression4 = DivSliderTextStyleJsonParser.f57141e;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "text_color", typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression8 != null) {
                expression4 = expressionResolveOptionalExpression8;
            }
            return new DivSlider.TextStyle(expressionResolveOptionalExpression, expression, expression2, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, expression3, divPoint, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57138b = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f57139c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f57140d = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f57141e = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57142f = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f57143g = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57144h = new ValueValidator() { // from class: ah.k9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderTextStyleJsonParser.c(((Long) obj).longValue());
            }
        };
        f57145i = new ValueValidator() { // from class: ah.l9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderTextStyleJsonParser.d(((Long) obj).longValue());
            }
        };
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
