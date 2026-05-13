package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3886a;

    public t3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3886a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivExtensionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivExtensionTemplate divExtensionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivExtensionTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divExtensionTemplate != null ? divExtensionTemplate.f55245a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "params", allowPropertyOverride, divExtensionTemplate != null ? divExtensionTemplate.f55246b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivExtensionTemplate divExtensionTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", divExtensionTemplate.f55245a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "params", divExtensionTemplate.f55246b);
        return jSONObject;
    }
}
