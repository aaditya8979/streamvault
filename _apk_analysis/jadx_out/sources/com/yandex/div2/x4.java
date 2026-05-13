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

/* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59052a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f59053b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59054a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59054a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolid deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = x4.f59053b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivTextRangeMaskSolid(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskSolid divTextRangeMaskSolid) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divTextRangeMaskSolid.f57840a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskSolid.f57841b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59055a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59055a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolidTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextRangeMaskSolidTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTextRangeMaskSolidTemplate != null ? divTextRangeMaskSolidTemplate.f57846a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTextRangeMaskSolidTemplate != null ? divTextRangeMaskSolidTemplate.f57847b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divTextRangeMaskSolidTemplate.f57846a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskSolidTemplate.f57847b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeMaskSolidTemplate, DivTextRangeMaskSolid> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59056a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59056a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolid resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextRangeMaskSolidTemplate.f57846a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<Boolean>> field = divTextRangeMaskSolidTemplate.f57847b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = x4.f59053b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTextRangeMaskSolid(expressionResolveExpression, expression);
        }
    }
}
