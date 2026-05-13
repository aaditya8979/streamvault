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
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivChangeBoundsTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54705a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f54709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54711g;

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54712a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54712a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivChangeBoundsTransitionJsonParser.f54710f;
            Expression<Long> expression = DivChangeBoundsTransitionJsonParser.f54706b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivChangeBoundsTransitionJsonParser.f54709e;
            sn.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivChangeBoundsTransitionJsonParser.f54707c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            Expression<DivAnimationInterpolator> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            ValueValidator<Long> valueValidator2 = DivChangeBoundsTransitionJsonParser.f54711g;
            Expression<Long> expression4 = DivChangeBoundsTransitionJsonParser.f54708d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeBoundsTransition divChangeBoundsTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divChangeBoundsTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divChangeBoundsTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divChangeBoundsTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54713a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54713a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f54720a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivChangeBoundsTransitionTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivChangeBoundsTransitionJsonParser.f54710f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivChangeBoundsTransitionJsonParser.f54709e, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f54721b : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f54722c : null, lVar, DivChangeBoundsTransitionJsonParser.f54711g));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divChangeBoundsTransitionTemplate.f54720a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divChangeBoundsTransitionTemplate.f54721b, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divChangeBoundsTransitionTemplate.f54722c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivChangeBoundsTransitionTemplate, DivChangeBoundsTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54714a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54714a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divChangeBoundsTransitionTemplate.f54720a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivChangeBoundsTransitionJsonParser.f54710f;
            Expression<Long> expression = DivChangeBoundsTransitionJsonParser.f54706b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivAnimationInterpolator>> field2 = divChangeBoundsTransitionTemplate.f54721b;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivChangeBoundsTransitionJsonParser.f54709e;
            sn.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivChangeBoundsTransitionJsonParser.f54707c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<Long>> field3 = divChangeBoundsTransitionTemplate.f54722c;
            ValueValidator<Long> valueValidator2 = DivChangeBoundsTransitionJsonParser.f54711g;
            Expression<Long> expression3 = DivChangeBoundsTransitionJsonParser.f54708d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, expressionResolveOptionalExpression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54706b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f54707c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f54708d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54709e = TypeHelper.Companion.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivChangeBoundsTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f54710f = new ValueValidator() { // from class: ah.h2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivChangeBoundsTransitionJsonParser.c(((Long) obj).longValue());
            }
        };
        f54711g = new ValueValidator() { // from class: ah.i2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivChangeBoundsTransitionJsonParser.d(((Long) obj).longValue());
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
