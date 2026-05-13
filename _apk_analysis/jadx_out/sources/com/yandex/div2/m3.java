package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

/* JADX INFO: compiled from: DivShadowJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58898a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f58899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f58901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f58902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58903f;

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58904a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58904a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadow deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = m3.f58902e;
            Expression<Double> expression = m3.f58899b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = m3.f58903f;
            Expression<Long> expression2 = m3.f58900c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = m3.f58901d;
            Expression<Integer> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonPropertyParser.read(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f58904a.Z5()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivShadow divShadow) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divShadow.f56912a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "blur", divShadow.f56913b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divShadow.f56914c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divShadow.f56915d, this.f58904a.Z5());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58905a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58905a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadowTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivShadowTemplate divShadowTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivShadowTemplate((Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.f56922a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, m3.f58902e), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.f56923b : null, ParsingConvertersKt.NUMBER_TO_INT, m3.f58903f), (Field<Expression<Integer>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.f56924c : null, ParsingConvertersKt.STRING_TO_COLOR_INT), (Field<DivPointTemplate>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.f56925d : null, this.f58905a.a6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivShadowTemplate divShadowTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divShadowTemplate.f56922a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "blur", divShadowTemplate.f56923b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShadowTemplate.f56924c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divShadowTemplate.f56925d, this.f58905a.a6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivShadowTemplate, DivShadow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58906a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58906a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadow resolve(@NotNull ParsingContext parsingContext, @NotNull DivShadowTemplate divShadowTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divShadowTemplate.f56922a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = m3.f58902e;
            Expression<Double> expression = m3.f58899b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Long>> field2 = divShadowTemplate.f56923b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = m3.f58903f;
            Expression<Long> expression2 = m3.f58900c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "blur", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Integer>> field3 = divShadowTemplate.f56924c;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = m3.f58901d;
            Expression<Integer> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "color", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonFieldResolver.resolve(parsingContext, divShadowTemplate.f56925d, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f58906a.b6(), this.f58906a.Z5()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58899b = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f58900c = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f58901d = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f58902e = new ValueValidator() { // from class: ah.x8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m3.c(((Double) obj).doubleValue());
            }
        };
        f58903f = new ValueValidator() { // from class: ah.y8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m3.d(((Long) obj).longValue());
            }
        };
    }

    public static final boolean c(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
