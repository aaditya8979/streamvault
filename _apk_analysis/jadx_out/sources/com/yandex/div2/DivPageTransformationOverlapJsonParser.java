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
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPageTransformationOverlapJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56308a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f56315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56319l;

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56320a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56320a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlap deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationOverlapJsonParser.f56315h;
            sn.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationOverlapJsonParser.f56309b;
            Expression<DivAnimationInterpolator> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, lVar, expression);
            Expression<DivAnimationInterpolator> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationOverlapJsonParser.f56316i;
            Expression<Double> expression3 = DivPageTransformationOverlapJsonParser.f56310c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            ValueValidator<Double> valueValidator2 = DivPageTransformationOverlapJsonParser.f56317j;
            Expression<Double> expression4 = DivPageTransformationOverlapJsonParser.f56311d;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            ValueValidator<Double> valueValidator3 = DivPageTransformationOverlapJsonParser.f56318k;
            Expression<Double> expression5 = DivPageTransformationOverlapJsonParser.f56312e;
            Expression<Double> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            ValueValidator<Double> valueValidator4 = DivPageTransformationOverlapJsonParser.f56319l;
            Expression<Double> expression6 = DivPageTransformationOverlapJsonParser.f56313f;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression6);
            if (optionalExpression5 != null) {
                expression6 = optionalExpression5;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression7 = DivPageTransformationOverlapJsonParser.f56314g;
            Expression<Boolean> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reversed_stacking_order", typeHelper3, lVar3, expression7);
            return new DivPageTransformationOverlap(expression2, expression3, expression4, expression5, expression6, optionalExpression6 == null ? expression7 : optionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationOverlap divPageTransformationOverlap) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationOverlap.f56301a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlap.f56302b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlap.f56303c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlap.f56304d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlap.f56305e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlap.f56306f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56321a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56321a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlapTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationOverlapJsonParser.f56315h, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56331a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56332b : null;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationOverlapTemplate((Field<Expression<DivAnimationInterpolator>>) optionalFieldWithExpression, (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, lVar, DivPageTransformationOverlapJsonParser.f56316i), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56333c : null, lVar, DivPageTransformationOverlapJsonParser.f56317j), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56334d : null, lVar, DivPageTransformationOverlapJsonParser.f56318k), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56335e : null, lVar, DivPageTransformationOverlapJsonParser.f56319l), (Field<Expression<Boolean>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f56336f : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationOverlapTemplate.f56331a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlapTemplate.f56332b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlapTemplate.f56333c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlapTemplate.f56334d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlapTemplate.f56335e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlapTemplate.f56336f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPageTransformationOverlapTemplate, DivPageTransformationOverlap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56322a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56322a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlap resolve(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = divPageTransformationOverlapTemplate.f56331a;
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationOverlapJsonParser.f56315h;
            sn.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationOverlapJsonParser.f56309b;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divPageTransformationOverlapTemplate.f56332b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationOverlapJsonParser.f56316i;
            Expression<Double> expression2 = DivPageTransformationOverlapJsonParser.f56310c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Double>> field3 = divPageTransformationOverlapTemplate.f56333c;
            ValueValidator<Double> valueValidator2 = DivPageTransformationOverlapJsonParser.f56317j;
            Expression<Double> expression3 = DivPageTransformationOverlapJsonParser.f56311d;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Double>> field4 = divPageTransformationOverlapTemplate.f56334d;
            ValueValidator<Double> valueValidator3 = DivPageTransformationOverlapJsonParser.f56318k;
            Expression<Double> expression4 = DivPageTransformationOverlapJsonParser.f56312e;
            Expression<Double> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Double>> field5 = divPageTransformationOverlapTemplate.f56335e;
            ValueValidator<Double> valueValidator4 = DivPageTransformationOverlapJsonParser.f56319l;
            Expression<Double> expression5 = DivPageTransformationOverlapJsonParser.f56313f;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression5);
            if (expressionResolveOptionalExpression5 != null) {
                expression5 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Boolean>> field6 = divPageTransformationOverlapTemplate.f56336f;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = DivPageTransformationOverlapJsonParser.f56314g;
            Expression<Boolean> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "reversed_stacking_order", typeHelper3, lVar3, expression6);
            return new DivPageTransformationOverlap(expression, expression2, expression3, expression4, expression5, expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f56309b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f56310c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56311d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56312e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56313f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f56314g = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f56315h = TypeHelper.Companion.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f56316i = new ValueValidator() { // from class: ah.c7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f56317j = new ValueValidator() { // from class: ah.d7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f56318k = new ValueValidator() { // from class: ah.e7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f56319l = new ValueValidator() { // from class: ah.f7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.h(((Double) obj).doubleValue());
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
