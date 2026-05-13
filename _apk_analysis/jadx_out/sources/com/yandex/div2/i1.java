package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58824a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<String> f58825b = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<String> f58826c = new ValueValidator() { // from class: ah.d4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.i1.c((String) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<String> f58827d = new ValueValidator() { // from class: ah.e4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.i1.d((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58828a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58828a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask.PatternElement deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper, i1.f58826c);
            ValueValidator<String> valueValidator = i1.f58827d;
            Expression<String> expression2 = i1.f58825b;
            Expression<String> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder", typeHelper, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(expression, expression2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFixedLengthInputMask.PatternElement patternElement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", patternElement.f55312a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder", patternElement.f55313b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "regex", patternElement.f55314c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58829a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58829a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMaskTemplate.PatternElementTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.f55326a : null, i1.f58826c), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.f55327b : null, i1.f58827d), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "regex", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.f55328c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", patternElementTemplate.f55326a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder", patternElementTemplate.f55327b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "regex", patternElementTemplate.f55328c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFixedLengthInputMaskTemplate.PatternElementTemplate, DivFixedLengthInputMask.PatternElement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58830a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58830a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask.PatternElement resolve(@NotNull ParsingContext parsingContext, @NotNull DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = patternElementTemplate.f55326a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper, i1.f58826c);
            Field<Expression<String>> field2 = patternElementTemplate.f55327b;
            ValueValidator<String> valueValidator = i1.f58827d;
            Expression<String> expression = i1.f58825b;
            Expression<String> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "placeholder", typeHelper, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(expressionResolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, patternElementTemplate.f55328c, jSONObject, "regex", typeHelper));
        }
    }

    public static final boolean c(String str) {
        return str.length() >= 1;
    }

    public static final boolean d(String str) {
        return str.length() >= 1;
    }
}
