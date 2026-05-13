package com.yandex.div2;

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
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPageTransformationSlideJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56350a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f56356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56360k;

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56361a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56361a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlide deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationSlideJsonParser.f56356g;
            sn.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationSlideJsonParser.f56351b;
            Expression<DivAnimationInterpolator> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, lVar, expression);
            Expression<DivAnimationInterpolator> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationSlideJsonParser.f56357h;
            Expression<Double> expression3 = DivPageTransformationSlideJsonParser.f56352c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            ValueValidator<Double> valueValidator2 = DivPageTransformationSlideJsonParser.f56358i;
            Expression<Double> expression4 = DivPageTransformationSlideJsonParser.f56353d;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            ValueValidator<Double> valueValidator3 = DivPageTransformationSlideJsonParser.f56359j;
            Expression<Double> expression5 = DivPageTransformationSlideJsonParser.f56354e;
            Expression<Double> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            ValueValidator<Double> valueValidator4 = DivPageTransformationSlideJsonParser.f56360k;
            Expression<Double> expression6 = DivPageTransformationSlideJsonParser.f56355f;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression6);
            if (optionalExpression5 != null) {
                expression6 = optionalExpression5;
            }
            return new DivPageTransformationSlide(expression2, expression3, expression4, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationSlide divPageTransformationSlide) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationSlide.f56344a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlide.f56345b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlide.f56346c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlide.f56347d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlide.f56348e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56362a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56362a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlideTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationSlideJsonParser.f56356g, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f56371a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f56372b : null;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationSlideTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, lVar, DivPageTransformationSlideJsonParser.f56357h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f56373c : null, lVar, DivPageTransformationSlideJsonParser.f56358i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f56374d : null, lVar, DivPageTransformationSlideJsonParser.f56359j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f56375e : null, lVar, DivPageTransformationSlideJsonParser.f56360k));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationSlideTemplate.f56371a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlideTemplate.f56372b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlideTemplate.f56373c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlideTemplate.f56374d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlideTemplate.f56375e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPageTransformationSlideTemplate, DivPageTransformationSlide> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56363a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56363a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlide resolve(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = divPageTransformationSlideTemplate.f56371a;
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationSlideJsonParser.f56356g;
            sn.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationSlideJsonParser.f56351b;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divPageTransformationSlideTemplate.f56372b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationSlideJsonParser.f56357h;
            Expression<Double> expression2 = DivPageTransformationSlideJsonParser.f56352c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Double>> field3 = divPageTransformationSlideTemplate.f56373c;
            ValueValidator<Double> valueValidator2 = DivPageTransformationSlideJsonParser.f56358i;
            Expression<Double> expression3 = DivPageTransformationSlideJsonParser.f56353d;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Double>> field4 = divPageTransformationSlideTemplate.f56374d;
            ValueValidator<Double> valueValidator3 = DivPageTransformationSlideJsonParser.f56359j;
            Expression<Double> expression4 = DivPageTransformationSlideJsonParser.f56354e;
            Expression<Double> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Double>> field5 = divPageTransformationSlideTemplate.f56375e;
            ValueValidator<Double> valueValidator4 = DivPageTransformationSlideJsonParser.f56360k;
            Expression<Double> expression5 = DivPageTransformationSlideJsonParser.f56355f;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression5);
            return new DivPageTransformationSlide(expression, expression2, expression3, expression4, expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f56351b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56352c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56353d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56354e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56355f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56356g = TypeHelper.Companion.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f56357h = new ValueValidator() { // from class: ah.g7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f56358i = new ValueValidator() { // from class: ah.h7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f56359j = new ValueValidator() { // from class: ah.i7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f56360k = new ValueValidator() { // from class: ah.j7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.h(((Double) obj).doubleValue());
            }
        };
    }

    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean f(double d10) {
        return d10 >= 0.0d;
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean h(double d10) {
        return d10 >= 0.0d;
    }
}
