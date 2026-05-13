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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationJsonParser;
import com.yandex.div2.DivCount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimationJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivAnimationJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54593a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivCount.c f54596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f54598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimation.Name> f54599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54601i;

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54602a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54602a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimation deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivAnimationJsonParser.f54600h;
            Expression<Long> expression = DivAnimationJsonParser.f54594b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end_value", typeHelper2, lVar2);
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivAnimationJsonParser.f54598f;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivAnimationJsonParser.f54595c;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression2);
            Expression<DivAnimationInterpolator> expression3 = optionalExpression3 == null ? expression2 : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f54602a.q1());
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", DivAnimationJsonParser.f54599g, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat", this.f54602a.v2());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.f54596d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator2 = DivAnimationJsonParser.f54601i;
            Expression<Long> expression5 = DivAnimationJsonParser.f54597e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            return new DivAnimation(expression, optionalExpression2, expression3, optionalList, expression4, divCount2, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAnimation divAnimation) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divAnimation.f54580a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divAnimation.f54581b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divAnimation.f54582c, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAnimation.f54583d, this.f54602a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divAnimation.f54584e, DivAnimation.Name.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat", divAnimation.f54585f, this.f54602a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divAnimation.f54586g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divAnimation.f54587h);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54603a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54603a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimationTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivAnimationTemplate divAnimationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divAnimationTemplate != null ? divAnimationTemplate.f54611a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivAnimationJsonParser.f54600h);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divAnimationTemplate != null ? divAnimationTemplate.f54612b : null;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivAnimationTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivAnimationJsonParser.f54598f, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54613c : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54614d : null, this.f54603a.r1()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", DivAnimationJsonParser.f54599g, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54615e : null, DivAnimation.Name.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54616f : null, this.f54603a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54617g : null, lVar, DivAnimationJsonParser.f54601i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f54618h : null, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAnimationTemplate divAnimationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divAnimationTemplate.f54611a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divAnimationTemplate.f54612b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divAnimationTemplate.f54613c, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAnimationTemplate.f54614d, this.f54603a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divAnimationTemplate.f54615e, DivAnimation.Name.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat", divAnimationTemplate.f54616f, this.f54603a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divAnimationTemplate.f54617g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divAnimationTemplate.f54618h);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAnimationTemplate, DivAnimation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54604a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54604a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimation resolve(@NotNull ParsingContext parsingContext, @NotNull DivAnimationTemplate divAnimationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divAnimationTemplate.f54611a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivAnimationJsonParser.f54600h;
            Expression<Long> expression = DivAnimationJsonParser.f54594b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field<Expression<Double>> field2 = divAnimationTemplate.f54612b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end_value", typeHelper2, lVar2);
            Field<Expression<DivAnimationInterpolator>> field3 = divAnimationTemplate.f54613c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivAnimationJsonParser.f54598f;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivAnimationJsonParser.f54595c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression2;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divAnimationTemplate.f54614d, jSONObject, "items", this.f54604a.s1(), this.f54604a.q1());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divAnimationTemplate.f54615e, jSONObject, "name", DivAnimationJsonParser.f54599g, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divAnimationTemplate.f54616f, jSONObject, "repeat", this.f54604a.x2(), this.f54604a.v2());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.f54596d;
            }
            Field<Expression<Long>> field4 = divAnimationTemplate.f54617g;
            ValueValidator<Long> valueValidator2 = DivAnimationJsonParser.f54601i;
            Expression<Long> expression3 = DivAnimationJsonParser.f54597e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            return new DivAnimation(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, listResolveOptionalList, expressionResolveExpression, divCount, expression3, JsonFieldResolver.resolveOptionalExpression(parsingContext, divAnimationTemplate.f54618h, jSONObject, "start_value", typeHelper2, lVar2));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54594b = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.SPRING;
        f54595c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f54596d = new DivCount.c(new DivInfinityCount());
        f54597e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f54598f = companion2.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f54599g = companion2.from(cn.r.W(DivAnimation.Name.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_NAME$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimation.Name);
            }
        });
        f54600h = new ValueValidator() { // from class: ah.z1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivAnimationJsonParser.c(((Long) obj).longValue());
            }
        };
        f54601i = new ValueValidator() { // from class: ah.a2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivAnimationJsonParser.d(((Long) obj).longValue());
            }
        };
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
