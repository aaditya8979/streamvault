package com.yandex.div2;

import com.safedk.android.analytics.events.BrandSafetyEvent;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59038a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f59039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f59040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f59041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f59042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f59043f;

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59044a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59044a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticles deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = w4.f59043f;
            Expression<Double> expression2 = w4.f59039b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", typeHelper, lVar, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = w4.f59040c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, BrandSafetyEvent.f52764s, typeHelper2, lVar2, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            Expression<Boolean> expression4 = w4.f59041d;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, lVar2, expression4);
            Expression<Boolean> expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "particle_size", this.f59044a.w3());
            if (divFixedSize == null) {
                divFixedSize = w4.f59042e;
            }
            return new DivTextRangeMaskParticles(expression, expression2, expression3, expression5, divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskParticles divTextRangeMaskParticles) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divTextRangeMaskParticles.f57820a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "density", divTextRangeMaskParticles.f57821b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, BrandSafetyEvent.f52764s, divTextRangeMaskParticles.f57822c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticles.f57823d);
            JsonPropertyParser.write(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticles.f57824e, this.f59044a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59045a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59045a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticlesTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<DivFixedSizeTemplate> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f57832a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f57833b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, w4.f59043f);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f57834c : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, BrandSafetyEvent.f52764s, typeHelper, allowPropertyOverride, field2, lVar);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f57835d : null, lVar);
            if (divTextRangeMaskParticlesTemplate != null) {
                cVar = this;
                field = divTextRangeMaskParticlesTemplate.f57836e;
            } else {
                cVar = this;
                field = null;
            }
            return new DivTextRangeMaskParticlesTemplate(fieldWithExpression, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "particle_size", allowPropertyOverride, field, cVar.f59045a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divTextRangeMaskParticlesTemplate.f57832a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "density", divTextRangeMaskParticlesTemplate.f57833b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BrandSafetyEvent.f52764s, divTextRangeMaskParticlesTemplate.f57834c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticlesTemplate.f57835d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticlesTemplate.f57836e, this.f59045a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeMaskParticlesTemplate, DivTextRangeMaskParticles> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59046a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59046a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticles resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextRangeMaskParticlesTemplate.f57832a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<Double>> field = divTextRangeMaskParticlesTemplate.f57833b;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = w4.f59043f;
            Expression<Double> expression = w4.f59039b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "density", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Boolean>> field2 = divTextRangeMaskParticlesTemplate.f57834c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = w4.f59040c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, BrandSafetyEvent.f52764s, typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Boolean>> field3 = divTextRangeMaskParticlesTemplate.f57835d;
            Expression<Boolean> expression3 = w4.f59041d;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeMaskParticlesTemplate.f57836e, jSONObject, "particle_size", this.f59046a.y3(), this.f59046a.w3());
            if (divFixedSize == null) {
                divFixedSize = w4.f59042e;
            }
            return new DivTextRangeMaskParticles(expressionResolveExpression, expression, expression2, expression3, divFixedSize);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f59039b = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f59040c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f59041d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f59042e = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f59043f = new ValueValidator() { // from class: ah.ib
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.w4.b(((Double) obj).doubleValue());
            }
        };
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d && d10 <= 1.0d;
    }
}
