package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
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

/* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58788a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58789b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58790a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58790a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegex deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g2.f58789b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper2), JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper2), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorRegex divInputValidatorRegex) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorRegex.f56154a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorRegex.f56155b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divInputValidatorRegex.f56156c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorRegex.f56157d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58791a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58791a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegexTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.f56162a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegexTemplate((Field<Expression<Boolean>>) optionalFieldWithExpression, (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", typeHelper, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.f56163b : null), (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.f56164c : null), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.f56165d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorRegexTemplate.f56162a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorRegexTemplate.f56163b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputValidatorRegexTemplate.f56164c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorRegexTemplate.f56165d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorRegexTemplate, DivInputValidatorRegex> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58792a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58792a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegex resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorRegexTemplate.f56162a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g2.f58789b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<String>> field2 = divInputValidatorRegexTemplate.f56163b;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "label_id", typeHelper2), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorRegexTemplate.f56164c, jSONObject, "pattern", typeHelper2), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorRegexTemplate.f56165d, jSONObject, "variable"));
        }
    }
}
