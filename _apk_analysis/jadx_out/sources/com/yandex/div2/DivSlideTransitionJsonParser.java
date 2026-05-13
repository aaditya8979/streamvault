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
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.DivSlideTransitionJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSlideTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56989a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSlideTransition.Edge> f56991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSlideTransition.Edge> f56994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f56995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56997i;

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56998a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56998a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivDimension divDimension = (DivDimension) JsonPropertyParser.readOptional(parsingContext, jSONObject, "distance", this.f56998a.M2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSlideTransitionJsonParser.f56996h;
            Expression<Long> expression = DivSlideTransitionJsonParser.f56990b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = DivSlideTransitionJsonParser.f56994f;
            sn.l<String, DivSlideTransition.Edge> lVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = DivSlideTransitionJsonParser.f56991c;
            Expression<DivSlideTransition.Edge> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", typeHelper2, lVar2, expression2);
            Expression<DivSlideTransition.Edge> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivSlideTransitionJsonParser.f56995g;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression4 = DivSlideTransitionJsonParser.f56992d;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression4);
            Expression<DivAnimationInterpolator> expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            ValueValidator<Long> valueValidator2 = DivSlideTransitionJsonParser.f56997i;
            Expression<Long> expression6 = DivSlideTransitionJsonParser.f56993e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression6);
            if (optionalExpression4 != null) {
                expression6 = optionalExpression4;
            }
            return new DivSlideTransition(divDimension, expression, expression3, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSlideTransition divSlideTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "distance", divSlideTransition.f56982a, this.f56998a.M2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divSlideTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "edge", divSlideTransition.f56984c, DivSlideTransition.Edge.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divSlideTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divSlideTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56999a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56999a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSlideTransitionTemplate divSlideTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<DivDimensionTemplate> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divSlideTransitionTemplate != null) {
                cVar = this;
                field = divSlideTransitionTemplate.f57007a;
            } else {
                cVar = this;
                field = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "distance", allowPropertyOverride, field, cVar.f56999a.N2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f57008b : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivSlideTransitionTemplate(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, lVar, DivSlideTransitionJsonParser.f56996h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "edge", DivSlideTransitionJsonParser.f56994f, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f57009c : null, DivSlideTransition.Edge.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivSlideTransitionJsonParser.f56995g, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f57010d : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f57011e : null, lVar, DivSlideTransitionJsonParser.f56997i));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSlideTransitionTemplate divSlideTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "distance", divSlideTransitionTemplate.f57007a, this.f56999a.N2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divSlideTransitionTemplate.f57008b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "edge", divSlideTransitionTemplate.f57009c, DivSlideTransition.Edge.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divSlideTransitionTemplate.f57010d, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divSlideTransitionTemplate.f57011e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSlideTransitionTemplate, DivSlideTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57000a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57000a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivSlideTransitionTemplate divSlideTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivDimension divDimension = (DivDimension) JsonFieldResolver.resolveOptional(parsingContext, divSlideTransitionTemplate.f57007a, jSONObject, "distance", this.f57000a.O2(), this.f57000a.M2());
            Field<Expression<Long>> field = divSlideTransitionTemplate.f57008b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSlideTransitionJsonParser.f56996h;
            Expression<Long> expression = DivSlideTransitionJsonParser.f56990b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivSlideTransition.Edge>> field2 = divSlideTransitionTemplate.f57009c;
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = DivSlideTransitionJsonParser.f56994f;
            sn.l<String, DivSlideTransition.Edge> lVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = DivSlideTransitionJsonParser.f56991c;
            Expression<DivSlideTransition.Edge> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "edge", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivAnimationInterpolator>> field3 = divSlideTransitionTemplate.f57010d;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivSlideTransitionJsonParser.f56995g;
            sn.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivSlideTransitionJsonParser.f56992d;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field4 = divSlideTransitionTemplate.f57011e;
            ValueValidator<Long> valueValidator2 = DivSlideTransitionJsonParser.f56997i;
            Expression<Long> expression4 = DivSlideTransitionJsonParser.f56993e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression4);
            return new DivSlideTransition(divDimension, expression, expression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4 == null ? expression4 : expressionResolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56990b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivSlideTransition.Edge edge = DivSlideTransition.Edge.BOTTOM;
        f56991c = Expression.Companion.constant$default(companion, edge, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f56992d = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f56993e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56994f = companion2.from(edge, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_EDGE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSlideTransition.Edge);
            }
        });
        f56995g = companion2.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f56996h = new ValueValidator() { // from class: ah.e9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSlideTransitionJsonParser.c(((Long) obj).longValue());
            }
        };
        f56997i = new ValueValidator() { // from class: ah.f9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSlideTransitionJsonParser.d(((Long) obj).longValue());
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
