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

/* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58716a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58717b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58718a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58718a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBase deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = b2.f58717b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorBase divInputValidatorBase) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorBase.f56126a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorBase.f56127b);
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorBase.f56128c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58719a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58719a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBaseTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivInputValidatorBaseTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.f56133a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.f56134b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.f56135c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorBaseTemplate divInputValidatorBaseTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorBaseTemplate.f56133a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorBaseTemplate.f56134b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorBaseTemplate.f56135c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorBaseTemplate, DivInputValidatorBase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58720a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58720a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBase resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorBaseTemplate.f56133a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = b2.f58717b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputValidatorBaseTemplate.f56134b, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(parsingContext, divInputValidatorBaseTemplate.f56135c, jSONObject, "variable"));
        }
    }
}
