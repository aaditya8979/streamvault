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
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionSubmitRequestJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54443a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivActionSubmit.Request.Method> f54444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivActionSubmit.Request.Method> f54445c;

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54446a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54446a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmit.Request deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "headers", this.f54446a.Y0());
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = DivActionSubmitRequestJsonParser.f54445c;
            sn.l<String, DivActionSubmit.Request.Method> lVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = DivActionSubmitRequestJsonParser.f54444b;
            Expression<DivActionSubmit.Request.Method> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "method", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivActionSubmit.Request(optionalList, expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmit.Request request) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "headers", request.f54433a, this.f54446a.Y0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "method", request.f54434b, DivActionSubmit.Request.Method.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", request.f54435c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54447a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54447a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmitTemplate.RequestTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionSubmitTemplate.RequestTemplate requestTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionSubmitTemplate.RequestTemplate(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "headers", allowPropertyOverride, requestTemplate != null ? requestTemplate.f54458a : null, this.f54447a.Z0()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "method", DivActionSubmitRequestJsonParser.f54445c, allowPropertyOverride, requestTemplate != null ? requestTemplate.f54459b : null, DivActionSubmit.Request.Method.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, requestTemplate != null ? requestTemplate.f54460c : null, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmitTemplate.RequestTemplate requestTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "headers", requestTemplate.f54458a, this.f54447a.Z0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "method", requestTemplate.f54459b, DivActionSubmit.Request.Method.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", requestTemplate.f54460c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionSubmitTemplate.RequestTemplate, DivActionSubmit.Request> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54448a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54448a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmit.Request resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmitTemplate.RequestTemplate requestTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, requestTemplate.f54458a, jSONObject, "headers", this.f54448a.a1(), this.f54448a.Y0());
            Field<Expression<DivActionSubmit.Request.Method>> field = requestTemplate.f54459b;
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = DivActionSubmitRequestJsonParser.f54445c;
            sn.l<String, DivActionSubmit.Request.Method> lVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = DivActionSubmitRequestJsonParser.f54444b;
            Expression<DivActionSubmit.Request.Method> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "method", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivActionSubmit.Request(listResolveOptionalList, expression, JsonFieldResolver.resolveExpression(parsingContext, requestTemplate.f54460c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivActionSubmit.Request.Method method = DivActionSubmit.Request.Method.POST;
        f54444b = Expression.Companion.constant$default(companion, method, null, 2, null);
        f54445c = TypeHelper.Companion.from(method, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionSubmitRequestJsonParser$Companion$TYPE_HELPER_METHOD$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivActionSubmit.Request.Method);
            }
        });
    }
}
