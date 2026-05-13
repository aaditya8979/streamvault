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

/* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58731a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58732b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58733a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58733a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpression deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = c2.f58732b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", typeHelper, lVar), JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorExpression divInputValidatorExpression) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorExpression.f56139a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divInputValidatorExpression.f56140b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorExpression.f56141c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorExpression.f56142d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58734a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58734a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpressionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f56147a : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivInputValidatorExpressionTemplate((Field<Expression<Boolean>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, lVar), (Field<Expression<Boolean>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f56148b : null, lVar), (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f56149c : null), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f56150d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorExpressionTemplate.f56147a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divInputValidatorExpressionTemplate.f56148b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorExpressionTemplate.f56149c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorExpressionTemplate.f56150d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorExpressionTemplate, DivInputValidatorExpression> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58735a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58735a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpression resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorExpressionTemplate.f56147a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = c2.f58732b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.f56148b, jSONObject, "condition", typeHelper, lVar), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.f56149c, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorExpressionTemplate.f56150d, jSONObject, "variable"));
        }
    }
}
