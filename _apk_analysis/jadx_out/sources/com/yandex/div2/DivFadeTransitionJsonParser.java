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
import com.yandex.div2.DivFadeTransitionJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivFadeTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55258a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f55261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f55263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55266i;

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55267a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55267a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivFadeTransitionJsonParser.f55264g;
            Expression<Double> expression = DivFadeTransitionJsonParser.f55259b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = DivFadeTransitionJsonParser.f55265h;
            Expression<Long> expression2 = DivFadeTransitionJsonParser.f55260c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivFadeTransitionJsonParser.f55263f;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivFadeTransitionJsonParser.f55261d;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            Expression<DivAnimationInterpolator> expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            ValueValidator<Long> valueValidator3 = DivFadeTransitionJsonParser.f55266i;
            Expression<Long> expression5 = DivFadeTransitionJsonParser.f55262e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            return new DivFadeTransition(expression, expression2, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFadeTransition divFadeTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divFadeTransition.f55253a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divFadeTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divFadeTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divFadeTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55268a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55268a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFadeTransitionTemplate divFadeTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f55276a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivFadeTransitionJsonParser.f55264g);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f55277b : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivFadeTransitionTemplate((Field<Expression<Double>>) optionalFieldWithExpression, (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivFadeTransitionJsonParser.f55265h), (Field<Expression<DivAnimationInterpolator>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivFadeTransitionJsonParser.f55263f, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f55278c : null, DivAnimationInterpolator.FROM_STRING), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f55279d : null, lVar, DivFadeTransitionJsonParser.f55266i));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFadeTransitionTemplate divFadeTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divFadeTransitionTemplate.f55276a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divFadeTransitionTemplate.f55277b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divFadeTransitionTemplate.f55278c, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divFadeTransitionTemplate.f55279d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFadeTransitionTemplate, DivFadeTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55269a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55269a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivFadeTransitionTemplate divFadeTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divFadeTransitionTemplate.f55276a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivFadeTransitionJsonParser.f55264g;
            Expression<Double> expression = DivFadeTransitionJsonParser.f55259b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Long>> field2 = divFadeTransitionTemplate.f55277b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = DivFadeTransitionJsonParser.f55265h;
            Expression<Long> expression2 = DivFadeTransitionJsonParser.f55260c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<DivAnimationInterpolator>> field3 = divFadeTransitionTemplate.f55278c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivFadeTransitionJsonParser.f55263f;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivFadeTransitionJsonParser.f55261d;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field4 = divFadeTransitionTemplate.f55279d;
            ValueValidator<Long> valueValidator3 = DivFadeTransitionJsonParser.f55266i;
            Expression<Long> expression4 = DivFadeTransitionJsonParser.f55262e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            return new DivFadeTransition(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55259b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f55260c = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f55261d = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f55262e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55263f = TypeHelper.Companion.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f55264g = new ValueValidator() { // from class: ah.v3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.d(((Double) obj).doubleValue());
            }
        };
        f55265h = new ValueValidator() { // from class: ah.w3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.e(((Long) obj).longValue());
            }
        };
        f55266i = new ValueValidator() { // from class: ah.x3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.f(((Long) obj).longValue());
            }
        };
    }

    public static final boolean d(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }
}
