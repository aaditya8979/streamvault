package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PropertyVariableJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58644a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f58645b = "new_value";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivEvaluableType> f58646c = TypeHelper.Companion.from(cn.r.W(DivEvaluableType.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.PropertyVariableJsonParser$Companion$TYPE_HELPER_VALUE_TYPE$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivEvaluableType);
        }
    });

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58647a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58647a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariable deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "name");
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.f58645b;
            }
            return new PropertyVariable(expression, str, str2, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.f58647a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", PropertyVariableJsonParser.f58646c, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull PropertyVariable propertyVariable) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "get", propertyVariable.f58638a);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", propertyVariable.f58639b);
            JsonPropertyParser.write(parsingContext, jSONObject, "new_value_variable_name", propertyVariable.f58640c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "set", propertyVariable.f58641d, this.f58647a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value_type", propertyVariable.f58642e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58648a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58648a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariableTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable PropertyVariableTemplate propertyVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<List<DivActionTemplate>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f58653a : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f58654b : null);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f58655c : null);
            if (propertyVariableTemplate != null) {
                cVar = this;
                field = propertyVariableTemplate.f58656d;
            } else {
                cVar = this;
                field = null;
            }
            return new PropertyVariableTemplate(fieldWithExpression, field2, optionalField, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "set", allowPropertyOverride, field, cVar.f58648a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value_type", PropertyVariableJsonParser.f58646c, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f58657e : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull PropertyVariableTemplate propertyVariableTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "get", propertyVariableTemplate.f58653a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", propertyVariableTemplate.f58654b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "new_value_variable_name", propertyVariableTemplate.f58655c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "set", propertyVariableTemplate.f58656d, this.f58648a.v0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value_type", propertyVariableTemplate.f58657e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, PropertyVariableTemplate, PropertyVariable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58649a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58649a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariable resolve(@NotNull ParsingContext parsingContext, @NotNull PropertyVariableTemplate propertyVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.f58653a, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonFieldResolver.resolve(parsingContext, propertyVariableTemplate.f58654b, jSONObject, "name");
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, propertyVariableTemplate.f58655c, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.f58645b;
            }
            return new PropertyVariable(expressionResolveExpression, str, str2, JsonFieldResolver.resolveOptionalList(parsingContext, propertyVariableTemplate.f58656d, jSONObject, "set", this.f58649a.w0(), this.f58649a.u0()), JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.f58657e, jSONObject, "value_type", PropertyVariableJsonParser.f58646c, DivEvaluableType.FROM_STRING));
        }
    }
}
