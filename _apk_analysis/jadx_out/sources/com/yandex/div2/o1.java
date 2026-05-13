package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
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

/* JADX INFO: compiled from: DivFunctionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58945a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<String> f58946b = new ValueValidator() { // from class: ah.k4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.o1.b((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58947a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58947a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunction deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivFunction(JsonPropertyParser.readList(parsingContext, jSONObject, "arguments", this.f58947a.F3()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "body"), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name", o1.f58946b), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFunction divFunction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "arguments", divFunction.f55380a, this.f58947a.F3());
            JsonPropertyParser.write(parsingContext, jSONObject, "body", divFunction.f55381b);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunction.f55382c);
            JsonPropertyParser.write(parsingContext, jSONObject, "return_type", divFunction.f55383d, (sn.l<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58948a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58948a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunctionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFunctionTemplate divFunctionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivFunctionTemplate((Field<List<DivFunctionArgumentTemplate>>) JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "arguments", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.f55396a : null, this.f58948a.G3()), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "body", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.f55397b : null), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.f55398c : null, o1.f58946b), (Field<DivEvaluableType>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "return_type", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.f55399d : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFunctionTemplate divFunctionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "arguments", divFunctionTemplate.f55396a, this.f58948a.G3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "body", divFunctionTemplate.f55397b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionTemplate.f55398c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "return_type", divFunctionTemplate.f55399d, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFunctionTemplate, DivFunction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58949a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58949a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunction resolve(@NotNull ParsingContext parsingContext, @NotNull DivFunctionTemplate divFunctionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivFunction(JsonFieldResolver.resolveList(parsingContext, divFunctionTemplate.f55396a, jSONObject, "arguments", this.f58949a.H3(), this.f58949a.F3()), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f55397b, jSONObject, "body"), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f55398c, jSONObject, "name", o1.f58946b), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f55399d, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }
    }

    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^[a-zA-Z_][a-zA-Z0-9_]*$");
    }
}
