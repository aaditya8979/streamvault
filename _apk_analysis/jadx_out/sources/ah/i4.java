package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgumentTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3809a;

    public i4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3809a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgumentTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFunctionArgumentTemplate divFunctionArgumentTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivFunctionArgumentTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, divFunctionArgumentTemplate != null ? divFunctionArgumentTemplate.f55392a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, divFunctionArgumentTemplate != null ? divFunctionArgumentTemplate.f55393b : null, DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFunctionArgumentTemplate divFunctionArgumentTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionArgumentTemplate.f55392a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "type", divFunctionArgumentTemplate.f55393b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
