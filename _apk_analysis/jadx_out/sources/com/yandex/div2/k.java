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

/* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58848a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58849b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58850a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58850a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollTo deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = k.f58849b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonPropertyParser.read(parsingContext, jSONObject, "destination", this.f58850a.D0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollTo divActionScrollTo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollTo.f54373a);
            JsonPropertyParser.write(parsingContext, jSONObject, "destination", divActionScrollTo.f54374b, this.f58850a.D0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollTo.f54375c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58851a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58851a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollToTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionScrollToTemplate divActionScrollToTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionScrollToTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.f54380a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "destination", allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.f54381b : null, this.f58851a.E0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.f54382c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollToTemplate divActionScrollToTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", divActionScrollToTemplate.f54380a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "destination", divActionScrollToTemplate.f54381b, this.f58851a.E0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionScrollToTemplate.f54382c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionScrollToTemplate, DivActionScrollTo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58852a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58852a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollTo resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollToTemplate divActionScrollToTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divActionScrollToTemplate.f54380a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = k.f58849b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonFieldResolver.resolve(parsingContext, divActionScrollToTemplate.f54381b, jSONObject, "destination", this.f58852a.F0(), this.f58852a.D0()), JsonFieldResolver.resolveExpression(parsingContext, divActionScrollToTemplate.f54382c, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
