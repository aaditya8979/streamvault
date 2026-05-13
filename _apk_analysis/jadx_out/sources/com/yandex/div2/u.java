package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
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

/* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59013a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<String> f59014b = new ValueValidator() { // from class: ah.y1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.u.b((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59015a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59015a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructure deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonExpressionParser.readExpression(parsingContext, jSONObject, "path", typeHelper, u.f59014b), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f59015a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionUpdateStructure divActionUpdateStructure) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "path", divActionUpdateStructure.f54548a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionUpdateStructure.f54549b, this.f59015a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionUpdateStructure.f54550c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59016a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59016a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructureTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructureTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "path", typeHelper, allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.f54554a : null, u.f59014b), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.f54555b : null, this.f59016a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.f54556c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "path", divActionUpdateStructureTemplate.f54554a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionUpdateStructureTemplate.f54555b, this.f59016a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionUpdateStructureTemplate.f54556c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionUpdateStructureTemplate, DivActionUpdateStructure> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59017a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59017a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructure resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = divActionUpdateStructureTemplate.f54554a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, u.f59014b), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionUpdateStructureTemplate.f54555b, jSONObject, "value", this.f59017a.j9(), this.f59017a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionUpdateStructureTemplate.f54556c, jSONObject, "variable_name", typeHelper));
        }
    }

    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^(?!/)(.+)(?<!/)$");
    }
}
